package hackerrank_solution;

import java.io.*;

import static java.util.stream.Collectors.joining;


class Solution5 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        for (int i = 1; i <= 10; i++) {
            int result = i * N;
            System.out.println(N + " x " + i + " = " + result);
        }

        bufferedReader.close();
    }
}


