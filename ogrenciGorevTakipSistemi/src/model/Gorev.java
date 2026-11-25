package ogrenciGorevTakipSistemi.src.model;

import java.time.LocalDate;

public class Gorev {
    String gorevAdi;
    public int gorevNo; 
    LocalDate teslimTarihi;
    public GorevDurumu gorevDurumu;

    public Gorev(int gorevNo, String gorevAdi, LocalDate teslimTarihi, GorevDurumu gorevDurumu){
        this.gorevNo = gorevNo;
        this.gorevAdi = gorevAdi;
        this.teslimTarihi = teslimTarihi;
        this.gorevDurumu = GorevDurumu.BASLAMADI;
    }

    public void gorevGuncelle(GorevDurumu yeniGorevDurumu){
        this.gorevDurumu = yeniGorevDurumu;
    }
}



