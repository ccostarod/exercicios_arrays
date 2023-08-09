import java.util.Locale;
import java.util.Scanner;

public class soma_vetores {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Quantos valores vao ter cada vetor? ");
        int size = sc.nextInt();

        int[] vect_A = new int[size];
        int[] vect_B = new int[size];
        int[] vect_C = new int[size]; // Resultante.

        System.out.println("Digite os valores do vetor A: ");
        for (int i = 0; i < size; i++){
            vect_A[i] = sc.nextInt();
        }
        System.out.println("Digite os valores do vetor B: ");
        for (int i = 0; i < size; i++){
            vect_B[i] = sc.nextInt();
        }
        System.out.println("VETOR RESULTANTE: ");
        for (int i = 0; i < size; i++){
            vect_C[i] = vect_A[i] + vect_B[i];
        }
        for (int i = 0; i < size; i++){
            System.out.println(vect_C[i]);
        }
    }
}
