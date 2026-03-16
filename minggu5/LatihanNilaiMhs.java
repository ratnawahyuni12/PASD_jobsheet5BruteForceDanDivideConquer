package minggu5;

public class LatihanNilaiMhs {
    String nama;
    int nim, tahunMasuk, nilaiUTS, nilaiUAS;

    LatihanNilaiMhs(String nama, int nim, int tahunMasuk, int nilaiUTS, int nilaiUAS) {
        this.nama = nama;
        this.nim = nim;
        this.tahunMasuk = tahunMasuk;
        this.nilaiUTS = nilaiUTS;
        this.nilaiUAS = nilaiUAS;
    }

    // menentukan nilai UTS tertinggi (Divide and Conquer)
    static int maxUTS(LatihanNilaiMhs[] arr, int l, int r) {
        if (l == r) {
            return arr[l].nilaiUTS;
        }

        int mid = (l + r) / 2;
        int lmax = maxUTS(arr, l, mid);
        int rmax = maxUTS(arr, mid + 1, r);
        return Math.max(lmax, rmax);
    }
        
    // menentukan nilai UTS terendah (Divide and Conquer)
    static int minUTS(LatihanNilaiMhs[] arr, int l, int r) {
        if (l == r) {
            return arr[l].nilaiUTS;
        }

        int mid = (l + r) / 2;
        int lmin = minUTS(arr, l, mid);
        int rmin = minUTS(arr, mid + 1, r);
        return Math.min(lmin, rmin);
    }

    // menentukan rata-rata nilai UAS (Brute Force)
    static double rataUAS(LatihanNilaiMhs[] arr) {
        double total = 0;
        for (int i = 0; i < arr.length; i++) {
            total = total + arr[i].nilaiUAS;
        }
        return total / arr.length;
    }
}
