package minggu5;

public class Faktorial {
    int n;

    public Faktorial(int n) {
        this.n = n;
    }

    // Brute Force : menggunakan perulangan
    int faktorialBF(int n) {
        int fakto = 1;
        int i = 1;
        do {
            fakto = fakto * i;
            i++;
        } while (i <= n);
        return fakto;
    }

    // Divide Conquer : menggunakan rekursi
    int faktorialDC(int n) {
        if(n == 1) {
            return 1;
        } else {
            int fakto = n * faktorialDC(n - 1);
            return fakto;
        }
    }
}