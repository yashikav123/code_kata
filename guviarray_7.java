You are given with an array. For each element present in the array your task is to print the next smallest than that number. If it is not smallest print -1

Input Description:
You are given a number ‘n’ representing size of array. And n space separated numbers.

Output Description:
Print the next smallest number present in array and -1 if no smallest is present

Sample Input :
7
10 7 9 3 2 1 15
Sample Output :
7 3 3 2 1 -1 -1


import java.util.*;
class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            int nextele=-1;
            for(int j=i+1;j<n;j++)
            {
                if(arr[j]<arr[i])
                {
                    nextele=arr[j];
                    break;
                }
            }
                if(i>0)
                {
                    System.out.print(" ");
                }
            
                 System.out.print(nextele);
        }
        
    }
}


