import java.util.Locale;
import java.util.Scanner; 

public class pratica2_test_perguntas {
    public static void main(String[] args) {
        int sold;

        Scanner teclado = new Scanner(System.in);
        teclado.useLocale(Locale.US);


        while (true) {
            System.out.println(" ");
            System.out.printf("Leônidas está sendo questionado sobre quantos soldados seus 300 espartanos irão enfrentar, com isso precisamos de sua ajuda para da um palpite desse valor, será que você consegue adivinhar o número exato ou chegar perto?\n Digite o número de soldados: ");
            sold = teclado.nextInt();
            
            if (sold == 10000) {
            System.out.println("Você acertou em cheio, Parabéns!!!");
            teclado.close();
            break;
            }
            else if (sold < 9999 && sold > 8000) {
                System.out.println("Você quase acertou, está próximo, tente novamente");
            }
            else if (sold < 7999) {
                System.out.println("Você está ficando longe do resultado, tente novamente");
            }
            else if (sold < 3000) {
                System.out.println("Você está muito longe do resultado, vamos lá, você consegue");
            }
            else if (sold < 1000) {
                System.out.println("Você não passou nem perto, tenho certeza que da próxima você pode acertar, coloque mais soldados nesse palpite!");
            }
            else if (sold > 10001 && sold < 15000) {
                System.out.println("Você quase acertou, mas está muito ambicioso, diminua um pouco!");
            }
            else if (sold > 15000) {
                System.out.println("Você está muito longe, menos soldados, tente novamente");
            }
        }
    }
}
