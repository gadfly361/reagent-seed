(ns {{ns-name}}.core
    (:require [reagent.core :as reagent]
              [re-frame.core :as re-frame]
              [re-com.core :as re-com]
              [{{ns-name}}.handlers]
              [{{ns-name}}.subs]
              [{{ns-name}}.views :as views]))

(defn app []
  (let [active-panel (re-frame/subscribe [:active-panel])]
    (fn []
      [re-com/v-box
       :height "100%"
       :children [(views/panels @active-panel)]])))

(defn ^:export main []
  (re-frame/dispatch-sync [:initialize-db])
  (reagent/render-component [app]
                            (.getElementById js/document "app")))
