# reagent-seed

This is a starting point for creating React/Reagent applications.  The following comes included:

* [reagent](https://github.com/holmsand/reagent)
* [secretary](https://github.com/gf3/secretary)
* [garden](https://github.com/noprompt/garden)
* brepl (borrowed from [austin-repl-example](https://github.com/cjohansen/austin-repl-example))
* [bower](http://bower.io/)
* sticky footer

Inspired by a [blog post](http://yogthos.net/#/blog/55) by @yogthos.

## Usage

Open a terminal and cd into the reagent-seed folder.  Download bootstrap and react.

```
$ bower install
```

Create a css file.

```
$ lein garden once
```

Create a javascript file from your clojurescript files.
*Note: if it says "Successful", but you aren't able to type anything into the termal, hit `Ctrl-c Ctrl-c`.*

```
$ lein cljsbuild auto
```

Start a repl and type the following.

```
(run!)
```

Open a browser and go to *localhost:8080*. You should see your [reagent](https://github.com/holmsand/reagent) application!

If you want to start a brepl, type the following:

```
(cljs!)
```

Then type:

```
(println "hello world")
```

In your browser, hit `f12`.  You should see *hello world* printed to the console.
