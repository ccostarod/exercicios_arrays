import java.util.Locale;
import java.util.Scanner;

public class media_pares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int size = sc.nextInt();

        int[] vect = new int[size];
        int soma = 0;
        int quant = 0;
        for (int i = 0; i < vect.length; i++){
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextInt();
            if (vect[i] % 2 == 0){
                soma += vect[i];
                quant += 1;
            }
        }
        double media = (double) soma / quant;
        if (quant == 0)System.out.println("NENHUM NUMERO PAR");

        else System.out.printf("MEDIA DOS PARES = %.1f\n", media);

    }
}
