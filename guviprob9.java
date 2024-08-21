*/
You are provided with a number "N", Find the Nth term of the series: 1, 4, 9, 16, 25, 36, 49, 64, 81, .......

(Print "Error" if N = negative value and 0 if N = 0).

Input Description:
An integer N is provided to you as the input.

Output Description:
Find the Nth term in the provided series.

Sample Input :
18
Sample Output :
324
*/
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     if(n<0)
     System.out.println("Error");
     else if(n==0)
     System.out.println(0);
     else{
         int nterm=n*n;
         System.out.print(nterm);
     }
    }
}
