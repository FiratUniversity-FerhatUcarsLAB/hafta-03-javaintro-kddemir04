public class SaatDonusturme {

    public static void main(String[] args) {

        //Saat donusturme BONUS1
        int hour = 10;
        int minute = 20;
        int second = 48;
        System.out.print("The current time is ");
        System.out.print(hour + " hour " + minute + " minute " + second + " second = ");

        int elapsedSecond = (10*3600+20*60+48);
        System.out.println(elapsedSecond + " second ");

        int elapsedHour = 37248 / 3600;
        int elapsedMinute = (37248 % 3600) / 60;
        int elapsedSecs = (37248 % 3600) % 60;
        System.out.println(elapsedHour + ":" + elapsedMinute + ":" + elapsedSecs);

    }
}
