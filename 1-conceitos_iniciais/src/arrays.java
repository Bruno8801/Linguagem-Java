import java.util.Arrays;

public class arrays {
    public static void main(String[] args) {
        int[] megaSena = {11,14,21,30,37,56};
        
        // Para fazer edição de números em arrays (matrizes)
        megaSena[0] = 10;
        System.out.printf("%s%n", Arrays.toString(megaSena)); // print convertendo arrays em string

        int[][] matriz = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}
