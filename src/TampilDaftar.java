public class TampilDaftar {

    Novel[] daftar = new Novel[5];
    Komik[] daftar1 = new Komik[5];
    Pelajaran[] daftar2 = new Pelajaran[5];
    public static int jml = 0;
    public void addNovel(Novel n){
        this.daftar[jml] = n;
        this.jml++;
    }

    public static int jml1 = 0;
    public void addKomik(Komik k){
        this.daftar1[jml1] = k;
        this.jml1++;
    }

    public static int jml2 = 0;
    public void addPelajaran(Pelajaran p){
        this.daftar2[jml2] = p;
        this.jml2++;
    }
    public void TampilJudulnvl(){
        int i;
        System.out.println("No  Judul Buku \t\t\t\tHarga |\t Diskon |\t Total Harga");
        for (i=0;i<jml;i++){
            System.out.println(i+1+"   "+daftar[i].getJudul()+" \t\t"+daftar[i].harga()+"   |\t"+daftar[i].hitungDiskon()+"   |\t"+
                    daftar[i].hargatototal());
        }
    }

    public void TampilJudulkmk(){
        int i;
        System.out.println("No  Judul Buku \t\t\t\tHarga |\t Diskon |\t Total Harga");
        for (i=0;i<jml1;i++){
            System.out.println(i+1+"   "+daftar1[i].getJudul()+" \t\t"+daftar1[i].harga()+"\t"+daftar1[i].hitungDiskon()+"\t"+
                    daftar1[i].hargatototal());
        }
    }

    public void TampilJudulpljrn(){
        int i;
        System.out.println("No  Judul Buku \t\t\t\tHarga |\t Diskon |\t Total Harga");
        for (i=0;i<jml2;i++){
            System.out.println(i+1+"   "+daftar2[i].getJudul()+" \t\t"+daftar2[i].harga()+"\t"+daftar2[i].hitungDiskon()+"\t"+
                    daftar2[i].hargatototal());
        }
    }
}
