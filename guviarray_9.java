/*Assume you are a student studying in school.You are given a task to find first negative integer for each and every window of size k.

Input Description:
First line contains an integer n denoting the size of the array. The next line contains n space separated integers forming the array. The last line contains the window size k.

Output Description:
Print the first negative integer in that window.If all the numbers are positive print 0

Sample Input :
7
1 -2 -3 -4 5 6 -7
3
Sample Output :
-2 -2 -3 -4 -78 */


import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int arr[]=new int[n];
       for(int i=0;i<n;i++)
       {
           arr[i]=sc.nextInt();
           
       }
       int w=sc.nextInt();
       int c=0;
       for(int i=0;i<=n-w;i++)
       {
           boolean checknegative=false;
           for(int j=i;j<i+w;j++)
           {
               if(arr[j]<0)
               {
                   arr[c]=arr[j];
                   c++;
                   checknegative=true;
                   break;
               }
             
               
           }
           if(!checknegative)
           {
               arr[c]=0;
               c++;
           }
       }
       for(int i=0;i<c;i++)
       {
           if(i>0)
           {
           System.out.print(" ");
           }
           System.out.print(arr[i]);
           
       }
    }
}
