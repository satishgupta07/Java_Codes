/* Take as input two numbers N1 and N2. Write a function which prints first N1 terms
    of the series 3n + 2 which are not multiples of N2.         */

package Function;

import java.util.Scanner;

public class Problem_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N1 = sc.nextInt();
        int N2 = sc.nextInt();

        printfun(N1, N2);
    }

    public static void printfun(int N1,int N2){

        int count=1;
        int n=1;
        int result=1;
        while(count <= N1){
            result=(3*n)+2;
            n++;
            if(result%N2==0){

            }
            else {
                System.out.println(count+". " + result);
                count++;
            }
        }

    }
}
