package a;

public class Palindrom {

	public boolean isPalindrom(String string) {
		char [] charArray = string.toCharArray();
		for (int i = 0; i < charArray.length / 2; i++) {
			if (charArray[i] != charArray[charArray.length - 1 - i]) {
				return false;
			}
		}
		
		return true;
	}

}
