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
public class DocenteNombramiento extends Docente {

    private double valorFactura;
    private double ivaDescuento;
    private double valorCancelar;

    public double obtenerValorFactura() {
        return valorFactura;
    }

    public void establecerValorFactura(double valorFactura) {
        this.valorFactura = valorFactura;
    }

    public double obtenerIvaDescuento() {
        return ivaDescuento;
    }

    public void establecerIvaDescuento(double ivaDescuento) {
        this.ivaDescuento = ivaDescuento;
    }

    public double obtenerValorCancelar() {
        return valorCancelar;
    }

    public void establecerValorCancelar(double valorCancelar) {
        this.valorCancelar = valorFactura - ((valorFactura * ivaDescuento) /100);
    }

    @Override
    public String toString() {
        String reporte;

        reporte = String.format("\t\t--REPORTE DOCENTE--\n"
                + "\t Nombre Docente: %s\n"
                + "\t Identificación Docente: %s\n"
                + "\t Valor de la Factura: %.2f\n"
                + "\t Valor del Iva Descuento: %.2f\n"
                + "\t Valor total a Cancelar: %.2f\n",
                 obtenerNombre(),
                 obtenerCedula(),
                 obtenerValorFactura(),
                 obtenerIvaDescuento(),
                 obtenerValorCancelar());
        return reporte;

    }

}
