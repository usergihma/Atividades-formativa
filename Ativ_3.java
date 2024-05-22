package lpa_formativa;

import java.util.Scanner;

public class Ativ_3 {

	public static void main(String[] args) {
		try (Scanner ler = new Scanner(System.in)) {
			int soma, mult,sub,v1,v2;
			String operacao;

			System.out.println("Informe o primeiro valor");
			v1 = ler.nextInt();

			System.out.println("Informe o segundo valor");
			v2 = ler.nextInt();

			System.out.println("Informe a operação desejada: +(soma),-(subtração) ou *(multiplicação)");
			operacao = ler.next();

			if ( operacao.equals("+")){
				soma= v1 + v2;
				System.out.println("O resultado da soma é:" + soma);
			}


			else if( operacao.equals("-")){
				sub= v1 - v2;
				System.out.println("O resultado da subtração é:" + sub);
			}

			else {
				mult= v1*v2;
				System.out.println("O resultado da multiplicaçãp é:" + mult);
			}
		}

	}
}
