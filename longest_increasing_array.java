import java.util.*;
public class longest_increasing_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int c=1, temp=0;
        for(int i=0;i<n;i++){
            c=1;
            for(int j=1+i;j<n;j++){
                if(arr[i]<arr[j]) {
                    c++;
                }
            }
            temp=c;
            if(c>temp){
                System.out.println("length of longest increasing subarray is " + c);
                ;
            }
            
        }
    }
}
