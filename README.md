# Verificador de Velocidade

Programa em Java, executado no terminal, que compara a velocidade do motorista com o limite da via e informa a situação.

## Como funciona

1. Informe o limite da via (deve ser maior que 0).
2. Informe sua velocidade (não pode ser negativa).
3. O programa mostra o resultado:

| Situação | Mensagem |
|---|---|
| Abaixo do limite | Velocidade baixa! |
| Igual ao limite | Velocidade correta! |
| Até 10% acima do limite | Atenção! Você está perto do limite! |
| Mais de 10% acima | Perigo!!! + quanto excedeu |

## Como executar

Requer o JDK instalado.

```bash
javac Main.java
java Main
```

## Conceitos praticados

- Entrada de dados com `Scanner`
- Validação com `while`
- Estruturas condicionais `if / else if / else`

## Exemplo

```
Qual o limite da via?
60
Digite sua velocidade:
70
Perigo!!! Acima da velocidade!
Você ultrapassou a velocidade em: 10Km/h
```
