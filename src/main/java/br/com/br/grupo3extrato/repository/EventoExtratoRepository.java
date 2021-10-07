package br.com.br.grupo3extrato.repository;

import br.com.br.grupo3extrato.model.EventoExtrato;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventoExtratoRepository extends JpaRepository<EventoExtrato,Long> {
}
