//1 den 3 e kadar olan sayıların toplamı a olsun 1 den 4 e kadar olan sayıların çarpımıda b
//sin(a)*cos(b) yi bulan program
public class Main {
    public static void main(String[] args) {
        double ic_kisim=1.0,dis_kisim=0.0;
        for(int a=1;a<=3;a++){
            for(int b=1;b<=4;b++){
                ic_kisim=Math.sin((double)a)*Math.cos((double)b);
            }
                dis_kisim=dis_kisim+ic_kisim;
            ic_kisim=1.0;
        }
        System.out.println(dis_kisim);
    }
}