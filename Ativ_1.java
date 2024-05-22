package lpa_formativa;

import java.util.Scanner;

public class Ativ_1 {

	public static void main(String[] args) {
		try (Scanner ler = new Scanner(System.in)) {
			double celcius,fahrenheit;

			System.out.println("Informe a temperatura em fahrenheit");
			fahrenheit = ler.nextDouble();

			celcius = ((fahrenheit - 32)*5)/9;

			System.out.println("A temperatura convertida em celcius é: " + celcius + "celcius");
		}

	}
}