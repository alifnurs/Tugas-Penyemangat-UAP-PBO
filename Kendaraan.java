public abstract class Kendaraan {
    private String noPol;
    private boolean status;
    private String type;
    private String merk;

    public Kendaraan(String noPol, boolean status, String type, String merk){
        this.noPol = noPol;
        this.status = status;
        this.type = type;
        this.merk = merk;
    }

    public void setNoPol(String noPol) {
        this.noPol = noPol;
    }

    public void setStatus(boolean status){
        this.status = status;
    }

    public void setType(String type){
        this.type = type;
    }

    public void setMerk(String merk){
        this.merk = merk;
    }

    public String getNoPol(){
        return noPol;
    }

    public boolean getStatus(){
        return status;
    }

    public String getType(){
        return type;
    }

    public String getMerk(){
        return merk;
    }

    public String show() {
        return "o Type Kendaraan: " + getType()+ "\n" + "o Merk\t\t: " + getMerk() + "\n" + "o Plat Nomor\t: " + getNoPol() + "\n";
    }

    
    

}
