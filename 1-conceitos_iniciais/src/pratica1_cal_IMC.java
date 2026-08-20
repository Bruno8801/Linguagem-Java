import java.util.Locale;
import java.util.Scanner;

public class pratica1_cal_IMC {

    public static void main(String[] args) {
        int peso;
        double altura;

        Scanner teclado = new Scanner(System.in);
        teclado.useLocale(Locale.US);

        System.out.println("Digite seu Peso: ");
        peso = teclado.nextInt();
        System.out.println("Digite sua Altura em metros: ");
        altura = teclado.nextDouble();

        double IMC = (peso / (altura * altura));
        System.out.printf("Seu IMC é: %.3f%n", IMC);

        if (IMC < 18.5) {
            System.out.println("Você está abaixo do peso");
        }
        else if (IMC >= 18.5 && IMC <= 24.9) {
            System.out.println("Você está com o peso normal");

        }
        else if (IMC >= 25 && IMC <= 29.9) {
            System.out.println("Você está com sobrepeso");
        }
        else {
            System.out.println("Você está com obesidade");
        }

        teclado.close();
    }
}