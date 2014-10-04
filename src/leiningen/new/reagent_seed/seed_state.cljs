(ns {{ns-name}}.seed-state
  (:require [{{ns-name}}.session :as session]
            [{{ns-name}}.views.pages :as pages]))

(defn page []
  (session/put! :current-page (pages/pages :home-page))
  (session/put! :nav "home"))
