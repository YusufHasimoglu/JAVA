import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //0 ile 100 aarasında 10 tane sayı üretip dizi1 oluşturuyoruz sonra ters çevirip dizi2 oluşturuyoruz
        int dizi1[] = new int[10];
        int dizi2[] = new int[10];
        int j=0;
        Random k=new Random();
        for(int i=0;i<10;i++){
            int r=k.nextInt(100);
            dizi1[i]=r;
            System.out.print(dizi1[i]+" ");
        }
        System.out.println(" ");
        for(int i= dizi1.length-1;i>=0;i--){
            dizi2[j]=dizi1[i];
            System.out.print(dizi2[j]+" ");
            j++;
        }
    }
}