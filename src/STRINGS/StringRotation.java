package STRINGS;

public class StringRotation {
    public static void main(String[] args) {

        System.out.println(isRotatedVersion("abcd","bcda"));
    }

    public static boolean isRotatedVersion(String str, String rotatedString) {
        if(str == null || rotatedString == null){
            return false;
        }
        else if(str.length() != rotatedString.length()){
            return false;
        }
        else{
            String concatenated = str + str ;
            return concatenated.contains(rotatedString);
        }
    }
}
