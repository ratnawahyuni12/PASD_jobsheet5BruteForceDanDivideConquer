package minggu5;

public class MainLatihanNilaiMhs {
    public static void main(String[] args) {
        LatihanNilaiMhs[] mhs = {
            new LatihanNilaiMhs("Ahmad", 220101001, 2022, 78, 82),
            new LatihanNilaiMhs("Budi", 220101002, 2022, 85, 88),
            new LatihanNilaiMhs("Cindy", 220101003, 2021, 90, 87),
            new LatihanNilaiMhs("Dian", 220101004, 2021, 76, 79),
            new LatihanNilaiMhs("Eko", 220101005, 2023, 92, 95),
            new LatihanNilaiMhs("Fajar", 220101006, 2020, 88, 85),
            new LatihanNilaiMhs("Gina", 220101007, 2023, 80, 83),
            new LatihanNilaiMhs("Hadi", 220101008, 2020, 82, 84),
        };

        int n = mhs.length;

        System.out.println("=== A) NILAI UTS TERTINGGI - DIVIDE AND CONQUER ===");
        System.out.println("Nilai : " + LatihanNilaiMhs.maxUTS(mhs, 0, n - 1));
        System.out.println();

        System.out.println("=== B) NILAI UTS TERENDAH - DIVIDE AND CONQUER ===");
        System.out.println("Nilai : " + LatihanNilaiMhs.minUTS(mhs, 0, n - 1));
        System.out.println();

        System.out.println("=== C) RATA-RATA NILAI UAS - BRUTE FORCE ===");
        System.out.println("Rata-rata : " + LatihanNilaiMhs.rataUAS(mhs));
        System.out.println();
    }
}