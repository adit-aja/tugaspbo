package tugas_dita;

public class Main {

    public static void main(String[] args) {

        // Objek Persegi
        Persegi p = new Persegi();
        p.setSisi(5);

        System.out.println("=== PERSEGI ===");
        System.out.println("Sisi       : " + p.getSisi());
        System.out.println("Luas       : " + p.getLuas());
        System.out.println("Keliling   : " + p.getKeliling());


        // Objek Lingkaran
        Lingkaran l = new Lingkaran();
        l.setJari(7);

        System.out.println("\n=== LINGKARAN ===");
        System.out.println("Jari-jari  : " + l.getJari());
        System.out.println("Luas       : " + l.getLuas());
        System.out.println("Keliling   : " + l.getKeliling());


        // Objek Persegi Panjang
        PersegiPanjang pp = new PersegiPanjang();
        pp.setPanjang(10);
        pp.setLebar(5);

        System.out.println("\n=== PERSEGI PANJANG ===");
        System.out.println("Panjang    : " + pp.getPanjang());
        System.out.println("Lebar      : " + pp.getLebar());
        System.out.println("Luas       : " + pp.getLuas());
        System.out.println("Keliling   : " + pp.getKeliling());


        // Objek Segitiga
        Segitiga s = new Segitiga();
        s.setAlas(6);
        s.setTinggi(4);
        s.setSisiKiri(5);
        s.setSisiKanan(5);

        System.out.println("\n=== SEGITIGA ===");
        System.out.println("Alas       : " + s.getAlas());
        System.out.println("Tinggi     : " + s.getTinggi());
        System.out.println("Luas       : " + s.getLuas());
        System.out.println("Keliling   : " + s.getKeliling());
    }
}