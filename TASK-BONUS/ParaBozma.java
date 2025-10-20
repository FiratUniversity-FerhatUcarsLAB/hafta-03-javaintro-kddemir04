public class ParaBozma {

    public static void main(String[] args) {

        //Para bozma BONUS3
        int tutar = 278;

        int[] para = {200, 50, 20, 5, 1};

        System.out.println("278 TL = ");
        for(int i = 0; i < para.length; i++){

            int adet = tutar / para[i];
            tutar = tutar % para[i];
            if(adet > 0){
                System.out.println(adet + " x " +  para[i] + " TL ");
            }
        }
    }
}
