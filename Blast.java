public class Blast extends Weapons {

    public Blast() {
        super();
    }

    // Metodos
    public void shot() {
        System.out.println(super.getDescricao() + " Atira - Dano ->" + super.getDano());
    }
    // Fim metodos
}
