package comunicacion;

public class Periodico extends Escrito {
    
    private String fecha;
    private String primicia;
    private String interpretacion;

    // el constructor
    public Periodico(String origen, String titulo, String autor, int paginas, String fecha, String primicia, String interpretacion) {
        super(origen, titulo, autor, paginas);
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
        return palabrasPorPagina * this.getPaginas() * 10; // Factor = 10
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