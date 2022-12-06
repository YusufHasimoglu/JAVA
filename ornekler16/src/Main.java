//1 den 3 e kadar ve 1 den 5 e kadar olan sayıların toplamını bulan program
public class Main {
    public static void main(String[] args) {
        int toplam=0;
        for(int a=1;a<=3;a++)
        for(int b=1;b<=5;b++)
            toplam=toplam+(a+b);
        System.out.println("Toplam="+toplam);
    }
}