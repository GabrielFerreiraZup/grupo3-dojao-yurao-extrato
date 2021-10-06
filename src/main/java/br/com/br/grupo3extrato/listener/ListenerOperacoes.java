package br.com.br.grupo3extrato.listener;


import br.com.br.grupo3extrato.model.EventoExtrato;
import br.com.br.grupo3extrato.repository.EventoExtratoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class ListenerOperacoes {

    @Autowired
    EventoExtratoRepository repository;

    @KafkaListener(topics = "conta_transacao")
    public void ouvir (EventoExtrato eventoExtrato){
        System.out.println(eventoExtrato.toString());
        repository.save(eventoExtrato);
    }

}
