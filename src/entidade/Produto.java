/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade;


public class Produto {
    int id;
    String descricao;
    String cor;
    String marca;
    String tamanho;
    int qtd;
    int codsecao;
    int codprat;
    int codgrupo;
    String secao;
    String prateleira;
    String grupo;

    public String getSecao() {
        return secao;
    }

    public void setSecao(String secao) {
        this.secao = secao;
    }

    public String getPrateleira() {
        return prateleira;
    }

    public void setPrateleira(String prateleira) {
        this.prateleira = prateleira;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }
    
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public int getCodsecao() {
        return codsecao;
    }

    public void setCodsecao(int codsecao) {
        this.codsecao = codsecao;
    }

    public int getCodprat() {
        return codprat;
    }

    public void setCodprat(int codprat) {
        this.codprat = codprat;
    }

    public int getCodgrupo() {
        return codgrupo;
    }

    public void setCodgrupo(int codgrupo) {
        this.codgrupo = codgrupo;
    }

    
    
}
