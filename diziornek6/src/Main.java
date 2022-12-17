import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 20 ELAMANLI BİR SAYISAL DİZİ İÇİNDEKİ EN BÜYÜK(VARSA) 2.DEĞERİ EKRANA YAZAN PROGRAMI YAPINIZ
        int dizi[]=new int[20];
        Scanner k=new Scanner(System.in);
        int max2=dizi[0];
        int sayac=0,indeks=0;
        for(int i=0;i<20;i++){
            int s=k.nextInt();
            if(max2<s){
                max2=s;
                indeks=i;
            }
            if (max2==s){
                sayac++;
                if(sayac<=2){
                    max2=s;
                    indeks=i;
                }
            }
        }
        System.out.print("en büyük değeri "+indeks+" inci indeks "+max2);
    }
}
