import java.util.Scanner;
// klavyeden girilen a üzeri b yi hesaplama
public class Main {
    public static void main(String[] args){
        Scanner k=new Scanner(System.in);
        int a,b,sonuc=1;
        System.out.println("a sayısını giriniz");
        a=k.nextInt();
        System.out.println("b sayısını giriniz");
        b=k.nextInt();
        for(int i=0;i<b;i++){
            sonuc=sonuc*a;
        }
        System.out.println("sonuc="+sonuc);
    }
}