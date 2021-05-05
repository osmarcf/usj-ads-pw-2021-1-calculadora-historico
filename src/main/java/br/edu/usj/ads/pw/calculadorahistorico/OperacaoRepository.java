package br.edu.usj.ads.pw.calculadorahistorico;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface OperacaoRepository extends CrudRepository<Operacao, Long> {
    List<Operacao> findAll();
}
