public class Main {
    public static void main(String[] args) {
        //BİR DİZİDE EN BÜYÜK, EN KÜÇÜK DEĞERİ BULMAK VE TOPLAMINI, ORTALAMASINI BULMAK
        int dizi[] = {1,2,3,4,5,6};
        int eb=dizi[0];
        int ek=dizi[0];
        int toplam=0;
        double ortalama=0.0;
        for(int i=0;i< dizi.length;i++){
            if(dizi[i]>eb){
                eb=dizi[i];
            }
        }
        System.out.println("en buyuk dizi degeri= "+eb);
        for(int i=0;i< dizi.length;i++){
            if(dizi[i]<ek){
                ek=dizi[i];
            }
        }
        System.out.println("en kucu dizi degeri= "+ek);
        for(int i=0;i< dizi.length;i++){
            toplam=toplam+dizi[i];
        }
        ortalama=(double)toplam/ dizi.length;
        System.out.println("dizinin toplami= "+toplam);
        System.out.println("dizinin ortalamasi= "+ortalama);
    }
}