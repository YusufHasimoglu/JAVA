import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
// KLAVYEDEN GİRİLEN 2 BOYUTLU SAYISAL DİZİ İÇİNDEKİ EN BÜYÜK İLK DEĞERİ VE BUNUN SATIR VE SÜTÜN SAYILARINI EKRANA YAZAN PROGRAMI YAPINIZ
        Scanner k=new Scanner(System.in);
        int a=k.nextInt();
        int b=k.nextInt();
        int dizi[][]=new int[a][b];
        int max=dizi[0][0];
        int sutun=0,satir=0;
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                int s=k.nextInt();
                if(max<s){
                    max=s;
                    sutun=j;
                    satir=i;
                }
            }
        }
        System.out.println("en büyük ilk değeri "+satir+" inci satir "+sutun+" inci sutun"+" "+max);
    }
}