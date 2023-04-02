import java.util.*;
public class SumAll
{
    public int sum(int n)
    {
        int result=0;
        for(int i=1;i<=n;i++)
        {
            result=result+i;
        }
        return result;
    } 
    public static void main(String[] args)
    {
        SumAll s=new SumAll(); 
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an integer n whose sum from 1 to n you want to know");
        int a=sc.nextInt();
        System.out.print("Sum of integers from 1 to a is"+s.sum(a));
    }
}