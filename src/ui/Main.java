/* 
entradas:
name - String : le pide el nombre de usuario al cliente
idTarget - String : le pide la identificacion o cedula al usuarip
option - int : resive la opcion u operacion a realizar a preferencia del usuario
money - double : resive el gasto que el usuario quiere registrar

salidas:
gastosnum - double : da como resultado la suma de todos los gastos registrados por el usuario
promedio - double : da el promedio total de todos los gastos registrados por el usuario

Descripcion: se realiza un programa de ahorro que interactua con el usuario, a traves de un menu interactivo, que incluye algunas opciones fundamentales.
Tales como el registro de usuario, que pide el nombre y la cedula, registrar los gastos necesarios por el usuario. Se creo un arreglo de espacio 10, que 
obtendra los datos requeridos. Por otro lado el usuario podra elegir como opcion el valor total de gastos, que le permitira conocer a medida que agrega
datos consultar el valor total gastado, con esta informacion podra ademas saber el promedio de los gastos introducidos dentro del rango.

El programa permitira reconocer las diferente clases creadas dentro de el, para asi conocer los datos pertinentes, relacionados a objetos, metodos y atributos
*/ 

package ui;
import java.util.Scanner;
import model.Menu;
import model.Usuario;

//clase main
public class Main{
    Scanner reader=new Scanner(System.in);
    Usuario usuario;
    //clase principal
    public static void main(String[] arg){
        Menu menu = new Menu();
        System.out.println("");
        System.out.println("Bienvenido sistema de ahorro");
        menu.opciones();
        
    }
    
    //metodo creacion del usuario. Informacion
    public void createPersons(){
        String name;
        String idTarget;
        System.out.println("");
        System.out.println("Type of name");
        name=reader.next();
        System.out.println("Type of id target");
        idTarget=reader.next();

        usuario = new Usuario(name, idTarget);

        System.out.println("");
        System.out.println("- Bienvenido: "+name);
    }
}