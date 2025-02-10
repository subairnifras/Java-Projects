import java.util.Scanner;

class test{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Your Name: ");
        String a = scan.nextLine();
        System.out.print("Enter Your Password: ");
        String b = scan.nextLine();

        
        //String x = "Nifras";

        if(a.equals("nifras") && b.equals("5549134@asd")){
            System.out.print("***** Welcome... Nifras..! *****" + "\ndfvgfdg");
        }

        else{
            System.out.print("sgrgrgrdg");
        }
    }
}