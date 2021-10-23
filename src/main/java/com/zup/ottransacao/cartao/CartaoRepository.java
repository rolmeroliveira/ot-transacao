package com.zup.ottransacao.cartao;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CartaoRepository extends JpaRepository<Cartao, Long> {

    Optional<Cartao> findFirstByNumeroCartao(String numeroCartao);

}
