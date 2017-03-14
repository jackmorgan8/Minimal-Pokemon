import java.util.Scanner;

public class RPG{
	
	/*
	 *Takes input after using an ether
	 */
	 
	public static int moveInput(int thunderShockPP, int swiftPP, int thunderPP){
		Scanner input = new Scanner(System.in);
		int x=0;
		System.out.println();
		while(true){
			System.out.print("Thunder Shock  ["+thunderShockPP+"]");
			System.out.print("Swift          ["+swiftPP+"]");
			System.out.print("Thunder        ["+thunderPP+"]");
			System.out.println();
			System.out.println("What move? ");
			String move = input.nextLine();
			if(move.equalsIgnoreCase("thunder shock")){
				x=1;
				break;
			}else if(move.equalsIgnoreCase("swift")){
				x=2;
				break;
			}else if(move.equalsIgnoreCase("thunder")){
				x=3;
				break;
			}else if(move.equalsIgnoreCase("quit")){
				cls();
				System.exit(0);
			}else{
				System.out.println();
				continue;
			}
		}
		return(x);
	}
	
	/*
	 *Takes input while in your bag
	 */
	public static int bagInput(int potions, int ethers){
		Scanner input = new Scanner(System.in);
		int x=0;
		while(true){
			System.out.print("Potion         ["+potions+"]");
			System.out.print("Ether          ["+ethers+"]");
			System.out.println("What would you \nlike to use?");
			String move = input.nextLine();
			if(move.equalsIgnoreCase("potion")){
				x=1;
				break;
			}else if(move.equalsIgnoreCase("ether")){
				x=2;
				break;
			}else if(move.equalsIgnoreCase("quit")){
				cls();
				System.exit(0);
			}else{
				System.out.println();
				continue;
			}
		}
		return(x);
	}
	
	/*
	 *Takes input during battle
	 */
	public static int battleInput(){
		Scanner input = new Scanner(System.in);
		int x=0;
		while(true){
			System.out.println("What should\nPikachu do?");
			String move = input.nextLine();
			if(move.equalsIgnoreCase("thunder shock")){
				x=1;
				System.out.println();
				break;
			}else if(move.equalsIgnoreCase("swift")){
				x=2;
				System.out.println();
				break;
			}else if(move.equalsIgnoreCase("thunder")){
				x=3;
				System.out.println();
				break;
			}else if(move.equalsIgnoreCase("bag")){
				x=4;
				System.out.println();
				break;
			}else if(move.equalsIgnoreCase("quit")){
				cls();
				System.exit(0);
			}else{
				System.out.println();
				continue;
			}
		}
		return(x);
	}
	
	/*
	 *Clears screen
	 */
	public static void cls(){
		String space = "                 ";
		for(int i=1; i<=19; i++){
			System.out.print(space);
		}
		System.out.println();
	}
	
	/*
	 *Displays battle animation
	 */
	public static void animation(){
		for(int i=1; i<=20; i++){
			System.out.print("##################");
			try{
				Thread.sleep(50);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		System.out.println();
	}
	
	/*
	 *Displays screen
	 */
	public static void display(int[] map, int playerPos, int row){
		boolean grass=false;
		if(map[playerPos]==1){
			grass=true;
		}
		map[playerPos]=9;
		int startPos=playerPos+(row*4);
		startPos-=4;
		for(int i=0; i<9; i++){
			switch(map[startPos-(row*8)+i]){
				case 1: System.out.print("++"); break;
				case 2: System.out.print("##"); break;
				case 3: System.out.print("OO"); break;
				default: System.out.print("  "); break;
			}
		}
		
		for(int i=0; i<9; i++){
			switch(map[startPos-(row*8)+i]){
				case 1: System.out.print("++"); break;
				case 2: System.out.print("##"); break;
				case 3: System.out.print("OO"); break;
				default: System.out.print("  "); break;
			}
		}
		
		for(int i=0; i<9; i++){
			switch(map[startPos-(row*7)+i]){
				case 1: System.out.print("++"); break;
				case 2: System.out.print("##"); break;
				case 3: System.out.print("OO"); break;
				default: System.out.print("  "); break;
			}
		}
		
		for(int i=0; i<9; i++){
			switch(map[startPos-(row*7)+i]){
				case 1: System.out.print("++"); break;
				case 2: System.out.print("##"); break;
				case 3: System.out.print("OO"); break;
				default: System.out.print("  "); break;
			}
		}
		
		for(int i=0; i<9; i++){
			switch(map[startPos-(row*6)+i]){
				case 1: System.out.print("++"); break;
				case 2: System.out.print("##"); break;
				case 3: System.out.print("OO"); break;
				default: System.out.print("  "); break;
			}
		}
		
		for(int i=0; i<9; i++){
			switch(map[startPos-(row*6)+i]){
				case 1: System.out.print("++"); break;
				case 2: System.out.print("##"); break;
				case 3: System.out.print("OO"); break;
				default: System.out.print("  "); break;
			}
		}
		
		for(int i=0; i<9; i++){
			switch(map[startPos-(row*5)+i]){
				case 1: System.out.print("++"); break;
				case 2: System.out.print("##"); break;
				case 3: System.out.print("OO"); break;
				default: System.out.print("  "); break;
			}
		}
		
		for(int i=0; i<9; i++){
			switch(map[startPos-(row*5)+i]){
				case 1: System.out.print("++"); break;
				case 2: System.out.print("##"); break;
				case 3: System.out.print("OO"); break;
				default: System.out.print("  "); break;
			}
		}
		
		for(int i=0; i<9; i++){
			switch(map[startPos-(row*4)+i]){
				case 1: System.out.print("++"); break;
				case 2: System.out.print("##"); break;
				case 3: System.out.print("OO"); break;
				case 9: System.out.print("XX"); break;
				default: System.out.print("  "); break;
			}
		}
		
		for(int i=0; i<9; i++){
			switch(map[startPos-(row*4)+i]){
				case 1: System.out.print("++"); break;
				case 2: System.out.print("##"); break;
				case 3: System.out.print("OO"); break;
				case 9: System.out.print("XX"); break;
				default: System.out.print("  "); break;
			}
		}
		
		for(int i=0; i<9; i++){
			switch(map[startPos-(row*3)+i]){
				case 1: System.out.print("++"); break;
				case 2: System.out.print("##"); break;
				case 3: System.out.print("OO"); break;
				default: System.out.print("  "); break;
			}
		}
		
		for(int i=0; i<9; i++){
			switch(map[startPos-(row*3)+i]){
				case 1: System.out.print("++"); break;
				case 2: System.out.print("##"); break;
				case 3: System.out.print("OO"); break;
				default: System.out.print("  "); break;
			}
		}
		
		for(int i=0; i<9; i++){
			switch(map[startPos-(row*2)+i]){
				case 1: System.out.print("++"); break;
				case 2: System.out.print("##"); break;
				case 3: System.out.print("OO"); break;
				default: System.out.print("  "); break;
			}
		}
		
		for(int i=0; i<9; i++){
			switch(map[startPos-(row*2)+i]){
				case 1: System.out.print("++"); break;
				case 2: System.out.print("##"); break;
				case 3: System.out.print("OO"); break;
				default: System.out.print("  "); break;
			}
		}
		
		for(int i=0; i<9; i++){
			switch(map[startPos-(row*1)+i]){
				case 1: System.out.print("++"); break;
				case 2: System.out.print("##"); break;
				case 3: System.out.print("OO"); break;
				default: System.out.print("  "); break;
			}
		}
		
		for(int i=0; i<9; i++){
			switch(map[startPos-(row*1)+i]){
				case 1: System.out.print("++"); break;
				case 2: System.out.print("##"); break;
				case 3: System.out.print("OO"); break;
				default: System.out.print("  "); break;
			}
		}
		if(grass){
			map[playerPos]=1;
		}else{
			map[playerPos]=0;
		}
	}
	
	/*
	 *Takes input
	 */
	public static int input(){
		Scanner input = new Scanner(System.in);
		int x=0;
		while(true){
			System.out.print("Move: ");
			String move = input.nextLine();
			if(move.equalsIgnoreCase("w")){
				x=8;
				break;
			}else if(move.equalsIgnoreCase("d")){
				x=6;
				break;
			}else if(move.equalsIgnoreCase("s")){
				x=2;
				break;
			}else if(move.equalsIgnoreCase("a")){
				x=4;
				break;
			}else if(move.equalsIgnoreCase("quit")){
				cls();
				System.exit(0);
			}else{
				x=5;
				break;
			}
		}
		return(x);
	}
	
	public static void main(String[] args){
		Scanner input1 = new Scanner(System.in);
		int[] map = {
			2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 
			2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 
			2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 
			2, 2, 2, 3, 3, 3, 3, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 2, 2, 2, 
			2, 2, 2, 3, 0, 0, 3, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 2, 2, 2, 
			2, 2, 2, 3, 0, 0, 3, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 2, 2, 2, 
			2, 2, 2, 3, 0, 0, 3, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 2, 2, 0, 0, 0, 0, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 0, 0, 0, 3, 2, 2, 2, 
			2, 2, 2, 3, 0, 0, 3, 2, 2, 0, 0, 0, 3, 3, 0, 0, 0, 2, 2, 0, 0, 0, 3, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 0, 0, 3, 2, 2, 2, 
			2, 2, 2, 3, 0, 0, 3, 2, 2, 0, 0, 0, 3, 3, 0, 0, 0, 2, 2, 0, 0, 0, 3, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 0, 0, 3, 2, 2, 2, 
			2, 2, 2, 3, 1, 1, 3, 2, 2, 1, 1, 1, 3, 3, 1, 1, 1, 2, 2, 1, 1, 1, 3, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 0, 0, 3, 2, 2, 2, 
			2, 2, 2, 3, 1, 1, 3, 2, 2, 1, 1, 1, 3, 3, 1, 1, 1, 2, 2, 1, 1, 1, 3, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 0, 0, 3, 2, 2, 2, 
			2, 2, 2, 3, 1, 1, 3, 2, 2, 1, 1, 1, 3, 3, 1, 1, 1, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 2, 2, 2, 
			2, 2, 2, 3, 1, 1, 3, 2, 2, 1, 1, 1, 3, 3, 1, 1, 1, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 2, 2, 2, 
			2, 2, 2, 3, 1, 1, 3, 2, 2, 1, 1, 1, 3, 3, 1, 1, 1, 2, 2, 1, 1, 1, 3, 2, 2, 2, 2, 3, 0, 0, 3, 2, 2, 1, 1, 1, 3, 2, 2, 2, 
			2, 2, 2, 3, 1, 1, 3, 2, 2, 1, 1, 1, 3, 3, 1, 1, 1, 2, 2, 1, 1, 1, 3, 2, 2, 2, 2, 3, 0, 0, 3, 2, 2, 1, 1, 1, 3, 2, 2, 2, 
			2, 2, 2, 3, 1, 1, 3, 2, 2, 1, 1, 1, 3, 3, 1, 1, 1, 2, 2, 1, 1, 1, 3, 2, 2, 2, 2, 3, 0, 0, 3, 2, 2, 1, 1, 1, 3, 2, 2, 2, 
			2, 2, 2, 3, 1, 1, 3, 2, 2, 1, 1, 1, 3, 3, 1, 1, 1, 2, 2, 1, 1, 1, 3, 2, 2, 2, 2, 3, 0, 0, 3, 2, 2, 1, 1, 1, 3, 2, 2, 2, 
			2, 2, 2, 3, 1, 1, 3, 2, 2, 1, 1, 1, 3, 3, 1, 1, 1, 2, 2, 1, 1, 1, 3, 2, 2, 2, 2, 3, 0, 0, 3, 2, 2, 1, 1, 1, 3, 2, 2, 2, 
			2, 2, 2, 3, 1, 1, 3, 2, 2, 1, 1, 1, 3, 3, 1, 1, 1, 2, 2, 1, 1, 1, 3, 2, 2, 2, 2, 3, 0, 0, 3, 2, 2, 1, 1, 1, 3, 2, 2, 2, 
			2, 2, 2, 3, 1, 1, 3, 2, 2, 1, 1, 1, 3, 3, 1, 1, 1, 0, 0, 1, 1, 1, 3, 2, 2, 2, 2, 3, 0, 0, 3, 2, 2, 1, 1, 1, 3, 2, 2, 2, 
			2, 2, 2, 3, 1, 1, 3, 2, 2, 1, 1, 1, 3, 3, 1, 1, 1, 0, 0, 1, 1, 1, 3, 2, 2, 2, 2, 3, 0, 0, 3, 2, 2, 1, 1, 1, 3, 2, 2, 2, 
			2, 2, 2, 3, 1, 1, 3, 2, 2, 1, 1, 1, 3, 3, 0, 0, 0, 0, 0, 0, 0, 0, 3, 2, 2, 2, 2, 3, 0, 0, 0, 0, 0, 0, 0, 0, 3, 2, 2, 2, 
			2, 2, 2, 3, 1, 1, 3, 2, 2, 1, 1, 1, 3, 3, 0, 0, 0, 0, 0, 0, 0, 0, 3, 2, 2, 2, 2, 3, 0, 0, 0, 0, 0, 0, 0, 0, 3, 2, 2, 2, 
			2, 2, 2, 3, 1, 1, 3, 2, 2, 1, 1, 1, 3, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 1, 1, 1, 2, 2, 3, 0, 0, 3, 2, 2, 2, 
			2, 2, 2, 3, 1, 1, 3, 2, 2, 1, 1, 1, 3, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 1, 1, 1, 2, 2, 3, 0, 0, 3, 2, 2, 2, 
			2, 2, 2, 3, 1, 1, 1, 0, 0, 1, 1, 1, 3, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 1, 1, 1, 2, 2, 3, 0, 0, 3, 2, 2, 2, 
			2, 2, 2, 3, 1, 1, 1, 0, 0, 1, 1, 1, 3, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 1, 1, 1, 2, 2, 3, 0, 0, 3, 2, 2, 2, 
			2, 2, 2, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 1, 1, 1, 2, 2, 3, 0, 0, 3, 2, 2, 2, 
			2, 2, 2, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 1, 1, 1, 2, 2, 3, 0, 0, 3, 2, 2, 2, 
			2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 0, 0, 3, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 1, 1, 1, 2, 2, 3, 0, 0, 3, 2, 2, 2, 
			2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 0, 0, 3, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 1, 1, 1, 2, 2, 3, 0, 0, 3, 2, 2, 2, 
			2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 0, 0, 3, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 1, 1, 1, 2, 2, 3, 0, 0, 3, 2, 2, 2, 
			2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 0, 0, 3, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 1, 1, 1, 2, 2, 3, 0, 0, 3, 2, 2, 2, 
			2, 2, 2, 3, 1, 1, 1, 1, 1, 1, 1, 1, 3, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 1, 1, 1, 2, 2, 3, 0, 0, 3, 2, 2, 2, 
			2, 2, 2, 3, 1, 1, 1, 1, 1, 1, 1, 1, 3, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 1, 1, 1, 2, 2, 3, 0, 0, 3, 2, 2, 2, 
			2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 3, 2, 2, 2, 2, 3, 1, 0, 0, 0, 0, 0, 0, 0, 3, 2, 2, 2, 
			2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 3, 2, 2, 2, 2, 3, 1, 0, 0, 0, 0, 0, 0, 0, 3, 2, 2, 2, 
			2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 0, 1, 3, 2, 2, 2, 2, 3, 1, 0, 0, 0, 3, 2, 2, 2, 2, 3, 1, 0, 0, 2, 2, 2, 2, 2, 2, 2, 2, 2, 
			2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 0, 1, 3, 2, 2, 2, 2, 3, 1, 0, 0, 0, 3, 2, 2, 2, 2, 3, 1, 0, 0, 2, 2, 2, 2, 2, 2, 2, 2, 2, 
			2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 0, 1, 3, 2, 2, 2, 2, 3, 1, 0, 0, 0, 3, 2, 2, 2, 2, 3, 1, 0, 0, 2, 2, 2, 2, 2, 2, 2, 2, 2, 
			2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 0, 1, 3, 2, 2, 2, 2, 3, 1, 0, 0, 0, 3, 2, 2, 2, 2, 3, 1, 0, 0, 2, 2, 2, 2, 2, 2, 2, 2, 2, 
			2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 0, 1, 3, 2, 2, 2, 2, 3, 1, 0, 0, 0, 3, 2, 2, 2, 2, 3, 1, 0, 0, 2, 2, 2, 2, 2, 2, 2, 2, 2, 
			2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 0, 1, 3, 2, 2, 2, 2, 3, 1, 0, 0, 0, 3, 2, 2, 2, 2, 3, 1, 0, 0, 2, 2, 2, 2, 2, 2, 2, 2, 2, 
			2, 2, 2, 3, 1, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 3, 2, 2, 2, 
			2, 2, 2, 3, 1, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 3, 2, 2, 2, 
			2, 2, 2, 3, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 3, 2, 2, 2, 
			2, 2, 2, 3, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 3, 2, 2, 2, 
			2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 
			2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 0, 0, 0, 0, 3, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 
			2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 0, 0, 0, 0, 3, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 
			2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 0, 0, 0, 0, 3, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2 
		};
		int playerPos=1859;
		int row=40;
		int playerHealth=100;
		int thunderShockPP=9;
		int thunderPP=3;
		int swiftPP=6;
		int potions=3;
		int ethers=3;
		int input, randomAttack, randomEnemy, enemyHealth, battleInput, bagInput, moveInput, damage;
		System.out.print("Set your console\nsize to:\n18x17");
		input1.nextLine();
		while(true){
			display(map, playerPos, row);
			input=input();
			if(input==8 && map[playerPos-row]==0){
				playerPos-=row;
			}else if(input==8 && map[playerPos-row]==1){
				playerPos-=row;
			}else if(input==2 && map[playerPos+row]==0){
				playerPos+=row;
			}else if(input==2 && map[playerPos+row]==1){
				playerPos+=row;
			}else if(input==6 && map[playerPos+1]==0){
				playerPos+=1;
			}else if(input==6 && map[playerPos+1]==1){
				playerPos+=1;
			}else if(input==4 && map[playerPos-1]==0){
				playerPos-=1;
			}else if(input==4 && map[playerPos-1]==1){
				playerPos-=1;
			}else{
				continue;
			}
			randomAttack = (int)(20*Math.random()+1);
			if(randomAttack==5 && map[playerPos]==1){
				cls();
				animation();
				cls();
				input1.nextLine();
				cls();
				enemyHealth=(int)(16*Math.random()+25);
				randomEnemy=(int)(5*Math.random()+1);
				System.out.println("A wild");
				switch(randomEnemy){
					case 1: System.out.println("CATERPIE"); break;
					case 2: System.out.println("WEEDLE"); break;
					case 3: System.out.println("PIDGEY"); break;
					case 4: System.out.println("PIDGEOTTO"); break;
					case 5: System.out.println("PIKACHU"); break;
				}
				System.out.println("appeared!\n");
				try{
					Thread.sleep(1500);
				}catch(InterruptedException e){
					e.printStackTrace();
				}
				System.out.println("Go! PIKACHU!\n");
				try{
					Thread.sleep(1000);
				}catch(InterruptedException e){
					e.printStackTrace();
				}
				while(true){
					if(playerHealth>=100){
						System.out.print("Health       ["+playerHealth+"]");
					}else if(playerHealth<100 && playerHealth>9){
						System.out.print("Health        ["+playerHealth+"]");
					}else{
						System.out.print("Health         ["+playerHealth+"]");
					}
					System.out.print("Thunder Shock  ["+thunderShockPP+"]");
					System.out.print("Swift          ["+swiftPP+"]");
					System.out.print("Thunder        ["+thunderPP+"]");
					System.out.println();
					battleInput=battleInput();
					if(battleInput==1 && thunderShockPP>0){
						System.out.println("PIKACHU used\nTHUNDER SHOCK!");
						damage=(int)(6*Math.random()+10);
						enemyHealth-=damage;
						thunderShockPP-=1;
						try{
							Thread.sleep(1000);
						}catch(InterruptedException e){
							e.printStackTrace();
						}
						if(enemyHealth<=0){
							System.out.println();
							System.out.print("YOU WIN!");
							cls();
							System.out.println();
							break;
						}
					}else if(battleInput==2 && swiftPP>0){
						System.out.println("PIKACHU used\nSWIFT!");
						damage=(int)(6*Math.random()+15);
						enemyHealth-=damage;
						swiftPP-=1;
						try{
							Thread.sleep(1000);
						}catch(InterruptedException e){
							e.printStackTrace();
						}
						if(enemyHealth<=0){
							System.out.println();
							System.out.print("YOU WIN!");
							cls();
							System.out.println();
							break;
						}
					}else if(battleInput==3 && thunderPP>0){
						System.out.println("PIKACHU used\nTHUNDER!");
						damage=(int)(6*Math.random()+20);
						enemyHealth-=damage;
						thunderPP-=1;
						try{
							Thread.sleep(1000);
						}catch(InterruptedException e){
							e.printStackTrace();
						}
						if(enemyHealth<=0){
							System.out.println();
							System.out.print("YOU WIN!");
							cls();
							System.out.println();
							break;
						}
					}else if(battleInput==4){
						bagInput=bagInput(potions, ethers);
						if(bagInput==1 && potions>0){
							potions-=1;
							System.out.println("\nPIKACHU healed \n20HP!");
							playerHealth+=20;
							if(playerHealth>100){
								playerHealth=100;
							}
						}else if(bagInput==2 && ethers>0){
							ethers-=1;
							moveInput=moveInput(thunderShockPP, swiftPP, thunderPP);
							if(moveInput==1 && thunderShockPP<9){
								thunderShockPP+=3;
								if(thunderShockPP>9){
									thunderShockPP=9;
								}
							}else if(moveInput==2 && swiftPP<9){
								swiftPP+=3;
								if(swiftPP>9){
									swiftPP=9;
								}
							}else if(moveInput==3 && thunderPP<9){
								thunderPP+=3;
								if(thunderPP>9){
									thunderPP=9;
								}
							}
							System.out.println("\nPIKACHU gained PP!");
						}
						try{
							Thread.sleep(1000);
						}catch(InterruptedException e){
							e.printStackTrace();
						}
					}
					System.out.println();
					switch(randomEnemy){
						case 1: System.out.print("CATERPIE"); break;
						case 2: System.out.print("WEEDLE"); break;
						case 3: System.out.print("PIDGEY"); break;
						case 4: System.out.print("PIDGEOTTO"); break;
						case 5: System.out.print("PIKACHU"); break;
					}
					System.out.println(" used\nTACKLE!");
					damage = (int)(11*Math.random()+5);
					playerHealth-=damage;
					try{
						Thread.sleep(1000);
					}catch(InterruptedException e){
						e.printStackTrace();
					}
					if(playerHealth<=0){
						System.out.print("\nYOU LOST!");
						cls();
						System.exit(0);
					}
					System.out.println();
				}
			}
		}
	}
}
