/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package application;

import java.util.Locale;
import java.util.Scanner;
import model.entities.Account;
import model.exceptions.BusinessException;

/**
 *
 * @author JonOliver
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter account data");
            System.out.print("Number: ");
            int number = sc.nextInt();
            System.out.print("Holder: ");
            sc.nextLine();
            String holder = sc.nextLine();
            System.out.print("Initial balance: ");
            double balance = sc.nextDouble();
            System.out.print("Withdraw limit: ");
            double withdrawLimit = sc.nextDouble();

            Account acc = new Account(number, holder, balance, withdrawLimit);

            System.out.println();
            System.out.print("Enter amount for withdraw: ");
            Double amount = sc.nextDouble();

            acc.withdraw(amount);
            System.out.println(acc.toString());
        } catch (BusinessException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }

}
