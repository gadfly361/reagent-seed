# Reagent-Seed (leiningen template)

**Orgmode** + Reagent + Cider + Figwheel ... what could ~~go wrong~~ be better?

This template was deprecated, but I figured I'd revive it and turn it
into an Emacs-focused monster.  The template includes:

* [reagent](https://github.com/reagent-project/reagent)
* [cider](https://github.com/clojure-emacs/cider)
* [devcards](https://github.com/bhauman/devcards)
* [doo](https://github.com/bensu/doo)
* [figwheel](https://github.com/bhauman/lein-figwheel)
* [garden](https://github.com/noprompt/garden)
* [secretary](https://github.com/gf3/secretary)

## Usage

### Create a new application:

```
lein new reagent-seed <app-name>
```

### Generate Source Code from Org Files

In the top-level of your application, run:

```
./scripts/watch.sh src/ ./scripts/tangle-all.sh
```

Press `C-c` to force the initial tangle. If you make any changes to
your .org files, they will automatically get tangled. Press `C-\` to
quit.

Tangling is the process of extracting & combining source blocks from
`.org` files into an actual working project/source tree. Once tangling
is complete, you can `cd` into the generated project directory
(`generated`) and then use `lein` as usual.

### From Inside `generated` Directory

#### Start Cider from Emacs

Put this in your Emacs config file:

```
(setq cider-cljs-lein-repl "(do (use 'figwheel-sidecar.repl-api) (start-figwheel!) (cljs-repl))")
```

Navigate to a clojurescript file and start a figwheel REPL with `cider-jack-in-clojurescript` or (`C-c M-J`).

#### Compile css

Compile css file once.

```
lein garden once
```

Automatically recompile css file on change.

```
lein garden auto
```

#### Run application:

```
lein clean
lein figwheel dev
```

Figwheel will automatically push cljs changes to the browser.

Wait a bit, then browse to [http://localhost:3449](http://localhost:3449).

#### Run tests:

```
lein clean
lein doo phantom test once
```

The above command assumes that you have [phantomjs](https://www.npmjs.com/package/phantomjs) installed. However, please note that [doo](https://github.com/bensu/doo) can be configured to run cljs.test in many other JS environments (chrome, ie, safari, opera, slimer, node, rhino, or nashorn).

#### Devcards

```
lein clean
lein figwheel devcards
```

Figwheel will automatically push cljs changes to the browser. Wait a bit, then browse to [http://localhost:3449/cards.html](http://localhost:3449/cards.html).

To build a minified version:

```
lein clean
lein cljsbuild once hostedcards
```

Then open *resources/public/cards.html*

#### Production Build

```
lein clean
lein cljsbuild once min
```

## Other Templates

* [reagent-figwheel](https://github.com/gadfly361/reagent-figwheel)
* [re-frame-template](https://github.com/Day8/re-frame-template)
* [thi.ng babel*](https://github.com/thi-ng/babel)

* **Special thanks to thi.ng babel template for showing how to use org-mode with clojurescript*

## License

```
The MIT License (MIT)

Copyright © 2014 Matthew Jaoudi

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
```
