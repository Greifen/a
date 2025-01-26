package a;

public class Palindrom {

	/**
	 * Methode, die überprüft, ob ein String ein Palindrom ist.
	 * 
	 * @param string
	 * @return true, wenn der String ein Palindrom ist, sonst false
     */
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
