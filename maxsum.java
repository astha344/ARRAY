import java.util.*;

public class maxsum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows");
        int a=sc.nextInt();
        System.out.println("Enter the columns");
        int b=sc.nextInt();
        int[][] arr=new int[a][b];
        
        // taking input
        for(int i=0;i<a;i++) {              
            for(int j=0;j<b;j++) {
                System.out.printf("Enter element at [%d][%d]: ", i, j);
                arr[i][j]=sc.nextInt();
            }
        }

        // printing array
        for(int i=0;i<a;i++) {
            for(int j=0;j<b;j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        int sum=0;
        int max=0,c=0;
        System.out.println("deleted row");

        // calculating sum and not printing highes sum row
        for(int i=0;i<a;i++) {
            for(int j=0;j<b;j++) {
                sum=sum+arr[i][j];
            }
            if(sum>max){
                max=sum;
                c=i;
            }
            sum=0;
        }
        for(int i=0;i<a;i++) {
            for(int j=0;j<b;j++) {
                if(i!=c){
                    System.out.print(arr[i][j]+" ");
                }
            }
            System.out.println();
        }


    }
    
}
