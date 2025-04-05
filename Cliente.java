public class Cliente {

    public String nome;
    public long cpf;
    public Computador[] PC;

    public Cliente(String nome, long cpf, Computador[] PC) {
        this.nome = nome;
        this.cpf = cpf;
        this.PC = PC;
    }

    public float calculaTotalCompra() {
        float total = 0;
        for (int i = 0; i < PC.length; i++) {
            if (PC[i] != null) {
                total += PC[i].preco;
            }
        }
        return total;
    }
}
