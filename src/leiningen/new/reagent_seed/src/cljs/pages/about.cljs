(ns {{ns-name}}.pages.about
    (:require [re-com.core :as re-com]))

(def title 
  [re-com/title 
   :label "Welcome to the About Page"
   :level :level1])

(def go-to-home-page
  [re-com/hyperlink-href 
   :label "go to Home Page"
   :href "#/"])  

(defn page []
  [re-com/v-box
   :gap "1em"
   :children [title go-to-home-page]])
