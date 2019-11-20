  package data_types;

public class DataTypes_in_array {

	public static void main(String[] args) {
		// character data type array
		char[][] a = new char[3][2];

		a[0][0] = 'a';
		a[0][1] = 'b';
		a[1][0] = 'c';
		a[1][1] = 'd';
		a[2][0] = 'e';
		a[2][1] = 'f';
 
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				System.out.println(a[i][j]);
			}
		}

		// string array data type
		String[][] s = new String[4][3];
		s[0][0] = "red";
		s[0][1] = "apple";
		s[0][2] = "seshu";
		s[1][0] = "health";
		s[1][1] = "yellow";
		s[1][2] = "banana";
		s[2][0] = "iron";
		s[2][1] = "green";
		s[2][2] = "mango";
		s[3][0] = "heat";
		s[3][1] = "orange";
		s[3][2] = "orange";

		/*
		 * System.out.println(s[0][0][0]); System.out.println(s[0][1][1]);
		 * System.out.println(s[0][2][2]); System.out.println(s[1][0][0]);
		 * System.out.println(s[1][1][1]); System.out.println(s[1][2][2]);
		 * System.out.println(s[2][0][0]); System.out.println(s[2][1][1]);
		 * System.out.println(s[2][2][2]); System.out.println(s[3][0][0]);
		 * System.out.println(s[3][1][1]); System.out.println(s[3][2][2]);
		 */

		for (int i = 0; i < s.length; i++) {
			for (int j = 0; j < s[0].length; j++) {

				System.out.println(s[i][j]);

			}
		}
		// Integer array
		int[][] i = new int[5][5];

		i[0][0] = 10;
		i[0][1] = 11;
		i[0][2] = 12;
		i[0][3] = 13;
		i[0][4] = 14;
		i[1][0] = 20;
		i[1][1] = 21;
		i[1][2] = 22;
		i[1][3] = 23;
		i[1][4] = 24;
		i[2][0] = 30;
		i[2][1] = 31;
		i[2][2] = 32;
		i[2][3] = 33;
		i[2][4] = 34;
		i[3][0] = 40;
		i[3][1] = 41;
		i[3][2] = 42;
		i[3][3] = 43;
		i[3][4] = 44;
		i[4][0] = 50;
		i[4][1] = 51;
		i[4][2] = 52;
		i[4][3] = 53;
		i[4][4] = 54;

		for (int j = 0; j < i.length; j++) {
			for (int j2 = 0; j2 < i[0].length; j2++) {
				System.out.println(i[j][j2]);

			}

			int[] r = new int[5];
			r[0] = 1;
			r[1] = 2;
			r[2] = 3;
			r[3] = 4;
			r[4] = 5;
			for (int k = 0; k < r.length; k++) {
				System.out.println(r[k]);

			}

			// single dimensional array
			System.out.println("\nsingle dimensional array \n");
			int[] x = { 10, 20, 30, 40 };
			for (int k = 0; k < x.length; k++) {
				System.out.println(x[k]);
			}

			// for-each loop(enhanced for loop) it is best for arrays and collections
			System.out.println("\nfor-each loop\n");
			for (int x1 : x) {
				System.out.println(x1);
			}

			// two dimensional arrays with normal for loop
			System.out.println("\ntwo dimensional array with normal for loop\n");
			int[][] t = { { 1, 2, 3 }, { 4, 5 } };
			for (int k = 0; k < t.length; k++) {
				for (int k2 = 0; k2 < t[k].length; k2++) {
					System.out.println(t[k][k2]);
				}
			}
			// two dimensional arrays with normal for-each loop
			System.out.println("two dimensional arrays with normal for-each loop");
			for (int[] t1 : t) {
				for (int t2 : t1) {
					System.out.println(t2);
				}
				// multiple dimensional array
				int[][][] tr = { { { 11, 22 }, { 33, 55 } }, { { 55, 66 }, { 22, 33 } }, { { 88, 99 }, { 77, 66 } },
						{ { 12, 23 }, { 45, 63 } } };
				for (int[][] tr1 : tr) {
					for (int[] tr2 : tr1) {
						for (int tr3 : tr2) {
							System.out.println(tr3);
						}
					}
				}

				for (int k = 0; k < tr.length; k++) {
					System.out.println("student no: " + k);
					for (int l = 0; l < tr[k].length; l++) {
						System.out.println("exam no: " + (k + 1));
						System.out.println("marks are");
						for (int m = 0; m < tr[k][l].length; m++) {
							System.out.print(tr[k][l][m] + "\t");
						}
						System.out.println();
					}
					System.out.println();
				}
			}

		}
	}

}
