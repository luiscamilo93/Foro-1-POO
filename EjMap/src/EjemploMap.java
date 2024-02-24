/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Map;
import java.util.HashMap;
import java.util.Collections;
import java.util.Objects;

public class EjemploMap {
    public static void main(String[] args) {
        
        //Se crea un mapa llamado salariosEmpleados
        Map<String, Double> salariosEmpleados = new HashMap<>();
        
        // Agregar algunos empleados para el ejemplo
        salariosEmpleados.put("Juan", 2500.0);
        salariosEmpleados.put("María", 2800.0);
        salariosEmpleados.put("Pedro", 2200.0);

        // Mostrar todos los empleados
        System.out.println("Salarios de los empleados:");
        salariosEmpleados.forEach((nombre, salario) -> System.out.println("Nombre: " + nombre + ", Salario: " + salario));

        // Eliminar al empleado con el salario más bajo 
        if (!salariosEmpleados.isEmpty()) {
            Double salarioMinimo = Collections.min(salariosEmpleados.values());
            salariosEmpleados.entrySet().removeIf(entry -> Objects.equals(entry.getValue(), salarioMinimo));
            System.out.println("\nEmpleado con el salario más bajo eliminado.");
        }
        
        // Mostrar los empleados después de la eliminación
        System.out.println("\nSalarios de los empleados después de la eliminación:");
        salariosEmpleados.forEach((nombre, salario) -> System.out.println("Nombre: " + nombre + ", Salario: " + salario));
    }
}