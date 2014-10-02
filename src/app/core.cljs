(ns app.core
  (:require [reagent.core :as reagent :refer [atom]]
            [app.session :as session]
            [app.seed-state :as seed-state]
            [app.views.common :as common]))

(defn page-render []
  [:div
   [common/header]
   [(session/current-page)]])

(defn page-component [] 
  (reagent/create-class {:component-will-mount seed-state/page
                         :render page-render}))

;; initialize app
(reagent/render-component [page-component]
                          (.getElementById js/document "app"))
;; initialize sticky footer
(reagent/render-component [common/footer]
                          (.getElementById js/document "footer"))
