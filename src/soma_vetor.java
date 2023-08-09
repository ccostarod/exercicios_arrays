import java.util.Locale;
import java.util.Scanner;

public class soma_vetor {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        System.out.print("enter vector size: ");
        int size = sc.nextInt();

        double[] array = new double[size];

        for(int i = 0; i < array.length; i++){
            System.out.print("Type a number: ");
            array[i] = sc.nextDouble();
        }
        double soma = 0;
        System.out.print("VALORES = ");
        for(int j = 0; j < array.length; j++){
            System.out.print(array[j] + "   ");
            soma += array[j];
        }

        System.out.printf("\nSOMA = %.2f\n", soma);
        System.out.printf("MEDIA = %.2f\n", soma/size);

    }

}
