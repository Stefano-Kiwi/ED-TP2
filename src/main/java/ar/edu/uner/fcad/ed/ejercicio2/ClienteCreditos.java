/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.edu.uner.fcad.ed.ejercicio2;

/**
 *
 * @author David Zarcó
 */
public class ClienteCreditos {
    public static void main(String[] args) {
        CreditoAdmin Creditos = new CreditoAdmin();
        Credito devolver = new Credito();
       

        
        Credito credito1 = new Credito(1, new CreditoTipo("Prestamo", 2000.00, 10000.50, 1, 3, ClienteTipoEnum.PERSONA, 2.50),new Cliente("Altamirano", "Daniel", 42355537, ClienteTipoEnum.PERSONA), 8500.00, 5,new Sucursal("Sucursal 1"),devolver.getTotalesDevolver());
        System.out.println(credito1);
        System.out.println(devolver.getTotalesDevolver());
        
        Credito credito2 = new Credito();
    }
}
