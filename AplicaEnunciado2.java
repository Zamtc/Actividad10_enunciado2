package Enunciado2;
import java.util.Scanner;

public class AplicaEnunciado2 {
  static Scanner teclado=new Scanner(System.in);
    public static Lista lista=new Lista();
    static Nodo nodo;
    
    public static void main (String args[]){
    MenuNodo();
}

    static void MenuNodo(){
        int opcion; 
        
        do{
            System.out.println("========================");
            System.out.println("\nMenú de Opciones");
            System.out.println("===========================");
            System.out.println("[1] Insertar al Inicio");
            System.out.println("[2] Mostrar los Elementos");
            System.out.println("[3] Eliminar Lista");
            System.out.println("[4] Buscar por código");
            System.out.println("[5] Agregar por posición");
            System.out.println("[6] Eliminar por posición");
            System.out.println("=============================");
            System.out.println("[0] Salir");
            
            System.out.print("\nIngrese una Opción: ");
            opcion=teclado.nextInt();
            switch(opcion){
                case 1 : 
                    ingreso();
                    break;
                case 2 : 
                    lista.listar();
                    break;
                 case 3 : 
                    lista.eliminar();
                    System.out.println("Lista Eliminada con éxito....");
                    break;
                 case 4 : 
                    buscar();
                    break;
                 case 5 : 
                    posicion();
                    break;
                 case 6 : 
                    eliminarPosicion();
                    System.out.println("Dato eliminado con éxito....");
                    break;
                case 0 : 
                    System.out.println("Saliendo del sistema....");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Ingrese Opción Correcta....");
                    System.out.println("\n");
            }
        } while (opcion!=0);
    }
    static void ingreso(){
        System.out.println("Ingrese el código: ");
        int codigo=teclado.nextInt();
         System.out.println("Ingrese el nombre: ");
        String name=teclado.next();
         System.out.println("Ingrese la nota: ");
        int nota=teclado.nextInt();
         lista.agregarInicio(name, codigo, nota);
    }
    static void buscar() {
        System.out.print("Ingrese Código: ");
        int num = teclado.nextInt();
        lista.buscarDato(num);
    }
     static void posicion() {
        System.out.print("Ingrese Posición: ");
        int pos = teclado.nextInt();
        System.out.println("Ingrese el código: ");
        int codigo=teclado.nextInt();
         System.out.println("Ingrese el nombre: ");
        String name=teclado.next();
         System.out.println("Ingrese la nota: ");
        int nota=teclado.nextInt();
        lista.agregarPosicion(pos, codigo, name, nota);
    }
     
      static void eliminarPosicion() {
        System.out.print("Ingrese la Posición a eliminar: ");
        int pos = teclado.nextInt();
        lista.eliminarPorPosicion(pos);
    }
}
