package br.senai.meuprojeto.controle;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("calc")
public class CalcController {

    // @RequestParam: Extrai os query params (?n1=X&n2=Y) da URL
    @GetMapping("somar")
    public String somar(@RequestParam double n1, @RequestParam double n2) {
        double resultado = n1 + n2;
        return "Resultado da Soma: " + resultado;
    }

    @GetMapping("diminuir")
    public String diminuir(@RequestParam double n1, @RequestParam double n2) {
        double resultado = n1 - n2;
        return "Resultado da Subtração: " + resultado;
    }

    @GetMapping("multiplicar")
    public String multiplicar(@RequestParam double n1, @RequestParam double n2) {
        double resultado = n1 * n2;
        return "Resultado da Multiplicação: " + resultado;
    }

    @GetMapping("dividir")
    public String dividir(@RequestParam double n1, @RequestParam double n2) {
        double resultado = n1 / n2;
        return "Resultado da Divisão: " + resultado;
    }

}
