import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FileHandler{


    public void saveTransactions(ArrayList<Transaction> transactions, String filename){ // Method saves all given transactions
    try{    
        BufferedWriter bw = new BufferedWriter(new FileWriter(filename));
    
        for(Transaction trans : transactions){
            String all = trans.id + "," + trans.description + "," + trans.amount + "," + trans.category;
            bw.write(all); // saves string in file
            bw.newLine(); // next line
        }
        bw.close();
    } catch(IOException e){
        System.out.println("Saving not possible! Error.");
    }
        
    }


    public ArrayList<Transaction> loadTransactions(String filename){
        ArrayList<Transaction> transactions = new ArrayList<>(); // new empty arraylist


        try{
        BufferedReader br = new BufferedReader(new FileReader(filename));
        
            String all = br.readLine(); // reads first line in file
            while(all!=null){  // for each line

                String[] parts = all.split(",");

                int id = Integer.parseInt(parts[0]);
                String description = parts[1];
                double amount = Double.parseDouble(parts[2]);
                String category = parts[3];

                Transaction trans = new Transaction(id, description, amount, category); //new transaction

                transactions.add(trans); // added to arraylist

                all = br.readLine();
                
            }


            br.close();

            return transactions;

        } catch(IOException e){
            System.out.println("File couldn't been read.");
            return transactions;
        }
    }
}

