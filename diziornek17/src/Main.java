import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //KLAVYEDEN TEK BOYUTLU 5 ELEMANLI STRİNG DİZİSİ GİRİLİYOR
        // a) GİRİLEN STRİNGLERİ TERSTEN YAZAN PROGRAMI YAPINIZ
        String dizi[] = new String[5];
        String dizi2[] = new String[5];
        int a = 0;
        Scanner k = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            dizi[i] = k.next();
        }
        for(int i=dizi.length-1; i>=0; i--){
            dizi2[a]=dizi[i];
            System.out.println(dizi2[a]);
            a++;
        }
        System.out.println(" ");
        //b) GİRİLEN HER BİR STRİNGİ TERSTEN YAZAN PROGRAMI YAPINIZ
        String str="";
        String ters="";
        for(int i=0; i<5;i++){
            str="";
            ters="";
            str=dizi[i];
            for(int j=dizi[i].length()-1;j>=0;j--){
                ters=ters+str.charAt(j);
            }
            dizi[i]=ters;
            System.out.println(dizi[i]);
        }
    }
}