
package kata3;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Kata3 {
    //REPASANDO HASHMAPS
    private HashMap<String, Integer> domainMap;
    
    public void execute(String filename) throws FileNotFoundException, IOException{
       
        domainMap = new HashMap<>();  
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        while(true){
            String mail = reader.readLine();
            if (mail==null) break;
            String domain = mail.split("@")[1].toLowerCase(); // abria que elegir el archivo en el que estan los correos como atributo 
            if(domainMap.containsKey(domain))
                domainMap.put(domain, domainMap.get(domain) + 1);
            else
                domainMap.put(domain, 1);
        }
        /*
         a.put("hotmail.com", 8)
         a.get("hotmail.com")
         a.get("hola") --> ERROR
         a.containsKey("hola") = FALSE
         a.containsKey("hotmail.com") = TRUE
         KeySet = conjunto de claves
         */
        for (String domain : domainMap.keySet()) {
            System.out.println(domain + " = " + domainMap.get(domain));
        }
    }
    
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
       //Repasando HashMap
        Kata3 kata = new Kata3();
        kata.execute(args[0]);
        
        /* File[] roots = File.listRoots();
        File c = roots[1];
        File[] files = c.listFiles();
        
        for (File file : roots) {
            System.out.println(file.getName() + " isHidden:" + file.isHidden() + "isDirectory" + file.isDirectory());
        }*/
           
     /*   
        File file = new File("C:/Users/clocal/Downloads/"  );// /prueba.txt
        System.out.println(file.exists());
        file.mkdir();
        System.out.println(file.exists());
        file.mkdirs(); //ruta completa
        System.out.println(file.exists());
        //file.createNewFile(); crea un fichero
        System.out.println(file.exists());
        file.deleteOnExit(); //borra al terminar
      //  File temporalFile = File.createTempFile("test", "data");  archivo temporal
        try{
            Person person = PersonLoader.load(null);
        }
        catch (NullPointerException e){
            System.out.println(e.getMessage());
        }
     */    
        
        // falla y no se xk: BufferedReader reader = new BufferedReader(new InputStreamReader());
        //String line = reader.readLine();
         BufferedInputStream inputStream = 
                 new BufferedInputStream(
                 new FileInputStream(
                 new File("C:/Users/Ayoze/prueba.txt")));
         while(true){
             int data = inputStream.read();
             if(data < 0) break;
             System.out.print((char) data);                 
         }
         //Click derecho en el proyecto, propiedades, run, y en arguements pongo la ruta del archivo
         //para hacerte un software de consola con introducción de parámetros
            
         //Pruebas con UTF8 en sublime
         
         //Sustituir los InputStream por Reader para utilizar readers
         // Reader tiene un metodo .readLine() para leer linea a linea
         
         //Convertir String a Reader = InputStringReader
         
         //Diferencia entre Reader y Stream:
         //Stream lee byte a byte, el reader entiende los formatos de representación del texto
         //Stream te obliga a hacer la conversion a mano
         //Stream para formato binario, Reader para texto
         //InputStreamReader ayuda cuando estas usando Stream y necesitas leer texto, ya que te lo 
         //convierte a Reader 
         
         BufferedReader reader = 
                 new BufferedReader(
                 new InputStreamReader(System.in));
         reader.readLine();
         
         //Ejercicio: Cuantos dominios de Gmail, Yahoo, Hotmail, etc hay en un documento de texto?
         //A correo por línea
         
         String mail = "jose.lopez@gmail.com";
         String domain = mail.split("@")[1].toLowerCase();
         System.out.println(domain);
                     
         
         
    }
}
