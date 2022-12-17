import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //klavyeden girilen 10 tane sayı tutulmak isteniyor
        //a)bu işlemi gerçekleştiren program
        Scanner k=new Scanner(System.in);
        int a[]=new int[10];
        int t=0; //b şıkkından dolayı ekledi
        for(int i=0;i<10;i++) {
            a[i] = k.nextInt();
            //b)aynı dizinin aritmetik ortalamsını hesaplayan program
            t=t+a[i];
        }
        double ort=(double)t/10.0;
        System.out.println("dizinin ortalaması="+ort);
        //c)klavyeden girilen 10 tane sayı içinden aritmetik ortalama değerinden küçük olanları ve bunların indekslerini ekrana yazan program
        for(int i=0;i<10;i++){
            if(a[i]<ort){
                System.out.println(a[i]+" ortalamadana küçüktür "+" "+i+" inci indeksidir");
            }
        }
    }
}