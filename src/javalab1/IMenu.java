/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalab1;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public interface IMenu {
    public static int Menu() {
        int choice = 0;
        while (choice < 1 || choice > 5) {
            System.out.println("WELCOME TO HKT SHOP");
            System.out.println("1. Add Phone");
            System.out.println("2. Search a phone by model");
            System.out.println("3. Delete a phone");
            System.out.println("4. Print the phone list");
            System.out.println("5. Exit");
            Scanner sc = new Scanner(System.in);
            System.out.print("Your choice: ");
            try {
                choice = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Invalid choice. Try again.");
            }
        }
        return choice;
    }
}
