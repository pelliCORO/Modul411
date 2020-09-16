package collatzproblem;

import java.util.Scanner;

public class collatzProblem {



    public static void main(String[] args) {

        Scanner scanNumber = new Scanner(System.in);
        int  Number = scanNumber.nextInt();

        while (Number !=1){

            if (Number%2==0){
                Number= Number/2;
            } else {
               Number = Number*3 +1;
            }

            System.out.println(Number);
        }
    }
}

