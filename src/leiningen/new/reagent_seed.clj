(ns leiningen.new.reagent-seed
  (:use [leiningen.new.templates :only [renderer name-to-path sanitize-ns ->files]]))

(def render (renderer "reagent-seed"))

(defn reagent-seed
  [name]
  (let [data {:name name
              :ns-name (sanitize-ns name)
              :sanitized (name-to-path name)}]
    (->files data 
             ["README.md" (render "README.md" data)]
             ["project.clj" (render "project.clj" data)]

             ["src/clj/{{sanitized}}/handler.clj" (render "src/clj/handler.clj" data)]

             ["resources/public/index.html" (render "resources/public/index.html" data)]
             ["resources/public/css/re-com.css" (render "resources/public/css/re-com.css")]
             ["resources/public/css/material-design-iconic-font.min.css" (render "resources/public/css/material-design-iconic-font.min.css")]

             ["src/cljs/{{sanitized}}/core.cljs" (render "src/cljs/core.cljs" data)]
             ["src/cljs/{{sanitized}}/db.cljs" (render "src/cljs/db.cljs" data)]
             ["src/cljs/{{sanitized}}/subs.cljs" (render "src/cljs/subs.cljs" data)]
             ["src/cljs/{{sanitized}}/handlers.cljs" (render "src/cljs/handlers.cljs" data)]
             ["src/cljs/{{sanitized}}/routes.cljs" (render "src/cljs/routes.cljs" data)]

             ["src/cljs/{{sanitized}}/pages/home.cljs" (render "src/cljs/pages/home.cljs" data)]
             ["src/cljs/{{sanitized}}/pages/about.cljs" (render "src/cljs/pages/about.cljs" data)]
             )))
