package Fundamentos.solved;

import Fundamentos.solved.classesTeste.ex045.CalculoNatacao;

public class Ex045 {

// Desafio: A Confederação Nacional de Natação precisa de um programa que leia o ano
// de nascimento de um atleta e mostre sua categoria, de acordo com a idade:
// - Até 9 anos: MIRIM
// - Até 14 anos: INFANTIL
// - Até 19 anos: JÚNIOR
// - Até 25 anos: SÊNIOR
// - Acima de 25 anos: MASTER

    public static void main(String[] args) {
        CalculoNatacao natacao = new CalculoNatacao();
        natacao.informarIdade();
        natacao.calculoIdadeUsuario();
        natacao.analisadorCategoria();
    }

}
