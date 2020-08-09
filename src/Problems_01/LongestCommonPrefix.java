package Problems_01;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strArr = {"flower", "flow", "flight"};

       System.out.println(getLongestCommonPrefix(strArr));

    }

    public static String getLongestCommonPrefix(String[] strArr) {
        if(strArr.length==0) {
            return "";
        }

        // Find minimum length String
        String minStr=getMinString(strArr);
        int minPrefixStrLength=minStr.length();

        for(int i=0;i<strArr.length;i++){
            int j;
            for( j=0;j<minPrefixStrLength;j++){
                if(minStr.charAt(j)!=strArr[i].charAt(j)){
                    break;
                }
            }
            if(j<minPrefixStrLength){
                minPrefixStrLength=j;
            }
        }
        return minStr.substring(0,minPrefixStrLength);
    }

    public static String getMinString(String[] strArr)
    {
        String minStr=strArr[0];
        for(int i=1;i<strArr.length;i++){
            if(strArr[i].length()<minStr.length())
                minStr=strArr[i];
        }
        return minStr;
    }

}
