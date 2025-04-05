import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Computador[] PC = new Computador[9];
        Computador[] compra = new Computador[9];

        Scanner sc = new Scanner(System.in);

        // Computador 1
        SistemaOperacional siop1 = new SistemaOperacional("Linux Ubuntu", 32);
        HardwareBasico[] hdwb1 = new HardwareBasico[3];
        hdwb1[0] = new HardwareBasico("Pentium Core i3", 2200);
        hdwb1[1] = new HardwareBasico("Memoria RAM", 8);
        hdwb1[2] = new HardwareBasico("HD", 500);
        PC[0] = new Computador("Apple", 9621, siop1, hdwb1);
        MemoriaUSB musb1 = new MemoriaUSB("Acompanha PenDrive", 16);
        PC[0].addMemoriaUSB(musb1);

        // Computador 2
        SistemaOperacional siop2 = new SistemaOperacional("Windows 8", 64);
        HardwareBasico[] hdwb2 = new HardwareBasico[3];
        hdwb2[0] = new HardwareBasico("Pentium Core i5", 3370);
        hdwb2[1] = new HardwareBasico("Memoria RAM", 16);
        hdwb2[2] = new HardwareBasico("HD", 1);
        PC[1] = new Computador("Samsung", (9621 + 1234), siop2, hdwb2);
        MemoriaUSB musb2 = new MemoriaUSB("Acompanha PenDrive", 32);
        PC[1].addMemoriaUSB(musb2);

        // Computador 3
        SistemaOperacional siop3 = new SistemaOperacional("Windows 10", 64);
        HardwareBasico[] hdwb3 = new HardwareBasico[3];
        hdwb3[0] = new HardwareBasico("Pentium Core i7", 4500);
        hdwb3[1] = new HardwareBasico("Memoria RAM", 32);
        hdwb3[2] = new HardwareBasico("HD", 2);
        PC[2] = new Computador("Dell", (9621 + 5678), siop3, hdwb3);
        MemoriaUSB musb3 = new MemoriaUSB("Acompanha PenDrive", 64);
        PC[2].addMemoriaUSB(musb3);

        // Criando cliente
        Cliente cliente = new Cliente("Hevini", 123845, compra);
        System.out.println("NOME: " + cliente.nome);
        System.out.println("CPF: " + cliente.cpf);

        System.out.println("\nComputadores na compra atual:");
        for (int i = 0; i < compra.length; i++) {
            if (compra[i] != null) {
                compra[i].mostraPCConfigs();
            }
        }

        System.out.println("\nPromoção 1: ");
        PC[0].mostraPCConfigs();
        System.out.println("Promoção 2: ");
        PC[1].mostraPCConfigs();
        System.out.println("Promoção 3: ");
        PC[2].mostraPCConfigs();

        sc.close();
    }
}
