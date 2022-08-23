(ns reagent
  (:require [reagent.core :as r]
            [reagent.dom :refer [render]]))

(defn app
  []
  [:div.container])

(defn ^:export init
  []
  (render
    [app]
    (.getElementById js/document "app")))
