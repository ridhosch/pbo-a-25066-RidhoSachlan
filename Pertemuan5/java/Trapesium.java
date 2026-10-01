public class Trapesium extends BangunDatar {

    private final double sisiAtas;
    private final double sisiBawah;
    private final double tinggi;
    private final double sisiKiri;
    private final double sisiKanan;

    public Trapesium(double sisiAtas, double sisiBawah, double tinggi, double sisiKiri, double sisiKanan) {
        super("Trapesium");
        // TODO 1: tolak sisi <= 0.
        this.sisiAtas = sisiAtas;
        this.sisiBawah = sisiBawah;
        this.tinggi = tinggi;
        this.sisiKiri = sisiKiri;
        this.sisiKanan = sisiKanan;
    }

    // TODO 2: lengkapi luas() dan keliling().
    @Override
    public double luas() {
        return 0.5 * (sisiAtas + sisiBawah)  * tinggi;
    }

    @Override
    public double keliling() {
        // Asumsi trapesium sama kaki untuk menghitung keliling
        return sisiAtas + sisiBawah + sisiKiri + sisiKanan;
    }

    @Override
    public String toString() {
        return getNama() + " (atas=" + sisiAtas +
        ", bawah=" + sisiBawah +
        ", tinggi=" +tinggi +
        ") luas+" + luas();
    }

}