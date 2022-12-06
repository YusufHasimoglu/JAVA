//1 den 3 e kadar olan ve 1 den 4 e kadar olan sayıların çarpımının toplamını bulan program
public class Main {
    public static void main(String[] args) {
        int deger=1;
        for(int a=1;a<=3;a++)
            for(int b=1;b<=4;b++)
                deger=deger*(a+b);
        System.out.println("toplam ="+deger);
    }
}