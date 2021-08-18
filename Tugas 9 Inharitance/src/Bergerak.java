public interface Bergerak {

    public void maju(int satuan);

    public void mundur(int satuan);

    public void kanan(int satuan);

    public void kiri(int satuan);
}

class Kerbau implements Bergerak {

    public void maju(int satuan){
        System.out.println("--------- HEWAN KERBAU ---------");
        System.out.println("Kerbau bergerak maju " + satuan + " langkah");
    }

    public void mundur(int satuan){
        System.out.println("Kerbau bergerak mundur " + satuan + " langkah");
    }

    public void kanan(int satuan){
        System.out.println("Kerbau bergerak ke kanan " + satuan + " langkah");
    }

    public void kiri(int satuan){
        System.out.println("Kerbau bergerak ke kiri " + satuan + " langkah");
    }

    public void makan(String makanan){
        System.out.println("Kerbau memakan : " + makanan);
    }

}

class Mobil implements Bergerak {

    public void maju(int satuan){
        System.out.println("--------- MOBIL ---------");
        System.out.println("Mobil bergerak maju " + satuan + " km/jam");
    }

    public void mundur(int satuan){
        System.out.println("Mobil bergerak mundur " + satuan + " km/jam");
    }

    public void kanan(int satuan){
        System.out.println("Mobil bergerak ke kanan " + satuan + " km/jam");
    }

    public void kiri(int satuan){
        System.out.println("Mobil bergerak ke kiri " + satuan + " km/jam");
    }

    public void isiBensin (int satuan){
        System.out.println("Mobil mengisi bensin sebanyak " + satuan + " liter");
    }

}

class Robot implements Bergerak {

    public void maju(int satuan){
        System.out.println("--------- ROBOT ---------");
        System.out.println("Robot bergerak maju " + satuan + " m/detik");
    }

    public void mundur(int satuan){
        System.out.println("Robot bergerak mundur " + satuan + " m/detik");
    }

    public void kanan(int satuan){
        System.out.println("Robot bergerak ke kanan " + satuan + " m/detik");
    }

    public void kiri(int satuan){
        System.out.println("Robot bergerak ke kiri " + satuan + " m/detik");
    }

    public void baterai(String daya){
        System.out.println("Robot memakai baterai bersumber daya " + daya);
    }
}


