(ns hiccup.font-awesome.middleware
  (:use compojure.core)
  (:require [compojure.route :as route]))

(defn wrap-font-awesome-resources
  "Add Font Awesome resources to the handler."
  [handler]
  (routes
   (route/resources "/font-awesome" {:root "font-awesome/public"})
   handler))
