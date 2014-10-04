(ns {{ns-name}}.routes
  (:require [secretary.core :as secretary :include-macros true :refer [defroute]]
            [{{ns-name}}.session :as session]
            [{{ns-name}}.views.pages :as pages]
            [goog.events :as events]
            [goog.history.EventType :as EventType])
  (:import goog.History))

;; ----------
;; Routes
(secretary/set-config! :prefix "#")

(defroute "/" []
  (session/put! :current-page (pages/pages :home-page))
  (session/put! :nav "home"))

(defroute "/about" []
  (session/put! :current-page (pages/pages :about-page))
  (session/put! :nav "about"))

;; ----------
;; History
(defn hook-browser-navigation! []
  (doto (History.)
    (events/listen
     EventType/NAVIGATE
     (fn [event]
       (secretary/dispatch! (.-token event))))
    (.setEnabled true)))
;; need to run this after routes have been defined
(hook-browser-navigation!)
