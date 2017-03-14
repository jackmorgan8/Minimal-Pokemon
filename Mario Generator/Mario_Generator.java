import java.util.*;
import java.io.*;
public class Mario_Generator{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Warning: Long levels or large custom pieces will not save properly");
		System.out.print("How long would you like your level to be? ");
		int length = input.nextInt();
		String[] piece1 = new String[8]; //Initializes the strings that make up the level
		String[] piece2 = new String[8];
		String[] piece3 = new String[8];
		String[] piece4 = new String[8];
		String[] piece5 = new String[8];
		String[] piece6 = new String[8];
		String[] piece7 = new String[8];
		String[] piece8 = new String[8];
		String[] piece9 = new String[8];
		String[] piece10 = new String[8];
		String[] piece11 = new String[8];
		/*
		 *Add new pieces here
		 *Make sure it has a unique piece number
		 */
		String[] pieceMiddle = new String[8]; //Creates the middle piece with a flag
		String[] pieceEnd = new String[8]; //Creates the end piece
		/*
		 *Each piece is 8 lines high and is typically 12 characters long, but length can be as long or short as you want (each layer must have the same character length)
		 *A typical piece has 4 lines of ground layers and 4 lines of sky layers, but as long as all 8 layers, are present, your piece will work
		 */
		for(int i=7; i>=4; i--){ //Fills in the bottom 4 layers, i is used to fill specific layers
			piece1[i]="OOOOO  OOOOO";
			piece3[i]="OOOOOOOOOOOO";
			piece4[i]="OOOOOOOOOOOO";
			piece5[i]="OOOOOOOOOOOO";
			piece6[i]="OOOOOOOOOOOO";
			piece7[i]="OOOO    OOOO";
			piece9[i]="OOOOOOOOOOOO";
			/*
			 *If your new piece has 4 ground layers, add it here
			 */
			pieceMiddle[i]="OO";
			pieceEnd[i]="OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO";
		}
		for(int i=0; i<4; i++){ //Fills the top 4 layers with blank strings
			piece2[i]="            ";
			piece3[i]="            ";
			piece7[i]="            ";
			piece8[i]="            ";
			piece10[i]="            ";
			piece11[i]="            ";
			/*
			 *If your piece has the top 4 layers empty, add it here
			 */
		}
		piece1[0]="    O  O    "; //These lines fill in the remaining layers with more piece-specific parts
		piece1[1]="   OO  OO   ";
		piece1[2]="  OOO  OOO  ";
		piece1[3]=" OOOO  OOOO ";
		piece2[4]=" O          ";
		piece2[5]=" OO    |==| ";
		piece2[6]=" OOO    ||  ";
		piece2[7]=" OOOO  OOOO ";
		piece4[0]="     ??     ";
		piece4[1]="            ";
		piece4[2]=" ??  ++  ?? ";
		piece4[3]="            ";
		piece5[0]="     ++     ";
		piece5[1]="            ";
		piece5[2]=" +??+??+??+ ";
		piece5[3]="            ";
		piece6[0]="            ";
		piece6[1]="      OO    ";
		piece6[2]="     OOO    ";
		piece6[3]="    OOOO    ";
		piece8[4]="OOO      OOO";
		piece8[5]="OOO      OOO";
		piece8[6]="OOOOOOOOOOOO";
		piece8[7]="OOOOOOOOOOOO";
		piece9[0]="            ";
		piece9[1]="    |==|    ";
		piece9[2]="     ||     ";
		piece9[3]="     ||     ";
		piece10[4]="     |==|OOO";
		piece10[5]="      || OOO";
		piece10[6]="OO    OOOOOO";
		piece10[7]="OO    OOOOOO";
		piece11[4]="+++++++++++O";
		piece11[5]="           O";
		piece11[6]="           O";
		piece11[7]="           O";
		/*
		 *Specify the remaining layers of your piece here
		 *
		 *The top layer of your piece is layer 0, the bottom is layer 7
		 *
		 *If there are unspecified layers, "null" will appear on the output
		 */
		pieceMiddle[0]="  ";
		pieceMiddle[1]="  ";
		pieceMiddle[2]="|>";
		pieceMiddle[3]="| ";
		pieceEnd[0]="       O     |>   +=======+    ";
		pieceEnd[1]="      OO     |    |   _   |    ";
		pieceEnd[2]="     OOO     |   +-+ / \\ +-+    ";
		pieceEnd[3]="    OOOO     |   | | | | | |    ";
		int numPieces = 11; //If you have changed the number of pieces available, modify this number to correspond to the highest piece number
		int[] level = new int[length]; //Creates an integer array the size of your level length
		for(int i=1; i<length-2; i++){ //Fills array with random numbers
			level[i]=(int)(Math.random()*numPieces); //Comes up with random integers from 1-numPieces
		}
		level[0]=2; //The first integer in the array is 2 so the level always starts on a flat plane
		level[length/2]=998; //Makes the piece halfway through the level a checkpoint flag
		level[length-1]=999; //Makes the last piece an endpoint with a flag and castle
		System.out.println("\n");
		for(int i=0; i<8; i++){ //Counts up by layers, printing each object from top to bottom
			for(int j=0; j<length; j++){ //For every layer, this loop runs through the level array
				switch(level[j]){ //Checks the number at j in the level array
					case 0: System.out.print(piece1[i]); break; //For every possible number generated, there is a corresponding piece
					case 1: System.out.print(piece2[i]); break; //The layer the top loop is currently on is printed
					case 2: System.out.print(piece3[i]); break;
					case 3: System.out.print(piece4[i]); break;
					case 4: System.out.print(piece5[i]); break;
					case 5: System.out.print(piece6[i]); break;
					case 6: System.out.print(piece7[i]); break;
					case 7: System.out.print(piece8[i]); break;
					case 8: System.out.print(piece9[i]); break;
					case 9: System.out.print(piece10[i]); break;
					case 10: System.out.print(piece11[i]); break;
					/*
					 *Added pieces should go here. The case number is 1 less than your piece number (ex: piece 10->case 9, piece 20->case 19)
					 */
					case 998: System.out.print(pieceMiddle[i]); break;
					case 999: System.out.print(pieceEnd[i]); break;
				}
			}
			System.out.println(); //After each iteration of the loop, a new line is started to change layers in the output
		}
		input.nextLine();
		while(true){
			System.out.print("\nWould you like to export to a text file?(yes/no) ");
			String response = input.nextLine();
			if(response.equalsIgnoreCase("yes")){
				break;
			}else if(response.equalsIgnoreCase("no")){
				System.exit(0);
			}else{
				continue;
			}
		}
		try{
			PrintWriter save = new PrintWriter("Mario_Level.txt", "UTF-8");
			for(int i=0; i<8; i++){ //Counts up by layers, printing each object from top to bottom
				for(int j=0; j<length; j++){ //For every layer, this loop runs through the level array
					switch(level[j]){ //Checks the number at j in the level array
						case 0: save.print(piece1[i]); break; //For every possible number generated, there is a corresponding piece
						case 1: save.print(piece2[i]); break; //The layer the top loop is currently on is saved to a text file
						case 2: save.print(piece3[i]); break;
						case 3: save.print(piece4[i]); break;
						case 4: save.print(piece5[i]); break;
						case 5: save.print(piece6[i]); break;
						case 6: save.print(piece7[i]); break;
						case 7: save.print(piece8[i]); break;
						case 8: save.print(piece9[i]); break;
						case 9: save.print(piece10[i]); break;
						case 10: save.print(piece11[i]); break;
						/*
						 *Added pieces should go here. The case number is 1 less than your piece number (ex: piece 10->case 9, piece 20->case 19)
						 */
						case 998: save.print(pieceMiddle[i]); break;
						case 999: save.print(pieceEnd[i]); break;
					}
				}
				save.println(); //After each iteration of the loop, a new line is started to change layers in the output
			}
			save.close();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}