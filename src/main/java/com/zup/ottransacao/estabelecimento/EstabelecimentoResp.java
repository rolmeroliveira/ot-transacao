package com.zup.ottransacao.estabelecimento;


public class EstabelecimentoResp {

    private String nome;
    private String cidade;
    private String endereco;

    public EstabelecimentoResp() {
    }

    public EstabelecimentoResp(String nome, String cidade, String endereco) {
        this.nome = nome;
        this.cidade = cidade;
        this.endereco = endereco;
    }

    public EstabelecimentoResp(Estabelecimento estabelecimento) {
        this.nome = estabelecimento.getNome();
        this.cidade = estabelecimento.getCidade();
        this.endereco = estabelecimento.getEndereco();
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Estabelecimento toModel(){
        Estabelecimento estabelecimento = new Estabelecimento(this.nome,this.cidade, this.endereco);
        return estabelecimento;
    }

    @Override
    public String toString() {
        return "Estabelecimento{" +
                "nome='" + nome + '\'' +
                ", cidade='" + cidade + '\'' +
                ", endereco='" + endereco + '\'' +
                '}';
    }
}
