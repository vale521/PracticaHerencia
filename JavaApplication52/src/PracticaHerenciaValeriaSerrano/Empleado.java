/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PracticaHerenciaValeriaSerrano;

import java.util.Calendar;

/**
 *
 * @author valer
 */
public class Empleado extends Persona{
    double salario;
    String identificadorEmpleado, tipoContrato, sede,fechaContratacion;

    public Empleado(double salario, String identificadorEmpleado, String tipoContrato, String sede, String fechaContratacion, String nombre, String id, String direccion, String telefono, int edad, int numero) {
        super(nombre, id, direccion, telefono, edad, numero);
        this.salario = salario;
        this.identificadorEmpleado = identificadorEmpleado;
        this.tipoContrato = tipoContrato;
        this.sede = sede;
        this.fechaContratacion = fechaContratacion;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getIdentificadorEmpleado() {
        return identificadorEmpleado;
    }

    public void setIdentificadorEmpleado(String identificadorEmpleado) {
        this.identificadorEmpleado = identificadorEmpleado;
    }

    public String getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(String tipoContrato) {
        this.tipoContrato = tipoContrato;
    }

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    public String getFechaContratacion() {
        return fechaContratacion;
    }

    public void setFechaContratacion(String fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }

    
    public void trabaja()
    {
        System.out.println(nombre+" trabaja en TechCorp!!!");
    }
    
}
