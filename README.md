# PASD_jobsheet5BruteForceDanDivideConquer

Pertanyaan —— Percobaan 5.2
1. Pada base line Algoritma Divide Conquer untuk melakukan pencarian nilai faktorial, jelaskan perbedaan bagian kode pada penggunaan if dan else!
Jawaban: berikut penjelasannya
- if (n == 1) adalah base case : kondisi berhenti rekursi. ketika n sudah mencapai 1, langsung return 1 tanpa memanggil fungsi lagi. tanpa ini, rekursi akan berjalan terus tanpa henti (infinite recursion).
- else adalah recursive case : masalah dipecah (divide) dengan memanggil faktorialDC(n - 1), lalu hasilnya dikalikan n (combine). proses ini terus berulang sampai mencapai base case.