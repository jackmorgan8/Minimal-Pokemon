import java.util.*;
import java.io.*;

public class TrollGame {
	
	public static void loss(int direction, int[] map, int playerPos, int[] trollPos, int[] trollDirection, boolean noErase, int row, boolean grab){
    	display(direction, map, playerPos, trollPos, trollDirection, noErase, row, grab);
	    System.out.print("YOU LOSE!");
		try{
			Thread.sleep(2000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		System.out.println();
		System.exit(0);
	}
	
	public static void win(int direction, int[] map, int playerPos, int[] trollPos, int[] trollDirection, boolean noErase, int row, boolean grab){
    	display(direction, map, playerPos, trollPos, trollDirection, noErase, row, grab);
	    System.out.print("YOU WIN!");
		try{
			Thread.sleep(2000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		System.out.println();
		System.exit(0);
	}
	
	public static void timeout(int direction, int[] map, int playerPos, int[] trollPos, int[] trollDirection, boolean noErase, int row, boolean grab){
    	display(direction, map, playerPos, trollPos, trollDirection, noErase, row, grab);
	    System.out.print("TIMEOUT!");
		try{
			Thread.sleep(2000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		System.out.println();
		System.exit(0);
	}
	
	public static void display(int direction, int[] map, int playerPos, int[] trollPos, int[] trollDirection, boolean noErase, int row, boolean grab){
		System.out.print("Grab: ["); //Tells user if grab function is enabled or not
		if(grab){ 
			System.out.println("X]");
		}else{
			System.out.println(" ]");
		}
		
		//Player and troll positions placed on array
		map[playerPos]=9; //Defines player location on array
		for(int i=0; i<trollPos.length; i++){ //Defines troll locations 
			map[trollPos[i]]=4;
		}
		
		//This block defines rules of deleting player trails after the first turn and when grab==false
		if(noErase==false){
			if(direction==2){
				if(map[playerPos-row]==9){
					map[playerPos-row]=0;
				}
			}else if(direction==3){
				direction=2;
			}else if(direction==4){
				if(map[playerPos+1]==9){
					map[playerPos+1]=0;
				}
			}else if(direction==5){
				direction=4;
			}else if(direction==6){
				if(map[playerPos-1]==9){
					map[playerPos-1]=0;
				}
			}else if(direction==7){
				direction=6;
			}else if(direction==8){
				if(map[playerPos+row]==9){
					map[playerPos+row]=0;
				}
			}else if(direction==9){
				direction=8;
			}
			for(int i=0; i<trollPos.length; i++){
				if(trollDirection[i]==2){
					if(map[trollPos[i]-row]==4){
						map[trollPos[i]-row]=0;
					}
				}else if(trollDirection[i]==4){
					if(map[trollPos[i]+1]==4){
						map[trollPos[i]+1]=0;
					}
				}else if(trollDirection[i]==6){
					if(map[trollPos[i]-1]==4){
						map[trollPos[i]-1]=0;
					}
				}else if(trollDirection[i]==8){
					if(map[trollPos[i]+row]==4){
						map[trollPos[i]+row]=0;
					}
				}
			}
		}
		
		//Prints game board
		for(int i=0; i<map.length; i++){
			if(map[i]==0 || map[i]==2){
				System.out.print(" ");
			}else if(map[i]==1 || map[i]==5){
				System.out.print("#");
			}else if(map[i]==3){
				System.out.println();
			}else if(map[i]==4){
				System.out.print("T");
			}else if(map[i]==9){
				switch(direction){
					case 2: System.out.print("V"); break;
					case 4: System.out.print("<"); break;
					case 6: System.out.print(">"); break;
					case 8: System.out.print("^"); break;
				}
			}
		}
	}
    
    public static void main(String[] args) {
    	Scanner input=new Scanner(System.in);
    	/*
    	 *Define map character is placed in
    	 *0 is an empty space, 1 is a pushable wall, 2 is the end of the maze, 3 starts a new line, 5 is an unmovable edge piece
    	 */
		int[] map = {
    		5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 3,
			5, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 5, 3,
			5, 0, 1, 0, 1, 1, 1, 1, 1, 0, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 0, 1, 0, 5, 3,
			5, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1, 0, 5, 3,
			5, 1, 1, 1, 1, 0, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1, 1, 0, 5, 3,
			5, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 1, 0, 5, 3,
			5, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 1, 0, 1, 1, 1, 1, 1, 0, 1, 0, 5, 3,
			5, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 5, 3,
			5, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 0, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 0, 1, 1, 1, 0, 5, 3,
			5, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 5, 3,
			5, 0, 1, 1, 1, 0, 1, 1, 1, 0, 1, 0, 1, 1, 1, 0, 1, 0, 1, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1, 1, 1, 5, 3,
			5, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 5, 3,
			5, 1, 1, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1, 1, 0, 1, 0, 1, 1, 1, 0, 1, 0, 1, 1, 1, 0, 1, 1, 1, 0, 5, 3,
			5, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 5, 3,
			5, 0, 1, 1, 1, 0, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 1, 0, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 5, 3,
			5, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 5, 3,
			5, 0, 1, 0, 1, 1, 1, 1, 1, 0, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 5, 3,
			5, 0, 1, 0, 0, 0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 5, 3,
			5, 0, 1, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 0, 1, 1, 1, 1, 5, 3,
			5, 0, 1, 0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 5, 3,
			5, 0, 1, 0, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 1, 0, 1, 1, 1, 1, 1, 0, 1, 0, 5, 3,
			5, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 5, 3,
			5, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 3
		};
		
		//Player Variables
    	int playerPos=1;
    	while(map[playerPos]!=0){ //Randomly places player in an empty spot
    		playerPos=(int)(Math.random()*850);
    	}
    	int direction=2; //Indicates NSEW direction, value based off numpad
    	int row=38; //Amount to add or subtract from playerPos when moving N or S
    	boolean noErase=true; //While true: moving will not set last playerPos to 0
    	boolean grab=false; //While true: player grabs onto wall to move it backwards, if no wall is present, player is stuck
    	
    	//Troll Variables
    	int[] trollPos={
    		1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1
    	};
    	for(int i=0; i<trollPos.length; i++){ //Randomly assigns positions to trolls
    		while(map[trollPos[i]]!=0){
    			trollPos[i]=(int)(Math.random()*850);
    			if(trollPos[i]==playerPos){
    				continue;
    			}
    		}
    	}
    	int[] trollDirection={ //Defines the direction of the trolls
    		2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2
    	};
    	int random; //Random movement
    	
    	//Misc Variables
    	int highScore=0; //Tracks highscore
    	int score=150; //Tracks current score (decreases every turn)
    	try{ //Attempts to read highscore from score.txt
    		Scanner fileIn = new Scanner(new FileInputStream("score.txt"));
    		highScore = fileIn.nextInt();
    		fileIn.close();
    	}catch(InputMismatchException e){
    		e.printStackTrace();
    	}catch(FileNotFoundException e){
    		highScore = -1;
    	}
    	
    	//GAME STARTS
    	System.out.println("---WELCOME---\n");
    	if(highScore==-1){
    		System.out.println("No scores found");
    	}else{
    		System.out.println("Best Score: "+highScore);
    	}
    	System.out.println("\nPress enter to begin!");
		input.nextLine();
		
		//Show current location to the player 
		System.out.println("---CURRENT LOCATION---");
		map[playerPos]=9;
		for(int i=0; i<map.length; i++){
			if(map[i]==9){
				switch(direction){
					case 2: System.out.print("V"); break;
					case 4: System.out.print("<"); break;
					case 6: System.out.print(">"); break;
					case 8: System.out.print("^"); break;
				}
			}else if(map[i]==3){
				System.out.println();
			}else{
				System.out.print(" ");
			}
		}
		map[playerPos]=0;
		try{
			Thread.sleep(2000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		
		//Main loop
    	while(map[playerPos]!=2){ //While player is not in the win position
    		display(direction, map, playerPos, trollPos, trollDirection, noErase, row, grab); //Displays game map
    		noErase=false; //Removes first turn/grab rules of not erasing blocks above you
    		String playerMove=input.nextLine();
    		if(grab){
    			if(playerMove.equalsIgnoreCase("q")){ //If grab is on, the condition toggles off
    				grab=false;
    			}else if(direction==8 && map[playerPos-row]==1 && map[playerPos+row]==0 || direction==9 && map[playerPos-row]==1 && map[playerPos+row]==0){
    				map[playerPos-row]=0;
    				playerPos+=row;
    				map[playerPos-row]=1;
    				direction=9;
    			}else if(direction==6 && map[playerPos+1]==1 && map[playerPos-1]==0 || direction==7 && map[playerPos+1]==1 && map[playerPos-1]==0){
    				map[playerPos+1]=0;
    				playerPos-=1;
    				map[playerPos+1]=1;
    				direction=7;
    			}else if(direction==2 && map[playerPos+row]==1 && map[playerPos-row]==0 || direction==3 && map[playerPos+row]==1 && map[playerPos-row]==0){
    				map[playerPos+row]=0;
    				playerPos-=row;
    				map[playerPos+row]=1;
    				direction=3;
    			}else if(direction==4 && map[playerPos-1]==1 && map[playerPos+1]==0 || direction==5 && map[playerPos-1]==1 && map[playerPos+1]==0){
    				map[playerPos-1]=0;
    				playerPos+=1;
    				map[playerPos-1]=1;
    				direction=5;
    			}else{
    				continue;
    			}
    		}else{
	    		if(playerMove.equalsIgnoreCase("w")){
	    			if(map[playerPos-row]==0){ //Empty space
	    				playerPos-=row;
	    				direction=8;
	    			}else if(map[playerPos-row]==1 && map[playerPos-(2*row)]==0){ //Push block north
		    			map[playerPos-(2*row)]=1;
		    			map[playerPos-row]=0;
		    			playerPos-=row;
		    			direction=8;
	    			}
	    		}else if(playerMove.equalsIgnoreCase("d")){
	    			if(map[playerPos+1]==0){ //Empty space
	    				playerPos+=1;
	    				direction=6;
	    			}else if(map[playerPos+1]==1 && map[playerPos+2]==0){ //Push block east
		    			map[playerPos+2]=1;
		    			map[playerPos+1]=0;
		    			playerPos+=1;
		    			direction=6;
	    			}
	    		}else if(playerMove.equalsIgnoreCase("s")){
	    			if(map[playerPos+row]==0){ //Empty space
	    				playerPos+=row;
	    				direction=2;
	    			}else if(map[playerPos+row]==1 && map[playerPos+(2*row)]==0){ //Push block south
		    			map[playerPos+(2*row)]=1;
		    			map[playerPos+row]=0;
		    			playerPos+=row;
		    			direction=2;
	    			}else if(map[playerPos+row]==2){ //Win condition
	    				if(score>highScore){ //Higher scores than the previously scanned high score are then saved 
	    					try{
	    						PrintWriter save = new PrintWriter("score.txt", "UTF-8"); //Creating text file
	    						save.print(score); //Print score
	    						save.close();
	    					}catch(IOException e){
	    						System.out.println("SOMETHING FUCKED UP");
	    					}
	    				}
	    				direction=2;
	    				playerPos+=row;
	    				map[playerPos-row]=0;
	    				win(direction, map, playerPos, trollPos, trollDirection, noErase, row, grab);
	    			}
	    		}else if(playerMove.equalsIgnoreCase("a")){
	    			if(map[playerPos-1]==0){ //Empty space
	    				playerPos-=1;
	    				direction=4;
	    			}else if(map[playerPos-1]==1 && map[playerPos-2]==0){ //Push block west
		    			map[playerPos-2]=1;
		    			map[playerPos-1]=0;
		    			playerPos-=1;
		    			direction=4;
	    			}
	    		}else if(playerMove.equalsIgnoreCase("q")){ //If grab is off, the condition toggles on
	    			grab=true;
	    		}else{
	    			continue;
	    		}
	    		
	    		//Walking into a troll
	    		if(playerMove.equalsIgnoreCase("w") && map[playerPos-row]==4 || playerMove.equalsIgnoreCase("d") && map[playerPos+1]==4 || playerMove.equalsIgnoreCase("s") && map[playerPos+row]==4 || playerMove.equalsIgnoreCase("a") && map[playerPos-row]==4){
					loss(direction, map, playerPos, trollPos, trollDirection, noErase, row, grab);
	    		}
    		}
    		
    		//Troll behavior
    		for(int i=0; i<trollPos.length; i++){ //Loop makes sure every troll moves
    		
    			//This chunk of code makes it so that trolls will always move towards the player when they are next to each other
    			if(trollPos[i]-row==playerPos){
    				trollPos[i]-=row;
	    			if(trollPos[i] == playerPos){
    					loss(direction, map, playerPos, trollPos, trollDirection, noErase, row, grab);
	    			}
    				score-=1; //Score decreases with every full turn played
    				if(score==0){ //When score hits 0, game times out and is over
						timeout(direction, map, playerPos, trollPos, trollDirection, noErase, row, grab);
    				}
    				continue;
    			}else if(trollPos[i]+row==playerPos){
    				trollPos[i]+=row;
	    			if(trollPos[i] == playerPos){
    					loss(direction, map, playerPos, trollPos, trollDirection, noErase, row, grab);
	    			}
    				score-=1; //Score decreases with every full turn played
    				if(score==0){ //When score hits 0, game times out and is over
						timeout(direction, map, playerPos, trollPos, trollDirection, noErase, row, grab);
    				}
    				continue;
    			}else if(trollPos[i]-1==playerPos){
    				trollPos[i]-=1;
	    			if(trollPos[i] == playerPos){
    					loss(direction, map, playerPos, trollPos, trollDirection, noErase, row, grab);
	    			}
    				score-=1; //Score decreases with every full turn played
    				if(score==0){ //When score hits 0, game times out and is over
						timeout(direction, map, playerPos, trollPos, trollDirection, noErase, row, grab);
    				}
    				continue;
    			}else if(trollPos[i]+1==playerPos){
    				trollPos[i]+=1;
	    			if(trollPos[i] == playerPos){
    					loss(direction, map, playerPos, trollPos, trollDirection, noErase, row, grab);
	    			}
    				score-=1; //Score decreases with every full turn played
    				if(score==0){ //When score hits 0, game times out and is over
						timeout(direction, map, playerPos, trollPos, trollDirection, noErase, row, grab);
    				}
    				continue;
    			}
    			
    			//This chunk determines movement when there the player is not next to a troll
    			random=1+(int)(Math.random()*4);
    			if(random==1 && map[trollPos[i]-row]==0){
    				trollPos[i]-=row;
    				trollDirection[i]=8;
	    			if(trollPos[i] == playerPos){
    					loss(direction, map, playerPos, trollPos, trollDirection, noErase, row, grab);
	    			}
    			}else if(random==2 && map[trollPos[i]+1]==0){
    				trollPos[i]+=1;
    				trollDirection[i]=6;
	    			if(trollPos[i] == playerPos){
    					loss(direction, map, playerPos, trollPos, trollDirection, noErase, row, grab);
	    			}
    			}else if(random==3 && map[trollPos[i]+row]==0){
    				trollPos[i]+=row;
    				trollDirection[i]=2;
	    			if(trollPos[i] == playerPos){
    					loss(direction, map, playerPos, trollPos, trollDirection, noErase, row, grab);
	    			}
    			}else if(random==4 && map[trollPos[i]-1]==0){
    				trollPos[i]-=1;
    				trollDirection[i]=4;
	    			if(trollPos[i] == playerPos){
    					loss(direction, map, playerPos, trollPos, trollDirection, noErase, row, grab);
	    			}
    			}else if(map[trollPos[i]-row]==1 && map[trollPos[i]+row]==1 && map[trollPos[i]+1]==1 && map[trollPos[i]-1]==1){ //Troll becomes stuck
    				trollDirection[i]=1;
    			}else{
    				i-=1;
    				continue;
    			}
    		}
    		
    	//	score-=1; //Score decreases with every full turn played
    		if(score==0){ //When score hits 0, game times out and is over
				timeout(direction, map, playerPos, trollPos, trollDirection, noErase, row, grab);
    		}
    	}
    }
}
