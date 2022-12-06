// 1+1/7+2/11+3/15+4/19+5/23+... giden serinin ilk 100 terimininm toplamını bulan program
public class Main {
    public static void main(String[] args) {
        double toplam = 1;
        for (double i=1,j=7; i<= 99; i++,j+=4) {
                toplam =toplam +(i / j);
        }
        System.out.println(toplam);
    }
}