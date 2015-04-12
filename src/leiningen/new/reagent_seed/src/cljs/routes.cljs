(ns {{ns-name}}.routes
    (:require-macros [secretary.core :refer [defroute]])
    (:import goog.History)
    (:require [secretary.core :as secretary]
              [goog.events :as events]
              [goog.history.EventType :as EventType]
              [re-frame.core :as re-frame]
              [{{ns-name}}.pages.home :as home]
              [{{ns-name}}.pages.about :as about]))

(secretary/set-config! :prefix "#")

;; --------------------
;; define routes here
(defroute "/" []
  (re-frame/dispatch [:update-page home/page]))

(defroute "/about" []
  (re-frame/dispatch [:update-page about/page]))



;; --------------------
(doto (History.)
  (events/listen
   EventType/NAVIGATE
   (fn [event]
     (secretary/dispatch! (.-token event))))
  (.setEnabled true))
