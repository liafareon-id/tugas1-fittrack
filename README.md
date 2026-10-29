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
```

---

## Prasyarat
* **Java Development Kit (JDK):** Versi 11 atau yang lebih baru (disarankan JDK 17 / 21).
* **IDE:** IntelliJ IDEA, Eclipse, atau Text Editor dengan Java compiler (VS Code / Terminal).

---

## Cara Menjalankan Program

### 1. Melalui Command Line (Terminal / CMD)
Buka terminal pada direktori root project, lalu jalankan perintah berikut:
```bash
# Kompilasi file Java
javac src/Member.java src/TesFitTrack.java

# Jalankan program dari folder src
java -cp src TesFitTrack
```

### 2. Melalui IntelliJ IDEA
1. Buka folder project `tugas1-fittrack` di IntelliJ IDEA.
2. Pastikan folder `src` ditandai sebagai *Sources Root*.
3. Buka file `TesFitTrack.java`.
4. Klik tombol ikon **Play (Run)** di samping baris `public static void main` atau tekan `Shift + F10`.

---

## Penjelasan Nilai Default
Jika pada saat pembuatan objek melalui constructor ditemukan nilai parameter yang melanggar aturan validasi, program tidak akan berhenti paksa melainkan menetapkan nilai default yang aman:
* **Nama:** Jika kosong atau null, diubah menjadi `"Tidak diketahui"`.
* **Nomor Telepon:** Jika tidak sesuai format (tidak diawali angka 0 atau kurang dari 10 digit), diubah menjadi `"0000000000"`.
* **Tanggal Daftar:** Jika kosong atau null, diubah menjadi `"Belum ditentukan"`.
* **Jenis Paket:** Jika berada di luar pilihan `Basic`, `Premium`, atau `VIP`, otomatis diatur menjadi `"Basic"`.

---

## Contoh Output Program
Berikut adalah contoh tangkapan layar (screenshot) hasil eksekusi program yang menunjukkan skenario normal serta penolakan data tidak valid:

```text
--- UJI COBA SETTER DENGAN DATA TIDAK VALID ---
Nama tidak boleh kosong.
Nomor telepon harus diawali 0 dan minimal 10 digit.
Jenis paket harus Basic, Premium, atau VIP.
Nomor setelah diubah invalid (harus tetap bertahan): 081234567890

--- DAFTAR SELURUH MEMBER FITTRACK ---
1. Member{nama='Budi Santoso', noTelepon='081234567890', tanggalDaftar='15-01-2026', jenisPaket='VIP'}
2. Member{nama='Siti Aminah', noTelepon='085611223344', tanggalDaftar='20-02-2026', jenisPaket='Basic'}
3. Member{nama='Joko Widodo', noTelepon='087899887766', tanggalDaftar='10-03-2026', jenisPaket='Premium'}
4. Member{nama='Ahmad', noTelepon='0000000000', tanggalDaftar='25-03-2026', jenisPaket='Basic'}
```

---
*Dibuat untuk memenuhi Tugas 1 & Remedial UTS Praktikum PBO.*
