import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //klavyeden rastgele 10 tane string giriliyor bu stringler içinde en uzun karaktere sahip olan ilk stringi bulup
        //a)ekrana yazan
        //b)indiksini ekrana yazan programı yapınız
        Scanner k=new Scanner(System.in);
        String a[]=new String[10];
        int indis=0;
        for(int i=0;i<10;i++)
            a[i]=k.nextLine();
        int max=a[0].length();
        String ilk=a[0];
        for(int i=1;i<10;i++){
            if(max<a[i].length()){
                max=a[i].length();
                ilk=a[i];
                indis=i;
            }
        }
        System.out.println("en uzun dizi "+ilk);
        System.out.println("indeksi " +indis);
    }
}