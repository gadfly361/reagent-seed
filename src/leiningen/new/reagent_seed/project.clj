(defproject {{ns-name}} "0.1.0-SNAPSHOT"
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/clojurescript "0.0-3058" :scope "provided"]
                 [ring "1.3.2"]
                 [ring/ring-defaults "0.1.3"]
                 [compojure "1.3.2"]
                 [prone "0.8.0"]
                 [reagent "0.5.0"]
                 [re-frame "0.2.0"]
                 [com.andrewmcveigh/cljs-time "0.3.2"]
                 [re-com "0.4.1"]
                 [secretary "1.2.3"]]

  :min-lein-version "2.5.0"

  :source-paths ["src/clj"]

  :plugins [[lein-cljsbuild "1.0.4"]
            [lein-ring "0.9.1"]]

  :ring {:handler {{ns-name}}.handler/app}

  :profiles {:dev {:cljsbuild {:builds [{:source-paths ["src/cljs"]
                                         :compiler {:output-to "resources/public/js/app.js"}}]}}

             :prod {:cljsbuild {:builds [{:source-paths ["src/cljs"]
                                          :compiler {:output-to "resources/public/js/app.js"
                                                     :optimizations :advanced
                                                     :elide-asserts true
                                                     :pretty-print false}}]}}})
