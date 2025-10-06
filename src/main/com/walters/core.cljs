(ns com.walters.core
  (:require [reagent.core :as r]
            [reagent.dom :as rdom]))

(defn another-component []
  [:div
   [:p "I am another component"]
   [:p
    "I have " [:strong "bold"
                       [:span {:style {:color "blue"}} " and blue "] "text."]]])
 
(defn simple-component []
  [:div
   [:p "I am a parent component"]
   [:p
    "I have " [:strong "bold"
                       [:span {:style {:color "orange"}} " and red "] "text."]]
   [another-component]])


(defn mount-root []
  (rdom/render [simple-component]
               (.getElementById js/document "app")))

(defn ^:export run []
  (mount-root))

(defn ^:dev/after-load reload []
  (mount-root))

(comment
  (js/alert "Hello, World!")
  (another-component))
  
