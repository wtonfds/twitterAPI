(ns twitter.handler
  ( :require [compojure.core :refer :all]
    [compojure.handler :as handler]
    [compojure.route :as route]
    [ring.middleware.json :as json]
    [ring.util.response :refer [response]]
    [twitter.query_post :refer :all]
    [twitter.query_users :refer :all]
    [twitter.query_responder :refer :all]
    [twitter.view :refer :all]
    )
)

(defroutes app-routes
  (POST "/api/novoTweet" {:keys [params]}
    (let [{:keys [post userId]} params]
      (response (add-posts post userId)))
  )

  (GET "/api/todosTweet" []
    (response (get-posts))
  )

  (GET "/api/buscarTweet/:idPost" [idPost]
      (response(proprio-posts(Integer/parseInt idPost)))  
  )

  (POST "/api/responderTweet" {:keys [params]}
    (let [{:keys [postId userId texto]} params]
      (response (responderTweet postId userId texto))  
    )  
  )

  (GET "/api/verPerfil/:userId" [userId]
    (response(get-perfil(Integer/parseInt userId)))  
  )

  (GET "/api/todosUsuarios" []
    (response(get-user))  
  )

  (PUT "/api/novoUsuario" {:keys [params]}
    (let [{:keys [nome user_name daNascimento senha]} params]
      (response(add-users nome user_name daNascimento senha)))  
  )

  (GET "/" []
    (response(home))
  )
  (route/not-found "Not Found")
  
)

(def app
  (-> (handler/api app-routes)
      (json/wrap-json-params)
      (json/wrap-json-response))
)
