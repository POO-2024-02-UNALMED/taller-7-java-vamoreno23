package comunicacion;

public class Periodico {
    
    private String fecha;
    private String primicia;
    private String interpretacion;

    // el constructor
    public Periodico(String fecha, String primicia, String interpretacion) {
        this.fecha= fecha;
        this.primicia = primicia;
        this.interpretacion= interpretacion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha){
        this.fecha = fecha;
    }


    public String getprimicia() {
        return primicia;
    }

    public void setPrimicia(String primicia){
        this.primicia = primicia;
    }

    public String getInterpretacion() {
        return interpretacion;
    }

    public void setInterpretacion(String interpretacion) {
        this.interpretacion =interpretacion;
    }

    //Metodos
    public int palabrasTotales(int palabrasPorPagina) {
        int numeroPaginas = 30; // Supongamos 30 páginas por defecto para periódicos
        return palabrasPorPagina * numeroPaginas * 10; // Factor = 10
    }

    // Método interpretacion
    public String interpretacion() {
        return interpretacion;
    }

    // Método toString
    @Override
    public String toString() {
        return fecha + "\n" +
               primicia;
    }
}