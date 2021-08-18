public class Jurus {
    private String karakter = "Naruto";
    private int damage = 3000;
    public String oke = "Sasuke";

    public static void main(String[] args){
        Jurus anime = new Jurus();
        System.out.println("nama Karakter: " + anime.karakter);
        System.out.println("Mempunyai jurus dengan damage " + anime.damage + " Kali");

    }
}

class Shippuden{
    public static void main(String[] args){
        Jurus anime2 = new Jurus();
        //System.out.println("Nama Karakter: " + anime2.karakter);
        System.out.println("Nama Karakter2: " + anime2.oke);
    }

}
