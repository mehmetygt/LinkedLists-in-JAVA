
package sehirturla_linkedlist;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;


public class Sehirturla_LinkedList {
    
    public static void islemleri_bastır(){
        System.out.println("\t İŞLEMLER");
        System.out.println("0=işlemleri bastır");
        System.out.println("1=sonraki şehre git");
        System.out.println("2=önceki şehre git");
        System.out.println("3=uygulamadan çık");
    }
    
    
    
    
    
    
    public static void sehir_turla(LinkedList<String> sehir){
        ListIterator<String> iterator=sehir.listIterator();
        int islem;
        
        islemleri_bastır();
        Scanner scanner=new Scanner(System.in);
        
        
        while (!iterator.hasNext()) {
            System.out.println("hiçbir şehir bulunmuyor.. ");
                 
        }
        boolean çıkış=false; 
        boolean ileri=true;
        while (!çıkış) {
            System.out.println("\t Bir İşlem Seçin"); 
             System.out.print("İşlem :");
            islem = scanner.nextInt();
            
           
            switch(islem){
                case 0:
                    islemleri_bastır();
                    break;
                case 1:
                    if (!ileri) {
                        if (iterator.hasNext()) {
                            iterator.next();
                           
                        }ileri=true;
                        
                        
                    }
                    if(iterator.hasNext()){
                        System.out.println("sonraki şehre gidiliyor---> "+iterator.next());
                    }
                    else{System.out.println("Gidilecek şehir kalmadı");}
                     ileri=true;
                    break;
                case 2:
                      if (ileri) {
                        if (iterator.hasPrevious()) {
                            iterator.previous();
                           
                        }ileri=false;
                      }
               if(iterator.hasPrevious()){
                        System.out.println("önceki şehre gidiliyor---> "+iterator.previous());
                     }
                     
                    else{System.out.println("Gidilecek şehir yok..Tekrar şehir turuna başlamak istermisin");
                     }
                        
                     break;
                case 3:    
                    çıkış=true;
                    System.out.println("Uygulamadan çıkılıyorrr..Tekrar şehir turuna başla.");
                     break;
            
            }
                
                    
            
        }
            }

   
    public static void main(String[] args) {
        LinkedList<String> sehirler=new LinkedList<String>();
        
        
         sehirler.add("ankara");
         sehirler.add("eskişehir");
         sehirler.add("afyon");
         sehirler.add("elazığ");
         sehirler.add("van");
         sehirler.add("istanbul");
         
         sehir_turla(sehirler);
         
         
       
        
    }
    
}
