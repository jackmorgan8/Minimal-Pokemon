import java.util.*;
import java.io.*;

public class NewProject{

	public static void display(int playerPos, int direction, int[] map, int row){
		boolean left1 = false;
		boolean left2 = false;
		boolean left3 = false;
		boolean left4 = false;
		boolean right1 = false;
		boolean right2 = false;
		boolean right3 = false;
		boolean right4 = false;
		boolean center2 = false;
		boolean center3 = false;
		boolean center4 = false;
		boolean center2Enemy = false;
		boolean center3Enemy = false;
		boolean center4Enemy = false;
		if(direction==2){
			//Center
			if(map[playerPos+row]==1 || map[playerPos+row]==9){
				center2 = true;
			}
			if(map[playerPos+(2*row)]==1 || map[playerPos+(2*row)]==9){
				center3 = true;
			}
			if(map[playerPos+(3*row)]==1 || map[playerPos+(3*row)]==9){
				center4 = true;
			}
			//Left
			if(map[playerPos+1]==1 || map[playerPos+1]==9){
				left1 = true;
			}
			if(map[playerPos+(row+1)]==1 || map[playerPos+(row+1)]==9){
				left2 = true;
			}
			if(map[playerPos+(2*row+1)]==1 || map[playerPos+(2*row+1)]==9){
				left3 = true;
			}
			if(map[playerPos+(3*row+1)]==1 || map[playerPos+(3*row+1)]==9){
				left4 = true;
			}
			//Right
			if(map[playerPos-1]==1 || map[playerPos-1]==9){
				right1 = true;
			}
			if(map[playerPos+(row-1)]==1 || map[playerPos+(row-1)]==9){
				right2 = true;
			}
			if(map[playerPos+(2*row-1)]==1 || map[playerPos+(2*row-1)]==9){
				right3 = true;
			}
			if(map[playerPos+(3*row-1)]==1 || map[playerPos+(3*row-1)]==9){
				right4 = true;
			}
		}else if(direction==4){
			//Center
			if(map[playerPos-1]==1 || map[playerPos-1]==9){
				center2 = true;
			}
			if(map[playerPos-2]==1 || map[playerPos-2]==9){
				center3 = true;
			}
			if(map[playerPos-3]==1 || map[playerPos-3]==9){
				center4 = true;
			}
			//Left
			if(map[playerPos+row]==1 || map[playerPos+row]==9){
				left1 = true;
			}
			if(map[playerPos+(row-1)]==1 || map[playerPos+(row-1)]==9){
				left2 = true;
			}
			if(map[playerPos+(row-2)]==1 || map[playerPos+(row-2)]==9){
				left3 = true;
			}
			if(map[playerPos+(row-3)]==1 || map[playerPos+(row-3)]==9){
				left4 = true;
			}
			//Right
			if(map[playerPos-row]==1 || map[playerPos-row]==9){
				right1 = true;
			}
			if(map[playerPos-(row+1)]==1 || map[playerPos-(row+1)]==9){
				right2 = true;
			}
			if(map[playerPos-(row+2)]==1 || map[playerPos-(row+2)]==9){
				right3 = true;
			}
			if(map[playerPos-(row+3)]==1 || map[playerPos-(row+3)]==9){
				right4 = true;
			}
		}else if(direction==6){
			//Center
			if(map[playerPos+1]==1 || map[playerPos+1]==9){
				center2 = true;
			}
			if(map[playerPos+2]==1 || map[playerPos+2]==9){
				center3 = true;
			}
			if(map[playerPos+3]==1 || map[playerPos+3]==9){
				center4 = true;
			}
			//Left
			if(map[playerPos-row]==1 || map[playerPos-row]==9){
				left1 = true;
			}
			if(map[playerPos-(row-1)]==1 || map[playerPos-(row-1)]==9){
				left2 = true;
			}
			if(map[playerPos-(row-2)]==1 || map[playerPos-(row-2)]==9){
				left3 = true;
			}
			if(map[playerPos-(row-3)]==1 || map[playerPos-(row-3)]==9){
				left4 = true;
			}
			//Right
			if(map[playerPos+row]==1 || map[playerPos+row]==9){
				right1 = true;
			}
			if(map[playerPos+(row+1)]==1 || map[playerPos+(row+1)]==9){
				right2 = true;
			}
			if(map[playerPos+(row+2)]==1 || map[playerPos+(row+2)]==9){
				right3 = true;
			}
			if(map[playerPos+(row+3)]==1 || map[playerPos+(row+3)]==9){
				right4 = true;
			}
		}else if(direction==8){
			//Center
			if(map[playerPos-row]==1 || map[playerPos-row]==9){
				center2 = true;
			}
			if(map[playerPos-(2*row)]==1 || map[playerPos-(2*row)]==9){
				center3 = true;
			}
			if(map[playerPos-(3*row)]==1 || map[playerPos-(3*row)]==9){
				center4 = true;
			}
			//Left
			if(map[playerPos-1]==1 || map[playerPos-1]==9){
				left1 = true;
			}
			if(map[playerPos-(row+1)]==1 || map[playerPos-(row+1)]==9){
				left2 = true;
			}
			if(map[playerPos-(2*row+1)]==1 || map[playerPos-(2*row+1)]==9){
				left3 = true;
			}
			if(map[playerPos-(3*row+1)]==1 || map[playerPos-(3*row+1)]==9){
				left4 = true;
			}
			//Right
			if(map[playerPos+1]==1 || map[playerPos+1]==9){
				right1 = true;
			}
			if(map[playerPos-(row-1)]==1 || map[playerPos-(row-1)]==9){
				right2 = true;
			}
			if(map[playerPos-(2*row-1)]==1 || map[playerPos-(2*row-1)]==9){
				right3 = true;
			}
			if(map[playerPos-(3*row-1)]==1 || map[playerPos-(3*row-1)]==9){
				right4 = true;
			}
		}
		//Print the current game screen based off of surrounding walls
    	System.out.print("+----------------+--------------------------------------------+----------------+");
		if(left1){
			System.out.print("|                |  \\                   ");
		}else{
			System.out.print("|                |                      ");
		}
		if(right1){
			System.out.print("                   /  |                |");
		}else{
			System.out.print("                      |                |");
		}
		if(left1){
			System.out.print("|                |    \\                 ");
		}else{
			System.out.print("|                |                      ");
		}
		if(right1){
			System.out.print("                 /    |                |");
		}else{
			System.out.print("                      |                |");
		}
    	if(center2){
			if(left1){
				System.out.print("|                |      \\               ");
			}else{
				System.out.print("|                |                      ");
			}
			if(right1){
				System.out.print("               /      |                |");
			}else{
				System.out.print("                      |                |");
			}
    		if(left1){
    			System.out.print("|                |      |---------------");
    		}else if(left1==false && left2==false){
    			System.out.print("|                |      |---------------");
    		}else{
    			System.out.print("|                |----------------------");
    		}
    		if(right1){
    			System.out.print("---------------|      |                |");
    		}else if(right1==false && right2==false){
    			System.out.print("---------------|      |                |");
    		}else{
    			System.out.print("----------------------|                |");
    		}
    		for(int i=0; i<12; i++){
				if(left1 && right1){
					System.out.print("|                |      |                              |      |                |");
	    		}else if(left1 && right1==false && right2==false){
					System.out.print("|                |      |                              |      |                |");
	    		}else if(right1 && left1==false && left2==false){
					System.out.print("|                |      |                              |      |                |");
	    		}else if(left1==false && right1){
	    			System.out.print("|                |                                     |      |                |");
	    		}else if(left1==false && left2==false && right2){
	    			System.out.print("|                |      |                                     |                |");
	    		}else if(left2 && right1==false && right2==false){
	    			System.out.print("|                |                                     |      |                |");
	    		}else if(left1 && right1==false){
	    			System.out.print("|                |      |                                     |                |");
	    		}else if(left1==false && left2==false && right1==false && right2==false){
					System.out.print("|                |      |                              |      |                |");
	    		}else{
	    			System.out.print("|                |                                            |                |");
	    		}
    		}
    		if(left1){
    			System.out.print("|                |      |---------------");
    		}else if(left1==false && left2==false){
    			System.out.print("|                |      |---------------");
    		}else{
    			System.out.print("|                |----------------------");
    		}
    		if(right1){
    			System.out.print("---------------|      |                |");
    		}else if(right1==false && right2==false){
    			System.out.print("---------------|      |                |");
    		}else{
    			System.out.print("----------------------|                |");
    		}
			if(left1){
				System.out.print("|                |      /               ");
			}else{
				System.out.print("|                |                      ");
			}
			if(right1){
				System.out.print("               \\      |                |");
			}else{
				System.out.print("                      |                |");
			}
    	}else if(center3){
    		if(left1==false && left2){
    			System.out.print("|                |------\\               ");
    		}else if(left1 && left2){
    			System.out.print("|                |      \\               ");
    		}else if(left1 && left2==false){
    			System.out.print("|                |      \\               ");
    		}else{
    			System.out.print("|                |                      ");
    		}
    		if(right1==false && right2){
    			System.out.print("               /------|                |");
    		}else if(right1 && right2){
    			System.out.print("               /      |                |");
    		}else if(right1 && right2==false){
    			System.out.print("               /      |                |");
    		}else{
    			System.out.print("                      |                |");
    		}
    		if(left1==false && left2){
    			System.out.print("|                |      | \\             ");
    		}else if(left1 && left2){
    			System.out.print("|                |      | \\             ");
    		}else if(left1 && left2==false){
    			System.out.print("|                |      |               ");
    		}else{
    			System.out.print("|                |                      ");
    		}
    		if(right1==false && right2){
    			System.out.print("             / |      |                |");
    		}else if(right1 && right2){
    			System.out.print("             / |      |                |");
    		}else if(right1 && right2==false){
    			System.out.print("               |      |                |");
    		}else{
    			System.out.print("                      |                |");
    		}
    		if(left1==false && left2){
    			System.out.print("|                |      |   \\           ");
    		}else if(left1 && left2){
    			System.out.print("|                |      |   \\           ");
    		}else if(left1 && left2==false){
    			System.out.print("|                |      |               ");
    		}else{
    			System.out.print("|                |                      ");
    		}
    		if(right1==false && right2){
    			System.out.print("           /   |      |                |");
    		}else if(right1 && right2){
    			System.out.print("           /   |      |                |");
    		}else if(right1 && right2==false){
    			System.out.print("               |      |                |");
    		}else{
    			System.out.print("                      |                |");
    		}
    		if(left1==false && left2){
    			System.out.print("|                |      |    |----------");
    		}else if(left1 && left2){
    			System.out.print("|                |      |    |----------");
    		}else if(left1 && left2==false){
    			System.out.print("|                |      |---------------");
    		}else{
    			System.out.print("|                |----------------------");
    		}
    		if(right1==false && right2){
    			System.out.print("----------|    |      |                |");
    		}else if(right1 && right2){
    			System.out.print("----------|    |      |                |");
    		}else if(right1 && right2==false){
    			System.out.print("---------------|      |                |");
    		}else{
    			System.out.print("----------------------|                |");
    		}
    		for(int i=0; i<8; i++){
    			if(left1==false && left2){
    				System.out.print("|                |      |    |          ");
    			}else if(left1 && left2){
    				System.out.print("|                |      |    |          ");
    			}else if(left1 && left2==false){
    				System.out.print("|                |      |               ");
    			}else{
    				System.out.print("|                |                      ");
    			}
    			if(right1==false && right2){
    				System.out.print("          |    |      |                |");
    			}else if(right1 && right2){
    				System.out.print("          |    |      |                |");
    			}else if(right1 && right2==false){
    				System.out.print("               |      |                |");
    			}else{
    				System.out.print("                      |                |");
    			}
    		}
    		if(left1==false && left2){
    			System.out.print("|                |      |    |----------");
    		}else if(left1 && left2){
    			System.out.print("|                |      |    |----------");
    		}else if(left1 && left2==false){
    			System.out.print("|                |      |---------------");
    		}else{
    			System.out.print("|                |----------------------");
    		}
    		if(right1==false && right2){
    			System.out.print("----------|    |      |                |");
    		}else if(right1 && right2){
    			System.out.print("----------|    |      |                |");
    		}else if(right1 && right2==false){
    			System.out.print("---------------|      |                |");
    		}else{
    			System.out.print("----------------------|                |");
    		}
    		if(left1==false && left2){
    			System.out.print("|                |      |   /           ");
    		}else if(left1 && left2){
    			System.out.print("|                |      |   /           ");
    		}else if(left1 && left2==false){
    			System.out.print("|                |      |               ");
    		}else{
    			System.out.print("|                |                      ");
    		}
    		if(right1==false && right2){
    			System.out.print("           \\   |      |                |");
    		}else if(right1 && right2){
    			System.out.print("           \\   |      |                |");
    		}else if(right1 && right2==false){
    			System.out.print("               |      |                |");
    		}else{
    			System.out.print("                      |                |");
    		}
    		if(left1==false && left2){
    			System.out.print("|                |      | /             ");
    		}else if(left1 && left2){
    			System.out.print("|                |      | /             ");
    		}else if(left1 && left2==false){
    			System.out.print("|                |      |               ");
    		}else{
    			System.out.print("|                |                      ");
    		}
    		if(right1==false && right2){
    			System.out.print("             \\ |      |                |");
    		}else if(right1 && right2){
    			System.out.print("             \\ |      |                |");
    		}else if(right1 && right2==false){
    			System.out.print("               |      |                |");
    		}else{
    			System.out.print("                      |                |");
    		}
    		if(left1==false && left2){
    			System.out.print("|                |------/               ");
    		}else if(left1 && left2){
    			System.out.print("|                |      /               ");
    		}else if(left1 && left2==false){
    			System.out.print("|                |      /               ");
    		}else{
    			System.out.print("|                |                      ");
    		}
    		if(right1==false && right2){
    			System.out.print("               \\------|                |");
    		}else if(right1 && right2){
    			System.out.print("               \\      |                |");
    		}else if(right1 && right2==false){
    			System.out.print("               \\      |                |");
    		}else{
    			System.out.print("                      |                |");
    		}
    	}else{
    		if(left1==false && left2){
    			System.out.print("|                |------\\               ");
    		}else if(left1 && left2){
    			System.out.print("|                |      \\               ");
    		}else if(left1 && left2==false){
    			System.out.print("|                |      \\               ");
    		}else{
    			System.out.print("|                |                      ");
    		}
    		if(right1==false && right2){
    			System.out.print("               /------|                |");
    		}else if(right1 && right2){
    			System.out.print("               /      |                |");
    		}else if(right1 && right2==false){
    			System.out.print("               /      |                |");
    		}else{
    			System.out.print("                      |                |");
    		}
    		if(left1==false && left2){
    			System.out.print("|                |      | \\             ");
    		}else if(left1 && left2){
    			System.out.print("|                |      | \\             ");
    		}else if(left1 && left2==false){
    			System.out.print("|                |      |               ");
    		}else{
    			System.out.print("|                |                      ");
    		}
    		if(right1==false && right2){
    			System.out.print("             / |      |                |");
    		}else if(right1 && right2){
    			System.out.print("             / |      |                |");
    		}else if(right1 && right2==false){
    			System.out.print("               |      |                |");
    		}else{
    			System.out.print("                      |                |");
    		}
    		if(left1==false && left2){
    			System.out.print("|                |      |   \\           ");
    		}else if(left1 && left2){
    			System.out.print("|                |      |   \\           ");
    		}else if(left1 && left2==false){
    			System.out.print("|                |      |               ");
    		}else{
    			System.out.print("|                |                      ");
    		}
    		if(right1==false && right2){
    			System.out.print("           /   |      |                |");
    		}else if(right1 && right2){
    			System.out.print("           /   |      |                |");
    		}else if(right1 && right2==false){
    			System.out.print("               |      |                |");
    		}else{
    			System.out.print("                      |                |");
    		}
    		if(left1 && left2 && left3){
    			System.out.print("|                |      |    |\\         ");
    		}else if(left1==false && left2 && left3){
    			System.out.print("|                |      |    |\\         ");
    		}else if(left1==false && left2==false && left3){
    			System.out.print("|                |-----------|\\         ");
    		}else if(left1 && left2==false && left3){
    			System.out.print("|                |      |----|\\         ");
    		}else if(left1 && left2==false && left3==false && left4){
    			System.out.print("|                |      |               ");
    		}else if(left1 && left2==false && left3==false && left4==false){
    			System.out.print("|                |      |               ");
    		}else if(left1 && left2 && left3==false && left4){
    			System.out.print("|                |      |    |          ");
    		}else if(left1 && left2 && left3==false && left4==false){
    			System.out.print("|                |      |    |          ");
    		}else if(left1==false && left2 && left3==false && left4){
    			System.out.print("|                |      |    |          ");
    		}else if(left1==false && left2 && left3==false && left4==false){
    			System.out.print("|                |      |    |          ");
    		}else{
    			System.out.print("|                |                      ");
    		}
    		if(right1 && right2 && right3){
    			System.out.print("         /|    |      |                |");
    		}else if(right1==false && right2 && right3){
    			System.out.print("         /|    |      |                |");
    		}else if(right1==false && right2==false && right3){
    			System.out.print("         /|-----------|                |");
    		}else if(right1 && right2==false && right3){
    			System.out.print("         /|----|      |                |");
    		}else if(right1 && right2==false && right3==false && right4){
    			System.out.print("               |      |                |");
    		}else if(right1 && right2==false && right3==false && right4==false){
    			System.out.print("               |      |                |");
    		}else if(right1 && right2 && right3==false && right4){
    			System.out.print("          |    |      |                |");
    		}else if(right1 && right2 && right3==false && right4==false){
    			System.out.print("          |    |      |                |");
    		}else if(right1==false && right2 && right3==false && right4){
    			System.out.print("          |    |      |                |");
    		}else if(right1==false && right2 && right3==false && right4==false){
    			System.out.print("          |    |      |                |");
    		}else{
    			System.out.print("                      |                |");
    		}
    		if(left1 && left2 && left3){
    			System.out.print("|                |      |    |  \\       ");
    		}else if(left1==false && left2 && left3){
    			System.out.print("|                |      |    |  \\       ");
    		}else if(left1==false && left2==false && left3){
    			System.out.print("|                |           |  \\       ");
    		}else if(left1 && left2==false && left3){
    			System.out.print("|                |      |    |  \\       ");
    		}else if(left1 && left2==false && left3==false && left4){
    			System.out.print("|                |      |               ");
    		}else if(left1 && left2==false && left3==false && left4==false){
    			System.out.print("|                |      |               ");
    		}else if(left1 && left2 && left3==false && left4){
    			System.out.print("|                |      |    |          ");
    		}else if(left1 && left2 && left3==false && left4==false){
    			System.out.print("|                |      |    |          ");
    		}else if(left1==false && left2 && left3==false && left4){
    			System.out.print("|                |      |    |          ");
    		}else if(left1==false && left2 && left3==false && left4==false){
    			System.out.print("|                |      |    |          ");
    		}else{
    			System.out.print("|                |                      ");
    		}
    		if(right1 && right2 && right3){
    			System.out.print("       /  |    |      |                |");
    		}else if(right1==false && right2 && right3){
    			System.out.print("       /  |    |      |                |");
    		}else if(right1==false && right2==false && right3){
    			System.out.print("       /  |           |                |");
    		}else if(right1 && right2==false && right3){
    			System.out.print("       /  |    |      |                |");
    		}else if(right1 && right2==false && right3==false && right4){
    			System.out.print("               |      |                |");
    		}else if(right1 && right2==false && right3==false && right4==false){
    			System.out.print("               |      |                |");
    		}else if(right1 && right2 && right3==false && right4){
    			System.out.print("          |    |      |                |");
    		}else if(right1 && right2 && right3==false && right4==false){
    			System.out.print("          |    |      |                |");
    		}else if(right1==false && right2 && right3==false && right4){
    			System.out.print("          |    |      |                |");
    		}else if(right1==false && right2 && right3==false && right4==false){
    			System.out.print("          |    |      |                |");
    		}else{
    			System.out.print("                      |                |");
    		}
    		if(center4){
    			if(left1 && left2 && left3){
	    			System.out.print("|                |      |    |   |------");
	    		}else if(left1==false && left2 && left3){
	    			System.out.print("|                |      |    |   |------");
	    		}else if(left1==false && left2==false && left3){
	    			System.out.print("|                |           |   |------");
	    		}else if(left1 && left2==false && left3){
	    			System.out.print("|                |      |    |   |------");
	    		}else if(left1 && left2==false && left3==false && left4){
	    			System.out.print("|                |      |---------------");
	    		}else if(left1 && left2==false && left3==false && left4==false){
	    			System.out.print("|                |      |        |------");
	    		}else if(left1 && left2 && left3==false && left4){
	    			System.out.print("|                |      |    |----------");
	    		}else if(left1 && left2 && left3==false && left4==false){
	    			System.out.print("|                |      |    |   |------");
	    		}else if(left1==false && left2 && left3==false && left4){
	    			System.out.print("|                |      |    |----------");
	    		}else if(left1==false && left2 && left3==false && left4==false){
	    			System.out.print("|                |      |    |----------");
	    		}else{
	    			System.out.print("|                |----------------------");
	    		}
	    		if(right1 && right2 && right3){
	    			System.out.print("------|   |    |      |                |");
	    		}else if(right1==false && right2 && right3){
	    			System.out.print("------|   |    |      |                |");
	    		}else if(right1==false && right2==false && right3){
	    			System.out.print("------|   |           |                |");
	    		}else if(right1 && right2==false && right3){
	    			System.out.print("------|   |    |      |                |");
	    		}else if(right1 && right2==false && right3==false && right4){
	    			System.out.print("---------------|      |                |");
	    		}else if(right1 && right2==false && right3==false && right4==false){
	    			System.out.print("------|        |      |                |");
	    		}else if(right1 && right2 && right3==false && right4){
	    			System.out.print("----------|    |      |                |");
	    		}else if(right1 && right2 && right3==false && right4==false){
	    			System.out.print("------|   |    |      |                |");
	    		}else if(right1==false && right2 && right3==false && right4){
	    			System.out.print("----------|    |      |                |");
	    		}else if(right1==false && right2 && right3==false && right4==false){
	    			System.out.print("----------|    |      |                |");
	    		}else{
	    			System.out.print("----------------------|                |");
	    		}
	    		for(int i=0; i<4; i++){
	    			if(left1 && left2 && left3){
		    			System.out.print("|                |      |    |   |      ");
		    		}else if(left1==false && left2 && left3){
		    			System.out.print("|                |      |    |   |      ");
		    		}else if(left1==false && left2==false && left3){
		    			System.out.print("|                |           |   |      ");
		    		}else if(left1 && left2==false && left3){
		    			System.out.print("|                |      |    |   |      ");
		    		}else if(left1 && left2==false && left3==false && left4){
		    			System.out.print("|                |      |               ");
		    		}else if(left1 && left2==false && left3==false && left4==false){
		    			System.out.print("|                |      |        |      ");
		    		}else if(left1 && left2 && left3==false && left4){
		    			System.out.print("|                |      |    |          ");
		    		}else if(left1 && left2 && left3==false && left4==false){
		    			System.out.print("|                |      |    |   |      ");
		    		}else if(left1==false && left2 && left3==false && left4){
		    			System.out.print("|                |      |    |          ");
		    		}else if(left1==false && left2 && left3==false && left4==false){
		    			System.out.print("|                |      |    |          ");
		    		}else{
		    			System.out.print("|                |                      ");
		    		}
		    		if(right1 && right2 && right3){
		    			System.out.print("      |   |    |      |                |");
		    		}else if(right1==false && right2 && right3){
		    			System.out.print("      |   |    |      |                |");
		    		}else if(right1==false && right2==false && right3){
		    			System.out.print("      |   |           |                |");
		    		}else if(right1 && right2==false && right3){
		    			System.out.print("      |   |    |      |                |");
		    		}else if(right1 && right2==false && right3==false && right4){
		    			System.out.print("               |      |                |");
		    		}else if(right1 && right2==false && right3==false && right4==false){
		    			System.out.print("      |        |      |                |");
		    		}else if(right1 && right2 && right3==false && right4){
		    			System.out.print("          |    |      |                |");
		    		}else if(right1 && right2 && right3==false && right4==false){
		    			System.out.print("      |   |    |      |                |");
		    		}else if(right1==false && right2 && right3==false && right4){
		    			System.out.print("          |    |      |                |");
		    		}else if(right1==false && right2 && right3==false && right4==false){
		    			System.out.print("          |    |      |                |");
		    		}else{
		    			System.out.print("                      |                |");
		    		}
	    		}
    			if(left1 && left2 && left3){
	    			System.out.print("|                |      |    |   |------");
	    		}else if(left1==false && left2 && left3){
	    			System.out.print("|                |      |    |   |------");
	    		}else if(left1==false && left2==false && left3){
	    			System.out.print("|                |           |   |------");
	    		}else if(left1 && left2==false && left3){
	    			System.out.print("|                |      |    |   |------");
	    		}else if(left1 && left2==false && left3==false && left4){
	    			System.out.print("|                |      |---------------");
	    		}else if(left1 && left2==false && left3==false && left4==false){
	    			System.out.print("|                |      |        |------");
	    		}else if(left1 && left2 && left3==false && left4){
	    			System.out.print("|                |      |    |----------");
	    		}else if(left1 && left2 && left3==false && left4==false){
	    			System.out.print("|                |      |    |   |------");
	    		}else if(left1==false && left2 && left3==false && left4){
	    			System.out.print("|                |      |    |----------");
	    		}else if(left1==false && left2 && left3==false && left4==false){
	    			System.out.print("|                |      |    |----------");
	    		}else{
	    			System.out.print("|                |----------------------");
	    		}
	    		if(right1 && right2 && right3){
	    			System.out.print("------|   |    |      |                |");
	    		}else if(right1==false && right2 && right3){
	    			System.out.print("------|   |    |      |                |");
	    		}else if(right1==false && right2==false && right3){
	    			System.out.print("------|   |           |                |");
	    		}else if(right1 && right2==false && right3){
	    			System.out.print("------|   |    |      |                |");
	    		}else if(right1 && right2==false && right3==false && right4){
	    			System.out.print("---------------|      |                |");
	    		}else if(right1 && right2==false && right3==false && right4==false){
	    			System.out.print("------|        |      |                |");
	    		}else if(right1 && right2 && right3==false && right4){
	    			System.out.print("----------|    |      |                |");
	    		}else if(right1 && right2 && right3==false && right4==false){
	    			System.out.print("------|   |    |      |                |");
	    		}else if(right1==false && right2 && right3==false && right4){
	    			System.out.print("----------|    |      |                |");
	    		}else if(right1==false && right2 && right3==false && right4==false){
	    			System.out.print("----------|    |      |                |");
	    		}else{
	    			System.out.print("----------------------|                |");
	    		}
    		}else{
    			if(left1 && left2 && left3){
	    			System.out.print("|                |      |    |   |      ");
	    		}else if(left1==false && left2 && left3){
	    			System.out.print("|                |      |    |   |      ");
	    		}else if(left1==false && left2==false && left3){
	    			System.out.print("|                |               |      ");
	    		}else if(left1 && left2==false && left3){
	    			System.out.print("|                |      |    |   |      ");
	    		}else if(left1 && left2==false && left3==false && left4){
	    			System.out.print("|                |      |--------|      ");
	    		}else if(left1 && left2==false && left3==false && left4==false){
	    			System.out.print("|                |      |               ");
	    		}else if(left1 && left2 && left3==false && left4){
	    			System.out.print("|                |      |    |---|      ");
	    		}else if(left1 && left2 && left3==false && left4==false){
	    			System.out.print("|                |      |               ");
	    		}else if(left1==false && left2 && left3==false && left4){
	    			System.out.print("|                |      |    |---|      ");
	    		}else if(left1==false && left2 && left3==false && left4==false){
	    			System.out.print("|                |      |               ");
	    		}else{
	    			System.out.print("|                |                      ");
	    		}
	    		if(right1 && right2 && right3){
	    			System.out.print("      |   |    |      |                |");
	    		}else if(right1==false && right2 && right3){
	    			System.out.print("      |   |    |      |                |");
	    		}else if(right1==false && right2==false && right3){
	    			System.out.print("      |               |                |");
	    		}else if(right1 && right2==false && right3){
	    			System.out.print("      |   |    |      |                |");
	    		}else if(right1 && right2==false && right3==false && right4){
	    			System.out.print("      |--------|      |                |");
	    		}else if(right1 && right2==false && right3==false && right4==false){
	    			System.out.print("               |      |                |");
	    		}else if(right1 && right2 && right3==false && right4){
	    			System.out.print("      |---|    |      |                |");
	    		}else if(right1 && right2 && right3==false && right4==false){
	    			System.out.print("               |      |                |");
	    		}else if(right1==false && right2 && right3==false && right4){
	    			System.out.print("      |---|    |      |                |");
	    		}else if(right1==false && right2 && right3==false && right4==false){
	    			System.out.print("               |      |                |");
	    		}else{
	    			System.out.print("                      |                |");
	    		}
	    		for(int i=0; i<4; i++){
	    			if(left1 && left2 && left3){
		    			System.out.print("|                |      |    |   |      ");
		    		}else if(left1==false && left2 && left3){
		    			System.out.print("|                |      |    |   |      ");
		    		}else if(left1==false && left2==false && left3){
		    			System.out.print("|                |           |   |      ");
		    		}else if(left1 && left2==false && left3){
		    			System.out.print("|                |      |    |   |      ");
		    		}else if(left1 && left2==false && left3==false && left4){
		    			System.out.print("|                |      |        |      ");
		    		}else if(left1 && left2==false && left3==false && left4==false){
		    			System.out.print("|                |      |               ");
		    		}else if(left1 && left2 && left3==false && left4){
		    			System.out.print("|                |      |    |   |      ");
		    		}else if(left1 && left2 && left3==false && left4==false){
		    			System.out.print("|                |      |    |          ");
		    		}else if(left1==false && left2 && left3==false && left4){
		    			System.out.print("|                |      |    |   |      ");
		    		}else if(left1==false && left2 && left3==false && left4==false){
		    			System.out.print("|                |      |    |          ");
		    		}else{
		    			System.out.print("|                |                      ");
		    		}
		    		if(right1 && right2 && right3){
		    			System.out.print("      |   |    |      |                |");
		    		}else if(right1==false && right2 && right3){
		    			System.out.print("      |   |    |      |                |");
		    		}else if(right1==false && right2==false && right3){
		    			System.out.print("      |        |      |                |");
		    		}else if(right1 && right2==false && right3){
		    			System.out.print("      |   |    |      |                |");
		    		}else if(right1 && right2==false && right3==false && right4){
		    			System.out.print("      |        |      |                |");
		    		}else if(right1 && right2==false && right3==false && right4==false){
		    			System.out.print("               |      |                |");
		    		}else if(right1 && right2 && right3==false && right4){
		    			System.out.print("      |   |    |      |                |");
		    		}else if(right1 && right2 && right3==false && right4==false){
		    			System.out.print("          |    |      |                |");
		    		}else if(right1==false && right2 && right3==false && right4){
		    			System.out.print("      |   |    |      |                |");
		    		}else if(right1==false && right2 && right3==false && right4==false){
		    			System.out.print("          |    |      |                |");
		    		}else{
		    			System.out.print("                      |                |");
		    		}
	    		}
	    		if(left1 && left2 && left3){
	    			System.out.print("|                |      |    |   |      ");
	    		}else if(left1==false && left2 && left3){
	    			System.out.print("|                |      |    |   |      ");
	    		}else if(left1==false && left2==false && left3){
	    			System.out.print("|                |               |      ");
	    		}else if(left1 && left2==false && left3){
	    			System.out.print("|                |      |    |   |      ");
	    		}else if(left1 && left2==false && left3==false && left4){
	    			System.out.print("|                |      |--------|      ");
	    		}else if(left1 && left2==false && left3==false && left4==false){
	    			System.out.print("|                |      |               ");
	    		}else if(left1 && left2 && left3==false && left4){
	    			System.out.print("|                |      |    |---|      ");
	    		}else if(left1 && left2 && left3==false && left4==false){
	    			System.out.print("|                |      |               ");
	    		}else if(left1==false && left2 && left3==false && left4){
	    			System.out.print("|                |      |    |---|      ");
	    		}else if(left1==false && left2 && left3==false && left4==false){
	    			System.out.print("|                |      |               ");
	    		}else{
	    			System.out.print("|                |                      ");
	    		}
	    		if(right1 && right2 && right3){
	    			System.out.print("      |   |    |      |                |");
	    		}else if(right1==false && right2 && right3){
	    			System.out.print("      |   |    |      |                |");
	    		}else if(right1==false && right2==false && right3){
	    			System.out.print("      |               |                |");
	    		}else if(right1 && right2==false && right3){
	    			System.out.print("      |   |    |      |                |");
	    		}else if(right1 && right2==false && right3==false && right4){
	    			System.out.print("      |--------|      |                |");
	    		}else if(right1 && right2==false && right3==false && right4==false){
	    			System.out.print("               |      |                |");
	    		}else if(right1 && right2 && right3==false && right4){
	    			System.out.print("      |---|    |      |                |");
	    		}else if(right1 && right2 && right3==false && right4==false){
	    			System.out.print("               |      |                |");
	    		}else if(right1==false && right2 && right3==false && right4){
	    			System.out.print("      |---|    |      |                |");
	    		}else if(right1==false && right2 && right3==false && right4==false){
	    			System.out.print("               |      |                |");
	    		}else{
	    			System.out.print("                      |                |");
	    		}
    		}
    		if(left1 && left2 && left3){
    			System.out.print("|                |      |    |  /       ");
    		}else if(left1==false && left2 && left3){
    			System.out.print("|                |      |    |  /       ");
    		}else if(left1==false && left2==false && left3){
    			System.out.print("|                |           |  /       ");
    		}else if(left1 && left2==false && left3){
    			System.out.print("|                |      |    |  /       ");
    		}else if(left1 && left2==false && left3==false && left4){
    			System.out.print("|                |      |               ");
    		}else if(left1 && left2==false && left3==false && left4==false){
    			System.out.print("|                |      |               ");
    		}else if(left1 && left2 && left3==false && left4){
    			System.out.print("|                |      |    |          ");
    		}else if(left1 && left2 && left3==false && left4==false){
    			System.out.print("|                |      |    |          ");
    		}else if(left1==false && left2 && left3==false && left4){
    			System.out.print("|                |      |    |          ");
    		}else if(left1==false && left2 && left3==false && left4==false){
    			System.out.print("|                |      |    |          ");
    		}else{
    			System.out.print("|                |                      ");
    		}
    		if(right1 && right2 && right3){
    			System.out.print("       \\  |    |      |                |");
    		}else if(right1==false && right2 && right3){
    			System.out.print("       \\  |    |      |                |");
    		}else if(right1==false && right2==false && right3){
    			System.out.print("       \\  |           |                |");
    		}else if(right1 && right2==false && right3){
    			System.out.print("       \\  |    |      |                |");
    		}else if(right1 && right2==false && right3==false && right4){
    			System.out.print("               |      |                |");
    		}else if(right1 && right2==false && right3==false && right4==false){
    			System.out.print("               |      |                |");
    		}else if(right1 && right2 && right3==false && right4){
    			System.out.print("          |    |      |                |");
    		}else if(right1 && right2 && right3==false && right4==false){
    			System.out.print("          |    |      |                |");
    		}else if(right1==false && right2 && right3==false && right4){
    			System.out.print("          |    |      |                |");
    		}else if(right1==false && right2 && right3==false && right4==false){
    			System.out.print("          |    |      |                |");
    		}else{
    			System.out.print("                      |                |");
    		}
    		if(left1 && left2 && left3){
    			System.out.print("|                |      |    |/         ");
    		}else if(left1==false && left2 && left3){
    			System.out.print("|                |      |    |/         ");
    		}else if(left1==false && left2==false && left3){
    			System.out.print("|                |-----------|/         ");
    		}else if(left1 && left2==false && left3){
    			System.out.print("|                |      |----|/         ");
    		}else if(left1 && left2==false && left3==false && left4){
    			System.out.print("|                |      |               ");
    		}else if(left1 && left2==false && left3==false && left4==false){
    			System.out.print("|                |      |               ");
    		}else if(left1 && left2 && left3==false && left4){
    			System.out.print("|                |      |    |          ");
    		}else if(left1 && left2 && left3==false && left4==false){
    			System.out.print("|                |      |    |          ");
    		}else if(left1==false && left2 && left3==false && left4){
    			System.out.print("|                |      |    |          ");
    		}else if(left1==false && left2 && left3==false && left4==false){
    			System.out.print("|                |      |    |          ");
    		}else{
    			System.out.print("|                |                      ");
    		}
    		if(right1 && right2 && right3){
    			System.out.print("         \\|    |      |                |");
    		}else if(right1==false && right2 && right3){
    			System.out.print("         \\|    |      |                |");
    		}else if(right1==false && right2==false && right3){
    			System.out.print("         \\|-----------|                |");
    		}else if(right1 && right2==false && right3){
    			System.out.print("         \\|----|      |                |");
    		}else if(right1 && right2==false && right3==false && right4){
    			System.out.print("               |      |                |");
    		}else if(right1 && right2==false && right3==false && right4==false){
    			System.out.print("               |      |                |");
    		}else if(right1 && right2 && right3==false && right4){
    			System.out.print("          |    |      |                |");
    		}else if(right1 && right2 && right3==false && right4==false){
    			System.out.print("          |    |      |                |");
    		}else if(right1==false && right2 && right3==false && right4){
    			System.out.print("          |    |      |                |");
    		}else if(right1==false && right2 && right3==false && right4==false){
    			System.out.print("          |    |      |                |");
    		}else{
    			System.out.print("                      |                |");
    		}
    		if(left1==false && left2){
    			System.out.print("|                |      |   /           ");
    		}else if(left1 && left2){
    			System.out.print("|                |      |   /           ");
    		}else if(left1 && left2==false){
    			System.out.print("|                |      |               ");
    		}else{
    			System.out.print("|                |                      ");
    		}
    		if(right1==false && right2){
    			System.out.print("           \\   |      |                |");
    		}else if(right1 && right2){
    			System.out.print("           \\   |      |                |");
    		}else if(right1 && right2==false){
    			System.out.print("               |      |                |");
    		}else{
    			System.out.print("                      |                |");
    		}
    		if(left1==false && left2){
    			System.out.print("|                |      | /             ");
    		}else if(left1 && left2){
    			System.out.print("|                |      | /             ");
    		}else if(left1 && left2==false){
    			System.out.print("|                |      |               ");
    		}else{
    			System.out.print("|                |                      ");
    		}
    		if(right1==false && right2){
    			System.out.print("             \\ |      |                |");
    		}else if(right1 && right2){
    			System.out.print("             \\ |      |                |");
    		}else if(right1 && right2==false){
    			System.out.print("               |      |                |");
    		}else{
    			System.out.print("                      |                |");
    		}
    		if(left1==false && left2){
    			System.out.print("|                |------/               ");
    		}else if(left1 && left2){
    			System.out.print("|                |      /               ");
    		}else if(left1 && left2==false){
    			System.out.print("|                |      /               ");
    		}else{
    			System.out.print("|                |                      ");
    		}
    		if(right1==false && right2){
    			System.out.print("               \\------|                |");
    		}else if(right1 && right2){
    			System.out.print("               \\      |                |");
    		}else if(right1 && right2==false){
    			System.out.print("               \\      |                |");
    		}else{
    			System.out.print("                      |                |");
    		}
    	}
		if(left1){
			System.out.print("|                |    /                 ");
		}else{
			System.out.print("|                |                      ");
		}
		if(right1){
			System.out.print("                 \\    |                |");
		}else{
			System.out.print("                      |                |");
		}
		if(left1){
			System.out.print("|                |  /                   ");
		}else{
			System.out.print("|                |                      ");
		}
		if(right1){
			System.out.print("                   \\  |                |");
		}else{
			System.out.print("                      |                |");
		}
    	System.out.print("+----------------+--------------------------------------------+----------------+");
	}

	public static int dirChange(int direction, String command){
		if(command.equalsIgnoreCase("a")){
			switch(direction){
				case 2: direction = 6; break;
				case 4: direction = 2; break;
				case 6: direction = 8; break;
				case 8: direction = 4; break;
			}
		}else if(command.equalsIgnoreCase("d")){
			switch(direction){
				case 2: direction = 4; break;
				case 4: direction = 8; break;
				case 6: direction = 2; break;
				case 8: direction = 6; break;
			}
		}
		return(direction);
	}

	public static void cls(){
		System.out.println();
		String line = "                                                                                ";
		for(int i=0; i<26; i++){
			System.out.print(line);
		}
	}

	public static void youLose(){
		Scanner input = new Scanner(System.in);
		cls();
		System.out.print("==YOU LOSE==");
		input.nextLine();
		System.out.println();
		System.exit(0);
	}

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("If you are testing, enter \"test\", if not, enter \"level\": ");
		String mapChoice = input.nextLine();
		String mapString = null;
		try{
			Scanner fileIn = new Scanner(new FileInputStream(mapChoice+".txt"));
			mapString = fileIn.nextLine();
			fileIn.close();
		}catch(IOException e){
			System.out.println("IO");
		}
		String[] mapArray = mapString.split("!");
		int[] map = new int[1247];
		for(int i=0; i<mapArray.length; i++){
			map[i] = Integer.parseInt(mapArray[i]);
		}
		int random;
		int ghostsRemaining;
		if(mapChoice.equalsIgnoreCase("test")){
			ghostsRemaining=3;
		}else{
			ghostsRemaining=20;
		}
		int recharge = 0;
		int playerPos = 176;
		int direction = 2;
		int row = 43;
		int[] enemyPos = new int[ghostsRemaining];
		if(mapChoice.equalsIgnoreCase("test")){
			enemyPos[0]=playerPos+row;
			enemyPos[1]=playerPos+(2*row)+2;
			enemyPos[2]=playerPos+4;
		}else{
			for(int i=0; i<enemyPos.length; i++){
				random = (int)(Math.random()*1247);
				if(map[random]==0){
					enemyPos[i]=random;
				}else{
					i--;
				}
			}
		}
		boolean showGhosts = false;
		cls();
		System.out.println("--How to play--\n");
		System.out.println("-Use W, A and D to move forward and turn left/right");
		System.out.println("-Enter \"Map\" to see a map of your surroundings");
		System.out.println("	-This map cannot see ghosts");
		System.out.println("-Enter \"Catch\" to catch a ghost in front of you");
		System.out.println("-Enter \"Scan\" to detect the number of ghosts in your area");
		System.out.println("-Enter \"Full Scan\" to see a map + surrounding ghosts");
		System.out.println("	-Using this requires a recharge every time");
		System.out.println("	-Walk around to recharge your scanner\n");
		System.out.print("PRESS ENTER TO START");
		input.nextLine();
		cls();
		while(ghostsRemaining>0){
			System.out.print("Direction: ");
			switch(direction){
				case 2: System.out.println("South"); break;
				case 4: System.out.println("West"); break;
				case 6: System.out.println("East"); break;
				case 8: System.out.println("North"); break;
			}
			System.out.print("Ghosts Remaining: ");
			System.out.println(ghostsRemaining);
			map[playerPos]=2;
			display(playerPos, direction, map, row);
			System.out.print("Move: ");
			String command = input.nextLine();
			if(command.equalsIgnoreCase("w")){
				switch(direction){
					case 2: if(map[playerPos+row]==0 || map[playerPos+row]==3){
						for(int i=0; i<enemyPos.length; i++){
							if(playerPos==enemyPos[i]){
								youLose();
							}
						}
						map[playerPos]=0;
						playerPos+=row;
						map[playerPos]=2;
						recharge--;
						if(recharge<0){
							recharge=0;
						}
					} break;
					case 4: if(map[playerPos-1]==0 || map[playerPos-1]==3){
						for(int i=0; i<enemyPos.length; i++){
							if(playerPos==enemyPos[i]){
								youLose();
							}
						}
						map[playerPos]=0;
						playerPos-=1;
						map[playerPos]=2;
						recharge--;
						if(recharge<0){
							recharge=0;
						}
					} break;
					case 6: if(map[playerPos+1]==0 || map[playerPos+1]==3){
						for(int i=0; i<enemyPos.length; i++){
							if(playerPos==enemyPos[i]){
								youLose();
							}
						}
						map[playerPos]=0;
						playerPos+=1;
						map[playerPos]=2;
						recharge--;
						if(recharge<0){
							recharge=0;
						}
					} break;
					case 8: if(map[playerPos-row]==0 || map[playerPos-row]==3){
						for(int i=0; i<enemyPos.length; i++){
							if(playerPos==enemyPos[i]){
								youLose();
							}
						}
						map[playerPos]=0;
						playerPos-=row;
						map[playerPos]=2;
						recharge--;
						if(recharge<0){
							recharge=0;
						}
					} break;
				}
			}else if(command.equalsIgnoreCase("a")){
				direction = dirChange(direction, command);
			}else if(command.equalsIgnoreCase("d")){
				direction = dirChange(direction, command);
			}else if(command.equalsIgnoreCase("quit")){
				cls();
				System.exit(0);
			}else if(command.equalsIgnoreCase("catch")){
				for(int i=0; i<enemyPos.length; i++){
					if(direction==2){
						if(playerPos+row==enemyPos[i] || playerPos+(2*row)==enemyPos[i] || playerPos+(3*row)==enemyPos[i] || playerPos+(4*row)==enemyPos[i]){
							cls();
							System.out.print("Ghost caught!");
							map[enemyPos[i]]=0;
							enemyPos[i]=14-ghostsRemaining;
							ghostsRemaining--;
							input.nextLine();
						}
					}else if(direction==4){
						if(playerPos-1==enemyPos[i] || playerPos-2==enemyPos[i] || playerPos-3==enemyPos[i] || playerPos-4==enemyPos[i]){
							cls();
							System.out.print("Ghost caught!");
							map[enemyPos[i]]=0;
							enemyPos[i]=14-ghostsRemaining;
							ghostsRemaining--;
							input.nextLine();
						}
					}else if(direction==6){
						if(playerPos+1==enemyPos[i] || playerPos+2==enemyPos[i] || playerPos+3==enemyPos[i] || playerPos+4==enemyPos[i]){
							cls();
							System.out.print("Ghost caught!");
							map[enemyPos[i]]=0;
							enemyPos[i]=20-ghostsRemaining;
							ghostsRemaining--;
							input.nextLine();
						}
					}else if(direction==8){
						if(playerPos-row==3 || playerPos-(2*row)==3 || playerPos-(3*row)==3 || playerPos-(4*row)==3){
							cls();
							System.out.print("Ghost caught!");
							map[enemyPos[i]]=0;
							enemyPos[i]=14-ghostsRemaining;
							ghostsRemaining--;
							input.nextLine();
						}
					}
				}
			}

			//Enemy Movement
			for(int i=0; i<enemyPos.length; i++){
				if(enemyPos[i]>50){
					map[enemyPos[i]]=3;
					if(mapChoice.equalsIgnoreCase("test")){
						random=5;
					}else{
						random = 1+(int)(Math.random()*5);
					}
					if(random==1){
						if(enemyPos[i]-row==0){
							map[enemyPos[i]]=0;
							enemyPos[i]-=row;
							map[enemyPos[i]]=3;
						}else{
							i--;
							continue;
						}
					}else if(random==2){
						if(enemyPos[i]+1==0){
							map[enemyPos[i]]=0;
							enemyPos[i]+=1;
							map[enemyPos[i]]=3;
						}else{
							i--;
							continue;
						}
					}else if(random==3){
						if(enemyPos[i]-1==0){
							map[enemyPos[i]]=0;
							enemyPos[i]-=1;
							map[enemyPos[i]]=3;
						}else{
							i--;
							continue;
						}
					}else if(random==4){
						if(enemyPos[i]+row==0){
							map[enemyPos[i]]=0;
							enemyPos[i]+=row;
							map[enemyPos[i]]=3;
						}else{
							i--;
							continue;
						}
					}else{
						map[enemyPos[i]]=3;
					}
					if(enemyPos[i]==playerPos){
						youLose();
					}
				}
			}

			if(command.equalsIgnoreCase("full scan") && recharge==0 || command.equalsIgnoreCase("map")){
				map[playerPos]=2;
				if(command.equalsIgnoreCase("full scan")){
					recharge=5;
					showGhosts=true;
				}else{
					showGhosts=false;
				}
				cls();
				for(int i=playerPos-(4*row)-4; i<=playerPos-(4*row)+4; i++){
					switch(map[i]){
						case 0: System.out.print(" "); break;
						case 1: System.out.print("#"); break;
						case 3: if(showGhosts){
							System.out.print("G");
						}else{
							System.out.print(" ");
						} break;
						case 9: System.out.print("#"); break;
					}
				}
				System.out.println();
				for(int i=playerPos-(3*row)-4; i<=playerPos-(3*row)+4; i++){
					switch(map[i]){
						case 0: System.out.print(" "); break;
						case 1: System.out.print("#"); break;
						case 3: if(showGhosts){
							System.out.print("G");
						}else{
							System.out.print(" ");
						} break;
						case 9: System.out.print("#"); break;
					}
				}
				System.out.println();
				for(int i=playerPos-(2*row)-4; i<=playerPos-(2*row)+4; i++){
					switch(map[i]){
						case 0: System.out.print(" "); break;
						case 1: System.out.print("#"); break;
						case 3: if(showGhosts){
							System.out.print("G");
						}else{
							System.out.print(" ");
						} break;
						case 9: System.out.print("#"); break;
					}
				}
				System.out.println();
				for(int i=playerPos-(row)-4; i<=playerPos-(row)+4; i++){
					switch(map[i]){
						case 0: System.out.print(" "); break;
						case 1: System.out.print("#"); break;
						case 3: if(showGhosts){
							System.out.print("G");
						}else{
							System.out.print(" ");
						} break;
						case 9: System.out.print("#"); break;
					}
				}
				System.out.println();
				for(int i=playerPos-4; i<=playerPos+4; i++){
					switch(map[i]){
						case 0: System.out.print(" "); break;
						case 1: System.out.print("#"); break;
						case 2: if(direction==2){
							System.out.print("V");
							break;
						}else if(direction==4){
							System.out.print("<");
							break;
						}else if(direction==6){
							System.out.print(">");
							break;
						}else if(direction==8){
							System.out.print("^");
							break;
						}
						case 3: if(showGhosts){
							System.out.print("G");
						}else{
							System.out.print(" ");
						} break;
						case 9: System.out.print("#"); break;
					}
				}
				System.out.println();
				for(int i=playerPos+(row)-4; i<=playerPos+(row)+4; i++){
					switch(map[i]){
						case 0: System.out.print(" "); break;
						case 1: System.out.print("#"); break;
						case 3: if(showGhosts){
							System.out.print("G");
						}else{
							System.out.print(" ");
						} break;
						case 9: System.out.print("#"); break;
					}
				}
				System.out.println();
				for(int i=playerPos+(2*row)-4; i<=playerPos+(2*row)+4; i++){
					switch(map[i]){
						case 0: System.out.print(" "); break;
						case 1: System.out.print("#"); break;
						case 3: if(showGhosts){
							System.out.print("G");
						}else{
							System.out.print(" ");
						} break;
						case 9: System.out.print("#"); break;
					}
				}
				System.out.println();
				for(int i=playerPos+(3*row)-4; i<=playerPos+(3*row)+4; i++){
					switch(map[i]){
						case 0: System.out.print(" "); break;
						case 1: System.out.print("#"); break;
						case 3: if(showGhosts){
							System.out.print("G");
						}else{
							System.out.print(" ");
						} break;
						case 9: System.out.print("#"); break;
					}
				}
				System.out.println();
				for(int i=playerPos+(4*row)-4; i<=playerPos+(4*row)+4; i++){
					switch(map[i]){
						case 0: System.out.print(" "); break;
						case 1: System.out.print("#"); break;
						case 3: if(showGhosts){
							System.out.print("G");
						}else{
							System.out.print(" ");
						} break;
						case 9: System.out.print("#"); break;
					}
				}
				map[playerPos]=0;
				input.nextLine();
			}else if(command.equalsIgnoreCase("full scan") && recharge!=0){
				cls();
				System.out.print("Your pack must recharge!");
				input.nextLine();
			}else if(command.equalsIgnoreCase("scan")){
				cls();
				int nearbyGhosts=0;
				for(int i=playerPos-(4*row)-4; i<=playerPos-(4*row)+4; i++){
					if(map[i]==3){
						nearbyGhosts++;
					}
				}
				for(int i=playerPos-(3*row)-4; i<=playerPos-(3*row)+4; i++){
					if(map[i]==3){
						nearbyGhosts++;
					}
				}
				for(int i=playerPos-(2*row)-4; i<=playerPos-(2*row)+4; i++){
					if(map[i]==3){
						nearbyGhosts++;
					}
				}
				for(int i=playerPos-(row)-4; i<=playerPos-(row)+4; i++){
					if(map[i]==3){
						nearbyGhosts++;
					}
				}
				for(int i=playerPos-4; i<=playerPos+4; i++){
					if(map[i]==3){
						nearbyGhosts++;
					}
				}
				for(int i=playerPos+(row)-4; i<=playerPos+(row)+4; i++){
					if(map[i]==3){
						nearbyGhosts++;
					}
				}
				for(int i=playerPos+(2*row)-4; i<=playerPos+(2*row)+4; i++){
					if(map[i]==3){
						nearbyGhosts++;
					}
				}
				for(int i=playerPos+(3*row)-4; i<=playerPos+(3*row)+4; i++){
					if(map[i]==3){
						nearbyGhosts++;
					}
				}
				for(int i=playerPos+(4*row)-4; i<=playerPos+(4*row)+4; i++){
					if(map[i]==3){
						nearbyGhosts++;
					}
				}
				System.out.print("Number of Ghosts Nearby: "+nearbyGhosts);
				input.nextLine();
				System.out.println();
			}
		}
		cls();
		System.out.print("==You Win!==");
		input.nextLine();
		System.out.println();
		System.exit(0);
	}
}