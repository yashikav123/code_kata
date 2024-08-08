import java.util.*;
class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();//month
        int total=1000;//initially
        if(n>=1)
        {
            total=total+1000;//1000 is added to the every month
        }
        int firstmonth=1000;
        int secondmonth=1000;
        for(int i=2;i<=n;i++)//i=2 because the savings will be change at the end of 2 nd month
        {
            int currentsaving=firstmonth+secondmonth;
            total+=currentsaving;
            firstmonth=secondmonth;
            secondmonth=currentsaving;
        }
        System.out.print(total);
    }
}
        
        
