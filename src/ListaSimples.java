public class ListaSimples implements ListaOperacoes {

    String[] lista;

    public ListaSimples(int tamanho) {
        this.lista = new String[tamanho];
    }

    public void adicionarElemento(String elemento) {
        for(int i = 0; i < lista.length; i++) {
            if(lista[i] == null) {
                lista[i] = elemento;
                return;
            }
        }
    }

    public void exibirElementos() {
        for(int i = 0; i < lista.length; i++) {
            System.out.println("Lista[" + i + "] = " + lista[i]);
        }
    }

    @Override
    public int removerTodas(String elemento) {
        int removidos = 0;

        for(int i = 0; i < lista.length; i++) {
            if(lista[i] != null && lista[i].equals(elemento)) {
                lista[i] = null;
                removidos++;
            }
        }

        return removidos;
    }

    @Override
    public int contar() {
        int count = 0;

        for(String e : lista) {
            if(e != null) {
                count++;
            }
        }

        return count;
    }

    @Override
    public int adicionarVarios(String[] elementos) {

        int adicionados = 0;

        for(String e : elementos) {
            for(int i = 0; i < lista.length; i++) {
                if(lista[i] == null) {
                    lista[i] = e;
                    adicionados++;
                    break;
                }
            }
        }

        return adicionados;
    }

    @Override
    public String obter(int indice) {

        if(indice < 0 || indice >= lista.length) {
            return null;
        }

        return lista[indice];
    }

    @Override
    public boolean inserir(int indice, String elemento) {

        if(indice < 0 || indice >= lista.length) {
            return false;
        }

        for(int i = lista.length - 1; i > indice; i--) {
            lista[i] = lista[i - 1];
        }

        lista[indice] = elemento;

        return true;
    }

    @Override
    public String removerPorIndice(int indice) {

        if(indice < 0 || indice >= lista.length) {
            return null;
        }

        String removido = lista[indice];

        for(int i = indice; i < lista.length - 1; i++) {
            lista[i] = lista[i + 1];
        }

        lista[lista.length - 1] = null;

        return removido;
    }

    @Override
    public void limpar() {

        for(int i = 0; i < lista.length; i++) {
            lista[i] = null;
        }
    }

    @Override
    public int ultimoIndiceDe(String elemento) {

        int indice = -1;

        for(int i = 0; i < lista.length; i++) {
            if(lista[i] != null && lista[i].equals(elemento)) {
                indice = i;
            }
        }

        return indice;
    }

    @Override
    public int contarOcorrencias(String elemento) {

        int count = 0;

        for(String e : lista) {
            if(e != null && e.equals(elemento)) {
                count++;
            }
        }

        return count;
    }

    @Override
    public int substituir(String antigo, String novo) {

        int substituidos = 0;

        for(int i = 0; i < lista.length; i++) {
            if(lista[i] != null && lista[i].equals(antigo)) {
                lista[i] = novo;
                substituidos++;
            }
        }

        return substituidos;
    }
}