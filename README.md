# FitTrack - Sistem Keanggotaan Gym

## Identitas

| Keterangan | Isi |
|---|---|
| Mata Kuliah | Praktikum Pemrograman Berorientasi Objek (PBO) |
| Nama Tugas | Tugas 1: Sistem Keanggotaan Gym FitTrack |
| Nama Lengkap | Aulia Faradina |
| NPM | 250810701100019 |
| Kelas | A |

## Deskripsi Singkat

FitTrack adalah program pendataan member gym berbasis Java yang dirancang untuk membantu digitalisasi operasional pencatatan keanggotaan. Program ini menyimpan data nama lengkap, nomor telepon aktif, tanggal pendaftaran, dan paket keanggotaan agar terhindar dari kendala data tercecer atau tulisan tangan yang sulit dibaca.

Program menerapkan enkapsulasi dan pemusatan validasi di setter untuk memastikan setiap masukan data memenuhi kriteria yang ditentukan dan tidak menimpa nilai yang sudah valid jika terjadi kesalahan input.

## Fitur Utama

- Menyimpan data member gym (nama, nomor telepon, tanggal daftar, dan jenis paket).
- Memeriksa nama agar tidak kosong atau hanya berisi spasi.
- Memeriksa nomor telepon agar wajib diawali angka 0, hanya berisi digit numerik, dan memiliki minimal 10 digit.
- Membatasi jenis paket hanya pada pilihan Basic, Premium, atau VIP.
- Menyediakan constructor overloading yang otomatis mengisi paket default Basic jika paket tidak disertakan.
- Menolak input tidak valid di method setter tanpa merusak atau mengubah data lama.
- Menampilkan daftar seluruh member gym yang disimpan dalam array secara rapi dan berlabel.

## Konsep OOP yang Diterapkan

| Konsep | Lokasi Penerapan | Alasan |
|---|---|---|
| Class dan Object | `Member.java` dan `TesFitTrack.java` | `Member` menjadi cetak biru entitas keanggotaan, sedangkan objek mewakili data nyata setiap member gym. |
| Encapsulation | Atribut `private` dan method `getter`/`setter` di `Member.java` | Melindungi atribut dari modifikasi langsung di luar class dan memusatkan logika validasi di setter. |
| Constructor | Constructor pada `Member.java` | Menginisialisasi nilai atribut awal objek dengan memanggil masing-masing setter. |
| Constructor Overloading | Constructor 4 parameter dan 3 parameter di `Member.java` | Menyediakan fleksibilitas pembuatan member, baik dengan paket custom maupun paket default. |
| Keyword this | Constructor 3 parameter di `Member.java` | Menerapkan constructor chaining (`this(...)`) menuju constructor lengkap untuk menghindari duplikasi kode (prinsip DRY). |
| Method Overriding | Method `toString()` di `Member.java` | Mengganti representasi default alamat memori objek dari class `Object` dengan format teks berlabel yang informatif. |
| Array of Objects | Variabel `daftarMember` di `TesFitTrack.java` | Menampung kumpulan referensi objek `Member` dalam satu struktur data berurutan. |

## Struktur Project

```text
tugas1-fittrack/
├── out/
├── src/
│   ├── Member.java
│   └── TesFitTrack.java
├── .gitignore
└── README.md
