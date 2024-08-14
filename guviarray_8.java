Find the first 0 in window of size k. You  are given n numbers and window size ‘w’

Your task is to print the first index which has 0

Input Description:
You are given two numbers ‘n’ and ‘w’ n representing size of array and ‘w’ size of window

Output Description:
Print the index of first 0(1 basedindexing),if there is no index with 0 print -1

Sample Input :
7 2
1 0 6 7 4 0 9
Sample Output :
2 2 -1 -1 6 6
///
import java.util.*;
public class Main {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int w=sc.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<n;i++)
      {
          arr[i]=sc.nextInt();
      }
      for(int i=0;i<=n-w;i++)//i<=5 for 1st test case
      {
          int index=-1;
          for(int j=i;j<i+w;j++)// to check the current windows
          {
              if(arr[j]==0)
              {
                  index=j+1;//to store index that start from 1
                  break;
              }
          }
          if(i>0)
          {
              System.out.print(" ");
          }
          System.out.print(index);
      }
      
    }
}
