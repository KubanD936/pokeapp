import java.io.File;
import java.util.Scanner;

class Pokedex {
	public static void main (String[] args) {
		if (args.length < 1) {
			System.out.println("\nError: No filename provided.");
			System.out.println("\tUsage: java Pokedex <filename>");
		} else {
		String filename = args[0];
		// System.out.println("Num of args: " + args.length");
		File pokedex = new File(filename);
		scanner sc = new Scanner(pokedex);
		while (sc.hasNext()) {
			System.out.println(sc.next());
			}
		}
	}
}
