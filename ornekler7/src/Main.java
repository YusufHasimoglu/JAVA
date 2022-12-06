import java.util.Scanner;

//klavyeden girilen bir tam sayı için aşağıdaki şekilde yazan
//4
//1 2 2 3 3 3 4 4 4 4
public class Main {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        System.out.println("Tam Sayi Giriniz");
        int s=k.nextInt();
        for(int i=0;i<=s;i++){
            for(int j=1;j<=i;j++) {
                System.out.print(" "+i);
            }
        }
    }
}