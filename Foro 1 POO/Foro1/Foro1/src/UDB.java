/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Diego
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UDB {

    private Map<String, String> estudiantes;
   
    public UDB (){
        estudiantes = new HashMap<>();
        
    }
    
    public void IngresarAlumnos(String carnet,String nombre){
        estudiantes.put(carnet, nombre);
        System.out.println("Alumno ingresado exitosamente.\n");
    }
    
    public void BuscarAlumnos(String carnet){
        if(estudiantes.containsKey(carnet)){
            System.out.println("\nAlumno Encontrado:");
            System.out.println("Carnet: "+ carnet);
            System.out.println("Nombre: "+ estudiantes.get(carnet));
        }else{
            System.out.println("Alumno no encontrado, no se puede mostrar\n");
        }
    }
    
    public void EliminarAlumnos(String carnet){
        if(estudiantes.containsKey(carnet)){
            estudiantes.remove(carnet);
            System.out.println("Alumno Eliminado\n");
        }else{
            System.out.println("Alumno no encontrado, no se puede eliminar.\n");
        }
    }
    
    public void Mostrar(){
        if (!estudiantes.isEmpty()){
            System.out.println("Lista de alumnos:");
            for(Map.Entry<String, String> entry: estudiantes.entrySet()){
                System.out.println("Carnet: " + entry.getKey()+ " Nombre: "+ entry.getValue());     
            }
        }else{
                System.out.println("No hay alumnos registrados\n");  
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        UDB udbAlumnos = new UDB();
        Scanner scanner = new Scanner (System.in);
        
        while (true){
            System.out.println("Elija una de las siguientes opciones: ");
            System.out.println("1. Ingresar Alumno");
            System.out.println("2. Buscar Alumno");
            System.out.println("3. Eliminar Alumno");
            System.out.println("4. Mostrar Alumnos");
            System.out.println("5. SALIR");
            
            int opcion = scanner.nextInt();
            scanner.nextLine();
            
            switch (opcion){
                case 1:
                    System.out.println("Ingrese el carnet del alumno: ");
                    String carnet = scanner.nextLine();
                    System.out.println("Ingrese el nombre completo del alumno:");
                    String nombre = scanner.nextLine();
                    udbAlumnos.IngresarAlumnos(carnet, nombre);
                    break;
                    
                case 2:
                    System.out.println("Ingrese el carnet del alumno a buscar: ");
                    carnet = scanner.nextLine();
                    udbAlumnos.BuscarAlumnos(carnet);
                    break;
                    
                case 3:
                    System.out.println("Ingrese el carnet del alumno a eliminar: ");
                    carnet = scanner.nextLine();
                    udbAlumnos.EliminarAlumnos(carnet);
                    break;
                    
                case 4:
                    udbAlumnos.Mostrar();
                    break;
                    
                case 5:
                    System.out.println("Gracias por usar el programa! - Saliendo -");
                    scanner.close();
                    System.exit(0);
                    
                default: 
                    System.out.println("Opcion erronea, porfavor seleccione una opcion disponible!");
            }
        
        }
    }
    
}
