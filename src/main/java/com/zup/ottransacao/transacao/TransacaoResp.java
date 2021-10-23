package com.zup.ottransacao.transacao;

import com.zup.ottransacao.cartao.CartaoResp;
import com.zup.ottransacao.estabelecimento.EstabelecimentoResp;


public class TransacaoResp {

    private String id;
    private String valor;
    private String efetivadaEm;

    private EstabelecimentoResp estabelecimentoResp;
    private CartaoResp cartaoResp;

    public TransacaoResp() {
    }

    public TransacaoResp(String id, String valor, String efetivadaEm, EstabelecimentoResp estabelecimentoResp, CartaoResp cartaoResp) {
        this.id = id;
        this.valor = valor;
        this.efetivadaEm = efetivadaEm;
        this.estabelecimentoResp = estabelecimentoResp;
        this.cartaoResp  = cartaoResp;
    }

    public String getId() {
        return id;
    }

    public String getValor() {
        return valor;
    }

    public String getEfetivadaEm() {
        return efetivadaEm;
    }

    public EstabelecimentoResp getEstabelecimentoResp() {
        return estabelecimentoResp;
    }

    public CartaoResp getCartaoResp() {
        return cartaoResp;
    }
}
