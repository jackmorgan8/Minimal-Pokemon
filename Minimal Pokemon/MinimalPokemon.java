import java.util.*;
import java.io.*;

public class MinimalPokemon{
	
	/*
	 *TILE GUIDE
	 *
	 *   = 10
	 * + = 11
	 * # = 12
	 * O = 13
	 * | = 14
	 * / = 15
	 * \ = 16
	 * - = 17
	 * _ = 18 (Ledge)
	 * ~ = 19
	 * ^ = 20
	 * = = 21
	 * $ = 22
	 * % = 23
	 *
	 */
	
	/*
	 *Displays screen
	 */
	public static void display(int[] map, int playerPos, int row){
		boolean grass=false;
		if(map[playerPos]==11){
			grass=true;
		}
		map[playerPos]=99;
		int startPos=playerPos+(row*4);
		startPos-=4;
		for(int i=0; i<9; i++){
			switch(map[startPos-(row*8)+i]){
				case 10: System.out.print("  "); break;
				case 11: System.out.print("++"); break;
				case 12: System.out.print("##"); break;
				case 13: System.out.print("OO"); break;
				case 14: System.out.print("||"); break;
				case 15: System.out.print(" /"); break;
				case 16: System.out.print("\\ "); break;
				case 17: System.out.print("  "); break;
				case 18: System.out.print("  "); break;
				case 19: System.out.print("~~"); break;
				case 20: System.out.print("^^"); break;
				case 21: System.out.print("=="); break;
				case 22: System.out.print(" |"); break;
				case 23: System.out.print("| "); break;
			}
		}
		
		for(int i=0; i<9; i++){
			switch(map[startPos-(row*8)+i]){
				case 10: System.out.print("  "); break;
				case 11: System.out.print("++"); break;
				case 12: System.out.print("##"); break;
				case 13: System.out.print("OO"); break;
				case 14: System.out.print("||"); break;
				case 15: System.out.print("||"); break;
				case 16: System.out.print("||"); break;
				case 17: System.out.print("__"); break;
				case 18: System.out.print("__"); break;
				case 19: System.out.print("~~"); break; 
				case 20: System.out.print("^^"); break;
				case 21: System.out.print("=="); break;
				case 22: System.out.print(" |"); break;
				case 23: System.out.print("| "); break;
			}
		}
		
		for(int i=0; i<9; i++){
			switch(map[startPos-(row*7)+i]){
				case 10: System.out.print("  "); break;
				case 11: System.out.print("++"); break;
				case 12: System.out.print("##"); break;
				case 13: System.out.print("OO"); break;
				case 14: System.out.print("||"); break;
				case 15: System.out.print(" /"); break;
				case 16: System.out.print("\\ "); break;
				case 17: System.out.print("  "); break;
				case 18: System.out.print("  "); break;
				case 19: System.out.print("~~"); break;
				case 20: System.out.print("^^"); break;
				case 21: System.out.print("=="); break;
				case 22: System.out.print(" |"); break;
				case 23: System.out.print("| "); break;
			}
		}
		
		for(int i=0; i<9; i++){
			switch(map[startPos-(row*7)+i]){
				case 10: System.out.print("  "); break;
				case 11: System.out.print("++"); break;
				case 12: System.out.print("##"); break;
				case 13: System.out.print("OO"); break;
				case 14: System.out.print("||"); break;
				case 15: System.out.print("||"); break;
				case 16: System.out.print("||"); break;
				case 17: System.out.print("__"); break;
				case 18: System.out.print("__"); break;
				case 19: System.out.print("~~"); break; 
				case 20: System.out.print("^^"); break;
				case 21: System.out.print("=="); break;
				case 22: System.out.print(" |"); break;
				case 23: System.out.print("| "); break;
			}
		}
		
		for(int i=0; i<9; i++){
			switch(map[startPos-(row*6)+i]){
				case 10: System.out.print("  "); break;
				case 11: System.out.print("++"); break;
				case 12: System.out.print("##"); break;
				case 13: System.out.print("OO"); break;
				case 14: System.out.print("||"); break;
				case 15: System.out.print(" /"); break;
				case 16: System.out.print("\\ "); break;
				case 17: System.out.print("  "); break;
				case 18: System.out.print("  "); break;
				case 19: System.out.print("~~"); break;
				case 20: System.out.print("^^"); break;
				case 21: System.out.print("=="); break;
				case 22: System.out.print(" |"); break;
				case 23: System.out.print("| "); break;
			}
		}
		
		for(int i=0; i<9; i++){
			switch(map[startPos-(row*6)+i]){
				case 10: System.out.print("  "); break;
				case 11: System.out.print("++"); break;
				case 12: System.out.print("##"); break;
				case 13: System.out.print("OO"); break;
				case 14: System.out.print("||"); break;
				case 15: System.out.print("||"); break;
				case 16: System.out.print("||"); break;
				case 17: System.out.print("__"); break;
				case 18: System.out.print("__"); break;
				case 19: System.out.print("~~"); break; 
				case 20: System.out.print("^^"); break;
				case 21: System.out.print("=="); break;
				case 22: System.out.print(" |"); break;
				case 23: System.out.print("| "); break;
			}
		}
		
		for(int i=0; i<9; i++){
			switch(map[startPos-(row*5)+i]){
				case 10: System.out.print("  "); break;
				case 11: System.out.print("++"); break;
				case 12: System.out.print("##"); break;
				case 13: System.out.print("OO"); break;
				case 14: System.out.print("||"); break;
				case 15: System.out.print(" /"); break;
				case 16: System.out.print("\\ "); break;
				case 17: System.out.print("  "); break;
				case 18: System.out.print("  "); break;
				case 19: System.out.print("~~"); break;
				case 20: System.out.print("^^"); break;
				case 21: System.out.print("=="); break;
				case 22: System.out.print(" |"); break;
				case 23: System.out.print("| "); break;
			}
		}
		
		for(int i=0; i<9; i++){
			switch(map[startPos-(row*5)+i]){
				case 10: System.out.print("  "); break;
				case 11: System.out.print("++"); break;
				case 12: System.out.print("##"); break;
				case 13: System.out.print("OO"); break;
				case 14: System.out.print("||"); break;
				case 15: System.out.print("||"); break;
				case 16: System.out.print("||"); break;
				case 17: System.out.print("__"); break;
				case 18: System.out.print("__"); break;
				case 19: System.out.print("~~"); break; 
				case 20: System.out.print("^^"); break;
				case 21: System.out.print("=="); break;
				case 22: System.out.print(" |"); break;
				case 23: System.out.print("| "); break;
			}
		}
		
		for(int i=0; i<9; i++){
			switch(map[startPos-(row*4)+i]){
				case 10: System.out.print("  "); break;
				case 11: System.out.print("++"); break;
				case 12: System.out.print("##"); break;
				case 13: System.out.print("OO"); break;
				case 14: System.out.print("||"); break;
				case 15: System.out.print(" /"); break;
				case 16: System.out.print("\\ "); break;
				case 17: System.out.print("  "); break;
				case 18: System.out.print("  "); break;
				case 19: System.out.print("~~"); break;
				case 20: System.out.print("^^"); break;
				case 21: System.out.print("=="); break;
				case 22: System.out.print(" |"); break;
				case 23: System.out.print("| "); break;
				case 99: System.out.print("XX"); break;
			}
		}
		
		for(int i=0; i<9; i++){
			switch(map[startPos-(row*4)+i]){
				case 10: System.out.print("  "); break;
				case 11: System.out.print("++"); break;
				case 12: System.out.print("##"); break;
				case 13: System.out.print("OO"); break;
				case 14: System.out.print("||"); break;
				case 15: System.out.print("||"); break;
				case 16: System.out.print("||"); break;
				case 17: System.out.print("__"); break;
				case 18: System.out.print("__"); break;
				case 19: System.out.print("~~"); break; 
				case 20: System.out.print("^^"); break;
				case 21: System.out.print("=="); break;
				case 22: System.out.print(" |"); break;
				case 23: System.out.print("| "); break;
				case 99: System.out.print("XX"); break;
			}
		}
		
		for(int i=0; i<9; i++){
			switch(map[startPos-(row*3)+i]){
				case 10: System.out.print("  "); break;
				case 11: System.out.print("++"); break;
				case 12: System.out.print("##"); break;
				case 13: System.out.print("OO"); break;
				case 14: System.out.print("||"); break;
				case 15: System.out.print(" /"); break;
				case 16: System.out.print("\\ "); break;
				case 17: System.out.print("  "); break;
				case 18: System.out.print("  "); break;
				case 19: System.out.print("~~"); break;
				case 20: System.out.print("^^"); break;
				case 21: System.out.print("=="); break;
				case 22: System.out.print(" |"); break;
				case 23: System.out.print("| "); break;
			}
		}
		
		for(int i=0; i<9; i++){
			switch(map[startPos-(row*3)+i]){
				case 10: System.out.print("  "); break;
				case 11: System.out.print("++"); break;
				case 12: System.out.print("##"); break;
				case 13: System.out.print("OO"); break;
				case 14: System.out.print("||"); break;
				case 15: System.out.print("||"); break;
				case 16: System.out.print("||"); break;
				case 17: System.out.print("__"); break;
				case 18: System.out.print("__"); break;
				case 19: System.out.print("~~"); break; 
				case 20: System.out.print("^^"); break;
				case 21: System.out.print("=="); break;
				case 22: System.out.print(" |"); break;
				case 23: System.out.print("| "); break;
			}
		}
		
		for(int i=0; i<9; i++){
			switch(map[startPos-(row*2)+i]){
				case 10: System.out.print("  "); break;
				case 11: System.out.print("++"); break;
				case 12: System.out.print("##"); break;
				case 13: System.out.print("OO"); break;
				case 14: System.out.print("||"); break;
				case 15: System.out.print(" /"); break;
				case 16: System.out.print("\\ "); break;
				case 17: System.out.print("  "); break;
				case 18: System.out.print("  "); break;
				case 19: System.out.print("~~"); break;
				case 20: System.out.print("^^"); break;
				case 21: System.out.print("=="); break;
				case 22: System.out.print(" |"); break;
				case 23: System.out.print("| "); break;
			}
		}
		
		for(int i=0; i<9; i++){
			switch(map[startPos-(row*2)+i]){
				case 10: System.out.print("  "); break;
				case 11: System.out.print("++"); break;
				case 12: System.out.print("##"); break;
				case 13: System.out.print("OO"); break;
				case 14: System.out.print("||"); break;
				case 15: System.out.print("||"); break;
				case 16: System.out.print("||"); break;
				case 17: System.out.print("__"); break;
				case 18: System.out.print("__"); break;
				case 19: System.out.print("~~"); break; 
				case 20: System.out.print("^^"); break;
				case 21: System.out.print("=="); break;
				case 22: System.out.print(" |"); break;
				case 23: System.out.print("| "); break;
			}
		}
		
		for(int i=0; i<9; i++){
			switch(map[startPos-(row*1)+i]){
				case 10: System.out.print("  "); break;
				case 11: System.out.print("++"); break;
				case 12: System.out.print("##"); break;
				case 13: System.out.print("OO"); break;
				case 14: System.out.print("||"); break;
				case 15: System.out.print(" /"); break;
				case 16: System.out.print("\\ "); break;
				case 17: System.out.print("  "); break;
				case 18: System.out.print("  "); break;
				case 19: System.out.print("~~"); break;
				case 20: System.out.print("^^"); break;
				case 21: System.out.print("=="); break;
				case 22: System.out.print(" |"); break;
				case 23: System.out.print("| "); break;
			}
		}
		
		for(int i=0; i<9; i++){
			switch(map[startPos-(row*1)+i]){
				case 10: System.out.print("  "); break;
				case 11: System.out.print("++"); break;
				case 12: System.out.print("##"); break;
				case 13: System.out.print("OO"); break;
				case 14: System.out.print("||"); break;
				case 15: System.out.print("||"); break;
				case 16: System.out.print("||"); break;
				case 17: System.out.print("__"); break;
				case 18: System.out.print("__"); break;
				case 19: System.out.print("~~"); break; 
				case 20: System.out.print("^^"); break;
				case 21: System.out.print("=="); break;
				case 22: System.out.print(" |"); break;
				case 23: System.out.print("| "); break;
			}
		}
		if(grass){
			map[playerPos]=11;
		}else{
			map[playerPos]=10;
		}
	}
	
	/*
	 *Takes input
	 */
	public static int input(int playerPos){
		Scanner input = new Scanner(System.in);
		int x=0;
		while(true){
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
				System.exit(0);
			}else if(move.equalsIgnoreCase("showpos")){
				x=1;
				break;
			}else if(move.equalsIgnoreCase("hidepos")){
				x=3;
				break;
			}else if(move.equalsIgnoreCase("poscheck")){
				x=7;
				break;
			}else{
				x=5;
				break;
			}
		}
		return(x);
	}
	
	public static void main(String[] args){
		Scanner input1 = new Scanner(System.in);
		String mapString = null;
		try{
			Scanner filein = new Scanner(new FileInputStream("map.txt"));
			mapString = filein.nextLine();
			filein.close();
		}catch(InputMismatchException e){
			System.out.print("Something went wrong...");
			System.exit(0);
		}catch(FileNotFoundException e){
			System.out.print("Map not found...");
			System.exit(0);
		}
		String[] mapStringArray = mapString.split("!");
		int[] map = new int[mapStringArray.length];
		for(int i=0; i<mapStringArray.length; i++){
			map[i] = Integer.parseInt(mapStringArray[i]);
		}
		int mapNum = 1;
		int playerPos=11369+87;
		int row=87; //Column-1
		int playerHealth=100;
		int thunderShockPP=9;
		int thunderPP=3;
		int swiftPP=6;
		int potions=3;
		int ethers=3;
		int input, randomAttack, randomEnemy, enemyHealth, battleInput, bagInput, moveInput, damage;
		boolean showPos = false;
		System.out.print("Set your console\nsize to:\n18x17");
		input1.nextLine();
		while(true){
			display(map, playerPos, row);
			if(showPos){
				System.out.print("Pos: "+playerPos+" ");
			}
			input=input(playerPos);
			if(input==8 && map[playerPos-row]==10){ //Moving up teleport
				playerPos-=row;
				if(playerPos==11369){
					playerPos=4109;
				}else if(playerPos==353 || playerPos==352){ 
					playerPos=8672;
				}
			}else if(input==8 && map[playerPos-row]==11){
				playerPos-=row;
			}else if(input==2 && map[playerPos+row]==10){ //Moving down teleport
				playerPos+=row;
				if(playerPos==4109 || playerPos==4108){
					playerPos=11369;
				}else if(playerPos==8672){
					playerPos=4109;
				}
			}else if(input==2 && map[playerPos+row]==11){
				playerPos+=row;
			}else if(input==2 && map[playerPos+row]==18){
				playerPos+=row*2;
			}else if(input==6 && map[playerPos+1]==10){
				playerPos+=1;
			}else if(input==6 && map[playerPos+1]==11){
				playerPos+=1;
			}else if(input==4 && map[playerPos-1]==10){
				playerPos-=1;
			}else if(input==4 && map[playerPos-1]==11){
				playerPos-=1;
			}else if(input==1){
				showPos=true;
			}else if(input==3){
				showPos=false;
			}else{
				continue;
			}
		}
	}
}