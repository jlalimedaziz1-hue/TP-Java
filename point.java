public class point {   
   
    private int Abs;   
    private int Ord;   

    
    point(int a, int b) {
        Abs = a;
        Ord = b;
    }

    point(int a) {
        Abs = a;
        Ord = 2*a;
    }
    
   
    void translationHorizontale(int t) {   
        Abs = Abs + t;   
    }  
 
    void translation(int t, int t1) {   
        Abs = Abs + t;   
        Ord = Ord + t1;   
    }     
  
    void affiche() {   
        System.out.println("p("+ Abs +","+ Ord +")");   
    }   
}   
  
class test {   
   
    public static void main(String[] args) {            
        point p1 = new point(2, 3);   
        point p2 = new point(4);   

        p1.affiche();   

        p1.translation(2, 5);  
        p2.translationHorizontale(3); 

        
        p1.affiche();   

        
        p2.affiche();   
    }   
}
