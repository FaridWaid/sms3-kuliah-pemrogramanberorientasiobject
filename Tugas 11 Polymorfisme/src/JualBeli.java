public class JualBeli {
    public void jual(){
        System.out.println("Merupakan Fungsi Untuk Melakukan Penjualan");
    }

    public void beli(){
        System.out.println("Merupakan Fungsi Untuk Melakukan Pembelian");
    }
}

class JualBakso extends JualBeli{
    int uangAwal, porsi;
    public JualBakso(int uangAwal, int porsi){
        this.uangAwal = uangAwal;
        this.porsi = porsi;
    }

    public void jual(){
        int hargaJual = 10000 * this.porsi;
        int kembalian = this.uangAwal - hargaJual;
        System.out.println("Anda telah berhasil menjual Bakso " + this.porsi + " porsi");
        System.out.println("Dengan total harga jual sebesar Rp." + hargaJual);
        System.out.println("Dan menyerahkan kembalian kepada pelanggan sebesar Rp." + kembalian);
    }
}

class JualEsteh extends JualBeli{
    int uangAwal, porsi;
    public JualEsteh(int uangAwal, int porsi){
        this.uangAwal = uangAwal;
        this.porsi = porsi;
    }

    public void jual(){
        int hargaJual = 3000 * this.porsi;
        int kembalian = this.uangAwal - hargaJual;
        System.out.println("Anda telah berhasil menjual EsTeh " + this.porsi + " porsi");
        System.out.println("Dengan total harga jual sebesar Rp." + hargaJual);
        System.out.println("Dan menyerahkan kembalian kepada pelanggan sebesar Rp." + kembalian);
    }
}

class BeliBakso extends JualBeli{
    int uangAwal, porsi;
    public BeliBakso(int uangAwal, int porsi){
        this.uangAwal = uangAwal;
        this.porsi = porsi;
    }

    public void beli(){
        int hargaBeli = 12000 * this.porsi;
        int kembalian = this.uangAwal - hargaBeli;
        System.out.println("Anda telah berhasil membeli Bakso " + this.porsi + " porsi");
        System.out.println("Dengan total harga beli sebesar Rp." + hargaBeli);
        System.out.println("Dan menerima kembalian dari penjual sebesar Rp." + kembalian);
    }
}

class BeliEsteh extends JualBeli{
    int uangAwal, porsi;
    public BeliEsteh(int uangAwal, int porsi){
        this.uangAwal = uangAwal;
        this.porsi = porsi;
    }

    public void beli(){
        int hargaBeli = 4000 * this.porsi;
        int kembalian = this.uangAwal - hargaBeli;
        System.out.println("Anda telah berhasil membeli EsTeh " + this.porsi + " porsi");
        System.out.println("Dengan total harga beli sebesar Rp." + hargaBeli);
        System.out.println("Dan menerima kembalian sebesar Rp." + kembalian);
    }
}


