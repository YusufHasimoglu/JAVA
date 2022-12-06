import java.util.Scanner;
//klavyeden girilen 10 karakter içinde x olup olmadığını bulan ve bunların sayısını ekrana yazdıran program
public class Main {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        char c;
        int sayac=0;
        for(int i=0;i<=10;i++){
            System.out.println("Karakter giriniz");
            c=k.next().charAt(0);
            if(c=='x'||c=='X'){
                sayac++;
                System.out.println("karakter "+c+" dir");
            }
        }
        System.out.println("x yada X "+sayac+" adettir");
    }
}