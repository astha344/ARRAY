import java.util.*;
public class freq_eachelement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array length");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==0)
                count++;
        }
        if(count>0)
            System.out.println("Frequency of 0: " + count);
        for(int i=0;i<n;i++) {
            if(arr[i]!=0){
                count=1;
                for(int j=i+1;j<n;j++){
                    if(arr[i]==arr[j]) {
                        count++;
                        arr[j]=0;
                    }
                }
                System.out.printf("Frequency of [%d] is [%d]: ", arr[i],count);
                System.out.println();
            }
            
        }
    }
    
}
