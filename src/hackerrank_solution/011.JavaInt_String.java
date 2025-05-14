package hackerrank_solution;

import java.util.Scanner;

class JavaInt_String {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        if(n>=-100 && n<=100){
            String s = Integer.toString(n);
            System.out.println("Good Job");
        }else{
            System.out.println("Wrong answer");
        }
    }
}
