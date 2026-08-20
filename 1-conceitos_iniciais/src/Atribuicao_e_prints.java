import java.util.Locale;
import java.util.Scanner;

public class Atribuicao_e_prints {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		teclado.useLocale(Locale.US);

		int idade = 10;
		idade = idade +2;
		float peso = 72.8565895f; // deve-se colocar o caracter "f" no fim dos números quando usar float
		double peso2 = 72.8565895;

		/* float e double tem a mesma função de armazenar números quebrados, porem float é menos preciso nos decimais mas ocupa menos armazenamento, já double é mais preciso mas ocupa mais armazenamento. O ideal para escolher, depende da quantidade de dados que irá usar no seu código, pois um banco de dados com milhares de informações, podem consumir muito armazenamento se usar o double, caso não seja necessário apresentar todos os números dicimais com precisão, já se à mesmo necessidade de ser preciso na apresentação de seus dados, use double sacrificando mais memória por precisão*/
	
		System.out.println("Idade: " + idade);
		System.out.printf("Idade: %d\n", idade);
		System.out.println("Peso Float: " + peso);
		System.out.println("Peso Double: " + peso2);

		apresentacao(teclado);
		media3(teclado); /* chamar o próximo bloco de função do código (public static), pois no java só funciona o bloco principal (main), caso não chame os demais no final do main, eles não serão executados.*/

		teclado.close();

	}

	public static void apresentacao(Scanner teclado) {
		System.out.println("Olá usúario");
		System.out.println("Qual seu horário em formato 24h: ");
		float horario = teclado.nextFloat();

		if (horario >=6 && horario <=12) {
			System.out.println("Bom dia!");
		}
		else if (horario > 12 && horario <=18) {
			System.out.println("Boa tarde!");
		}
		else {
			System.out.println("Boa Noite!");
		}
	}
	public static float media3(Scanner teclado) {
		System.out.println("Qual as notas das 3 avaliações: ");
		float a = teclado.nextFloat();
		float b = teclado.nextFloat();
		float c = teclado.nextFloat();

		float res = (a + b + c) / 3;
		System.out.println("Média " + res);
		return res;
	}
}
