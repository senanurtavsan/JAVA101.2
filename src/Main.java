import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner abc=new Scanner(System.in);



        System.out.print("Birinci Kenarın Uzunluğu : ");
        int kk = abc.nextInt();

        System.out.print("İkinci Kenarın Uzunluğu : ");
        int uk = abc.nextInt();

        double hipo = Math.sqrt((kk*kk)+(uk*uk));

        double alan = uk * kk * hipo;

        System.out.println(kk);
        System.out.println(uk);
        System.out.println("Hipotenüsün uzunluğu : " + hipo);
        System.out.println("Üçgenin Alanı : " + alan);







    }
}