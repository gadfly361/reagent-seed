(ns {{ns-name}}.core
    (:require [reagent.core :as reagent]
              [re-frame.core :as re-frame]))

(defn app []
  (let [page (re-frame/subscribe [:current-page])]
    (fn []
      [:div [@page]])))

(defn ^:export main []
  (re-frame/dispatch-sync [:initialize-db])
  (reagent/render-component [app]
                            (.getElementById js/document "app")))
