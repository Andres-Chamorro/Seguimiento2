package model;
public class Usuario{
    private String name;
    private String idTarget;
    private Gasto gasto;

    public Usuario(String name, String idTarget){
        this.name= name;
        this.idTarget=idTarget;
        this.gasto = new Gasto();

    }
    public String getName(){
        return name;
    }
    public String getIdTarget(){
        return idTarget;
    }
    
    public void registrarGasto(double gasto) {
        Gasto gastoUsuario = new Gasto();
        gastoUsuario.valorGastos(gasto);
    }

    public void obtenerGastoTotal() {
        this.gasto.gastoTotal();
    }

}