
public class Main {
    public static void main(String[] args) {
        Perro firulais = new Perro("Firulais", 2, 4);
        Perro canelo = new Perro();

        canelo.setNombre("Canelo");

        System.out.println("nombre del perro : "+ canelo.getNombre());
        System.out.println("nombre del perro : "+ firulais.getNombre());

        System.out.println(firulais.comer());

        firulais.setCantidadDeVacunas(1);
        System.out.println("cantidad de vacunas: "+firulais.getCantidadDeVacunas());


        System.out.println(firulais.sonido());
    }
}