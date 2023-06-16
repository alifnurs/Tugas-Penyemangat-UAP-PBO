public class Motor extends Kendaraan{
    public final static int harga = 50000;

    public Motor (String noPol, boolean status, String merk,String type){
        super(noPol, status, type, merk);

    }

  

  

    public String show() {
        return "o Type Motor : " + getType() + "\n" + "o Merk motor : " + getMerk() + "\n" + "o Plat Nomor : " + getNoPol() + "\n";
    }
}
