package hackerrank_solution;

import java.util.Scanner;

class Java_StringTokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        s = s.trim();
        if (s.isEmpty()) {
            System.out.println(0);
            return;
        }

        //[A-Za-z !,?._'@]+ -- regex

        String tokens[] = s.split("[^a-zA-Z]+");
        System.out.println(tokens.length);

        for (String token : tokens) {
            System.out.println(token);
        }
    }
}
