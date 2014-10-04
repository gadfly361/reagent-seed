(ns {{ns-name}}.views.pages
  (:require [{{ns-name}}.views.home-page :refer [home-page]]
            [{{ns-name}}.views.about-page :refer [about-page]]))

(def pages {:home-page home-page
            :about-page about-page})
