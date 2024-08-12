You are provided with an array in which all elements are repeated thrice except one which is repeated twice.Your task is to print that number

Input Description:
First line contains a number denoting size of array ‘n’.Next line contains n space separated numbers

Output Description:
Print the number which is repeated twice

Sample Input :
5
13 12 13 12 13
Sample Output :
12
///
import java.util.*;
class Main{
    public static void main(String[] args)
    {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
        int count=0;
            for(int j=0;j<n;j++)
            {
                if(arr[i]==arr[j])
                {
                    count++;
                }
            }
        if(count==2)
        {
            System.out.print(arr[i]);
            break;
        }
        }
    }
}
