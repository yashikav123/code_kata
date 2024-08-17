/*
You are provided with a number check whether its odd or even. 
Print "Odd" or "Even" for the corresponding cases.
Note: In case of a decimal, Round off to nearest integer and then find the output. Incase the input is zero, print "Zero".
Input Description:
A number is provided as the input.
Output Description:
Find out whether the number is odd or even. Print "Odd" or "Even" for the corresponding cases. Note: In case of a decimal, Round off to nearest integer and then find the output. In case the input is zero, print "Zero".
Sample Input :
2
Sample Output :
Even
*/
import java.util.*;
class Main{
  public static void main(String[] args)
  {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      if(n%2==0)
      {
          System.out.print("Even");
      }
      else
      {
          System.out.print("Odd");
      }
      
  }
}
