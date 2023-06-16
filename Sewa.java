import java.util.Scanner;

public class Sewa {

    public static void mulai() {
        Scanner input = new Scanner(System.in);

        DataKendaraan data = new DataKendaraan();
        data.addMobil("AD 2788 N", false, "suzuki", "SUV");
        data.addMobil("N 2819 KV", false, "Nissan", "Sport");
        Kendaraan kendaraan1 = new Mobil("B 2738 IO", false, "Isuzu", "Pick up");
        data.addMobil(kendaraan1);

        data.addMotor("N 2632 U", false, "Yamaha", "Sport");
        data.addMotor("N 54321 I", false, "Honda", "Matic");
        Kendaraan kendaraan2 = new Motor("A 2638 kv", false, "Kawasaki", "Naked");
        data.addMotor(kendaraan2);
        DataKendaraan.listKendaraan();

        ArsipSewa arsip = new ArsipSewa();
        boolean mainLoop = true;
        boolean loop = true;
        while (loop) {
            System.out.println("Isi data diri untuk menyewa");

            System.out.print("Nama : ");
            String nama = input.nextLine();
            System.out.print("Umur : ");
            int umur = input.nextInt();
            Pelanggan pelanggan = new Pelanggan(nama, umur);
            if (pelanggan.getAge() < 18) {
                System.out.println("Maaf Umur anda belum cukup untuk menyewa kendaraan!!");
                System.exit(0);
            }

            boolean loop2 = true;
            while (loop2) {
                System.out.print("Pilih Kendaraan yang akan disewa (1/2/3/4/5/6) : ");
                int pilih = input.nextInt();
                System.out.print("Masukkan lama sewa (hari) : ");
                int durSewa = input.nextInt();
                if (pilih == 1) {
                    arsip.sewa(pelanggan, data.listMobil.get(0), durSewa);
                    loop2 = false;
                } else if (pilih == 2) {
                    arsip.sewa(pelanggan, data.listMobil.get(1), durSewa);
                    loop2 = false;
                } else if (pilih == 3) {
                    arsip.sewa(pelanggan, data.listMobil.get(2), durSewa);
                    loop2 = false;
                } else if (pilih == 4) {
                    arsip.sewa(pelanggan, data.listMotor.get(0), durSewa);
                    loop2 = false;
                } else if (pilih == 5) {
                    arsip.sewa(pelanggan, data.listMotor.get(1), durSewa);
                    loop2 = false;
                } else if (pilih == 6) {
                    arsip.sewa(pelanggan, data.listMotor.get(2), durSewa);
                    loop2 = false;
                } else {
                    System.out.println("Masukkan inputan dengan benar!!");
                }
            }
            arsip.info();
            loop = false;

        }
    }

}
