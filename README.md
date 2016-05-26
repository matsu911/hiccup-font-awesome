# Hiccup-Font-Awesome

[![Clojars Project](https://img.shields.io/clojars/v/hiccup-font-awesome.svg)](https://clojars.org/hiccup-font-awesome)

Hiccup-Font-Awesome provides [Hiccup][1] functions for [Font Awesome][2].

[1]: https://github.com/weavejester/hiccup
[2]: http://fontawesome.io/

## Installation

Add the following dependency to your `project.clj` file:

    [hiccup-font-awesome "0.1.0-SNAPSHOT"]

Note that if you're using Ring, you'll need version 1.1.0 or later.

## Usage

Add the `wrap-font-awesome-resources` middleware to your handler to
automatically add routes for the Font Awesome CSS files:

```clojure
(use 'hiccup.font-awesome.middleware)

(def app
  (wrap-font-awesome-resources handler))
```

Then in your Hiccup template, add in `include-font-awesome` in the page
header:

```clojure
(use 'hiccup.core
     'hiccup.page
     'hiccup.font-awesome.page)

(defn page []
  (html5
    [:head
      [:title "Font-Awesome Example"]
      (include-font-awesome)]
    [:body
      [:h1 "Font-Awesome Example"]
      [:i.fa.fa-bomb]))
```

## License

Copyright © 2016 Shigeaki Matsumura

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
