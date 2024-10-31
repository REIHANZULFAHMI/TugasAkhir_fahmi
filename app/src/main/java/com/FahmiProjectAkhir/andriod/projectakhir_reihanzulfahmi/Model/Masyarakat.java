package com.FahmiProjectAkhir.andriod.projectakhir_reihanzulfahmi.Model;
import java.io.Serializable;

public class Masyarakat implements Serializable {
    private int id;
    private String nik,nama;

    public int getId(){// untuk mendapakan id
        return id;
    }
    public void setId(int id){// untuk membuat id
        this.id=id;
    }
    public String getNik(){//untuk mendapatkan Nik
        return nik;
    }
    public void setNik(String nik){//untuk membuat Nik
        this.nik=nik;
    }

    public String getNama() { //untuk mendapatkan nama
        return nama;
    }
    public void setNama(String nama){// untuk membuat nama
        this.nama=nama;
    }
}
