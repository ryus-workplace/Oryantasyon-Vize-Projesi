import java.util.Scanner;

public class Main {
    public static int i;
    public static String islem;
    public static double n1,n2;
    public static double sonuc;
    public static Scanner scan = new Scanner(System.in);
    public static void cikti(String out){
        System.out.println(out);
    }

    public static void main(String[] args) {
        while (true) {
            HesapMakinesi();
            if(islem.equals("exit")||islem.equals("e")){
                break;
            }
        }
    }
    public static void toplama(){
        cikti("1. Sayıyı Giriniz:");
        n1 = scan.nextDouble();
        cikti("2. Sayıyı Giriniz:");
        n2 = scan.nextDouble();
        sonuc = n1 + n2;
        cikti(String.valueOf(sonuc));
    }

    public static void cikartma(){
        cikti("1. Sayıyı Giriniz:");
        n1 = scan.nextDouble();
        cikti("2. Sayıyı Giriniz:");
        n2 = scan.nextDouble();
        sonuc = n1 - n2;
        cikti(String.valueOf(sonuc));
    }

    public static void carpma(){
        cikti("1. Sayıyı Giriniz:");
        n1 = scan.nextDouble();
        cikti("2. Sayıyı Giriniz:");
        n2 = scan.nextDouble();
        sonuc = n1 * n2;
        cikti(String.valueOf(sonuc));
    }
    public static void bölme(){
        cikti("1. Sayıyı Giriniz:");
        n1 = scan.nextDouble();
        cikti("2. Sayıyı Giriniz:");
        n2 = scan.nextDouble();
        sonuc = n1 / n2;
        cikti(String.valueOf(sonuc));
    }

    public static void faktoriyel(){
        cikti("Değeri Giriniz:");
        n1 = scan.nextDouble();
        i=1;
        sonuc=1;
        while(n1+1!=i){
            sonuc = sonuc * i;
            i++;
        }
        cikti(String.valueOf(sonuc));
    }

    public static void mutlakDeger() {
        cikti("Değeri Giriniz:");
        n1 = scan.nextDouble();
        sonuc = Math.abs(n1);
        cikti(String.valueOf(sonuc));
    }

    public static void karekök(){
        cikti("Değeri Giriniz:");
        n1 = scan.nextDouble();
        sonuc = Math.sqrt(n1);
        cikti(String.valueOf(sonuc)+" ,"+String.valueOf(-sonuc));
    }

    public static void usAlma(){
        cikti("Taban Değerini Giriniz:");
        n1 = scan.nextDouble();
        cikti("Üs Değerini Giriniz:");
        n2 = scan.nextDouble();
        sonuc = Math.pow(n1,n2);
        cikti(String.valueOf(sonuc));
    }

    public static void MaxMin(){
        cikti("1. Değeri Giriniz:");
        n1 = scan.nextDouble();
        cikti("2. Değeri Giriniz:");
        n2 = scan.nextDouble();
        sonuc = Math.max(n1,n2);
        cikti("Maximum Değerlikli Sayı = "+String.valueOf(sonuc));
        sonuc = Math.min(n1,n2);
        cikti("Minimum Değerlikli Sayı = "+String.valueOf(sonuc));
    }

    public static void HesapMakinesi(){
        cikti("Yapmak İstediğiniz İşlemi Seçiniz:(+,-,/,*,!,||,karekök,^,maxmin)");
        islem = scan.next();
        switch (islem){
            case "+": toplama(); break;
            case "-": cikartma(); break;
            case "*": carpma(); break;
            case "/": bölme(); break;
            case "!": faktoriyel(); break;
            case "||": mutlakDeger(); break;
            case "karekök": karekök(); break;
            case "^": usAlma(); break;
            case "maxmin": MaxMin(); break;
            default: break;
        }

    }

}














//________To-Do__________//
//1 Toplama Methodu
//2 Çıkarma Methodu
//3 Çarpma Methodu
//4 Bölme Methodu
//5 Faktöriyel Methodu
//6 Mutlak Değer Methodu
//7 Karekök Methodu
//8 Üs Alma Methodu
//9 Max-Min Methodu
//10 Basit Hesap Makinesi
//_______________________//