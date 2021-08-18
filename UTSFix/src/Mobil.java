// class mobil
public class Mobil {
    // field
    private String name;
    private String pembuat;
    private int milesPerGallons;

    // constructor
    Mobil(String name, String pembuat, int milesPerGallons) {
        this.name = name;
        this.pembuat = pembuat;
        this.milesPerGallons = milesPerGallons;
    }

    // memodifikasi nilai field (setter)
    public void setUpdateKendaraan(String newName, String newPembuat, int newMilesPerGallons) {
        this.name = newName;
        this.pembuat = newPembuat;
        this.milesPerGallons = newMilesPerGallons;
    }

    // menampilkan field
    public void display() {
        System.out.println("\nNama Kendaraan : " + this.name);
        System.out.println("Pembuat : " + this.pembuat);
        System.out.println("Miles/Gallons : " + this.milesPerGallons);
    }

    // membandingkan nilai milesPergallons
    public boolean banding(Mobil car2) {
        if (this.milesPerGallons < car2.milesPerGallons) {
            return true;
        } else if (this.milesPerGallons > car2.milesPerGallons) {
            return false;
        }
        return false;
    }

    // konversi ke kmPerLiter
    void showLiter() {
        double i = new Double(this.milesPerGallons);
        i = i / 2.352;
        System.out.println("Km/Liter dari " + this.name + " : " + i);
    }
}
