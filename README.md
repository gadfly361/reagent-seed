# Deprecated

This template has been deprecated in favor of [re-frame-template](https://github.com/Day8/re-frame-template).

# Reagent-Seed

A Leiningen template for projects using [Reagent](https://github.com/reagent-project/reagent), [Re-Frame](https://github.com/Day8/re-frame), [Re-Com](https://github.com/Day8/re-com), and [Secretary](https://github.com/gf3/secretary).

[Demo](http://reagent-seed.s3-website-us-east-1.amazonaws.com/)

## Usage

Create application with reagent-seed template.

```
$ lein new reagent-seed <name of app>
```

Compile cljs files.

```
$ lein cljsbuild once
```

*Note: to compile an optimized version, run `lein clean` followed by `lein with-profile prod cljsbuild once`*

Start a server.

```
$ lein ring server
```

## Other Templates

[reagent-template](https://github.com/reagent-project/reagent-template) - Official reagent template.

[reagent-figwheel](https://github.com/gadfly361/reagent-figwheel) - Simple template with [figwheel](https://github.com/bhauman/lein-figwheel) (intended for exploration).
