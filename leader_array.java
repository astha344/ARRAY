import java.util.*;
public class leader_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        boolean flag;
        for(int i=0;i<n;i++) {
            flag=true;
            for(int j=i+1;j<n;j++) {
                if(arr[j]>arr[i]) {
                    flag=false;
                    break;
                }
            }
            if(flag==true) {
                System.out.printf("%d is leader", arr[i]);
                System.out.println();
            }

        }
    }
}