import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int pilih,pil;
        String menu;
        Scanner input = new Scanner(System.in);
        TampilDaftar td = new TampilDaftar();

        Novel nvl = new Novel("Koala Kumal","Raditya Dika", "Gagas Media","Januari",2015,
                250,"0000768154");
        Novel nvl2 = new Novel("Selamat Tinggal", "Tere Liye", "Gramedia Pustaka Utama", "-", 2020,
                360, "9786020647821");
        Novel nvl3 = new Novel("The Ickabog","J.K. Rowling","Hachette Children's Group", "-",
                2020, 288, "9781510202252");
        Novel nvl4 = new Novel("Heartbreak MOTEL","Ika Natassa","Gramedia Pustaka Utama", "April",
                2022,400, "9786020658841");
        Novel nvl5 = new Novel("Sagaras","Tere Liye", "PT. Sabak Grip Nusantara", "Februari", 2022,
                384,"978-623-97262-5-6");
        td.addNovel(nvl);
        td.addNovel(nvl2);
        td.addNovel(nvl3);
        td.addNovel(nvl4);
        td.addNovel(nvl5);

        Komik kmk = new Komik("Avatar","Abdul Ghani", "PT. Gramedia","Februari",
                2018, 160, "200-AB010009", 2);
        Komik kmk2 = new Komik("Doraemon : Petualangan Nobita di Luar Angkasa", "Fujiko F Fujio Pro",
               "PT Elex Media Komputindo", "-", 2016, 196, "978-602-02-9232-8", 19);
        Komik kmk3 = new Komik("Detektif Conan", "Aoyama Gosho", "PT Elex Media Komputindo",
                "Oktober", 2021, 200, "978-4-09-850717-7", 100);
        Komik kmk4 = new Komik("One Piece", "eiichora Oda", "PT Elex Media Komputindo", "Maret",
                2007, 217, "978-979-27-0546-1", 1047);
        Komik kmk5 = new Komik("Naruto", "Masashi Kishimoto", "PT Elex Media Komputindo",
                "September", 2016, 204, "9786020278018", 71);
        td.addKomik(kmk);
        td.addKomik(kmk2);
        td.addKomik(kmk3);
        td.addKomik(kmk4);
        td.addKomik(kmk5);

        Pelajaran plj = new Pelajaran("Ilmu Pengetahuan Alam", "Siti Zubaidah, Lia Yuliati",
                "Pusat Kurikulum dan Pembukuan, Balibang, Kemendikbud", "Maret",
                2018, 360, "978-602-282-320-9", 19, 25);
        Pelajaran plj2 = new Pelajaran("Bahasa Indonesia SMP/MTs Kelas IX", "Agus Trianto,Titik Harsiati, E.Kosasih",
                "Pusat Kurikulum dan Pembukuan, Balibang, Kemendikbud", "Juli", 2018, 194,
                "978-602-282-971-3", 15, 25);
        Pelajaran plj3 = new Pelajaran("Biologi Kelas XI","Irnaningtyas", "Erlangga", "Juni",
                2019,460, "978-512-272-311-9", 19, 25);
        Pelajaran plj4 = new Pelajaran("Fisika Kelas XII", "Marthen Kanginan", "Erlangga", "maret",
                2018, 528, "9786022988212", 19, 25 );
        Pelajaran plj5 = new Pelajaran("Kimia kelas XII", "Unggul Sudarmo", "erlangga", "Mei",
                2018, 400, "9786022988403", 17, 25);
        td.addPelajaran(plj);
        td.addPelajaran(plj2);
        td.addPelajaran(plj3);
        td.addPelajaran(plj4);
        td.addPelajaran(plj5);

        System.out.println("+===============================+");
        System.out.println("|    PROGRAM PENDATAAN BUKU     |");
        System.out.println("+===============================+");
        System.out.println("|Menu Buku :                    |");
        System.out.println("|1. Novel                       |");
        System.out.println("|2. Komik                       |");
        System.out.println("|3. Buku Pelajaran              |");
        System.out.println("+===============================+");
        System.out.print("Masukkan Pilihan Menu Anda : ");
        pilih = input.nextInt();
        if(pilih == 1){
            td.TampilJudulnvl();
            tampilan :
            System.out.print("Masukkan pilihan buku untuk detail buku tersebut : ");
            pil = input.nextInt();

            if(pil==1){
                System.out.println();
                System.out.println("== SPESIFIKASI BUKU "+nvl.getJudul()+" == "+"\n");
                nvl.tampilan();
            }
            else if(pil==2){
                System.out.println();
                System.out.println("== SPESIFIKASI BUKU "+nvl2.getJudul()+" == "+"\n");
                nvl2.tampilan();
            }
            else if(pil==3){
                System.out.println();
                System.out.println("== SPESIFIKASI BUKU "+nvl3.getJudul()+" == "+"\n");
                nvl3.tampilan();
            }
            else if(pil==4){
                System.out.println();
                System.out.println("== SPESIFIKASI BUKU "+nvl4.getJudul()+" == "+"\n");
                nvl4.tampilan();
            }
            else if(pil==5){
                System.out.println();
                System.out.println("== SPESIFIKASI BUKU "+nvl5.getJudul()+" == "+"\n");
                nvl5.tampilan();
            }

        }
        else if (pilih == 2) {
            td.TampilJudulkmk();
            System.out.print("Masukkan pilihan buku untuk detail buku tersebut : ");
            pil = input.nextInt();
            if(pil==1){
                System.out.println();
                System.out.println("== SPESIFIKASI BUKU "+kmk.getJudul()+" == "+"\n");
                kmk.tampilan();
            }
            else if(pil==2){
                System.out.println();
                System.out.println("== SPESIFIKASI BUKU "+kmk2.getJudul()+" == "+"\n");
                kmk2.tampilan();
            }
            else if(pil==3){
                System.out.println();
                System.out.println("== SPESIFIKASI BUKU "+kmk3.getJudul()+" == "+"\n");
                kmk3.tampilan();
            }
            else if(pil==4){
                System.out.println();
                System.out.println("== SPESIFIKASI BUKU "+kmk4.getJudul()+" == "+"\n");
                kmk4.tampilan();
            }
            else if(pil==5){
                System.out.println();
                System.out.println("== SPESIFIKASI BUKU "+kmk5.getJudul()+" == "+"\n");
                kmk5.tampilan();
            }
        }
        else if (pilih == 3) {
            td.TampilJudulpljrn();
            System.out.print("Masukkan pilihan buku untuk detail buku tersebut : ");
            pil = input.nextInt();
            if(pil==1){
                System.out.println();
                System.out.println("== SPESIFIKASI BUKU "+plj.getJudul()+" == "+"\n");
                plj.tampilan();
            }
            else if(pil==2){
                System.out.println();
                System.out.println("== SPESIFIKASI BUKU "+plj2.getJudul()+" == "+"\n");
                plj2.tampilan();
            }
            else if(pil==3){
                System.out.println();
                System.out.println("== SPESIFIKASI BUKU "+plj3.getJudul()+" == "+"\n");
                plj3.tampilan();
            }
            else if(pil==4){
                System.out.println();
                System.out.println("== SPESIFIKASI BUKU "+plj4.getJudul()+" == "+"\n");
                plj4.tampilan();
            }
            else if(pil==5){
                System.out.println();
                System.out.println("== SPESIFIKASI BUKU "+plj5.getJudul()+" == "+"\n");
                plj5.tampilan();
            }
        }
    }
}