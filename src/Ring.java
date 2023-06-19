public class Ring {
    
    private Dovuscu dovuscu1;
    private Dovuscu dovuscu2;
    private double maksAgirlik;
    private double minAgirlik;

    public Ring(Dovuscu dovuscu1, Dovuscu dovuscu2, double maksAgirlik, double minAgirlik) {
        this.dovuscu1 = dovuscu1;
        this.dovuscu2 = dovuscu2;
        this.maksAgirlik = maksAgirlik;
        this.minAgirlik = minAgirlik;
    }
    
    
    
    
    
    public void dovus() {

        if (kiloKontrol()) {
            while (dovuscu1.saglık> 0 && dovuscu2.saglık > 0) {
                System.out.println("======== YENİ ROUND ===========");
                dovuscu2.saglık = dovuscu1.isabet(dovuscu2);
                if (kazananIsim()){
                    break;
                }
                
                
                dovuscu1.saglık = dovuscu2.isabet(dovuscu1);
                if (kazananIsim()){
                    break;
                }
                
                sonucYazdir();
            }
            

        } else {
            System.out.println("Sporcuların ağırlıkları uyuşmuyor.");
        }


    }

    
    
    
    public boolean kiloKontrol() {
        return (dovuscu1.agırlık >= minAgirlik && dovuscu1.agırlık <= maksAgirlik) && (dovuscu2.agırlık >= minAgirlik && dovuscu2.agırlık <= maksAgirlik);
    }

    public boolean kazananIsim() {
        if (dovuscu1.saglık == 0) {
            System.out.println("Maçı Kazanan : " + dovuscu2.isim);
            return true;
        } else if (dovuscu2.saglık == 0){
            System.out.println("Maçı Kazanan : " + dovuscu1.isim);
            return true;
        }

        return false;
    }

    
    
    
    
    
    public void sonucYazdir() {
        System.out.println("------------");
        System.out.println(dovuscu1.isim + " Kalan Can \t:" + dovuscu1.saglık);
        System.out.println(dovuscu2.isim + " Kalan Can \t:" + dovuscu2.saglık);
    }
}
