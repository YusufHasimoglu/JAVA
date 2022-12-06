import java.util.Scanner;

/* klavyeden girilen stringteki sesli harfler haricindeki harflerin harfleri ekrana yazan java programı
klavyeden girilen 3 basamaklı sayının basamaklarındaki rakamlarının çarpımını ekrana yazan java programı
klavyeden girilen 10 tam sayıdan 5 ve 5 in katı olmayanları toplamını hesaplayan java programı
klavyeden girilen 2 sayı üzerinde + - / * oparöterlerine göre işlem yapan switch case kullanarak java programı yazınız*/
public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String kelime=s.nextLine();
        String str="";
        for(int i=0;i<kelime.length();i++){
            char k=kelime.charAt(i);
            if(k=='a'|| k=='e'|| k=='ı'|| k=='i'|| k=='o'|| k=='ö'|| k=='u'|| k=='ü'||k=='A'|| k=='E'|| k=='I'|| k=='İ'|| k=='O'|| k=='Ö'|| k=='U'|| k=='Ü'){
            }
            else{
                str=str+k;
            }
        }
        System.out.println(str);
/*2.soru        Scanner s=new Scanner(System.in);
       System.out.println("3 basamakli sayi giriniz");
      int carpim=1,birler,onlar,yuzler;
      int sayi=s.nextInt();
     if(sayi>0) {
        birler = sayi % 10;
        onlar = ((sayi % 100) - birler) / 10;
        yuzler = (((sayi % 1000) - birler - (10 * onlar)) / 100);
        carpim = yuzler * onlar * birler;
        System.out.println(carpim);
    }
      else{
           System.out.println("hatalı sayı girdiniz");
               }
 } */
/*3soru        Scanner s=new Scanner(System.in);
        int toplam=0;
        for(int i=0;i<10;i++){
            int sayi=s.nextInt();
           if(sayi%5==0){
            }
            else{
                toplam=toplam+sayi;
            }
        }
        System.out.println(toplam); */
/*4.soru        Scanner s=new Scanner (System.in);
        System.out.println("Sayi Giriniz");
        int sayi1=s.nextInt();
        System.out.println("Sayi Giriniz");
        int sayi2=s.nextInt();

        System.out.println("***ISLEMINIZI SECINIZ***");
        System.out.println("1-Toplama");
        System.out.println("2-Cikarma");
        System.out.println("3-Carpma");
        System.out.println("4-Bolme");

        int secim=s.nextInt();
        switch (secim){
            case 1:
                System.out.println("sonuc="+(sayi1+sayi2));
                break;
            case 2:
                System.out.println("sonuc="+(sayi1-sayi2));
                break;
            case 3:
                System.out.println("sonuc="+(sayi1*sayi2));
                break;
            case 4:
                System.out.println("sonuc="+(sayi1/sayi2));
                break;
            default:
                System.out.println("Hatali Secim Yaptiniz");
        }*/
        }
}