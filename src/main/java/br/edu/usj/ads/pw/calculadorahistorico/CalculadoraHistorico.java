package br.edu.usj.ads.pw.calculadorahistorico;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class CalculadoraHistorico {
    
    List<String> historico = new ArrayList<>();

    @PostMapping(value="calcular")
    public ModelAndView postCalcular(@RequestParam String operando1, @RequestParam String operando2, @RequestParam String operador) {
        // converter para double
        Double operando1Double = Double.valueOf(operando1);
        Double operando2Double = Double.valueOf(operando2);

        // operar
        //   verificar qual operacao eh
        Double resultado = null;
        if ("+".equals(operador)) {
            resultado = operando1Double + operando2Double;
        }

        // colocar a operacao no formato
        String operacao = operando1 + " " + operador + " " + operando2 + " = " + resultado;

        // salvar operacao no historico
        historico.add(operacao);

        // instanciar template
        ModelAndView modelAndView = new ModelAndView("index");

        // aplicar resultado da operacao no template
        // aplicar o historico no template
        modelAndView.addObject("resultado", resultado);
        modelAndView.addObject("historico", historico);

        // retornar
        return modelAndView;
    }
    
}
