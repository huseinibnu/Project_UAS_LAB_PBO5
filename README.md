# Project_UAS_LAB_PBO5

## Pengenalan Project

Project ini diawali dengan memilih antara halaman admin dan halaman kasir, pada halaman admin anda dapat menambahkan daftar makanan dan minuman, kemudian dari halaman admin anda dapat berpindah ke halaman kasir. Pada halaman kasir terdapat beberapa pilihan yang bisa anda pilih seperti menambahkan barang ke keranjang, melihat daftar belanjaan, menghitung total belanja, menghapus barang yang ada di keranjang dan keluar. Sebelum anda memasuki halaman admin, anda akan diminta untuk memasukkan password berupa "admin123".

## Penjelasan konsep OOP yang digunakan pada project kasir ini

Pada project kode di atas, enkapsulasi dan polymorphism diimplementasikan pada beberapa bagian:
1.  Enkapsulasi:
    Enkapsulasi diterapkan pada kelas "Produk", dengan menggunakan variabel `nama` dan `harga` sebagai private, sehingga hanya dapat diakses melalui metode getter dan setter yang ditentukan (`getNama()`, `getHarga()`, `setHarga()`).
Seluruh variabel dalam kelas "Makanan" dan "Minuman" juga dienkapsulasi dengan menggunakan modifier `private`, dan akses ke variabel tersebut dilakukan melalui metode getter yang sesuai (`getJenis()` pada kelas "Makanan", `getUkuran()` pada kelas "Minuman").

2.  Polymorphism:
    Polymorphism diterapkan melalui konsep inheritance dan overriding dalam kelas "Makanan" dan "Minuman".
Kelas "Makanan" dan "Minuman" adalah turunan dari kelas "Produk". Ini memungkinkan objek dari kelas "Makanan" dan "Minuman" untuk dianggap sebagai objek dari kelas "Produk" secara umum.
Metode `toString()` di-override pada kedua kelas turunan ("Makanan" dan "Minuman") untuk memberikan representasi string yang khusus sesuai dengan jenis produknya.
Dalam metode `jalankan()` pada kelas "Kasir" dan kelas"Admin, ketika menambahkan produk ke keranjang, polymorphism digunakan saat objek dari kelas "Makanan" atau "Minuman" ditempatkan dalam variabel dengan tipe data "Produk".

3.  Inheritance
    Inheritance diterapkan pada kelas "Makanan" dan "Minuman" yang dimana merupakan turunan dari kelas "Produk".
