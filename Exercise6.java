
public class Exercise6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "Hello";
		String s2 = s1;
		System.out.println("s1 == s2 : " + (s1 == s2));
		System.out.println("s1 equals : " + s1.equals(s2));			

		s1 = s1.concat(" ya");
		s2 = s2.concat(" ya");
		System.out.println("s1 == s2 : " + (s1 == s2));
		System.out.println("s1 equals : " + s1.equals(s2));

		s1 = s1.concat(" you");
		System.out.println("s1 == s2 : " + (s1 == s2));
		System.out.println("s1 equals : " + s1.equals(s2));

	}

}
