 import java.util.Scanner;
 public class App {
      public static void main(String[] args) throws Exception {

        // DATA MEMBER 
        int Total_Belanja = 0;

        // membuat scenner menerima input dari keyboard
        Scanner scan = new Scanner (System.in);

        // memgambil input dari keyboard
        System.out.print("Masukan Total Belanja: ");
        Total_Belanja = scan.nextInt();

        // cek total belanja 
        if (Total_Belanja >= 50000){
            System.out.println(" Anda Memndapatkan Mouse");
            
        } else {
            System.out.println("Belanja Anda Kurang dari Rp. 50000");
        }
        System.out.println("Terima Kasih Belanja di tokoh kami");



        
    
    }
    
 }