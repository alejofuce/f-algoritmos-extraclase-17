/*
 * Solucion de problematica planteada por el tutor
 * Puede crear clases, atributos, metodos, objetos como sea necesario.
 * Subir la solucion al repositorio de GitHub
 */

/**
 *
 * @author Alejandro Fuertes
 */
public class Principal {
    
    //El metodo main es el principal desde donde ejecutaremos nuestro programa.
    public static void main(String[] args) {
        
        // A continuacion declaramos los objetos, en este caso dos debido al problema.
        Asignatura asig = new Asignatura();
        Asignatura asig2 = new Asignatura();
        Docente doce = new Docente();
        Docente doce2 = new Docente();
        Titulo titu = new Titulo();
        Titulo titu2 = new Titulo();
        
        // Invocamos a los metodos necesarios y les enviamos elementos para su uso
        asig.establecer_nombre_asig1("Matematicas");
        asig.establecer_num_cred1(8);
        asig.establecer_nombre_asig2("Fisica");
        asig.establecer_num_cred2(6);
        doce.establecer_nombre_doce("Luis V");
        doce.establecer_ape_doce("Perez J");
        doce.establecer_3t("Licenciado");
        doce.establecer_4t("Magister");
        doce.establecer_asig1("Fisico Matematicas");
        doce.establecer_asig2("Docencia Matematica");
        titu.establecer_nom_uni("Universidad Politecnica");
        titu.establecer_nom_uni2("Universidad Valenciana");
        titu.establecer_nom_tit("Licenciado");
        titu.establecer_nom_tit2("Magister");
        titu.establecer_nom_car("Fisico Matematicas");
        titu.establecer_nom_car2("Docencia Matematica");
        
        //Presentamos en pantalla el resultado final
        System.out.print(doce);
        System.out.print(asig);
        System.out.print(titu);
        
        //// Invocamos a los metodos necesarios y les enviamos elementos para su uso
        asig2.establecer_nombre_asig1("Sociales");
        asig2.establecer_num_cred1(9);
        asig2.establecer_nombre_asig2("Literatura");
        asig2.establecer_num_cred2(10);
        doce2.establecer_nombre_doce("Ana M.");
        doce2.establecer_ape_doce("Velez P.");
        doce2.establecer_3t("licenciado");
        doce2.establecer_4t("Magister");
        doce2.establecer_asig1("Ciencias Sociales");
        doce2.establecer_asig2("Docencia Social");
        titu2.establecer_nom_uni("Universidad Saleciana");
        titu2.establecer_nom_uni2("Universidad Catalunia");
        titu2.establecer_nom_tit("Licenciado");
        titu2.establecer_nom_tit2("Magister");
        titu2.establecer_nom_car("Ciencias Sociales");
        titu2.establecer_nom_car2("Docencia Social");
        
        //Presentamos en pantalla el resultado final
        System.out.print(doce2);
        System.out.print(asig2);
        System.out.print(titu2);  
    }
    
}
