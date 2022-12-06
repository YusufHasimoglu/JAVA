import java.util.Scanner;

//klavyeden girilen sayıyı aşağıdaki şekideki gibi yazan program
//mesela 125;
//1
//12
//125
public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Sayı Giriniz");
        int k=s.nextInt();
        String a=Integer.toString(k);
        for(int i=0;i<a.length();i++){
        for(int j=0;j<=i;j++) {
            System.out.print(a.charAt(j));
        }
            System.out.println("");
        }
    }
}