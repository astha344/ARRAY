import java.util.*;
public class diff_fir_last {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.print("Difference btw first and last element of array: ");
        System.out.println(arr[0]-arr[n-1]);
    }
    
}
