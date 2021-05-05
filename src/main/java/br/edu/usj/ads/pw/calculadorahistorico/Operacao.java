package br.edu.usj.ads.pw.calculadorahistorico;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Operacao {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    String descricao;
}
