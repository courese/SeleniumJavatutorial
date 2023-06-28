package Java.basics;

public class String_length_ {
	String str = " maha.r ";
	String str1 = " maha r";
	public void space()
	{
		System.out.println("the given name length is " +str.length()+ " letter");
		System.out.println(str.charAt(3));
		System.out.println(str.indexOf("a"));
		System.out.println(str.equals(str1));
		System.out.println(str.equalsIgnoreCase(str1));
		System.out.println(str.compareTo(str1));
		System.out.println(str.contains(str1));
		System.out.println(str.toLowerCase());
		System.out.println(str.trim());
		System.out.println(str.replace(".","_"));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String_length_ s =new String_length_();
		s.space();

	}

}
