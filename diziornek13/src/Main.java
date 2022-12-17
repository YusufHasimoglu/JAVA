import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Klavyeden iki boyutlu 3*4 elemanlı sayısal dizi giriliyor
        //a)bu değerleri tutan programı yapınız
        int dizi[][] = new int[3][4];
        int t = 0; //b şıkkı için
        Scanner k = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                dizi[i][j] = k.nextInt();
                //b)bu dizinin ortalama değerini bulan,ortalama değerinden küçük olan elemanları ve kaçınçı satır ve sütünda olduklarını ekrana yazan programı yapınız
                t = t + dizi[i][j];
            }
        }
        System.out.println("dizinin toplamı= "+t);
        double ort = (double) t / 12.0;
        System.out.println("dizinini ortalamas= "+ort);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                if (dizi[i][j] < ort) {
                    System.out.println("dizinin ortalamasından küçük "+dizi[i][j] + " " + i + " inci satır" + j + " inci sütun");
                }
            }
        }
        //c)bu dizinin en büyük ve en küçük değerini ve aynı zamanda kaçıncı indiksde olduklarını bulup ekrana yazan programı yapınız
        int max = dizi[0][0], min = dizi[0][0];
        int imax = 0, imin = 0, jmax = 0, jmin = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                if (max < dizi[i][j]) {
                    max = dizi[i][j];
                    imax = i;
                    jmax = j;
                }
                if (min > dizi[i][j]) {
                    min = dizi[i][j];
                    imin = i;
                    jmin = j;
                }
            }
        }
        System.out.println("en büyük değeri "+max + " " + imax + " inci satır " + jmax+" inci sütun");
        System.out.println("en küçük değeri "+min + " " + imin + " inci satır " + jmin+" inci sütun");
        //d)iki boyutlu sayısal dizideki satırları toplayıp (ayrı ayrı) tek boyutlu sayısal dizi haline getiren programı yapınız
        int d[] = new int[3];
        int top = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                top = top + dizi[i][j];
            }
            d[i] = top;
            System.out.println(d[i]);
            top = 0;
        }
        //e)iki boyutlu sayısal diziyi tek boyutlu sayısal dizi haline getiren program yapınız
        int a[] = new int[12];
        int x = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                a[x]=dizi[i][j];
                System.out.println(a[x]);
                x++;
            }
        }
        //f)aynı iki boyutlu dizinin içindeki negatif olanların yerini kendisini ve sayısını ekrana yazan programı yapınız
        int sayac = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                if (dizi[i][j] < 0) {
                    System.out.println("negatif değerli "+dizi[i][j] + " " + i + " inci satır " + j+" inci sütun");
                    sayac++;
                }
            }
        }
        System.out.println(sayac);
        //g)aynı iki boyutlu sayısal dizinin satır ve sütunlarını yer değiştirerek transpozesini bulan, oluşturan programı yapınız
        //MATRİSTRANSPOZE
        int transpoze[][] = new int[4][3];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                transpoze[i][j] = dizi[j][i];
                System.out.println(transpoze[i][j]);
            }
        }
    }
}