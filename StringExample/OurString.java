package StringExample;

public class OurString {
	private char[] string;

	public OurString(char[] s){
		string = s;
	}

	public char charAt(int index) throws IndexOutOfBoundsException{
		return string[index];
	}

	public void concat(char[] string2){
		char[] new_str = new char[string.length + string2.length];

		for(int i = 0; i < string.length; i++){
			new_str[i] = string[i];
		}
		for(int i = 0; i < string2.length; i++){
			new_str[i+string.length] = string2[i];
		}
		string = new_str;
	}

	public int indexOf(char c){
		for(int i = 0; i < string.length; i++){
			if(string[i] == c){
				return i;
			}
		}
		return -1;
	}


	public void printString(){
		for(char c : string){
			System.out.print(c);
		}
	}
}
