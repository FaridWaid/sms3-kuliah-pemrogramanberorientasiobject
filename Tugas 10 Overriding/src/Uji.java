public class Uji {

    public static void main(String[] args) {
        Kerbau kerbau = new Kerbau();
        kerbau.maju(5);
        kerbau.mundur(10);
        kerbau.kanan(15);
        kerbau.kiri(20);
        kerbau.makan("Rumput");

        Mobil mobil = new Mobil();
        mobil.maju(3);
        mobil.mundur(6);
        mobil.kanan(9);
        mobil.kiri(12);
        mobil.isiBensin(5);

        Robot robot = new Robot();
        robot.maju(2);
        robot.mundur(4);
        robot.kanan(6);
        robot.kiri(8);
        robot.baterai("listrik");

    }
}
