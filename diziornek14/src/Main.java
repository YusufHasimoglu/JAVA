import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Klavyeden iki boyutlu 2*3 string dizisi giriliyor
        //a)bu dizi tutan programı yapınız
        String dizi[][]=new String[2][3];
        Scanner k=new Scanner(System.in);
        String str=""; //b şıkkı için
        for(int i=0;i<2;i++) {
            for (int j = 0; j < 3; j++) {
                dizi[i][j]=k.next();
                //b)aynı dizinin elemanlarını birleştirip tek bir string haline getiren programı yapınız
                str=str+dizi[i][j];
            }
        }
        System.out.println(str);
        //c)aynı 2*3 elemanlı string dizisini tek boyutlu string dizisi haline getiren programı yapınız
        String dizi2[]=new String[6];
        int t=0;
        for(int i=0;i<2;i++) {
            for (int j = 0; j < 3; j++) {
                dizi2[t]=dizi[i][j];
                System.out.println(dizi2[t]);
                t++;
            }
        }
        //d)aynı dizinin satırlarını birleştirip tek boyutlu dizi haline getiren programı yapınız,
        String tek[]=new String[2];
        String top="";
        for(int i=0;i<2;i++) {
            for (int j = 0; j < 3; j++) {
                top=top+dizi[i][j];
            }
            tek[i]=top;
            System.out.println(tek[i]);
            top="";
        }
        //e)klavyeden girilen iki boyutlu string dizisini karakterlerin sayısının toplamını bulup programı yapınız;
        int toplam=0;
        for(int i=0;i<2;i++) {
            for (int j = 0; j < 3; j++) {
                toplam=toplam+dizi[i][j].length();
            }
        }
        System.out.println(toplam);
        //f)girilen iki boyutlu dizi stringinin en uzun karaktere sahip olan stringi,karakter sayısını,kaçıncı satır ve sütunda olduğunu ekrana yazan programı yapınız
        int max=dizi[0][0].length();
        int imax=0,jmax=0;
        String b="";
        for(int i=0;i<2;i++) {
            for (int j = 0; j < 3; j++) {
                if(max<dizi[i][j].length()){
                    max=dizi[i][j].length();
                    imax=i;
                    jmax=j;
                }
            }
            b=dizi[imax][jmax];
        }
        System.out.println(max+" karakterli kelime uzunluğu "+b+" "+imax+" inci satır  "+jmax+" inci sütun");
    }
}
