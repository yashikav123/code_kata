*/You are provided with a number, "N". Find its factorial.

Input Description:
A positive integer is provided as an input.

Output Description:
Print the factorial of the integer.

Sample Input :
2
Sample Output :
2
*/
  import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
               Scanner sc=new Scanner(System.in);
               int n=sc.nextInt();
               int result=1;
               for(int i=1;i<=n;i++)
               {
                   result=result*i;
               }
                   System.out.print(result);
    }
}
