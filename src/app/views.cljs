(ns app.views
  (:require [rum.core :as rum]))

(defn section-title
  ([text inverse]
   [:.section-title
    [:div
     [:h2 {:class inverse} text]
     [:hr {:class [inverse]}]]])
  ([text]
   (section-title text nil)))

(defn image [src]
  [:img {:src (str "/images/" src)}])

(defn video [src]
  [:iframe {:src (str "https://www.youtube.com/embed/" src) :frameBorder "0" :allowFullScreen "allowFullScreen"}])

(defn card [title src]
  [:.card
   [:h3 title]
   (image src)])

(defn faq [& elements]
  [:.questions-wrapper
   (map-indexed
     (fn [i text]
       (if-not (odd? i)
         [:h3 text]
         [:p text])) elements)])

(defn function [app-state title tag description image-src]
  [:.function {:on-click #(reset! app-state tag) :class (when (= tag @app-state) "active")}
   [:div
    [:h4 title]
    description]
   (image image-src)])

(defn section [classname title style & components]
  [:div {:class classname}
   (when title (section-title title style))
   (vec (concat (if (= classname "data") [:.data-wrapper] [:.flex-wrapper]) components))])

(defn hero []
  [:.hero
   [:.title-bg
    [:div
     (image "hero-logo.svg")
     [:p "is a privacy movement."]
     [:h1 "Send any cryptocurrencies"]
     [:h1 "completely anonymously."]
     [:.btn-wrapper [:.join-btn>a {:href "www.google.com"} "Join us"]]]]
   (image "arts/hero.svg")])

(rum/defcs app < (rum/local "buy" ::key)
  [state]
  (let [app-state (::key state)
        function (partial function app-state)]
  [:div
   (hero)
   (section
     "about" "WHAT IS INCOGNITO?" nil
     [:.about-text "Incognito is the first network that delivers privacy at scale by implementing proof-of-stake and sharding. It is not another cryptocurrency, but a privacy solution for your existing cryptocurrencies. The network is operated by a large group of small validators."]
     (image "arts/shard.svg"))
   (section
     "data" nil nil
     (map
       (fn [[value n]]
         [:.block
          [:.value value]
          [:.name n]])
       [["$1.54M" "shielded"]
        [1257 "validators"]
        [40 "dev members"]
        ["1.4M" "lines of code"]]))
   (section
     "why" "WHY CHOOSE INCOGNITO?" nil
     (map
       (fn [text]
         [:.block
          (image "arts/block.svg")
          text])
       [[:p "10x faster " [:span "(100-800 TPS) "] "than any other privacy solutions " [:span "(usually less than 10 Transaction/sec)"]]
        [:p "One PRV " [:span "($0.4) could "] "cover " [:span "your transaction & trading fees "] "in the next decade"]
        [:p "It’s completely open-source " [:span "and contributed by members of a "] "global community"]]))
   (section
     "phone" "INCOGNITO WALLET" "inverse"
     [:.left-functions
      (function
        "Buy PRV" "buy" 
        [:p "PRV is the fuel of" [:br] "Incognito’s blockchain."]
        "phone/prv-icon.svg")
      (function
        "Shield Crypt" "shield" 
        [:p "Put your money " [:br] "safe anonimously. "]
        "phone/shield-icon.svg")
      (function
        "Use the Wallet" "wallet" 
        [:p "Send and receive " [:br] "shielded crypto."]
        "phone/wallet-icon.svg")]
     [:.iphone (image "phone/phone.svg")]
     [:div.right-functions
      (function
        "Trade" "trade" 
        [:p "Access to 70+ cryptos in" [:br] "decentralized exchange."]
        "phone/trade-icon.svg")
      (function
        "Stake Nodes" "stake" 
        [:p "Be a part of the network" [:br] " and earn PRV passively."]
        "phone/node-icon.svg")
      (function
        "Join the Forum" "forum" 
        [:div
         [:h4 "Join the Forum"]
         [:p "Help the movement with" [:br] "your ideas and work."]]
        "phone/forum-icon.svg")]
     [:.small-circle]
     [:.big-circle])
   (section
     "node" "INCOGNITO NODE" nil
     [:.node-text
      [:h3 "Give people privacy. Earn passive income"]
      [:p "You could buy a physical node, or start operating your virtual node on your server. Prerequirements are staking 1750 PRV (~$700) which you could get back anytime if you change your mind."]
      [:p "Incognito nodes have a low power usage and they are ECO friendly."]
      [:p "Rewards from operating a node is random, but you could expect a decent 45%-100% yearly earning in the beginning."]
      [:.btn-wrapper
       [:.node-btn "Learn More"]]]
     (video "bafTu0kGfq4"))
   (section
     "questions" "QUESTIONS?" nil
     (image "arts/nodes.svg")
     (faq
       "Who made Incognito at the first place?"
       "A diverse group of 40+ scientists, cryptographers, programmers, entrepreneurs and operators worked on Incognito for 2 years before its launch."
       "How secure is using Incognito?"
       "You hold your own private keys on your wallet. Always make a backup and store an offline copy of your private keys to be safe! Incognito doesn’t have an access to your accounts and cannot recover them."
       "What is the future of Incognito?"
       "A decentralized autonomous organization was designed to fund protocol development and network growth. Join the Incognito community now and you will be a part of this revolutionary movement. You could make proposals and get funding!"))
   (section 
     "partners" "YOU ARE IN A GOOD COMPANY" nil
     (image "partners/binance.png")
     (image "partners/autonomous.png")
     (image "partners/neo.png")
     (image "partners/ontology.png")
     (image "partners/zilliqa.png")
     (image "partners/harmony.png"))
   (section
     "ecosystem" "OUR ECOSYSTEM" nil
     (card "Community Forum" "ecosystem/forum.png")
     (card "pDEX Statistics" "ecosystem/pdex.png")
     (card "Incognito Explorer" "ecosystem/explorer.png"))
   (section
     "spotlight" "PROJECT SPOTLIGHT" "inverse"
     (image "white-zgen-logo.svg")
     [:.spotlight-text "This website was made by members of the ZGEN DAO. We created it, because we believe we found a hidden gem of the cryptocurrency world and we decided to introduce Incognito to a wider audience. "])
   
   [:.zgen-desc "ZGEN is a bureaucracy-free online guild of makers & entrepreneurs. Our community is driven by goals & needs of the generation Z."]
   
   ]))
