
package staticsk1;


public class StaticSK1 {

    //Menambahkan Sifat Static pada Variable
    static String nama;
    static int tahun_s = 2021, tahun_l = 2005, umur;
    static double NilaiUNSD;
    
    public static void main(String[] args) {
        
        //Memanggil Data Static pada Method Main
        nama = "Cheva Satrio";
        System.out.println("Nama Saya: "+nama);
        System.out.println("Umur Saya: "+Umur_Saya()+" Tahun");
        NilaiUNSD();
    }
    
    //Menambahkan Sifat Static pada Method Return
    static int Umur_Saya(){
        umur = tahun_s - tahun_l;
        return umur;
    }
    
    //Menambahkan Sifat Static pada Method Void
    static void NilaiUNSD(){
        NilaiUNSD = 284.5;
        System.out.println("Nilai UN SD Saya: "+NilaiUNSD);
    }
    }
