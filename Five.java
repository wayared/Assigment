import java.util.Scanner;

public class Five {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float Net_Proceeds;
        float Dividens;
        float Cost_Basis;
        float Formula;
        System.out.print("Enter the Net Proceeds: ");
        Net_Proceeds = Float.parseFloat(sc.nextLine());
        System.out.print("Enter the Net Dividens: ");
        Dividens = Float.parseFloat(sc.nextLine());
        System.out.print("Enter the Net Cost Basis: ");
        Cost_Basis = Float.parseFloat(sc.nextLine());

        Formula = (Net_Proceeds + Dividens) / Cost_Basis;

        if(Formula < 55){
            System.out.printf("Result = %.2f\n ", Formula);
            System.out.print("Risk to invest");
        } else if (Formula >= 65 && Formula<=75 ) {
            System.out.printf("Result = %.2f\n", Formula);
            System.out.print("Medium risk to invest");
        } else if (Formula >85) {
            System.out.printf("Result = %.2f \n", Formula);
            System.out.print("No Risk");
        }


    }
}