import java.util.Scanner;

public class sayilarinToplami {
    public static void main(String[] args) {
        System.out.println("Lütfen bir toplamını bulmak istediğiniz sayıyı giriniz: ");
        Scanner inp = new Scanner(System.in);
        int a = Integer.parseInt(inp.nextLine());
        int n=0, sum = 0;
        do {
            sum+=n;
            n++;
        } while(n<=a);
        System.out.println(a+" sayısına kadar sayıların toplamı: "+sum);

    }
}