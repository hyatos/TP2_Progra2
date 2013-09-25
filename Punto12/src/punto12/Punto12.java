
package punto12;

public class Punto12 {

    
    public static void main(String[] args) {
       
        Editorial ed = new Editorial("Salamandra",4488996, "Argentina 889", "Catamarca","salaman@xxxx.xxx","23-123465789-45");
        Autor au = new Autor("J. K.", "Rowlin","12/05/1956","asdasd@asd.com","femenino" );
       
        
        Libro lib = new Libro("Harry Potter y las reliquias de la Muerte", 2006, "RS-12345679", 10 );
        
        lib.setEditorial(ed);
        lib.setAutor(au);
        
        
    }
}
