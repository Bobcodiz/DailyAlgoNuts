import java.util.Scanner;

public class AnalysisLabOne {
    public int sum(){
        int x,y,sum;

        Scanner in = new Scanner(System.in);

        System.out.print("enter number x : ");
        x = in.nextInt();

        System.out.print("Enter the number y : ");
        y = in.nextInt();
        sum = x +y;
        System.out.println("the sum is : "+sum);
        return sum;
    }
}
