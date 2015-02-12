/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compilador;

import java.io.BufferedWriter;
import java_cup.runtime.Symbol;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author KathyR
 */
public class Compilador {

    static boolean do_debug_parse = false;

    public static void main(String[] args) {
        // GENERAR ARCHIVO YYLEX
//        String path="src"+File.separator+"compilador"+File.separator+"Lexer_1.flex";
//        generarLexer(path);
//
//        // GENERAR ARCHIVO PARSER Y SYM
//        String opciones[] = new String[5];
//        opciones[0] = "-destdir";
//        opciones[1] = "src"+File.separator+"compilador";
//        opciones[2] = "-parser";
//        opciones[3] = "parser";
//        opciones[4] = "src"+File.separator+"compilador"+File.separator+"ACup.cup";
//        try {
//            java_cup.Main.main(opciones);
//        } catch (Exception e) {System.out.print(e);}
//        
        // COMPROBAR COMPILADOR
        try {
            PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("entrada.txt")));
            Scanner sc = new Scanner(System.in);
//            System.out.println("INGRESE SENTENCIA: ");
            System.out.println("INGRESE SENTENCIA (S)= SALIR: ");
            String entrada = sc.nextLine();
            while(!entrada.equals("S")){
                pw.print(entrada);
                System.out.println("INGRESE SENTENCIA (S)= SALIR: ");
                entrada = sc.nextLine();
            }
            pw.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            parser p = new parser(new Yylex(new java.io.InputStreamReader(new FileInputStream("entrada.txt"))));
            p.parse();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void generarLexer(String path) {
        File file = new File(path);
        jflex.Main.generate(file);
    }
}
