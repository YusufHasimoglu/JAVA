import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //klavyeden girilen 6 sayı içinden
        //a) en büyük değeri bulan programı yapınız
        Scanner k=new Scanner(System.in);
        int a[]=new int[6];
        for(int i=0;i<6;i++)
            a[i]=k.nextInt();
            int max=a[0];
        for(int i=1;i<6;i++){
            if(max<a[i]){
                max=a[i];
            }
        }
        System.out.println("dizinin en büyük değeri "+max);
    }
}