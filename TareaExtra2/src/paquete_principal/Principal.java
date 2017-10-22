/* Tarea Extraclase:
 * Programa para presentar informe en Universidad
 * Utilizar paquetes, clases, metodos, atributos e imprima el informe tal como se pide.
 * Autor: Alejandro Fuertes
 * Fecha: 22/10/2017
 */
package paquete_principal;

//Importamos paquetes para tener acceso a metodos.
import paquete_general.Pais;
import paquete_academico.*;
import paquete_estudiante.Estudiante;

public class Principal {

    //Metodo principal desde donde se ejecutara el programa.
    public static void main(String[] Args) {

        //Declaramos los objetos
        Pais pai = new Pais();
        Pais pai1 = new Pais();
        Pais pai2 = new Pais();
        Docente doc = new Docente();
        Docente doc2 = new Docente();
        Carrera car = new Carrera();
        Carrera car2 = new Carrera();
        Asignatura asi = new Asignatura();
        Asignatura asi2 = new Asignatura();
        Universidad uni = new Universidad();
        Estudiante est1 = new Estudiante();
        Estudiante est2 = new Estudiante();

        //Llamamos a los metodos y les enviamos los valores.
        pai.set_name("Ecuador");
        pai1.set_name("Colombia");
        pai2.set_name("Peru");
        doc.set_name("Mario");
        doc.set_srname("Alcivar");
        doc.set_pais(pai);
        doc2.set_name("Maria");
        doc2.set_srname("Ruiz");
        doc2.set_pais(pai2);
        car.set_name("Sistemas");
        car.set_mod("presecial");
        car2.set_name("Sistemas");
        car2.set_mod("presecial");
        asi.set_name("Matematicas");
        asi.set_cred(10);
        asi.set_carr(car);
        asi.set_doc(doc);
        asi2.set_name("Fisica");
        asi2.set_cred(8);
        asi2.set_carr(car2);
        asi2.set_doc(doc2);
        uni.set_name("Universidad Tecnica Particular de Loja");
        uni.set_siglas("UTPL");
        uni.set_pais(pai);
        est1.set_name("Luis V");
        est1.set_srname("Perez J");
        est1.set_asig_1(asi);
        est1.set_asig_2(asi2);
        est1.set_uni(uni);

        //Imprimimos datos del estudiante 1
        System.out.print(est1);

        //Llamamos a los metodos y les enviamos los valores.
        pai.set_name("Ecuador");
        pai1.set_name("Venezuela");
        pai2.set_name("Peru");
        doc.set_name("Luis");
        doc.set_srname("Armijos");
        doc.set_pais(pai);
        doc2.set_name("Maria");
        doc2.set_srname("Ruiz");
        doc2.set_pais(pai2);
        car.set_name("Ingenieria Quimica");
        car.set_mod("presecial");
        car2.set_name("Ingenieria Quimica");
        car2.set_mod("presecial");
        asi.set_name("Biologia");
        asi.set_cred(9);
        asi.set_carr(car);
        asi.set_doc(doc);
        asi2.set_name("Fisica");
        asi2.set_cred(7);
        asi2.set_carr(car2);
        asi2.set_doc(doc2);
        uni.set_name("Universidad Tecnica Equinoccial");
        uni.set_siglas("UTE");
        uni.set_pais(pai);
        est2.set_name("Ana");
        est2.set_srname("Lima J");
        est2.set_asig_1(asi);
        est2.set_asig_2(asi2);
        est2.set_uni(uni);

        //Imprimimos datos del estudiante 2
        System.out.print(est2);
    }

}
