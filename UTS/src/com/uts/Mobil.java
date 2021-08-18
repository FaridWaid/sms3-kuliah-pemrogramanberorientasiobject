package com.uts;

public class Mobil {
    private String pembuat;
    private int milesPerGallons;

    public void setPembuat(String pembuat) {
        this.pembuat = pembuat;
    }

    public void setMilesPerGallons(int milesPerGallons) {
        this.milesPerGallons = milesPerGallons;
    }

    public String getPembuat() {
        return pembuat;
    }

    public int getMilesPerGallons() {
        return milesPerGallons;
    }

    public static void main(String []args){
        Mobil nama = new Mobil();
        nama.pembuat = "Achmad Farid Alfa Waid";
        Mobil nilai = new Mobil();
        nilai.milesPerGallons = 100;
        Mobil obj1 = new Mobil();
        Mobil obj2 = new Mobil();
        obj1.milesPerGallons = 5;
        obj2.milesPerGallons = 10;
        System.out.println("Dibuat dengan field pembuat = " + nama.pembuat);
        System.out.println("Dibuat dengan field kmPerGallons = "  + nilai.milesPerGallons);
        Boolean hasil = nilaiBalikan(obj1.milesPerGallons, obj2.milesPerGallons);
        System.out.println("nilai balikan hasil membandingkan 2 object = " + hasil);
        konsumsiBahanBakar(2,2);
    }

    public static boolean nilaiBalikan(int obj1, int obj2){
        if (obj1<obj2){
            return true;
        } else {
            return false;
        }
    }

    public static void konsumsiBahanBakar(int liter, int mile){
        double km;
        int gallons;
        km = mile * 1.60934;
        gallons = liter * 3785;
        System.out.println("mobil tersebut menempuh jarak " + km + "km, setara dengan " + mile + "Mile");
        System.out.println("mobil tersebut memakan bahan bakar sebanyak " + gallons + "gallon, setara dengan " + liter + "liter");
    }
}
