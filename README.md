# twitterAPI

FIXME

## Pre-requisitos

voce precisará de [Leiningen][] 2.0.0

[leiningen]: https://github.com/technomancy/leiningen

## Running

Para rodar o servidor web digite na linha de comando:

    lein ring server
    
## Desafio

    https://www.notion.so/Back-end-Teste-1-647a44b9754b416aafd0c7d12dfd0b73
    
    Foi acrescentado a tabela User para que na tabela post tivesse um idUser assim seria possivel fazer filtos e buscas mais detalhadas
    futuramente, se a API viesse a se expandir.
    
    A API pode:
        - Criar um novo tweet
        - Listar seus próprios tweets
        - Visualizar seu próprio tweet
        - Responder um Tweet
        - Criar um novo Usuario
        - Ver perfil
        - Criar novo Usuario
        - Listar todos os Usuarios
    
    Achei necessário a opção dos usuários pois queria que houvesse a busca de tweets de outros usuarios e também pra opção de responder
    um tweet fazer sentido.
    
## Tecnologia

    A linguagem escolhida foi o Clojure por ser uma liguagem funcional muito eficiente e também pela sua interface Java, pois já tenho
    muita familiaridade com o Java, e por ter uma biblioteca maravilhosa chamada Compojure que ajuda a definir facilmente rotas e seus
    manipuladores associados.
    Gostei tanto da tecnologia que resolvi me aprofunda nela, parece muito promissora e com grandes agencias apostando nela o mercado 
    e a comunidade deve se expandir.
    
## banco de dados

    o escript da base de dados estará junto ao código no github.
    Foi usado Mysql pelo fato de ter mais familiaridade.
    
## Testes
    
    As rotas do navegador estaram na página home da API. Basta rodar o servidor e acrescentar as rotas junto ao endereço do servidor ou
    usar um aplicativo de colaboração, o que eu aconselho, como insomnia ou postman.

## License

Copyright © 2019 FIXME
