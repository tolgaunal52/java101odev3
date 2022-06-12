import java.util.Scanner;

public class odev3 {
    public static void main(String[] args) {
       double a, b, c, c2, u, alan, cevre ,err;

       Scanner input = new Scanner(System.in);

       System.out.println("Dik ucgenin Alan, Cevre ve Hipotenusunu Bulma \n ");
       System.out.println("Lutfen Istenilen Bilgileri Giriniz \n");

       System.out.print("Lutfen Taban Olcusunu Girin : ");
       a = input.nextDouble();
       System.out.print("Lutfen Yukseklik Olcusunu Girin : ");
       b = input.nextDouble();

        c2 = (a*a)+(b*b);
        c = Math.sqrt(c2);

        System.out.println("Hipotenus Olcusu : " + c + " br" +"\n");
        u = (a+b+c)/2;

        System.out.println("Ucgenin Cevresi : " + (2*u) + " br" + "\n") ;

        alan = u*(u - a) * ( u - b ) * ( u - c);

        System.out.println("Ucgenin Alani : " + (Math.sqrt(alan)) + " br") ;




    }
}
