import java.util.Scanner;
//String tipinde sabit bir şifre değişkeni oluşturun. Örneğin: String password = “12345”; gibi. Ardından, kullanıcıdan
// klavyeden bir şifre girmesini isteyin. Girilen şifre ile değişkende tuttuğunuz değeri kıyaslayın. Eğer, iki değer birbirine
// eşitse ekrana “Giriş Başarılı!”, değilse “Giriş Başarısız” yazdırın.
public class Main {
    public static void main(String[] args) {
        String sifre= "19051905";
        System.out.println("Bir sifre giriniz");
        Scanner k=new Scanner(System.in);
        String usersifre=k.nextLine();

        if(usersifre.equals(sifre)) {
            System.out.println("Giris Basarili");
        }
        else{
            System.out.println("Giris Basarısız");
        }
    }
}