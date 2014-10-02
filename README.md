# reagent-seed

This is a starting point for creating React/Reagent applications.  The following comes included:

* [reagent](https://github.com/holmsand/reagent): ReactJS wrapper
* [secretary](https://github.com/gf3/secretary): Client-side routing
* [garden](https://github.com/noprompt/garden): CSS
* [austin](https://github.com/cemerick/austin): browser-repl (brepl) borrowed from [austin-repl-example](https://github.com/cjohansen/austin-repl-example)
* [bower](http://bower.io/): Package manager for the web
    * [reactJS](http://facebook.github.io/react/)
	* [bootstrap](http://getbootstrap.com/)
* sticky footer

This template was inspired by a [blog post](http://yogthos.net/#/blog/55) by @yogthos.

*Note: requires minimum [lein](https://github.com/technomancy/leiningen) version of 2.4.3*

## usage

Open a terminal and cd into the reagent-seed folder.  Download react and bootstrap.

```
$ bower install
```

Create a css file.

```
$ lein garden once
```

*Note: if it says "Successful", but you aren't able to type anything into the terminal, hit `Ctrl-c Ctrl-c`.*

Create a javascript file from your clojurescript files.

```
$ lein cljsbuild auto
```

Start a repl and type the following.

```
(run!)
```

Open a browser and go to [localhost:8080](localhost:8080). You should see your reagent application!

If you want to start a brepl, type the following:

```
(cljs!)
```

Then type:

```
(println "hello world")
```

In your browser, hit `f12`.  You should see *hello world* printed to the console.
