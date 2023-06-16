public class Pelanggan {
    private String nama;
    private int age;

    public Pelanggan(String name, int age){
        this.nama = name;
        this.age = age;
    }

    public Pelanggan(){} 

    public String getNama(){
        return nama;
    }

    public int getAge(){
        return age;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setAge(int age){
        this.age = age; 
    }
}
