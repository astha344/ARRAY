import java.util.*;
public class trappingrainwater {

    static int trapWater(int arr[]) {
        int n = arr.length;

        // Arrays to store left and right maximum heights
        int leftMax[] = new int[n];
        int rightMax[] = new int[n];

        // Fill leftMax array
        leftMax[0] = arr[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], arr[i]);
        }

        // Fill rightMax array
        rightMax[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], arr[i]);
        }

        // Calculate trapped water
        int water = 0;
        for (int i = 0; i < n; i++) {
            water += Math.min(leftMax[i], rightMax[i]) - arr[i];
        }

        return water;
    }

    public static void main(String[] args) {
        int arr[] = {3, 0, 2, 0, 4};

        System.out.println("Water trapped = " + trapWater(arr));
    }
}