package Pokky.Pink;

public class reverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "nui";
		String newStr = "";
		
		for(int i = 0; i < str.length(); i ++) {
			newStr = newStr + str.charAt(i);
		}
		
		System.out.println(newStr);

	}

}
