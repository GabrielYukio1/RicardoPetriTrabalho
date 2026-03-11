public class ListaDinamica implements ListaOperacoes {

    No inicio;

    public ListaDinamica() {
        this.inicio = null;
    }

    public void adicionarElemento(String elemento) {

        No novo = new No(elemento);

        if(inicio == null) {
            inicio = novo;
            return;
        }

        No aux = inicio;

        while(aux.getProx() != null) {
            aux = aux.getProx();
        }

        aux.setProx(novo);
    }

    public void exibir() {

        No aux = inicio;

        while(aux != null) {
            System.out.println(aux.getConteudo());
            aux = aux.getProx();
        }
    }

    @Override
    public int removerTodas(String elemento) {

        int removidos = 0;

        while(inicio != null && inicio.getConteudo().equals(elemento)) {
            inicio = inicio.getProx();
            removidos++;
        }

        No aux = inicio;

        while(aux != null && aux.getProx() != null) {

            if(aux.getProx().getConteudo().equals(elemento)) {
                aux.setProx(aux.getProx().getProx());
                removidos++;
            } else {
                aux = aux.getProx();
            }
        }

        return removidos;
    }

    @Override
    public int contar() {

        int count = 0;

        No aux = inicio;

        while(aux != null) {
            count++;
            aux = aux.getProx();
        }

        return count;
    }

    @Override
    public int adicionarVarios(String[] elementos) {

        int adicionados = 0;

        for(String e : elementos) {
            adicionarElemento(e);
            adicionados++;
        }

        return adicionados;
    }

    @Override
    public String obter(int indice) {

        int i = 0;
        No aux = inicio;

        while(aux != null) {

            if(i == indice) {
                return aux.getConteudo();
            }

            aux = aux.getProx();
            i++;
        }

        return null;
    }

    @Override
    public boolean inserir(int indice, String elemento) {

        No novo = new No(elemento);

        if(indice == 0) {
            novo.setProx(inicio);
            inicio = novo;
            return true;
        }

        int i = 0;
        No aux = inicio;

        while(aux != null && i < indice - 1) {
            aux = aux.getProx();
            i++;
        }

        if(aux == null) {
            return false;
        }

        novo.setProx(aux.getProx());
        aux.setProx(novo);

        return true;
    }

    @Override
    public String removerPorIndice(int indice) {

        if(inicio == null) {
            return null;
        }

        if(indice == 0) {
            String removido = inicio.getConteudo();
            inicio = inicio.getProx();
            return removido;
        }

        int i = 0;
        No aux = inicio;

        while(aux.getProx() != null && i < indice - 1) {
            aux = aux.getProx();
            i++;
        }

        if(aux.getProx() == null) {
            return null;
        }

        String removido = aux.getProx().getConteudo();

        aux.setProx(aux.getProx().getProx());

        return removido;
    }

    @Override
    public void limpar() {
        inicio = null;
    }

    @Override
    public int ultimoIndiceDe(String elemento) {

        int indice = -1;
        int i = 0;

        No aux = inicio;

        while(aux != null) {

            if(aux.getConteudo().equals(elemento)) {
                indice = i;
            }

            aux = aux.getProx();
            i++;
        }

        return indice;
    }

    @Override
    public int contarOcorrencias(String elemento) {

        int count = 0;

        No aux = inicio;

        while(aux != null) {

            if(aux.getConteudo().equals(elemento)) {
                count++;
            }

            aux = aux.getProx();
        }

        return count;
    }

    @Override
    public int substituir(String antigo, String novo) {

        int count = 0;

        No aux = inicio;

        while(aux != null) {

            if(aux.getConteudo().equals(antigo)) {
                aux.setConteudo(novo);
                count++;
            }

            aux = aux.getProx();
        }

        return count;
    }
}