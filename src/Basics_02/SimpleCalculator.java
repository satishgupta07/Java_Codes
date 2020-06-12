package Basics_02;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int num1=s.nextInt();
        int num2=s.nextInt();
        System.out.print("Enter an operator (+, -, *, /, %, x): ");
        char ch=s.next().charAt(0);

        System.out.println(calculate(num1, num2, ch));


    }
    public static int calculate(int num1,int num2, char ch){
        int result=0;
        if(ch=='+'){
            result=num1+num2;
        }
        else if(ch=='-'){
            result=num1-num2;
        }
        else if(ch=='*'){
            result=num1*num2;
        }
        else if(ch=='/'){
            result=num1/num2;
        }
        else if(ch=='%'){
            result=num1%num2;
        }
        return result;
    }
}
