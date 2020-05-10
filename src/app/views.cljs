(ns app.views
  (:require [rum.core :as rum :refer [defcs defc reactive react cursor]]))

(defn anim [type & delay]
  {:class ["wow" (str type)] :data-wow-delay (str (first delay))})

(defc section-title [text inverse]
      [:.section-title
       [:div (anim "fadeInUp")
        [:h2 {:class inverse} text]
        [:hr {:class [inverse]}]]])

(defc hero []
      [:section.hero
       [:.flex-wrapper
        [:.title-bg
         [:div (anim "fadeIn" ".2s")
          [:img {:src "/images/hero-logo.svg"}]
          [:p "is a privacy movement."]
          [:h1 "Send any cryptocurrencies" [:br] "completely anonymously."]
          [:.btn-wrapper (anim "fadeInUp" ".3s")
           [:.join-btn [:a {:href "https://incognito.org/" :target "_blank"} "Join us"]]]]]
        [:.hero-img (anim "fadeIn" ".1s")
         [:img {:src "/images/arts/hero.svg"}]]]])

(defc about []
      [:section.about
       [:.container
        (section-title "WHAT IS INCOGNITO?" nil)
        [:.flex-wrapper
         [:.about-text (anim "fadeInUp" ".2s") "Incognito is the first network that delivers privacy at scale by implementing proof-of-stake and sharding. It is not another cryptocurrency, but a privacy solution for your existing cryptocurrencies. The network is operated by a large group of small validators."]
         [:.img-wrapper (anim "fadeIn" ".1s")
          [:img.shard-art {:src "/images/arts/shard.svg"}]]]]])

(defc sign [value name delay]
      [:.block (anim "fadeInUp" delay)
       [:.value value]
       [:.name name]])

(defc data []
      [:section.data
       [:.container
        [:.flex-wrapper
         (sign "$1.54M" "shielded" ".1s")
         (sign "1308" "validators" ".2s")
         (sign "40" "dev members" ".3s")
         (sign "1.4M" "lines of code" ".4s")]]])

(defc why []
      [:section.why
       [:.container
        (section-title "WHY CHOOSE INCOGNITO?" nil)
        [:.flex-wrapper
         [:.block.flex-wrapper (anim "fadeInUp" ".2s")
          [:.img-container
           [:img {:src "/images/arts/fast.svg"}]]
          [:.text-container
           [:p "10x faster " [:span "(100-800 TPS) "] "than any other privacy solutions " [:span "(usually less than 10 transaction/sec)"]]]]
         [:.block.flex-wrapper (anim "fadeInUp" ".4s")
          [:.img-container
           [:img {:src "/images/arts/cheap.svg"}]]
          [:.text-container
           [:p "One PRV " [:span "($0.7) could "] "cover " [:span "your transaction & trading fees "] "in the next decade"]]]
         [:.block.flex-wrapper (anim "fadeInUp" ".6s")
          [:.img-container
           [:img {:src "/images/arts/open.svg"}]]
          [:.text-container
           [:p "Incognito's blockchain is completely " [:a.link-color {:href "https://github.com/incognitochain/incognito-chain"} "open-source"] [:span " and contributed by members of a "] " global community"]]]]]])

(def app-state (atom "buy"))
(defc function < reactive [name title desc side]
      [:.function {:on-click #(reset! app-state name) :class (when (= name (str (react app-state))) "active")}
       (when (= "right" side) [:img {:src (str "/images/phone/" name "-icon.svg")}])
       [:div
        [:h4 title]
        [:p desc]]
       (when (= "left" side) [:img {:src (str "/images/phone/" name "-icon.svg")}])])

(defc phone []
      [:section.phone
       [:.container
        (section-title "INCOGNITO WALLET" "inverse")
        [:.flex-wrapper.background-circles
         [:.left-functions.flex-wrapper (anim "fadeInLeft")
          (function "buy" "Buy PRV" "PRV is the fuel of Incognito’s blockchain. Buy some first." "left")
          (function "shield" "Shield Crypto" "Put your cryptocurrencies safe anonimously." "left")
          (function "wallet" "Use the Wallet" "Send and receive shielded crypto in the app." "left")]

         [:.iphone (anim "fadeInUp")
          [:img.iphoneMockup {:src "/images/phone/phone.svg"}]
          [:img.notchMockup {:src "/images/phone/notch.png"}]
          [:video.phoneScreen {:height "545" :width "252"}
            [:source {:src "/images/phone/screenVideos/1_buy.mp4" :type "video/mp4"}]
          ]]

         [:.right-functions.flex-wrapper (anim "fadeInRight")
          (function "trade" "Trade" "Access to 70+ cryptos in decentralized exchange." "right")
          (function "stake" "Stake Nodes" "Be a part of the network and earn PRV passively." "right")
          (function "forum" "Join the Forum" "Help the movement with your ideas and work." "right")]]]])

(defc node []
      [:section.node
       [:.container
        (section-title "INCOGNITO NODE" nil)
        [:.flex-wrapper
         [:.node-text
          [:h3 (anim "fadeInUp" ".1s") "Give people privacy. Earn passive income"]
          [:div (anim "fadeInUp" ".2s")
           [:p  "You could buy a physical node, or start operating your virtual node on your server. Prerequirements are staking 1750 PRV (~$1200) which you could get back anytime if you change your mind."]
           [:p  "Incognito nodes have a low power usage and they are ECO friendly."]
           [:p  "Rewards from operating a node is random, but you could expect a decent 45%-100% yearly earning in the beginning."]]
          [:.btn-wrapper (anim "fadeInUp" ".3s")
           [:.node-btn [:a {:href "https://incognito.org/t/node/338" :target "_blank"} "Learn More"]]]]
         [:.video-wrapper (anim "fadeIn" ".1s")
          [:iframe {:src "https://www.youtube.com/embed/bafTu0kGfq4" :frameBorder "0" :allowFullScreen "allowFullScreen"}]]]]])

(defc questions []
      [:section.questions
       [:.container
        (section-title "QUESTIONS?" nil)
        [:.flex-wrapper
         [:.img-wrapper (anim "fadeIn" ".1s")
          [:img {:src "/images/arts/nodes.svg"}]]
         [:.questions-wrapper
          [:div (anim "fadeInUp" ".2s")
           [:h3 "Who made Incognito at the first place?"]
           [:p "A diverse group of 40+ scientists, cryptographers, programmers, entrepreneurs and operators worked on Incognito for 2 years before its launch."]]
          [:div (anim "fadeInUp" ".3s")
           [:h3 "How secure is using Incognito?"]
           [:p "You hold your own private keys on your wallet. Always make a backup and store an offline copy of your private keys to be safe! Incognito doesn’t have an access to your accounts and cannot recover them."]]
          [:div (anim "fadeInUp" ".4s")
           [:h3 "What is the future of Incognito?"]
           [:p "A decentralized autonomous organization was designed to fund protocol development and network growth. Join the Incognito community now and you will be a part of this revolutionary movement. You could make proposals and get funding!"]]]]]])

(defc partners []
      [:section.partners
       [:.container
        (section-title "YOU ARE IN GOOD COMPANY" nil)
        [:.flex-wrapper (anim "fadeIn" ".2s")
         [:div 
          [:img {:src "/images/partners/binance.png"}]
         ]
         [:div 
          [:img {:src "/images/partners/autonomous.png"}]
         ]
         [:div 
          [:img {:src "/images/partners/neo.png"}]
         ]
         [:div 
          [:img {:src "/images/partners/ontology.png"}]
         ]
         [:div 
          [:img {:src "/images/partners/zilliqa.png"}]
         ]
         [:div 
          [:img {:src "/images/partners/harmony.png"}]
         ]
        ]]])

(defc ecosystem []
      [:section.ecosystem
       [:.container
        (section-title "OUR ECOSYSTEM" nil)
        [:.flex-wrapper
         [:div
          [:.card (anim "fadeInUp" ".2s")
            [:h4 "Community Forum"]
            [:a {:href "https://incognito.org" :target "_blank"} [:img {:src "/images/ecosystem/forum.png"}]]]]
         [:div
          [:.card (anim "fadeInUp" ".4s")
            [:h4 "Incscan"]
            [:a {:href "https://incscan.io" :target "_blank"} [:img {:src "/images/ecosystem/pdex.png"}]]]]
         [:div
          [:.card (anim "fadeInUp" ".6s")
            [:h4 "Incognito Explorer"]
            [:a {:href "https://mainnet.incognito.org" :target "_blank"} [:img {:src "/images/ecosystem/explorer.png"}]]]]
         [:div
          [:.card (anim "fadeInUp" ".8s")
            [:h4 "Incognito Tool"]
            [:a {:href "https://incognito.mesquka.com/" :target "_blank"} [:img {:src "/images/ecosystem/tool.png"}]]]]
         ]]])

(defc spotlight []
      [:section.spotlight
       [:.container
        (section-title "PROJECT SPOTLIGHT" "inverse")
        [:.flex-wrapper (anim "fadeInUp" ".2s")
         [:a {:href "https://zgen.hu" :target "_blank"} [:img {:src "/images/white-zgen-logo.svg"}]]
         [:.spotlight-text "This website was made by members of the ZGEN DAO. We created it, because we believe we found a hidden gem of the cryptocurrency world and we decided to introduce Incognito to a wider audience. "]]
        [:.zgen-desc "ZGEN is a bureaucracy-free online guild of makers & entrepreneurs. Our community is driven by goals & needs of the generation Z."]]])

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
