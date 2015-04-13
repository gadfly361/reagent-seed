(ns {{ns-name}}.core
    (:require [reagent.core :as reagent]
              [re-frame.core :as re-frame]
              [re-com.core :as re-com]))

(defn app []
  (let [page (re-frame/subscribe [:current-page])]
    (fn []
      [re-com/v-box
       :height "100%"
       :children [[@page]] ])))

(defn ^:export main []
  (re-frame/dispatch-sync [:initialize-db])
  (reagent/render-component [app]
                            (.getElementById js/document "app")))
