(ns twitter.view
    (:use hiccup.page hiccup.element)   
)


(defn home []
    (html5 [:html [:head [:title "API Twitter" ]][:body {:style "color: blue; fonte-weight: bold"} [:h1[:center"Bem vindos a pagina da nova API do Twitter"]]
        [:p[:center "Com essa API voce podera criar um novo twitte, ver tweets e visualizar seu proprio tweet"]]
        [:p[:h3 "Estas sao as rotas que voce pode usar para consultar sua API"]]
        [:ul[:li "/api/todosTweet --> para ver todos os Tweets"][:li "/api/buscarTweet/:id --> para buscar um tweet pelo ID"]
        [:li "/api/novoTweet --> para adicionar um novo tweet"][:li "/api/responderTweet --> para responder seus Tweets favoritos"]]
        [:p[:h3 "Estas rotas sao referentes aos usuarios"]]
        [:ul[:li "/api/todosUsuarios --> Listar todos os usuarios"][:li "/api/verPerfil/:id --> Buscar um perfil pelo id"]
        [:li "/api/novoUsuario --> Adicionar um novo usuario"]]
        ]])
)
