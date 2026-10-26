
/////////////////////////////////////////////
/// 
// Performans olarak ArrayList'ler daha iyidir.(Sanırım.)
// Aramalarda ArrayList'ler daha iyi.
// Silme ve ekleme işlemlerinde DoublyLinkedList sayesinde LinkedList daha iyidir.(Sanırım.) 

// LinkedList uzun bir düğüm zincirinden oluşur.
// Her düğüm iki bölümden oluşur. Saklanılan veri ve sıradaki düğüme giden bir adres.
// LinkedList'te verilerin indeksleri yoktur. Her biri bellek adresleriyle tutulur. Bu sebeple bellek içerisinde...
// ...rastgele bir yerde olabilirler.
// Bu sebeplerden dolayı silme ve ekleme işlemleri sadece birkaç küçük adımdan oluşur.
// Ancak arama için listenin başından başlayarak tüm listeyi aramak gerekir. Çünkü elemanların indeksleri yoktur.
// Bu sebeple LinkedList'ler arama konusunda kötüdürler.
// Bir verinin adresi "null" ise bu o anki listenin son elemanı olduğu anlamına gelir


// Doubly LinkedList'ler iki değil üç bölümden oluşur. Normal LinkedList'lere kıyasla bir 
// de ek olarak önceki elemanın belleğini tutarlar. Haliyle bu daha fazla bellek kullanımı demektir.
// DoublyLinkedList'te arama işlemi sondan başa doğru da yapılabilir. 

// import java.util.LinkedList;

// /**
//  * WorkOne
//  */
// public class LinkedListCalismaAlani {

//     public static void main(String[] args) {
        
//         LinkedList<String> linkedList = new LinkedList<String>(); // Bu haliyle bu bir Doubly LinkedList olur.

//         // linkedList.push("A");
//         // linkedList.push("B");
//         // linkedList.push("C");
//         // linkedList.push("D");
//         // linkedList.push("F");
//         // linkedList.push("G");
//         // String kaldirilanVedonduruleneleman = linkedList.pop(); // Listenin son elemanını listeden kaldırır ve aynı zamanda döndürür.
//         // System.out.println(kaldirilanVedonduruleneleman);

//         linkedList.offer("A");        
//         linkedList.offer("B");        
//         linkedList.offer("C");        
//         linkedList.offer("D");        
//         linkedList.offer("F");        

//         linkedList.add(4,"E"); // İndeks 4'e "E" elemanını ekler.
//         // linkedList.remove("E"); // Object referansıyla eleman sildik.
//         // linkedList.remove(4);   // İndeks referansıyla eleman sildik.
//         // linkedList.poll(); // İlk elemanı listeden alır ve aynı zamanda döndürür.

//         System.out.println(linkedList.peekFirst()); // İlk elemanı alır ama silmez. İlk eleman boş ise null döndürür.
//         linkedList.addFirst("0"); // Listenin başına spesifik eleman eklemeye yarar.
//         linkedList.addLast("I"); // Listenin başına spesifik eleman eklemeye yarar.

//         String first = linkedList.removeFirst(); // İlk elemanı döndürür ve siler.
//         String last = linkedList.removeLast(); // Son elemanı döndürür ve siler.

//         System.out.println(first);
//         System.out.println(last);
//         System.out.println(linkedList);

//         // Doubly LinkedList = Doubly LinkedList
//         // LinkedList = Singly LinkedList

        
//   //    advantages?
//   // Dinamik veri yapısı: Dizideki gibi kaç eleman olacağını baştan düşünmeye gerek yoktur.
//   // Ekleme ve silme kolaydır: Elemanları kaydırmak gerekmez. Sadece düğümlerin bağlantıları(pointer) değiştirilir.
//   // Az bellek israfı: Bellek eleman sayısı kadar kullanılır. ArrayList'teki gibi "kapasite doldu, iki katına çıkar" durumu yoktur. Boş yer ayrılmaz.
  
//   //    disadvantages?
//   // Daha fazla bellek kullanımı: Hem veriyi hem de bağlantı bilgisi tutulur.
//   // Doğrudan erişim yoktur: dizi[5]j gibi tek bir adımda herhangi bir elemana erişmek mümkün değildir.
//   // Arama ve erişim yavaştır.: Bir veriyi bulmak için baştan veya sondan düğümde sırayla ilerlemeniz gerekir.
        
//     }
// }

/////////////////////////////////////////
/// JAVA CRUD

