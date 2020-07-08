(ns app.heroArt_
  (:require [rum.core :as rum :refer [defcs defc reactive react cursor]]
            ["react-samy-svg" :as Samy]))

(defc heroArt_ []
  [:Samy {:path "/images/arts/hero.svg"}])
