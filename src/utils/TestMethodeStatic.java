package utils;

public class TestMethodeStatic {
	public static String chaine = "12";

	public static void main(String[] args) {
		int test = Integer.valueOf(chaine);
		System.out.println(test);
		int a = 25;
		int b = 10;
		int max = Integer.max(a, b);
		System.out.println("la valeur max est" + max);
	}

}
