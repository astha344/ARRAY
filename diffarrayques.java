import java.util.*;
public class diffarrayques {
    static void largest_element(int arr[][]) {
        int max = arr[0][0];
        for(int i=0;i<arr.length;i++) {              
            for(int j=0;j<arr[i].length;j++) {
                if(arr[i][j]>max){
                    max=arr[i][j];
                }
            }
        }
        System.out.println("The largest element in the array is: " + max);
    }
    static void delete_smallest(int arr[][])
    {
        int small=arr[0][0];
        int row=0,col=0;
        for(int i=0;i<arr.length;i++) {              
            for(int j=0;j<arr[i].length;j++) {
                if(arr[i][j]<small){
                    row=i;
                    col=j;
                }
            }
        }
        System.out.println("Deleting smallest element from the row");
        for(int i=0;i<arr.length;i++) {              
            for(int j=0;j<arr[i].length;j++) {

                if(i==row && j==col){
                    System.out.println(" ");
                    continue;
                }
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void sum_range(int arr[][], int startrow, int endrow) {
        int sum=0;
        for(int i=startrow;i<=endrow;i++) {
            for(int j=0;j<arr[i].length;j++) {
                sum=sum+arr[i][j];
            }
        }
        System.out.println("The sum of array of given range is" + sum);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a =sc.nextInt();
        int b =sc.nextInt();
        int[][] arr=new int[a][b];
        for(int i=0;i<a;i++) {
            for(int j=0;j<b;j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        largest_element(arr);
        delete_smallest(arr);
        sum_range(arr, 0, 2);
    }
}

    








    
        
    
    

