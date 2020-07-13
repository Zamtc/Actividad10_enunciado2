package Enunciado2;
public class Nodo {
     private String name;
     private int codigo,nota;
     private Nodo siguiente;

    public Nodo(String name, int codigo, int nota, Nodo siguiente) {
        this.name = name;
        this.codigo = codigo;
        this.nota = nota;
        this.siguiente = siguiente;
    }
    public Nodo() {
        name=null;
        codigo=0;
        nota=0;
        siguiente=null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
     
}
