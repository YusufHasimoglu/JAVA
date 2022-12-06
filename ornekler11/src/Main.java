import java.util.Scanner;

//klavyeden girilen 2 tabanındaki sayıyı 10 luk tabana ceviren program
public class Main {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        System.out.println("Tam sayi giriniz");
        int s=k.nextInt();
        int sayi=0,basamakdegeri=0,ikininkati=1,toplam=0;
        for(int i=s;i>0;i--){
            basamakdegeri=s%10;
            s=s/10;
            toplam+=ikininkati*basamakdegeri;
            ikininkati*=2;

        }
        System.out.println(toplam);
    }
}
