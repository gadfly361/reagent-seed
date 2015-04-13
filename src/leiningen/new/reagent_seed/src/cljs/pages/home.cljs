(ns {{ns-name}}.pages.home
    (:require [re-com.core :as re-com]))

(def title
  [re-com/title 
   :label "Welcome to the Home Page"
   :level :level1])

(def go-to-about-page
  [re-com/hyperlink-href 
   :label "go to About Page"
   :href "#/about"])

(defn page []
  [re-com/v-box
   :gap "1em"
   :children [title go-to-about-page]])
