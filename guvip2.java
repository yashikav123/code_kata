You are given with two arrays. Your task is to merge the array such that first array is in ascending order and second one in descending order.

Input Description:
First line contains two integer ‘n’ and ‘m’. ‘n’ denotes length of array 1 and ‘m’ of array 2.Next line contains n space separated numbers and third line contains ‘m’ space separated numbers

Output Description:
Print a single array in desired order

Sample Input :
3 3
23 15 16
357 65 10
Sample Output :
15 16 23 357 65 10



  import java.util.*;
class Main{
    public static void main(String[] args)
    {
        int n,m;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        m=sc.nextInt();
        int arr1[]=new int[n];
        int arr2[]=new int[m];
        for(int i=0;i<n;i++)
        {
            arr1[i]=sc.nextInt();
        }
        for(int i=0;i<m;i++)
        {
            arr2[i]=sc.nextInt();
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        int index=0;
        int result[]=new int[n+m];
        for(int i=0;i<n;i++)
        {
            result[index++]=arr1[i];
        }
        for(int i=m-1;i>=0;i--)
        {
            result[index++]=arr2[i];
        }
             // Using StringBuilder to avoid trailing space i the end
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < result.length; i++) {
            sb.append(result[i]);
            if (i < result.length - 1) {
                sb.append(" ");
            }
        }
        
        System.out.println(sb.toString());
    }
}
