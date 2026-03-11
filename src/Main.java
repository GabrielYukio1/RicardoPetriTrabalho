public class Main {

    public static void main(String[] args) {

        ListaSimples lista = new ListaSimples(10);

        
        lista.adicionarVarios(new String[]{"Ana","Carlos","Pedro","Ana"});

        System.out.println("Lista inicial:");
        lista.exibirElementos();

       
        System.out.println("Quantidade de elementos: " + lista.contar());

       
        System.out.println("Ocorrencias de Ana: " + lista.contarOcorrencias("Ana"));

       
        System.out.println("Elemento no indice 1: " + lista.obter(1));

        
        lista.inserir(2, "Maria");
        System.out.println("Após inserir Maria na posição 2:");
        lista.exibirElementos();

        
        lista.substituir("Ana", "Julia");
        System.out.println("Após substituir Ana por Julia:");
        lista.exibirElementos();

        
        lista.removerTodas("Julia");
        System.out.println("Após remover todas Julia:");
        lista.exibirElementos();

        
        lista.removerPorIndice(1);
        System.out.println("Após remover indice 1:");
        lista.exibirElementos();

        
        System.out.println("Último indice de Pedro: " + lista.ultimoIndiceDe("Pedro"));

        
        lista.limpar();
        System.out.println("Lista após limpar:");
        lista.exibirElementos();
    }
}
