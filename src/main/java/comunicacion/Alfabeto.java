package comunicacion;

import java.util.ArrayList;

public class Alfabeto extends Pictograma{
    
    private String[] letras;
    private String interpretacion;

    public Alfabeto(String origen, String[] letras, String interpretacion) {
        super(origen);
        this.letras = letras;
        this.interpretacion= interpretacion;
    }

    public String[] getLetras() {
        return letras;
    }

    public void setLetras(String[] letras){
        this.letras = letras;
    }

    public String getInterpretacion() {
        return interpretacion;
    }

    public void setInterpretacion(String interpretacion) {
        this.interpretacion =interpretacion;
    }

    public int cantidadLetras() {
        return letras.length;
    }
    
    @Override
    public String interpretacion() {
        return interpretacion;
    }
    @Override
    public String toString() {
        StringBuilder abcString = new StringBuilder();
        for (int idx = 0; idx < letras.length; idx++) {
            abcString.append(letras[idx]);
            if (idx < letras.length - 1) {
                abcString.append(", ");
            }
        }
        return abcString.toString();
    }
}

