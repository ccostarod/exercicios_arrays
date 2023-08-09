import java.util.Locale;
import java.util.Scanner;

public class numeros_pares {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int size;
        System.out.print("Quantos numeros vai digitar? ");
        size = sc.nextInt();

        int[] numbers = new int[size];
        for (int i = 0; i < numbers.length; i++){
            System.out.print("Digite um numero: ");
            numbers[i] = sc.nextInt();
        }
        int soma = 0;
        System.out.println("NUMEROS PARES:");
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] % 2 == 0){
                System.out.print(numbers[i] + "  ");
                soma += 1;
            }
        }
        System.out.print("\nQUANTIDADE DE PARES = " + soma);
        sc.close();
    }


}
