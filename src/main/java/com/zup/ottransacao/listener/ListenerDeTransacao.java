package com.zup.ottransacao.listener;

import com.zup.ottransacao.transacao.TransacaoRek;
import com.zup.ottransacao.transacao.TransacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;


@Component
public class ListenerDeTransacao {

    @Autowired
    TransacaoRepository transacaoRepository;

    @KafkaListener(topics = "${spring.kafka.topic.transactions}")
    public void ouvir(TransacaoRek transacaoRek) {
        transacaoRepository.save(transacaoRek.toModel());
    }

}
