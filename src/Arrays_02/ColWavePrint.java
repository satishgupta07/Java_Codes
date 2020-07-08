package Arrays_02;

public class ColWavePrint {

    public static void main(String[] args) {
        int ar[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        wavearray(ar);
    }

    public static void wavearray(int ar[][]){
        for(int j=0;j<ar.length;j++){
            if(j%2==0){
                for(int i=0;i<ar[j].length;i++){
                    System.out.print(ar[i][j]+",");
                }

            }
            else {
                for(int i=ar[j].length-1;i>=0;i--){
                    System.out.print(ar[i][j]+",");
                }

            }
        }
        System.out.println("END");

    }
}
