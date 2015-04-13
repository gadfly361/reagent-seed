(ns {{ns-name}}.handlers
    (:require [re-frame.core :as re-frame]
              [{{ns-name}}.db :as db]))

(re-frame/register-handler
 :initialize-db
 (fn [_ _]
   db/initialize-db))

(re-frame/register-handler
 :update-page
 (fn [db [_ new-page]]
   (assoc db :page new-page)))
