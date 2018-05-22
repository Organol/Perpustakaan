package Kuliah;

public class Driver {
    public static void main(String[] args) {
        Dosen dosen = new Dosen("Ahmad Luky Ramdani", "jl.ra.Basyid", "Bandar Lampung", 28,'L',"PBO","S1", 30000000);
        System.out.println(dosen.toString());

        MahasiswaReport mhsrpt = new MahasiswaReport();
        mhsrpt.setmk1("Data Mining");
        mhsrpt.setnilai1("A");
        mhsrpt.setsks1(4);
        mhsrpt.setmk2("Data Mining Lanjut");
        mhsrpt.setnilai2("B");
        mhsrpt.setsks2(4);
        System.out.println(mhsrpt.toString());

        Mahasiswa mhs = new Mahasiswa("Barak Obama", "Way Hui", "Bandar Lampung", 21,'L', "14117001", "RC", 4, new MahasiswaReport("PBO","PBO Lanjut",3, 3, "A", "B"));
        System.out.println(mhs.toString());
    }
}


/*
    Output:

    Informasi Dosen
    ============================
    nama       :Ahmad Luky Ramdani
    Alamat     :jl.ra.Basyid
    Kota       :Bandar Lampung
    Umur       :28
    MK         :PBO
    Strata     :S1
    Salary     :30000000
    Laporan Nilai Mahasiswa
    ============================
    MK1      :Data Mining
    SKS1     :4
    Nilai1   :A
    MK2      :Data Mining Lanjut
    SKS2     :4
    Nilai2   :B
    NR       :3.5
    Informasi  Mahasiswa
    ============================
    nama       :Barak Obama
    Alamat     :Way Hui
    Kota       :Bandar Lampung
    Umur       :21
    NIP        :14117001
    Kelas      :RC
    Semester   :4
    Laporan Nilai Mahasiswa
    ============================
    MK1      :PBO
    SKS1     :3
    Nilai1   :A
    MK2      :PBO Lanjut
    SKS2     :3
    Nilai2   :B
    NR       :3.5
*/