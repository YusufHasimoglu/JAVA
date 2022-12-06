import java.util.Scanner;
//girilen iki string içinde yerleri aynı olan karakterleri bulup ekrana yazdıran program
public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Kelime giriniz");
        String s1=s.nextLine();
        System.out.println("Kelime giriniz");
        String s2=s.nextLine();
        int boy1=s1.length();
        int boy2=s2.length();
        int deger;
        if(boy1<boy2){
            deger=boy1;
        }
        else {
            deger=boy2;
        }
        for(int i=0;i<deger;i++){
            if(s1.charAt(i)==s2.charAt(i)) {
                System.out.print(s1.charAt(i));
            }
        }
    }
}