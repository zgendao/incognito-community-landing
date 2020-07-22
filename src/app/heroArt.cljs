(ns app.heroArt
  (:require [rum.core :as rum :refer [defcs defc reactive react cursor]]
            ["react-svgmt" :refer [SvgLoader]]))

(defc heroArt < rum/static
      []
      (js/React.createElement
       SvgLoader
       #js {:path "/images/arts/hero.svg"}))
