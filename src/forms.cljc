(ns forms
  (:require
            [inside-out.reagent :refer [with-form]]))

(defn app
  []
  (with-form [contact-info {:person/name ?name}]
   [:div
    [:input.border.p-3
     {:value @?name
      :on-change (fn [event] (reset! ?name (.. event -target -value)))
      :placeholder "Your name:"}]
    [:pre (str @contact-info)]]))
