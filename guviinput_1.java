/*Print the First 3 multiples of the given number "N". (N is a positive integer)

Note: print the characters with a single space between them.

Input Description:
A positive integer is provided to you as an input.

Output Description:
Print the First 3 multiples of the number with single spaces between them as an output.

Sample Input :
2
Sample Output :
2 4 6
*/
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=3;i++)
        {
            sum=n*i;
            if(i>1)
            {
                System.out.print(" ");
            }
            System.out.print(sum);
        }
    }
}
