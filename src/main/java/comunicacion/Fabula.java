package comunicacion;

public class Fabula extends Escrito {
    
    private String ensenanzas;
    private String interpretacion;

    // el constructor
    public Fabula(String origen, String titulo, String autor, int paginas, String ensenanzas, String interpretacion) {
        super(origen, titulo, autor, paginas);
        this.ensenanzas= ensenanzas;
        this.interpretacion= interpretacion;
    }

    public String getEnsenanzas() {
        return ensenanzas;
    }

    public void setEnsenanzas(String ensenazas){
        this.ensenanzas = ensenazas;
    }


    public String getInterpretacion() {
        return interpretacion;
    }

    public void setInterpretacion(String interpretacion) {
        this.interpretacion =interpretacion;
    }

    // Métodos
    public int palabrasTotales(int palabrasPorPagina) {
        return palabrasPorPagina * this.getPaginas() * 1; // Factor = 1
    }
    public String interpretacion() {
        return interpretacion;
    }

    @Override
    public String toString() {
        return ensenanzas;
    }
}