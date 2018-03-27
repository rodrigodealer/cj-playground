(ns bibliothek-cj.handler
  (:use compojure.core)
  (:require [compojure.handler :as handler]
            [compojure.route :as route]))

(defn- str-to [num]
  (apply str (interpose ", " (range 1 (inc num)))))

(defroutes app-routes
  (GET "/" [] "Hello World")
  (GET "/count/:to" [to] (str-to (Integer. to)))
  (route/resources "/")
  (route/not-found "Not Found"))

(def app
  (handler/site app-routes))