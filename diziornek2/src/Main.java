import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //kalvyeden 8 kişilik sınıftaki öğrencilerin adı soyadı giriliyor
        //a) bunları tutan programı yapınız
        Scanner k=new Scanner(System.in);
        String adsoyad[]=new String[8];
        for(int i=0;i<8;i++) {
            adsoyad[i] = k.nextLine();
        }
        //b)bu string içinde ilk karakteri t olanları ekrana yazan program
        for(int i=0;i<8;i++){
            if(adsoyad[i].charAt(0)=='t'||adsoyad[i].charAt(0)=='T') {
                System.out.println("ilk harfi t olan dizi " + adsoyad[i]);
            }
        }
        //c)klavyeden girilen 8 kişinin ad soyadı üzerinde karakter sayısı 4 veya 5 olanları ekrana yazan programı yapınız
        for(int i=0;i<8;i++){
            if(adsoyad[i].length()==4||adsoyad[i].length()==5) {
                System.out.println("4 veya 5 karakterli olan dizi " + adsoyad[i]);
            }
        }
        //d)bu stringte sonu a harfi ile bitenleri ekrana yazıdrma
        for(int i=0;i<8;i++){
            if(adsoyad[i].charAt(adsoyad[i].length()-1)=='a') {
                System.out.println("sonu a harfi ile biten dizi " + adsoyad[i]);
            }
        }
    }
}