# PASD_jobsheet5BruteForceDanDivideConquer

Pertanyaan —— Percobaan 5.2
1. Pada base line Algoritma Divide Conquer untuk melakukan pencarian nilai faktorial, jelaskan perbedaan bagian kode pada penggunaan if dan else!
Jawaban: berikut penjelasannya
- if (n == 1) adalah base case : kondisi berhenti rekursi. ketika n sudah mencapai 1, langsung return 1 tanpa memanggil fungsi lagi. tanpa ini, rekursi akan berjalan terus tanpa henti (infinite recursion).
- else adalah recursive case : masalah dipecah (divide) dengan memanggil faktorialDC(n - 1), lalu hasilnya dikalikan n (combine). proses ini terus berulang sampai mencapai base case.
2. Apakah memungkinkan perulangan pada method faktorialBF() diubah selain menggunakan for? Buktikan!
Jawaban: iya, memungkinkan. perulangan for pada method faktorialBF() bisa diganti dengan jenis perulangan lain seperti while maupun do-while, karena ketiganya memiliki fungsi yang sama yaitu mengulang proses perkalian dari 1 sampai n. perbedaannya hanya pada sintaks penulisannya saja.
3. Jelaskan perbedaan antara fakto *= i; dan int fakto = n * faktorialDC(n-1); !
Jawaban: fakto *= i; dan int fakto = n * faktorialDC(n-1); adalah dua pendekatan berbeda dalam menghitung faktorial.
- fakto *= i; berada di method faktorialBF() dan bekerja secara iteratif, yaitu fakto diperbarui setiap iterasi loop secara bertahap dari i=1 hingga i=n. contohnya untuk n=5: 1×1, 1×2, 2×3, 6×4, 24×5 = 120.
- int fakto = n * faktorialDC(n-1); berada di method faktorialDC() dan bekerja secara rekursif, yaitu memanggil dirinya sendiri dengan nilai n yang terus berkurang hingga mencapai base case. contohnya untuk n=5: 5×(4×(3×(2×(1)))) = 120.
keduanya menghasilkan nilai yang sama, namun berbeda cara prosesnya. fakto *= i; menghitung dari bawah ke atas, sedangkan int fakto = n * faktorialDC(n-1); memecah masalah dari atas ke bawah lalu menggabungkan hasilnya saat kembali ke atas.
4. Buat Kesimpulan tentang perbedaan cara kerja method faktorialBF()  dan faktorialDC()!
Jawaban: faktorialBF() dan faktorialDC() sama-sama digunakan untuk menghitung nilai faktorial, namun keduanya memiliki cara kerja yang berbeda.
- faktorialBF() bekerja secara iteratif menggunakan perulangan for yang berjalan dari i=1 hingga i=n, mengalikan nilai fakto secara bertahap hingga perulangan selesai. prosesnya linear dan searah dari bawah ke atas.
- faktorialDC() bekerja secara rekursif dengan memecah masalah besar menjadi sub-masalah yang lebih kecil. fungsi terus memanggil dirinya sendiri dengan nilai n-1 hingga mencapai base case (n==1), lalu hasilnya dikombinasikan kembali saat fungsi "naik" ke pemanggilan sebelumnya.
kesimpulannya, faktorialBF() lebih sederhana dan hemat memori karena tidak menggunakan call stack, sedangkan faktorialDC() lebih elegan secara penulisan kode namun menggunakan lebih banyak memori karena setiap pemanggilan rekursif disimpan di call stack hingga base case tercapai.

Pertanyaan —— Percobaan 5.3
1. Jelaskan mengenai perbedaan 2 method yang dibuat yaitu pangkatBF() dan pangkatDC()!
Jawaban: pangkatBF() dan pangkatDC() sama-sama menghitung nilai pangkat, namun dengan cara yang berbeda. 
- pangkatBF() bekerja secara iteratif menggunakan perulangan for yang berjalan sebanyak n kali, mengalikan hasil dengan a secara bertahap. contohnya untuk 2^4: 1×2, 2×2, 4×2, 8×2 = 16.
- pangkatDC() bekerja secara rekursif dengan strategi divide and conquer, yaitu memecahkan masalah menjadi setengahnya setiap kali rekursi. caranya dengan mengecek apakah pangkat genap atau ganjil:
  - jika genap: pangkatDC(a, n/2) × pangkatDC(a, n/2)
  - jika ganjil: pangkatDC(a, n/2) × pangkatDC(a, n/2) × a
contohnya untuk 2^4: dipecah jadi pangkatDC(2, 2) × pangkatDC(2, 2) → pangkatDC(2, 1) × pangkatDC(2, 1) → base case return a = 2, sehingga 2×2=4, lalu 4×4=16.
kesimpulannya, pangkatBF() lebih sederhana namun membutuhkan iterasi sebanyak n kali, sedangkan pangkatDC() lebih efisien karena memecah masalah menjadi setengahnya setiap rekursi sehingga prosesnya jauh lebih cepat untuk pangkat yang besar.
2. Apakah tahap combine sudah termasuk dalam kode tersebut?Tunjukkan!
Jawaban: iya, tahap combine sudah termasuk dalam kode tersebut. tahap combine pada divide and conquer adalah proses menggabungkan hasil dari sub-masalah yang sudah diselesaikan. pada method pangkatDC(), tahap combine terlihat di bagian else:
if (n % 2 == 1) {
    return (pangkatDC(a, n/2) * pangkatDC(a, n/2) * a);
} else {
    return (pangkatDC(a, n/2) * pangkatDC(a, n/2));
}
operasi perkalian ( * ) itulah yang menjadi tahap combine. hasil dari dua sub-masalah pangkatDC(a, n/2) digabungkan kembali dengan cara dikalikan satu sama lain. jika pangkatnya ganjil, ditambah satu perkalian ( * a ) lagi untuk mengkompensasi sisa pembagian.
3. Pada method pangkatBF() terdapat parameter untuk melewatkan nilai yang akan dipangkatkan dan pangkat berapa, padahal di sisi lain di class Pangkat telah ada atribut nilai dan pangkat, apakah menurut Anda method tersebut tetap relevan untuk memiliki parameter? Apakah bisa jika method tersebut dibuat dengan tanpa parameter? Jika bisa, seperti apa method pangkatBF() yang tanpa parameter?
Jawaban: method pangkatBF() sebenarnya kurang relevan untuk memiliki parameter, karena class Pangkat sudah memiliki atribut nilai dan pangkat yang bisa langsung diakses di dalam method tanpa perlu dilewatkan sebagai parameter. method pangkatBF() bisa dibuat tanpa parameter dengan langsung menggunakan atribut class. lalu di MainPangkat.java cara pemanggilannya jadi lebih simpel.
keduanya menghasilkan output yang sama, namun versi tanpa parameter lebih efisien karena tidak perlu mengoper nilai yang sebetulnya sudah tersedia di dalam objek itu sendiri.
4. Tarik tentang cara kerja method pangkatBF() dan pangkatDC()!
Jawaban: berikut penjelasannya
- pangkatBF() bekerja secara iteratif menggunakan perulangan for yang berjalan sebanyak pangkat kali. setiap iterasi, nilai hasil dikalikan dengan nilai secara bertahap hingga perulangan selesai. prosesnya linear (semakin besar pangkatnya, semakin banyak iterasi yang dilakukan).
- pangkatDC() bekerja secara rekursif dengan memecah masalah menjadi setengahnya setiap pemanggilan. setiap rekursi mengecek apakah pangkat genap atau ganjil, lalu menggabungkan hasilnya kembali dengan perkalian. prosesnya jauh lebih efisien karena jumlah rekursi hanya sebanyak log₂(n).
kesimpulannya, kedua method menghasilkan nilai yang sama, namun pangkatBF() lebih sederhana dengan kompleksitas O(n). sedangkat pangkatDC() lebih efisien dengan kompleksitas O(log n), artinya untuk pangkat yang sangat besar, pangkatDC() jauh lebih cepat dibanding pangkatBF().

Pertanyaan —— Percobaan 5.4
1. Kenapa dibutuhkan variable mid pada method TotalDC()?
Jawaban: variabel mid dibutuhkan sebagai titik tengah untuk memecah array menjadi 2 bagian dalam proses divide. tanpa mid, maka tidak bisa menentukan batas pemisah antara bagian kiri dan kanan array, sehingga proses divide and conquer tidak bisa berjalan. mid inilah yang memastikan setiap rekursi memproses bagian array yang berbeda hingga mencapai base case (1 == r).
2. Untuk apakah statement di bawah ini dilakukan dalam TotalDC()?
double lsum = totalDC(arr, l, mid);
double rsum = totalDC(arr, mid + 1, r);
Jawaban: statement tersebut adalah tahap conquer dalam Divide and Conquer.
- double lsum = totalDC(arr, l, mid); bertugas menghitung total penjumlahan bagian kiri array (dari indeks i sampai mid).
- double rsum = totalDC(arr, mid + 1, r); bertugas menghitung total penjumlahan bagian kanan array (dari indeks mid+1 sampai r).
keduanya bekerja dengan cara memanggil dirinya sendiri secara rekursif, terus memecah array menjadi bagian yang lebih kecil hingga mencapai base case (1 == r), yaitu saat array hanya tersisa 1 elemen dan langsung dikembalikan nilainya.