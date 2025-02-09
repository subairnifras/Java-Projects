import java.util.Scanner;

public class banking {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Your User Name : ");
        String a = scan.nextLine();
        System.out.print("Enter Your Password : ");
        String b = scan.nextLine();

        int nifras = 5000000;

        if(a.equals("nifras") && b.equals("5549134@asd")){
            System.out.println("***** Welcome... Nifras...! *****" + "\n   A/C No : 8528351" + "\n   A/C Type : Savings" + "\n   Balance : " + nifras + "$" + "\n1.Deposite" + "\n2.Withdrawals" + "\n3.Balance Inquery");
        }

        else{
            System.out.print("sdfsgf");
        }

        System.out.print("Enter a Section : ");
        int section = scan.nextInt();

        if(section == 1){
            System.out.print("Enter Amount : ");
            int amount = scan.nextInt();
            int deposite = nifras + amount;
            System.out.print("Your Balance is : " +  deposite + "$");
        }

        else if(section == 2){
            System.out.print("Enter Amount : ");
        }

        else if(section == 3){
            System.out.print("Your Balance Amount is : " + nifras + "$");
        }

    }
}
