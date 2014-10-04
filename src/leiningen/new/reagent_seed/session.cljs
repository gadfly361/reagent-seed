(ns {{ns-name}}.session
  (:require [reagent.core :as reagent :refer [atom]]))

;; ----------
;; State
(def app-state (atom {}))

;; ----------
;; Helper Functions
(defn get-state [k & [default]]
  (clojure.core/get @app-state k default))

(defn put! [k v]
  (swap! app-state assoc k v))

;; ----------
;; Get State
(defn current-page []
  (get-state :current-page))

(defn nav []
  (get-state :nav))
