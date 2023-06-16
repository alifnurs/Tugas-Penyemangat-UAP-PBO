public class Main {
    public static void main(String[] args) {
        
        //Fungsi untuk memulai program dengan inputan user
        //Sewa.mulai();

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
        

        Pelanggan pelanggan1 = new Pelanggan("Alif Nur Sanubari", 19);
        Pelanggan pelanggan2 = new Pelanggan("Ruhut", 17);
        Pelanggan pelanggan3 = new Pelanggan("Annisa", 19);
        Pelanggan pelanggan4 = new Pelanggan("Brody", 19);


        ArsipSewa arsip = new ArsipSewa();
        arsip.sewa(pelanggan1, data.listMobil.get(0), 4);
        arsip.sewa(pelanggan2, data.listMobil.get(1), 2);
        arsip.sewa(pelanggan3, data.listMotor.get(1), 2);
        arsip.sewa(pelanggan4, data.listMobil.get(0), 3);

        arsip.info();
        
    }
}
