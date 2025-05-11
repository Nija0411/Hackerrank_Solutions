package hackerrank_solution;

import java.io.*;

import static java.util.stream.Collectors.joining;

class Solution2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        if ((N % 2 == 0 && (N >= 2 && N <= 5)) || (N % 2 == 0 && N > 20)) {
            System.out.println("Not Weird");
        } else {
            System.out.println("Weird");
        }
        bufferedReader.close();
    }
}
