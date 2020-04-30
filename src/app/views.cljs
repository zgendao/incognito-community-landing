(ns app.views
  (:require [rum.core :as rum :refer [defcs]]))

(defn section-title [text inverse]
  [:div.section-title
   [:div
    [:h2 {:class inverse} text]
    [:hr {:class [inverse]}]]])

(defn hero []
  [:div.hero
   [:div.title-bg
    [:div
     [:img {:src "/images/hero-logo.svg"}]
     [:p "is a privacy movement."]
     [:h1 "Send any cryptocurrencies"]
     [:h1 "completely anonymously."]
     [:div.btn-wrapper
      [:div.join-btn [:a {:href "https://incognito.org/"} "Join us"]]]]]
   [:img {:src "/images/arts/hero.svg"}]])

(defn about []
  [:div.about
   (section-title "WHAT IS INCOGNITO?" nil)
   [:div.flex-wrapper
    [:div.about-text "Incognito is the first network that delivers privacy at scale by implementing proof-of-stake and sharding. It is not another cryptocurrency, but a privacy solution for your existing cryptocurrencies. The network is operated by a large group of small validators."]
    [:img.shard-art {:src "/images/arts/shard.svg"}]]])

(defn sign [value name]
  [:div.block
   [:div.value value]
   [:div.name name]])

(defn data []
  [:div.data
   [:div.data-wrapper
    (sign "$1.54M" "shielded")
    (sign "1257" "validators")
    (sign "40" "dev members")
    (sign "1.4M" "lines of code")]])

(defn why []
  [:div.why
   (section-title "WHY CHOOSE INCOGNITO?" nil)
   [:div.flex-wrapper
    [:div.block
     [:img {:src "/images/arts/block.svg"}]
     [:p "10x faster " [:span "(100-800 TPS) "] "than any other privacy solutions " [:span "(usually less than 10 Transaction/sec)"]]]
    [:div.block
     [:img {:src "/images/arts/block.svg"}]
     [:p "One PRV " [:span "($0.4) could "] "cover " [:span "your transaction & trading fees "] "in the next decade"]]
    [:div.block
     [:img {:src "/images/arts/block.svg"}]
     [:p "It’s completely open-source " [:span "and contributed by members of a "] "global community"]]]])

(def gif (atom "buy"))

(defn function [name title desc1 desc2 side]
  [:div.function {:on-click #(reset! gif name) :class (when (= name @gif) "active")}
   (when (= "right" side) [:img {:src (str "/images/phone/" name "-icon.svg")}])
   [:div
    [:h4 title]
    [:p desc1 [:br] desc2]]
   (when (= "left" side) [:img {:src (str "/images/phone/" name "-icon.svg")}])])

(defn phone []
  [:div.phone
   (section-title "INCOGNITO WALLET" "inverse")
   [:div.flex-wrapper
    [:div.left-functions
     (function "buy" "Buy PRV" "PRV is the fuel of" "Incognito’s blockchain." "left")
     (function "shield" "Shield Crypt" "Put your money " "safe anonimously." "left")
     (function "wallet" "Use the Wallet" "Send and receive " "shielded crypto." "left")]

    [:div.iphone
     [:img {:src "/images/phone/phone.svg"}]]

    [:div.right-functions
     (function "trade" "Trade" "Access to 70+ cryptos in" "decentralized exchange." "right")
     (function "stake" "Stake Nodes" "Be a part of the network" " and earn PRV passively." "right")
     (function "forum" "Join the Forum" "Help the movement with" "your ideas and work." "right")]
    [:div.small-circle]
    [:div.big-circle]]])

(defn node []
  [:div.node
   (section-title "INCOGNITO NODE" nil)
   [:div.flex-wrapper
    [:div.node-text
     [:h3 "Give people privacy. Earn passive income"]
     [:p "You could buy a physical node, or start operating your virtual node on your server. Prerequirements are staking 1750 PRV (~$700) which you could get back anytime if you change your mind."]
     [:p "Incognito nodes have a low power usage and they are ECO friendly."]
     [:p "Rewards from operating a node is random, but you could expect a decent 45%-100% yearly earning in the beginning."]
     [:div.btn-wrapper
      [:div.node-btn "Learn More"]]]
    [:iframe {:src "https://www.youtube.com/embed/bafTu0kGfq4" :frameBorder "0" :allowFullScreen "allowFullScreen"}]]])

(defn questions []
  [:div.questions
   (section-title "QUESTIONS?" nil)
   [:div.flex-wrapper
    [:img {:src "/images/arts/nodes.svg"}]
    [:div.questions-wrapper
     [:h3 "Who made Incognito at the first place?"]
     [:p "A diverse group of 40+ scientists, cryptographers, programmers, entrepreneurs and operators worked on Incognito for 2 years before its launch."]
     [:h3 "How secure is using Incognito?"]
     [:p "You hold your own private keys on your wallet. Always make a backup and store an offline copy of your private keys to be safe! Incognito doesn’t have an access to your accounts and cannot recover them."]
     [:h3 "What is the future of Incognito?"]
     [:p "A decentralized autonomous organization was designed to fund protocol development and network growth. Join the Incognito community now and you will be a part of this revolutionary movement. You could make proposals and get funding!"]]]])

(defn partners []
  [:div.partners
   (section-title "YOU ARE IN A GOOD COMPANY" nil)
   [:div.flex-wrapper
    [:img {:src "/images/partners/binance.png"}]
    [:img {:src "/images/partners/autonomous.png"}]
    [:img {:src "/images/partners/neo.png"}]
    [:img {:src "/images/partners/ontology.png"}]
    [:img {:src "/images/partners/zilliqa.png"}]
    [:img {:src "/images/partners/harmony.png"}]]])

(defn ecosystem []
  [:div.ecosystem
   (section-title "OUR ECOSYSTEM" nil)
   [:div.flex-wrapper
    [:div.card
     [:h3 "Community Forum"]
     [:img {:src "/images/ecosystem/forum.png"}]]
    [:div.card
     [:h3 "pDEX Statistics"]
     [:img {:src "/images/ecosystem/pdex.png"}]]
    [:div.card
     [:h3 "Incognito Explorer"]
     [:img {:src "/images/ecosystem/explorer.png"}]]]])

(defn spotlight []
  [:div.spotlight
   (section-title "PROJECT SPOTLIGHT" "inverse")
   [:div.flex-wrapper
    [:img {:src "/images/white-zgen-logo.svg"}]
    [:div.spotlight-text "This website was made by members of the ZGEN DAO. We created it, because we believe we found a hidden gem of the cryptocurrency world and we decided to introduce Incognito to a wider audience. "]]
   [:div.zgen-desc "ZGEN is a bureaucracy-free online guild of makers & entrepreneurs. Our community is driven by goals & needs of the generation Z."]])

(defcs app []
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
