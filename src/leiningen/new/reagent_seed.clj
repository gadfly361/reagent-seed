(ns leiningen.new.reagent-seed
  (:use [leiningen.new.templates :only [renderer name-to-path sanitize-ns ->files]]))

(def render (renderer "reagent-seed"))

(defn reagent-seed
  [name]
  (let [data {:name name
              :ns-name (sanitize-ns name)
              :sanitized (name-to-path name)}]
    (->files data ["src/{{sanitized}}/views/home_page.cljs" (render "home_page.cljs" data)]
["dev/user.cljs" (render "user.cljs" data)]
["src/{{sanitized}}/views/common.cljs" (render "common.cljs" data)]
["src/{{sanitized}}/routes.cljs" (render "routes.cljs" data)]
["src/{{sanitized}}/views/pages.cljs" (render "pages.cljs" data)]
["dev/user.clj" (render "user.clj" data)]
["src/{{sanitized}}/seed_state.cljs" (render "seed_state.cljs" data)]
["src/{{sanitized}}/views/about_page.cljs" (render "about_page.cljs" data)]
["src/{{sanitized}}/core.cljs" (render "core.cljs" data)]
["project.clj" (render "project.clj" data)]
["src/{{sanitized}}/css/screen.clj" (render "screen.clj" data)]
["src/{{sanitized}}/session.cljs" (render "session.cljs" data)]
["resources/index.html" (render "index.html" data)]
["bower.json" (render "bower.json")]
[".bowerrc" (render ".bowerrc")]
)))
