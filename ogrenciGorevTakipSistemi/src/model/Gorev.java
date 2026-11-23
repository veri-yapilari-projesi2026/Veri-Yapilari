package ogrenciGorevTakipSistemi.src.model;

import java.time.LocalDate;

public class Gorev {
    String gorevAdi;
    public int gorevNo; 
    LocalDate teslimTarihi;

    public Gorev(String gorevAdi, int gorevNo, LocalDate teslimTarihi){
        this.gorevAdi = gorevAdi;
        this.gorevNo = gorevNo;
        this.teslimTarihi = teslimTarihi;
    }
}

class GorevDurumu{
    String gorevDurumu;
    GorevDurumu(String gorevDurumu){
        this.gorevDurumu = gorevDurumu;
    }
}

class GorevGuncelle{

}