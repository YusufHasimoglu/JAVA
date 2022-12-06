import java.util.Scanner;
//klavyeden girilen stringte kaç adet aa karakteri vardır
public class Main {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int sayac=0;
        System.out.println("Kelime giriniz");
        String kelime = k.nextLine();
        for (int i = 0; i < kelime.length()-1;) {
            if (kelime.charAt(i) == 'a'||kelime.charAt(i) == 'A') {
                if (kelime.charAt(i+1) == 'a'||kelime.charAt(i+1) == 'A') {
                    sayac++;
                    i=i+2;
                }
                else i++; {

                }
            }
        }
        System.out.println(sayac);
    }
}