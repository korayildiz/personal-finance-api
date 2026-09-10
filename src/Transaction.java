public class Transaction{

    int id;
    String description; // für was wurde Geld ausgegeben
    double amount;
    String category;



    public Transaction(int id, String description, double amount, String category){
        this.id = id;
        this.description = description;
        this.amount = amount;
        this.category = category;
    }

    public void print(){
        System.out.println("ID: " + id + "\nDescription: " + description + "\nAmount: " + amount + "\nCategory: " + category);
    }

}

