import java.util.Locale;
import java.util.Scanner;

public class abaixo_da_media {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int size = sc.nextInt();

        double[] array = new double[size];
        double soma = 0;
        for (int i = 0; i < array.length; i++){
            System.out.print("Digite um numero: ");
            array[i] = sc.nextDouble();
            soma += array[i];
        }
        double media = soma / size;
        System.out.printf("MEDIA DO VETOR = %.3f\n", media);

        System.out.println("ELEMENTOS ABAIXO DA MEDIA: ");
        for (int i = 0; i<array.length; i++){
            if (array[i] < media){
                System.out.println(array[i]);
            }
        }

    }
}
