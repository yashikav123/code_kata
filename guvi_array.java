You are given with an circular array .Your task is calculate the difference between two consecutive number. And if difference is greater than ‘k’, print 1 else print 0

Input Description:
You are given two numbers ‘n’, ’m’. Next line contains n space separated integers.

Output Description:
Print 1 if the difference is greater than ‘m’.

Sample Input :
5 15
50 65 85 98 35
Sample Output :
0 1 0 1 0

import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int k = 0;
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < n; i++) 
        {
            int next = (i + 1) % n; // Circular index
            k= Math.abs(arr[i] - arr[next]);
            if (k >= m) 
            {
                result.append("1 ");
            } else
            {
                result.append("0 ");
            }
        }
        System.out.println(result.toString().trim());
    }
}
