(ns simple-cljs-app.core
  (:require [goog.dom :as gdom]
            [reagent.dom :as dom]))

(defn hello-world []
    [:div "Hello world!"])

(dom/render [hello-world] (gdom/getElement "app"))
