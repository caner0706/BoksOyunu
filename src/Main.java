public class Main {
    
    public static void main(String[]args){
        
        Dovuscu dovuscu1 = new Dovuscu("Marc" , 15 , 100, 90, 0);
        Dovuscu dovuscu2 = new Dovuscu("Alex" , 10 , 95, 90, 0);
        
        Ring ring = new Ring(dovuscu1,dovuscu2, 90 , 100);
        
        ring.dovus();
        
    }
}
