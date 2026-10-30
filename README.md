# FitTrack - Sistem Keanggotaan Gym

## Identitas
* **Mata Kuliah:** Praktikum Pemrograman Berorientasi Objek (PBO)
* **Nama Tugas:** Tugas 1: Sistem Keanggotaan Gym FitTrack
* **Nama Lengkap:** Aulia Faradina
* **NPM:** 250810701100019
* **Kelas:** A

---

## Deskripsi Singkat
FitTrack adalah aplikasi pendataan member gym berbasis Java yang dirancang sebagai langkah awal digitalisasi untuk menggantikan pencatatan manual di buku tulis. Sistem ini berfokus pada validasi data yang ketat guna memastikan informasi identitas member, nomor telepon, tanggal pendaftaran, dan jenis paket selalu akurat serta valid selama aplikasi berjalan.

---

## Fitur Utama
* **Manajemen Data Member:** Menyimpan informasi lengkap meliputi nama lengkap, nomor telepon aktif, tanggal daftar, dan jenis paket keanggotaan.
* **Validasi Otomatis pada Setter:** Memastikan setiap input data melalui aturan validasi yang ketat sebelum disimpan ke dalam atribut objek.
* **Constructor Overloading:** Mendukung pembuatan objek member baik dengan paket lengkap (4 parameter) maupun menggunakan paket default `Basic` (3 parameter).
* **Penyimpanan Berbasis Array:** Mengelola beberapa objek `Member` sekaligus menggunakan struktur data array dan menampilkannya melalui perulangan `for`.

---

## Konsep OOP yang Diterapkan

| Konsep OOP | Lokasi Penerapan | Alasan Pemilihan |
| :--- | :--- | :--- |
| **Class & Object** | `Member.java` & `TesFitTrack.java` | Memodelkan entitas dunia nyata (member gym) ke dalam bentuk cetak biru (class) dan instansiasinya (object). |
| **Encapsulation** | `Member.java` (Atribut `private`) | Melindungi data atribut dari akses langsung luar class serta memusatkan logika validasi di dalam method setter. |
| **Constructor Overloading** | `Member.java` (Dua jenis constructor) | Memberikan fleksibilitas dalam instansiasi objek dengan jumlah parameter yang berbeda. |
| **Array & Looping** | `TesFitTrack.java` (`Member[]` & `for`) | Menyimpan dan memproses kumpulan objek secara efisien dalam satu struktur data. |

---

## Struktur Project
```text
tugas1-fittrack/
│
├── src/
│   ├── Member.java
│   └── TesFitTrack.java
│
├── .gitignore
└── README.md
