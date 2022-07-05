public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("Leia");
        pessoa1.setSobrenome("Organa");
        pessoa1.setSexo("Feminino");

        Weapons weapon1 = new Weapons();
        weapon1.setDescricao("Sabre de luz azul");
        weapon1.setDano(20);

        Weapons weapon2 = new Weapons();
        weapon2.setDescricao("Sabre de luz vermelho");
        weapon2.setDano(30);

        Weapons weapon3 = new Weapons();
        weapon3.setDescricao("Bastão de luz");
        weapon3.setDano(60);

        Sith sith1 = new Sith();
        sith1.setNome("Darth Vader");
        sith1.setTitulo("Darth");
        sith1.mindControl();
        sith1.levitation();
        sith1.pickUp(weapon2);
        sith1.mostraArmas();

        Jedi jedi1 = new Jedi();
        jedi1.setNome("Obi-Wan Kenobi");
        jedi1.setTitulo("Mestre");
        jedi1.mindControl();
        jedi1.levitation();
        jedi1.pickUp(weapon1);
        jedi1.pickUp(weapon3);
        jedi1.mostraArmas();

    }
}