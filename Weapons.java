public class Weapons{
    private String descricao;
    private int dano;
    
    //Constructor
    public Weapons(){}
    public Weapons(String descricao, int dano){
        this.descricao = descricao;
        this.dano = dano;
    }


    //Getters e setters
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }
    //Fim getters e setters
}
