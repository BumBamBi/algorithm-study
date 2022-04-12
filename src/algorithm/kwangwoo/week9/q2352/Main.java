package algorithm.kwangwoo.week9.q2352;

// 참조 : https://loosie.tistory.com/555

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // dp할 배열
        int[] dp = new int[n + 1];

        // 이진탐색
        int len = 0;
        int idx = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > dp[len]) {
                dp[++len] = arr[i];
            } else {
                idx = binarySearch(dp, 0, len, arr[i]);
                dp[idx] = arr[i];
            }
        }
        System.out.println(len);
        sc.close();
    }
    
	static int binarySearch(int[] dp, int left, int right, int key) {
		int mid =0;
		while(left<right) {
			mid = (left+right)/2;
			if(dp[mid] < key) {
				left = mid+1;
			}else {
				right = mid;
			}
		}
		return right;
	}
}
