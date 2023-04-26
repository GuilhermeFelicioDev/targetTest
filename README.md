# targetTest
Resolução do teste da Target Sistemas
1) Observe o trecho de código abaixo:

int INDICE = 13, SOMA = 0, K = 0;

enquanto K < INDICE faça
{
K = K + 1;
SOMA = SOMA + K;
}

imprimir(SOMA);

Ao final do processamento, qual será o valor da variável SOMA? 
Resposta: soma = 91

-------------------------------------------------------------------------------------------------
2) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde, informado um número, ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência.

IMPORTANTE:
Esse número pode ser informado através de qualquer entrada de sua preferência ou pode ser previamente definido no código;

Meu código recebe o valor a ser pesquisado na variável num e roda a função para sequenciar fibonacci até passar pela variável num.
Se num for igual ao valor atual de fibonacci, é exibido texto afirmando que num faz parte da sequência, caso contrário retorna que num não pertence à sequência.

-------------------------------------------------------------------------------------------------
3) Dado um vetor que guarda o valor de faturamento diário de uma distribuidora, faça um programa, na linguagem que desejar, que calcule e retorne:
• O menor valor de faturamento ocorrido em um dia do mês;
• O maior valor de faturamento ocorrido em um dia do mês;
• Número de dias no mês em que o valor de faturamento diário foi superior à média mensal.

IMPORTANTE:
a) Usar o json ou xml disponível como fonte dos dados do faturamento mensal;
b) Podem existir dias sem faturamento, como nos finais de semana e feriados. Estes dias devem ser ignorados no cálculo da média;

Meu código lê o arquivo .JSON e o salva num Array, o qual faço a leitura e contabilizo dos dados de maior faturamento, menor faturamento e a média mensal(dias sem faturamento foram desprezados, contabilizando 21 dias com faturamento real), depois de calculada a média, eu verifico os dias em que o faturamento foi maior e contabilizo ao final.

-------------------------------------------------------------------------------------------------
