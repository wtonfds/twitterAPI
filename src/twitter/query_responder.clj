(ns twitter.query_responder
    (:require [twitter.database]
              [korma.core :refer :all]
    )
)

(defentity respondertweet)

(defn responderTweet [postId, userId, texto]
    (insert respondertweet 
        (values {:postId postId :userId userId :texto texto})
    )    
)

(defn get-resposta []
    (select respondertweet)
)