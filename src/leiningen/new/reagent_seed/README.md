# {{name}}

A reagent webapp designed to ... well, that part is up to you.

## Usage

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
