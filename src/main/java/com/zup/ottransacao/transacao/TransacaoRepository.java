package com.zup.ottransacao.transacao;

import com.zup.ottransacao.cartao.Cartao;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;


public interface TransacaoRepository extends CrudRepository<Transacao, Long> {
    Optional<List<Transacao>> queryFindFirs10tByCartaoOrderByIdDesc(Cartao cartao);
}
