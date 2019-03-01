/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplomap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;
import javax.swing.JOptionPane;
import modelo.Cliente;
import modelo.FileXML;

/**
 *
 * @author ricky.mosquera
 */
public class EjemploMap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedList<Cliente> listaC = new LinkedList<>();
        LinkedList<Cliente> listaC2 = new LinkedList<>();
        Map<Integer, LinkedList<Cliente>> map1 = new HashMap<>();

     
        listaC.add(new Cliente("Ricky", "1140", "UAO"));
        listaC.add(new Cliente("Sofia", "1131", "Tigo"));
        listaC.add(new Cliente("Marco", "1122", "Sura"));
        listaC.add(new Cliente("David", "1133", "herbalife"));
        
        map1.put(3, listaC);
        
        listaC2.add(new Cliente("Carlos", "1140", "Campo"));
        listaC2.add(new Cliente("Antonio", "1131", "Casa"));
        listaC2.add(new Cliente("Alejandro", "1122", "Emcali"));
        listaC2.add(new Cliente("Orlando", "1133", "Javeriana"));
        
        map1.put(33, listaC2);

        Map<Integer,Cliente> map2 = new LinkedHashMap<>();
        Map<Integer,Cliente> map3 = new TreeMap<>();
        
//        map1.put(55, new Cliente("Ricky", "1140", "UAO"));
//        map1.put(4, new Cliente("Sofia", "1131", "Tigo"));
//        map1.put(78, new Cliente("Marco", "1122", "Sura"));
//        map1.put(5, new Cliente("David", "1133", "herbalife"));
//        
//        map2.put(55, new Cliente("Ricky", "1140", "UAO"));
//        map2.put(4, new Cliente("Sofia", "1131", "Tigo"));
//        map2.put(78, new Cliente("Marco", "1122", "Sura"));
//        map2.put(5, new Cliente("David", "1133", "herbalife"));
//        
//        map3.put(55, new Cliente("Ricky", "1140", "UAO"));
//        map3.put(4, new Cliente("Sofia", "1131", "Tigo"));
//        map3.put(78, new Cliente("Marco", "1122", "Sura"));
//        map3.put(5, new Cliente("David", "1133", "herbalife"));
        
       String m1 = mostrarDatosMap(map1);
//        String m2 = mostrarDatosMap(map2);
//        String m3 = mostrarDatosMap(map3);
        System.out.println(m1);
//        System.out.println("____________________");
//        System.out.println(m2);
//        System.out.println("____________________");
//        System.out.println(m3);
//        System.out.println("____________________");

boolean t =FileXML.crearArchivoXML(map1);
if (t){
    JOptionPane.showMessageDialog(null, "Archivo creado con exito");
}
    }
    
    public static String mostrarDatosMap(Map<Integer,LinkedList<Cliente>>m){
        
        String mostrar = "";
        
        Iterator<Map.Entry<Integer,LinkedList<Cliente>>> it = m.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry<Integer,LinkedList<Cliente>> pair = it.next();
            mostrar+=pair.getKey()+"\n";
            for(int i=0; i<pair.getValue().size();i++){
                mostrar+=pair.getValue().get(i)+"\n";
            }
        }
        return mostrar;
    }

    
}
