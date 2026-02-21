package Recursion.Palindrome;

public class PalindromeRunner {
	public static void main(String[] args){
		// Here we show both an iterative and recursive solution
		// to determining if a String is a palindrome

		// taco cat is a palindrome as it is the same backwards and forwards
		String s1 = "taco cat";
		String cleaned = cleanString(s1);
		boolean recu = isPalindromeRecursive(cleaned);
		boolean iter = isPalindromeIterative(cleaned);
		System.out.printf("%s :: %b\t%b\n", s1, recu, iter);

		// The following String is obviously not a palindrome
		String s2 = "Sphinx of black quartz, judge my vow";
		cleaned = cleanString(s2);
		recu = isPalindromeIterative(cleaned);
		iter = isPalindromeIterative(cleaned);
		System.out.printf("%s :: %b\t%b\n", s2, recu, iter);

	}

	public static String cleanString(String s){
		// converts the string to lowercase and removes whitespace and punctuation
		return s.toLowerCase().replaceAll("[\s!.,?]", "");
	}

	public static boolean isPalindromeRecursive(String s){
		// This is the recursive solution to determine if a String
		// is a palindrome

		// Base case because
		// "" is trivially a palindrome
		// "a" or any single letter is also trivially a palindrome
		if(s.length() <= 1){
			return true;
		}

		// Check if the beginning and end letters are the same
		// if of the form "a?a", run the function on "?"
		if(s.charAt(0) == s.charAt(s.length()-1)){
			return isPalindromeRecursive(s.substring(1, s.length()-1));
		}

		return false;
	}

	public static boolean isPalindromeIterative(String s){
		// This is the iterative solution to determine if a String
		// is a palindrome

		// For each iteration, check if index opposite of the current loop is the same
		for(int i = 0; i < s.length()/2; i++){
			if(s.charAt(i) != s.charAt(s.length()-i-1)){
				return false;
			}
		}

		// if it makes it through the for-loop
		// it's a palindrome
		return true;
	}
}
