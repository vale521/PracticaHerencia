/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PracticaHerenciaValeriaSerrano;

/**
 *
 * @author valer
 */
public class DesarrolladorSenior extends Desarrollador{
    int añosExp, numProyectosLiderados;
    String nivelEspecializacion;
    boolean capMentoría;

    public DesarrolladorSenior(int añosExp, int numProyectosLiderados, String nivelEspecializacion, boolean capMentoría, String lenguaje, String nivelDominio, String herramientas, int cantProyectos, double salario, String identificadorEmpleado, String tipoContrato, String sede, String fechaContratacion, String nombre, String id, String direccion, String telefono, int edad, int numero) {
        super(lenguaje, nivelDominio, herramientas, cantProyectos, salario, identificadorEmpleado, tipoContrato, sede, fechaContratacion, nombre, id, direccion, telefono, edad, numero);
        this.añosExp = añosExp;
        this.numProyectosLiderados = numProyectosLiderados;
        this.nivelEspecializacion = nivelEspecializacion;
        this.capMentoría = capMentoría;
    }

    public int getAñosExp() {
        return añosExp;
    }

    public void setAñosExp(int añosExp) {
        this.añosExp = añosExp;
    }

    public int getNumProyectosLiderados() {
        return numProyectosLiderados;
    }

    public void setNumProyectosLiderados(int numProyectosLiderados) {
        this.numProyectosLiderados = numProyectosLiderados;
    }

    public String getNivelEspecializacion() {
        return nivelEspecializacion;
    }

    public void setNivelEspecializacion(String nivelEspecializacion) {
        this.nivelEspecializacion = nivelEspecializacion;
    }

    public boolean isCapMentoría() {
        return capMentoría;
    }

    public void setCapMentoría(boolean capMentoría) {
        this.capMentoría = capMentoría;
    }
    
    @Override
    public void trabaja()
    {
        System.out.println(nombre+" desarrolla software, lidera proyectos y guía al equipo.");
    }
    
    @Override
    public void evaluarDesempeño()
    {
        System.out.println(nombre+" está evaluando desempeño de equipo.");
    }
    
    @Override
    public void impartirCapacitación()
    {
        System.out.println(nombre+" está impartiendo capacitación.");
    }
}
