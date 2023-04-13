import java.util.Scanner;

public class Six {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float amount;
        int attempts = 5;
        float Available_amount = 264.33f;
        String password = "12345";
        String user_password;
        System.out.print("Enter the access code: ");
        user_password = sc.nextLine();
        while(!user_password.equals(password)){
            System.out.print("---Access Denied---\n");
            attempts--;
            if(attempts == 0 ){System.exit(0);}
            System.out.printf("You have %d more attempts\n",attempts);
            System.out.print("Enter the access code: ");
            user_password= sc.nextLine();
        }

        System.out.print("Insert amount to withdraw: ");
        amount = Float.parseFloat(sc.nextLine());
        float current_amount = Available_amount;
        if(Available_amount < amount){
            System.out.print("You don't have enough money in your account");
            System.out.println("---------------OOP BANK---------------");
            System.out.printf("Current amount : %.2f\n",current_amount);
            System.out.println("--------------------------------------");
            System.exit(0);
        }else{
            current_amount = Available_amount-amount;
            System.out.print("Dispensing cash...\n");
            System.out.print("Cash Dispensed!\n");
            System.out.println("---------------OOP BANK---------------");
            System.out.printf("Current amount : %.2f\n",current_amount);
            System.out.println("--------------------------------------");
        }




    }
}
