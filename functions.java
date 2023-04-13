import java.util.Scanner;

public class functions {
    String name;

    public void subjects(){

            Scanner sc = new Scanner(System.in);

        System.out.print("Insert your name: ");
        name = sc.nextLine();
            while(name.length() < 6){
                System.out.println("Remember type at-lest 6 characteres ");
                System.out.print("Insert your name: ");
                name = sc.nextLine();
            }
            float sum_score = 0;
            for(int i = 0; i <5 ; i++){
                System.out.printf("Insert score of subjects #%d: ",i+1);
                float add = Float.parseFloat(sc.nextLine());
                sum_score += add;
            }

            score(sum_score);

    }

    public void score(float sum_score){
        float result;
        result = sum_score/5;
        System.out.printf("Student: %s\n ",name);
        System.out.printf("Total sum of marks: %f\n",sum_score);
        System.out.printf("Your Score is %.2f",result);

    }
}
