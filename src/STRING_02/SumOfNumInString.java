package STRING_02;

public class SumOfNumInString {
    public static void main(String[] args) {
        String[] strArr = {"2AA","12","ABC","c1a"};

        int sum = 0;

        for (int i = 0; i < strArr.length ; i++) {
            String str = strArr[i];
            for (int j = 0; j <str.length() ; j++) {
                if(Character.isDigit(str.charAt(j))){
                    sum = sum + Integer.parseInt(str.charAt(j)+"");
                }
            }
        }
        System.out.println("Sum of numbers = "+sum);
    }
}
