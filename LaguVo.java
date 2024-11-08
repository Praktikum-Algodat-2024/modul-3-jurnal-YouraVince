public class LaguVo {
    String judulLagu;
    String penyanyi;
    int tahunRilis;
    int menit;
    int detik;
    LaguVo next;
    LaguVo prev;

    public LaguVo(String judulLagu, String penyanyi, int tahunRilis, int menit, int detik) {
        this.judulLagu = judulLagu;
        this.penyanyi = penyanyi;
        this.tahunRilis = tahunRilis;
        this.menit = menit;
        this.detik = detik;
        this.next = null;
        this.prev = null;
    }
}
