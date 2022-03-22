import java.util.Scanner;


public class manavKasaProgramı {
    public static void main(String[] args) {

        double armut=2.14, elma=3.67, domates= 1.11, muz= 0.95, patlican= 5,kg,
                total1, total2,total3,total4,total5, toplam;

        Scanner input= new Scanner(System.in);

        System.out.print("Armut Kaç kilo :");
        kg= input.nextDouble();
        total1= armut * kg;
        System.out.println("Armut Tutar :" +total1);

        System.out.print("Elma Kaç Kilo :");
        kg= input.nextDouble();
        total2= elma * kg;
        System.out.println("Elma Tutar :" +total2);

        System.out.print("Domates Kaç kilo :");
        kg= input.nextDouble();
        total3= domates * kg;
        System.out.println("Domates Tutar :" +total3);

        System.out.print("Muz kaç Kilo :");
        kg= input.nextDouble();
        total4= muz* kg;
        System.out.println("Muz Tutar :" +total4);

        System.out.print("Parlıcan Kaç Kilo :");
        kg= input.nextDouble();
        total5= patlican * kg;
        System.out.println("Patlıcan Tutar :" +total5);

        toplam=  total1+total2+total3+total4+total5;
        System.out.print("Toplam Hesap :" +toplam);






    }
}
