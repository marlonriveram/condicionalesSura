package org.example;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {

        Scanner entradaTeclado=new Scanner(System.in);

        int anioNacimientoCliente;
        int anioActual;
        String nombresCompletosCliente;
        double salarioCliente;
        String licorFavoritoCLiente;
        String cantanteFavoritoCliente;
        double valorIva;
        byte numeroMesa;
        double valorDescuento;

        //ASIGNANDO VARIABLES
        System.out.print("Digita tus nombres y apellidos");
        nombresCompletosCliente=entradaTeclado.nextLine();

        System.out.print("Digita tu licor favorito: ");
        licorFavoritoCLiente=entradaTeclado.nextLine();

        System.out.print("Digita tu cantante favorito: ");
        cantanteFavoritoCliente=entradaTeclado.nextLine();


        System.out.print("Digite su año de nacimiento: ");
        anioNacimientoCliente=entradaTeclado.nextInt();

        System.out.print("Digite el año actual: ");
        anioActual=entradaTeclado.nextInt();

        System.out.print("Digita el salario del cliente: ");
        salarioCliente=entradaTeclado.nextInt();



        System.out.print("Valor del IVA: ");
        valorIva=entradaTeclado.nextDouble();

        System.out.print("valor del descuento: ");
        valorDescuento=entradaTeclado.nextDouble();

        System.out.print("Numero de la mesa del cliente: ");
        numeroMesa=entradaTeclado.nextByte();

        // CALCULAR EDAD CLIENTE
        // PROCESOS DEL ALGORIMO

        //1. CALCULAR LA EDAD DEL USUARIO
        int edadUsuario = anioActual-anioNacimientoCliente;
        System.out.println("Apreciado " + nombresCompletosCliente + " usted tiene : " + edadUsuario + " años");

        //2.COMPARAR Y DECIR EL SALARIO
        final double valorSalarioMin = 1300000; // final deja el valor const que no se puede modificar despues

        double numeroSalarios = salarioCliente/valorSalarioMin;

        // Redondear un numero decimal Forma
        BigDecimal redondeado = new BigDecimal(numeroSalarios);
        redondeado = redondeado.setScale(2, RoundingMode.HALF_UP);

        // Redondear un numero decimal Forma 2
        String redondeado2 = String.format("%.2f",numeroSalarios);


        System.out.println("Usted gana :" + redondeado2 + " SMLV");

        // condicion logica para validar si hay platica

        if(numeroSalarios >= 3.0){
            System.out.println("BIENVENIDO PUEDES ENTRAR\n");
        }else{
            System.out.println("LOSIENTO ERES MUY POBRE PARA ENTRAR A ESTA DISCOTECA");
        };


    }
}