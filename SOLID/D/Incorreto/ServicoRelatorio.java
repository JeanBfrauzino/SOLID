package SOLID.D.Incorreto;

public class ServicoRelatorio {

    private RelatorioVendas relatorioVendas;

    public ServicoRelatorio() {
        this.relatorioVendas = new RelatorioVendas();
    }

    public void gerarRelatorioVendas() {
        relatorioVendas.gerarRelatorio();
    }

}
