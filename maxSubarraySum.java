import java.util.Scanner;

class Solution {
    long maxSubarraySum(int arr[], int n) {
        long maxi = Long.MIN_VALUE;
        long curr = 0;

        for (int i = 0; i < n; i++) {
            curr += arr[i];
            if (curr > maxi)
                maxi = curr;
            if (curr < 0)
                curr = 0;
        }

        return maxi;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            Solution sol = new Solution();
            System.out.println(sol.maxSubarraySum(arr, n));
        }

        sc.close();
    }
}
