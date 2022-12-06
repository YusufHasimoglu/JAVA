import java.util.Scanner;

//klavyeden girilen sayının 4 basamaklı basamak değerlerini yazan program
//3245 3 binler basamagidir 2 yuzler basamagidir 4 onlar basamagidir 5 birler basamagidir
public class Main {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        System.out.println("Dort basamakli sayi giriniz");
        int t=k.nextInt();
        System.out.println(t/1000+" binler basamagidir");
        t=t-(t/1000)*1000;
        System.out.println(t/100+" yuzler basamagidir");
        t=t-(t/100)*100;
        System.out.println(t/10+" onlar basamagidir");
        System.out.println(t%10+" birler basamagidir");
    }
}