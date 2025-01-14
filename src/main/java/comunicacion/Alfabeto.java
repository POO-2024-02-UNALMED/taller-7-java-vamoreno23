package comunicacion;

import java.util.ArrayList;

public class Alfabeto extends Pictograma{
    
    private ArrayList<String> letras;
    private String interpretacion;

    // el constructor
    public Alfabeto(String origen, ArrayList<String> letras, String interpretacion) {
        super(origen);
        this.letras = letras;
        this.interpretacion= interpretacion;
    }

    public ArrayList<String> getLetras() {
        return letras;
    }

    public void setLetras(ArrayList<String> letras){
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
        return letras.size();
    }
    
    @Override
    public String interpretacion() {
        return interpretacion;
    }

    // Método toString que devuelve el alfabeto separado por ", "
    @Override
    public String toString() {   
        for (int idx = 0; idx < letras.size(); idx++) {
            System.out.println(letras.get(idx) );
            if (idx< letras.size() - 1){
                System.out.println(", ");
            }
        }        
        return 
    }
}


