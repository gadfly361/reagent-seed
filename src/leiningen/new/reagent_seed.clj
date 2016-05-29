(ns leiningen.new.reagent-seed
  (:use [leiningen.new.templates :only [renderer name-to-path sanitize-ns ->files]]))

(def render (renderer "reagent-seed"))

(defn reagent-seed
  [name]
  (let [data {:name      name
              :ns-name   (sanitize-ns name)
              :sanitized (name-to-path name)}]
    (->files data

             [".gitignore" (render ".gitignore" data)]
             ["README.org" (render "README.org" data)]

             ["scripts/tangle-all.sh" (render "scripts/tangle-all.sh" data)]
             ["scripts/tangle.sh" (render "scripts/tangle.sh" data)]
             ["scripts/watch.sh" (render "scripts/watch.sh" data)]

             ["src/clj/css.org" (render "src/clj/css.org" data)]

             ["src/cljs/core.org" (render "src/cljs/core.org" data)]

             ["src/devcards/core_card.org" (render "src/devcards/core_card.org" data)]
             ["src/devcards/first_card.org" (render "src/devcards/first_card.org" data)]

             ["src/html/index.org" (render "src/html/index.org" data)]

             ["src/org-setup.org" (render "src/org-setup.org" data)]
             ["src/project.org" (render "src/project.org" data)]
             ["src/summary.org" (render "src/summary.org" data)]

             ["src/test-cljs/core_test.org" (render "src/test-cljs/core_test.org" data)]
             ["src/test-cljs/runner.org" (render "src/test-cljs/runner.org" data)]
             )))
