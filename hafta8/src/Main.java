import java.util.Scanner;
//klavyeden girilen sayının asal sayı olup olmadığını ekrana yazan program
public class Main {
    public static void main(String[] args) {
        boolean t=true;
        Scanner s=new Scanner(System.in);
        int sayi=s.nextInt();
        for(int i=2 ; i<=Math.sqrt(sayi);i++) {
            if(sayi%i==0){
                t=false;
                break;
            }
        }
        if(t){
            System.out.println("asaldir");
        }
        else{
            System.out.println("asal degildir");
        }
    }
}