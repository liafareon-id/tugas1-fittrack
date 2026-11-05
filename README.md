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

FitTrack adalah program pendataan member gym berbasis Java.
Program ini membantu menyimpan nama, nomor telepon, tanggal
pendaftaran, dan jenis paket keanggotaan agar data member
dapat ditampilkan dengan lebih teratur.

Program juga menerapkan validasi agar data yang tidak sesuai
aturan tidak menggantikan data yang sudah valid.

## Fitur Utama

- Menyimpan data nama, nomor telepon, tanggal daftar,
  dan paket member.
- Memeriksa nama agar tidak kosong atau hanya berisi spasi.
- Memeriksa nomor telepon agar diawali angka 0,
  hanya berisi angka, dan memiliki minimal 10 digit.
- Membatasi jenis paket pada Basic, Premium, atau VIP.
- Menyediakan paket Basic secara otomatis melalui
  constructor tiga parameter.
- Menolak data tidak valid tanpa mengganti data lama.
- Menampilkan beberapa member yang disimpan dalam array.

## Konsep OOP yang Diterapkan

| Konsep | Lokasi Penerapan | Alasan |
|---|---|---|
| Class dan Object | Member.java dan TesFitTrack.java | Member menjadi cetak biru data member, sedangkan objek mewakili setiap anggota gym. |
| Encapsulation | Atribut private pada Member.java | Melindungi atribut agar tidak diakses langsung dari luar class. |
| Constructor | Constructor pada Member.java | Mengisi atribut ketika objek dibuat. |
| Constructor Overloading | Constructor 4 parameter dan 3 parameter | Member dapat dibuat dengan paket yang ditentukan atau paket default Basic. |
| This | Constructor pada Member.java | Memanggil constructor lengkap dari constructor tiga parameter. |
| Array dan For | TesFitTrack.java | Menyimpan dan menampilkan beberapa objek Member. |
| toString() | Method toString() pada Member.java | Menampilkan data objek dalam bentuk teks yang jelas. |
| If-Else | Seluruh setter pada Member.java | Menentukan apakah data memenuhi aturan validasi. |

## Struktur Project

```text
tugas1-fittrack/
├── src/
│   ├── Member.java
│   └── TesFitTrack.java
├── .gitignore
└── README.md
