(ns hiccup.font-awesome.page
  (:use hiccup.page))

(defn include-font-awesome
  "Add Font Awesome CSS resources to the page."
  []
  (list
   (include-css "/font-awesome/css/font-awesome.css")))
