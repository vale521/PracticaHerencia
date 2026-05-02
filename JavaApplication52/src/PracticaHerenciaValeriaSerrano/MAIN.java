/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PracticaHerenciaValeriaSerrano;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author valer
 */
public class MAIN {

    /**
     * @param args the command line arguments
     */
    /*
    persona: nombre, edad, id, direccion y numeroTelefono
    empleadoTechCorp: salario, identificadorEmpleado, fechaContratacion, tipoContrato(completo o parcial) y sede
    desarrollador construye software: lenguaje, nivelDominio, herramientas y cantProyectos
     ->desarrollador senior: años de experiencia, numProyectosLiderados, nivelEspecializacion y capMentoría
    gerente: dirigir equipos y coordinar actividades. atributos departSupervisado, cantPersonal, presupuesto, frecuenciareuniones
    
    
    */
    public static void main(String[] args) {
        Scanner lea = new Scanner (System.in);
        ArrayList<Empleado> empleados = new ArrayList<>();
        String opcion;
        do
        {
            System.out.println("TECHCORP MENU \n1.MostrarEmpleados \n2.Ejecutar trabajo \n3. EVALUAR TRABAJO \n4.Impartir capacitacion \n5.MostrarSalarios \n6.Agregar Empleado \n7.Salir \nSeleccione una de las opciones: ");
            opcion = lea.next();
            switch (opcion)
            {
                case "1":
                    for (Empleado empleado : empleados) {
                        empleado.printDatoPersonales();
                        System.out.println("********************************************");
                    }
                    break;
                case "2":
                    for (Empleado empleado : empleados) {
                        empleado.trabaja();
                    }
                    break;
                case "3":
                    for (Empleado empleado : empleados) {
                        empleado.evaluarDesempeño();
                    }
                    break;
                case "4":
                    for (Empleado empleado : empleados) {
                        empleado.impartirCapacitación();
                    }
                    break;
                case "5":
                    for (Empleado empleado : empleados) {
                        System.out.println(empleado.getNombre()+" salario: L."+empleado.getSalario());
                    }
                    break;
                case "6":
                    int tipo;
                    System.out.println("Tipo empleado: \n1. Desarrollador \n2. Gerente \n3.Desarrollador Senior \nSeleccione tipo:");
                    tipo = lea.nextInt();
                    lea.nextLine();
                    System.out.println("Nombre: ");
                    String nombre = lea.nextLine();
                    System.out.println("ID: ");
                    String id = lea.nextLine();
                    System.out.println("Direccion: ");
                    String dir = lea.nextLine();
                    System.out.println("Edad: ");
                    int ed = lea.nextInt();
                    System.out.println("Numero Telefono: ");
                    int tel = lea.nextInt();
                    System.out.println("Numero interno: ");
                    int num = lea.nextInt();
                    System.out.println("salario: ");
                    double sal = lea.nextDouble();
                    System.out.println("SEDE: ");
                    String sede = lea.nextLine();
                    System.out.println("Identificador empleado: ");
                    String identificador = lea.nextLine();
                    System.out.println("Tipo contrato: (parcial/imparcial)");
                    String tipoC = lea.nextLine();
                    System.out.println("Fecha contratación: ");
                    String fecha = lea.nextLine();
                    
                    if (tipo==1)
                    {
                        System.out.println("Lenguaje: ");
                        String lenguaje = lea.nextLine();
                        System.out.println("Nivel dominio: ");
                        String nivel = lea.nextLine();
                        System.out.println("Herramientas: ");
                        String her = lea.nextLine();
                        System.out.println("Cant. proyectos: ");
                        int cant = lea.nextInt();
//                        empleados.add(new Desarrollador(lenguaje, nivel, her, cant, sal, identificador, tipoC, sede, fecha, nombre, id, dir, tel, ed, dir, num));
                    }
                    
                case "7":
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción Inválida.");
                    break;
            }
        } while (!opcion.equals("7"));
        
    }
    
}
