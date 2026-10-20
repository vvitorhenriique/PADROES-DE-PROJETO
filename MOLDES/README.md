# MOLDES - Padroes de Projeto

## Factory Method
- FM_Ingressos: estilo RF/RNF (igual Apolice). Criador guarda os dados; cliente com Map; rejeicao por validacao.
- FM_Entregas: metodo fabrica COM PARAMETRO (criarEntrega(km)); criadores sem atributos;
  Map no cliente; exemplo de extensao (Bicicleta) sem alterar classe existente.

## Abstract Factory
- AF_Notificacoes: 3 produtos por familia, cliente com trocarCanal().
- AF_Pagamentos: produto com parametro/retorno (Imposto.calcular(valor)), cliente com finalizar(valor).

## Qual molde usar?
- Enunciado fala em "tipos de X" com regras proprias (RF01, RF02...) e um criador por tipo -> FACTORY METHOD
- Enunciado fala em "familias/temas/regioes" com VARIOS componentes que combinam entre si -> ABSTRACT FACTORY

## CHECKLIST DA PROVA
- [ ] Nomes de classes e metodos IGUAIS ao enunciado
- [ ] Textos impressos IGUAIS ao pedido
- [ ] Todos os itens de "Tarefa" feitos (marcar um por um)
- [ ] Sem if/switch decidindo tipo no cliente ou no criador abstrato
- [ ] processar() e final (Factory Method)
- [ ] Main declara pela interface/abstracao
- [ ] Testei um calculo a mao e compila
