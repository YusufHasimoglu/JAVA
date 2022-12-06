import java.util.Scanner;

//klavyeden girilen sayının 10 tabanindaki sayiyi 2 li sisteme ceviren program
public class Main {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        System.out.println("Tam sayi giriniz");
        int s=k.nextInt();
        for(int i=s;i>0;i=i/2){
            System.out.print(i%2);
        }
    }
}