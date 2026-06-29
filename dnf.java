import java.util.*;
public class dnf {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={0,1,2,0,1,2,1,2,0,0,1};
        int n=arr.length;
        int count_zero=0, count_one=0, count_two=0;
        for(int i=0;i<n;i++) {
            if(arr[i]==0)
                count_zero++;
            else if(arr[i]==1)
                count_one++;
            else if(arr[i]==2)
                count_two++;
        }
        int idx=0;
        for(int i=0; i<count_zero;i++){
            arr[idx++]=0;
        }
        for(int i=0; i<count_one;i++){
            arr[idx++]=1;
        }
        for(int i=0;i<count_two;i++)
            arr[idx++]=2;
        for(int i=0;i<n;i++)
            System.out.println(arr[i]+" ");
    }
    
}
