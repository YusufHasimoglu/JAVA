import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 20 kişilik sınıftaki öğrencilere ait ad soyad numara ve java notu bilgisi tutuluyor
        //a) bu sınıftaki en yüksek notu alan öğrenciyi ekrana yazan programı yapınız
        Scanner k=new Scanner(System.in);
        String sinif[]=new String[5];
        int not[]=new int[5];
        for(int i=0;i<5;i++) {
            sinif[i] = k.nextLine();
        }
        for(int i=0;i<5;i++) {
            not[i] = k.nextInt();
        }
        int max=not[0];
        String ogrenci=sinif[0];
        for(int i=1;i<5;i++){
            if(max<not[i]){
                max=not[i];
                ogrenci=sinif[i];
            }
        }
        System.out.println("ogrencinin ismi soyismi: "+ogrenci+" java notu: "+max);
    }
}
