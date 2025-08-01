package org.corecode.ui;

import org.corecode.model.Friend;

import java.util.Scanner;

public class AppUi {
    public static void main(String[] args) {
        MenuUi menuUi=new MenuUi();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add Friend");
            System.out.println("2. Display All Friends");
            System.out.println("3. Delete Friend");
            System.out.println("4. Update Friend");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Clear buffer

            switch (choice) {
                case 1:
                    menuUi.addfriend();
                    break;
                case 2:
                    menuUi.displayAllfriends();
                    break;
                case 3:
                    menuUi.deleteFriend();
                    break;
                case 4:
                    menuUi.updateFriend();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
