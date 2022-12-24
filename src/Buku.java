abstract public class Buku {

    String judul;
    String author;
    String publisher;
    String bulanterbit;
    int tahunterbit;
    int hal;


    public Buku(String judul, String author, String publisher, String bulanterbit, int tahunterbit, int hal) {
        this.judul = judul;
        this.author = author;
        this.publisher = publisher;
        this.bulanterbit = bulanterbit;
        this.tahunterbit = tahunterbit;
        this.hal = hal;
    }

    public String getJudul() {
        return judul;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getBulanterbit() {
        return bulanterbit;
    }

    public int getTahunterbit() {
        return tahunterbit;
    }

    public int getHal() {
        return hal;
    }


    public void tampilan(){
        System.out.println("Judul Buku : "+getJudul());
        System.out.println("Penulis    : "+getAuthor());
        System.out.println("Penerbit   : "+getPublisher());
        System.out.println("Jumlah Halaman : "+getHal()+" halaman");
        System.out.println("Bulan/Tahun Terbit : "+getBulanterbit()+"/"+getTahunterbit());
    }


    abstract double harga();
}
