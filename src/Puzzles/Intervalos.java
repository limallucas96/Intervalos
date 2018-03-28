package Puzzles;


import java.util.ArrayList;
import java.util.Arrays;

public class Intervalos {

	public static void main(String[] args) {

		ArrayList<Integer> lista = new ArrayList<Integer>(
				Arrays.asList(100, 101, 102, 103, 104, 105, 110, 111, 113, 114, 115, 150));
		
		String saida = "";
		int count = -1;

		for (int i : lista) {
			int prox = i + 1;
			if ((prox - i) == 1) {
				count += 1;
				if (prox == 106 || prox == 112 || prox == 116 || prox == 151) {
					int ultimoTermo = (prox - 1);
					System.out.println(ultimoTermo);
					int primeiroTermo = ultimoTermo - count;
					if (primeiroTermo == lista.get(lista.size()-1)) {
						saida += "[" + primeiroTermo + "]";
						break;
					}
					saida += ("[" + primeiroTermo + "-" + ultimoTermo + "], ");
					count = -1;
				}
			}
		}
		System.out.println("Saída: " + saida);
	}

}
