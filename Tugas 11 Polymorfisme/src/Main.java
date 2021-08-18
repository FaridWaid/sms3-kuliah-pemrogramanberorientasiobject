import java.util.*;

public class Main {

    public static void main(String [] args){

        Scanner inputUser = new Scanner(System.in);
        JualBeli jualbeli = new JualBeli();
        jualbeli.jual();
        jualbeli.beli();
        int x = 1;
        while (x == 1){
            System.out.print("Apakah anda ingin melakukan penjualan/pembelian (1 = jual / 2 = beli)?: ");
            int transaksi = inputUser.nextInt();

            if (transaksi == 1){
                System.out.println("Pilihan Penjualan: \n 1. Bakso \n 2. Es Teh");
                System.out.print("Masukkan apa yang ingin anda jual: ");
                int jualan = inputUser.nextInt();
                if (jualan == 1) {
                    System.out.print("Masukkan berapa porsi Bakso yang ingin anda jual: ");
                    int porsijual = inputUser.nextInt();
                    System.out.print("Masukkan uang awal pembeli: ");
                    int uangawal = inputUser.nextInt();
                    JualBakso jualbakso = new JualBakso(uangawal, porsijual);
                    jualbeli = jualbakso;
                    jualbeli.jual();
                } else if ( jualan == 2) {
                    System.out.print("Masukkan berapa porsi Es Teh yang ingin anda jual: ");
                    int porsijual = inputUser.nextInt();
                    System.out.print("Masukkan uang awal pembeli: ");
                    int uangawal = inputUser.nextInt();
                    JualEsteh jualesteh = new JualEsteh(uangawal, porsijual);
                    jualbeli = jualesteh;
                    jualbeli.jual();
                } else {
                    System.out.println("Maaf Tidak ada pilihan penjualan tersebut");
                }
            } else if ( transaksi == 2){
                System.out.println("Pilihan Pembelian: \n 1. Bakso \n 2. Es Teh");
                System.out.print("Masukkan apa yang ingin anda beli: ");
                int pembelian = inputUser.nextInt();
                if (pembelian == 1) {
                    System.out.print("Masukkan berapa porsi Bakso yang ingin anda beli: ");
                    int porsibeli = inputUser.nextInt();
                    System.out.print("Masukkan uang awal pembeli: ");
                    int uangawal = inputUser.nextInt();
                    BeliBakso belibakso = new BeliBakso(uangawal,porsibeli);
                    jualbeli = belibakso;
                    jualbeli.beli();
                } else if ( pembelian == 2) {
                    System.out.print("Masukkan berapa porsi Es Teh yang ingin anda beli: ");
                    int porsibeli = inputUser.nextInt();
                    System.out.print("Masukkan uang awal pembeli: ");
                    int uangawal = inputUser.nextInt();
                    BeliEsteh beliesteh = new BeliEsteh(uangawal,porsibeli);
                    jualbeli = beliesteh;
                    jualbeli.beli();
                } else {
                    System.out.println("Maaf Tidak ada pilihan pembelian tersebut");
                }
            } else {
                System.out.println("Maaf tidak ada pilihan pada nomor tersebut");
            }

            System.out.print("Apakah anda ingin melakukan transaksi lagi? (1 = ya / 2 = tidak) : ");
            x = inputUser.nextInt();
            if (x == 1){
                System.out.println("Silakan melakukan transaksi lagi");
            } else {
                System.out.println("Terima kasih telah melakukan transaksi");
            }
        }
    }
}
