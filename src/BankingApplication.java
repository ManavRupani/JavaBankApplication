import java.util.Scanner;

public class BankingApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    }
}

class  BankAccount{
    private int CurrentBalance;
    private int privsiosTransaction;
    void Desposit(int Ammount){

        CurrentBalance+=Ammount;
    }
    void Widthraw(int Ammount){
        CurrentBalance-=Ammount;
    }

}