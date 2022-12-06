import java.util.Scanner;
//klavyeden girilen stringleri exit yazıncaya kadar ekran yazan java programı yazınız
public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        for(int i=1;;i++){
            String kelime=s.nextLine();
            if(kelime.equals("exit")){
                break;
            }
            else{
                System.out.println(kelime);
            }
        }
    }
}