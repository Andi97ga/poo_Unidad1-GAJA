/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.main;

/**
 *
 * @author PC-18
 */
public class Main {

    public static void main(String[] args) {
        ///////GATO///////////
        var n = new Gato();
        n.nombre="Zeus";
        System.out.println("El gato se llama: "+n.nombre);
        var r = new Gato();
        r.raza="Singapura";
        System.out.println("LA RAZA DEL GATO ES: "+r.raza);
       var e = new Gato();
        e.edad=8;
        System.out.println("LA EDAD DEL GATO ES: "+e.edad+ " años");
        var p = new Gato();
        p.peso= 10;
        System.out.println("EL PESO DEL GATO ES: "+p.peso+ " kg");
        
        ///////ZAPATO///////////
        var m = new Zapato();
        m.marca="Adidas";
        System.out.println("LA MARCA DEL ZAPATO ES: "+m.marca);
        var c = new Zapato();
        c.color="negro";
        System.out.println("EL COLOR DEL ZAPATO ES: "+c.color);
       var T = new Zapato();
        T.talla=38;
        System.out.println("LA TALLA DEL ZAPATO ES: "+T.talla);
        var pr = new Zapato();
        pr.precio= 100;
        System.out.println("EL PRECIO DEL PAR ES: "+pr.precio+ " $");
        
        /////////Cliente///////////
        var c1= new Cliente();
       c1.nombres="Pepe";
        System.out.println("Nombre: "+c1.nombres);
        var a = new Cliente();
        a.apellidos="Chupin Polaco";
        System.out.println("Apellidos: "+a.apellidos);
       var d = new Cliente();
        d.edad=38;
        System.out.println("La edad del cliente es: "+d.edad+ "años");
        var dr = new Cliente();
        dr.direccion = "Avenida de las Americas, frente al punto";
        System.out.println("La direccion es: "+dr.direccion);
        ////////////CARRO////
        var car= new carro();
       car.marca="Hyundai";
        System.out.println("Marca: "+car.marca);
        var model = new carro();
        model.modelo="Sonata";
        System.out.println("Modelo: "+model.modelo);
       var anio = new carro();
        anio.año=2015;
        System.out.println("El año del carro es: "+anio.año);
        var nd = new carro();
        nd.nombreConsencionario  = "Metrocar";
        System.out.println("El nombre de la Consencionaria es: "+nd.nombreConsencionario );
        //////////////////////Computadora////////////////////////
        var car= new Computadora();
       car.marca="Hyundai";
        System.out.println("Marca: "+car.marca);
        var model = new Computadora();
        model.modelo="Sonata";
        System.out.println("Modelo: "+model.modelo);
       var anio = new Computadora();
        anio.año=2015;
        System.out.println("El año del carro es: "+anio.año);
        var nd = new Computadora();
        nd.nombreConsencionario  = "Metrocar";
        System.out.println("El nombre de la Consencionaria es: "+nd.nombreConsencionario );
        
        
    }
}
