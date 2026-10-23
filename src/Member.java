/**
 * Merepresentasikan data satu member gym FitTrack.
 * Menyimpan identitas dan jenis paket keanggotaan member.
 */
public class Member {

    private String nama;
    private String noTelepon;
    private String tanggalDaftar;
    private String jenisPaket;

    // Constructor dengan empat parameter
    public Member(String nama, String noTelepon,
                  String tanggalDaftar, String jenisPaket) {
        setNama(nama);
        setNoTelepon(noTelepon);
        setTanggalDaftar(tanggalDaftar);
        setJenisPaket(jenisPaket);
    }

    // Constructor dengan tiga parameter
    // Jenis paket secara default adalah Basic
    public Member(String nama, String noTelepon,
                  String tanggalDaftar) {
        this(nama, noTelepon, tanggalDaftar, "Basic");
    }

    // Getter untuk mengambil nilai atribut
    public String getNama() {
        return nama;
    }

    public String getNoTelepon() {
        return noTelepon;
    }

    public String getTanggalDaftar() {
        return tanggalDaftar;
    }

    public String getJenisPaket() {
        return jenisPaket;
    }

    // Setter nama dengan validasi
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
