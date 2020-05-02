(ns app.views
  (:require [rum.core :as rum :refer [defcs]]))

(defn section-title [text inverse]
  [:div.section-title
   [:div
    [:h2 {:class inverse} text]
    [:hr {:class [inverse]}]]])

(defn hero []
  [:section.hero
   [:div.flex-wrapper
    [:div.title-bg
      [:div
      [:img {:src "/images/hero-logo.svg"}]
      [:p "is a privacy movement."]
      [:h1 "Send any cryptocurrencies" [:br] "completely anonymously."]
      [:div.btn-wrapper
        [:div.join-btn [:a {:href "https://incognito.org/"} "Join us"]]]]]
    [:div.hero-img
      [:img {:src "/images/arts/hero.svg"}]]]])

(defn about []
  [:section.about
   [:div.container
    (section-title "WHAT IS INCOGNITO?" nil)
    [:div.flex-wrapper
      [:div.about-text "Incognito is the first network that delivers privacy at scale by implementing proof-of-stake and sharding. It is not another cryptocurrency, but a privacy solution for your existing cryptocurrencies. The network is operated by a large group of small validators."]
      [:div.img-wrapper
       [:img.shard-art {:src "/images/arts/shard.svg"}]]]]])

(defn sign [value name]
  [:div.block
   [:div.value value]
   [:div.name name]])

(defn data []
  [:section.data
   [:div.container
    [:div.flex-wrapper
      (sign "$1.54M" "shielded")
      (sign "1257" "validators")
      (sign "40" "dev members")
      (sign "1.4M" "lines of code")]]])

(defn why []
  [:section.why
   [:div.container
    (section-title "WHY CHOOSE INCOGNITO?" nil)
    [:div.flex-wrapper
     [:div.block.flex-wrapper
      [:div.img-container
        [:img {:src "/images/arts/block.svg"}]]
      [:div.text-container
        [:p "10x faster " [:span "(100-800 TPS) "] "than any other privacy solutions " [:span "(usually less than 10 Transaction/sec)"]]]]
     [:div.block.flex-wrapper
      [:div.img-container
        [:img {:src "/images/arts/block.svg"}]]
      [:div.text-container
        [:p "One PRV " [:span "($0.4) could "] "cover " [:span "your transaction & trading fees "] "in the next decade"]]]
     [:div.block.flex-wrapper
      [:div.img-container
        [:img {:src "/images/arts/block.svg"}]]
      [:div.text-container
        [:p "It’s completely open-source " [:span "and contributed by members of a "] "global community"]]]]]])

(def gif (atom "buy"))

(defn function [name title desc side]
  [:div.function {:on-click #(reset! gif name) :class (when (= name @gif) "active")}
   (when (= "right" side) [:img {:src (str "/images/phone/" name "-icon.svg")}])
   [:div
    [:h4 title]
    [:p desc]]
   (when (= "left" side) [:img {:src (str "/images/phone/" name "-icon.svg")}])])

(defn phone []
  [:section.phone
   [:div.container
    (section-title "INCOGNITO WALLET" "inverse")
    [:div.flex-wrapper.background-circles
      [:div.left-functions.flex-wrapper
      (function "buy" "Buy PRV" "PRV is the fuel of Incognito’s blockchain." "left")
      (function "shield" "Shield Crypt" "Put your money safe anonimously." "left")
      (function "wallet" "Use the Wallet" "Send and receive shielded crypto." "left")]

      [:div.iphone
      [:img {:src "/images/phone/phone.svg"}]]

      [:div.right-functions.flex-wrapper
      (function "trade" "Trade" "Access to 70+ cryptos in decentralized exchange." "right")
      (function "stake" "Stake Nodes" "Be a part of the network and earn PRV passively." "right")
      (function "forum" "Join the Forum" "Help the movement with your ideas and work." "right")]
      ]]])

(defn node []
  [:section.node
   [:div.container
    (section-title "INCOGNITO NODE" nil)
    [:div.flex-wrapper
      [:div.node-text
      [:h3 "Give people privacy. Earn passive income"]
      [:p "You could buy a physical node, or start operating your virtual node on your server. Prerequirements are staking 1750 PRV (~$700) which you could get back anytime if you change your mind."]
      [:p "Incognito nodes have a low power usage and they are ECO friendly."]
      [:p "Rewards from operating a node is random, but you could expect a decent 45%-100% yearly earning in the beginning."]
      [:div.btn-wrapper
        [:div.node-btn "Learn More"]]]
      [:div.video-wrapper
      [:iframe {:src "https://www.youtube.com/embed/bafTu0kGfq4" :frameBorder "0" :allowFullScreen "allowFullScreen"}]]]]])

(defn questions []
  [:section.questions
   [:div.container
    (section-title "QUESTIONS?" nil)
    [:div.flex-wrapper
      [:div.img-wrapper
      [:img {:src "/images/arts/nodes.svg"}]]
      [:div.questions-wrapper
      [:h3 "Who made Incognito at the first place?"]
      [:p "A diverse group of 40+ scientists, cryptographers, programmers, entrepreneurs and operators worked on Incognito for 2 years before its launch."]
      [:h3 "How secure is using Incognito?"]
      [:p "You hold your own private keys on your wallet. Always make a backup and store an offline copy of your private keys to be safe! Incognito doesn’t have an access to your accounts and cannot recover them."]
      [:h3 "What is the future of Incognito?"]
      [:p "A decentralized autonomous organization was designed to fund protocol development and network growth. Join the Incognito community now and you will be a part of this revolutionary movement. You could make proposals and get funding!"]]]]])

(defn partners []
  [:section.partners
   [:div.container
    (section-title "YOU ARE IN A GOOD COMPANY" nil)
    [:div.flex-wrapper
      [:img {:src "/images/partners/binance.png"}]
      [:img {:src "/images/partners/autonomous.png"}]
      [:img {:src "/images/partners/neo.png"}]
      [:img {:src "/images/partners/ontology.png"}]
      [:img {:src "/images/partners/zilliqa.png"}]
      [:img {:src "/images/partners/harmony.png"}]]]])

(defn ecosystem []
  [:section.ecosystem
   [:div.container
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
       [:img {:src "/images/ecosystem/explorer.png"}]]]]])

(defn spotlight []
  [:section.spotlight
   [:div.container
    (section-title "PROJECT SPOTLIGHT" "inverse")
    [:div.flex-wrapper
      [:img {:src "/images/white-zgen-logo.svg"}]
      [:div.spotlight-text "This website was made by members of the ZGEN DAO. We created it, because we believe we found a hidden gem of the cryptocurrency world and we decided to introduce Incognito to a wider audience. "]]
    [:div.zgen-desc "ZGEN is a bureaucracy-free online guild of makers & entrepreneurs. Our community is driven by goals & needs of the generation Z."]]])

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
