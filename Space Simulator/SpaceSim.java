import java.util.*;
import java.io.*;

public class SpaceSim{
	
	public static boolean sectorCheck(int[] sector1, int[] sector2, int[] sector3, int[] sector4, int[] sector5, int[] sector6, int[] sector7, int[] sector8, int[] sector9, int[] sector10, int[] sector11, int[] sector12, int[] sector13, int[] sector14, int[] sector15, int[] sector16, int sector){
		boolean enemies = false;
		for(int i=0; i<64; i++){
			if(sector==1 && sector1[i]==2){
				enemies=true;
				break;
			}else if(sector==2 && sector2[i]==2){
				enemies=true;
				break;
			}else if(sector==3 && sector3[i]==2){
				enemies=true;
				break;
			}else if(sector==4 && sector4[i]==2){
				enemies=true;
				break;
			}else if(sector==5 && sector5[i]==2){
				enemies=true;
				break;
			}else if(sector==6 && sector6[i]==2){
				enemies=true;
				break;
			}else if(sector==7 && sector7[i]==2){
				enemies=true;
				break;
			}else if(sector==8 && sector8[i]==2){
				enemies=true;
				break;
			}else if(sector==9 && sector9[i]==2){
				enemies=true;
				break;
			}else if(sector==10 && sector10[i]==2){
				enemies=true;
				break;
			}else if(sector==11 && sector11[i]==2){
				enemies=true;
				break;
			}else if(sector==12 && sector12[i]==2){
				enemies=true;
				break;
			}else if(sector==13 && sector13[i]==2){
				enemies=true;
				break;
			}else if(sector==14 && sector14[i]==2){
				enemies=true;
				break;
			}else if(sector==15 && sector15[i]==2){
				enemies=true;
				break;
			}else if(sector==16 && sector16[i]==2){
				enemies=true;
				break;
			}
		}
		return(enemies);
	}
	
	public static int coordinateCheck(int[] sector1, int[] sector2, int[] sector3, int[] sector4, int[] sector5, int[] sector6, int[] sector7, int[] sector8, int[] sector9, int[] sector10, int[] sector11, int[] sector12, int[] sector13, int[] sector14, int[] sector15, int[] sector16, int sector, int space){
		int type=0;
		if(sector==1){
			switch(sector1[space]){
				case 0: type=0; break;
				case 1: type=1; break;
				case 2: type=2; break;
				case 3: type=3; break;
				case 4: type=4; break;
				case 5: type=5; break;
			}
		}else if(sector==2){
			switch(sector2[space]){
				case 0: type=0; break;
				case 1: type=1; break;
				case 2: type=2; break;
				case 3: type=3; break;
				case 4: type=4; break;
				case 5: type=5; break;
			}
		}else if(sector==3){
			switch(sector3[space]){
				case 0: type=0; break;
				case 1: type=1; break;
				case 2: type=2; break;
				case 3: type=3; break;
				case 4: type=4; break;
				case 5: type=5; break;
			}
		}else if(sector==4){
			switch(sector4[space]){
				case 0: type=0; break;
				case 1: type=1; break;
				case 2: type=2; break;
				case 3: type=3; break;
				case 4: type=4; break;
				case 5: type=5; break;
			}
		}else if(sector==5){
			switch(sector5[space]){
				case 0: type=0; break;
				case 1: type=1; break;
				case 2: type=2; break;
				case 3: type=3; break;
				case 4: type=4; break;
				case 5: type=5; break;
			}
		}else if(sector==6){
			switch(sector6[space]){
				case 0: type=0; break;
				case 1: type=1; break;
				case 2: type=2; break;
				case 3: type=3; break;
				case 4: type=4; break;
				case 5: type=5; break;
			}
		}else if(sector==7){
			switch(sector7[space]){
				case 0: type=0; break;
				case 1: type=1; break;
				case 2: type=2; break;
				case 3: type=3; break;
				case 4: type=4; break;
				case 5: type=5; break;
			}
		}else if(sector==8){
			switch(sector8[space]){
				case 0: type=0; break;
				case 1: type=1; break;
				case 2: type=2; break;
				case 3: type=3; break;
				case 4: type=4; break;
				case 5: type=5; break;
			}
		}else if(sector==9){
			switch(sector9[space]){
				case 0: type=0; break;
				case 1: type=1; break;
				case 2: type=2; break;
				case 3: type=3; break;
				case 4: type=4; break;
				case 5: type=5; break;
			}
		}else if(sector==10){
			switch(sector10[space]){
				case 0: type=0; break;
				case 1: type=1; break;
				case 2: type=2; break;
				case 3: type=3; break;
				case 4: type=4; break;
				case 5: type=5; break;
			}
		}else if(sector==11){
			switch(sector11[space]){
				case 0: type=0; break;
				case 1: type=1; break;
				case 2: type=2; break;
				case 3: type=3; break;
				case 4: type=4; break;
				case 5: type=5; break;
			}
		}else if(sector==12){
			switch(sector12[space]){
				case 0: type=0; break;
				case 1: type=1; break;
				case 2: type=2; break;
				case 3: type=3; break;
				case 4: type=4; break;
				case 5: type=5; break;
			}
		}else if(sector==13){
			switch(sector13[space]){
				case 0: type=0; break;
				case 1: type=1; break;
				case 2: type=2; break;
				case 3: type=3; break;
				case 4: type=4; break;
				case 5: type=5; break;
			}
		}else if(sector==14){
			switch(sector14[space]){
				case 0: type=0; break;
				case 1: type=1; break;
				case 2: type=2; break;
				case 3: type=3; break;
				case 4: type=4; break;
				case 5: type=5; break;
			}
		}else if(sector==15){
			switch(sector15[space]){
				case 0: type=0; break;
				case 1: type=1; break;
				case 2: type=2; break;
				case 3: type=3; break;
				case 4: type=4; break;
				case 5: type=5; break;
			}
		}else if(sector==16){
			switch(sector16[space]){
				case 0: type=0; break;
				case 1: type=1; break;
				case 2: type=2; break;
				case 3: type=3; break;
				case 4: type=4; break;
				case 5: type=5; break;
			}
		}
		return(type);
	}
	
	/*
	 *This method displays the short range scan screen of your sector
	 */
	public static void sectorDisplay(int[] sector1, int[] sector2, int[] sector3, int[] sector4, int[] sector5, int[] sector6, int[] sector7, int[] sector8, int[] sector9, int[] sector10, int[] sector11, int[] sector12, int[] sector13, int[] sector14, int[] sector15, int[] sector16, int sector, int enemiesRequired){
		System.out.println();
		System.out.println("   1  2  3  4  5  6  7  8");
		for(int i=0; i<64; i++){
			if(i==0){
				System.out.print("1 ");
			}else if(i==8){
				System.out.print("2 ");
			}else if(i==16){
				System.out.print("3 ");
			}else if(i==24){
				System.out.print("4 ");
			}else if(i==32){
				System.out.print("5 ");
			}else if(i==40){
				System.out.print("6 ");
			}else if(i==48){
				System.out.print("7 ");
			}else if(i==56){
				System.out.print("8 ");
			}
			if(sector==1){
				if(sector1[i]==0){
					System.out.print(" * ");
				}else if(sector1[i]==1){
					System.out.print(" . ");
				}else if(sector1[i]==2){
					System.out.print("-E-");
				}else if(sector1[i]==3){
					System.out.print("-S-");
				}else if(sector1[i]==4){
					System.out.print("-P-");
				}else if(sector1[i]==5){
					System.out.print(" * ");
				}
			}else if(sector==2){
				if(sector2[i]==0){
					System.out.print(" * ");
				}else if(sector2[i]==1){
					System.out.print(" . ");
				}else if(sector2[i]==2){
					System.out.print("-E-");
				}else if(sector2[i]==3){
					System.out.print("-S-");
				}else if(sector2[i]==4){
					System.out.print("-P-");
				}else if(sector2[i]==5){
					System.out.print(" * ");
				}
			}else if(sector==3){
				if(sector3[i]==0){
					System.out.print(" * ");
				}else if(sector3[i]==1){
					System.out.print(" . ");
				}else if(sector3[i]==2){
					System.out.print("-E-");
				}else if(sector3[i]==3){
					System.out.print("-S-");
				}else if(sector3[i]==4){
					System.out.print("-P-");
				}else if(sector3[i]==5){
					System.out.print(" * ");
				}
			}else if(sector==4){
				if(sector4[i]==0){
					System.out.print(" * ");
				}else if(sector4[i]==1){
					System.out.print(" . ");
				}else if(sector4[i]==2){
					System.out.print("-E-");
				}else if(sector4[i]==3){
					System.out.print("-S-");
				}else if(sector4[i]==4){
					System.out.print("-P-");
				}else if(sector4[i]==5){
					System.out.print(" * ");
				}
			}else if(sector==5){
				if(sector5[i]==0){
					System.out.print(" * ");
				}else if(sector5[i]==1){
					System.out.print(" . ");
				}else if(sector5[i]==2){
					System.out.print("-E-");
				}else if(sector5[i]==3){
					System.out.print("-S-");
				}else if(sector5[i]==4){
					System.out.print("-P-");
				}else if(sector5[i]==5){
					System.out.print(" * ");
				}
			}else if(sector==6){
				if(sector6[i]==0){
					System.out.print(" * ");
				}else if(sector6[i]==1){
					System.out.print(" . ");
				}else if(sector6[i]==2){
					System.out.print("-E-");
				}else if(sector6[i]==3){
					System.out.print("-S-");
				}else if(sector6[i]==4){
					System.out.print("-P-");
				}else if(sector6[i]==5){
					System.out.print(" * ");
				}
			}else if(sector==7){
				if(sector7[i]==0){
					System.out.print(" * ");
				}else if(sector7[i]==1){
					System.out.print(" . ");
				}else if(sector7[i]==2){
					System.out.print("-E-");
				}else if(sector7[i]==3){
					System.out.print("-S-");
				}else if(sector7[i]==4){
					System.out.print("-P-");
				}else if(sector7[i]==5){
					System.out.print(" * ");
				}
			}else if(sector==8){
				if(sector8[i]==0){
					System.out.print(" * ");
				}else if(sector8[i]==1){
					System.out.print(" . ");
				}else if(sector8[i]==2){
					System.out.print("-E-");
				}else if(sector8[i]==3){
					System.out.print("-S-");
				}else if(sector8[i]==4){
					System.out.print("-P-");
				}else if(sector8[i]==5){
					System.out.print(" * ");
				}
			}else if(sector==9){
				if(sector9[i]==0){
					System.out.print(" * ");
				}else if(sector9[i]==1){
					System.out.print(" . ");
				}else if(sector9[i]==2){
					System.out.print("-E-");
				}else if(sector9[i]==3){
					System.out.print("-S-");
				}else if(sector9[i]==4){
					System.out.print("-P-");
				}else if(sector9[i]==5){
					System.out.print(" * ");
				}
			}else if(sector==10){
				if(sector10[i]==0){
					System.out.print(" * ");
				}else if(sector10[i]==1){
					System.out.print(" . ");
				}else if(sector10[i]==2){
					System.out.print("-E-");
				}else if(sector10[i]==3){
					System.out.print("-S-");
				}else if(sector10[i]==4){
					System.out.print("-P-");
				}else if(sector10[i]==5){
					System.out.print(" * ");
				}
			}else if(sector==11){
				if(sector11[i]==0){
					System.out.print(" * ");
				}else if(sector11[i]==1){
					System.out.print(" . ");
				}else if(sector11[i]==2){
					System.out.print("-E-");
				}else if(sector11[i]==3){
					System.out.print("-S-");
				}else if(sector11[i]==4){
					System.out.print("-P-");
				}else if(sector11[i]==5){
					System.out.print(" * ");
				}
			}else if(sector==12){
				if(sector12[i]==0){
					System.out.print(" * ");
				}else if(sector12[i]==1){
					System.out.print(" . ");
				}else if(sector12[i]==2){
					System.out.print("-E-");
				}else if(sector12[i]==3){
					System.out.print("-S-");
				}else if(sector12[i]==4){
					System.out.print("-P-");
				}else if(sector12[i]==5){
					System.out.print(" * ");
				}
			}else if(sector==13){
				if(sector13[i]==0){
					System.out.print(" * ");
				}else if(sector13[i]==1){
					System.out.print(" . ");
				}else if(sector13[i]==2){
					System.out.print("-E-");
				}else if(sector13[i]==3){
					System.out.print("-S-");
				}else if(sector13[i]==4){
					System.out.print("-P-");
				}else if(sector13[i]==5){
					System.out.print(" * ");
				}
			}else if(sector==14){
				if(sector14[i]==0){
					System.out.print(" * ");
				}else if(sector14[i]==1){
					System.out.print(" . ");
				}else if(sector14[i]==2){
					System.out.print("-E-");
				}else if(sector14[i]==3){
					System.out.print("-S-");
				}else if(sector14[i]==4){
					System.out.print("-P-");
				}else if(sector14[i]==5){
					System.out.print(" * ");
				}
			}else if(sector==15){
				if(sector15[i]==0){
					System.out.print(" * ");
				}else if(sector15[i]==1){
					System.out.print(" . ");
				}else if(sector15[i]==2){
					System.out.print("-E-");
				}else if(sector15[i]==3){
					System.out.print("-S-");
				}else if(sector15[i]==4){
					System.out.print("-P-");
				}else if(sector15[i]==5){
					System.out.print(" * ");
				}
			}else if(sector==16){
				if(sector16[i]==0){
					System.out.print(" * ");
				}else if(sector16[i]==1){
					System.out.print(" . ");
				}else if(sector16[i]==2){
					System.out.print("-E-");
				}else if(sector16[i]==3){
					System.out.print("-S-");
				}else if(sector16[i]==4){
					System.out.print("-P-");
				}else if(sector16[i]==5){
					System.out.print(" * ");
				}
			}
			if(i==7){
				System.out.println(" 1   Current Sector: "+sector);
			}else if(i==15){
				System.out.println(" 2   Enemies Left: "+enemiesRequired);
			}else if(i==23){
				System.out.println(" 3");
			}else if(i==31){
				System.out.println(" 4");
			}else if(i==39){
				System.out.println(" 5");
			}else if(i==47){
				System.out.println(" 6");
			}else if(i==55){
				System.out.println(" 7");
			}else if(i==63){
				System.out.println(" 8");
			}
		}
		System.out.println("   1  2  3  4  5  6  7  8");
		System.out.println();
	}
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int random;
		int turnsRemaining=0;
		int shieldTurns=0;
		int space=0;
		int coordinate=0;
		int energy = 100;
		int missles = 10;
		int shields = 3;
		int credits = 500;
		boolean targeted = false;
		boolean shielded =false;
		boolean sectorEnemies=true;
		/*
		 *CREATE SECTOR MAPS
		 */
		int[] sector1 = new int[64];
		int[] sector2 = new int[64];
		int[] sector3 = new int[64];
		int[] sector4 = new int[64];
		int[] sector5 = new int[64];
		int[] sector6 = new int[64];
		int[] sector7 = new int[64];
		int[] sector8 = new int[64];
		int[] sector9 = new int[64];
		int[] sector10 = new int[64];
		int[] sector11 = new int[64];
		int[] sector12 = new int[64];
		int[] sector13 = new int[64];
		int[] sector14 = new int[64];
		int[] sector15 = new int[64];
		int[] sector16 = new int[64];
		int enemiesRequired=10;
		int totalStations=0;
		int totalEnemies=0;
		int totalPlanets=0;
		int totalTrading=0;
		while(true){
			for(int i=0; i<64; i++){
				random=(int)(128*Math.random()+1);
				if(random>=1 && random<=16){
					sector1[i]=0; //Star
				}else if(random>=17 && random<=111){
					sector1[i]=1; //Blank space
				}else if(random>=112 && random<=121){
					sector1[i]=2; //Enemy
					totalEnemies+=1;
				}else if(random>=118 && random<=121){
					sector1[i]=3; //Space station
					totalStations+=1;
				}else if(random>=122 && random<=126){
					sector1[i]=4; //Planet
					totalPlanets+=1;
				}else{
					sector1[i]=5; //Trading 
					totalTrading+=1;
				}
			}
			for(int i=0; i<64; i++){
				random=(int)(128*Math.random()+1);
				if(random>=1 && random<=16){
					sector2[i]=0; //Star
				}else if(random>=17 && random<=111){
					sector2[i]=1; //Blank space
				}else if(random>=112 && random<=117){
					sector2[i]=2; //Enemy
					totalEnemies+=1;
				}else if(random>=118 && random<=121){
					sector2[i]=3; //Space station
					totalStations+=1;
				}else if(random>=122 && random<=126){
					sector2[i]=4; //Planet
					totalPlanets+=1;
				}else{
					sector2[i]=5; //Trading 
					totalTrading+=1;
				}
			}
			for(int i=0; i<64; i++){
				random=(int)(128*Math.random()+1);
				if(random>=1 && random<=16){
					sector3[i]=0; //Star
				}else if(random>=17 && random<=111){
					sector3[i]=1; //Blank space
				}else if(random>=112 && random<=117){
					sector3[i]=2; //Enemy
					totalEnemies+=1;
				}else if(random>=118 && random<=121){
					sector3[i]=3; //Space station
					totalStations+=1;
				}else if(random>=126 && random<=126){
					sector3[i]=4; //Planet
					totalPlanets+=1;
				}else{
					sector3[i]=5; //Trading 
					totalTrading+=1;
				}
			}
			for(int i=0; i<64; i++){
				random=(int)(128*Math.random()+1);
				if(random>=1 && random<=16){
					sector4[i]=0; //Star
				}else if(random>=17 && random<=111){
					sector4[i]=1; //Blank space
				}else if(random>=112 && random<=117){
					sector4[i]=2; //Enemy
					totalEnemies+=1;
				}else if(random>=118 && random<=121){
					sector4[i]=3; //Space station
					totalStations+=1;
				}else if(random>=122 && random<=126){
					sector4[i]=4; //Planet
					totalPlanets+=1;
				}else{
					sector4[i]=5; //Trading 
					totalTrading+=1;
				}
			}
			for(int i=0; i<64; i++){
				random=(int)(128*Math.random()+1);
				if(random>=1 && random<=16){
					sector5[i]=0; //Star
				}else if(random>=17 && random<=111){
					sector5[i]=1; //Blank space
				}else if(random>=112 && random<=117){
					sector5[i]=2; //Enemy
					totalEnemies+=1;
				}else if(random>=118 && random<=121){
					sector5[i]=3; //Space station
					totalStations+=1;
				}else if(random>=122 && random<=126){
					sector5[i]=4; //Planet
					totalPlanets+=1;
				}else{
					sector5[i]=5; //Trading 
					totalTrading+=1;
				}
			}
			for(int i=0; i<64; i++){
				random=(int)(128*Math.random()+1);
				if(random>=1 && random<=16){
					sector6[i]=0; //Star
				}else if(random>=17 && random<=111){
					sector6[i]=1; //Blank space
				}else if(random>=112 && random<=117){
					sector6[i]=2; //Enemy
					totalEnemies+=1;
				}else if(random>=118 && random<=121){
					sector6[i]=3; //Space station
					totalStations+=1;
				}else if(random>=122 && random<=126){
					sector6[i]=4; //Planet
					totalPlanets+=1;
				}else{
					sector6[i]=5; //Trading 
					totalTrading+=1;
				}
			}
			for(int i=0; i<64; i++){
				random=(int)(128*Math.random()+1);
				if(random>=1 && random<=16){
					sector7[i]=0; //Star
				}else if(random>=17 && random<=111){
					sector7[i]=1; //Blank space
				}else if(random>=112 && random<=117){
					sector7[i]=2; //Enemy
					totalEnemies+=1;
				}else if(random>=118 && random<=121){
					sector7[i]=3; //Space station
					totalStations+=1;
				}else if(random>=122 && random<=126){
					sector7[i]=4; //Planet
					totalPlanets+=1;
				}else{
					sector7[i]=5; //Trading 
					totalTrading+=1;
				}
			}
			for(int i=0; i<64; i++){
				random=(int)(128*Math.random()+1);
				if(random>=1 && random<=16){
					sector8[i]=0; //Star
				}else if(random>=17 && random<=111){
					sector8[i]=1; //Blank space
				}else if(random>=112 && random<=117){
					sector8[i]=2; //Enemy
					totalEnemies+=1;
				}else if(random>=118 && random<=121){
					sector8[i]=3; //Space station
					totalStations+=1;
				}else if(random>=122 && random<=126){
					sector8[i]=4; //Planet
					totalPlanets+=1;
				}else{
					sector8[i]=5; //Trading 
					totalTrading+=1;
				}
			}
			for(int i=0; i<64; i++){
				random=(int)(128*Math.random()+1);
				if(random>=1 && random<=16){
					sector9[i]=0; //Star
				}else if(random>=17 && random<=111){
					sector9[i]=1; //Blank space
				}else if(random>=112 && random<=117){
					sector9[i]=2; //Enemy
					totalEnemies+=1;
				}else if(random>=118 && random<=121){
					sector9[i]=3; //Space station
					totalStations+=1;
				}else if(random>=122 && random<=126){
					sector9[i]=4; //Planet
					totalPlanets+=1;
				}else{
					sector9[i]=5; //Trading 
					totalTrading+=1;
				}
			}
			for(int i=0; i<64; i++){
				random=(int)(128*Math.random()+1);
				if(random>=1 && random<=16){
					sector10[i]=0; //Star
				}else if(random>=17 && random<=111){
					sector10[i]=1; //Blank space
				}else if(random>=112 && random<=117){
					sector10[i]=2; //Enemy
					totalEnemies+=1;
				}else if(random>=118 && random<=121){
					sector10[i]=3; //Space station
					totalStations+=1;
				}else if(random>=122 && random<=126){
					sector10[i]=4; //Planet
					totalPlanets+=1;
				}else{
					sector10[i]=5; //Trading 
					totalTrading+=1;
				}
			}
			for(int i=0; i<64; i++){
				random=(int)(128*Math.random()+1);
				if(random>=1 && random<=16){
					sector11[i]=0; //Star
				}else if(random>=17 && random<=111){
					sector11[i]=1; //Blank space
				}else if(random>=112 && random<=117){
					sector11[i]=2; //Enemy
					totalEnemies+=1;
				}else if(random>=118 && random<=121){
					sector11[i]=3; //Space station
					totalStations+=1;
				}else if(random>=122 && random<=126){
					sector11[i]=4; //Planet
					totalPlanets+=1;
				}else{
					sector11[i]=5; //Trading 
					totalTrading+=1;
				}
			}
			for(int i=0; i<64; i++){
				random=(int)(128*Math.random()+1);
				if(random>=1 && random<=16){
					sector12[i]=0; //Star
				}else if(random>=17 && random<=111){
					sector12[i]=1; //Blank space
				}else if(random>=112 && random<=117){
					sector12[i]=2; //Enemy
					totalEnemies+=1;
				}else if(random>=118 && random<=121){
					sector12[i]=3; //Space station
					totalStations+=1;
				}else if(random>=122 && random<=126){
					sector12[i]=4; //Planet
					totalPlanets+=1;
				}else{
					sector12[i]=5; //Trading 
					totalTrading+=1;
				}
			}
			for(int i=0; i<64; i++){
				random=(int)(128*Math.random()+1);
				if(random>=1 && random<=16){
					sector13[i]=0; //Star
				}else if(random>=17 && random<=111){
					sector13[i]=1; //Blank space
				}else if(random>=112 && random<=117){
					sector13[i]=2; //Enemy
					totalEnemies+=1;
				}else if(random>=118 && random<=121){
					sector13[i]=3; //Space station
					totalStations+=1;
				}else if(random>=122 && random<=126){
					sector13[i]=4; //Planet
					totalPlanets+=1;
				}else{
					sector13[i]=5; //Trading 
					totalTrading+=1;
				}
			}
			for(int i=0; i<64; i++){
				random=(int)(128*Math.random()+1);
				if(random>=1 && random<=16){
					sector14[i]=0; //Star
				}else if(random>=17 && random<=111){
					sector14[i]=1; //Blank space
				}else if(random>=112 && random<=117){
					sector14[i]=2; //Enemy
					totalEnemies+=1;
				}else if(random>=118 && random<=121){
					sector14[i]=3; //Space station
					totalStations+=1;
				}else if(random>=122 && random<=126){
					sector14[i]=4; //Planet
					totalPlanets+=1;
				}else{
					sector14[i]=5; //Trading 
					totalTrading+=1;
				}
			}
			for(int i=0; i<64; i++){
				random=(int)(128*Math.random()+1);
				if(random>=1 && random<=16){
					sector15[i]=0; //Star
				}else if(random>=17 && random<=111){
					sector15[i]=1; //Blank space
				}else if(random>=112 && random<=117){
					sector15[i]=2; //Enemy
					totalEnemies+=1;
				}else if(random>=118 && random<=121){
					sector15[i]=3; //Space station
					totalStations+=1;
				}else if(random>=122 && random<=126){
					sector15[i]=4; //Planet
					totalPlanets+=1;
				}else{
					sector15[i]=5; //Trading 
					totalTrading+=1;
				}
			}
			for(int i=0; i<64; i++){
				random=(int)(128*Math.random()+1);
				if(random>=1 && random<=16){
					sector16[i]=0; //Star
				}else if(random>=17 && random<=111){
					sector16[i]=1; //Blank space
				}else if(random>=112 && random<=117){
					sector16[i]=2; //Enemy
					totalEnemies+=1;
				}else if(random>=118 && random<=121){
					sector16[i]=3; //Space station
					totalStations+=1;
				}else if(random>=122 && random<=126){
					sector16[i]=4; //Planet
					totalPlanets+=1;
				}else{
					sector16[i]=5; //Trading 
					totalTrading+=1;
				}
			}
			if(totalTrading<8 || totalPlanets<16 || totalStations<24){
				totalTrading=0;
				totalEnemies=0;
				totalPlanets=0;
				totalStations=0;
				continue;
			}else{
				break;
			}
		}
		System.out.println("World Generated");
		System.out.println();
		int sector = 1+(int)(Math.random()*16);
		while(true){
			sectorEnemies=sectorCheck(sector1, sector2, sector3, sector4, sector5, sector6, sector7, sector8, sector9, sector10, sector11, sector12, sector13, sector14, sector15, sector16, sector);
			if(sectorEnemies && targeted==false){
				random=1+(int)(Math.random()*10);
				if(random==5){
					targeted=true;
					System.out.println("Your ship has been targeted");
					System.out.println();
					turnsRemaining=2+(int)(Math.random()+5);
				}
			}else if(sectorEnemies==false){
				targeted=false;
			}else if(targeted && sectorEnemies){
				turnsRemaining-=1;
				if(turnsRemaining==0 && shielded==false){
					random=20+(int)(Math.random()*21);
					System.out.println("Your ship was struck by an enemy, doing "+random+" damage");
					System.out.println();
					energy-=random;
					if(energy<=0){
						System.out.println("-YOU LOSE-");
						System.exit(0);
					}
					targeted=false;
				}else if(shielded){
					System.out.println("An enemy attacked but was blocked by your shield");
					System.out.println();
				}
			}
			if(shielded){
				shieldTurns-=1;
				if(shieldTurns==0){
					shielded=false;
				}
			}
			System.out.println("Your ship is in Sector "+sector);
			System.out.print("->");
			String command = input.nextLine();
			if(command.equalsIgnoreCase("srs")){
				sectorDisplay(sector1, sector2, sector3, sector4, sector5, sector6, sector7, sector8, sector9, sector10, sector11, sector12, sector13, sector14, sector15, sector16, sector, enemiesRequired);
				continue;
			}else if(command.equalsIgnoreCase("lrs")){
				System.out.println();
				System.out.println("Total Planets: "+totalPlanets);
				System.out.println("Total Enemies: "+totalEnemies);
				System.out.println("Total Space Stations: "+totalStations);
				System.out.println();
				continue;
			}else if(command.equalsIgnoreCase("warp")){
				System.out.println();
				if(energy<20){
					System.out.println("Insufficient energy reserves");
					System.out.println();
					continue;
				}else{
					energy-=20;
				}
				System.out.print("Targeted Sector (1-16)->");
				int warp = input.nextInt();
				input.nextLine();
				if(warp>=1 && warp<=16){
					sector=warp;
				}else{
					System.out.println();
					System.out.println("Warping to random sector...");
					sector=1+(int)(Math.random()*16);
				}
				System.out.println();
				continue;
			}else if(command.equalsIgnoreCase("status")){
				System.out.println();
				System.out.println("Energy: "+energy);
				System.out.println("Credits: "+credits);
				System.out.println("Missles: "+missles);
				System.out.println("Shields: "+shields);
				System.out.println();
				continue;
			}else if(command.equalsIgnoreCase("engage")){
				System.out.println();
				if(energy<10){
					System.out.println("Insufficient energy reserves");
					System.out.println();
					continue;
				}else{
					energy-=20;
				}
				System.out.print("X-Coordinate->");
				int xCoordinate = input.nextInt();
				System.out.print("Y-Coordinate->");
				int yCoordinate = input.nextInt();
				input.nextLine();
				System.out.println();
				if(xCoordinate>8 || xCoordinate<1 || yCoordinate>8 || yCoordinate<1){
					System.out.println("These coordinates do not exist");
					System.out.println();
					continue;
				}else if(yCoordinate==1){
					switch(xCoordinate){
						case 1: space=0; break;
						case 2: space=1; break;
						case 3: space=2; break;
						case 4: space=3; break;
						case 5: space=4; break;
						case 6: space=5; break;
						case 7: space=6; break;
						case 8: space=7; break;
					}
				}else if(yCoordinate==2){
					switch(xCoordinate){
						case 1: space=8; break;
						case 2: space=9; break;
						case 3: space=10; break;
						case 4: space=11; break;
						case 5: space=12; break;
						case 6: space=13; break;
						case 7: space=14; break;
						case 8: space=15; break;
					}
				}else if(yCoordinate==3){
					switch(xCoordinate){
						case 1: space=16; break;
						case 2: space=17; break;
						case 3: space=18; break;
						case 4: space=19; break;
						case 5: space=20; break;
						case 6: space=21; break;
						case 7: space=22; break;
						case 8: space=23; break;
					}
				}else if(yCoordinate==4){
					switch(xCoordinate){
						case 1: space=24; break;
						case 2: space=25; break;
						case 3: space=26; break;
						case 4: space=27; break;
						case 5: space=28; break;
						case 6: space=29; break;
						case 7: space=30; break;
						case 8: space=31; break;
					}
				}else if(yCoordinate==5){
					switch(xCoordinate){
						case 1: space=32; break;
						case 2: space=33; break;
						case 3: space=34; break;
						case 4: space=35; break;
						case 5: space=36; break;
						case 6: space=37; break;
						case 7: space=38; break;
						case 8: space=39; break;
					}
				}else if(yCoordinate==6){
					switch(xCoordinate){
						case 1: space=40; break;
						case 2: space=41; break;
						case 3: space=42; break;
						case 4: space=43; break;
						case 5: space=44; break;
						case 6: space=45; break;
						case 7: space=46; break;
						case 8: space=47; break;
					}
				}else if(yCoordinate==7){
					switch(xCoordinate){
						case 1: space=48; break;
						case 2: space=49; break;
						case 3: space=50; break;
						case 4: space=51; break;
						case 5: space=52; break;
						case 6: space=53; break;
						case 7: space=54; break;
						case 8: space=55; break;
					}
				}else if(yCoordinate==8){
					switch(xCoordinate){
						case 1: space=56; break;
						case 2: space=57; break;
						case 3: space=58; break;
						case 4: space=59; break;
						case 5: space=60; break;
						case 6: space=61; break;
						case 7: space=62; break;
						case 8: space=63; break;
					}
				}
				coordinate=coordinateCheck(sector1, sector2, sector3, sector4, sector5, sector6, sector7, sector8, sector9, sector10, sector11, sector12, sector13, sector14, sector15, sector16, sector, space);
				if(coordinate!=2){
					System.out.println("There is no enemy here");
					System.out.println();
					continue;
				}
				int angle = (int)(Math.random()*91);
				int power = 1+(int)(Math.random()*10);
			//	System.out.println(angle+", "+power);
				System.out.print("Shot angle (0-90)->");
				int angleShot = input.nextInt();
				System.out.print("Shot power (1-10)->");
				int shotPower = input.nextInt();
				input.nextLine();
				System.out.println();
				if(angle-25<=angleShot && angleShot<=angle+25 && power-3<=shotPower && shotPower<=power+3 && missles>0){
					System.out.println("Your shot hit and the enemy ship exploded");
					credits += 25+(int)(Math.random()*26);
					missles-=1;
					switch(sector){
						case 1: sector1[space]=0; break;
						case 2: sector2[space]=0; break;
						case 3: sector3[space]=0; break;
						case 4: sector4[space]=0; break;
						case 5: sector5[space]=0; break;
						case 6: sector6[space]=0; break;
						case 7: sector7[space]=0; break;
						case 8: sector8[space]=0; break;
						case 9: sector9[space]=0; break;
						case 10: sector10[space]=0; break;
						case 11: sector11[space]=0; break;
						case 12: sector12[space]=0; break;
						case 13: sector13[space]=0; break;
						case 14: sector14[space]=0; break;
						case 15: sector15[space]=0; break;
						case 16: sector16[space]=0; break;
					}
					enemiesRequired-=1;
				}else if(missles<1){
					System.out.println("Your ship has no remaining missles");
				}else{
					System.out.println("Your shot missed");
					missles-=1;
				}
				if(enemiesRequired==0){
					System.out.println();
					System.out.println("-YOU WIN-");
					System.exit(0);
				}
				System.out.println();
				continue;
			}else if(command.equalsIgnoreCase("quit")){
				System.exit(0);
			}else if(command.equalsIgnoreCase("land")){
				System.out.println();
				if(energy<10){
					System.out.println("Insufficient energy reserves");
					System.out.println();
					continue;
				}else{
					energy-=20;
				}
				System.out.print("X-Coordinate->");
				int xCoordinate = input.nextInt();
				System.out.print("Y-Coordinate->");
				int yCoordinate = input.nextInt();
				input.nextLine();
				System.out.println();
				if(xCoordinate>8 || xCoordinate<1 || yCoordinate>8 || yCoordinate<1){
					System.out.println("These coordinates do not exist");
					System.out.println();
					continue;
				}else if(yCoordinate==1){
					switch(xCoordinate){
						case 1: space=0; break;
						case 2: space=1; break;
						case 3: space=2; break;
						case 4: space=3; break;
						case 5: space=4; break;
						case 6: space=5; break;
						case 7: space=6; break;
						case 8: space=7; break;
					}
				}else if(yCoordinate==2){
					switch(xCoordinate){
						case 1: space=8; break;
						case 2: space=9; break;
						case 3: space=10; break;
						case 4: space=11; break;
						case 5: space=12; break;
						case 6: space=13; break;
						case 7: space=14; break;
						case 8: space=15; break;
					}
				}else if(yCoordinate==3){
					switch(xCoordinate){
						case 1: space=16; break;
						case 2: space=17; break;
						case 3: space=18; break;
						case 4: space=19; break;
						case 5: space=20; break;
						case 6: space=21; break;
						case 7: space=22; break;
						case 8: space=23; break;
					}
				}else if(yCoordinate==4){
					switch(xCoordinate){
						case 1: space=24; break;
						case 2: space=25; break;
						case 3: space=26; break;
						case 4: space=27; break;
						case 5: space=28; break;
						case 6: space=29; break;
						case 7: space=30; break;
						case 8: space=31; break;
					}
				}else if(yCoordinate==5){
					switch(xCoordinate){
						case 1: space=32; break;
						case 2: space=33; break;
						case 3: space=34; break;
						case 4: space=35; break;
						case 5: space=36; break;
						case 6: space=37; break;
						case 7: space=38; break;
						case 8: space=39; break;
					}
				}else if(yCoordinate==6){
					switch(xCoordinate){
						case 1: space=40; break;
						case 2: space=41; break;
						case 3: space=42; break;
						case 4: space=43; break;
						case 5: space=44; break;
						case 6: space=45; break;
						case 7: space=46; break;
						case 8: space=47; break;
					}
				}else if(yCoordinate==7){
					switch(xCoordinate){
						case 1: space=48; break;
						case 2: space=49; break;
						case 3: space=50; break;
						case 4: space=51; break;
						case 5: space=52; break;
						case 6: space=53; break;
						case 7: space=54; break;
						case 8: space=55; break;
					}
				}else if(yCoordinate==8){
					switch(xCoordinate){
						case 1: space=56; break;
						case 2: space=57; break;
						case 3: space=58; break;
						case 4: space=59; break;
						case 5: space=60; break;
						case 6: space=61; break;
						case 7: space=62; break;
						case 8: space=63; break;
					}
				}
				coordinate=coordinateCheck(sector1, sector2, sector3, sector4, sector5, sector6, sector7, sector8, sector9, sector10, sector11, sector12, sector13, sector14, sector15, sector16, sector, space);
				if(coordinate!=4){
					System.out.println("There is no planet here");
					System.out.println();
					continue;
				}
				System.out.println("You have successfully landed on planet "+sector+"-"+space);
				System.out.println();
				random=1+(int)(Math.random()*8);
				switch(random){
					case 3: System.out.println("Your crew has found 50 units of energy"); energy+=50; break;
					case 4: System.out.println("Your crew has found 5 missles"); missles+=5; break;
					case 5: System.out.println("Your crew has found 75 credits"); credits+=75; break;
					default: System.out.println("Your crew found nothing of worth");
				}
				System.out.println();
				switch(sector){
					case 1: sector1[space]=0; break;
					case 2: sector2[space]=0; break;
					case 3: sector3[space]=0; break;
					case 4: sector4[space]=0; break;
					case 5: sector5[space]=0; break;
					case 6: sector6[space]=0; break;
					case 7: sector7[space]=0; break;
					case 8: sector8[space]=0; break;
					case 9: sector9[space]=0; break;
					case 10: sector10[space]=0; break;
					case 11: sector11[space]=0; break;
					case 12: sector12[space]=0; break;
					case 13: sector13[space]=0; break;
					case 14: sector14[space]=0; break;
					case 15: sector15[space]=0; break;
					case 16: sector16[space]=0; break;
				}
			}else if(command.equalsIgnoreCase("dock")){
				System.out.println();
				System.out.print("X-Coordinate->");
				int xCoordinate = input.nextInt();
				System.out.print("Y-Coordinate->");
				int yCoordinate = input.nextInt();
				input.nextLine();
				System.out.println();
				if(xCoordinate>8 || xCoordinate<1 || yCoordinate>8 || yCoordinate<1){
					System.out.println("These coordinates do not exist");
					System.out.println();
					continue;
				}else if(yCoordinate==1){
					switch(xCoordinate){
						case 1: space=0; break;
						case 2: space=1; break;
						case 3: space=2; break;
						case 4: space=3; break;
						case 5: space=4; break;
						case 6: space=5; break;
						case 7: space=6; break;
						case 8: space=7; break;
					}
				}else if(yCoordinate==2){
					switch(xCoordinate){
						case 1: space=8; break;
						case 2: space=9; break;
						case 3: space=10; break;
						case 4: space=11; break;
						case 5: space=12; break;
						case 6: space=13; break;
						case 7: space=14; break;
						case 8: space=15; break;
					}
				}else if(yCoordinate==3){
					switch(xCoordinate){
						case 1: space=16; break;
						case 2: space=17; break;
						case 3: space=18; break;
						case 4: space=19; break;
						case 5: space=20; break;
						case 6: space=21; break;
						case 7: space=22; break;
						case 8: space=23; break;
					}
				}else if(yCoordinate==4){
					switch(xCoordinate){
						case 1: space=24; break;
						case 2: space=25; break;
						case 3: space=26; break;
						case 4: space=27; break;
						case 5: space=28; break;
						case 6: space=29; break;
						case 7: space=30; break;
						case 8: space=31; break;
					}
				}else if(yCoordinate==5){
					switch(xCoordinate){
						case 1: space=32; break;
						case 2: space=33; break;
						case 3: space=34; break;
						case 4: space=35; break;
						case 5: space=36; break;
						case 6: space=37; break;
						case 7: space=38; break;
						case 8: space=39; break;
					}
				}else if(yCoordinate==6){
					switch(xCoordinate){
						case 1: space=40; break;
						case 2: space=41; break;
						case 3: space=42; break;
						case 4: space=43; break;
						case 5: space=44; break;
						case 6: space=45; break;
						case 7: space=46; break;
						case 8: space=47; break;
					}
				}else if(yCoordinate==7){
					switch(xCoordinate){
						case 1: space=48; break;
						case 2: space=49; break;
						case 3: space=50; break;
						case 4: space=51; break;
						case 5: space=52; break;
						case 6: space=53; break;
						case 7: space=54; break;
						case 8: space=55; break;
					}
				}else if(yCoordinate==8){
					switch(xCoordinate){
						case 1: space=56; break;
						case 2: space=57; break;
						case 3: space=58; break;
						case 4: space=59; break;
						case 5: space=60; break;
						case 6: space=61; break;
						case 7: space=62; break;
						case 8: space=63; break;
					}
				}
				coordinate=coordinateCheck(sector1, sector2, sector3, sector4, sector5, sector6, sector7, sector8, sector9, sector10, sector11, sector12, sector13, sector14, sector15, sector16, sector, space);
				if(coordinate!=3){
					System.out.println("There is no space station here");
					System.out.println();
					continue;
				}
				System.out.println("You have successfully docked");
				System.out.println();
				while(true){
					System.out.print("What would you like to purchase?->");
					String spaceStation = input.nextLine();
					System.out.println();
					if(spaceStation.equalsIgnoreCase("missles")){
						System.out.print("Missles cost 10 credits each, how many would you like to purchase?->");
						int misslesBought = input.nextInt();
						input.nextLine();
						System.out.println();
						if(misslesBought*10>credits){
							System.out.println("Insufficient funds");
							System.out.println();
							break;
						}else{
							System.out.println(misslesBought+" missles added to your ship");
							missles+=misslesBought;
							credits-=(misslesBought*10);
							System.out.println();
							break;
						}
					}else if(spaceStation.equalsIgnoreCase("energy")){
						System.out.print("Energy costs 5 credits/unit, how many units would you like?->");
						int units = input.nextInt();
						System.out.println();
						input.nextLine();
						if(units*5>credits){
							System.out.println("Insufficient funds");
							System.out.println();
							break;
						}else{
							System.out.println(units+" units of energy added to your ship");
							energy+=units;
							credits-=(units*5);
							System.out.println();
							break;
						}
					}else{
						System.out.println("COMMAND LIST: ");
						System.out.println("MISSLES");
						System.out.println("ENERGY");
						System.out.println();
						continue;
					}
				}
			}else if(command.equalsIgnoreCase("shield")){
				System.out.println();
				if(shields<1){
					System.out.println("No shields remaining");
					System.out.println();
					continue;
				}
				System.out.println("Shield activated for 3 turns");
				System.out.println();
				shielded=true;
				shieldTurns=3;
			}else if(command.equalsIgnoreCase("save")){
				try{
					PrintWriter save = new PrintWriter("save.txt", "UTF-8");
					save.println(turnsRemaining);
					save.println(shieldTurns);
					save.println(space);
					save.println(coordinate);
					save.println(energy);
					save.println(missles);
					save.println(shields);
					save.println(credits);
					save.println(targeted);
					save.println(shielded);
					save.println(sectorEnemies);
					save.println(enemiesRequired);
					save.println(totalStations);
					save.println(totalEnemies);
					save.println(totalPlanets);
					save.println(totalTrading);
					save.println(sector);
					for(int i=1; i<=16; i++){
						for(int j=0; j<64; j++){
							switch(i){
								case 1: save.println(sector1[j]); break;
								case 2: save.println(sector2[j]); break;
								case 3: save.println(sector3[j]); break;
								case 4: save.println(sector4[j]); break;
								case 5: save.println(sector5[j]); break;
								case 6: save.println(sector6[j]); break;
								case 7: save.println(sector7[j]); break;
								case 8: save.println(sector8[j]); break;
								case 9: save.println(sector9[j]); break;
								case 10: save.println(sector10[j]); break;
								case 11: save.println(sector11[j]); break;
								case 12: save.println(sector12[j]); break;
								case 13: save.println(sector13[j]); break;
								case 14: save.println(sector14[j]); break;
								case 15: save.println(sector15[j]); break;
								case 16: save.println(sector16[j]); break;
							}
						}
					}
					save.close();
				}catch(IOException e){
					System.out.println();
					System.out.println("SAVE ERROR");
					System.out.println();
					e.printStackTrace();
				}
				System.out.println();
				System.out.println("Game has been saved to save.txt");
				System.out.println();
			}else if(command.equalsIgnoreCase("load")){
				try{
					Scanner filein = new Scanner(new FileInputStream("save.txt"));
					for(int i=1; i<=17; i++){
						switch(i){
							case 1: turnsRemaining = filein.nextInt(); break;
							case 2: shieldTurns = filein.nextInt(); break;
							case 3: space = filein.nextInt(); break;
							case 4: coordinate = filein.nextInt(); break;
							case 5: energy = filein.nextInt(); break;
							case 6: missles = filein.nextInt(); break;
							case 7: shields = filein.nextInt(); break;
							case 8: credits = filein.nextInt(); break;
							case 9: targeted = filein.nextBoolean(); break;
							case 10: shielded = filein.nextBoolean(); break;
							case 11: sectorEnemies = filein.nextBoolean(); break;
							case 12: enemiesRequired = filein.nextInt(); break;
							case 13: totalStations = filein.nextInt(); break;
							case 14: totalEnemies = filein.nextInt(); break;
							case 15: totalPlanets = filein.nextInt(); break;
							case 16: totalTrading = filein.nextInt(); break;
							case 17: sector = filein.nextInt(); break;
						}
					}
					for(int i=1; i<=16; i++){
						for(int j=0; j<64; j++){
							switch(i){
								case 1: sector1[j] = filein.nextInt(); break;
								case 2: sector2[j] = filein.nextInt(); break;
								case 3: sector3[j] = filein.nextInt(); break;
								case 4: sector4[j] = filein.nextInt(); break;
								case 5: sector5[j] = filein.nextInt(); break;
								case 6: sector6[j] = filein.nextInt(); break;
								case 7: sector7[j] = filein.nextInt(); break;
								case 8: sector8[j] = filein.nextInt(); break;
								case 9: sector9[j] = filein.nextInt(); break;
								case 10: sector10[j] = filein.nextInt(); break;
								case 11: sector11[j] = filein.nextInt(); break;
								case 12: sector12[j] = filein.nextInt(); break;
								case 13: sector13[j] = filein.nextInt(); break;
								case 14: sector14[j] = filein.nextInt(); break;
								case 15: sector15[j] = filein.nextInt(); break;
								case 16: sector16[j] = filein.nextInt(); break;
							}
						}
					}
				}catch(InputMismatchException e){
					System.out.print(e.getMessage());
				}catch(FileNotFoundException f){
					System.out.println();
					System.out.println("No save file found");
					System.out.println();
				}
				System.out.println();
				System.out.println("Save has been loaded");
				System.out.println();
			}else{
				System.out.println();
				System.out.println("COMMAND LIST:");
				System.out.println("SRS");
				System.out.println("LRS");
				System.out.println("STATUS");
				System.out.println("WARP");
				System.out.println("ENGAGE");
				System.out.println("SHIELD");
				System.out.println("DOCK");
				System.out.println("LAND");
				System.out.println();
			}
		}
	}
}