/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PracticaHerenciaValeriaSerrano;

/**
 *
 * @author valer
 */
public class Gerente extends Empleado{
    String departSupervisado,frecuenciareuniones;
    int cantPersonal;
    double presupuesto;

    public Gerente(String departSupervisado, String frecuenciareuniones, int cantPersonal, double presupuesto, double salario, String identificadorEmpleado, String tipoContrato, String sede, String fechaContratacion, String nombre, String id, String direccion, String telefono, int edad, int numero) {
        super(salario, identificadorEmpleado, tipoContrato, sede, fechaContratacion, nombre, id, direccion, telefono, edad, numero);
        this.departSupervisado = departSupervisado;
        this.frecuenciareuniones = frecuenciareuniones;
        this.cantPersonal = cantPersonal;
        this.presupuesto = presupuesto;
    }
    
    @Override
    public void trabaja()
    {
        System.out.println(nombre+"está coordinando el departamento de: "+departSupervisado);
    }
       
    @Override
    public void evaluarDesempeño()
    {
        System.out.println(nombre+" está evaluando el desempeño de su equipo.");
    }
}
