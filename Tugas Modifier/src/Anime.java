

abstract class Anime {
    public String judul = "One Piece";
    public int episode = 900;
}

class Title extends Anime{
    public String favorit = "Zoro";
}

class print {
    public static void main(String [] args){
        Title judul1 = new Title();
        System.out.println("Judul Anime " + judul1.judul);
        System.out.println("Jumlah Episode " + judul1.episode);
        System.out.println("Karakter Favorit " + judul1.favorit);
    }

}
