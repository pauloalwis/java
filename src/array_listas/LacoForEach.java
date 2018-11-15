package array_listas;

public class LacoForEach {

	public static void foreach() {
		String[] vect = new String[] { "Domingo", "Segunda-Feira", "Terça-Feira", "Quarta-Feira", "Quninta-Feira",
				"Sexta-Feira", "Sábado", "" };

		for (String obj : vect) {
			System.out.println(obj);
		}
	}
}
