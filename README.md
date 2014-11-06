# reagent-seed
nn
This is a starting point for creating React/Reagent applications.  The following comes included:

* [reagent](https://github.com/holmsand/reagent) - react.js wrapper
* [secretary](https://github.com/gf3/secretary) - client-side routing
* [garden](https://github.com/noprompt/garden) - css
* [austin](https://github.com/cemerick/austin) - browser-repl (brepl) borrowed from [austin-repl-example](https://github.com/cjohansen/austin-repl-example)
* [react.js](http://facebook.github.io/react/)
* [bootstrap](http://getbootstrap.com/)
* [font awesome](http://fortawesome.github.io/Font-Awesome/)

## directory layout

```
core.cljs               ---> main react/reagent component for application
css/
    screen.clj          ---> main css file using Garden
routes.cljs             ---> defining routes using Secretary
session.cljs            ---> contains atom with application state
views/
    about_page.cljs     ---> react/reagent component for the about page
	common.cljs         ---> common react/reagent components to all page views
	home_page.cljs      ---> react/reagent component for the home page
	pages.cljs          ---> map of page names to their react/reagent components
```

## usage

Create a new project based on the *reagent-seed* template.

```
$ lein new reagent-seed <name of your app>
```

cd into the folder you just made. Create a css file.

```
$ lein garden once
```

*Note: if it says "Successful", but you aren't able to type anything into the terminal, hit `Ctrl-c Ctrl-c`.*

Create a javascript file from your clojurescript files.

```
$ lein cljsbuild auto
```

Start a repl and type the following:

```
(run!)
```

Open a browser and go to *localhost:8080*. You should see your reagent application!

If you want to start a brepl, type the following:

```
(cljs!)
```

Then type:

```
(println "hello world")
```

In your browser, hit `f12`.  You should see *hello world* printed to the console.

## changelog

**v0.1.5**

Generally trying to make the template easier to follow.

* Removed bower
* Removed sticky footer
* Referred `(get-state)` function in a few places
* Added README.md
* Added .gitignore

## Examples

Many of the recipes in [reagent-cookbook](https://github.com/gadfly361/reagent-cookbook) are based on this template.

## other reagent templates

[reagent-figwheel](https://github.com/gadfly361/reagent-figwheel) - Simple template with [figwheel](https://github.com/bhauman/lein-figwheel).

[reagent-template](https://github.com/reagent-project/reagent-template) - Template by the reagent-project organization.

[liberagent](https://github.com/borkdude/lein-new-liberagent) - Template for apps that use Reagent on the client and Compojure+Liberator on the server.

## credits

This template was inspired by a [blog post](http://yogthos.net/#/blog/55) by @yogthos.
