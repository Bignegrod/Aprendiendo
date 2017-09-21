
package colegio;


public class Nota {
    private Asignatura asig;
    private Alumno alum;
    private float nota[]=new float[5];

    public Nota() {
    }

    public Nota(Asignatura asig, Alumno alum, float nota) {
        setAsig(asig);
        setAlum (alum);
        
    }

    public Asignatura getAsig() {
        return asig;
    }

    public void setAsig(Asignatura asig) {
        this.asig = asig;
    }

    public Alumno getAlum() {
        return alum;
    }

    public void setAlum(Alumno alum) {
        this.alum = alum;
    }

    public float[] getNota() {
        return nota;
    }

    public void setNota(float[] nota) {
        for(int i=0; i<nota.length;i++)
        {    
            if(nota[i]>1.0 && nota[i]<7.0)
        this.nota[i] = nota[i];
            else
                    System.out.println("Ingrese una nota correcta");
        }
    }

    @Override
    public String toString() {
        return "Nota{" + "asig=" + asig 
                + ", alum=" + alum 
                + ", nota=" + nota + '}';
    }
    
    public void recorreNota(){
        for(float not:nota)
        {
            System.out.println("Nota:"+not  );
        }
    }
    
    public float calcularPromedio(){
        float suma=0;
        float promedio =0;
        
        for(float not:nota)
        {
            suma=suma+not;
        }
        
        
        promedio=suma/nota.length;
        return promedio;
        
    }
    
}
