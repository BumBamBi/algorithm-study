package algorithm.kwangwoo.week9.q2056;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static int N;
    static int[] times;
    static int nodesCnt;
    static ArrayList<ArrayList<Integer>> list;
    static int[] remainCnt;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        times = new int[N+1];
        list = new ArrayList<ArrayList<Integer>>(N + 1);
        list.add(new ArrayList<>());
        remainCnt = new int[N+1];
        for (int i = 1; i <= N; i++) {
            times[i] = sc.nextInt();
            nodesCnt = sc.nextInt();
            list.add(new ArrayList<Integer>(nodesCnt));
            for (int j = 0; j < nodesCnt; j++) {
                int item = sc.nextInt();
                list.get(item).add(i);
                remainCnt[i]++;
            }
        }
        
        int result = func();

        System.out.println(result);

        sc.close();
    }

    public static int func() {
        Queue<Integer> q = new LinkedList<Integer>();
        
        int[] resultTimes = copy(times);

        for (int i = 1; i <= N; i++) {
            if (remainCnt[i] == 0) {
                q.offer(i);
            }
        }

        while (!q.isEmpty()) {
            int complete = q.poll();

            for (int willComplete : list.get(complete)) {
                resultTimes[willComplete] = Math.max(resultTimes[willComplete],
                        resultTimes[complete] + times[willComplete]);

                remainCnt[willComplete]--;

                if (remainCnt[willComplete] == 0) {
                    q.offer(willComplete);
                }
            }
        }

        int ans = -1;
        for (int i = 1; i <= N; i++) {
            if (resultTimes[i] > ans) {
                ans = resultTimes[i];
            }
        }

        return ans;
    }

    private static int[] copy(int[] input) {
        int[] result = new int[N+1];
        for (int i = 0; i <= N; i++) {
            result[i] = input[i];
        }
        return result;
    }
}
