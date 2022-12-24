public class Komik extends Buku implements  Diskon{

    String ISBN;
    int vol;

    public Komik(String judul, String author, String publisher, String bulanterbit, int tahunterbit, int hal,
                 String ISBN, int vol) {
        super(judul, author, publisher, bulanterbit, tahunterbit, hal);
        this.ISBN = ISBN;
        this.vol = vol;
    }

    public String getISBN() {
        return ISBN;
    }

    public int getVol() {
        return vol;
    }

    @Override
    double harga() {
        return (super.getHal() * 150);
    }

    @Override
    public double hitungDiskon() {
        return 0.1 * harga();
    }

    @Override
    public double hargatototal() {
        return harga() - hitungDiskon();
    }

    public void tampilan() {
        System.out.println("Judul Buku : "+getJudul());
        System.out.println("Vol ke     : "+getVol());
        System.out.println("Penulis    : "+getAuthor());
        System.out.println("Penerbit   : "+getPublisher());
        System.out.println("Jumlah Halaman : "+getHal()+" halaman");
        System.out.println("Bulan/Tahun Terbit : "+getBulanterbit()+"/"+getTahunterbit());
        System.out.println("ISBN       : "+getISBN());
        System.out.println("Harga      : Rp. "+harga());
        System.out.println("Total Diskon : Rp. "+hitungDiskon());
        System.out.println("Total Harga : Rp. "+hargatototal());
    }
}
