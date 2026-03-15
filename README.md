# PASD_jobsheet5BruteForceDanDivideConquer

Pertanyaan —— Percobaan 5.2
1. Pada base line Algoritma Divide Conquer untuk melakukan pencarian nilai faktorial, jelaskan perbedaan bagian kode pada penggunaan if dan else!
Jawaban: berikut penjelasannya
- if (n == 1) adalah base case : kondisi berhenti rekursi. ketika n sudah mencapai 1, langsung return 1 tanpa memanggil fungsi lagi. tanpa ini, rekursi akan berjalan terus tanpa henti (infinite recursion).
- else adalah recursive case : masalah dipecah (divide) dengan memanggil faktorialDC(n - 1), lalu hasilnya dikalikan n (combine). proses ini terus berulang sampai mencapai base case.
2. Apakah memungkinkan perulangan pada method faktorialBF() diubah selain menggunakan for? Buktikan!
Jawaban: iya, memungkinkan. perulangan for pada method faktorialBF() bisa diganti dengan jenis perulangan lain seperti while maupun do-while, karena ketiganya memiliki fungsi yang sama yaitu mengulang proses perkalian dari 1 sampai n. perbedaannya hanya pada sintaks penulisannya saja.