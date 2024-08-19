*/You will be provided with a number. Print the number of days in the month corresponding to that number.

Note: In case the input is February, print 28 days. If the Input is not in valid range print "Error".

Input Description:
The input is in the form of a number.

Output Description:
Find the days in the month corresponding to the input number. Print Error if the input is not in a valid range.

Sample Input :
8
Sample Output :
31
*/
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      if(n==1||n==3||n==5||n==7||n==8||n==10||n==12)
      {
          System.out.print("31");
      }
      else if(n==4||n==6||n==9||n==11)
      {
          System.out.print("30");
      }
      else if(n==2)
      {
          System.out.print("28");
      }
      else{
          System.out.print("Error");
      }
      
      
    }
}

