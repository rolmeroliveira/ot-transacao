package com.zup.ottransacao.transacao;

import com.zup.ottransacao.cartao.Cartao;
import com.zup.ottransacao.estabelecimento.Estabelecimento;

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


}
