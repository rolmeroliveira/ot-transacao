package com.zup.ottransacao.transacao;

import com.zup.ottransacao.Exceptions.CustomNotFoundException;
import com.zup.ottransacao.cartao.Cartao;
import com.zup.ottransacao.cartao.CartaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/transacoes")
public class TransacaoController {

    @Autowired
    CartaoRepository cartaoRepository;
    @Autowired
    TransacaoRepository transacaoRepository;

    @GetMapping(path = "/{codigo}")
    public ResponseEntity<List<TransacaoResp>> listaTransacoes(@PathVariable String codigo){
        Cartao cartaoEncontrado =
                cartaoRepository.findFirstByNumeroCartao("c63fd0e0-eccb-4af3-9d49-39cde0ffdaf1").
                        orElseThrow(()-> new CustomNotFoundException("Cartao", "O Cartão no foi encontrado"));
        List<Transacao> ultimasTransacoes =
                transacaoRepository.queryFindFirs10tByCartaoOrderByIdDesc(cartaoEncontrado)
                        .orElseThrow(()-> new CustomNotFoundException("Transações", "Não há transações para este cartão"));

        List<TransacaoResp> tr = ultimasTransacoes.stream().map(t -> t.toResponse()).collect(Collectors.toList());
        return new ResponseEntity<List<TransacaoResp>>(tr,HttpStatus.OK );
    }
}
