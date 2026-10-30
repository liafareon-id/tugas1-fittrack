/**
 * Class utama untuk menjalankan dan menguji sistem keanggotaan FitTrack.
 */
public class TesFitTrack {
    /**
     * Method utama untuk menjalankan skenario uji sistem keanggotaan.
     * @param args argumen command line
     */
    public static void main(String[] args) {
        // 1. Membuat array Member berisi minimal 4 objek
        Member[] daftarMember = new Member[4];

        // Objek 1: Data normal (VIP)
        daftarMember[0] = new Member("Budi Santoso", "081234567890", "15-01-2026", "VIP");

        // Objek 2: Menggunakan constructor tanpa paket (default: Basic)
        daftarMember[1] = new Member("Siti Aminah", "085611223344", "20-02-2026");

        // Objek 3: Data normal (Premium)
        daftarMember[2] = new Member("Joko Widodo", "087899887766", "10-03-2026", "Premium");

        // Objek 4: Sengaja memasukkan data yang melanggar validasi (nomor HP salah & paket salah)
        daftarMember[3] = new Member("Ahmad", "12345", "25-03-2026", "SuperVIP");

        System.out.println("\n--- UJI COBA SETTER DENGAN DATA TIDAK VALID ---");
        // Menguji setter dengan nilai salah pada objek yang sudah ada (nilai lama harus bertahan)
        daftarMember[0].setNoTelepon("12345"); 
        System.out.println("Nomor setelah diubah invalid: " + daftarMember[0].getNoTelepon());

        System.out.println("\n--- DAFTAR SELURUH MEMBER FITTRACK ---");
        // 2. Mencetak seluruh data member menggunakan perulangan for
        for (int i = 0; i < daftarMember.length; i++) {
            System.out.println((i + 1) + ". " + daftarMember[i].toString());
        }
    }
}
