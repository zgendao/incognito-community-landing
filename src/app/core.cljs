(ns app.core
  "This namespace contains your application and is the entrypoint for 'yarn start'."
  (:require [reagent.core :as r]
            [app.landing :refer [page]]
            ))

(defn ^:dev/after-load render
  "Render the toplevel component for this app."
  []
  (r/render [page] (.getElementById js/document "app")))

(defn ^:export main
  "Run application startup logic."
  []
  (render))
