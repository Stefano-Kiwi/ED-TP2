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
        Credito devolver = new Credito();
        CreditoAdmin Creditos = new CreditoAdmin();

        Credito credito1 = new Credito(1, new CreditoTipo("Prestamo", 10000.00, 100000.00, 1, 3, ClienteTipoEnum.PERSONA, 2.5),new Cliente("Altamirano", "Daniel", 42355537, ClienteTipoEnum.PERSONA), 10500.00, 5,new Sucursal("Sucursal 1"),devolver.getTotalDevolver());
        Credito credito3 = new Credito(3, new CreditoTipo("Prestamo", 20000.00, 200000.0, 1, 4, ClienteTipoEnum.COMERCIO, 10.5), new Cliente("Ginobili", "Emanuel", 23124213, ClienteTipoEnum.COMERCIO), 21500.0, 5, new Sucursal("Sucursal 2"),devolver.getTotalDevolver());
        Credito credito4 = new Credito(4, new CreditoTipo("Prestamo", 100000.00, 100000000.00, 1, 6, ClienteTipoEnum.EMPRESADECONSTRUCCION, 15.0),new Cliente("Alcaraz", "Juan", 33617421, ClienteTipoEnum.EMPRESADECONSTRUCCION), 10000000.00, 5,new Sucursal("Sucursal 3"),devolver.getTotalDevolver());
        Credito credito2 = new Credito(2, new CreditoTipo("Prestamo", 10000.00, 100000.0, 1, 3, ClienteTipoEnum.PERSONA, 2.50),new Cliente("Federer", "Roger", 12345678, ClienteTipoEnum.PERSONA), 20500.00, 5,new Sucursal("Sucursal 1"),devolver.getTotalDevolver());
        Credito credito5 = new Credito(5, new CreditoTipo("Prestamo", 10000.00, 100000.0, 1, 3, ClienteTipoEnum.PERSONA, 2.50),new Cliente("Del Potro", "Juan Martin", 34357537, ClienteTipoEnum.PERSONA), 18500.00, 5,new Sucursal("Sucursal 5"),devolver.getTotalDevolver());
        Credito credito6 = new Credito(6, new CreditoTipo("Prestamo", 20000.00, 200000.0, 1, 4, ClienteTipoEnum.COMERCIO, 2.50),new Cliente("Pedro", "Juan", 54357537, ClienteTipoEnum.COMERCIO), 28500.00, 5,new Sucursal("Sucursal 2"),devolver.getTotalDevolver());

        Creditos.add(credito1);
        Creditos.add(credito4);
        Creditos.add(credito5);
        Creditos.add(credito2);
        Creditos.add(credito3);
        Creditos.add(credito6);

        System.out.println("Tamaño de la lista: "+Creditos.size());
        System.out.println("Credito por posicion 2:");
        System.out.println(Creditos.get(2));
        System.out.println("Removiendo un elemento");
        Creditos.remove(2);
        System.out.println(Creditos.toString());
        System.out.println("Filtrado por tipo de Cliente");
        System.out.println(Creditos.creditosPorClienteTipo(ClienteTipoEnum.PERSONA));
        System.out.println("Filtrado por tipo de Credito y Sucursal");
        System.out.println(Creditos.creditosPorCreditoTipoySucursal(new CreditoTipo("Prestamo", 10000.00, 100000.00, 1, 3, ClienteTipoEnum.PERSONA, 2.5),new Sucursal("Sucursal 1")));
        System.out.println("Creditos inferiores a: 20000");
        System.out.println(Creditos.creditosInferioresA(20000.00));
        System.out.println("Creditos superiores a: 50000");
        System.out.println(Creditos.creditosSuperioresA(50000.00));
        System.out.println("Ordenados por numero de credito");
        Creditos.ordenar();
        System.out.println(Creditos);

        Creditos.creditosInferioresA(0);
        
        System.out.println("Ordenados por Total a devolver");
        Creditos.ordenar(new ClientesDevolverComparator());
        System.out.println(Creditos);
       System.out.println("Ordenados por DNI de Clientes");
        Creditos.ordenar(new ClientesPorDocumento());
        System.out.println(Creditos);

        } catch (Exception exc) {
            System.out.println(exc.toString());
        }//final del catch
    }//final del main
}//final de la clase
