package main.java.com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        short option;
        double currentBalance = 1000;

        System.out.println("\t\t\t\t\t Credit Banco");
        System.out.println("\t************************************************");
        System.out.println("\t* Elija una opcion y presione Enter:           *");
        System.out.println("\t* 1. Consultar saldo                           *");
        System.out.println("\t* 2. Retirar dinero                            *");
        System.out.println("\t* 3. Ingresar dinero                           *");
        System.out.println("\t************************************************");

        Scanner scanner = new Scanner(System.in);
        option = scanner.nextShort();

        if(option == 1) {
            System.out.println("Saldo: " + currentBalance);
        }else {
            if(option == 2) {
                System.out.println("Cuanto desea retirar: ");
                currentBalance -= scanner.nextDouble();
                System.out.println("Saldo: " + currentBalance);
            }else {
                if(option == 3) {
                    System.out.println("Cuanto desea ingresar: ");
                    currentBalance += scanner.nextDouble();
                    System.out.println("Saldo: " + currentBalance);
                }else {
                    System.out.println("Opcion no valida");
                }
            }
        }

    }
}
