public class Aguila extends Vertebrado{

    @Override
    public String comer() {
        return "Aguila comiendo";
    }

    @Override
    public String desplazar() {
        return "volando";
    }

    @Override
    public String sonido() {
        return "sonido de aguila";
    }

    @Override
    protected String correr() {
        return "aguila corre poquito";
    }

    @Override
    protected String respirar() {
        return "aguila respirando";
    }
}
