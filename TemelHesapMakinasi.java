import java.util.Scanner;

public class TemelHesapMakinasi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int b;
        double x,y;

        System.out.println("İlkSayıyıGiriniz:");
        x = input.nextDouble();
        System.out.println("İkinciSayıyıGiriniz:");
        y = input.nextDouble();
        System.out.println("Hangi İŞLEMİ yAPMAK iSTİYORSUNUZ?\n1-TOPLAMA\n2-çIKARMA\n3-Çarpma\n4-BÖLME\n");
        b = input.nextInt();

        switch (b) {
            case 1:
                System.out.println("TOPLAM:" + (x + y));
                break;

            case 2:
                System.out.println("ÇIKARMA:" + (x - y));
                break;

            case 3:
                System.out.println("ÇARPMA:" + (x * y));
                break;

            case 4:
                if (y != 0) {
                    System.out.println("BÖLME:" + (x / y));
                } else {
                    System.out.println("Hatalı giriş var. Birdaha deneyiniz.pleaseeeeee");
                }

                break;

            default:
                System.out.println("HATALI GİRİŞ GİRİLEMEZ TEKRAR DENEYİNİZ.");
                break;
        }
    }
}
