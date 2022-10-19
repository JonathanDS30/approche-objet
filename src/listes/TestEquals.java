package listes;

public class TestEquals {

	public static void main(String[] args) {

		Ville v1 = new Ville("Vergèze", 3000);
		Ville v2 = new Ville("Vergèze", 3000);
		System.out.println(v1 == v2);
		System.out.println(v1.equals(v2));
	}

}
