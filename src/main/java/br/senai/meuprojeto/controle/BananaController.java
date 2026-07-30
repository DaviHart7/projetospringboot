package br.senai.meuprojeto.controle;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // avisa que é um controller
@RequestMapping("banana") // todos os métodos desse controller respodem a "banana/algumacoisa"
public class BananaController {

    // responde ao caminho /banana
    @GetMapping() // banana com nada vem aqui
    public String getBanana(){
        return "BANANAAAAAA!";
    }

    // esse aqui responde a banana/{n}
    @GetMapping("{n}") // {n} é um número
    public String getVariasBanana(@PathVariable int n) {
        return "banana ".repeat(Math.max(0, n)).trim();
    }

    // acessar com http://localhost:8080/banana/12/setembro/2026
    @GetMapping("{dia}/{mes}/{ano}")
    public String getDataBanana(@PathVariable int dia,
                                @PathVariable String mes,
                                @PathVariable int ano){

        return "me lembre de comer uma banana em " +dia+" de "+mes+" de "+ano;
    }

}
