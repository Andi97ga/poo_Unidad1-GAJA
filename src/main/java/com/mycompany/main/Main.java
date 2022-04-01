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
        
        var n2 = new Gato();
        n2.nombre="Gordo lui";
        System.out.println("El gato se llama: "+n2.nombre);
        var r2 = new Gato();
        r2.raza="Singapura";
        System.out.println("LA RAZA DEL GATO ES: "+r2.raza);
       var e2 = new Gato();
        e2.edad=5;
        System.out.println("LA EDAD DEL GATO ES: "+e2.edad+ " años");
        var p2 = new Gato();
        p2.peso= 9;
        System.out.println("EL PESO DEL GATO ES: "+p2.peso+ " kg");
        
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
        
         var m2 = new Zapato();
        m2.marca="Vans";
        System.out.println("LA MARCA DEL ZAPATO ES: "+m2.marca);
        var c2 = new Zapato();
        c2.color="blanco";
        System.out.println("EL COLOR DEL ZAPATO ES: "+c2.color);
       var T2 = new Zapato();
        T2.talla=40;
        System.out.println("LA TALLA DEL ZAPATO ES: "+T2.talla);
        var pr2 = new Zapato();
        pr2.precio= 80;
        System.out.println("EL PRECIO DEL PAR ES: "+pr2.precio+ " $");
        
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
        
        var c12= new Cliente();
       c12.nombres="Juan";
        System.out.println("Nombre: "+c12.nombres);
        var a2 = new Cliente();
        a2.apellidos="Jara";
        System.out.println("Apellidos: "+a2.apellidos);
       var d2 = new Cliente();
        d2.edad=40;
        System.out.println("La edad del cliente es: "+d.edad+ "años");
        var dr2 = new Cliente();
        dr2.direccion = "9 de octubre";
        System.out.println("La direccion es: "+dr2.direccion);
        
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
        nd.nombreConsencionario  = "Hyuandai";
        System.out.println("El nombre de la Consencionaria es: "+nd.nombreConsencionario );
        
        var car2= new carro();
       car2.marca="Hyundai";
        System.out.println("Marca: "+car2.marca);
        var model2 = new carro();
        model2.modelo="i10";
        System.out.println("Modelo: "+model2.modelo);
       var anio2 = new carro();
        anio2.año=2021;
        System.out.println("El año del carro es: "+anio2.año);
        var nd2 = new carro();
        nd2.nombreConsencionario  = "Hyuandai";
        System.out.println("El nombre de la Consencionaria es: "+nd2.nombreConsencionario );
        //////////////////////Computadora////////////////////////
        var marc= new Computadora();
       marc.marca="Lenovo";
        System.out.println("Marca: "+marc.marca);
        var mod = new Computadora();
        mod.modelo="Lenovo_yoga";
        System.out.println("Modelo: "+mod.modelo);
       var cap = new Computadora();
        cap.capacidad=16;
        System.out.println("La capacidad de la computadora es de: "+cap.capacidad+ "GB");
        var gen = new Computadora();
        gen.generacion  = 7;
        System.out.println("El nombre de la Consencionaria es: "+gen.generacion+"ma"  );
        
        var marc2= new Computadora();
       marc2.marca="HP";
        System.out.println("Marca: "+marc2.marca);
        var mod2 = new Computadora();
        mod2.modelo="Gammer";
        System.out.println("Modelo: "+mod2.modelo);
       var cap2 = new Computadora();
        cap2.capacidad=16;
        System.out.println("La capacidad de la computadora es de: "+cap2.capacidad+ "Gb");
        var gen2 = new Computadora();
        gen2.generacion  = 9;
        System.out.println("El nombre de la Consencionaria es: "+gen2.generacion+"ma"  );
         
    }
}
