package hackerrank_solution;

import java.util.Scanner;

class Solution8 {


    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        int i = 1;
        while (input.hasNext()){
            String s1 = input.nextLine();
            System.out.println(i + " "+ s1);
            i++;
        }


    }
}

