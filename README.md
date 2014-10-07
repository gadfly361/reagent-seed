# reagent-seed

This is a starting point for creating React/Reagent applications.  The following comes included:

* [reagent](https://github.com/holmsand/reagent) - react.js wrapper
* [secretary](https://github.com/gf3/secretary) - client-side routing
* [garden](https://github.com/noprompt/garden) - css
* [austin](https://github.com/cemerick/austin) - browser-repl (brepl) borrowed from [austin-repl-example](https://github.com/cjohansen/austin-repl-example)
* [bower](http://bower.io/) - package manager for the web
    * [react.js](http://facebook.github.io/react/)
	* [bootstrap](http://getbootstrap.com/)
* sticky footer

This template was inspired by a [blog post](http://yogthos.net/#/blog/55) by @yogthos.

*Note: requires minimum [lein](https://github.com/technomancy/leiningen) version of 2.4.3*

## usage

Create a new project based on the *reagent-seed* template.

```
$ lein new reagent-seed <name of your app>
```

cd into the folder you just made.  Download react.js and bootstrap.

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

## troubleshooting

*Note: the following instructions assume a linux setup.  Also, if you are copying these commands into a terminal, do not include the `$`*

To use the command `bower install` (which downloads *react.js* and *bootstrap* in this template), you need to have *bower*. To install *bower* you need to have *nodejs* and *npm*.

Install *nodejs*:

```
$ sudo apt-get install nodejs
```

Install *npm*:

```
$ sudo apt-get install npm
```

Install bower:

```
$ sudo npm install -g bower
```

Now try the `bower install` in your template's directory.  If you get this error */usr/bin/env: node: No such file or directory*, then your `nodejs` is not being recognized by `npm`.  Try this:

```
$ sudo ln -s `which nodejs` /usr/local/bin/node
```
