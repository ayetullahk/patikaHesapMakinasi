package org.example;
import java.util.Scanner;

public class Main {

    static int sum (int a, int b){
        int resulut=a+b;
        System.out.print("Toblam :"+ resulut);
        return resulut;
    }
    static int minus (int a, int b) {
        int resulut = a - b;
        System.out.print("Fark :" + resulut);
        return resulut;
    }
    static int times (int a, int b) {
        int resulut = a * b;
        System.out.print("Çarpma :" + resulut);
        return resulut;
    }
    static int divided (int a, int b) {
        int resulut = a / b;
        System.out.print("Bölüm :" + resulut);
        return resulut;
    }
    static int power(int a, int b){
        int result=1;
        for (int i=1;i<=b;i++){
            result*=a;
        }
        return result;
    }
    static int mod (int a, int b){
        return a/b;
    }
    static void factorial() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı giriniz :");
        int n = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        System.out.println("Sonuç : " + result);
    }
    static void calc(int a,int b){
        System.out.println("Çevresi :"+ (2*(a+b)));
        System.out.println("Alanı :"+ (a*b));
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int select;
        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Mod Alma Hesaplama\n"
                + "7- Faktoriyel Hesaplama\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap";

        while (true){
            System.out.println(menu);
            System.out.println("Yapmak istediğiniz işlemi seciniz :");
            select=inp.nextInt();
            if (select==0){
                break;
            }
            System.out.print("ilk Sayıyı giriniz :");
            int a= inp.nextInt();
            System.out.print("İkinci sayıyı giriniz :");
            int b= inp.nextInt();
            switch (select){
                case 1:
                    sum(a,b);
                    break;
                case 2:
                    minus(a,b);
                    break;
                case 3:
                    times(a,b);
                    break;
                case 4:
                    if (divided(a,b)==0){
                        System.out.println("2. sayı sıfırdan farklı olmalıdır.");
                    }
                    break;
                case 5:
                    System.out.println("üs hesabı :"+power(a,b) );
                    break;
                case 6:
                    System.out.println("mod işlemi :"+ mod(a,b) );
                    break;
                case 7:
                    factorial();
                    break;
                case 8:
                    calc(a,b);
                    break;
                default:
                    System.out.println("Geçersiz İşlem !");

            }
        }
        System.out.println("Güle Güle :)");
    }
}