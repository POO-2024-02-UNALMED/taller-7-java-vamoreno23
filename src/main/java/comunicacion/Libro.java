package comunicacion;

public class Libro {
    
    private String co_autor;
    private String editorial;
    private String edicion;
    private String interpretacion;

    // el constructor
    public Libro(String co_autor, String editorial, String edicion, String interpretacion) {
        this.co_autor= co_autor;
        this.editorial= editorial;
        this.edicion= edicion;
        this.interpretacion= interpretacion;
    }


    public String getCo_autor() {
        return co_autor;
    }

    public void setCo_autor(String co_autor) {
        this.co_autor = co_autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial =editorial;
    }

    public String getEdicion() {
        return edicion;
    }

    public void setEdicion(String edicion) {
        this.edicion =edicion;
    }

    public String getInterpretacion() {
        return interpretacion;
    }

    public void setInterpretacion(String interpretacion) {
        this.interpretacion =interpretacion;
    }


    // Métodos

    public int palabrasTotales(int numeroPalabrasPorPagina) {
        int numeroPaginas = 100; // Supongamos 100 páginas por defecto
        return numeroPalabrasPorPagina * numeroPaginas * 2; // Factor = 2
    }

    public String interpretacion() {
        return interpretacion;
    }

    @Override
    public String toString() {
        return co_autor + "\n" +
               editorial + "\n" +
               edicion;
    }
}

    