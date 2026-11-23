package ogrenciGorevTakipSistemi.src.model;

import java.time.LocalDate;

public class Gorev {
    String gorevAdi;
    public int gorevNo; 
    LocalDate teslimTarihi;
    public GorevDurumu gorevDurumu;

    public Gorev(String gorevAdi, int gorevNo, LocalDate teslimTarihi, GorevDurumu gorevDurumu){
        this.gorevAdi = gorevAdi;
        this.gorevNo = gorevNo;
        this.teslimTarihi = teslimTarihi;
        this.gorevDurumu = GorevDurumu.BASLAMADI;
    }

    public void gorevGuncelle(GorevDurumu yeniGorevDurumu){
        this.gorevDurumu = yeniGorevDurumu;
    }
}



