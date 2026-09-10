import java.util.Scanner;
import java.util.ArrayList;

public class Main{

    public static void main(String[]args){
        ArrayList<Transaction> transactions = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int idCounter = 1;
        double balance = 0;


        System.out.println("----Your Personal Finance Manager ----\n");

        boolean running = true;
        while(running){
            System.out.println("1. Add income");
            System.out.println("2. Add expense");
            System.out.println("3. Show transactions");
            System.out.println("4. Show balance");
            System.out.println("5. Exit");
       

        if(scanner.hasNextInt()){


            int choice = scanner.nextInt();
            scanner.nextLine();

                if(choice == 1){
                    System.out.println("Description: ");
                    String desc = scanner.nextLine();
                    System.out.println("Amount: ");
                    double amo = scanner.nextDouble();
                    System.out.println("Category: ");
                    String cato = scanner.nextLine();

                    Transaction trans = new Transaction(idCounter++, desc, amo, cato);
                    transactions.add(trans);
                    System.out.println("Added!\n");


                } else if (choice == 2){
                    System.out.println("Description: ");
                    String desc = scanner.nextLine();
                    System.out.println("Amount: ");
                    double amo = scanner.nextDouble();
                    System.out.println("Category: ");
                    String cato = scanner.nextLine();

                    Transaction trans = new Transaction(idCounter++, desc, -amo, cato);
                    transactions.add(trans);

                    System.out.println("Expense added!");


                } else if (choice == 3){
                    System.out.println("\n---- All transactions ----");
                    for(Transaction trans : transactions){
                        trans.print();
                    }
                    System.out.println();


                } else if(choice == 4){
                    System.out.println("\n---- Balance ----");

                    balance = 0;

                    for(Transaction trans : transactions){
                        balance+= trans.amount;
                    }
                    System.out.println("Total: " + balance + " Euro");


                } else if (choice == 5){
                    System.out.println("Bye! See you next time!");
                    running = false;
                } else {
                    System.out.println("Please use a valid number!");
                }
                
            }
        }
    }

}
   
