package comunicacion;

public class Fabula extends Escrito {
    
    private String ensenanzas;
    private String interpretacion;

    
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

    
    @Override
    public int palabrasTotales(int palabrasPorPagina) {
        return palabrasPorPagina * this.getPaginas();
    }

    @Override
    public String interpretacion() {
        return interpretacion;
    }

    @Override
    public String toString() {
        return this.getOrigen() + "\n" +
        this.getTitulo() + "\n" +
        this.getAutor() + "\n" +
        this.getPaginas() + "\n" +
        this.getEnsenanzas();
}

}