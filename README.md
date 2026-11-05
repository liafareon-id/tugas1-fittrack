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

FitTrack adalah program pendataan member gym berbasis Java yang dirancang untuk mendigitalisasi proses pencatatan keanggotaan gym yang sebelumnya manual. Program ini mengelola data pribadi member seperti nama, nomor telepon, tanggal pendaftaran, dan tipe keanggotaan dalam format yang terstruktur.

Sistem dilengkapi validasi terpusat di method setter untuk menjamin konsistensi format data, mencegah terjadinya crash saat input tidak sesuai, serta memastikan data lama yang valid tidak tertimpa oleh data yang keliru.

## Fitur Utama

- Pencatatan Member: Menyimpan identitas lengkap member (nama, nomor telepon, tanggal daftar, dan jenis paket).
- Validasi Nama: Memastikan nama tidak boleh kosong (`null`) atau hanya berisi spasi (`whitespace`).
- Validasi Nomor Telepon: Memastikan nomor wajib diawali angka 0, seluruh karakter berupa digit numerik, dan memiliki panjang minimal 10 digit.
- Validasi Paket Keanggotaan: Membatasi pilihan paket hanya pada `Basic`, `Premium`, atau `VIP`.
- Constructor Overloading: Memungkinkan registrasi cepat dengan menetapkan paket default `Basic` lewat constructor 3 parameter.
- Proteksi Data Lama: Setter otomatis menolak perubahan data tidak valid dan tetap mempertahankan nilai lama atribut.
- Tampilan Berlabel Rapi: Menampilkan seluruh daftar member dari array menggunakan format `toString()` yang informatif.

## Konsep OOP yang Diterapkan

| Konsep | Lokasi Penerapan | Alasan |
|---|---|---|
| Class dan Object | `Member.java` dan `TesFitTrack.java` | Class `Member` berfungsi sebagai blueprint cetak biru data keanggotaan, sedangkan objek adalah perwujudan data setiap individu member. |
| Encapsulation | Variabel atribut `private` dan method `getter`/`setter` di `Member.java` | Mengamankan atribut dari manipulasi langsung di luar class dan memusatkan verifikasi data di setter. |
| Constructor | Constructor di `Member.java` | Melakukan inisialisasi awal nilai default serta memanggil setter saat objek pertama kali diinstansiasi. |
| Constructor Overloading | Constructor 4 parameter dan 3 parameter di `Member.java` | Memberikan alternatif pembuatan objek tanpa perlu menentukan jenis paket secara eksplisit. |
| Keyword `this` | Constructor 3 parameter di `Member.java` (`this(...)`) | Menerapkan constructor chaining untuk memanggil constructor utama, mencegah duplikasi kode (prinsip DRY). |
| Method Overriding | Method `toString()` di `Member.java` | Mengganti representasi default objek (alamat memori) agar menghasilkan teks informasi berlabel yang rapi. |
| Array of Objects & Loop | Inisialisasi array `Member[]` dan perulangan `for` di `TesFitTrack.java` | Menampung kumpulan objek member dalam satu struktur data terindeks dan menampilkannya secara berurutan. |

## Struktur Project

```text
tugas1-fittrack/
├── out/
├── src/
│   ├── Member.java
│   └── TesFitTrack.java
├── .gitignore
└── README.md
```

## Prasyarat

- **Java Development Kit (JDK):** Versi 17 atau yang lebih baru.
- **Integrated Development Environment (IDE):** IntelliJ IDEA (disarankan) atau VS Code / Terminal.

## Cara Menjalankan Program

### Melalui IntelliJ IDEA
1. Buka folder `tugas1-fittrack` menggunakan IntelliJ IDEA.
2. Pastikan SDK proyek mengarah ke JDK 17+ (menu **File** > **Project Structure** > **Project**).
3. Buka file `src/TesFitTrack.java`.
4. Klik tombol panah hijau (**Run**) di samping deklarasi `public class TesFitTrack` atau method `main`.

### Melalui Command Line / Terminal
1. Buka terminal atau Command Prompt / PowerShell di folder utama proyek (`tugas1-fittrack`).
2. Kompilasi source code Java ke direktori `out`:
   ```bash
   javac -d out src/Member.java src/TesFitTrack.java
   ```
3. Jalankan class utama:
   ```bash
   java -cp out TesFitTrack
   ```

## Contoh Output

Berikut adalah hasil eksekusi program di terminal yang menampilkan skenario validasi constructor, pengujian setter dengan nilai tidak valid, dan pencetakan daftar member:

```text
Nomor telepon harus diawali angka 0, hanya berisi digit, dan minimal 10 digit.
Jenis paket tidak valid. Pilihan hanya Basic, Premium, atau VIP.

=== UJI SETTER DENGAN DATA TIDAK VALID ===
Nomor telepon sebelum diubah: 081234567890
Nomor telepon harus diawali angka 0, hanya berisi digit, dan minimal 10 digit.
Nomor telepon setelah input ditolak: 081234567890

=== DAFTAR MEMBER FITTRACK ===
1. Nama: Budi Santoso | No. Telepon: 081234567890 | Tanggal Daftar: 15-01-2026 | Jenis Paket: VIP
2. Nama: Siti Aminah | No. Telepon: 085611223344 | Tanggal Daftar: 20-02-2026 | Jenis Paket: Basic
3. Nama: Joko Widodo | No. Telepon: 087899887766 | Tanggal Daftar: 10-03-2026 | Jenis Paket: Premium
4. Nama: Ahmad | No. Telepon: 0000000000 | Tanggal Daftar: 25-03-2026 | Jenis Paket: Basic
```

## Nilai Default

Program menetapkan nilai default yang aman jika pembuatan objek menerima nilai yang tidak valid:
- **`NAMA_DEFAULT` (`"Tidak diketahui"`):** Menghindari nilai `null` dan menandai bahwa identitas member belum diisi dengan benar.
- **`TELEPON_DEFAULT` (`"0000000000"`):** Memenuhi seluruh aturan validasi (panjang 10 digit, diawali angka 0, numerik) sekaligus menjadi penanda visual bahwa nomor member tidak valid saat diinput.
- **`TANGGAL_DEFAULT` (`"Belum ditentukan"`):** Mencegah string kosong serta memberi penanda bahwa tanggal registrasi belum terverifikasi.
- **`PAKET_DEFAULT` (`"Basic"`):** Paket standar paling dasar yang aman dialokasikan kepada member baru jika data paket tidak valid atau tidak disertakan.

## Batasan dan Pengembangan Lanjutan

### Batasan
- Penyimpanan data bersifat sementara di memori RAM (*in-memory*) dan akan hilang saat program dihentikan.
- Format tanggal masih berupa String bebas dan belum memverifikasi kebenaran penanggalan kalender masehi secara ketat.

### Pengembangan Lanjutan
- Mengintegrasikan sistem dengan database (seperti SQLite atau MySQL) agar data member tersimpan secara permanen (*persistent*).
- Menggunakan `java.time.LocalDate` dan `DateTimeFormatter` untuk validasi penanggalan yang lebih presisi.
- Mengembangkan antarmuka berbasis GUI (JavaFX atau Swing) untuk mempermudah operasional resepsionis gym.