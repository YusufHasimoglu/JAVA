import java.util.Scanner;

//klavyeden girilen stringi aşağıdaki şekideki gibi yazan program
//mesela aliyi;
//a
//al
//ali
public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Kelime giriniz");
        String kelime=s.nextLine();
        for(int i=0;i<kelime.length();i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(kelime.charAt(j));
            }
            System.out.println(" ");
        }
    }
}