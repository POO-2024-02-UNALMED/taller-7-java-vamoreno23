package comunicacion;

public class Fabula {
    
    private String ensenanzas;
    private String interpretacion;

    // el constructor
    public Fabula(String ensenanzas, String interpretacion) {
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
        int numeroPaginas = 50; // Supongamos 50 páginas por defecto para fábulas
        return palabrasPorPagina * numeroPaginas * 1; // Factor = 1
    }
    public String interpretacion() {
        return interpretacion;
    }

    @Override
    public String toString() {
        return ensenanzas;
    }
}