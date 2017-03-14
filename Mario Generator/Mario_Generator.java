import java.util.*;
public class Mario_Generator{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
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
		/*
		 *Add new pieces here
		 *Make sure it has a unique piece number
		 */
		String[] pieceEnd = new String[8];
		/*
		 *Each piece is 8 lines high and is typically 12 characters long, but length can be as long or short as you want (each layer must have the same character length)
		 *A typical piece has 4 lines of ground layers and 4 lines of sky layers, but as long as all 8 layers, are present, your piece will work
		 */
		for(int i=7; i>=4; i--){
			piece2[i]="OOOOOOOOOOOO";
			piece3[i]="OOOOOOOOOOOO";
			piece4[i]="OOOOOOOOOOOO";
			piece5[i]="OOOOOOOOOOOO";
			piece6[i]="OOOOOOOOOOOO";
			piece9[i]="OOOOOOOOOOOO";
			/*
			 *If your new piece has 4 ground layers, add it here
			 */
			pieceEnd[i]="OOOOOOOOOOOOOOOOOOOOOOOOOOOO";
		}
		for(int i=0; i<4; i++){
			piece3[i]="            ";
			piece7[i]="            ";
			piece8[i]="            ";
			/*
			 *If your piece has the top 4 layers empty, add it here
			 */
		}
		for(int i=7; i>=4; i--){
			piece1[i]="OOOOO  OOOOO";
		}
		for(int i=7; i>=4; i--){
			piece7[i]="OOOO    OOOO";
		}
		piece1[0]="    O  O    ";
		piece1[1]="   OO  OO   ";
		piece1[2]="  OOO  OOO  ";
		piece1[3]=" OOOO  OOOO ";
		piece2[0]="    O  O    ";
		piece2[1]="   OO  OO   ";
		piece2[2]="  OOO  OOO  ";
		piece2[3]=" OOOO  OOOO ";
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
		/*
		 *Specify the remaining layers of your piece here
		 *
		 *The top layer of your piece is layer 0, the bottom is layer 7
		 *
		 *If there are unspecified layers, "null" will appear on the output
		 */
		pieceEnd[0]="   O     |>   +=======+    ";
		pieceEnd[1]="  OO     |    |   _   |    ";
		pieceEnd[2]=" OOO     |   +-+ / \\ +-+    ";
		pieceEnd[3]="OOOO     |   | | | | | |    ";
		int numPieces = 9; //If you have changed the number of pieces available, modify this number to correspond to the highest piece number
		int[] level = new int[length];
		for(int i=1; i<length-1; i++){ 
			level[i]=(int)(Math.random()*numPieces);
		}
		level[0]=2;
		level[length-1]=-1;
		System.out.println();
		System.out.println();
		for(int i=0; i<8; i++){
			for(int j=0; j<length; j++){
				switch(level[j]){
					case 0: System.out.print(piece1[i]); break;
					case 1: System.out.print(piece2[i]); break;
					case 2: System.out.print(piece3[i]); break;
					case 3: System.out.print(piece4[i]); break;
					case 4: System.out.print(piece5[i]); break;
					case 5: System.out.print(piece6[i]); break;
					case 6: System.out.print(piece7[i]); break;
					case 7: System.out.print(piece8[i]); break;
					case 8: System.out.print(piece9[i]); break;
					/*
					 *Added pieces should go here. The case number is 1 less than your piece number (ex: piece 10->case 9, piece 20->case 19)
					 */
					default: System.out.print(pieceEnd[i]); break;
				}
			}
			System.out.println();
		}
	}
}
