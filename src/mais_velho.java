
import java.util.Locale;
import java.util.Scanner;

public class mais_velho {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        System.out.print("Quantas pessoas voce vai digitar? ");
        int size = sc.nextInt();

        String[] nomes = new String[size];
        int[] idades = new int[size];

        for (int i = 0; i < size; i++){
            System.out.printf("Dados da %da pessoa: \n", i+1);
            System.out.print("Nome: ");
            nomes[i] = sc.next();
            System.out.print("Idade: ");
            idades[i] = sc.nextInt();
        }
        int aux = idades[0];
        int x = 0;
        for (int i = 0; i < size; i++){
            if (idades[i] > aux){
                aux = idades[i];
                x = i;
            }
        }
        System.out.println("PESSOA MAIS VELHA: " + nomes[x]);

    }
}
