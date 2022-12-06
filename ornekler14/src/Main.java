import java.util.Scanner;

//klavyeden girilen sayının asal olup olmadığını bulan program
public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Sayi Giriniz");
        int sayi=s.nextInt();
        int i;
        for(i=2;i<=(int)(Math .sqrt((double)(s));i++){
            if(sayi%1==0){
                System.out.println("Sayi Asal Degildir");
                System.exit(1);
            }
        }
    }
}