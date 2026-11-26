package ogrenciGorevTakipSistemi.src.model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Grup {
    
    
    String grupAdi;

    int gorevNo = 0;
    int gorevNoSayac = 0;

    ArrayList<Gorev> gorevler = new ArrayList<>();
    ArrayList<GrupUyesi> uyeler = new ArrayList<>();



    public void gorevEKle(String gorevAdi, LocalDate teslimTarihi, GorevDurumu gorevDurumu){
        gorevler.add(new Gorev(gorevNoAta(), gorevAdi, teslimTarihi, gorevDurumu));
    }

    public void gorevSil(int gorevNo){
        for(int i = 0; i < gorevSayisi(); i++) {
            if(gorevler.get(i).gorevNo == gorevNo) {
                gorevler.remove(i);
            }
        }
    }

    public void gorevAra(String gorevAdi){ // İki farklı şekilde yapılabilir. No veya isim üzerinden. No kolay. İsim de kolay aslında.
        for(int i = 0; i < gorevSayisi(); i++) {
            if(gorevler.get(i).gorevAdi.equalsIgnoreCase(gorevAdi)) { // equalIgnoreCase her iki tarafı da küçük harfe dönüştürür ve o şekilde kontrol yapar.
                System.out.println("Gorev numarasi: " + gorevler.get(i).gorevNo + "  |  " + "Gorev basligi: " + gorevler.get(i).gorevAdi + "  |  " + "Son teslim tarihi: " + gorevler.get(i).teslimTarihi + "  |  " + "Gorev durumu: " + gorevler.get(i).gorevDurumu);
                return;
            }
        }
        System.out.println("|Görev bulunamadi. |-------------------------|---------------------------------|"); // Bulunamazsa burası çalışıyor.
        return;
    }

    // Görev yoksa ihtimalini eklemek gerekiyor.
    public void gorevAra(int gorevNo) {
        for(int i = 0; i < gorevSayisi(); i++) {
            if(gorevler.get(i).gorevNo != gorevNo) {
                continue;
            }
            System.out.println("Gorev numarasi: " + gorevler.get(i).gorevNo + "  |  " + "Gorev basligi: " + gorevler.get(i).gorevAdi + "  |  " + "Son teslim tarihi: " + gorevler.get(i).teslimTarihi + "  |  " + "Gorev durumu: " + gorevler.get(i).gorevDurumu);
            return; // Bulunup yazdırılınca metottan tamamen çıkıyoruz.
        }
        System.out.println("|Görev bulunamadi. |-------------------------|---------------------------------|"); // Bulunamazsa burası çalışıyor.
        return;
    }

    public void gorevSirala(){
        for(int i = 0; i < gorevSayisi(); i++) {
            System.out.println("Gorev numarasi: " + gorevler.get(i).gorevNo + "  |  " + "Gorev basligi: " + gorevler.get(i).gorevAdi + "  |  " + "Son teslim tarihi: " + gorevler.get(i).teslimTarihi + "  |  " + "Gorev durumu: " + gorevler.get(i).gorevDurumu);
        }
        System.out.println("------------------------------------------------------------------------------------------------------------------");
    }

    public void gorevDurumuGuncelle(int gorevNo, GorevDurumu gorevDurumu){
        for(int i = 0; i < gorevSayisi(); i++) { // Görev bulunamadı hatası eklenecek.
            if(gorevler.get(i).gorevNo != gorevNo) {
                continue;
            }
            gorevler.get(i).gorevDurumu = gorevDurumu;
            System.out.println(gorevler.get(i).gorevAdi + " isimli görevin durumu " + gorevler.get(i).gorevDurumu + " olarak güncellendi.");
            return;
            // continue: Döngünün bu turunun kalanını atlar. Bir sonraki tura  geçer.
            // break: Döngüden tamamen çıkar. Aşağıdaki koddan devam eder.
            // return: Metottan tamamen çıkar. 
        }
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
        gorevEKle("Gorev1", LocalDate.of(2026, 11, 28), GorevDurumu.BASLAMADI);
        gorevEKle("Gorev2", LocalDate.of(2026, 11, 28), GorevDurumu.BASLAMADI);
        gorevEKle("Gorev3", LocalDate.of(2026, 11, 28), GorevDurumu.BASLAMADI);
        gorevEKle("Gorev4", LocalDate.of(2026, 11, 28), GorevDurumu.BASLAMADI);
        gorevEKle("Gorev5", LocalDate.of(2026, 11, 28), GorevDurumu.BASLAMADI); // 4
        gorevEKle("Gorev6", LocalDate.of(2026, 11, 28), GorevDurumu.BASLAMADI);
        gorevEKle("Gorev7", LocalDate.of(2026, 11, 28), GorevDurumu.BASLAMADI);
        gorevEKle("Gorev8", LocalDate.of(2026, 11, 28), GorevDurumu.BASLAMADI);

        // gorevSil(3);
        // gorevSil(6);

        // gorevEKle("Gorev9", LocalDate.of(2026, 11, 28), GorevDurumu.BASLAMADI);
        // gorevEKle("Gorev10", LocalDate.of(2026, 11, 28), GorevDurumu.BASLAMADI);
        
        // gorevSirala();
        // gorevDurumuGuncelle(5, GorevDurumu.BITTI);
        // gorevSirala();

        gorevAra(7);
        gorevAra(70);
        gorevAra(7);
        // gorevAra("Görev8");
        // gorevAra("GOREV8");
        // gorevAra("GosdfrEv8");
        // gorevAra("GOrev8");
        // gorevAra("GOrfsdev8");
        // gorevAra("GOrefsdfsfdsv8");

    }


// ------------- Yardımcı Metodlar --------------------- //

    public int gorevSayisi() {
        return gorevler.size();
    }
    
    public int gorevNoAta() {
        gorevNoSayacArtir(); // Sonraki için artırıyoruz aşağıda.
        return gorevNoSayac; // Burada da zaten üstte güncellediğimiz için güncel hâlini almış oluyoruz.
    }

    public int gorevNoSayacArtir() {
        return gorevNoSayac++; // Sonraki için artırıyoruz.
    }

}




