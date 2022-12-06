import java.util.Scanner;
//klavyeden rastgele girilen sayılar içinde çift olanları ekrana yazdıran ve bunların ortalamasını bulan program
public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int sayac=0,toplam=0;
        double ortalama=0;
        System.out.println("Kac adet sayi girmek istersiniz");
        int a=s.nextInt();
        for(int i=0;i<a;i++){
            System.out.println("Sayı giriniz");
            int b=s.nextInt();
            if(b%2==0){
                sayac++;
                toplam=toplam+b;
                ortalama=(double)toplam/sayac;
            }
        }
        if(sayac==0){
            System.out.println("çift sayi girilmedi");
        }
        System.out.println(sayac+" adet çift sayi vardir");
        System.out.println("çift sayilarin ortalmasi="+ortalama);
    }
}