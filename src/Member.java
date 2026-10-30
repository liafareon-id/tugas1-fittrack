/**
 * Merepresentasikan data satu member gym FitTrack.
 * Menyimpan identitas dan jenis paket keanggotaan member.
 */
public class Member {

    private String nama;
    private String noTelepon;
    private String tanggalDaftar;
    private String jenisPaket;
    private static final int MIN_PANJANG_TELP = 10;

    /**
     * Constructor untuk membuat objek Member dengan paket lengkap.
     *
     * @param nama nama lengkap member
     * @param noTelepon nomor telepon member
     * @param tanggalDaftar tanggal pendaftaran member
     * @param jenisPaket jenis paket keanggotaan (Basic, Premium, VIP)
     */

    public Member(String nama, String noTelepon,
                  String tanggalDaftar, String jenisPaket) {
        setNama(nama);
        setNoTelepon(noTelepon);
        setTanggalDaftar(tanggalDaftar);
        setJenisPaket(jenisPaket);
    }

    /**
     * Constructor untuk membuat objek Member dengan paket default Basic.
     *
     * @param nama nama lengkap member
     * @param noTelepon nomor telepon member
     * @param tanggalDaftar tanggal pendaftaran member
     */
    public Member(String nama, String noTelepon,
                  String tanggalDaftar) {
        this(nama, noTelepon, tanggalDaftar, "Basic");
    }

    /**
     * Mengambil nama member.
     * @return nama member
     */
    public String getNama() {
        return nama;
    }

    /**
     * Mengambil nomor telepon member.
     * @return nomor telepon member
     */
    public String getNoTelepon() {
        return noTelepon;
    }

    /**
     * Mengambil tanggal daftar member.
     * @return tanggal daftar member
     */
    public String getTanggalDaftar() {
        return tanggalDaftar;
    }

    /**
     * Mengambil jenis paket member.
     * @return jenis paket member
     */
    public String getJenisPaket() {
        return jenisPaket;
    }

    /**
     * Mengubah nama member. Jika kosong, diatur ke "Tidak diketahui".
     * @param nama nama baru member
     */
    public void setNama(String nama) {
        if (nama != null && !nama.trim().isEmpty()) {
            this.nama = nama;
        } else {
            System.out.println("Nama tidak boleh kosong.");
            if (this.nama == null) {
                this.nama = "Tidak diketahui";
            }
        }
    }

    /**
     * Mengubah nomor telepon member setelah melalui validasi format.
     * @param noTelepon nomor telepon baru, wajib diawali angka 0 dan minimal 10 digit.
     */
    public void setNoTelepon(String noTelepon) {
        if (noTelepon != null && noTelepon.startsWith("0") && noTelepon.length() >= MIN_PANJANG_TELP) {
            this.noTelepon = noTelepon;
        } else {
            System.out.println(
                "Nomor telepon harus diawali 0 dan minimal 10 digit."
            );
            if (this.noTelepon == null) {
                this.noTelepon = "0000000000";
            }
        }
    }

    /**
     * Mengubah tanggal daftar member.
     * @param tanggalDaftar tanggal daftar baru
     */
    public void setTanggalDaftar(String tanggalDaftar) {
        if (tanggalDaftar != null && !tanggalDaftar.trim().isEmpty()) {
            this.tanggalDaftar = tanggalDaftar;
        } else {
            System.out.println("Tanggal daftar tidak boleh kosong.");
            if (this.tanggalDaftar == null) {
                this.tanggalDaftar = "Belum ditentukan";
            }
        }
    }

    /**
     * Mengubah jenis paket member.
     * @param jenisPaket jenis paket baru (Basic, Premium, atau VIP)
     */
    public void setJenisPaket(String jenisPaket) {
        if ("Basic".equals(jenisPaket)
                || "Premium".equals(jenisPaket)
                || "VIP".equals(jenisPaket)) {
            this.jenisPaket = jenisPaket;
        } else {
            System.out.println(
                "Jenis paket harus Basic, Premium, atau VIP."
            );
            if (this.jenisPaket == null) {
                this.jenisPaket = "Basic";
            }
        }
    }

    /**
     * Mengubah objek menjadi teks.
     * @return representasi string dari objek Member
     */
    @Override
    public String toString() {
        return "Member{" +
                "nama='" + nama + '\'' +
                ", noTelepon='" + noTelepon + '\'' +
                ", tanggalDaftar='" + tanggalDaftar + '\'' +
                ", jenisPaket='" + jenisPaket + '\'' +
                '}';
    }
}
