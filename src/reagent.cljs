(ns reagent
  (:require [reagent.core :as r]
            [reagent.dom :refer [render]]
            [malli.core :as m]
            [forms :refer [app]]))

(defn ^:export init
  []
  (render
   [app]
   (.getElementById js/document "app")))
