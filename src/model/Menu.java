package model;
import java.util.Scanner;
import ui.Main;

//creacion de la clase menu
public class Menu{
    //se crea una instancia de la clase gasto
    private Gasto registro;
    private Scanner reader=new Scanner(System.in);

    //creacion del metodo constructor a traves del objeto registro
    public Menu(){
        registro = new Gasto();
    }
    //metodo de opciones a elegir hasta que el usuario quiera salir
    public void opciones(){
        int option=0;
        do{
            System.out.println("");
            System.out.println("--------Menu---------");
            System.out.println("1.Registrar usuario");
            System.out.println("2.Registrar un gasto");
            System.out.println("3.Ver total de gastos");
            System.out.println("4.Ver gasto promedio");
            System.out.println("5.Salir");
            option=reader.nextInt();

            switch(option){

                case 1:
                   Main usuario = new Main();
                   usuario.createPersons();
                   break;
                case 2:
                  registroGasto();
                  break;
                case 3:
                  totalGast();
                  break;
                case 4:
                  promedioGasto();
                  break;
                case 5:
                  System.out.println("");
                  System.out.println("'Salio exitosamente'");
                  break;
                default:
                  System.out.println("");
                  System.out.println("'Funcion no valida'");
                  break;

            }

        }while(option!=5);
    }
    //metodo de registro de los gastos a introducir asociado con la clase gasto
    private void registroGasto(){
        System.out.println("");
        System.out.println("Ingrese un gasto");
        double money = reader.nextDouble();
        registro.valorGastos(money);
        System.out.println("");
    }
    //metodo que retoma el gasto total de todos los gastos
    public void totalGast(){
        registro.gastoTotal();
    }
    //metodo del promedio de todos los gastos
    public void promedioGasto(){
        registro.gastoPromedio();
    }

}