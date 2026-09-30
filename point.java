public class point {   
   
    private int Abs;   
    private int Ord;   
    private String nom;   

    
    point(int a, int b) {
        Abs = a;
        Ord = b;
        nom = "P";
    }

    point(int a) {
        Abs = a;
        Ord = 2*a;
        nom = "P";
    }

    point(String nom, int a, int b) {
        this.nom = nom;
        Abs = a;
        Ord = b;
    }

    point(String nom, int a) {
        this.nom = nom;
        Abs = a;
        Ord = 2*a;
    }

        public String getNom() {
        return nom;
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

    public static void main(String[] args) {   
        point p1 = new point("A", 2, 3);   
        point p2 = new point("B", 4);   

        System.out.println("nom de p1 : " + p1.getNom());   
        System.out.println("nom de p2 : " + p2.getNom());   

        p1.affiche();   
        p1.translation(2, 5);   
        p2.translationHorizontale(3);   
        p1.affiche();   
        p2.affiche();   
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
