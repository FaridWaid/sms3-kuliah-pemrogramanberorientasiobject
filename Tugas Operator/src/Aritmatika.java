public class Aritmatika {
    private int a,b;
    private String c;

    Aritmatika(int a, int b, String c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void penambahan (){
        int total_tambah = this.a + this.b;
        System.out.println("Nilai a = " + this.a  + " ,Nilai b = " + this.b);
        System.out.println("Nilai a + b = " + total_tambah);
    }

    public void pengurangan (){
        int total_kurang = this.a  - this.b;
        System.out.println("Nilai a = " + this.a  + " ,Nilai b = " + this.b);
        System.out.println("Nilai a - b = " + total_kurang);
    }

    public void pembagian (){
        int total_bagi = this.a  / this.b;
        System.out.println("Nilai a = " + this.a  + " ,Nilai b = " + this.b);
        System.out.println("Nilai a / b = " + total_bagi);
    }

    public void pembanding (){
        boolean hasil_banding = this.a == this.b;
        System.out.println("Nilai a = " + this.a  + " ,Nilai b = " + this.b );
        System.out.print("a == b : Value = " + hasil_banding );
        System.out.print("\n");

        boolean hasil_banding2 = this.a != this.b;
        System.out.print("a != b : Value = " + hasil_banding2 );
        System.out.print("\n");

        boolean hasil_banding3 = this.a > this.b;
        System.out.print("a > b : Value = " + hasil_banding3 );
        System.out.print("\n");

        boolean hasil_banding4 = this.a < this.b;
        System.out.print("a < b : Value = " + hasil_banding4 );
        System.out.print("\n");

        boolean hasil_banding5 = this.a >= this.b;
        System.out.print("a >= b : Value = " + hasil_banding5 );
        System.out.print("\n");

        boolean hasil_banding6 = this.a <= this.b;
        System.out.print("a <= b : Value = " + hasil_banding6 );
        System.out.print("\n");
    }

    public void konversiBiner (){
        this.a = a;
        String binary = Integer.toBinaryString(this.a);
        System.out.println("Hasil Binary dari nilai " + this.a + " = " + binary);
    }

    public void konversiDesimal (){
        this.c = c;
        int desimal = Integer.parseInt(this.c, 2);
        System.out.println("Hasil Desimal dari nilai " + this.c + " = " + desimal);
    }

    /*public void decimaltoBinary (int a){
        this.a = a;
        String binary = "";

        while(this.a>0){
            int Try = this.a%2;
            this.a = this.a/2;
            binary = Try + binary;
        }
        System.out.println("Hasil binary = " + binary);
    }
*/
}
