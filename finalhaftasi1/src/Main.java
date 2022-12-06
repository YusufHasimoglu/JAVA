import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
/*        //klavyeden girilen 10 tane sayı tutulmak isteniyor
        //a)bu işlemi gerçekleştiren program
        Scanner k=new Scanner(System.in);
        int a[]=new int[10];
        int t=0; //b şıkkından dolayı ekledi
        for(int i=0;i<10;i++) {
            a[i] = k.nextInt();
            //b)aynı dizinin aritmetik ortalamsını hesaplayan program
        t=t+a[i];
        }
        double ort=(double)t/10.0;
        System.out.println("dizinin ortalaması="+ort);
        //c)klavyeden girilen 10 tane sayı içinden aritmetik ortalama değerinden küçük olanları ve bunların indekslerini ekrana yazan program
        for(int i=0;i<10;i++){
            if(a[i]<ort){
                System.out.println("ortalamadana küçüktür "+a[i]+" "+i+". indeksidir");
            }
        } */
/*        //kalvyeden 8 kişilik sınıftaki öğrencilerin adı soyadı giriliyor
        //a) bunları tutan programı yapınız
        Scanner k=new Scanner(System.in);
        String adsoyad[]=new String[8];
        for(int i=0;i<8;i++) {
            adsoyad[i] = k.next();
        }
        //b)bu string içinde ilk karakteri t olanları ekrana yazan program
        for(int i=0;i<8;i++){
            if(adsoyad[i].charAt(0)=='t'||adsoyad[i].charAt(0)=='T');
            System.out.println(adsoyad[i]);
        }
        //c)klavyeden girilen 8 kişinin ad soyadı üzerinde karakter sayısı 4 veya 5 olanları ekrana yazan programı yapınız
        for(int i=0;i<8;i++){
            if(adsoyad[i].length()==4||adsoyad[i].length()==5);
            System.out.println(adsoyad[i]);
        }
        //d)bu stringte sonu a harfi ile bitenleri ekrana yazıdrma
        for(int i=0;i<8;i++){
            if(adsoyad[i].charAt(adsoyad[i].length()-1)=='a');
        } */
        //klavyeden girilen 6 sayı içinden
        //a) en büyük değeri bulan programı yapınız
/*        Scanner k=new Scanner(System.in);
        int a[]=new int[6];
        for(int i=0;i<6;i++)
            a[i]=k.nextInt();
            int max=a[0];
        for(int i=1;i<6;i++){
            if(max<a[i]){
                max=a[i];
            }
        }
        System.out.println(max); */
        //klavyeden rastgele 10 tane string giriliyor bu stringler içinde en uzun karaktere sahip olan ilk stringi bulup
        //a)ekrana yazan
        //b)indiksini ekrana yazan programı yapınız
/*        Scanner k=new Scanner(System.in);
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
        System.out.println(ilk);
        System.out.println(indis); */
        // 20 kişilik sınıftaki öğrencilere ait ad soyad numara ve java notu bilgisi tutuluyor
        //a) bu sınıftaki en yüksek notu alan öğrenciyi ekrana yazan programı yapınız
        Scanner k=new Scanner(System.in);
        String sinif[]=new String[5];
        int not[]=new int[5];
        for(int i=0;i<5;i++) {
            sinif[i] = k.nextLine();
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
        System.out.println(ogrenci+" "+max);
    }
}
// ÖDEV
// 20 ELAMANLI BİR SAYISAL DİZİ İÇİNDEKİ EN BÜYÜK(VARSA) 2.DEĞERİ EKRANA YAZAN PROGRAMI YAPINIZ
// KLAVYEDEN GİRİLEN 2 BOYUTLU SAYISAL DİZİ İÇİNDEKİ EN BÜYÜK İLK DEĞERİ VE BUNUN SATIR VE SÜTÜN SAYILARINI EKRANA YAZAN PROGRAMI YAPINIZ