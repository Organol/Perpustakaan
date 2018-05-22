package Kuliah;

/*
    Rumus NR:
    (sks mk 1 * Nilai Mutu mk 1) + (sks mk 2 * Nilai Mutu mk 2) / sks mk 1 + sks mk 2
 */

public class MahasiswaReport
{
    private static final int A = 4;
    private static final int B = 3;
    private static final int C = 2;
    private static final int D = 1;
    private static final int E = 0;
    private String mk1;
    private String mk2;
    private int sks1;
    private int sks2;
    private String nilai1;
    private String nilai2;

    MahasiswaReport(){}
    MahasiswaReport(String mk1, String mk2, int sks1, int sks2, String nilai1, String nilai2) {
    }
    MahasiswaReport(MahasiswaReport sp) {
    }
    public String getmk1() {
        return "";
    }
    public void setmk1(String mk1) {
    }
    public String getmk2() {
        return "";
    }
    public void setmk2(String mk2) {
    }
    public int getsks1() {
        return 0;
    }
    public void setsks1(int sks1) {
    }
    public int getsks2() {
        return 0;
    }
    public void setsks2(int sks2) {
    }
    public String getnilai1() {
        return "";
    }
    public void setnilai1(String nilai1) {
    }
    public String getnilai2() {
        return "";
    }
    public void setnilai2(String nilai2) {
    }
    public float HitungNR()
    {
        return 0;
    }
    public float ConvertNilaiMutu(String HurufMutu){
        return 0;
    }
    public String toString() {
        String str =  "";
        return str;
    }
    public static void main(String[] args) {
        MahasiswaReport mhsrpt = new MahasiswaReport();
        mhsrpt.setmk1("Data Mining");
        mhsrpt.setnilai1("A");
        mhsrpt.setsks1(4);
        mhsrpt.setmk2("Data Mining Lanjut");
        mhsrpt.setnilai2("B");
        mhsrpt.setsks2(4);
        System.out.println(mhsrpt.toString());
    }
}
