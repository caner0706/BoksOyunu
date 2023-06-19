public class Dovuscu {
    
    String isim;
    private double hasar;
    double saglık;
    double agırlık;
    double korunma;

    public Dovuscu(String isim, double hasar, double saglık, double agırlık, double korunma) {
        this.isim = isim;
        this.hasar = hasar;
        this.saglık = saglık;
        this.agırlık = agırlık;
        this.korunma = korunma;
    }
    
    
    public int isabet(Dovuscu dovuscu){
        
        System.out.println("------------");
        System.out.println(this.isim + " => " + dovuscu.isim + " " +  this.hasar + " hasar vurdu.");
        
        if (dovuscu.Korunma()) {
            System.out.println(dovuscu.isim + " gelen hasarı savurdu.");
            return (int) dovuscu.saglık;
        }

        if ( dovuscu.saglık - this.hasar < 0)
            return 0;

        return (int) (dovuscu.saglık - this.hasar);
    }
    
    
    public boolean Korunma(){  //--> Dövüşçü Saldırıya Karşı Koruna Bilecek Mi? Hasar Mı Alacak? 
        
        double deger = Math.random() * 100;
        return deger <= this.korunma;
    }
}
