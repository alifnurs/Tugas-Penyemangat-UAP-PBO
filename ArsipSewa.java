import java.util.ArrayList;

public class ArsipSewa {
    ArrayList<Penyewaan> arsip = new ArrayList<Penyewaan>();

    public void sewa(Pelanggan pelanggan, Kendaraan kendaraan, int durasi) {
        if (pelanggan.getAge() < 18) {
            System.out.println("Maaf Umur anda belum cukup untuk menyewa kendaraan!!");
        } else if (kendaraan.getStatus()) {
            System.out.println("Maaf kendaraan Sudah disewa");
        } else {
            System.out.println("Kendaraan berhasil disewa");
            arsip.add(new Penyewaan(pelanggan, kendaraan, durasi));
        }

    }

    public void info() {
        System.out.println("\nINFORMASI PELANGGAN");
        for (Penyewaan penyewaan : arsip) {
            System.out.println(penyewaan.show());
        }
    }
}