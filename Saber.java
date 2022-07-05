public class Saber extends Weapons {
    public Saber() {
        super();
    }

    // Metodos
    public void slash() {
        System.out.println(super.getDescricao() + " Cortou - Dano ->" + super.getDano());
    }
    // Fim metodos
}
