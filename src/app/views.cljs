(ns app.views)

(defn section-title [text inverse]
  [:section-title
   [:div
    [:h2 {:class inverse} text]
    [:hr {:class [inverse "section-hr"]}]]])

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
   [:img {:src "/images/hero.svg"}]])

(defn about []
  [:div.about
   [section-title "WHAT IS INCOGNITO?"]
   [:flex-wrapper
    [:about-text "Incognito is the first network that delivers privacy at scale by implementing proof-of-stake and sharding. It is not another cryptocurrency, but a privacy solution for your existing cryptocurrencies. The network is operated by a large group of small validators."]
    [:img.shard-art {:src "/images/shard.svg"}]]])

(defn data []
  [:div.data
   [:data-wrapper
    [:d-block
     [:d-value "$1.54M"]
     [:d-name "shielded"]]
    [:d-block
     [:d-value "1257"]
     [:d-name "validators"]]
    [:d-block
     [:d-value "40"]
     [:d-name "dev members"]]
    [:d-block
     [:d-value "1.4M"]
     [:d-name "lines of code"]]]])

(defn why []
  [:div.why
   [section-title "WHY CHOOSE INCOGNITO?"]
   [:flex-wrapper
    [:w-block
     [:img {:src "/images/block.svg"}]
     [:p "10x faster " [:span "(100-800 TPS) "] "than any other privacy solutions " [:span "(usually less than 10 Transaction/sec)"]]]
    [:w-block
     [:img {:src "/images/block.svg"}]
     [:p "One PRV " [:span "($0.4) could "] "cover " [:span "your transaction & trading fees "] "in the next decade"]]
    [:w-block
     [:img {:src "/images/block.svg"}]
     [:p "It’s completely open-source " [:span "and contributed by members of a "] "global community"]]]])

(defn mobile []
  [:div.mobile
   [section-title "INCOGNITO WALLET" "inverse"]])

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
    [:img {:src "/images/nodes.svg"}]
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
    [:img {:src "/images/binance.png"}]
    [:img {:src "/images/autonomous.png"}]
    [:img {:src "/images/neo.png"}]
    [:img {:src "/images/ontology.png"}]
    [:img {:src "/images/zilliqa.png"}]
    [:img {:src "/images/harmony.png"}]]])

(defn ecosystem []
  [:div.ecosystem
   [section-title "OUR ECOSYSTEM"]
   [:flex-wrapper
    [:e-card
     [:h3 "Community Forum"]
     [:img {:src "/images/forum.png"}]]
    [:e-card
     [:h3 "pDEX Statistics"]
     [:img {:src "/images/pdex.png"}]]
    [:e-card
     [:h3 "Incognito Explorer"]
     [:img {:src "/images/explorer.png"}]]]])

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
   (mobile)
   (node)
   (questions)
   (partners)
   (ecosystem)
   (spotlight)])
