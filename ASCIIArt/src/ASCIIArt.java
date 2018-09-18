/*
 * Unit 1 Project
 * 
 * In this project you have the opportunity to create a piece of artwork using ASCII 
 * (American Standard Code for Information Interchange). Using the already created file 
 * named `ASCIIArt.java` write a program that outputs your artwork to the console. 
 * The goal of this project is to use ONLY what we have learned in Unit 1 to create 
 * anything you would like so be creative (and school appropriate). Artwork must also have a caption describing what it's depicting.  
 * 
 * For those of you who have dabbled in coding before, try to contain your code to 
 * just what we have discussed in this unit.  
 * 
 * @author Mr. Rasmussen 
 *
 */

// YOUR CODE GOES HERE :)
public class ASCIIArt {
	public static void main(String[] args) {
		LetterS();
		System.out.println();
		LetterK();
		System.out.println();
		LetterY();
		System.out.println();
		LetterL();
		System.out.println();
		LetterE();
		System.out.println();
		LetterR();
		System.out.println("\n\n");
		LastInital();
	}
	// printing the letter S
	public static void LetterS () {
		sLines();
		System.out.println("S     S");
		System.out.println("S     ");
		sLines();
		System.out.println("      S");
		System.out.println("S     S");
		sLines();
	}
	public static void sLines () {
		System.out.println(" SSSSS ");
	}
	// printing the letter K
	public static void LetterK () {
		System.out.println("K    K");
		System.out.println("K   K");
		System.out.println("K  K");
		System.out.println("K K");
		System.out.println("K  K");
		System.out.println("K   K");
		System.out.println("K    K");
	}
	// printing the letter Y
	public static void LetterY () {
		System.out.println("Y     Y");
		System.out.println(" Y   Y");
		System.out.println("  Y Y");
		yLines();
		yLines();
		yLines();
		yLines();
	}
	public static void yLines() {
		System.out.println("   Y");
	}
	// printing the letter L
	public static void LetterL () {
		lLines();
		lLines();
		lLines();
		lLines();
		lLines();
		lLines();
		System.out.println("LLLLLLL");
	}
	public static void lLines () {
		System.out.println("L");
	}
	// printing the letter E
	public static void LetterE () {
		eLines();
		System.out.println("E");
		System.out.println("E");
		eLines();
		System.out.println("E");
		System.out.println("E");
		eLines();
	}
	public static void eLines () {
		System.out.println("EEEEEEE");
	}
	// printing the letter R
	public static void LetterR () {
		rLines();
		System.out.println("R    R");
		System.out.println("R    R");
		rLines();
		System.out.println("R  R");
		System.out.println("R   R");
		System.out.println("R    R");
	}
	public static void rLines () {
		System.out.println("RRRRR");
	}
	// printing the letter T and a dot as the last name initial
	public static void LastInital () {
		System.out.println("TTTTTTT");
		tLines();
		tLines();
		tLines();
		System.out.println("   T   _");
		System.out.println("   T  / \\");
		System.out.print("   T  \\_/");
	}
	public static void tLines () {
		System.out.println("   T");
	}
}
