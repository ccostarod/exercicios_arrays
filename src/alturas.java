import java.util.Locale;
import java.util.Scanner;

public class alturas {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Quantas pessoas serao digitas? ");
        int size = sc.nextInt();

        String[] nomes = new String[size];
        String[] nomes_menores = new String[size];
        int[] idades = new int[size];
        double[] alturas = new double[size];

        int soma_menores = 0;
        double soma_altura = 0;
        int j = 0;

        for (int i= 0; i < size; i++){
            System.out.printf("Dados da %da pessoa\n", i + 1);
            System.out.print("Nome: ");
            nomes[i] = sc.next();
            System.out.print("Idade: ");
            idades[i] = sc.nextInt();
            System.out.print("Altura: ");
            alturas[i] = sc.nextDouble();


            soma_altura += alturas[i];
            if (idades[i] < 16) {
                soma_menores += 1;

                nomes_menores[j] = nomes[i];
                j++;

            }
        }
        int porcentagem = soma_menores*100/size;
        double media_altura = soma_altura / size;
        System.out.printf("\nAltura media: %.2f\n",media_altura);
        System.out.println("Pessoas menores de 16 anos: " + porcentagem + "%");
        for (int i = 0; i < soma_menores; i++){
            System.out.println(nomes_menores[i]);
        }
    }
}
