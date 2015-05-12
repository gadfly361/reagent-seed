(ns {{ns-name}}.views
  (:require [re-com.core :as re-com]))

(def home-title
  [re-com/title
   :label "Welcome to the Home Page"
   :level :level1])

(def link-to-about-page
  [re-com/hyperlink-href
   :label "go to About Page"
   :href "#/about"])

(defn home-panel []
  [re-com/v-box
   :gap "1em"
   :children [home-title link-to-about-page]])

;; ----------

(def about-title 
  [re-com/title
   :label "Welcome to the About Page"
   :level :level1])

(def link-to-home-page
  [re-com/hyperlink-href
   :label "go to Home Page"
   :href "#/"])  

(defn about-panel []
  [re-com/v-box
   :gap "1em"
   :children [about-title link-to-home-page]])

;; ----------

(def panels
  {:home-panel [home-panel]
   :about-panel [about-panel]})
