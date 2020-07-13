package Enunciado2;
public class Lista {
    private Nodo inicio;
    private int tamaño;

    public Lista() {
        inicio=null;
        tamaño=0;
    }
    
    public boolean esVacia(){
        return inicio==null;
    }
   
    public void agregarInicio(String name, int codigo, int nota){
        Nodo nuevo= new Nodo();
        nuevo.setCodigo(codigo);
        nuevo.setName(name);
        nuevo.setNota(nota);
        if(esVacia()){//inicio==null
            inicio=nuevo;
        }else{
            nuevo.setSiguiente(inicio);
            inicio=nuevo;
        }
        tamaño++;
    }
   
    public void listar(){
        if(!esVacia()){
            Nodo aux=inicio;
            int i=0;
            while(aux!=null){
                System.out.print("["+ " Codigo:" +aux.getCodigo()+" Nombre:"+ aux.getName()+"  Nota:"+aux.getNota() + " ]"+" -> ");
                aux=aux.getSiguiente();
            }
        }else{
            System.out.println("La lista esta vacia....");
        }
    }
    public void buscarDato(int codigo){
        if(!esVacia()){
            Nodo aux=inicio;
            while(aux!=null){
                if(aux.getCodigo()==codigo){
                    System.out.print("["+ " Codigo:" +aux.getCodigo()+" Nombre:"+ aux.getName()+"  Nota:"+aux.getNota() + " ]"+" -> ");
                }
                aux=aux.getSiguiente();
            }
        }else{
             System.out.println("La lista esta vacia....");
        }
    }
   public void agregarPosicion(int pos,int codigo,String nombre,int nota){
      
        
        if(pos>=0 && pos<=tamaño){
            Nodo nuevo=new Nodo();
            nuevo.setCodigo(codigo);
            nuevo.setName(nombre);
            nuevo.setNota(nota);
            if(pos==0){
                nuevo.setSiguiente(inicio);
                inicio=nuevo;
            }else{
                if(pos==tamaño){
                    Nodo aux=inicio;
                    while(aux.getSiguiente()!=null){
                        aux=aux.getSiguiente();
                    }
                    aux.setSiguiente(nuevo);
                }else{
                    Nodo aux=inicio;
                    for(int i=0;i<(pos-1);i++){
                    aux=aux.getSiguiente();
                }
                    Nodo siguiente=aux.getSiguiente();
                    aux.setSiguiente(nuevo);
                    nuevo.setSiguiente(siguiente);
                }
            }
            tamaño++;
        }
    }
       public void eliminarPorPosicion(int posicion){
        if(posicion>=0 && posicion<tamaño){
            if(posicion == 0){
                inicio = inicio.getSiguiente();
            }
            else{
                Nodo aux = inicio;
                for (int i = 0; i < posicion-1; i++) {
                    aux = aux.getSiguiente();
                }
                Nodo siguiente = aux.getSiguiente();
                aux.setSiguiente(siguiente.getSiguiente());
            }
            tamaño--;
        }
    }
   
   
   
   
    public void eliminar(){
        // Elimina el valor y la referencia a los demas nodos.
        inicio = null;
        // Reinicia el contador de tamaño de la lista a 0.
        tamaño = 0;
    }
    
    
    
}
