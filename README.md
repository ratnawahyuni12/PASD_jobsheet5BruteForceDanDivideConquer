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