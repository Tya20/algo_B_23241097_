public class cetakbintangdalampolasegitiga {
    public static void main(String[] args) {
        int tinggi = 5;

        for (int i = 0; i < tinggi; i++ ) {

        for (int j = tinggi - 1 - 1; j > 0; j--) {
            System.out.print(" ");
            }

        for (int k = 0; k < (1 * i) + 1; k++) {
        if (k == 0 || k == (1 * i) || i == tinggi - 1) {
            System.out.print("*");
            } else {
            System.out.print("*");
                }
            }
            System.out.println();

        } 
    }
}
