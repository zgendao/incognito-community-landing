(ns app.core
  (:require [rum.core :as rum]
            [app.views :as views]))

(defn ^:dev/after-load start []
  (rum/mount (views/app) (.getElementById js/document "app")))

(defn ^:export main []
  (start))
