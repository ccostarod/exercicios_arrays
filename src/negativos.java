
import java.util.Locale;
import java.util.Scanner;

public class negativos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Quantos numeros vai digitar: ");
        int tam = sc.nextInt();

        int[] vect = new int[tam];


        for (int i = 0; i < vect.length; i++){
            vect[i] = sc.nextInt();
        }

        System.out.println("NEGATIVE NUMBERS: ");
        for (int j = 0; j < vect.length; j++) {
            if (vect[j] < 0){
                System.out.println(vect[j]+"\n");
            }
        }



    }
}