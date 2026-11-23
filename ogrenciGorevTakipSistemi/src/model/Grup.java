package ogrenciGorevTakipSistemi.src.model;

import java.util.ArrayList;

public class Grup {
    
    
    String grupAdi;
    int grupNo;

    ArrayList<Gorev> gorevler = new ArrayList<>();
    ArrayList<GrupUyesi> uyeler = new ArrayList<>();
    GorevDurumu gorevDurumu = new GorevDurumu();
    GorevGuncelle gorevGuncelle = new GorevGuncelle();
    GrupUyesi grupUyesi = new GrupUyesi();
    Gorev gorev = new Gorev();



    public void gorevEKle(Gorev gorev){
        this.gorev = gorev;
    }

    public void gorevSil(int gorevNo){
        this.gorev.gorevNo = gorevNo;
    }

    public void gorevAra(int gorevNo){
        this.gorev.gorevNo = gorevNo;
    }

    public void gorevSirala(Gorev gorev){
        this.gorev = gorev;
    }

    public void gorevDurumuGeriAl(int gorevNo, GorevDurumu gorevDurumu){
        this.gorev.gorevNo = gorevNo;
        this.gorevDurumu = gorevDurumu;
    }

    public void gorevGuncelle(int gorevNo){
        this.gorev.gorevNo = gorevNo;
    }

    public void uyeEkle(int grupNo, String uyeAdi){
        this.grupNo = grupNo;

    }
    
    public void uyeSil(int grupNo, int uyeNo){
        this.grupNo = grupNo;
        this.grupUyesi.uyeNo = uyeNo;
    }
}


