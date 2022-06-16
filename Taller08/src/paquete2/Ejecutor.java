/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;
import java.util.Locale;
import java.util.Scanner;
import paquete1.Docente;
import paquete1.DocenteFactura;
import paquete1.DocenteNombramiento;

/**
 *
 * @author reroes
 */
public class Ejecutor {
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
        String mensaje;
        entrada.useLocale(Locale.US);
        System.out.println("\t\tRegistro Docente");
        System.out.println("Ingresar datos docente con nombramiento: [1]\n"
                + "Ingresar datos de Docente Factura:[2]");
        String option =entrada.nextLine();
       
        if (!option.equals("1") && !option.equals("2")) {
            System.out.println("Error, opción no válida");
            // System.exit(0);
        } else {
            System.out.print("Ingrese nombre: ");
            String nombre = entrada.nextLine();

            System.out.print("Ingrese identificación: ");
            String id = entrada.nextLine();
            switch (option) {
                case "1":
                    mensaje = docenteNombramiento(nombre, id);
                    System.out.print(mensaje);
                    break;

                case "2":
                    mensaje = docenteFactura(nombre, id);
                    System.out.print(mensaje);
                    break;
                default:
                    System.out.print("Error, opción no válida");
                    break;
            }
        }
    }

    public static String docenteNombramiento(String a, String b) {
        DocenteNombramiento docente = new DocenteNombramiento();
        Scanner entrada = new Scanner(System.in);
        String cadena;
        System.out.print("Ingrese valor de la factura: ");
        double valorFactura = entrada.nextDouble();
        System.out.print("Ingrese el valor del Iva descuento: ");
        double iva = entrada.nextDouble();
        docente.establecerNombre(a);
        docente.establecerCedula(b);
        docente.establecerIvaDescuento(iva);
        docente.establecerValorFactura(valorFactura);
        docente.establecerValorCancelar(valorFactura);
        cadena = String.format("%s", docente);
        return cadena;
    }

    public static String docenteFactura(String a, String b) {
        DocenteFactura docenteFactura = new DocenteFactura();
        Scanner entrada = new Scanner(System.in);
        String cadena;
        System.out.print("Ingrese el sueldo del Docente: ");
        double sueldo = entrada.nextDouble();
        System.out.print("Ingrese el número de horas extras: ");
        double numHoras = entrada.nextDouble();
        System.out.print("Ingrese el valor de hora extra: ");
        double valorHoraExtra = entrada.nextDouble();
        docenteFactura.establecerNombre(a);
        docenteFactura.establecerCedula(b);
        docenteFactura.establecerValorSueldo(sueldo);
        docenteFactura.establecerNumeroHorasExtra(numHoras);
        docenteFactura.establecerValorHoraExtra(valorHoraExtra);
        docenteFactura.establecerSueldoFinal(sueldo);
        cadena = String.format("%s", docenteFactura);
        return cadena;
    }
    }

