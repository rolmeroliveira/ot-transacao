package com.zup.ottransacao.transacao;

import com.zup.ottransacao.cartao.Cartao;
import com.zup.ottransacao.cartao.CartaoResp;
import com.zup.ottransacao.estabelecimento.Estabelecimento;
import com.zup.ottransacao.estabelecimento.EstabelecimentoResp;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


@Entity
public class Transacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String numeroTransacao;
    private BigDecimal valor;
    private LocalDateTime efetivadaEm;

    @OneToOne(cascade = CascadeType.ALL)
    private Estabelecimento estabelecimento;
    @OneToOne(cascade = CascadeType.ALL)
    private Cartao cartao;

    public Transacao() {
    }

    public Transacao(String numeroTransacao, BigDecimal valor, LocalDateTime efetivadaEm, Estabelecimento estabelecimento, Cartao cartao) {
        this.numeroTransacao = numeroTransacao;
        this.valor = valor;
        this.efetivadaEm = efetivadaEm;
        this.estabelecimento = estabelecimento;
        this.cartao = cartao;
    }

    public TransacaoResp toResponse(){
        //converte o estabelecimento da transação em response
        EstabelecimentoResp estabelecimentoResp = new EstabelecimentoResp(this.estabelecimento);
        //converte o cartão da transaçãoi em response
        CartaoResp cartaoResp = new CartaoResp(this.cartao);
        //converte a transação em request
        TransacaoResp transacaoResp = new TransacaoResp(
                this.numeroTransacao,
                this.valor.toString(),
                this.efetivadaEm.format(DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss")),
                estabelecimentoResp,
                cartaoResp);
        return transacaoResp;
    }

}
