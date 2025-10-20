
public class UcgenAlanHesap {

    public static void main(String[] args) {

        //Ucgen icin
        int a = 3;
        int b = 4;
        int c = 5;
        int s = (3+4+5) / 2;//yarı çevreyi buldum
        double alan2 = Math.sqrt(s * (s - a) * (s-b) * (s-c));
        System.out.println("\nÜçgenin alanı: " + alan2);
    }
}
