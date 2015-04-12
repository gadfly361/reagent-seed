(ns {{ns-name}}.pages.about
    (:require [re-com.core :as re-com]))

(defn page []
  [:div 
   [re-com/title 
    :label "Welcome to the About Page"
    :level :level1]
   [re-com/hyperlink-href 
    :label "go to Home Page"
    :href "#/"]])
