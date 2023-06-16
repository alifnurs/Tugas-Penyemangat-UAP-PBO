import java.util.ArrayList;

public class DataKendaraan {
    static ArrayList <Mobil> listMobil =new ArrayList<Mobil>();
    static ArrayList <Motor> listMotor =new ArrayList<Motor>();

    public void addMobil(String noPol, boolean status, String merkMobil, String typeMobil){
        listMobil.add(new Mobil(noPol, status = false, merkMobil, typeMobil));
    }

    public void addMobil(Kendaraan mobil){
        listMobil.add((Mobil) mobil);
    }

    public void addMotor(String noPol, boolean status, String merkMotor, String typeMotor){
        listMotor.add(new Motor(noPol, status = false, merkMotor, typeMotor));
    }

    public void addMotor(Kendaraan motor){
        listMotor.add((Motor)motor);
    }

    public static void listKendaraan(){
        System.out.println("\n========================================");
        System.out.println("||SELAMAT DATANG DI Alif's Rent-A-Ride||");
        System.out.println("========================================\n");
        System.out.println("==================");
        System.out.println("||LIST KENDARAAN||");
        System.out.println("==================\n");
        System.out.println("||Harga Sewa Mobil : " + Mobil.harga +"/Hari||"+ "\n||Harga Sewa Motor : " + Motor.harga+"/Hari ||\n");
        System.out.println("======||MOBIL||======");
        
        for (Mobil mobil : listMobil){
            System.out.println(mobil.show());
        }
        
        System.out.println("=====||Motor||=====");
        for (Motor motor : listMotor) {
            System.out.println(motor.show());
        }
        
    }

    
}
