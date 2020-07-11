//        Concept :
//        If we take XOR of zero and some bit, it will return that bit: a⊕0 = a
//        If we take XOR of two same bits, it will return 0: a⊕a=0
//        a⊕b⊕a = (a⊕a)⊕b = 0⊕b = b
//        So we can XOR all bits together to find the unique number.


package BitMasking;

public class UniqueNumber_1 {
    public static void main(String[] args) {
        int[] ar={2,4,5,2,3,4,5};
        System.out.println(odd(ar));
    }

    public static int odd(int[] ar){
        int res=0;
        for(int i=0;i<ar.length;i++){
            res=res^ar[i];

        }
        return res;

    }
}
