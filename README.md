# Veri-Yapilari
VY-006 | Öğrenci Proje ve Görev Takip Sistemi

----------------------------------------------------
-- Proje Genel Tanımı -- 
----------------------------------------------------

Bir proje grubununun görevlerini sorumlu, öncelik ve teslim tarihiyle takip eden bir uygulamadır. Görevler yapılacak, devam ediyor ve tamamlandı durumları arasında yönetilir.

----------------------------------------------------

- Proje Ekip Üyeleri ve İş Bölümü -
 * Ceren Çetin : Görev ve Üye Sorgulama & Hash Table / Hash Map Yapısı

 * Ebrar Gökçe Bahşi : Görev Öncelik/Tarih Sıralaması & Priority Queue Yapısı
  
 * Gül Çevik : Geri Alma (Undo) Mekanizması & Stack Veri Yapısı
  
 * İbrahim Halil Yıldırım : Görev Listesi CRUD İşlemleri & Doubly Linked List Yapısı

----------------------------------------------------

- Kullanılacak Teknolojiler -

1) Dil: Java
2) Arayüz: JavaFX
3) Sürüm Kontrolü: GitHub

----------------------------------------------------

- Veri Yapıları ve Tercih Nedenleri -

Stack (Undo/Geri Alma): Son durum değişikliklerini geriye doğru işletmek amacıyla LIFO yapısı için tercih edildi.

Priority Queue (Min-Heap): Teslim tarihi yaklaşan veya yüksek öncelikli görevlerin anında çekilmesi için kullanıldı.

Doubly Linked List (Görev Listesi): Görevlerin dinamik yönetimi ve hızlı silme/ekleme operasyonları için seçildi.

Hash Table (Arama/Sorgulama): Görev numarası veya sorumlusuna göre O(1) maliyetle anlık erişim sağlamak için kullanıldı.

----------------------------------------------------

- Proje Temel Klasör Yapısı -

ogrenci-gorev-takip-sistemi/
├── docs/
│   └── class-diagram.png (veya taslak şema)
├── src/
│   ├── model/           # Task, Member, Project sınıfları
│   ├── datastructures/  # Her üyenin yazdığı veri yapıları
│   └── Main.java        # Test / çalıştırma dosyası
├── README.md
└── .gitignore
