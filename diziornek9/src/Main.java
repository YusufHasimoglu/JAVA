public class Main {
    public static void main(String[] args) {
        //1 ile 100 arasındaki sayıları 5 e bölenleri diziye alıp diziyi yazdırmak
        int dizi[]=new int[100];
        int j=0;
        for(int i=1;i<=100;i++){
            if(i%5==0){
                dizi[j]=i;
                j++;
            }
        }
        for(int l=0;l<j;l++){
            System.out.println(dizi[l]);
        }
    }
}