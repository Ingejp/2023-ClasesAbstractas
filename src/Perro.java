public class Perro extends Vertebrado {
    private String nombre;
    private int cantidadDeVacunas;

    Perro(){

    }
    Perro(String nombreDelPerro, int cantidadDeOjos, int numeroDePatas){
        this.nombre=nombreDelPerro;
        this.cantidadDeOjos=cantidadDeOjos;
        this.numeroDePatas=numeroDePatas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getCantidadDeVacunas() {
        return cantidadDeVacunas;
    }

    public void setCantidadDeVacunas(int cantidadDeVacunas) {
        this.cantidadDeVacunas = cantidadDeVacunas;
    }

    @Override
    public String comer() {
        return "un perro comiendo";
    }

    @Override
    public String desplazar() {
        return "perro se desplaza";
    }

    @Override
    public String sonido() {
        return "ladrando";
    }

    @Override
    protected String correr() {
        return "perro corriendo";
    }

    @Override
    protected String respirar() {
        return "perro respirando";
    }
}
