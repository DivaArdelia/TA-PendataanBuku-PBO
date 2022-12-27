public class Novel extends Buku implements Diskon{

    String ISBN;
    public Novel(String judul, String author, String publisher, String bulanterbit, int tahunterbit, int hal, String ISBN) {
        super(judul, author, publisher, bulanterbit, tahunterbit, hal);
        this.ISBN = ISBN;
    }
    public String getISBN() {
        return ISBN;
    }

    @Override
    double harga() {
        return (super.getHal() * 150);
    }

    @Override
    public double hitungDiskon() {
        return 0.2 * harga();
    }

    @Override
    public double hargatototal() {
        return harga() - hitungDiskon();
    }

    public void tampilan() {
        System.out.println("Judul Buku : "+getJudul());
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
