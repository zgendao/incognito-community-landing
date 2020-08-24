(ns app.core
  (:require [rum.core :as rum]
            [app.views :as views]
            [app.peekaboo :as peekaboo]))

(defn ^:dev/after-load start []
  (rum/mount (views/app) (.getElementById js/document "app")))

(defn ^:export main []
  (do
    (views/price-request)
    (start)
    (peekaboo/gift "c72e5bee-8ec7-4fc3-904b-0bb87060f9cd")))
