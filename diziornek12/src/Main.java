public class Main {
    public static void main(String[] args) {
        //iki indeksi eşit dizi arasında birinci dizinin son teriminden başlayıp ikinci dizinin ilk teriminden başlayıp değerlerinin çarpımıyla yeni dizi oluşturma
        int a[]={5,4,6,8,9};
        int b[]={7,3,2,8,4};
        int c[]=new int[5];
        for(int i=0;i<a.length;i++){
            c[i]=a[a.length-1-i]*b[i];
        }
        for(int i=0;i<c.length;i++){
            System.out.print(c[i]+" ");
        }
    }
}