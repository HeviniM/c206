public class Computador {

    public String marca;
    public float preco;

    public MemoriaUSB musb;
    public SistemaOperacional siop;
    public HardwareBasico[] hdwb;

    public Computador(String marca, float preco, SistemaOperacional siop, HardwareBasico[] hdwb) {
        this.marca = marca;
        this.preco = preco;
        this.siop = siop;
        this.hdwb = hdwb;
    }

    public void mostraPCConfigs() {
        System.out.println("CONFIGURAÇÃO DO PC:");
        System.out.println("PREÇO: R$ " + preco);
        System.out.println("MARCA: " + marca);
        String processador = "PROCESSADOR: " + hdwb[0].nome + " " + hdwb[0].capacidade + "MHz";
        System.out.println(processador);
        String memoria = "MEMÓRIA: " + hdwb[1].nome + " " + hdwb[1].capacidade + "GB";
        System.out.println(memoria);
        String armazenamento = "ARMAZENAMENTO: " + hdwb[2].nome + " " + hdwb[2].capacidade;
        armazenamento += (hdwb[2].capacidade == 500) ? "GB" : "TB";
        System.out.println(armazenamento);
        String sistema = "SISTEMA: " + siop.nome + " " + siop.tipo + "BITS";
        System.out.println(sistema);

        if (musb != null) {
            String memoriaUSB = "MEMÓRIA USB: " + musb.nome + " " + musb.capacidade;
            memoriaUSB += (musb.capacidade == 16 || musb.capacidade == 32) ? "GB" : "TB";
            System.out.println(memoriaUSB);
        } else {
            System.out.println("MEMÓRIA USB: Não acompanha");
        }

        System.out.println("**");
    }

    public void addMemoriaUSB(MemoriaUSB musb) {
        if (musb != null) {
            this.musb = musb;
        }
    }
}
