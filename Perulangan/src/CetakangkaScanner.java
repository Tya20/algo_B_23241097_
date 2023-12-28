import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        int angka;

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka : ");
        angka = input.nextInt();

        //angka
        for(int i = 1; i< angka; i+=2) {

             System.out.print( i +  " ");
        }

       
    }
}
  