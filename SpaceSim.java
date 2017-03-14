import java.util.Scanner;

public class SpaceSim{
	
	/*
	 *This method takes user input and converts it to integers
	 */
	public static int command(){
		Scanner input = new Scanner(System.in);
		int move=0;
		while(true){
			System.out.print("Enter command: ");
			String command = input.nextLine();
			if(command.equalsIgnoreCase("quit")){
				cls();
				System.exit(0);
			}else if(command.equalsIgnoreCase("srs")){
				move=1;
				break;
			}else if(command.equalsIgnoreCase("lrs")){
				move=2;
				break;
			}else if(command.equalsIgnoreCase("warp")){
				move=3;
				break;
			}else if(command.equalsIgnoreCase("move")){
				move=4;
				break;
			}else if(command.equalsIgnoreCase("help")){
				System.out.println("\nMain commands:\nSRS\nLRS\nWARP\nMOVE\nQUIT\n");
				continue;
			}else{
				System.out.println("\nUnknown command, enter \"help\" to see a list of commands\n");
				continue;
			}
		}
		return(move);
	}
	
	/*
	 *This method allows you to buy ship parts
	 */
	public static int buy(){
		Scanner input = new Scanner(System.in);
		int x=0;
		while(true){
			System.out.print("\nWhat would you like to buy? ");
			String command = input.nextLine();
			if(command.equalsIgnoreCase("small engine")){
				x=1;
				break;
			}else if(command.equalsIgnoreCase("medium engine")){
				x=2;
				break;
			}else if(command.equalsIgnoreCase("large engine")){
				x=3;
				break;
			}else if(command.equalsIgnoreCase("scrap metal")){
				x=4; 
				break;
			}else if(command.equalsIgnoreCase("exit")){
				x=5; 
				break;
			}else if(command.equalsIgnoreCase("help")){
				System.out.println("\nMain commands:\nSMALL ENGINE\nMEDIUM ENGINE\nLARGE ENGINE\nSCRAP METAL\nEXIT\n");
				continue;
			}else{
				System.out.println("\nUnknown command, enter \"help\" to see a list of commands\n");
				continue;
			}
		}
		return(x);
	}
	
	/*
	 *This method allows you to move left/right during battle
	 */
	public static int move(){
		Scanner input = new Scanner(System.in);
		int x=0;
		while(true){
			System.out.print("Enter movement: ");
			String move = input.nextLine();
			if(move.equalsIgnoreCase("left")){
				x=1;
				break;
			}else if(move.equalsIgnoreCase("right")){
				x=2;
				break;
			}else if(move.equalsIgnoreCase("none")){
				x=3;
				break;
			}else if(move.equalsIgnoreCase("help")){
				System.out.println("\nMovement commands:\nLEFT\nRIGHT\nNONE\n");
				continue;
			}else{
				System.out.println("\nUnknown command, enter \"help\" to see a list of commands\n");
				continue;
			}
		}
		return(x);
	}
	
	/*
	 *This method allows you to choose your actions at a shop
	 */
	public static int shop(){
		Scanner input = new Scanner(System.in);
		int x=0;
		while(true){
			System.out.print("What would you like to do? ");
			String command = input.nextLine();
			if(command.equalsIgnoreCase("refuel")){
				x=1;
				break;
			}else if(command.equalsIgnoreCase("fix")){
				x=2;
				break;
			}else if(command.equalsIgnoreCase("missles")){
				x=3;
				break;
			}else if(command.equalsIgnoreCase("lasers")){
				x=4;
				break;
			}else if(command.equalsIgnoreCase("help")){
				System.out.println("\nShop commands:\nREFUEL\nFIX\nMISSLES\nLASERS\nUPGRADE\nEXIT\n");
				continue;
			}else if(command.equalsIgnoreCase("exit")){
				x=5;
				break;
			}else if(command.equalsIgnoreCase("upgrade")){
				x=6;
				break;
			}else{
				System.out.println("\nUnknown command, enter \"help\" to see a list of commands\n");
				continue;
			}
		}
		return(x);
	}
	
	/*
	 *This method allows you to enter an attack during battle
	 */
	public static int battle(){
		Scanner input = new Scanner(System.in);
		int x=0;
		while(true){
			System.out.print("Enter move: ");
			String command = input.nextLine();
			if(command.equalsIgnoreCase("laser")){
				x=1;
				break;
			}else if(command.equalsIgnoreCase("missle")){
				x=2;
				break;
			}else if(command.equalsIgnoreCase("escape")){
				x=3;
				break;
			}else if(command.equalsIgnoreCase("help")){
				System.out.println("\nBattle commands:\nLASER\nMISSLE\nESCAPE\nHELP\n");
				continue;
			}else{
				System.out.println("\nUnknown command, enter \"help\" to see a list of commands\n");
				continue;
			}
		}
		return(x);
	}
	
	/*
	 *This method allows you to trade
	 */
	public static int trade(){
		Scanner input = new Scanner(System.in);
		int x=0;
		while(true){
			System.out.print("Enter move: ");
			String command = input.nextLine();
			if(command.equalsIgnoreCase("buy")){
				x=1;
				break;
			}else if(command.equalsIgnoreCase("sell")){
				x=2;
				break;
			}else if(command.equalsIgnoreCase("repair")){
				x=3;
				break;
			}else if(command.equalsIgnoreCase("inventory")){
				x=4;
				break;
			}else if(command.equalsIgnoreCase("exit")){
				x=5;
				break;
			}else if(command.equalsIgnoreCase("help")){
				System.out.println("\nTrading commands:\nBUY\nSELL\nREPAIR\nINVENTORY\nEXIT");
				continue;
			}else{
				System.out.println("\nUnknown command, enter \"help\" to see a list of commands\n");
				continue;
			}
		}
		return(x);
	}
	
	/*
	 *This method allows you to choose which part of your ship to repair at a space station
	 */
	public static int repair(){
		Scanner input = new Scanner(System.in);
		int x=0;
		while(true){
			System.out.print("What would you like to repair? ");
			String repair = input.nextLine();
			if(repair.equalsIgnoreCase("left wing")){
				x=1;
				break;
			}else if(repair.equalsIgnoreCase("right wing")){
				x=2;
				break;
			}else if(repair.equalsIgnoreCase("missle cannon")){
				x=3;
				break;
			}else if(repair.equalsIgnoreCase("laser cannon")){
				x=4;
				break;
			}else if(repair.equalsIgnoreCase("cockpit")){
				x=5;
				break;
			}else if(repair.equalsIgnoreCase("help")){
				System.out.println("Repair commands:\nLEFT WING\nRIGHT WING\nMISSLE CANNON\nLASER CANNON\nCOCKPIT\nEXIT\n");
				continue;
			}else if(repair.equalsIgnoreCase("exit")){
				x=6; 
				break;
			}else{
				System.out.println("\nUnknown command, enter \"help\" to see a list of commands\n");
				continue;
			}
		}
		return(x);
	}
	
	/*
	 *This method allows the user to input the part of their ship they wish to upgrade
	 */
	public static int upgrade(){
		Scanner input = new Scanner(System.in);
		int x=0;
		while(true){
			System.out.print("What part of your ship would you like to upgrade? ");
			String command = input.nextLine();
			if(command.equalsIgnoreCase("laser")){
				x=1;
				break;
			}else if(command.equalsIgnoreCase("missle")){
				x=2;
				break;
			}else if(command.equalsIgnoreCase("shield")){
				x=3;
				break;
			}else if(command.equalsIgnoreCase("exit")){
				x=4;
				break;
			}else if(command.equalsIgnoreCase("help")){
				System.out.println("\nUpgrade Commands:\nLASER\nMISSLE\nSHIELD\nEXIT\n");
				continue;
			}else{
				System.out.println("\nUnknown command, enter \"help\" to see a list of commands\n");
				continue;
			}
		}
		return(x);
	}
	
	/*
	 *This method allows the user to move while on the ground
	 */
	public static int ground(){
		Scanner input = new Scanner(System.in);
		int x=0;
		System.out.println();
		while(true){
			System.out.print("Where do you want to go? ");
			String movement = input.nextLine();
			if(movement.equalsIgnoreCase("north")){
				x=1;
				break;
			}else if(movement.equalsIgnoreCase("east")){
				x=2;
				break;
			}else if(movement.equalsIgnoreCase("south")){
				x=3;
				break;
			}else if(movement.equalsIgnoreCase("west")){
				x=4;
				break;
			}else if(movement.equalsIgnoreCase("leave")){
				x=5;
				break;
			}else if(movement.equalsIgnoreCase("help")){
				System.out.println("Movement commands:\nNORTH\nEAST\nSOUTH\nWEST\nLEAVE\n");
				continue;
			}else{
				System.out.println("\nUnknown command, enter \"help\" to see a list of commands\n");
				continue;
			}
		}
		return(x);
	}
	
	/*
	 *This method clears the screen
	 */
	public static void cls(){
		String spaces = "                                                                                ";
		for(int i=0; i<=25; i++){
			System.out.print(spaces);
		}
		System.out.println();
	}
	 
	/*
	 *This method allows the user to choose between yes or no
	 */
	public static int yesNo(){
		Scanner input = new Scanner(System.in);
		String response = input.nextLine();
		int x=0;
		while(true){
			if(response.equalsIgnoreCase("yes")){
				x=1;
				break;
			}else if(response.equalsIgnoreCase("no")){
				x=2;
				break;
			}else if(response.equalsIgnoreCase("quit")){
				cls();
				System.exit(0);
			}else if(response.equalsIgnoreCase("help")){
				System.out.println("\nDecision commands:\nYES\nNO\n");
			}else{
				System.out.println("\nUnknown command, enter \"help\" to see a list of commands\n");
				continue;
			}
		}
		return(x);
	}
	
	/*
	 *This method displays the short range scan screen of your sector
	 */
	public static void sectorDisplay(int[] sector1, int[] sector2, int[] sector3, int[] sector4, int[] sector5, int[] sector6, int[] sector7, int[] sector8, int[] sector9, int[] sector10, int[] sector11, int[] sector12, int[] sector13, int[] sector14, int[] sector15, int[] sector16, int enemiesReq, int missles, int lasers, int sector, int health, int fuel, int money){
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
					System.out.print("-T-");
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
					System.out.print("-T-");
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
					System.out.print("-T-");
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
					System.out.print("-T-");
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
					System.out.print("-T-");
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
					System.out.print("-T-");
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
					System.out.print("-T-");
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
					System.out.print("-T-");
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
					System.out.print("-T-");
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
					System.out.print("-T-");
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
					System.out.print("-T-");
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
					System.out.print("-T-");
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
					System.out.print("-T-");
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
					System.out.print("-T-");
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
					System.out.print("-T-");
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
					System.out.print("-T-");
				}
			}
			if(i==7){
				System.out.println(" 1");
			}else if(i==15){
				System.out.println(" 2   Current Sector: "+sector);
			}else if(i==23){
				System.out.println(" 3   Enemies Left: "+enemiesReq);
			}else if(i==31){
				System.out.println(" 4   Health Remaining: "+health);
			}else if(i==39){
				System.out.println(" 5   Fuel Remaining: "+fuel);
			}else if(i==47){
				System.out.println(" 6   Credits Remaining: "+money);
			}else if(i==55){
				System.out.println(" 7   Lasers Remaining: "+lasers);
			}else if(i==63){
				System.out.println(" 8   Missles Remaining: "+missles);
			}
		}
		System.out.println("   1  2  3  4  5  6  7  8\n");
	}
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int random, move, xCoordinate, yCoordinate, shop, repair, numPurchased, ground, buy;
		int enemiesReq=0;
		int playerMove=0;
		int aim=1;
		int enemyAim=1;
		int enemyMove=0;
		int enemyHealth;
		int playerPos=3;
		int enemyPos=3;
		int yesNo=0;
		int environment=0;
		int space=0;
		int totalEnemies=0;
		int totalPlanets=0;
		int totalStations=0;
		int totalTrading=0;
		int sector=(int)(16*Math.random()+1);
		int money=750;
		int lasers=15;
		int missles=3;
		int health=250;
		int fuel=200;
		int engineS=0;
		int engineM=0;
		int engineL=0;
		int scrapMetal=0;
		int unknownCargo=0;
		int valuableCargo=0;
		int worthlessCargo=0;
		int laserLevel=1;
		int missleLevel=1;
		int shieldLevel=1;
		int upgrade=0;
		int trade=0;
		int engineSSell;
		int engineMSell;
		int engineLSell;
		int scrapMetalSell;
		int unknownCargoSell;
		int valuableCargoSell;
		int worthlessCargoSell;
		int totalSell;
		boolean leftWing=true;
		boolean rightWing=true;
		boolean missleCannon=true;
		boolean laserCannon=true;
		boolean cockpit=true;
		boolean left=false;
		boolean right=false;
		String bar = "================================================================================";
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
				/*
				System.out.println(totalStations);
				System.out.println(totalPlanets);
				System.out.println(totalTrading);
				try{
					Thread.sleep(500);
				}catch(InterruptedException e){
					e.printStackTrace();
				}
				*/
				totalTrading=0;
				totalEnemies=0;
				totalPlanets=0;
				totalStations=0;
				continue;
			}else{
				if(totalEnemies>50){
					enemiesReq=25;
				}
				System.out.println();
				break;
			}
		}
		enemiesReq=25;
		while(fuel>0 && health>0){
			move = command();
			System.out.println();
			if(move==1){
				sectorDisplay(sector1, sector2, sector3, sector4, sector5, sector6, sector7, sector8, sector9, sector10, sector11, sector12, sector13, sector14, sector15, sector16, enemiesReq, missles, lasers, sector, health, fuel, money);
				continue;
			}else if(move==2){
				System.out.println("Results of long range scan:");
				System.out.println("Total enemies found: "+totalEnemies);
				System.out.println("Total planets found: "+totalPlanets);
				System.out.println("Total space stations found: "+totalStations);
				System.out.println("Total trade posts found: "+totalTrading);
				System.out.println();
				continue;
			}else if(move==3){
				if(fuel<20){
					System.out.println("\nYou do not have enough fuel to enter hyperspace");
					continue;
				}else{
					fuel-=20;
				}
				System.out.print("Which sector would you like to warp to (1-16)? ");
				sector=input.nextInt();
				input.nextLine();
				if(sector>16 || sector<1){
					System.out.println("You attempted to fly to an uncharted sector...\nWarping your ship to a random sector\n");
					sector=(int)(16*Math.random()+1);
					continue;
				}
				System.out.println();
				continue;
			}else if(move==4){
				if(fuel<5){
					System.out.println("\nYou do not have enough fuel to move, attempt a crash landing? ");
					yesNo = yesNo();
					if(yesNo==1){
						System.out.print("\nYou attempted a crash landing");
						for(int i=1; i<=3; i++){
							try{
								Thread.sleep(500);
							}catch(InterruptedException e){
								e.printStackTrace();
							}
							System.out.print(".");
						}
						random=(int)(10*Math.random()+1);
						if(random!=1){
							System.out.println("\n\nBut your ship was wrecked beyond repair");
							cls();
							System.exit(0);
						}else{
							System.out.println("\n\nYou landed successfully on a nearby planet!");
							System.out.println("You managed to find 25 liters of fuel near your crash site");
							fuel+=25;
							continue;
						}
					}
				}else{
					fuel-=5;
				}
				System.out.print("Enter an x-coordinate to fly to: ");
				xCoordinate=input.nextInt();
				input.nextLine();
				System.out.print("\nEnter a y-coordinate to fly to: ");
				yCoordinate=input.nextInt();
				input.nextLine();
				if(xCoordinate>8 || xCoordinate<1 || yCoordinate>8 || yCoordinate<1){
					System.out.println("\nPlease enter a legitimate location\n");
					continue;
				}
				if(yCoordinate==1){
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
				if(sector==1){
					if(sector1[space]==0 || sector1[space]==1){
						System.out.println("\nThere is nothing here\n");
					}else if(sector1[space]==2){
						System.out.print("\nThere is an enemy ship here, attack? ");
						yesNo = yesNo();
						environment=1;
					}else if(sector1[space]==4){
						System.out.print("\nThere is a planet here, land? ");
						yesNo = yesNo();
						environment=2;
					}else if(sector1[space]==3){
						System.out.print("\nThere is a space station here, land? ");
						yesNo = yesNo();
						environment=3;
					}else if(sector1[space]==5){
						System.out.print("\nThere is a trading outpost here, land? ");
						yesNo = yesNo();
						environment=4;
					}
				}else if(sector==2){
					if(sector2[space]==0 || sector2[space]==1){
						System.out.println("\nThere is nothing here\n");
					}else if(sector2[space]==2){
						System.out.print("\nThere is an enemy ship here, attack? ");
						yesNo = yesNo();
						environment=1;
					}else if(sector2[space]==4){
						System.out.print("\nThere is a planet here, land? ");
						yesNo = yesNo();
						environment=2;
					}else if(sector2[space]==3){
						System.out.print("\nThere is a space station here, land? ");
						yesNo = yesNo();
						environment=3;
					}else if(sector2[space]==5){
						System.out.print("\nThere is a trading outpost here, land? ");
						yesNo = yesNo();
						environment=4;
					}
				}else if(sector==3){
					if(sector3[space]==0 || sector3[space]==1){
						System.out.println("\nThere is nothing here\n");
					}else if(sector3[space]==2){
						System.out.print("\nThere is an enemy ship here, attack? ");
						yesNo = yesNo();
						environment=1;
					}else if(sector3[space]==4){
						System.out.print("\nThere is a planet here, land? ");
						yesNo = yesNo();
						environment=2;
					}else if(sector3[space]==3){
						System.out.print("\nThere is a space station here, land? ");
						yesNo = yesNo();
						environment=3;
					}else if(sector3[space]==5){
						System.out.print("\nThere is a trading outpost here, land? ");
						yesNo = yesNo();
						environment=4;
					}
				}else if(sector==4){
					if(sector4[space]==0 || sector4[space]==1){
						System.out.println("\nThere is nothing here\n");
					}else if(sector4[space]==2){
						System.out.print("\nThere is an enemy ship here, attack? ");
						yesNo = yesNo();
						environment=1;
					}else if(sector4[space]==4){
						System.out.print("\nThere is a planet here, land? ");
						yesNo = yesNo();
						environment=2;
					}else if(sector4[space]==3){
						System.out.print("\nThere is a space station here, land? ");
						yesNo = yesNo();
						environment=3;
					}else if(sector4[space]==5){
						System.out.print("\nThere is a trading outpost here, land? ");
						yesNo = yesNo();
						environment=4;
					}
				}else if(sector==5){
					if(sector5[space]==0 || sector5[space]==1){
						System.out.println("\nThere is nothing here\n");
					}else if(sector5[space]==2){
						System.out.print("\nThere is an enemy ship here, attack? ");
						yesNo = yesNo();
						environment=1;
					}else if(sector5[space]==4){
						System.out.print("\nThere is a planet here, land? ");
						yesNo = yesNo();
						environment=2;
					}else if(sector5[space]==3){
						System.out.print("\nThere is a space station here, land? ");
						yesNo = yesNo();
						environment=3;
					}else if(sector5[space]==5){
						System.out.print("\nThere is a trading outpost here, land? ");
						yesNo = yesNo();
						environment=4;
					}
				}else if(sector==6){
					if(sector6[space]==0 || sector6[space]==1){
						System.out.println("\nThere is nothing here\n");
					}else if(sector6[space]==2){
						System.out.print("\nThere is an enemy ship here, attack? ");
						yesNo = yesNo();
						environment=1;
					}else if(sector6[space]==4){
						System.out.print("\nThere is a planet here, land? ");
						yesNo = yesNo();
						environment=2;
					}else if(sector6[space]==3){
						System.out.print("\nThere is a space station here, land? ");
						yesNo = yesNo();
						environment=3;
					}else if(sector6[space]==5){
						System.out.print("\nThere is a trading outpost here, land? ");
						yesNo = yesNo();
						environment=4;
					}
				}else if(sector==7){
					if(sector7[space]==0 || sector7[space]==1){
						System.out.println("\nThere is nothing here\n");
					}else if(sector7[space]==2){
						System.out.print("\nThere is an enemy ship here, attack? ");
						yesNo = yesNo();
						environment=1;
					}else if(sector7[space]==4){
						System.out.print("\nThere is a planet here, land? ");
						yesNo = yesNo();
						environment=2;
					}else if(sector7[space]==3){
						System.out.print("\nThere is a space station here, land? ");
						yesNo = yesNo();
						environment=3;
					}else if(sector7[space]==5){
						System.out.print("\nThere is a trading outpost here, land? ");
						yesNo = yesNo();
						environment=4;
					}
				}else if(sector==8){
					if(sector8[space]==0 || sector8[space]==1){
						System.out.println("\nThere is nothing here\n");
					}else if(sector8[space]==2){
						System.out.print("\nThere is an enemy ship here, attack? ");
						yesNo = yesNo();
						environment=1;
					}else if(sector8[space]==4){
						System.out.print("\nThere is a planet here, land? ");
						yesNo = yesNo();
						environment=2;
					}else if(sector8[space]==3){
						System.out.print("\nThere is a space station here, land? ");
						yesNo = yesNo();
						environment=3;
					}else if(sector8[space]==5){
						System.out.print("\nThere is a trading outpost here, land? ");
						yesNo = yesNo();
						environment=4;
					}
				}else if(sector==9){
					if(sector9[space]==0 || sector9[space]==1){
						System.out.println("\nThere is nothing here\n");
					}else if(sector9[space]==2){
						System.out.print("\nThere is an enemy ship here, attack? ");
						yesNo = yesNo();
						environment=1;
					}else if(sector9[space]==4){
						System.out.print("\nThere is a planet here, land? ");
						yesNo = yesNo();
						environment=2;
					}else if(sector9[space]==3){
						System.out.print("\nThere is a space station here, land? ");
						yesNo = yesNo();
						environment=3;
					}else if(sector9[space]==5){
						System.out.print("\nThere is a trading outpost here, land? ");
						yesNo = yesNo();
						environment=4;
					}
				}else if(sector==10){
					if(sector10[space]==0 || sector10[space]==1){
						System.out.println("\nThere is nothing here\n");
					}else if(sector10[space]==2){
						System.out.print("\nThere is an enemy ship here, attack? ");
						yesNo = yesNo();
						environment=1;
					}else if(sector10[space]==4){
						System.out.print("\nThere is a planet here, land? ");
						yesNo = yesNo();
						environment=2;
					}else if(sector10[space]==3){
						System.out.print("\nThere is a space station here, land? ");
						yesNo = yesNo();
						environment=3;
					}else if(sector10[space]==5){
						System.out.print("\nThere is a trading outpost here, land? ");
						yesNo = yesNo();
						environment=4;
					}
				}else if(sector==11){
					if(sector1[space]==0 || sector11[space]==1){
						System.out.println("\nThere is nothing here\n");
					}else if(sector11[space]==2){
						System.out.print("\nThere is an enemy ship here, attack? ");
						yesNo = yesNo();
						environment=1;
					}else if(sector11[space]==4){
						System.out.print("\nThere is a planet here, land? ");
						yesNo = yesNo();
						environment=2;
					}else if(sector11[space]==3){
						System.out.print("\nThere is a space station here, land? ");
						yesNo = yesNo();
						environment=3;
					}else if(sector11[space]==5){
						System.out.print("\nThere is a trading outpost here, land? ");
						yesNo = yesNo();
						environment=4;
					}
				}else if(sector==12){
					if(sector12[space]==0 || sector12[space]==1){
						System.out.println("\nThere is nothing here\n");
					}else if(sector12[space]==2){
						System.out.print("\nThere is an enemy ship here, attack? ");
						yesNo = yesNo();
						environment=1;
					}else if(sector12[space]==4){
						System.out.print("\nThere is a planet here, land? ");
						yesNo = yesNo();
						environment=2;
					}else if(sector12[space]==3){
						System.out.print("\nThere is a space station here, land? ");
						yesNo = yesNo();
						environment=3;
					}else if(sector12[space]==5){
						System.out.print("\nThere is a trading outpost here, land? ");
						yesNo = yesNo();
						environment=4;
					}
				}else if(sector==13){
					if(sector13[space]==0 || sector13[space]==1){
						System.out.println("\nThere is nothing here\n");
					}else if(sector13[space]==2){
						System.out.print("\nThere is an enemy ship here, attack? ");
						yesNo = yesNo();
						environment=1;
					}else if(sector13[space]==4){
						System.out.print("\nThere is a planet here, land? ");
						yesNo = yesNo();
						environment=2;
					}else if(sector13[space]==3){
						System.out.print("\nThere is a space station here, land? ");
						yesNo = yesNo();
						environment=3;
					}else if(sector13[space]==5){
						System.out.print("\nThere is a trading outpost here, land? ");
						yesNo = yesNo();
						environment=4;
					}
				}else if(sector==14){
					if(sector14[space]==0 || sector14[space]==1){
						System.out.println("\nThere is nothing here\n");
					}else if(sector14[space]==2){
						System.out.print("\nThere is an enemy ship here, attack? ");
						yesNo = yesNo();
						environment=1;
					}else if(sector14[space]==4){
						System.out.print("\nThere is a planet here, land? ");
						yesNo = yesNo();
						environment=2;
					}else if(sector14[space]==3){
						System.out.print("\nThere is a space station here, land? ");
						yesNo = yesNo();
						environment=3;
					}else if(sector14[space]==5){
						System.out.print("\nThere is a trading outpost here, land? ");
						yesNo = yesNo();
						environment=4;
					}
				}else if(sector==15){
					if(sector15[space]==0 || sector15[space]==1){
						System.out.println("\nThere is nothing here\n");
					}else if(sector15[space]==2){
						System.out.print("\nThere is an enemy ship here, attack? ");
						yesNo = yesNo();
						environment=1;
					}else if(sector15[space]==4){
						System.out.print("\nThere is a planet here, land? ");
						yesNo = yesNo();
						environment=2;
					}else if(sector15[space]==3){
						System.out.print("\nThere is a space station here, land? ");
						yesNo = yesNo();
						environment=3;
					}else if(sector15[space]==5){
						System.out.print("\nThere is a trading outpost here, land? ");
						yesNo = yesNo();
						environment=4;
					}
				}else if(sector==16){
					if(sector16[space]==0 || sector16[space]==1){
						System.out.println("\nThere is nothing here\n");
					}else if(sector16[space]==2){
						System.out.print("\nThere is an enemy ship here, attack? ");
						yesNo = yesNo();
						environment=1;
					}else if(sector16[space]==4){
						System.out.print("\nThere is a planet here, land? ");
						yesNo = yesNo();
						environment=2;
					}else if(sector16[space]==3){
						System.out.print("\nThere is a space station here, land? ");
						yesNo = yesNo();
						environment=3;
					}else if(sector16[space]==5){
						System.out.print("\nThere is a trading outpost here, land? ");
						yesNo = yesNo();
						environment=4;
					}
				}
				System.out.println();
				if(environment==1 && yesNo==1){ //BATTLE SEQUENCE
					System.out.println("You engaged in battle with an enemy ship!");
					System.out.println();
					enemyHealth=(int)(11*Math.random()+50);
					while(true){
						System.out.println("+-----------+");
						System.out.println("| 1 2 3 4 5 |");
						switch(enemyPos){
							case 1: System.out.println("| E         |"); break;
							case 2: System.out.println("|   E       |"); break;
							case 3: System.out.println("|     E     |"); break;
							case 4: System.out.println("|       E   |"); break;
							case 5: System.out.println("|         E |"); break;
						}
						System.out.println("|           |");
						switch(playerPos){
							case 1: System.out.println("| P         |"); break;
							case 2: System.out.println("|   P       |"); break;
							case 3: System.out.println("|     P     |"); break;
							case 4: System.out.println("|       P   |"); break;
							case 5: System.out.println("|         P |"); break;
						}
						System.out.println("| 1 2 3 4 5 |");
						System.out.println("+-----------+");
						System.out.println();
						System.out.println("Ship Health: "+health);
						System.out.println("Lasers: "+lasers);
						System.out.println("Missles: "+missles);
						System.out.println();
						playerMove = move();
						if(playerMove==1){
							if(fuel>=5 && leftWing){
								left=true;
							}else if(fuel<5){
								System.out.println("\nYou don't have enough fuel for this");
							}else if(leftWing==false){
								System.out.println("\nYour left wing is broken");
							}
						}else if(playerMove==2){
							if(fuel>=5 && rightWing){
								right=true;
							}else if(fuel<5){
								System.out.println("\nYou don't have enough fuel for this");
							}else if(rightWing==false){
								System.out.println("\nYour right wing is broken");
							}
						}
						System.out.println();
						playerMove=battle();
						System.out.println();
						if(playerMove==1){
							if(lasers==0){
								System.out.println("You are out of lasers");
								aim = 0;
							}else{
								lasers-=1;
								System.out.print("Where would you like to aim your laser? ");
								aim = input.nextInt();
								input.nextLine();
							}
							System.out.println();
						}else if(playerMove==2){
							if(missles==0){
								System.out.println("You are out of missles");
								aim=0;
							}else{
								missles-=1;
								System.out.print("Where would you like to aim your missle? ");
								aim = input.nextInt();
								input.nextLine();
							}
							System.out.println();
						}else{
							System.out.print("You attempted to escape");
							for(int i=1; i<=3; i++){
								try{
									Thread.sleep(500);
								}catch(InterruptedException e){
									e.printStackTrace();
								}
								System.out.print(".");
							}
							System.out.println("\n");
							random = (int)(2*Math.random()+1);
							if(random==1){
								System.out.println("And you were successful\n");
								try{
									Thread.sleep(1500);
								}catch(InterruptedException e){
									e.printStackTrace();
								}
								break;
							}else{
								System.out.println("But you failed\n");
								try{
									Thread.sleep(1500);
								}catch(InterruptedException e){
									e.printStackTrace();
								}
								continue;
							}
						}
						enemyMove=(int)(8*Math.random()+1);
						if(enemyMove==2){
							enemyPos-=1;
						}else if(enemyMove==3){
							enemyPos+=1;
						}else{
							random=(int)(3*Math.random()+1);
							switch(random){
								case 1: enemyAim=playerPos; break;
								case 2: enemyAim=playerPos-1; break;
								case 3: enemyAim=playerPos+1; break;
							}
						}
						if(left && fuel>=5){
							fuel-=5;
							playerPos-=1;
							left=false;
						}else if(right && fuel>=5){
							fuel-=5;
							playerPos+=1;
							right=false;
						}
						try{
							Thread.sleep(1500);
						}catch(InterruptedException e){
							e.printStackTrace();
						}
						if(playerMove==1){
							random=(int)(10*Math.random()+1);
							if(random!=10 && aim==enemyPos && laserCannon==true){
								if(cockpit){
									switch(laserLevel){
										case 1: random=(int)(6*Math.random()+10); break;
										case 2: random=(int)(6*Math.random()+15); break;
										case 3: random=(int)(11*Math.random()+20); break;
									}
									enemyHealth-=random;
									System.out.println("Your laser hit the opposing ship and did "+random+" damage");
								}else{
									random=(int)(3*Math.random()+1);
									if(random==1 || random==3){
										System.out.println("Your laser missed the opposing ship");
									}else{
										switch(laserLevel){
											case 1: random=(int)(6*Math.random()+10); break;
											case 2: random=(int)(6*Math.random()+15); break;
											case 3: random=(int)(11*Math.random()+20); break;
										}
										random=(int)(6*Math.random()+15);
										enemyHealth-=random;
										System.out.println("Your laser hit the opposing ship and did "+random+" damage");
									}
								}
							}else if(laserCannon==false){
								System.out.println("Your laser cannon is broken");
							}else{
								System.out.println("Your laser missed the opposing ship");
							}
							if(enemyHealth<1){
								System.out.println();
								System.out.println("The opposing ship was defeated");
								System.out.println();
								enemiesReq-=1;
								totalEnemies-=1;
								System.out.println("Collected materials: ");
								random=(int)(2*Math.random()+1);
								if(random==1){
									random=(int)(4*Math.random()+1);
									System.out.println(random+" Small Engine(s)");
									engineS+=random;
								}
								random=(int)(3*Math.random()+1);
								if(random==2){
									random=(int)(2*Math.random()+1);
									System.out.println(random+" Medium Engine(s)");
									engineM+=random;
								}
								random=(int)(5*Math.random()+1);
								if(random==3){
									engineL+=1;
									System.out.println("1 Large Engine");
								}
								random=(int)(9*Math.random()+1);
								scrapMetal+=random;
								System.out.println(random+" Scrap Metal");
								random=(int)(10*Math.random()+1);
								if(random==8){
									unknownCargo+=1;
									System.out.println("1 Unknown Piece of Cargo");
								}
								random=(int)(50*Math.random()+1);
								if(random==4){
									valuableCargo+=1;
									System.out.println("1 Valuable Piece of Cargo");
								}
								random=(int)(2*Math.random()+1);
								if(random==2){
									random=(int)(5*Math.random()+1);
									worthlessCargo+=random;
									System.out.println(random+" Piece(s) of Worthless Cargo");
								}
								try{
									Thread.sleep(1500);
								}catch(InterruptedException e){
									e.printStackTrace();
								}
								System.out.println();
								switch(sector){
									case 1: sector1[space]=1; break;
									case 2: sector2[space]=1; break;
									case 3: sector3[space]=1; break;
									case 4: sector4[space]=1; break;
									case 5: sector5[space]=1; break;
									case 6: sector6[space]=1; break;
									case 7: sector7[space]=1; break;
									case 8: sector8[space]=1; break;
									case 9: sector9[space]=1; break;
									case 10: sector10[space]=1; break;
									case 11: sector11[space]=1; break;
									case 12: sector12[space]=1; break;
									case 13: sector13[space]=1; break;
									case 14: sector14[space]=1; break;
									case 15: sector15[space]=1; break;
									case 16: sector16[space]=1; break;
								}
								break;
							}
						}else if(playerMove==2){
							random=(int)(10*Math.random()+1);
							if(random!=10 && aim==enemyPos && missleCannon==true){
								if(cockpit){
									switch(missleLevel){
										case 1: enemyHealth-=40; System.out.println("Your missle hit the opposing ship and did 40 damage"); break;
										case 2: enemyHealth-=50; System.out.println("Your missle hit the opposing ship and did 50 damage"); break;
										case 3: enemyHealth-=60; System.out.println("Your missle hit the opposing ship and did 60 damage"); break;
									}
								}else{
									random=(int)(3*Math.random()+1);
									if(random==1 || random==3){
										System.out.println("Your missle missed the opposing ship");
									}else{
										switch(missleLevel){
											case 1: enemyHealth-=40; System.out.println("Your missle hit the opposing ship and did 40 damage"); break;
											case 2: enemyHealth-=50; System.out.println("Your missle hit the opposing ship and did 50 damage"); break;
											case 3: enemyHealth-=60; System.out.println("Your missle hit the opposing ship and did 60 damage"); break;
										}
									}
								}
							}else if(missleCannon==false){
								System.out.println("Your missle cannon is broken");
							}else{
								System.out.println("Your missle missed the opposing ship");
							}
							if(enemyHealth<1){
								System.out.println();
								System.out.println("The opposing ship was defeated");
								System.out.println();
								enemiesReq-=1;
								totalEnemies-=1;
								System.out.println("Collected materials: ");
								random=(int)(2*Math.random()+1);
								if(random==1){
									random=(int)(4*Math.random()+1);
									System.out.println(random+" Small Engine(s)");
									engineS+=random;
								}
								random=(int)(3*Math.random()+1);
								if(random==2){
									random=(int)(2*Math.random()+1);
									System.out.println(random+" Medium Engine(s)");
									engineM+=random;
								}
								random=(int)(5*Math.random()+1);
								if(random==3){
									engineL+=1;
									System.out.println("1 Large Engine");
								}
								random=(int)(9*Math.random()+1);
								scrapMetal+=random;
								System.out.println(random+" Scrap Metal");
								random=(int)(10*Math.random()+1);
								if(random==8){
									unknownCargo+=1;
									System.out.println("1 Unknown Piece of Cargo");
								}
								random=(int)(50*Math.random()+1);
								if(random==4){
									valuableCargo+=1;
									System.out.println("1 Valuable Piece of Cargo");
								}
								random=(int)(2*Math.random()+1);
								if(random==2){
									random=(int)(5*Math.random()+1);
									worthlessCargo+=random;
									System.out.println(random+" Piece(s) of Worthless Cargo");
								}
								try{
									Thread.sleep(1500);
								}catch(InterruptedException e){
									e.printStackTrace();
								}
								System.out.println();
								switch(sector){
									case 1: sector1[space]=1; break;
									case 2: sector2[space]=1; break;
									case 3: sector3[space]=1; break;
									case 4: sector4[space]=1; break;
									case 5: sector5[space]=1; break;
									case 6: sector6[space]=1; break;
									case 7: sector7[space]=1; break;
									case 8: sector8[space]=1; break;
									case 9: sector9[space]=1; break;
									case 10: sector10[space]=1; break;
									case 11: sector11[space]=1; break;
									case 12: sector12[space]=1; break;
									case 13: sector13[space]=1; break;
									case 14: sector14[space]=1; break;
									case 15: sector15[space]=1; break;
									case 16: sector16[space]=1; break;
								}
								break;
							}
						}
						try{
							Thread.sleep(1500);
						}catch(InterruptedException e){
							e.printStackTrace();
						}
						System.out.println();
						if(enemyMove!=2 && enemyMove!=3){
							if(enemyAim==playerPos){
								random=0;
								switch(shieldLevel){
									case 1: random=(int)(16*Math.random()+25);
									case 2: random=(int)(11*Math.random()+15);
									case 3: random=(int)(11*Math.random()+10);
								}
								health-=random;
								System.out.println("The enemy's shot hit you and did "+random+" damage");
								System.out.println();
								try{
									Thread.sleep(1500);
								}catch(InterruptedException e){
									e.printStackTrace();
								}
								random=(int)(30*Math.random()+1);
								switch(random){
									case 4: System.out.println("The enemy's shot damaged your left wing\n"); leftWing=false; break;
									case 8: System.out.println("The enemy's shot damaged your right wing\n"); rightWing=false; break;
									case 12: System.out.println("The enemy's shot damaged your laser cannon\n"); laserCannon=false; break;
									case 20: System.out.println("The enemy's shot damaged your missle cannon\n"); missleCannon=false; break;
									case 24: System.out.println("The enemy's shot damaged your cockpit\n"); cockpit=false; break;
								}
							}else{
								System.out.println("The enemy's shot missed");
								System.out.println();
								try{
									Thread.sleep(1500);
								}catch(InterruptedException e){
									e.printStackTrace();
								}
							}
						}else if(enemyMove==2){
							System.out.println("The enemy moved left");
							System.out.println();
						}else{
							System.out.println("The enemy moved right");
							System.out.println();
						}
						if(health<1){
							System.out.println("\nYour ship was destroyed");
							cls();
							System.exit(0);
						}
						try{
							Thread.sleep(1000);
						}catch(InterruptedException e){
							e.printStackTrace();
						}
					}
				}else if(environment==2 && yesNo==1){ //PLANET
					random=(int)(10*Math.random()+1);
					System.out.print("You attempted to land on this planet");
					for(int i=1; i<=3; i++){
						try{
							Thread.sleep(500);
						}catch(InterruptedException e){
							e.printStackTrace();
						}
						System.out.print(".");
					}
					System.out.println();
					if(random==1 || random==6){
						System.out.println("\nBut your ship was caught up in a horrible storm!");
						continue;
					}else if(random>=2 && random<=5){
						System.out.print("\nBut your ");
						random=(int)(5*Math.random()+1);
						switch(random){
							case 1: System.out.print("left wing "); leftWing=false; break;
							case 2: System.out.print("right wing "); rightWing=false; break;
							case 3: System.out.print("missle cannon "); missleCannon=false; break;
							case 4: System.out.print("laser cannon "); laserCannon=false; break;
							case 5: System.out.print("cockpit "); cockpit=false; break;
						}
						System.out.println("was damaged\n");
						continue;
					}else{
						System.out.println("\n\nAnd you were successful!");
						random=(int)(5*Math.random()+1);
						switch(random){
							case 1: System.out.print("You emerged from your cockpit into a dark swamp"); break;
							case 2: System.out.print("You sprang from your cockpit into a dense jungle"); break;
							case 3: System.out.print("You jumped from your cockpit onto the sandy ground below"); break;
							case 4: System.out.print("You emerged from your cockpit into a grassy field"); break;
							case 5: System.out.print("You jumped from your cockpit onto a nearby rock"); break;
						}
						System.out.println();
						ground = ground();
						random=(int)(4*Math.random()+1);
						if(ground==1 || ground==2){
							if(random==1 || random==4){
								System.out.println("\nYou were attacked by a group of bandits and lost 100 credits\n");
								money-=100;
							}else if(random==2){
								System.out.println("\nYou found 3 missles\n");
								missles+=3;
							}else{
								System.out.println("\nYou found 50 liters of fuel\n");
								fuel+=50;
							}
						}else{
							if(random==2 || random==3){
								System.out.println("\nYou were attacked by a group of bandits and lost 150 credits\n");
								money-=100;
							}else if(random==4){
								System.out.println("\nYou found 4 missles\n");
								missles+=3;
							}else{
								System.out.println("\nYou found 75 liters of fuel\n");
								fuel+=50;
							}
						}
						System.out.println("You got back into your ship and left the planet\n");
						continue;
					}
				}else if(environment==3 && yesNo==1){
					System.out.println("**Welcome to the Sector "+sector+" space station**");
					System.out.println("Here, you can refuel, fix and upgrade your ship and purchase weapons");
					System.out.println();
					while(true){
						shop=shop();
						System.out.println();
						if(shop==1){
							System.out.print("Refueling your ship will cost 5 credits per liter, is this ok? ");
							yesNo = yesNo();
							if(yesNo==1){
								System.out.println();
								System.out.print("How many liters would you like to purchase? ");
								numPurchased = input.nextInt();
								input.nextLine();
								if(money<(numPurchased*5)){
									System.out.println("\nSorry, insufficient funds");
									continue;
								}else{
									money-=(numPurchased*5);
									fuel+=numPurchased;
									System.out.println();
									continue;
								}
							}else{
								continue;
							}
						}else if(shop==2){
							System.out.print("Fixing your ship will cost 700 credits per part, is this ok? ");
							yesNo = yesNo();
							System.out.println();
							if(yesNo==1 && money>=700){
								money-=700;
								System.out.print("Left Wing: ");
								if(leftWing){
									System.out.println("Intact");
								}else{
									System.out.println("Damaged");
								}
								System.out.print("Right Wing: ");
								if(rightWing){
									System.out.println("Intact");
								}else{
									System.out.println("Damaged");
								}
								System.out.print("Missle Cannon: ");
								if(missleCannon){
									System.out.println("Intact");
								}else{
									System.out.println("Damaged");
								}
								System.out.print("Laser Cannon: ");
								if(laserCannon){
									System.out.println("Intact");
								}else{
									System.out.println("Damaged");
								}
								System.out.print("Cockpit: ");
								if(cockpit){
									System.out.println("Intact");
								}else{
									System.out.println("Damaged");
								}
								System.out.println();
								repair = repair();
								if(repair==1){
									System.out.println("\nLeft wing repaired\n");
									leftWing=true;
									continue;
								}else if(repair==2){
									System.out.println("\nRight wing repaired\n");
									rightWing=true;
									continue;
								}else if(repair==3){
									System.out.println("\nMissle cannon repaired\n");
									missleCannon=true;
									continue;
								}else if(repair==4){
									System.out.println("\nLaser cannon repaired\n");
									laserCannon=true;
									continue;
								}else if(repair==5){
									System.out.println("\nCockpit repaired\n");
									cockpit=true;
									continue;
								}else if(repair==6){
									System.out.println();
									continue;
								}
							}else if(yesNo==2){
								System.out.println();
								continue;
							}else if(money<700){
								System.out.println("\nSorry, insufficient funds");
								continue;
							}
						}else if(shop==3){
							System.out.print("\nMissles cost 50 credits each, is this ok? ");
							yesNo = yesNo();
							System.out.println();
							if(yesNo==1){
								System.out.print("How many missles would you like to purchase? ");
								numPurchased = input.nextInt();
								input.nextLine();
								if(money<(numPurchased*50)){
									System.out.println("\nSorry, insufficient funds");
									continue;
								}else{
									money-=(numPurchased*50);
									missles+=numPurchased;
									System.out.println();
									continue;
								}
							}else{
								continue;
							}
						}else if(shop==4){
							System.out.print("\nLasers cost 10 credits each, is this ok? ");
							yesNo = yesNo();
							System.out.println();
							if(yesNo==1){
								System.out.print("How many lasers would you like to purchase? ");
								numPurchased = input.nextInt();
								input.nextLine();
								if(money<(numPurchased*10)){
									System.out.println("\nSorry, insufficient funds");
									continue;
								}else{
									money-=(numPurchased*10);
									lasers+=numPurchased;
									System.out.println();
									continue;
								}
							}else{
								continue;
							}
						}else if(shop==6){
							System.out.println("Laser Level: "+laserLevel);
							System.out.println("\nMissle Level: "+missleLevel);
							System.out.println("\nShield Level: "+shieldLevel);
							System.out.println();
							upgrade=upgrade();
							if(upgrade==1){
								if(laserLevel==1){
									System.out.print("\nUpgrade Laser Cannon to Level 2? (This will cost 500 credits) ");
									yesNo = yesNo();
									System.out.println();
									if(yesNo==1 && money>=500){
										money-=500;
										laserLevel=2;
										System.out.println("Your Laser Cannon has been upgraded to Level 2");
										System.out.println();
										continue;
									}else if(yesNo==1 && money<500){
										System.out.println("Sorry, insufficient funds");
										System.out.println();
										continue;
									}else{
										continue;
									}
								}else if(laserLevel==2){
									System.out.print("\nUpgrade Laser Cannon to Level 3? (This will cost 750 credits) ");
									yesNo = yesNo();
									System.out.println();
									if(yesNo==1 && money>=750){
										money-=750;
										laserLevel=3;
										System.out.println("Your Laser Cannon has been upgraded to Level 3");
										System.out.println();
										continue;
									}else if(yesNo==1 && money<750){
										System.out.println("Sorry, insufficient funds");
										System.out.println();
										continue;
									}else{
										continue;
									}
								}else if(laserLevel==3){
									System.out.println("\nSorry, your Laser Cannon is at it's max level");
									continue;
								}
							}else if(upgrade==2){
								if(missleLevel==1){
									System.out.print("\nUpgrade Missle Cannon to Level 2? (This will cost 500 credits) ");
									yesNo = yesNo();
									System.out.println();
									if(yesNo==1 && money>=500){
										money-=500;
										missleLevel=2;
										System.out.println("Your Missle Cannon has been upgraded to Level 2");
										System.out.println();
										continue;
									}else if(yesNo==1 && money<500){
										System.out.println("Sorry, insufficient funds");
										System.out.println();
										continue;
									}else{
										continue;
									}
								}else if(missleLevel==2){
									System.out.print("\nUpgrade Missle Cannon to Level 3? (This will cost 750 credits) ");
									yesNo = yesNo();
									System.out.println();
									if(yesNo==1 && money>=750){
										money-=750;
										missleLevel=3;
										System.out.println("Your Missle Cannon has been upgraded to Level 3");
										System.out.println();
										continue;
									}else if(yesNo==1 && money<750){
										System.out.println("Sorry, insufficient funds");
										System.out.println();
										continue;
									}else{
										continue;
									}
								}else if(missleLevel==3){
									System.out.println("\nSorry, your Missle Cannon is at it's max level");
									continue;
								}
							}else if(upgrade==3){
								if(shieldLevel==1){
									System.out.print("\nUpgrade Shield to Level 2? (This will cost 750 credits) ");
									yesNo = yesNo();
									System.out.println();
									if(yesNo==1 && money>=750){
										money-=750;
										missleLevel=2;
										System.out.println("Your Shield has been upgraded to Level 2");
										System.out.println();
										continue;
									}else if(yesNo==1 && money<750){
										System.out.println("Sorry, insufficient funds");
										System.out.println();
										continue;
									}else{
										continue;
									}
								}else if(shieldLevel==2){
									System.out.print("\nUpgrade Shield to Level 3? (This will cost 1000 credits) ");
									yesNo = yesNo();
									System.out.println();
									if(yesNo==1 && money>=1000){
										money-=1000;
										missleLevel=3;
										System.out.println("Your Shield has been upgraded to Level 3");
										System.out.println();
										continue;
									}else if(yesNo==1 && money<1000){
										System.out.println("Sorry, insufficient funds");
										System.out.println();
										continue;
									}else{
										continue;
									}
								}else if(shieldLevel==3){
									System.out.println("\nSorry, your Shield is at it's max level");
									continue;
								}
							}else if(upgrade==4){
								continue;
							}
						}else{
							break;
						}
					}
				}else if(environment==4 && yesNo==1){ //Trading
					System.out.println("**Welcome to the Sector "+sector+" trade post");
					System.out.println("Here you can sell your ship parts\n");
					engineSSell = (int)(6*Math.random()+10);
					engineMSell = (int)(6*Math.random()+15);
					engineLSell = (int)(6*Math.random()+25);
					scrapMetalSell = 2;
					unknownCargoSell = (int)(26*Math.random()+5);
					valuableCargoSell = (int)(51*Math.random()+100);
					worthlessCargoSell = (int)(6*Math.random()+5);
					totalSell = (engineSSell*engineS)+(engineMSell*engineM)+(engineLSell*engineL)+(scrapMetalSell*scrapMetal)+(unknownCargoSell*unknownCargo)+(valuableCargoSell*valuableCargo)+(worthlessCargoSell*worthlessCargo);
					System.out.println();
					while(true){
						System.out.println("Merchant: \"With the current market prices, you can sell your goods for "+totalSell+" credits\"");
						System.out.print("Do you wish to sell? ");
						yesNo=yesNo();
						System.out.println();
						if(yesNo==1){
							System.out.println("Merchant: \"We have a deal\"");
							money+=totalSell;
							break;
						}else{
							System.out.println("Merchant: \"Shame we couldn't make a deal, come back another time\"");
							break;
						}
					}
				}else{
					continue;
				}
			}
		}
		System.out.println("\nYou lost");
	}
}