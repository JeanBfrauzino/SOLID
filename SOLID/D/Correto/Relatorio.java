package SOLID.D.Correto;

public interface GeradorDeRelatorio {

    void gerarRelatorio(String tipoRelatorio);

}

public class RelatorioVendas implements GeradorDeRelatorio {

    @Override
    public void gerarRelatorio(String tipoRelatorio) {
        // Gera um relatório de vendas
    }

}

public class RelatorioClientes implements GeradorDeRelatorio {

    @Override
    public void gerarRelatorio(String tipoRelatorio) {
        // Gera um relatório de clientes
    }

}

public class ServicoRelatorio {

    private GeradorDeRelatorio geradorDeRelatorio;

    public ServicoRelatorio(GeradorDeRelatorio geradorDeRelatorio) {
        this.geradorDeRelatorio = geradorDeRelatorio;
    }

    public void gerarRelatorio(String tipoRelatorio) {
        geradorDeRelatorio.gerarRelatorio(tipoRelatorio);
    }

}
