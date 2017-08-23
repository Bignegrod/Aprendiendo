package eje3;

public class Libro {

    private String isbn;
    private String titulo;
    private String nomCo;
    private String edit;
    private int anio;
    private boolean esp;
    private int precio;
    private int canPag;
    private char colecc;
    private int copi;

    public Libro() {
           this.isbn = "";
        this.titulo = "";
        this.nomCo = "";
        this.edit = "";
        this.anio = 0;
        this.esp = true;
        this.precio = 0;
        this.canPag = 0;
        this.colecc = ' ';
        this.copi = 0;
    }

    public Libro(String isbn, String titulo, String nomCo, String edit, int anio, boolean esp, int precio, int canPag, char colecc, int copi) {
        setIsbn(isbn);
        setTitulo(titulo);
        setNomCo(nomCo);
        setEdit(edit);
        setAnio(anio);
        setEsp(esp);
        setPrecio(precio);
        setCanPag(canPag);
        setColecc(colecc);
        setCopi(copi);
    }

    public Libro(String titulo, String nomCo, String edit, int precio) {
        setTitulo(titulo);
        setNomCo (nomCo);
        setEdit  (edit);
        setPrecio  (precio);
    }

    

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if(titulo.trim().length()>0)
        {
        
        this.titulo = titulo.toUpperCase();
        }
        else{
            System.out.println("Error ingrese un titulo correcto");
        
        }
    }

    public String getNomCo() {
        return nomCo;
    }

    public void setNomCo(String nomCo) {
        this.nomCo = nomCo;
    }

    public String getEdit() {
        return edit;
    }

    public void setEdit(String edit) {
        this.edit = edit;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        if(anio>1900)
        {
        this.anio =anio;
        }
        else
        {
                System.out.println("Error ingrese un año valido");
                }
        
    }

    public boolean isEsp() {
        return esp;
    }

    public void setEsp(boolean esp) {
        this.esp = esp;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {

        if(precio>=1000 && precio<=999999)
        {   
        this.precio = precio;
        }else{
            System.out.println("Ingrese un precio valido");
        }
    }

    public int getCanPag() {
        return canPag;
    }

    public void setCanPag(int canPag) {
        this.canPag = canPag;
    }

    public char getColecc() {
        return colecc;
    }

    public void setColecc(char colecc) {
        //         if(titulo.trim().length()>0)
//        {
//        
//        this.titulo = titulo.toUpperCase();
//        }
//        else{
//            System.out.println("Error ingrese un titulo correcto");
//        
//        }
//    }
        if(colecc=='S' || colecc=='N'||colecc=='s' || colecc=='n')
        {
        this.colecc = colecc;
        }else{
            System.out.println("Ingrese una opcion valida");
        }
    }

    public int getCopi() {
        return copi;
    }

    public void setCopi(int copi) {
        this.copi = copi;
    }

    public void printlibro(){
        
        System.out.println("numero ISBN"+getIsbn());
        System.out.println("Titulo del libro"+getTitulo());
        System.out.println("Nombre completo del autor"+getNomCo());
        System.out.println("  nombre editorial"+getEdit());
        System.out.println("año"+getAnio());
        System.out.println("¿El libro esta escrito en español?"+isEsp());
        System.out.println("precio del libro"+getPrecio());
        System.out.println("cantidad de hojas del libro"+getCanPag());
        System.out.println("¿Es de coleecion¿"+getColecc());
        System.out.println("cantidad de copias disponibles"+getCopi());
        if (isEsp()== true){
            
            
            System.out.println("Escrito en español:Si");
        }
        else{
            System.out.println("Escrito en español:No");
        }
        
        if (getColecc()=='S' || getColecc()=='s'){
            System.out.println("Es de coleccion:Si");
        }else{
            
            System.out.println("Es de coleccion:No");
        }
    }
    
    
}
