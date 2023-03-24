package model;

//clase gasto usuario
public class Gasto{
    //creacion del arreglo de gastos
    double gastos[]=new double[10];
    private String name;
    private String id;
    private double gastosnum=0;
    private int contadorGastos=0;

    //metodo que guarda los 10 gastos introducidos por el usuario
    public void valorGastos(double gasto){
        if(contadorGastos == gastos.length){
            System.out.println("No se pueden agregar mas gastos. Limite alcanzado");
        }else{
            for(int i = 0; i < gastos.length; i++){
                if(gastos[i] == 0){
                    gastos[i] = gasto;
                    contadorGastos++;
                    System.out.println("");
                    System.out.println("'Gasto agregado exitosamente'");
                    break;
                }
                
            }
        }
    }
    //metodo de la suma del gasto total
    public void gastoTotal(){
        for(int i =0; i<gastos.length;i++){
            gastosnum+=gastos[i];
        }
        System.out.println("");
        System.out.println("Total gastos hasta ahora: "+gastosnum);
    }

    //metodo calculo promedio asociado a los gastos
    public void gastoPromedio() {
        double promedio = 0;
        double gastosnum = 0;
        for(int i = 0; i < gastos.length; i++){
            gastosnum += gastos[i];
        }
        if (contadorGastos > 0) {
            promedio = gastosnum / contadorGastos;
            System.out.println("");
            System.out.println("El gasto promedio es: " + promedio);
        } else {
            System.out.println("");
            System.out.println("Aun no se ha ingresado ningun gasto.");
        }
    }

}