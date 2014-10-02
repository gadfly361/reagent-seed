(ns app.seed-state
  (:require [app.session :as session]
            [app.views.pages :as pages]))

(defn page []
  (session/put! :current-page (pages/pages :home-page))
  (session/put! :nav "home"))
