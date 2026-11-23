package ogrenciGorevTakipSistemi.src.model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Grup {
    
    
    String grupAdi;
    int grupNo;

    ArrayList<Gorev> gorevler = new ArrayList<>();
    ArrayList<GrupUyesi> uyeler = new ArrayList<>();
    GorevDurumu gorevDurumu;    

    Gorev gorevornek1 = new Gorev("BirinciGrup", 20, LocalDate.of(2026, 12, 15), gorevDurumu.BASLAMADI);
    Gorev gorevornek2 = new Gorev("İkinciGrup", 21, LocalDate.of(2026, 12, 15), gorevDurumu.BASLAMADI);
    Gorev gorevornek3 = new Gorev("ÜçüncüGrup", 22, LocalDate.of(2026, 12, 15), gorevDurumu.BASLAMADI);
    Gorev gorevornek4 = new Gorev("DördüncüGrup", 24, LocalDate.of(2026, 12, 15), gorevDurumu.BASLAMADI);


    public void gorevEKle(int gorevNo, String gorevAdi, LocalDate teslimTarihi){
        gorevler.add(new Gorev(gorevAdi, gorevNo, teslimTarihi));
    }

    public void gorevSil(){
    }

    public void gorevAra(){
    }

    public void gorevSirala(){
    }

    public void gorevDurumuGeriAl(int gorevNo, GorevDurumu gorevDurumu){
    }

    public void gorevGuncelle(){
    }

    public void uyeEkle(int uyeNo, String uyeAdi){
        uyeler.add(new GrupUyesi(uyeNo, uyeAdi));

    }

    public void uyeSil(int uyeNo){
        for (int i = 0; i < uyeler.size(); i++) {
        if (uyeler.get(i).uyeNo == uyeNo) {
            uyeler.remove(i);
            break;
            }
        }
    }
    // public void gorevEKle(int gorevNo, String gorevAdi, LocalDate teslimTarihi){

    public void main(String[] args) {
        System.out.println(gorevornek1);
        System.out.println(gorevornek2);
        System.out.println(gorevornek3);
        System.out.println(gorevornek4);
    }
    
}


