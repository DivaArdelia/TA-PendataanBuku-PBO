public class TampilDaftar {

    Novel[] daftar = new Novel[5];
    Komik[] daftar1 = new Komik[5];
    Pelajaran[] daftar2 = new Pelajaran[5];
    private static int jml = 0;
    public void addNovel(Novel n){
        this.daftar[jml] = n;
        this.jml++;
    }

    private static int jml1 = 0;
    public void addKomik(Komik k){
        this.daftar1[jml1] = k;
        this.jml1++;
    }

    private static int jml2 = 0;
    public void addPelajaran(Pelajaran p){
        this.daftar2[jml2] = p;
        this.jml2++;
    }
    public void TampilJudulnvl(){
        int i;
        System.out.println("\nNo  Judul Buku ");
        for (i=0;i<jml;i++){
            System.out.println(i+1+"   "+daftar[i].getJudul());
        }
    }

    public void TampilJudulkmk(){
        int i;
        System.out.println("\nNo  Judul Buku ");
        for (i=0;i<jml1;i++){
            System.out.println(i+1+"   "+daftar1[i].getJudul());
        }
    }

    public void TampilJudulpljrn(){
        int i;
        System.out.println("\nNo  Judul Buku ");
        for (i=0;i<jml2;i++){
            System.out.println(i+1+"   "+daftar2[i].getJudul());
        }
    }
}
