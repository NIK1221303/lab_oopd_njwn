import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Lab02_Q1
{
    public static void main(String[] args) {
        ArrayList<Account> accounts = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        int id;
        double balance;
        double deposit=0;
        accounts.add(new Account());
       System.out.println("Create Account #1");
       Status(accounts.get(0));

       System.out.print("Change Account #1 id to ");
       id=sc.nextInt();
       accounts.get(0).setId(id);
       Status(accounts.get(0));

       System.err.println("Create Account #2");
       accounts.add(new Account(102,2000));
       Status((accounts.get(1)));

       System.err.println("Create Account #3");
       System.err.println("Enter account id: ");
       id=sc.nextInt();
       System.err.println("Enter balance   : RM");
       balance=sc.nextDouble();
       accounts.add(new Account(id,balance));
       Status(accounts.get(2));

       System.err.println("Enter account id to deposit: ");
        id=sc.nextInt();
        Deposit(id, deposit, accounts);
        System.err.println("Enter account id to withdraw: ");
        id=sc.nextInt();
        Withdraw(id, deposit, accounts);

       



    }
    public static void Status(Account account)
    {
       
        System.out.println("Account id = "+account.getId());
        System.out.println("Balance = RM"+account.getBalance());
        System.out.println("Created = "+account.getDateCreated());
        System.out.println("Total balance = RM"+account.getTotalBalance());
        System.out.println("");
    }
    public static void Deposit(int id, double deposit,ArrayList<Account> accounts)
    {
        Scanner sc = new Scanner(System.in);
        for(Account acc:accounts)
        {
            if(acc.getId()==id)
            {
                System.err.print("Enter amount to deposit : RM");
                deposit=sc.nextDouble();
                acc.deposit(deposit);
                System.err.println("Balance = RM"+ acc.getBalance());
                
                System.err.println("Total balance = RM"+acc.getTotalBalance());
                
            }
        }
    }
    public static void Withdraw(int id, double withdraw,ArrayList<Account> accounts)
    {
        Scanner sc = new Scanner(System.in);
        for(Account acc:accounts)
        {
            if(acc.getId()==id)
            {
                System.err.print("Enter amount to withdraw : RM");
                withdraw=sc.nextDouble();
                acc.withdraw(withdraw);
                System.err.println("Balance = RM"+acc.getBalance());
                System.err.println("Total balance = RM"+acc.getTotalBalance());
               
            }
        }
    }
}
class Account
{
    private int id;
    private double balance;
    private LocalDate dateCreated;
    private static int totalBalance;


    Account()
    {
        this.dateCreated=LocalDate.now();
    }
    Account(int id, double balance)
    {
        this.id=id;
        this.balance=balance;
        this.dateCreated=LocalDate.now();
        this.totalBalance+=balance;
    }
    public int getId()
    {
        return id;
    }
    public double getBalance()
    {
        return balance;
    }
    public LocalDate getDateCreated()
    {
        return dateCreated;

    }
    public int getTotalBalance()
    {
        return totalBalance;
    }
    public void setId(int id)
    {
        this.id=id;

        
    }
    public void setBalance(double balance){

        if(balance<0)
        {
            System.err.println("Enter positive value");
        }
        else
        {
            this.balance=balance;
        }
    }
    public void deposit(double deposit){

        if(deposit<0)
        {
            System.err.println("Deposit rejected");
        }
        else
        {
            balance+=deposit;
            totalBalance+=deposit;
        }

    }
    public void withdraw(double withdraw){
        
        if(withdraw<balance)
        {
            this.balance-=withdraw;
            this.totalBalance-=withdraw;
        }
        else if(withdraw>balance)
        {
            System.err.println("Insufficient balance");
        }
        else
        {
            System.err.println("Enter positive value");
        }
    }
}