(ns app.landing
  (:require
    [reagent.core :as r]
    ["lightweight-charts" :as charts]
    ["moment" :as moment]
    ["materialize-css" :as materialize]
    [cljs.pprint :as pprint]
    [alandipert.storage-atom :refer [local-storage]]
    [cognitect.transit :as t]
    ))

(defn page []
  [:<>
   [:nav
    [:div.nav-wrapper
     [:a.brand-logo "Incognito"]
     [:ul.right.hide-on-med-and-down
      [:li
       [:a
        {:href "sass.html"}
        [:i.material-icons.left "search"]
        "Go to the forum"]]
      [:li
       [:a
        {:href "badges.html"}
        [:i.material-icons.right "view_module"]
        "FAQ"]]
      ]
     ]]
   
   
   [:div {:style {:min-height "60vh"}}
    [:h4 "is a privacy movement, with a new blockchain, where you could send, receive, trade and borrow any cryptocurrencies – completely anonymously."]
    ]

   [:div 
    [:ul.collection
     

     [:li.collection-item
      [:h3 "How Incognito works?"]
      [:p "Incognito is the first network that delivers privacy at scale by implementing proof-of-stake and sharding. It is not another cryptocurrency, but a privacy solution for your existing cryptocurrencies. The network is operated by a large group of small validators."]]

     [:li.collection-item
      [:h3 "How Incognito operates?"]
      [:p "Similarly like the Linux or Wikimedia foundation, everything is completely open-source and contributed by members of a global community."]]

     [:li.collection-item
      [:h3 "Who made Incognito at the first place?"]
      [:p "A diverse group of 40+ scientists, cryptographers, programmers, entrepreneurs and operators worked on Incognito for 2 years. It is also one of the most active project in the blockchain space."]]

     [:li.collection-item
      [:h3 "Why choose Incognito as your privacy solution?"]
      [:p "Significantly faster (100-800 TPS) than any other privacy solutions (usually less than 10 TPS) and one PRV ($0.4) could cover your transaction & trading fees in the next decade."]]

     [:li.collection-item
      [:h3 "How could you earn passive income operating a node?"]
      [:p "You could buy a physical node, or start operating your virtual node on your server. Prerequirements are staking 1750 PRV (~$700) which you could get back anytime if you change your mind."]
      [:p "Incognito nodes have a low power usage and they are ECO friendly."]
      [:p "Rewards from operating a node is random, but you could expect a decent 45%-100% yearly earning in the beginning."]
      ]

     [:li.collection-item
      [:h3 "How secure is using Incognito?"]
      [:p "You hold your own private keys on your wallet, so making a backup is crucial, that way you cannot loose money if you lost your phone or with operating a node, even if it goes offline. Always make a backup and store an offline copy of your private keys!"]
      [:p "Partial custodial risk is involved in the handling of BTC in the first year of Incognito, but the network will operate with zero custodial risk soon. Ethereum based tokens are custodial risk free to use already."]
      ]

     [:li.collection-item
      [:h3 "What is the future of Incognito?"]
      [:p "A decentralized autonomous organization was designed to fund protocol development and network growth. Join the Incognito community now and you will be a part of this revolutionary movement. You could make proposals and get funding!"]
      ]


     ]

    [:div
     "Ide egy olyan sulibotos mobilos választogatóst szeretnék, a következő felvételekkel:"
     ]

    [:h2 "Partnerships"]
    [:ul
     [:li "Binance"]
     [:li "Autonomous"]
     [:li "Zilliqa"]
     [:li "NEO"]
     [:li "Ontology"]
     [:li "Harmony"]
     ]
    ]
   

   [:footer.page-footer
    [:div.container
     [:div.row
      [:div.col.l6.s12
       [:h5.white-text "Incognito"]
       [:p.grey-text.text-lighten-4
        "Footer content."]]
      [:div.col.l4.offset-l2.s12
       [:h5.white-text "Links"]
       [:ul
        [:li [:a.grey-text.text-lighten-3 {:href "#!"} "Link 1"]]
        [:li [:a.grey-text.text-lighten-3 {:href "#!"} "Link 2"]]
        [:li [:a.grey-text.text-lighten-3 {:href "#!"} "Link 3"]]
        [:li [:a.grey-text.text-lighten-3 {:href "#!"} "Link 4"]]]]]]
    [:div.footer-copyright
     [:div.container
      "© 2020 All privacy reserved."
      [:a.grey-text.text-lighten-4.right {:href "#!"} "More Links"]]]]
   ])
