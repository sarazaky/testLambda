package testLambda;

public class Main {

	public static void main(String[] args) {
		
		String str1 = "First String";
		String str2 = "Second String";
		
		String longer = StringUtils.betterString(str1, str2, (s1,s2) -> s1.length() > s2.length());
		String first = StringUtils.betterString(str1, str2, (s1,s2) -> true);
		
		System.out.println(longer);
		System.out.println(first);
		

	}

}


