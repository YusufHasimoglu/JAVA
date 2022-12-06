import java.util.Scanner;
//klavyeden girilen stringi aşağıdaki şekideki gibi yazan program
//mesela aliyi;
//i
//il
//ila
public class Main {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        System.out.println("Kelime giriniz");
        String s=k.nextLine();
        for(int i=0;i<s.length();i++){
        for(int j=0;j<=i;j++) {
            System.out.print(s.charAt(s.length() - j - 1));
        }
            System.out.println("");
        }
        }
    }