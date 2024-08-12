You are given with an array of numbers, Your task is to print the difference of indices of largest and smallest number.All number are unique.

Input Description:
First line contains a number ‘n’. Then next line contains n space separated numbers.

Output Description:
Print the difference of indices of largest and smallest array

Sample Input :
5
1 6 4 0 3
Sample Output :
-2



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
        int max_arr=Arrays.stream(arr).max().orElseThrow();   /inbuild function to find max and min
        int min_arr=Arrays.stream(arr).min().orElseThrow();
        int index1=0,index2=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==max_arr)
            {
                index1=i;
                break;
            }
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i]==min_arr)
            {
                index2=i;
                break;
            }
        }
        int diff=index1-index2;
        System.out.print(diff);
    }
    
}
