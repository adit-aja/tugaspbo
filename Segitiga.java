package tugas_dita;

public class Segitiga extends BangunDatar {

    private float alas;
    private float tinggi;
    private float sisiKiri;
    private float sisiKanan;

    public void setAlas(float alas) {
        this.alas = alas;
    }

    public void setTinggi(float tinggi) {
        this.tinggi = tinggi;
    }

    public void setSisiKiri(float sisiKiri) {
        this.sisiKiri = sisiKiri;
    }

    public void setSisiKanan(float sisiKanan) {
        this.sisiKanan = sisiKanan;
    }

    public float getAlas() {
        return alas;
    }

    public float getTinggi() {
        return tinggi;
    }

    public float getLuas() {
        return luas();
    }

    @Override
    protected float luas() {
        return 0.5f * alas * tinggi;
    }

    @Override
    protected float keliling() {
        return alas + sisiKiri + sisiKanan;
    }
}
