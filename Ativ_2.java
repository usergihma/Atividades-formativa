package lpa_formativa;

import java.util.Scanner;

public class Ativ_2 {

	public static void main(String[] args) {
		try (Scanner ler = new Scanner(System.in)) {
			double area,lado;

			System.out.println("Informe o lado do quadrado em cm");
			lado = ler.nextDouble();

			area = lado*lado;

			System.out.println("A área da figura é: " + area + "cm²");
		}

	}
}