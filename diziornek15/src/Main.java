public class Main {
    public static void main(String[] args) {
        //10 elemanlı sayısal dizi bilgisayar aracılığıyla oluşturulmak isteniyor
        //a)bu diziyi oluşturunuz sayı değeri 0-1000 arasında tam sayı olarak olacaktır
        //NOT: random() 0 ile 1 arasında ondalıklı sayı üretir
        int dizi[]=new int[10];
        for (int i=0; i<10; i++) {
            dizi[i]=(int)(1000.0*Math.random());
            System.out.println(dizi[i]);
            //NOT: rastgele sayı üreteçleri bilgisayar ortamında sıklıkla kullanılır(oyunlar,cripto analizde,şifrelemede vb.) yaygın şekilde kullanılır
        }
    }
}