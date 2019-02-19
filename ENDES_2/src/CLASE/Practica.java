package CLASE;

public class Practica {

	public static int contar(char txt[], char letra) {

		int cont = 0, x = 0, longuitud = txt.length;

		if (longuitud > 0) {
			do {
				if (txt[cont] == letra)
					x++;
				cont++;
				longuitud--;
			} while (longuitud > 0);
		}
		return x;
	}

}
