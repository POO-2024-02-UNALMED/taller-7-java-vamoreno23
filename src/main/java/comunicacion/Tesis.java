package comunicacion;

public class Tesis {
    
    private String idea;
    private String argumentos;
    private String conclusion;
    private String referencias;
    private String interpretacion;

    // el constructor
    public Tesis(String idea, String argumentos, String conclusion, String referencias, String interpretacion) {
        this.idea= idea;
        this.argumentos = argumentos;
        this.conclusion = conclusion;
        this.referencias = referencias;
        this.interpretacion= interpretacion;
    }


    public String getIdea() {
        return idea;
    }

    public void setIdea(String idea) {
        this.idea = idea;
    }

    public String getArgumentos() {
        return argumentos;
    }

    public void setArgumentos(String argumentos) {
        this.argumentos =argumentos;
    }

    public String getConclusion() {
        return conclusion;
    }

    public void setConclusion(String conclusion) {
        this.conclusion =conclusion;
    }
        
    public String getReferencias() {
        return referencias;
    }

    public void setConclusion(String referencias) {
        this.referencias =referencias;
    }

    public String getInterpretacion() {
        return interpretacion;
    }

    public void setInterpretacion(String interpretacion) {
        this.interpretacion =interpretacion;
    }

    // Metodos

    public int palabrasTotales(int palabrasPorPagina) {
        int numeroPaginas = 30; // Supongamos 30 páginas por defecto para periódicos
        return palabrasPorPagina * numeroPaginas * 10; // Factor = 10
    }

    public String interpretacion() {
        return interpretacion;
    }

    @Override
    public String toString() {
        return fecha + "\n" +
               primicia;
    }


}