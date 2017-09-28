package main.java.com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        short option = 0;
        double currentBalance = 1000;

        while (option != 4) {
            System.out.println("\t\t\t\t\t Credit Banco");
            System.out.println("\t************************************************");
            System.out.println("\t* Elija una opcion y presione Enter:           *");
            System.out.println("\t* 1. Consultar saldo                           *");
            System.out.println("\t* 2. Retirar dinero                            *");
            System.out.println("\t* 3. Ingresar dinero                           *");
            System.out.println("\t* 4. Salir                                     *");
            System.out.println("\t************************************************");

            Scanner scanner = new Scanner(System.in);
            option = scanner.nextShort();

            switch (option) {
                case 1:
                    System.out.println("Saldo: " + currentBalance);
                    break;
                case 2:
                    System.out.println("Cuanto desea retirar: ");
                    currentBalance -= scanner.nextDouble();
                    System.out.println("Saldo: " + currentBalance);
                    break;
                case 3:
                    System.out.println("Cuanto desea ingresar: ");
                    currentBalance += scanner.nextDouble();
                    System.out.println("Saldo: " + currentBalance);
                    break;
                case 4:
                    System.out.println("Hasta Luego");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        }

    }
}
