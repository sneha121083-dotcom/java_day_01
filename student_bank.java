import java.util.*;
public class student_bank {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // --- ACCOUNT CREATION ---
        System.out.println("========== STUDENT BANK ACCOUNT CREATION ==========");

        System.out.print("Enter Student Name: ");
        String studentName = sc.nextLine();

        System.out.print("Enter Student ID: ");
        String studentId = sc.nextLine();

        System.out.print("Enter Account Number: ");
        String accountNumber = sc.nextLine();

        double balance = 0;

        // Validation loop for positive initial deposit
        while (true) {

            System.out.print("Enter Initial Deposit: ");

            if (sc.hasNextDouble()) {

                double initialDeposit = sc.nextDouble();

                if (initialDeposit > 0) {
                    balance = initialDeposit;
                    break;
                } 
                else {
                    System.out.println("Error: Initial deposit must be greater than 0.");
                }

            } 
            else {
                System.out.println("Error: Invalid numerical input.");
                sc.next();
            }
        }

        System.out.println("Account created successfully!\n");

        // --- MAIN MENU LOOP ---
        int choice = 0;

        while (choice != 6) {

            System.out.println("========= STUDENT BANK SYSTEM =========");
            System.out.println("1. Deposit Money");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Check Balance");
            System.out.println("4. Display Account Details");
            System.out.println("5. Calculate Interest");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");

            if (!sc.hasNextInt()) {
                System.out.println("Error: Please enter a valid number between 1 and 6.\n");
                sc.next();
                continue;
            }

            choice = sc.nextInt();

            switch (choice) {

                // --- DEPOSIT ---
                case 1:

                    System.out.print("Enter deposit amount: ");

                    if (sc.hasNextDouble()) {

                        double depositAmount = sc.nextDouble();

                        if (depositAmount > 0) {

                            balance += depositAmount;

                            System.out.printf(
                                "₹%.2f deposited successfully.%n",
                                depositAmount
                            );

                            System.out.printf(
                                "Current Balance: ₹%.2f%n%n",
                                balance
                            );

                        } 
                        else {
                            System.out.println(
                                "Error: Amount must be greater than 0.\n"
                            );
                        }

                    } 
                    else {
                        System.out.println(
                            "Error: Invalid amount entered.\n"
                        );
                        sc.next();
                    }

                    break;


                // --- WITHDRAW ---
                case 2:

                    System.out.print("Enter withdrawal amount: ");

                    if (sc.hasNextDouble()) {

                        double withdrawAmount = sc.nextDouble();

                        if (withdrawAmount <= 0) {

                            System.out.println(
                                "Error: Amount must be greater than 0.\n"
                            );

                        } 
                        else if (withdrawAmount > balance) {

                            System.out.println(
                                "Error: Insufficient balance.\n"
                            );

                        } 
                        else {

                            balance -= withdrawAmount;

                            System.out.println(
                                "Withdrawal successful."
                            );

                            System.out.printf(
                                "Current Balance: ₹%.2f%n%n",
                                balance
                            );
                        }

                    } 
                    else {

                        System.out.println(
                            "Error: Invalid amount entered.\n"
                        );

                        sc.next();
                    }

                    break;


                // --- CHECK BALANCE ---
                case 3:

                    System.out.printf(
                        "Your current balance is: ₹%.2f%n%n",
                        balance
                    );

                    break;


                // --- ACCOUNT DETAILS ---
                case 4:

                    System.out.println("-----------------------------------");
                    System.out.println("Student Name : " + studentName);
                    System.out.println("Student ID   : " + studentId);
                    System.out.println("Account No   : " + accountNumber);

                    System.out.printf(
                        "Balance      : ₹%.2f%n",
                        balance
                    );

                    System.out.println("-----------------------------------\n");

                    break;


                // --- CALCULATE INTEREST ---
                case 5:

                    System.out.print("Enter the number of years: ");

                    if (sc.hasNextInt()) {

                        int years = sc.nextInt();

                        if (years > 0) {

                            double rate = 5.0;

                            double interest =
                                (balance * rate * years) / 100.0;

                            double newBalance =
                                balance + interest;

                            System.out.printf(
                                "Interest earned at 5%% rate: ₹%.2f%n",
                                interest
                            );

                            System.out.printf(
                                "New balance after %d year(s): ₹%.2f%n%n",
                                years,
                                newBalance
                            );

                        } 
                        else {

                            System.out.println(
                                "Error: Years must be greater than 0.\n"
                            );
                        }

                    } 
                    else {

                        System.out.println(
                            "Error: Invalid input for years.\n"
                        );

                        sc.next();
                    }

                    break;


                // --- EXIT ---
                case 6:

                    System.out.println(
                        "Terminate the program and display:"
                    );

                    System.out.println(
                        "Thank you for using Student Bank System!"
                    );

                    break;


                // --- INVALID CHOICE ---
                default:

                    System.out.println(
                        "Error: Choice must be between 1 and 6.\n"
                    );
            }
        }

        sc.close();
    }
}
