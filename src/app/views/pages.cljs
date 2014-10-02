(ns app.views.pages
  (:require [app.views.home-page :refer [home-page]]
            [app.views.about-page :refer [about-page]]))

(def pages {:home-page home-page
            :about-page about-page})
