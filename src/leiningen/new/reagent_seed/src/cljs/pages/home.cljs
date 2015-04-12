(ns {{ns-name}}.pages.home
    (:require [re-com.core :as re-com]))

(defn page []
  [:div 
   [re-com/title 
    :label "Welcome to the Home Page"
    :level :level1]
   [re-com/hyperlink-href 
    :label "go to About Page"
    :href "#/about"]])
