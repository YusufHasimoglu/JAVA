import java.util.Scanner;

//klavyeden girilen sayıyı aşağıdaki şekideki gibi yazan program
//mesela 125;
//5
//52
//521
public class Main {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        System.out.println("Sayi Giriniz");
        int s=k.nextInt();
        String a=Integer.toString(s);
        for(int i=0;i<a.length();i++){
            for(int j=0;j<=i;j++){
                System.out.print(a.charAt(a.length()-j-1));
            }
            System.out.println("");
        }
    }
}