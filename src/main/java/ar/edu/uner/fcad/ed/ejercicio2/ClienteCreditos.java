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
        try {
        CreditoAdmin Creditos = new CreditoAdmin();
        Credito devolver = new Credito();
  
        Credito credito1 = new Credito(1, new CreditoTipo("Prestamo", 2000.00, 10000.50, 1, 3, ClienteTipoEnum.PERSONA, 2.5),new Cliente("Altamirano", "Daniel", 42355537, ClienteTipoEnum.PERSONA), 8500.00, 5,new Sucursal("Sucursal 1"),devolver.getTotalDevolver());
        Credito credito3 = new Credito(3, new CreditoTipo("Prestamo", 1000.0, 200.0, 1, 3, ClienteTipoEnum.COMERCIO, 10.5), new Cliente("Ginobili", "Emanuel", 123124213, ClienteTipoEnum.COMERCIO), 1000.0, 5, new Sucursal("Sucursal 2"),devolver.getTotalDevolver());
        Credito credito4 = new Credito(4, new CreditoTipo("Prestamo", 4500.00, 10000.50, 1, 3, ClienteTipoEnum.EMPRESADECONSTRUCCION, 15.0),new Cliente("Alcaraz", "Juan", 23617421, ClienteTipoEnum.EMPRESADECONSTRUCCION), 10000000.00, 5,new Sucursal("Sucursal 3"),devolver.getTotalDevolver());
        Credito credito2 = new Credito(2, new CreditoTipo("Prestamo", 7800.00, 10000.50, 1, 3, ClienteTipoEnum.PERSONA, 2.50),new Cliente("Federer", "Roger", 12364521, ClienteTipoEnum.PERSONA), 20500.00, 5,new Sucursal("Sucursal 1"),devolver.getTotalDevolver());
        Credito credito5 = new Credito(5, new CreditoTipo("Prestamo", 9100.00, 10000.50, 1, 3, ClienteTipoEnum.PERSONA, 2.50),new Cliente("Del Potro", "Juan Martin", 24357537, ClienteTipoEnum.PERSONA), 18500.00, 5,new Sucursal("Sucursal 5"),devolver.getTotalDevolver());
        Credito credito6 = new Credito(6, new CreditoTipo("Prestamo", 3900.00, 10000.50, 1, 3, ClienteTipoEnum.COMERCIO, 2.50),new Cliente("Pedro", "Juan", 24357537, ClienteTipoEnum.COMERCIO), 18500.00, 5,new Sucursal("Sucursal 2"),devolver.getTotalDevolver());

        Creditos.add(credito1);
        Creditos.add(credito4);
        Creditos.add(credito5);
        Creditos.add(credito2);
        Creditos.add(credito3);
        Creditos.add(credito6);

        System.out.println(Creditos.size());
        System.out.println(Creditos.get(2));
        System.out.println("Removiendo un elemento");
        Creditos.remove(2);
        System.out.println(Creditos.toString());
        System.out.println("Filtrado por tipo de Cliente");
        System.out.println(Creditos.creditosPorClienteTipo(ClienteTipoEnum.PERSONA));
        System.out.println("Filtrado por tipo de Credito y Sucursal");
        System.out.println(Creditos.creditosPorCreditoTipoySucursal(new CreditoTipo("Prestamo", 4500.00, 10000.50, 1, 3, ClienteTipoEnum.EMPRESADECONSTRUCCION, 15.0),new Sucursal("Sucursal 3")));
        System.out.println("Creditos inferiores a: 5000");
        System.out.println(Creditos.creditosInferioresA(5000.00));
        System.out.println("Creditos superiores a: 50000");
        System.out.println(Creditos.creditosSuperioresA(50000.00));
        System.out.println("Ordenados por numero de credito");
        Creditos.ordenar();
        System.out.println(Creditos);

        Creditos.creditosInferioresA(0);
        
        System.out.println("Ordenados por Total a devolver");
        Creditos.ordenar(new ClientesDevolverComparator());
        System.out.println(Creditos);
        } catch (Exception e) {
        
    }
}
}
