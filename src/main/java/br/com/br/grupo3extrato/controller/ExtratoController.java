package br.com.br.grupo3extrato.controller;

import br.com.br.grupo3extrato.model.EventoExtrato;
import br.com.br.grupo3extrato.repository.EventoExtratoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExtratoController {

    @Autowired
    private EventoExtratoRepository repository;

    @GetMapping("/extratos")
    public Page<EventoExtrato> consultaExtrato(@PageableDefault(page = 0,size = 20, sort = "dataOperacao", direction = Sort.Direction.DESC) Pageable pageable){
        return repository.findAll(pageable);
    }

}
