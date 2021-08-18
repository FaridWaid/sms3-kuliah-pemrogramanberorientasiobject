public class Hewan {
    public String swimming (String renang) {
        return renang;
    }

    public String flying (String terbang) {
        return terbang;
    }

    public String walking (String jalan) {

        return jalan;
    }

    public String running (String lari) {

        return lari;
    }
}

class Elang extends Hewan {

    public void tingkah_laku(){
        System.out.println("--------- HEWAN ELANG ---------");
        System.out.println("Elang bernafas : " + this.bernafas("wushhh"));
        System.out.println("Suara Elang terbang : " + super.flying("Wing - wing"));
        System.out.println("Suara Elang : " + this.bersuara("Kwuaikkk"));
        System.out.println("Elang berkembangbiak dengan cara : " + this.berkembangbiak("Bertelur"));
        System.out.println("Elang makan : " + this.makan("Daging"));
    }

    public String bernafas(String nafas){
        return nafas;
    }

    public String bersuara(String suara){
        return suara;
    }

    public String berkembangbiak(String KB){
        return KB;
    }

    public String makan(String makanan){
        return makanan;
    }
}

class Bebek extends Hewan{

    public void tingkah_laku(){
        System.out.println("--------- HEWAN BEBEK ---------");
        System.out.println("Bebek bernafas : " + this.bernafas("huimmm"));
        System.out.println("Suara Bebek berenang : " + super.swimming("Kecipak - kecipuk"));
        System.out.println("Suara Bebek : " + this.bersuara("Wekk wekkk"));
        System.out.println("Bebek berkembangbiak dengan cara : " + this.berkembangbiak("Bertelur"));
        System.out.println("Bebek makan : " + this.makan("Dedak"));
    }

    public String bernafas(String nafas){
        return nafas;
    }

    public String bersuara(String suara){
        return suara;
    }

    public String berkembangbiak(String KB){
        return KB;
    }

    public String makan(String makanan){
        return makanan;
    }
}

class Sapi extends Hewan {

    public void tingkah_laku(){
        System.out.println("--------- HEWAN SAPI ---------");
        System.out.println("Sapi bernafas : " + this.bernafas("ehmmm"));
        System.out.println("Suara Sapi berjalan : " + super.walking("Klutak - Klutuk"));
        System.out.println("Suara Sapi : " + this.bersuara("Mooooo"));
        System.out.println("Sapi berkembangbiak dengan cara : " + this.berkembangbiak("Beranak / Melahirkan"));
        System.out.println("Sapi makan : " + this.makan("Rumput"));
    }

    public String bernafas(String nafas){
        return nafas;
    }

    public String bersuara(String suara){
        return suara;
    }

    public String berkembangbiak(String KB){
        return KB;
    }

    public String makan(String makanan){
        return makanan;
    }
}

class Domba extends Hewan {

    public void tingkah_laku(){
        System.out.println("--------- HEWAN DOMBA ---------");
        System.out.println("Domba bernafas : " + this.bernafas("werreee"));
        System.out.println("Suara Domba berlari : " + super.running("gruduk - gruduk"));
        System.out.println("Suara Domba : " + this.bersuara("Mbekkkk"));
        System.out.println("Domba berkembangbiak dengan cara : " + this.berkembangbiak("Beranak / Melahirkan"));
        System.out.println("Domba makan : " + this.makan("Rumput"));
    }

    public String bernafas(String nafas){
        return nafas;
    }

    public String bersuara(String suara){
        return suara;
    }

    public String berkembangbiak(String KB){
        return KB;
    }

    public String makan(String makanan){
        return makanan;
    }
}
