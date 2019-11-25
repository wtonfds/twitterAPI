(ns twitter.query_users
    (:require [twitter.database]
              [korma.core :refer :all]
    )
)

(defentity users)


(defn add-users [nome user_name daNascimento senha]
    (insert users(
        values {:nome nome :usuario user_name :daNascimento daNascimento :senha senha}
    ))    
)

(defn get-user []
    (select users)    
)

(defn get-perfil [userId]
    (first
        (select users
            (where {:userId [= userId]})))    
)

(defn delete-user [userId]
    (delete users
            (where {:userId [= userId]}))
)

