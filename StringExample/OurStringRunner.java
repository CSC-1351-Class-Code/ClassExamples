package StringExample;


// This is an example of of the String variable/object/class
// works under the hood
// Just further examples of how classes and instances work
public class OurStringRunner {
	public static void main(String[] args){
		String str = "hello";
		char[] arr = {'h','e','l','l','o'};
		OurString s = new OurString(arr);


		System.out.println(str);
		s.printString();
		System.out.println();


		char c = 'l';

		System.out.println(str.indexOf(c));
		System.out.println(s.indexOf(c));


		int i = 2;
		System.out.println(str.charAt(i));
		System.out.println(s.charAt(i));
	}
}
