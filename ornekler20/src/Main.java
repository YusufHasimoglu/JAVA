//  1+1/2+2/3+3/4+4/5+... diye giden serinin ilk 100 terimini bulan program
public class Main {
    public static void main(String[] args) {
        double toplam=1;
        for(double i=1;i<=99;i++){
                toplam=toplam+(i/(i+1));
            }
        System.out.println(toplam);
    }
}