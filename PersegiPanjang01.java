public class PersegiPanjang01 {
    int panjang;
    int lebar;
    
    public PersegiPanjang01(int p, int l) {
        panjang = p;
        lebar = l;
    }

    public PersegiPanjang01() {
    }

    public int hitungLuas() {
        return panjang * lebar;
    }

    public int hitungKeliling() {
        return 2 * (panjang + lebar);
    }
}
