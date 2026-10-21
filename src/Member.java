/**
 * Merepresentasikan data satu member gym FitTrack.
 * Menyimpan identitas dan jenis paket keanggotaan member.
 */
public class Member {

    private String nama;
    private String noTelepon;
    private String tanggalDaftar;
    private String jenisPaket;

}

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

    public void tampilkanJenisPaket() {
        System.out.println("Jenis Paket: " + jenisPaket);
    }
}
