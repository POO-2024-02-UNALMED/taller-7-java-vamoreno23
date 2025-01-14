package comunicacion;

public class Alfabeto extends Pictograma{
    
    private String letras;
    private String interpretacion;

    // el constructor
    public Alfabeto(String origen, String letras, String interpretacion) {
        super(origen);
        this.letras= letras;
        this.interpretacion= interpretacion;
    }

    public String getLetras() {
        return letras;
    }

    public void setLetras(String letras){
        this.letras = letras;
    }

    public String getInterpretacion() {
        return interpretacion;
    }

    public void setInterpretacion(String interpretacion) {
        this.interpretacion =interpretacion;
    }

    //Metodos
    public int cantidadLetras() {
        return letras != null ? letras.length() : 0;
    }
    @Override
    public String interpretacion() {
        return interpretacion;
    }

    // Método toString que devuelve el alfabeto separado por ", "
    @Override
    public String toString() {
        StringBuilder alfabeto = new StringBuilder();
        for (char letra = 'A'; letra <= 'Z'; letra++) {
            alfabeto.append(letra).append(", ");
        }
        
        // Eliminar la última coma y el espacio sobrantes
        alfabeto.setLength(alfabeto.length() - 2);
        return alfabeto.toString();
    }
}


