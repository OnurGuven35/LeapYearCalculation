import java.util.Scanner;

public class Leap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int year;

        System.out.print("Lutfen Istediginiz Yil Degerini Giriniz : ");
        year = input.nextInt();

        if (year % 4 == 0 ) {
            if (year % 100 == 0 && year % 400 != 0) {
                System.out.print(year + " " + "Artik Bir Yil Degildir !");
            } else {
                System.out.print(year + " " + "Artik Bir Yildir !");
            }
        } else {
            System.out.print(year + " " + "Artik Bir Yil Degildir !");
        }
    }
}

