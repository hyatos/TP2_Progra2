
package punto12;


public class Libro {
    
    private String nombreDelLibro;
    private Editorial editorial;   //Clase Editorial 
    private Autor autor;       //Clase Autor
    private int añoDePublicacion;
    private String iSDN;
    private int cantidadEjemplares;

    
    Libro(String n, int año, String is, int cantidad)
    {
    this.nombreDelLibro = n;
    this.añoDePublicacion = año;
    this.iSDN = is ;
    this.cantidadEjemplares = cantidad;
    }
    
    Libro(String nombre, int año)
    {
    this.nombreDelLibro = nombre;
    this.añoDePublicacion = año;
    }
    
    
    
    
    /**
     * @return the nombreDelLibro
     */
    public String getNombreDelLibro() {
        return nombreDelLibro;
    }

    /**
     * @param nombreDelLibro the nombreDelLibro to set
     */
    public void setNombreDelLibro(String nombreDelLibro) {
        this.nombreDelLibro = nombreDelLibro;
    }

    /**
     * @return the editorial
     */
    public Editorial getEditorial() {
        return editorial;
    }

    /**
     * @param editorial the editorial to set
     */
    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    /**
     * @return the añoDePublicacion
     */
    public int getAñoDePublicacion() {
        return añoDePublicacion;
    }

    /**
     * @param añoDePublicacion the añoDePublicacion to set
     */
    public void setAñoDePublicacion(int añoDePublicacion) {
        this.añoDePublicacion = añoDePublicacion;
    }

    /**
     * @return the iSDN
     */
    public String getiSDN() {
        return iSDN;
    }

    /**
     * @param iSDN the iSDN to set
     */
    public void setiSDN(String iSDN) {
        this.iSDN = iSDN;
    }

    /**
     * @return the cantidadEjemplares
     */
    public int getCantidadEjemplares() {
        return cantidadEjemplares;
    }

    /**
     * @param cantidadEjemplares the cantidadEjemplares to set
     */
    public void setCantidadEjemplares(int cantidadEjemplares) {
        this.cantidadEjemplares = cantidadEjemplares;
    }

    /**
     * @return the autor
     */
    public Autor getAutor() {
        return autor;
    }

    /**
     * @param autor the autor to set
     */
    public void setAutor(Autor autor) {
        this.autor = autor;
    }
    
    
    
}
