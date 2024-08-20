*/You are given with a number "N", find its cube.

Input Description:
A positive integer is provided.

Output Description:
Find the cube of the number.

Sample Input :
2
Sample Output :
8
*/
  import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         int a=n*n*n;
         System.out.print(a);
    }
}
