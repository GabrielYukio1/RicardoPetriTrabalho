public class Main {

    public static void main(String[] args) {

        ListaSimples lista = new ListaSimples(10);

        lista.adicionarVarios(new String[]{"Ana","Carlos","Pedro","Ana"});

        lista.exibirElementos();

        System.out.println("Total: " + lista.contar());

        System.out.println("Ocorrencias de Ana: " + lista.contarOcorrencias("Ana"));

        lista.substituir("Ana","Maria");

        lista.exibirElementos();

        lista.removerTodas("Maria");

        lista.exibirElementos();
    }
}