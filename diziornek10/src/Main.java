import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //kullanıcıdan 10 tane sayı alalım çift ve tekleri ayrı ayrı dizi yapalım
        int t[]=new int[10];
        int c[]=new int[10];
        int j=0 , l=0;
        Scanner k=new Scanner(System.in);
        for(int i=0;i< t.length;i++){
            int s=k.nextInt();
            if(s%2==0){
                c[j]=s;
                j++;
            }
            else{
                t[l]=s;
                l++;
            }
        }
        for(int i=0;i<j;i++){
            System.out.print(c[i]+" ");
        }
        System.out.println(" ");
        for(int i=0;i<l;i++){
            System.out.print(t[i]+" ");
        }
    }
}