package datastructures;

class Dugum {
    int gorevNo;
    String gorevAdi;
    Dugum sonraki;

    public Dugum(int gorevNo, String gorevAdi) {
        this.gorevNo = gorevNo;
        this.gorevAdi = gorevAdi;
        this.sonraki = null;
    }
}

public class GorevHashTablosu {
    Dugum[] tablo = new Dugum[10];

    int hashHesapla(int anahtar) {
        return anahtar % 10;
    }

    public void ekle(int no, String ad) {
        int indeks = hashHesapla(no);
        Dugum yeni = new Dugum(no, ad);
        
        if (tablo[indeks] == null) {
            tablo[indeks] = yeni;
        } else {
            yeni.sonraki = tablo[indeks];
            tablo[indeks] = yeni;
        }
    }

    public String ara(int no) {
        int indeks = hashHesapla(no);
        Dugum gecici = tablo[indeks];
        
        while (gecici != null) {
            if (gecici.gorevNo == no) {
                return gecici.gorevAdi;
            }
            gecici = gecici.sonraki;
        }
        return "Gorev bulunamadi";
    }

    public static void main(String[] args) {
        GorevHashTablosu ht = new GorevHashTablosu();
        
        ht.ekle(1, "Arayuz tasarimi");
        ht.ekle(2, "Veri yapisi iskeleti");
        
        System.out.println(ht.ara(1));
        System.out.println(ht.ara(2));
    }
}
