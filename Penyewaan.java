public class Penyewaan implements Hitung{
    private Pelanggan pelanggan;
    private Kendaraan kendaraan;
    private int durasi;

    Penyewaan(Pelanggan pelangganm, Kendaraan kendaraan, int durasi){
        this.pelanggan = pelangganm;
        this.kendaraan = kendaraan;
        this.durasi = durasi;
        this.kendaraan.setStatus(true);
    }

    public Pelanggan getPelanggan(){
        return pelanggan;
    }

    public Kendaraan getKendaraan(){
        return kendaraan;
    }

    public int getDurasi(){
        return durasi;
    }

    @Override
    public int hitung(){
        if (this.kendaraan instanceof Mobil){
            return Mobil.harga * this.durasi;
        } else {
            return Motor.harga * this.durasi;
        }
    }

    @Override
    public String show(){
        return "o Nama Pelanggan\t: " + this.pelanggan.getNama() + "\n" + "o Lama Sewa\t\t: " + this.durasi + "\n" + "o Harga Sewa\t\t: " + hitung() ;
    }


    
}
