/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bean;

/**
 *
 * @author 07788816108
 */
public class McbCompras {

    private int mcbIdCompras;
    private int mcbIdProdutos;
    private int mcbIdFornecedor;
    private int mcbQuantidade;
    private Double mcbValorTotal;
    private String mcbStatus;
    private String mcbData;

    public int getMcbIdCompras() {
        return mcbIdCompras;
    }

    public void setMcbIdCompras(int mcbIdCompras) {
        this.mcbIdCompras = mcbIdCompras;
    }

    public int getMcbIdProdutos() {
        return mcbIdProdutos;
    }

    public void setMcbIdProdutos(int mcbIdProdutos) {
        this.mcbIdProdutos = mcbIdProdutos;
    }

    public int getMcbIdFornecedor() {
        return mcbIdFornecedor;
    }

    public void setMcbIdFornecedor(int mcbIdFornecedor) {
        this.mcbIdFornecedor = mcbIdFornecedor;
    }

    public int getMcbQuantidade() {
        return mcbQuantidade;
    }

    public void setMcbQuantidade(int mcbQuantidade) {
        this.mcbQuantidade = mcbQuantidade;
    }

    public Double getMcbValorTotal() {
        return mcbValorTotal;
    }

    public void setMcbValorTotal(Double mcbValorTotal) {
        this.mcbValorTotal = mcbValorTotal;
    }

    public String getMcbStatus() {
        return mcbStatus;
    }

    public void setMcbStatus(String mcbStatus) {
        this.mcbStatus = mcbStatus;
    }

    public String getMcbData() {
        return mcbData;
    }

    public void setMcbData(String mcbData) {
        this.mcbData = mcbData;
    }
}