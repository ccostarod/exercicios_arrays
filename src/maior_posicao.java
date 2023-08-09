import java.util.Locale;
import java.util.Scanner;

public class maior_posicao {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Quantos numeros voce vai digitar? ");
        int size = sc.nextInt();

        double[] numbers = new double[size];

        for(int i = 0; i < numbers.length; i++){
            System.out.print("Digite um numero: ");
            numbers[i] = sc.nextDouble();
        }
        double aux = numbers[0];
        int pos = 0;
        for(int j = 0; j < numbers.length; j++){
            if (numbers[j] > aux){
                aux = numbers[j];
                pos = j;
            }
        }
        System.out.println("Maior Valor = " + aux);
        System.out.println("Posicao do maior valor = " + pos);


    }

}
