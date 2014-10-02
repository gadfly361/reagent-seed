(ns app.views.common
  (:require  [app.session :as session]))

(defn active? [state val]
  (if (= (state) val) "active" ""))

(defn header []
  [:div.page-header {:class-name "row"}
   ;; 4 column units
  [:div#title {:class-name "col-md-4"} "Reagent Seed"]
   ;; 8 column units
   [:div {:class-name "col-md-8"}
    [:ul.nav.nav-pills 
     [:li {:class (active? session/nav "home")}  [:a {:href "#/"} "Home"]]
     [:li {:class (active? session/nav "about")} [:a {:href "#/about"} "About"]]
     ]]])

(defn footer []
  [:div
   [:div.page-header]
   [:footer {:class-name "site-footer"}
    ;; UPDATE ME
    "Twitter: @FIXME | Github: FIXME | Email: FIXME"]
   ])
