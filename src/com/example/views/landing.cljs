(ns com.example.views.landing
  (:require
   [helix.core :refer [defnc]]
   [helix.dom :as d]
   [helix.hooks :as hh]))

(defnc landing []
  (let [[count set-count] (hh/use-state 0)]
    (d/div
     {:class "bg-gray-100 p-4 text-center"}
     (d/h1
      {:class "text-xl mb-4"}
      "Click Count: " count)
     (d/button
      {:class "bg-blue-500 text-white px-4 py-2 rounded"
       :on-click #(set-count (inc count))}
      "Click Me!"))))

