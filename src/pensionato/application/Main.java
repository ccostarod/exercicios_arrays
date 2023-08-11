package pensionato.application;

import pensionato.entities.Estudante;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        final int QUANT_ROOMS = 10;
        Estudante[] rooms = new Estudante[QUANT_ROOMS];

        System.out.print("How many rooms will be rented? ");
        int rent = sc.nextInt();

        String name;
        String email;
        int room_number;


        for (int j = 0; j < rent; j++){
            System.out.println("Rent #" + (j+1) + ":");
            System.out.print("Name: ");
            name = sc.next();
            sc.nextLine();
            System.out.print("Email: ");
            email = sc.next();
            sc.nextLine();
            System.out.print("Room: ");
            room_number = sc.nextInt();

            rooms[room_number] = new Estudante(name, email, room_number);;
        }

        System.out.println("Busy rooms: ");
        for (int i = 0; i<QUANT_ROOMS;i++){
            if (rooms[i] != null){
                System.out.print(rooms[i].getRoom()+": ");
                System.out.printf("%s, %s\n", rooms[i].getName(), rooms[i].getEmail());
            }

        }
        for (int i = 0; i < QUANT_ROOMS; i++){
            System.out.println(rooms[i]);
        }
    }
}
