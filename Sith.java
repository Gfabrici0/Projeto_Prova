import java.util.ArrayList;

public class Sith implements Force {
    private String nome;
    private String titulo;
    private ArrayList<Weapons> weapons;

    // Constructor
    public Sith() {
        this.weapons = new ArrayList<Weapons>();
    }

    public Sith(String nome, String titulo) {
        this.nome = nome;
        this.titulo = titulo;
    }

    // Getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public ArrayList<Weapons> getWeapons() {
        return weapons;
    }

    public void setWeapons(ArrayList<Weapons> weapons) {
        this.weapons = weapons;
    }
    // Fim getters e setters

    // Metodos
    public void lightning() {
        System.out.println(nome + " -> Lightning.");
    }

    @Override
    public void mindControl() {
        System.out.println(nome + " -> MindControl.");
    }

    @Override
    public void farseeing() {
        System.out.println(nome + " -> Farseeing.");
    }

    @Override
    public void telepathy() {
        System.out.println(nome + " -> Telepathy.");
    }

    @Override
    public void levitation() {
        System.out.println(nome + " -> Levitating Something.");
    }

    public void drop(Weapons weapons) {
        this.weapons.remove(weapons);
        System.out.println(nome + " dropa " + weapons.getDescricao());
    }

    public void pickUp(Weapons weapons) {
        this.weapons.add(weapons);
        System.out.println(nome + " recebe " + weapons.getDescricao());
    }

    public void mostraArmas() {
        System.out.println("\n" + nome + " possui:");
        for (int i = 0; i < getWeapons().size(); i++) {
            System.out.println(weapons.get(i).getDescricao());
        }
    }

    // Fim metodos

}
