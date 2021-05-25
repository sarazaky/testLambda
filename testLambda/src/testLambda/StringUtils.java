package testLambda;

import java.util.function.BiPredicate;

public class StringUtils {
	
	public static String betterString(String x, String y, BiPredicate<String, String> t) {
		
		return t.test(x, y) ? x: y ;
		
	}

}
