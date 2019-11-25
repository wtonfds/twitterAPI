(ns twitter.query_post
    (:require [twitter.database]
              [korma.core :refer :all]    
    )        
)

(defentity posts)

(defn get-posts []
    (select posts)    
)

(defn add-posts [post userId]
    (insert posts (
        values {:post post :userId userId}
    ))
)

(defn proprio-posts [idPost]
    (first
        (select posts
              (where {:idPost [= idPost]})))
)