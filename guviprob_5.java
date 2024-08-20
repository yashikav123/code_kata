*/You are provided with the radius of a circle "A". Find the length of its circumference.

Note: In case the output is coming in decimal, roundoff to 2nd decimal place. In case the input is a negative number, print "Error".

Input Description:
The Radius of a circle is provided as the input of the program.

Output Description:
Calculate and print the Circumference of the circle corresponding to the input radius up to two decimal places.

Sample Input :
2
Sample Output :
12.57
*/
  import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double rad=sc.nextDouble();
        double cir=0;
        if(rad<0)
        {
            System.out.print("Error");
        }
        else{
            cir=2*Math.PI*rad;
            System.out.printf("%.2f",cir);
        }
        
    }
}
