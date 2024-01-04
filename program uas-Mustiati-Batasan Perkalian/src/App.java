import java.util.Scanner;
 class Perkalian {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkanbatasan perkalian : ");
        int kedua = input.nextInt();

        System.out.print("Masukkan angka: ");
        int pertama = input.nextInt();

        

        for (int i = 1; i <= kedua; i++) {
            int hasil = i * 5 ;
            System.out.println(i +  " x 5 = " + hasil);
        }
    }
}