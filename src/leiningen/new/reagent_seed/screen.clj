(ns {{ns-name}}.css.screen
  (:require  [garden.def :refer [defstyles]]
             [garden.units :as u :refer [em]]
             [garden.color :as color :refer [rgb]]))

(defstyles screen
  ;; Coloring Title
  [:div#title {:font-size (em 3)
               :color (rgb 123 45 6)}]

  ;; Sticky footer
  [:* {:margin "0"}]
  [:html :body {:height "100%"}]
  [:.page-wrap {:min-height "85%"
                :margin-bottom "-50px"}]
  [:.page-wrap:after {:content "\"\""
                         :display "block"}]

  [:.site-footer :.page-wrap:after {:height "50px"}]
  [:.site-footer {:text-align "center"
                  :font-size (em 0.85)
                  }]
  ;; --
  )
