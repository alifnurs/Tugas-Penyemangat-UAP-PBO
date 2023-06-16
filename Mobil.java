public class Mobil extends Kendaraan  {
    public final static int harga = 100000; 

    public Mobil(String noPol, boolean status, String merk, String type){
        super(noPol, status, type, merk);
    }

    
   
    public String show() {
        return "o Type Mobil\t: " + getType()+ "\n" + "o Merk\t\t: " + getMerk() + "\n" + "o Plat Nomor\t: " + getNoPol() + "\n";
    }
    
}
