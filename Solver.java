import java.util.Arrays;
import java.util.Scanner;

public class Solver {
	static Cube solved = new Cube(new String[] { "b", "b", "b", "b", "w", "w", "w", "w", "g", "g", "g", "g", "y", "y",
			"y", "y", "o", "o", "o", "o", "r", "r", "r", "r" });

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println(
				"Enter color pattern, row by row, in the following order: back, top, front, bottom, left, right");
		String[] state = scan.nextLine().split("");
		Cube cube = new Cube(state);
		if (cube.isSolved()) {
			System.out.println("ALREADY SOLVED");
			System.exit(0);
		}
		long startTime = System.currentTimeMillis();
		for (int i = 1; i < 14; i++) {
			for (int j = 0; j < Math.pow(6, i); j++) {
				cube = new Cube(state);
				String alg = Integer.toString(j, 6);
				if (alg.length() < i) {
					int len = alg.length();
					for (int k = 0; k < i - alg.length(); k++) {
						alg = "0" + alg;
					}
				}
				String solution = "";
				for (int k = 0; k < alg.length(); k++) {
					switch (alg.charAt(k) + "") {
					case "0":
						cube.up();
						solution += "U ";
						break;
					case "1":
						cube.upPrime();
						solution += "U' ";
						break;
					case "2":
						cube.right();
						solution += "R ";
						break;
					case "3":
						cube.rightPrime();
						solution += "R' ";
						break;
					case "4":
						cube.front();
						solution += "F ";
						break;
					case "5":
						cube.frontPrime();
						solution += "F' ";
						break;
					}

				}

				if (cube.isSolved()) {
					solution = solution.replace("U U", "U2");
					solution = solution.replace("U' U'", "U2");
					solution = solution.replace("R R", "R2");
					solution = solution.replace("R' R'", "R2");
					solution = solution.replace("F F", "F2");
					solution = solution.replace("F' F'", "F2");
					System.out.println("SOLVED! in " + (System.currentTimeMillis() - startTime) + " milliseconds.");
					System.out.println(solution);
					System.exit(0);
				}

			}
		}
	}

}
