import java.util.Scanner;

public class VucutKitleIndeksi {

    public static void main(String[] args) {

        //BMI hesaplama BONUS2
        Scanner tara = new Scanner(System.in);

        //Kullanicidan kilo bilgisini aliyorum
        System.out.println("Kilonuzu kilogram cinsinden giriniz");
        int kilo = tara.nextInt();


        //Kullanicidan boy bilgisini aliyorum
        System.out.println("Boyunuzu cm cinsinden giriniz");
        int boy =  tara.nextInt();

        //Vucut kitle endeksi hesapliyorum
        double vucutKitleEndex = (double)kilo / (boy * boy);
        if(vucutKitleEndex <= 18.5) {
            System.out.println("Zayıf");

        }
        else if(vucutKitleEndex > 18.5 && vucutKitleEndex <= 24.9) {
            System.out.println("Normal kilolu");
        }
        else if(vucutKitleEndex >= 25 && vucutKitleEndex <= 29.9) {
            System.out.println("Fazla kilolu");
        }
        else if(vucutKitleEndex >= 30 && vucutKitleEndex <= 34.9) {
            System.out.println("1. derece obez");
        }
        else if(vucutKitleEndex >= 35 && vucutKitleEndex <= 39.9) {
            System.out.println("2. derece obez");
        }
        else if(vucutKitleEndex >= 40){
            System.out.println("3. derece obez");
        }
    }
}
