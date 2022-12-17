import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //KLAVYEDEN RASTGELE İKİ BOYUTLU 4*5 ELEMANLI SAYISAL DİZİ GİRİLİYOR BU DİZİ İÇİNDEKİ ASAL OLAN SAYILARI VE YERLERİNİ BULUP EKRANA YAZAN PROGRAMI YAPINIZ
    int dizi[][]=new int[4][5];
    Scanner k=new Scanner(System.in);
    int sayac=0;
        for (int i=0; i<4; i++){
            for (int j=0; j<5; j++){
                dizi[i][j]=k.nextInt();
            }
        }
        for (int i=0; i<4; i++){
            for (int j=0; j<5; j++){
                sayac=0;
                if(dizi[i][j]>=2){
                 for(int l=2; l<=dizi[i][j]/2; l++) {
                     if (dizi[i][j]%l==0) {
                         sayac++;
                     }
                 }
                if (sayac==0) {
                    System.out.println(i + " inci satır " + j + " inci sütun " + dizi[i][j]);
                }
                }
            }
        }
    }
}