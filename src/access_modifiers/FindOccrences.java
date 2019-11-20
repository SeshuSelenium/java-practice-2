package access_modifiers;

public class FindOccrences {
	public static void main(String[] args) {
		int count = 0;
		String Str1 = "aniltestkumar";

		for (int i = 0; i < Str1.length(); i++) {
			if (Str1.charAt(i) == 't') {
				if (Str1.charAt(i + 1) == 'e') {
					if (Str1.charAt(i + 2) == 's') {
						if (Str1.charAt(i + 3) == 't') {
							count = count + 1;
						}
					}
				}
			}

		}
		System.out.println("test count is" + " " + count);
	}

}
