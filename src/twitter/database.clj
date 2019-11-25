(ns twitter.database
    (:require [korma.db :as korma]))
  
  (def db-connection-info 
      (korma/mysql 
          {:classname "com.mysql.jdbc.Driver"
          :subprotocol "mysql"
          :user "root"
          :subname "//localhost:3306/twitter"}))
  
  (korma/defdb db db-connection-info)