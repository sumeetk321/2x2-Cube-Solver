
public class Cube {

	private String[][] c = new String[12][2];

	public Cube(String[] state) {
		for (int i = 0; i < 24; i++) {
			if (i % 2 == 0) {
				c[i / 2][0] = state[i];
			} else {
				c[(i - 1) / 2][1] = state[i];
			}
		}
	}

	public void print() {
		for (int i = 0; i < 12; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(c[i][j]);
			}
			System.out.println();
		}
	}

	public String[][] getC() {
		return c;
	}

	public void up() {
		String[][] c1 = c.clone();
		String r1 = c1[8][0] + c1[8][1];
		String r2 = c1[1][0] + c1[1][1];
		String r3 = c1[10][0] + c1[10][1];
		String r4 = c1[4][0] + c1[4][1];
		c1[1][0] = r1.charAt(1) + "";
		c1[1][1] = r1.charAt(0) + "";
		c1[10][0] = r2.charAt(1) + "";
		c1[10][1] = r2.charAt(0) + "";
		c1[4][0] = r3.charAt(0) + "";
		c1[4][1] = r3.charAt(1) + "";
		c1[8][0] = r4.charAt(0) + "";
		c1[8][1] = r4.charAt(1) + "";
		String u1 = c1[2][0];
		String u2 = c1[2][1];
		String u3 = c1[3][0];
		String u4 = c1[3][1];
		c1[2][1] = u1;
		c1[3][1] = u2;
		c1[2][0] = u3;
		c1[3][0] = u4;
		c = c1;
	}

	public void upPrime() {
		String[][] c1 = c.clone();
		String r1 = c1[8][0] + c1[8][1];
		String r2 = c1[1][0] + c1[1][1];
		String r3 = c1[10][0] + c1[10][1];
		String r4 = c1[4][0] + c1[4][1];
		c1[4][0] = r1.charAt(0) + "";
		c1[4][1] = r1.charAt(1) + "";
		c1[8][0] = r2.charAt(1) + "";
		c1[8][1] = r2.charAt(0) + "";
		c1[1][0] = r3.charAt(1) + "";
		c1[1][1] = r3.charAt(0) + "";
		c1[10][0] = r4.charAt(0) + "";
		c1[10][1] = r4.charAt(1) + "";
		String u1 = c1[2][0];
		String u2 = c1[2][1];
		String u3 = c1[3][0];
		String u4 = c1[3][1];
		c1[3][0] = u1;
		c1[2][0] = u2;
		c1[3][1] = u3;
		c1[2][1] = u4;
		c = c1;
	}

	public void right() {
		String[][] c1 = c.clone();
		String r1 = c1[6][1] + c1[7][1];
		String r2 = c1[4][1] + c1[5][1];
		String r3 = c1[2][1] + c1[3][1];
		String r4 = c1[0][1] + c1[1][1];
		c1[4][1] = r1.charAt(0) + "";
		c1[5][1] = r1.charAt(1) + "";
		c1[2][1] = r2.charAt(0) + "";
		c1[3][1] = r2.charAt(1) + "";
		c1[0][1] = r3.charAt(0) + "";
		c1[1][1] = r3.charAt(1) + "";
		c1[6][1] = r4.charAt(0) + "";
		c1[7][1] = r4.charAt(1) + "";
		String u1 = c1[10][0];
		String u2 = c1[10][1];
		String u3 = c1[11][0];
		String u4 = c1[11][1];
		c1[10][1] = u1;
		c1[11][1] = u2;
		c1[10][0] = u3;
		c1[11][0] = u4;
		c = c1;
	}

	public void rightPrime() {
		String[][] c1 = c.clone();
		String r1 = c1[6][1] + c1[7][1];
		String r2 = c1[4][1] + c1[5][1];
		String r3 = c1[2][1] + c1[3][1];
		String r4 = c1[0][1] + c1[1][1];
		c1[0][1] = r1.charAt(0) + "";
		c1[1][1] = r1.charAt(1) + "";
		c1[6][1] = r2.charAt(0) + "";
		c1[7][1] = r2.charAt(1) + "";
		c1[4][1] = r3.charAt(0) + "";
		c1[5][1] = r3.charAt(1) + "";
		c1[2][1] = r4.charAt(0) + "";
		c1[3][1] = r4.charAt(1) + "";
		String u1 = c1[10][0];
		String u2 = c1[10][1];
		String u3 = c1[11][0];
		String u4 = c1[11][1];
		c1[11][0] = u1;
		c1[10][0] = u2;
		c1[11][1] = u3;
		c1[10][1] = u4;
		c = c1;
	}

	public void front() {
		String[][] c1 = c.clone();
		String r1 = c1[3][0] + c1[3][1];
		String r2 = c1[10][0] + c1[11][0];
		String r3 = c1[6][0] + c1[6][1];
		String r4 = c1[8][1] + c1[9][1];
		c1[10][0] = r1.charAt(0) + "";
		c1[11][0] = r1.charAt(1) + "";
		c1[6][0] = r2.charAt(1) + "";
		c1[6][1] = r2.charAt(0) + "";
		c1[8][1] = r3.charAt(0) + "";
		c1[9][1] = r3.charAt(1) + "";
		c1[3][0] = r4.charAt(1) + "";
		c1[3][1] = r4.charAt(0) + "";
		String u1 = c1[4][0];
		String u2 = c1[4][1];
		String u3 = c1[5][0];
		String u4 = c1[5][1];
		c1[4][1] = u1;
		c1[5][1] = u2;
		c1[4][0] = u3;
		c1[5][0] = u4;
		c = c1;
	}

	public void frontPrime() {
		String[][] c1 = c.clone();
		String r1 = c1[3][0] + c1[3][1];
		String r2 = c1[10][0] + c1[11][0];
		String r3 = c1[6][0] + c1[6][1];
		String r4 = c1[8][1] + c1[9][1];
		c1[8][1] = r1.charAt(1) + "";
		c1[9][1] = r1.charAt(0) + "";
		c1[3][0] = r2.charAt(0) + "";
		c1[3][1] = r2.charAt(1) + "";
		c1[10][0] = r3.charAt(1) + "";
		c1[11][0] = r3.charAt(0) + "";
		c1[6][0] = r4.charAt(0) + "";
		c1[6][1] = r4.charAt(1) + "";
		String u1 = c1[4][0];
		String u2 = c1[4][1];
		String u3 = c1[5][0];
		String u4 = c1[5][1];
		c1[5][0] = u1;
		c1[4][0] = u2;
		c1[5][1] = u3;
		c1[4][1] = u4;
		c = c1;
	}

	public boolean isSolved() {
		boolean face1 = c[0][0].equals(c[0][1]) && c[0][0].equals(c[1][0]) && c[0][0].equals(c[1][1])
				&& c[0][1].equals(c[1][0]) && c[0][1].equals(c[1][1]) && c[1][0].equals(c[1][1]);
		boolean face2 = c[2][0].equals(c[2][1]) && c[2][0].equals(c[3][0]) && c[2][0].equals(c[3][1])
				&& c[2][1].equals(c[3][0]) && c[2][1].equals(c[3][1]) && c[3][0].equals(c[3][1]);
		boolean face3 = c[4][0].equals(c[4][1]) && c[4][0].equals(c[5][0]) && c[4][0].equals(c[5][1])
				&& c[4][1].equals(c[5][0]) && c[4][1].equals(c[5][1]) && c[5][0].equals(c[5][1]);
		boolean face4 = c[6][0].equals(c[6][1]) && c[6][0].equals(c[7][0]) && c[6][0].equals(c[7][1])
				&& c[6][1].equals(c[7][0]) && c[6][1].equals(c[7][1]) && c[7][0].equals(c[7][1]);
		boolean face5 = c[8][0].equals(c[8][1]) && c[8][0].equals(c[9][0]) && c[8][0].equals(c[9][1])
				&& c[8][1].equals(c[9][0]) && c[8][1].equals(c[9][1]) && c[9][0].equals(c[9][1]);
		boolean face6 = c[10][0].equals(c[10][1]) && c[10][0].equals(c[11][0]) && c[10][0].equals(c[11][1])
				&& c[10][1].equals(c[11][0]) && c[10][1].equals(c[11][1]) && c[11][0].equals(c[11][1]);
		return face1&&face2&&face3&&face4&&face5&&face6;
	}
}
