import java.util.Scanner;

class Account{
    int account_number;
    String name;
    int amount;
    
    void insert(int acc, String n, int b){
        account_number = acc;
        name = n;
        amount = b;
    }

    void deposit(int d){
        amount+=d;
    }
    void withdraw(int w){
        if(amount==0)
        {
            System.out.println("Insufficient Balance!!!");
        }
        else{
            amount-=w;
        }
    }
    void checkbalance(){
        System.out.println("Balance: "+ amount);
    }

    void display(){
        System.out.println("Name of account holder: "+name);
        System.out.println("Account Number: "+account_number);
        System.out.println("Amount left: "+amount);
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Account Number");
        int ac = sc.nextInt();

        System.out.println("Enter the name");
        String s = sc.next();

        System.out.println("Enter the Amount");
        int u = sc.nextInt();

        System.out.println("Enter the Deposit amount");
        int d = sc.nextInt();

        System.out.println("Enter the withdraw amount");
        int w = sc.nextInt();

        Account obj = new Account();
        obj.insert(ac, s, u);
        obj.deposit(d);
        obj.withdraw(w);
        obj.checkbalance();
        obj.display();
    }
}



