import java.util.Scanner;

//klavyeden girilen stringin tersten yazan program
public class Main {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        System.out.println("Kelime giriniz");
        String a=k.nextLine();
        for(int i=a.length()-1;i>=0;i--){
            System.out.print(a.charAt(i));
        }
    }
}