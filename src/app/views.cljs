(ns app.views
  (:require [reagent.core :refer [atom]]))

(def gif (atom "buy"))

(defn section-title [text inverse]
  [:section-title
   [:div
    [:h2 {:class inverse} text]
    [:hr {:class [inverse]}]]])

(defn hero []
  [:div.hero
   [:hero-title-bg
    [:div
     [:img {:src "/images/hero-logo.svg"}]
     [:p "is a privacy movement."]
     [:h1 "Send any cryptocurrencies"]
     [:h1 "completely anonymously."]
     [:btn-wrapper
      [:join-btn "Join us"]]]]
   [:img {:src "/images/arts/hero.svg"}]])

(defn about []
  [:div.about
   [section-title "WHAT IS INCOGNITO?"]
   [:flex-wrapper
    [:about-text "Incognito is the first network that delivers privacy at scale by implementing proof-of-stake and sharding. It is not another cryptocurrency, but a privacy solution for your existing cryptocurrencies. The network is operated by a large group of small validators."]
    [:img.shard-art {:src "/images/arts/shard.svg"}]]])

(defn data []
  [:div.data
   [:data-wrapper
    [:div
     [:value "$1.54M"]
     [:name "shielded"]]
    [:div
     [:value "1257"]
     [:name "validators"]]
    [:div
     [:value "40"]
     [:name "dev members"]]
    [:div
     [:value "1.4M"]
     [:name "lines of code"]]]])

(defn why []
  [:div.why
   [section-title "WHY CHOOSE INCOGNITO?"]
   [:flex-wrapper
    [:block
     [:img {:src "/images/arts/block.svg"}]
     [:p "10x faster " [:span "(100-800 TPS) "] "than any other privacy solutions " [:span "(usually less than 10 Transaction/sec)"]]]
    [:block
     [:img {:src "/images/arts/block.svg"}]
     [:p "One PRV " [:span "($0.4) could "] "cover " [:span "your transaction & trading fees "] "in the next decade"]]
    [:block
     [:img {:src "/images/arts/block.svg"}]
     [:p "It’s completely open-source " [:span "and contributed by members of a "] "global community"]]]])

(defn phone []
  [:div.phone
   [section-title "INCOGNITO WALLET" "inverse"]
   [:flex-wrapper
    [:left-functions
     [:function {:on-click #(reset! gif "buy") :class (when (= "buy" @gif) "active")}
      [:div
       [:h4 "Buy PRV"]
       [:p "PRV is the fuel of" [:br] "Incognito’s blockchain."]]
      [:img {:src "/images/phone/prv-icon.svg"}]]
     [:function {:on-click #(reset! gif "shield") :class (when (= "shield" @gif) "active")}
      [:div
       [:h4 "Shield Crypt"]
       [:p "Put your money " [:br] "safe anonimously. "]]
      [:img {:src "/images/phone/shield-icon.svg"}]]
     [:function {:on-click #(reset! gif "wallet") :class (when (= "wallet" @gif) "active")}
      [:div
       [:h4 "Use the Wallet"]
       [:p "Send and receive " [:br] "shielded crypto."]]
      [:img {:src "/images/phone/wallet-icon.svg"}]]]
    [:iphone
     [:img {:src "/images/phone/phone.svg"}]]
    [:right-functions
     [:function {:on-click #(reset! gif "trade") :class (when (= "trade" @gif) "active")}
      [:img {:src "/images/phone/trade-icon.svg"}]
      [:div
       [:h4 "Trade"]
       [:p "Access to 70+ cryptos in" [:br] "decentralized exchange."]]]
     [:function {:on-click #(reset! gif "stake") :class (when (= "stake" @gif) "active")}
      [:img {:src "/images/phone/node-icon.svg"}]
      [:div
       [:h4 "Stake Nodes"]
       [:p "Be a part of the network" [:br] " and earn PRV passively."]]]
     [:function {:on-click #(reset! gif "forum") :class (when (= "forum" @gif) "active")}
      [:img {:src "/images/phone/forum-icon.svg"}]
      [:div
       [:h4 "Join the Forum"]
       [:p "Help the movement with" [:br] "your ideas and work."]]]]]])

(defn node []
  [:div.node
   [section-title "INCOGNITO NODE"]
   [:flex-wrapper
    [:node-text
     [:h3 "Give people privacy. Earn passive income"]
     [:p "You could buy a physical node, or start operating your virtual node on your server. Prerequirements are staking 1750 PRV (~$700) which you could get back anytime if you change your mind."]
     [:p "Incognito nodes have a low power usage and they are ECO friendly."]
     [:p "Rewards from operating a node is random, but you could expect a decent 45%-100% yearly earning in the beginning."]
     [:btn-wrapper
      [:node-btn "Learn More"]]]
    [:iframe {:src "https://www.youtube.com/embed/bafTu0kGfq4" :frameBorder "0" :allowFullScreen "allowFullScreen"}]]])

(defn questions []
  [:div.questions
   [section-title "QUESTIONS?"]
   [:flex-wrapper
    [:img {:src "/images/arts/nodes.svg"}]
    [:questions-wrapper
     [:h3 "Who made Incognito at the first place?"]
     [:p "A diverse group of 40+ scientists, cryptographers, programmers, entrepreneurs and operators worked on Incognito for 2 years before its launch."]
     [:h3 "How secure is using Incognito?"]
     [:p "You hold your own private keys on your wallet. Always make a backup and store an offline copy of your private keys to be safe! Incognito doesn’t have an access to your accounts and cannot recover them."]
     [:h3 "What is the future of Incognito?"]
     [:p "A decentralized autonomous organization was designed to fund protocol development and network growth. Join the Incognito community now and you will be a part of this revolutionary movement. You could make proposals and get funding!"]]]])

(defn partners []
  [:div.partners
   [section-title "YOU ARE IN A GOOD COMPANY"]
   [:flex-wrapper
    [:img {:src "/images/partners/binance.png"}]
    [:img {:src "/images/partners/autonomous.png"}]
    [:img {:src "/images/partners/neo.png"}]
    [:img {:src "/images/partners/ontology.png"}]
    [:img {:src "/images/partners/zilliqa.png"}]
    [:img {:src "/images/partners/harmony.png"}]]])

(defn ecosystem []
  [:div.ecosystem
   [section-title "OUR ECOSYSTEM"]
   [:flex-wrapper
    [:card
     [:h3 "Community Forum"]
     [:img {:src "/images/ecosystem/forum.png"}]]
    [:card
     [:h3 "pDEX Statistics"]
     [:img {:src "/images/ecosystem/pdex.png"}]]
    [:card
     [:h3 "Incognito Explorer"]
     [:img {:src "/images/ecosystem/explorer.png"}]]]])

(defn spotlight []
  [:div.spotlight
   [section-title "PROJECT SPOTLIGHT" "inverse"]
   [:flex-wrapper
    [:img {:src "/images/white-zgen-logo.svg"}]
    [:spotlight-text "This website was made by members of the ZGEN DAO. We created it, because we believe we found a hidden gem of the cryptocurrency world and we decided to introduce Incognito to a wider audience. "]]
   [:zgen-desc "ZGEN is a bureaucracy-free online guild of makers & entrepreneurs. Our community is driven by goals & needs of the generation Z."]])

(defn app []
  [:div
   (hero)
   (about)
   (data)
   (why)
   (phone)
   (node)
   (questions)
   (partners)
   (ecosystem)
   (spotlight)])
