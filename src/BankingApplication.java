import java.util.Scanner;

public class BankingApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    }
}

class  BankAccount{
    private int CurrentBalance;
     String customerName;
     String customerID;

     public BankAccount(String cname,String cID){
         customerID=cID;
         customerName=cname;
     }



    private int privsiosTransaction;
    void Desposit(int ammount){
        if(ammount!=0){
        CurrentBalance += ammount;
        privsiosTransaction = ammount;
    }}
    void Widthraw(int ammount){
    if(ammount!=0){
        CurrentBalance -= ammount;
        privsiosTransaction= -ammount;
    }}

    void getPriviostransaction(){
        if (privsiosTransaction>0){
            System.out.println("Desposited: "+privsiosTransaction);
        }else if (privsiosTransaction<0){
            System.out.println("Widthrawed: "+privsiosTransaction);
        }else{
            System.out.println("No Transaction Recorded ");
        }
    }

    void showMenu(){
        char option= '\0';
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome Mr."+customerName);
        System.out.println("Your Id is: "+customerID);
        System.out.println();
        System.out.println("A: Check Balance");
        System.out.println("B: Deposit");
        System.out.println("C: Withdraw");
        System.out.println("D: Previous Trasnaction");
        System.out.println("E: Exit");
        do{
            System.out.println("***************************");
            System.out.println("Enter the option");
            System.out.println("***************************");
            switch (option){
                case 'A':
                    System.out.println("***************************");
                    System.out.println("Balance is: "+CurrentBalance);
                    System.out.println("***************************");
                    System.out.println();
                    break;

                case 'B':

            }
        }
    }






}