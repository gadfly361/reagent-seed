(ns {{ns-name}}.views.common
  (:require  [{{ns-name}}.session :as session :refer [get-state]]))

(defn active? [state val]
  (if (= state val) "active" ""))

(defn header []
  [:div.page-header.row
   ;; 4 column units
  [:div#title.col-md-6 "{{name}}"]
   ;; 8 column units
   [:div.col-md-6
    [:ul.nav.nav-pills 
     [:li {:class (active? (get-state :nav) "home")}  [:a {:href "#/"} [:span.fa.fa-home " Home"]]]
     [:li {:class (active? (get-state :nav) "about")} [:a {:href "#/about"} "About"]]
     ]]])
