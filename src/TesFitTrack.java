/**
 * Menjalankan dan menguji sistem keanggotaan gym FitTrack.
 * Class ini membuat beberapa objek Member, menguji validasi,
 * dan menampilkan seluruh data member menggunakan array dan for.
 */
public class TesFitTrack {

    /**
     * Menjalankan seluruh skenario pengujian program FitTrack.
     *
     * @param args argumen dari command line
     */
    public static void main(String[] args) {

        // Membuat array yang menampung empat objek Member.
        Member[] daftarMember = new Member[4];

        // Member pertama menggunakan paket VIP.
        daftarMember[0] = new Member(
            "Budi Santoso",
            "081234567890",
            "15-01-2026",
            "VIP"
        );

        // Member kedua menggunakan constructor tanpa paket.
        // Paket otomatis menjadi Basic.
        daftarMember[1] = new Member(
            "Siti Aminah",
            "085611223344",
            "20-02-2026"
        );

        // Member ketiga menggunakan paket Premium.
        daftarMember[2] = new Member(
            "Joko Widodo",
            "087899887766",
            "10-03-2026",
            "Premium"
        );

        // Member keempat sengaja diberi data tidak valid.
        daftarMember[3] = new Member(
            "Ahmad",
            "12345",
            "25-03-2026",
            "SuperVIP"
        );

        // Menguji setter dengan data tidak valid.
        System.out.println(
            "\n=== UJI SETTER DENGAN DATA TIDAK VALID ==="
        );

        System.out.println(
            "Nomor telepon sebelum diubah: "
            + daftarMember[0].getNoTelepon()
        );

        daftarMember[0].setNoTelepon("12345");

        System.out.println(
            "Nomor telepon setelah input ditolak: "
            + daftarMember[0].getNoTelepon()
        );

        // Menampilkan seluruh data member menggunakan perulangan for.
        System.out.println(
            "\n=== DAFTAR MEMBER FITTRACK ==="
        );

        for (int i = 0; i < daftarMember.length; i++) {

            System.out.println(
                (i + 1) + ". " + daftarMember[i]
            );
        }
    }
}
