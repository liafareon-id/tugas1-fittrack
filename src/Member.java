/**
 * Merepresentasikan satu member yang terdaftar di gym FitTrack.
 * Class ini menyimpan identitas member dan memvalidasi setiap data
 * sebelum data tersebut disimpan ke dalam atribut.
 */
public class Member {

    private static final int MIN_PANJANG_TELP = 10;
    private static final String NAMA_DEFAULT = "Tidak diketahui";
    private static final String TELEPON_DEFAULT = "0000000000";
    private static final String TANGGAL_DEFAULT = "Belum ditentukan";
    private static final String PAKET_DEFAULT = "Basic";

    private String nama;
    private String noTelepon;
    private String tanggalDaftar;
    private String jenisPaket;

    /**
     * Membuat member dengan seluruh data yang ditentukan.
     * Setiap atribut diisi melalui setter agar validasi tetap terpusat.
     *
     * @param nama nama lengkap member
     * @param noTelepon nomor telepon member
     * @param tanggalDaftar tanggal pendaftaran member
     * @param jenisPaket jenis paket Basic, Premium, atau VIP
     */
    public Member(String nama, String noTelepon,
                  String tanggalDaftar, String jenisPaket) {

        this.nama = NAMA_DEFAULT;
        this.noTelepon = TELEPON_DEFAULT;
        this.tanggalDaftar = TANGGAL_DEFAULT;
        this.jenisPaket = PAKET_DEFAULT;

        setNama(nama);
        setNoTelepon(noTelepon);
        setTanggalDaftar(tanggalDaftar);
        setJenisPaket(jenisPaket);
    }

    /**
     * Membuat member dengan paket keanggotaan default Basic.
     *
     * @param nama nama lengkap member
     * @param noTelepon nomor telepon member
     * @param tanggalDaftar tanggal pendaftaran member
     */
    public Member(String nama, String noTelepon,
                  String tanggalDaftar) {

        this(nama, noTelepon, tanggalDaftar, PAKET_DEFAULT);
    }

    /**
     * Mengambil nama member.
     *
     * @return nama member
     */
    public String getNama() {
        return nama;
    }

    /**
     * Mengambil nomor telepon member.
     *
     * @return nomor telepon member
     */
    public String getNoTelepon() {
        return noTelepon;
    }

    /**
     * Mengambil tanggal pendaftaran member.
     *
     * @return tanggal pendaftaran member
     */
    public String getTanggalDaftar() {
        return tanggalDaftar;
    }

    /**
     * Mengambil jenis paket keanggotaan member.
     *
     * @return jenis paket member
     */
    public String getJenisPaket() {
        return jenisPaket;
    }

    /**
     * Mengubah nama member jika nama tidak kosong.
     * Jika tidak valid, nama lama tetap dipertahankan.
     *
     * @param nama nama baru member
     */
    public void setNama(String nama) {

        if (nama != null && !nama.trim().isEmpty()) {
            this.nama = nama.trim();
        } else {
            System.out.println(
                "Nama tidak boleh kosong atau hanya berisi spasi."
            );
        }
    }

    /**
     * Mengubah nomor telepon jika diawali angka 0,
     * hanya berisi digit, dan memiliki minimal 10 karakter.
     *
     * @param noTelepon nomor telepon baru
     */
    public void setNoTelepon(String noTelepon) {

        if (noTelepon != null
                && noTelepon.startsWith("0")
                && noTelepon.length() >= MIN_PANJANG_TELP
                && noTelepon.matches("[0-9]+")) {

            this.noTelepon = noTelepon;

        } else {
            System.out.println(
                "Nomor telepon harus diawali angka 0, "
                + "hanya berisi digit, dan minimal 10 digit."
            );
        }
    }

    /**
     * Mengubah tanggal pendaftaran jika tidak kosong.
     *
     * @param tanggalDaftar tanggal pendaftaran baru
     */
    public void setTanggalDaftar(String tanggalDaftar) {

        if (tanggalDaftar != null
                && !tanggalDaftar.trim().isEmpty()) {

            this.tanggalDaftar = tanggalDaftar.trim();

        } else {
            System.out.println(
                "Tanggal daftar tidak boleh kosong."
            );
        }
    }

    /**
     * Mengubah jenis paket jika nilainya Basic, Premium, atau VIP.
     *
     * @param jenisPaket jenis paket baru
     */
    public void setJenisPaket(String jenisPaket) {

        if ("Basic".equals(jenisPaket)
                || "Premium".equals(jenisPaket)
                || "VIP".equals(jenisPaket)) {

            this.jenisPaket = jenisPaket;

        } else {
            System.out.println(
                "Jenis paket tidak valid. "
                + "Pilihan hanya Basic, Premium, atau VIP."
            );
        }
    }

    /**
     * Menghasilkan representasi data member dalam bentuk teks.
     *
     * @return seluruh data member dalam satu string
     */
    @Override
    public String toString() {

        return "Nama: " + nama
                + " | No. Telepon: " + noTelepon
                + " | Tanggal Daftar: " + tanggalDaftar
                + " | Jenis Paket: " + jenisPaket;
    }
}
