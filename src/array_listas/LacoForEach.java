package array_listas;

public class LacoForEach {

	public static void foreach() {
		String[] vect = new String[] { "Domingo", "Segunda-Feira", "Ter�a-Feira", "Quarta-Feira", "Quninta-Feira",
				"Sexta-Feira", "S�bado", "" };

		for (String obj : vect) {
			System.out.println(obj);
		}
	}
}
