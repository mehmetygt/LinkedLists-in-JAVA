
package linkedlists;

import java.awt.AWTEventMulticaster;
import java.util.LinkedList;
import java.util.ListIterator;


public class LinkedLists {
    public static void liste_bastır(LinkedList<String> linked_list){
       //for each ile kullanabiliriz
       for (String a : linked_list){
           System.out.println(a);}
       
       
     /*  //ama list iterator kullanmak istersek
        ListIterator<String> iterator=linked_list.listIterator();
        
        while (iterator.hasNext()) {
            System.out.println(iterator.next());//böylece iterator bütün listeyi dolaşırkenbastırmış olcak
            
        }*/
    
    
        
    }
    public static void sirali_ekle(LinkedList<String> listem,String yeni){
        //şimdi gelen elemanları alfabeye göre sıralayıp ekleyecek method yazalım
        
         ListIterator<String> iterator=listem.listIterator();
        
        while (iterator.hasNext()) {
            
            int karasılastıtrma=iterator.next().compareTo(yeni);
            
            if (karasılastıtrma==0) {
                System.out.println("bu eleman zaten varama yinede aynısının yanıa ekliyorum");
                            }
           
            
            else if (karasılastıtrma<0) {
                System.out.println("yeni eleman daha büyük eklendi");
            }
            
             else{
                System.out.println("yeni eleman daha küçük eklendi");
                iterator.previous();
                iterator.add(yeni);
            return;
             }
               
              
        }
        iterator.add(yeni);
    
    
        
    
    }

   
    public static void main(String[] args) {
        //LinkedListleri klasik ArrayListler gibi tanımalrız
        LinkedList<String> linkedlist=new LinkedList<String>();
        
      /*  linkedlist.add("mehmet");
        linkedlist.add("ali");
        linkedlist.add("veli");
        //şu şekilde oluşturduğumuz method ile bastırabiiriz
       // liste_bastır(linkedlist);*/
        
        
       /*// ama farklı bir şekilde liste üzerinde dolaşmak istiyorsak
        //ListIterator kulanıyoruz
        liste_bastır(linkedlist);
          linkedlist.remove(1);// diyerek hazır metod iles istediğim elemanı silebilirim
        liste_bastır(linkedlist);*/
        sirali_ekle(linkedlist, "ayşe");
        sirali_ekle(linkedlist, "veli");
        sirali_ekle(linkedlist, "ahmet");
        sirali_ekle(linkedlist, "mehmet");
        sirali_ekle(linkedlist, "ali");
        sirali_ekle(linkedlist, "ayşe");
        liste_bastır(linkedlist);
       
   
    }
    
}
