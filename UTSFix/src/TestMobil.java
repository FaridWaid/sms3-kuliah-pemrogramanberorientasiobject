public class TestMobil {
    public static void main(String[] args) throws Exception {
        // membuat 2 object
        Mobil mobil1 = new Mobil("Mobil1", "Henry Ford", 1000);
        Mobil mobil2 = new Mobil("Mobil2", "Enzo Ferrari", 2000);

        System.out.println("\nmenampilkan 2 kendaraan");
        mobil1.display();
        mobil2.display();

        // mengganti nilai/modifikasi
        mobil1.setUpdateKendaraan("new Mobil1", "Mamat", 1500);
        mobil2.setUpdateKendaraan("new Mobil2", "Sumanto", 3785);

        System.out.println("\nmenampilkan 2 kendaraan sudah dimodifikasi nilai");
        mobil1.display();
        mobil2.display();

        // membandingkan konsumsi bahan bakar
        System.out.println("\nHasil Perbandingan Km/liter: " + mobil1.banding(mobil2) + "\n");

        // konversi km per liter
        mobil1.showLiter();
        mobil2.showLiter();
    }
}
