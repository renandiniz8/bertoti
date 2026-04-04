public class Produto {
    private String nome;
    private String pet;

    public boolean comparar(Produto produto){
        if(this.nome.equals(produto.nome) &&
                this.pet.equals(produto.pet)) return true;
        return false;
    }

    public Produto(String nome, String pet) {
        this.nome = nome;
        this.pet = pet;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPet() {
        return pet;
    }

    public  void setPet(String pet) {
        this.pet = pet;
    }
}
