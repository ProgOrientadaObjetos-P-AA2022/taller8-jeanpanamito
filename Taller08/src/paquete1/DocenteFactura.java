/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author JEanpa
 */
public class DocenteFactura extends Docente{
    
    private double valorSueldo;
    private double valorHoraExtra;
    private double numeroHorasExtra;
    private double sueldoFinal;

    public double ObtenerValorSueldo() {
        return valorSueldo;
    }

    public void establecerValorSueldo(double valorSueldo) {
        this.valorSueldo = valorSueldo;
    }

    public double obtenerValorHoraExtra() {
        return valorHoraExtra;
    }

    public void establecerValorHoraExtra(double valorHoraExtra) {
        this.valorHoraExtra = valorHoraExtra;
    }

    public double obtenerNumeroHorasExtra() {
        return numeroHorasExtra;
    }

    public void establecerNumeroHorasExtra(double numeroHorasExtra) {
        this.numeroHorasExtra = numeroHorasExtra;
    }

    public double obtenerSueldoFinal() {
        return sueldoFinal;
    }

    public void establecerSueldoFinal(double sueldoFinal) {
        this.sueldoFinal = valorSueldo +(valorHoraExtra*numeroHorasExtra);
    }

    @Override
    public String toString() {
        String reporte;
        reporte = String.format("\t\t--REPORTE DOCENTE--\n"
            + "Nombre Docente: %s\n"
            + "Identificación Docente: %s\n"
            + "Valor del sueldo: %.2f\n"
            + "Valor Hora Extra: %.2f\n"
            + "Número Extra de Horas trabajadas: %.2f\n"
            + "Valor Total del Sueldo: %.2f\n"
            , obtenerNombre()
            , obtenerCedula()
            , ObtenerValorSueldo()
            , obtenerValorHoraExtra()
            , obtenerNumeroHorasExtra()
            , obtenerSueldoFinal());
        return reporte; //To change body of generated methods, choose Tools | Templates.
    }
    
}
