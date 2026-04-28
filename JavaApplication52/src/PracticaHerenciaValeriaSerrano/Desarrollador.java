/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PracticaHerenciaValeriaSerrano;

/**
 *
 * @author valer
 */
public class Desarrollador extends Empleado {
    String lenguaje, nivelDominio, herramientas;
    int cantProyectos;

    public Desarrollador(String lenguaje, String nivelDominio, String herramientas, int cantProyectos, double salario, String identificadorEmpleado, String tipoContrato, String sede, String fechaContratacion, String nombre, String id, String direccion, String telefono, int edad, int numero) {
        super(salario, identificadorEmpleado, tipoContrato, sede, fechaContratacion, nombre, id, direccion, telefono, edad, numero);
        this.lenguaje = lenguaje;
        this.nivelDominio = nivelDominio;
        this.herramientas = herramientas;
        this.cantProyectos = cantProyectos;
    }

    public String getLenguaje() {
        return lenguaje;
    }

    public void setLenguaje(String lenguaje) {
        this.lenguaje = lenguaje;
    }

    public String getNivelDominio() {
        return nivelDominio;
    }

    public void setNivelDominio(String nivelDominio) {
        this.nivelDominio = nivelDominio;
    }

    public String getHerramientas() {
        return herramientas;
    }

    public void setHerramientas(String herramientas) {
        this.herramientas = herramientas;
    }

    public int getCantProyectos() {
        return cantProyectos;
    }

    public void setCantProyectos(int cantProyectos) {
        this.cantProyectos = cantProyectos;
    }
    
    @Override
    public void trabaja()
    {
        System.out.println(nombre+" desarrolla software en: "+lenguaje);
    }
    
}
