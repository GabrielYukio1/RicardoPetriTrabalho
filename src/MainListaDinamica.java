public class MainListaDinamica {

    public static void main(String[] args) {

        ListaDinamica lista = new ListaDinamica();

        
        lista.adicionarElemento("Ana");
        lista.adicionarElemento("Carlos");
        lista.adicionarElemento("Pedro");
        lista.adicionarElemento("Ana");

        System.out.println("Lista inicial:");
        lista.exibir();

        
        System.out.println("Quantidade de elementos: " + lista.contar());

       
        System.out.println("Ocorrencias de Ana: " + lista.contarOcorrencias("Ana"));

        
        System.out.println("Elemento no indice 1: " + lista.obter(1));

       
        lista.inserir(2, "Maria");
        System.out.println("Após inserir Maria na posição 2:");
        lista.exibir();

        
        lista.substituir("Ana", "Julia");
        System.out.println("Após substituir Ana por Julia:");
        lista.exibir();

        
        lista.removerTodas("Julia");
        System.out.println("Após remover todas Julia:");
        lista.exibir();

        
        lista.removerPorIndice(1);
        System.out.println("Após remover indice 1:");
        lista.exibir();

        
        System.out.println("Último indice de Pedro: " + lista.ultimoIndiceDe("Pedro"));

        
        lista.limpar();
        System.out.println("Lista após limpar:");
        lista.exibir();
    }
}
