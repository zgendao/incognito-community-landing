(ns app.heroArt
  (:require [rum.core :as rum :refer [defcs defc reactive react cursor]]))

(defn heroArt []
 [:svg {:y "0px", :sodipodi:docname "heroNew2.svg", :xml:space "preserve", :xmlns:cc "http://creativecommons.org/ns#", :xmlns:inkscape "http://www.inkscape.org/namespaces/inkscape", :viewBox "0 0 2000 1200", :xmlns "http://www.w3.org/2000/svg", :xmlns:sodipodi "http://sodipodi.sourceforge.net/DTD/sodipodi-0.dtd", :xmlns:dc "http://purl.org/dc/elements/1.1/", :xmlns:xlink "http://www.w3.org/1999/xlink", :id "Layer_1", :xmlns:rdf "http://www.w3.org/1999/02/22-rdf-syntax-ns#", :inkscape:version "1.0 (4035a4fb49, 2020-05-01)", :x "0px", :xmlns:svg "http://www.w3.org/2000/svg", :version "1.1", :enable-background "new 0 0 2000 1200"}
  [:defs {:id "defs6162"}
   [:linearGradient {:inkscape:collect "always", :xlinkHref "#paint61_linear", :id "linearGradient4104", :x1 "353.39999", :y1 "953", :x2 "416", :y2 "918.59998", :gradientUnits "userSpaceOnUse"}]
   [:linearGradient {:inkscape:collect "always", :y1 "208.55", :id "linearGradient4106", :xlinkHref "#paint62_linear", :x1 "425.25", :gradientTransform "translate(0,700)", :y2 "260.14999", :gradientUnits "userSpaceOnUse", :x2 "476.85001"}]
   [:linearGradient {:inkscape:collect "always", :y1 "206.1853", :id "linearGradient4108", :xlinkHref "#paint63_linear", :x1 "399.30841", :gradientTransform "translate(0,700)", :y2 "141.60561", :gradientUnits "userSpaceOnUse", :x2 "440.56091"}]
   [:linearGradient {:inkscape:collect "always", :y1 "190.45959", :id "linearGradient4110", :xlinkHref "#paint64_linear", :x1 "443.30969", :gradientTransform "translate(0,700)", :y2 "204.4595", :gradientUnits "userSpaceOnUse", :x2 "457.30939"}]
   [:linearGradient {:inkscape:collect "always", :y1 "191.85941", :id "linearGradient4112", :xlinkHref "#paint65_linear", :x1 "4831.9097", :gradientTransform "matrix(-1,0,0,1,5222,700)", :y2 "203.0256", :gradientUnits "userSpaceOnUse", :x2 "4843.0757"}]
   [:linearGradient {:inkscape:collect "always", :y1 "235.8999", :id "linearGradient4114", :xlinkHref "#paint66_linear", :x1 "398.70001", :gradientTransform "translate(0,700)", :y2 "272.46149", :gradientUnits "userSpaceOnUse", :x2 "435.26151"}]
   [:linearGradient {:inkscape:collect "always", :y1 "112.1323", :id "linearGradient3359", :xlinkHref "#paint63_linear", :x1 "555.75623", :gradientTransform "translate(0,700)", :y2 "47.813999", :gradientUnits "userSpaceOnUse", :x2 "596.84161", :spreadMethod "pad"}]
   [:linearGradient {:inkscape:collect "always", :y1 "156.6837", :id "linearGradient3361", :xlinkHref "#paint61_linear", :x1 "508.30679", :gradientTransform "translate(0,700)", :y2 "123.5026", :gradientUnits "userSpaceOnUse", :x2 "570.30292"}]
   [:linearGradient {:inkscape:collect "always", :y1 "114.65", :id "linearGradient3363", :xlinkHref "#paint62_linear", :x1 "581.25", :gradientTransform "translate(0,700)", :y2 "166.25", :gradientUnits "userSpaceOnUse", :x2 "632.84998", :spreadMethod "pad"}]
   [:linearGradient {:inkscape:collect "always", :y1 "250.7917", :id "linearGradient3365", :xlinkHref "#paint61_linear", :x1 "352.21811", :gradientTransform "translate(0,700)", :y2 "217.2003", :gradientUnits "userSpaceOnUse", :x2 "414.9812", :spreadMethod "pad"}]
   [:linearGradient {:inkscape:collect "always", :y1 "142.2999", :id "linearGradient3367", :xlinkHref "#paint64_linear", :x1 "554.5", :gradientTransform "translate(0,700)", :y2 "179.1501", :gradientUnits "userSpaceOnUse", :x2 "591.34998"}]
   [:linearGradient {:inkscape:collect "always", :y1 "96.550003", :id "linearGradient3369", :xlinkHref "#paint64_linear", :x1 "599.34998", :gradientTransform "translate(0,700)", :y2 "110.6", :gradientUnits "userSpaceOnUse", :x2 "613.40002", :spreadMethod "pad"}]
   [:linearGradient {:inkscape:collect "always", :y1 "98.225197", :id "linearGradient3371", :xlinkHref "#paint65_linear", :x1 "4675.6753", :gradientTransform "matrix(-1,0,0,1,5222,700)", :y2 "108.8909", :gradientUnits "userSpaceOnUse", :x2 "4686.3408", :spreadMethod "pad"}]
   [:linearGradient {:inkscape:collect "always", :y1 "64.483704", :id "linearGradient3385", :xlinkHref "#paint61_linear", :x1 "665.50677", :gradientTransform "translate(0,700)", :y2 "31.302601", :gradientUnits "userSpaceOnUse", :x2 "727.50293", :spreadMethod "pad"}]
   [:linearGradient {:inkscape:collect "always", :y1 "22.200001", :id "linearGradient3387", :xlinkHref "#paint62_linear", :x1 "738.5", :gradientTransform "translate(0,700)", :y2 "74.300003", :gradientUnits "userSpaceOnUse", :x2 "790.59998"}]
   [:linearGradient {:inkscape:collect "always", :y1 "19.853901", :id "linearGradient3389", :xlinkHref "#paint63_linear", :x1 "712.84229", :gradientTransform "translate(0,700)", :y2 "-44.4645", :gradientUnits "userSpaceOnUse", :x2 "753.92792"}]
   [:linearGradient {:inkscape:collect "always", :y1 "50.2999", :id "linearGradient3391", :xlinkHref "#paint65_linear", :x1 "711.20001", :gradientTransform "translate(0,700)", :y2 "86.650101", :gradientUnits "userSpaceOnUse", :x2 "747.54999"}]
   [:linearGradient {:inkscape:collect "always", :y1 "4.3348999", :id "linearGradient3393", :xlinkHref "#paint72_linear", :x1 "756.33502", :gradientTransform "translate(0,700)", :y2 "18.434799", :gradientUnits "userSpaceOnUse", :x2 "770.43481", :spreadMethod "pad"}]
   [:linearGradient {:inkscape:collect "always", :y1 "6.0099001", :id "linearGradient3395", :xlinkHref "#paint66_linear", :x1 "4518.6602", :gradientTransform "matrix(-1,0,0,1,5222,700)", :y2 "16.675501", :gradientUnits "userSpaceOnUse", :x2 "4529.3257"}]
   [:linearGradient {:inkscape:collect "always", :y1 "-29.316299", :id "linearGradient3397", :xlinkHref "#paint61_linear", :x1 "822.60681", :gradientTransform "translate(0,700)", :y2 "-62.497299", :gradientUnits "userSpaceOnUse", :x2 "884.60303"}]
   [:linearGradient {:inkscape:collect "always", :y1 "-71.599998", :id "linearGradient3399", :xlinkHref "#paint62_linear", :x1 "895.5", :gradientTransform "translate(0,700)", :y2 "-19.5", :gradientUnits "userSpaceOnUse", :x2 "947.59998"}]
   [:linearGradient {:inkscape:collect "always", :y1 "-73.867401", :id "linearGradient3401", :xlinkHref "#paint63_linear", :x1 "870.05603", :gradientTransform "translate(0,700)", :y2 "-138.1857", :gradientUnits "userSpaceOnUse", :x2 "911.14142"}]
   [:linearGradient {:inkscape:collect "always", :y1 "-89.399902", :id "linearGradient3403", :xlinkHref "#paint64_linear", :x1 "913.30017", :gradientTransform "translate(0,700)", :y2 "-75.250099", :gradientUnits "userSpaceOnUse", :x2 "927.44983"}]
   [:linearGradient {:inkscape:collect "always", :y1 "-87.738602", :id "linearGradient3405", :xlinkHref "#paint64_linear", :x1 "4361.6616", :gradientTransform "matrix(-1,0,0,1,5222,700)", :y2 "-77.072899", :gradientUnits "userSpaceOnUse", :x2 "4372.3271", :spreadMethod "pad"}]
   [:linearGradient {:inkscape:collect "always", :y1 "-43.4501", :id "linearGradient3407", :xlinkHref "#paint64_linear", :x1 "868.25", :gradientTransform "translate(0,700)", :y2 "-7.0998998", :gradientUnits "userSpaceOnUse", :x2 "904.59998", :spreadMethod "pad"}]
   [:linearGradient {:inkscape:collect "always", :y1 "-123.3163", :id "linearGradient6444", :xlinkHref "#paint61_linear", :x1 "980.60681", :gradientTransform "translate(0,700)", :y2 "-156.4973", :gradientUnits "userSpaceOnUse", :x2 "1042.6029", :spreadMethod "pad"}]
   [:linearGradient {:inkscape:collect "always", :y1 "-165.60001", :id "linearGradient6446", :xlinkHref "#paint62_linear", :x1 "1053.5", :gradientTransform "translate(0,700)", :y2 "-113.5", :gradientUnits "userSpaceOnUse", :x2 "1105.6"}]
   [:linearGradient {:inkscape:collect "always", :y1 "-167.86729", :id "linearGradient6448", :xlinkHref "#paint63_linear", :x1 "1028.0559", :gradientTransform "translate(0,700)", :y2 "-232.1857", :gradientUnits "userSpaceOnUse", :x2 "1069.1415"}]
   [:linearGradient {:inkscape:collect "always", :y1 "-183.39999", :id "linearGradient6450", :xlinkHref "#paint64_linear", :x1 "1071.3", :gradientTransform "translate(0,700)", :y2 "-169.25", :gradientUnits "userSpaceOnUse", :x2 "1085.45"}]
   [:linearGradient {:inkscape:collect "always", :y1 "-181.7386", :id "linearGradient6452", :xlinkHref "#paint64_linear", :x1 "4203.6616", :gradientTransform "matrix(-1,0,0,1,5222,700)", :y2 "-171.07291", :gradientUnits "userSpaceOnUse", :x2 "4214.3271"}]
   [:linearGradient {:inkscape:collect "always", :y1 "-137.4501", :id "linearGradient6454", :xlinkHref "#paint64_linear", :x1 "1026.25", :gradientTransform "translate(0,700)", :y2 "-101.0999", :gradientUnits "userSpaceOnUse", :x2 "1062.6"}]
   [:linearGradient {:inkscape:collect "always", :y1 "-217.3163", :id "linearGradient6456", :xlinkHref "#paint61_linear", :x1 "1141.6068", :gradientTransform "translate(0,700)", :y2 "-250.4973", :gradientUnits "userSpaceOnUse", :x2 "1203.6029"}]
   [:linearGradient {:inkscape:collect "always", :y1 "-259.60001", :id "linearGradient6458", :xlinkHref "#paint62_linear", :x1 "1214.5", :gradientTransform "translate(0,700)", :y2 "-207.5", :gradientUnits "userSpaceOnUse", :x2 "1266.6"}]
   [:linearGradient {:inkscape:collect "always", :y1 "-261.86731", :id "linearGradient6460", :xlinkHref "#paint63_linear", :x1 "1189.0559", :gradientTransform "translate(0,700)", :y2 "-326.1857", :gradientUnits "userSpaceOnUse", :x2 "1230.1415"}]
   [:linearGradient {:inkscape:collect "always", :y1 "-277.39999", :id "linearGradient6462", :xlinkHref "#paint64_linear", :x1 "1232.3", :gradientTransform "translate(0,700)", :y2 "-263.25", :gradientUnits "userSpaceOnUse", :x2 "1246.4501"}]
   [:linearGradient {:inkscape:collect "always", :y1 "-275.73859", :id "linearGradient6464", :xlinkHref "#paint64_linear", :x1 "4042.6614", :gradientTransform "matrix(-1,0,0,1,5222,700)", :y2 "-265.07291", :gradientUnits "userSpaceOnUse", :x2 "4053.3269"}]
   [:linearGradient {:inkscape:collect "always", :y1 "-231.4501", :id "linearGradient6466", :xlinkHref "#paint64_linear", :x1 "1187.25", :gradientTransform "translate(0,700)", :y2 "-195.0999", :gradientUnits "userSpaceOnUse", :x2 "1223.6"}]
   [:linearGradient {:inkscape:collect "always", :y1 "-311.31631", :id "linearGradient6468", :xlinkHref "#paint61_linear", :x1 "1299.6068", :gradientTransform "translate(0,700)", :y2 "-344.49731", :gradientUnits "userSpaceOnUse", :x2 "1361.6029"}]
   [:linearGradient {:inkscape:collect "always", :y1 "-353.60001", :id "linearGradient6470", :xlinkHref "#paint62_linear", :x1 "1372.5", :gradientTransform "translate(0,700)", :y2 "-301.5", :gradientUnits "userSpaceOnUse", :x2 "1424.6"}]
   [:linearGradient {:inkscape:collect "always", :y1 "-355.86731", :id "linearGradient6472", :xlinkHref "#paint63_linear", :x1 "1347.0559", :gradientTransform "translate(0,700)", :y2 "-420.1857", :gradientUnits "userSpaceOnUse", :x2 "1388.1415"}]
   [:linearGradient {:inkscape:collect "always", :y1 "-371.39999", :id "linearGradient6474", :xlinkHref "#paint64_linear", :x1 "1390.3", :gradientTransform "translate(0,700)", :y2 "-357.25", :gradientUnits "userSpaceOnUse", :x2 "1404.4501"}]
   [:linearGradient {:inkscape:collect "always", :y1 "-369.73849", :id "linearGradient6476", :xlinkHref "#paint64_linear", :x1 "3884.6614", :gradientTransform "matrix(-1,0,0,1,5222,700)", :y2 "-359.07309", :gradientUnits "userSpaceOnUse", :x2 "3895.3269"}]
   [:linearGradient {:inkscape:collect "always", :y1 "-325.4501", :id "linearGradient6478", :xlinkHref "#paint64_linear", :x1 "1345.25", :gradientTransform "translate(0,700)", :y2 "-289.09991", :gradientUnits "userSpaceOnUse", :x2 "1381.6"}]
   [:linearGradient {:inkscape:collect "always", :y1 "593.17767", :id "linearGradient6482", :xlinkHref "#paint99_linear", :x1 "471.52802", :gradientTransform "matrix(1,1.17054e-4,1.17054e-4,-1,-0.0154959,1199.7689)", :y2 "616.14679", :gradientUnits "userSpaceOnUse", :x2 "514.44391"}]
   [:linearGradient {:inkscape:collect "always", :y1 "622.2655", :id "linearGradient6484", :xlinkHref "#paint100_linear", :x1 "521.89972", :gradientTransform "matrix(1,1.17054e-4,1.17054e-4,-1,-0.0154959,1199.7689)", :y2 "586.56927", :gradientUnits "userSpaceOnUse", :x2 "557.59589"}]
   [:linearGradient {:inkscape:collect "always", :y1 "623.84198", :id "linearGradient6486", :xlinkHref "#paint101_linear", :x1 "504.33081", :gradientTransform "matrix(1,1.17054e-4,1.17054e-4,-1,-0.0154959,1199.7689)", :y2 "667.94159", :gradientUnits "userSpaceOnUse", :x2 "532.50079"}]
   [:linearGradient {:inkscape:collect "always", :y1 "634.46722", :id "linearGradient6488", :xlinkHref "#paint102_linear", :x1 "534.64807", :gradientTransform "matrix(1,1.17054e-4,1.17054e-4,-1,-0.0154959,1199.7689)", :y2 "624.94342", :gradientUnits "userSpaceOnUse", :x2 "544.172"}]
   [:linearGradient {:inkscape:collect "always", :y1 "633.48383", :id "linearGradient6494", :xlinkHref "#paint103_linear", :x1 "3223.7781", :gradientTransform "rotate(-179.99329,1861.0273,599.99338)", :y2 "625.92419", :gradientUnits "userSpaceOnUse", :x2 "3231.3376"}]
   [:linearGradient {:inkscape:collect "always", :y1 "603.03052", :id "linearGradient6496", :xlinkHref "#paint104_linear", :x1 "503.25269", :gradientTransform "matrix(1,1.17054e-4,1.17054e-4,-1,-0.0154959,1199.7689)", :y2 "578.02472", :gradientUnits "userSpaceOnUse", :x2 "528.25848"}]
   [:linearGradient {:inkscape:collect "always", :y1 "-609.33862", :id "linearGradient6498", :xlinkHref "#paint105_linear", :x1 "2940.311", :gradientTransform "matrix(-1,0,0,1,3563.1868,1126.7981)", :y2 "-601.20349", :gradientUnits "userSpaceOnUse", :x2 "2953.176"}]
   [:linearGradient {:inkscape:collect "always", :y1 "-699.69757", :id "linearGradient6500", :xlinkHref "#paint105_linear", :x1 "2792.3113", :gradientTransform "matrix(-1,0,0,1,3563.1868,1126.7981)", :y2 "-691.56238", :gradientUnits "userSpaceOnUse", :x2 "2805.176"}]
   [:linearGradient {:inkscape:collect "always", :y1 "-777.69757", :id "linearGradient6502", :xlinkHref "#paint105_linear", :x1 "2660.3113", :gradientTransform "matrix(-1,0,0,1,3563.1868,1126.7981)", :y2 "-769.56238", :gradientUnits "userSpaceOnUse", :x2 "2673.176"}]
   [:linearGradient {:inkscape:collect "always", :y1 "786.57373", :id "linearGradient6504", :xlinkHref "#paint99_linear", :x1 "789.50488", :gradientTransform "matrix(1,1.17054e-4,1.17054e-4,-1,-0.0154959,1199.7689)", :y2 "809.54279", :gradientUnits "userSpaceOnUse", :x2 "832.42102"}]
   [:linearGradient {:inkscape:collect "always", :y1 "815.66089", :id "linearGradient6506", :xlinkHref "#paint100_linear", :x1 "839.87732", :gradientTransform "matrix(1,1.17054e-4,1.17054e-4,-1,-0.0154959,1199.7689)", :y2 "779.96527", :gradientUnits "userSpaceOnUse", :x2 "875.57288"}]
   [:linearGradient {:inkscape:collect "always", :y1 "817.2381", :id "linearGradient6508", :xlinkHref "#paint101_linear", :x1 "822.30811", :gradientTransform "matrix(1,1.17054e-4,1.17054e-4,-1,-0.0154959,1199.7689)", :y2 "861.33759", :gradientUnits "userSpaceOnUse", :x2 "850.47809"}]
   [:linearGradient {:inkscape:collect "always", :y1 "827.86292", :id "linearGradient6510", :xlinkHref "#paint102_linear", :x1 "852.62598", :gradientTransform "matrix(1,1.17054e-4,1.17054e-4,-1,-0.0154959,1199.7689)", :y2 "818.33972", :gradientUnits "userSpaceOnUse", :x2 "862.14941"}]
   [:linearGradient {:inkscape:collect "always", :y1 "826.87958", :id "linearGradient6512", :xlinkHref "#paint103_linear", :x1 "2905.8013", :gradientTransform "rotate(-179.99329,1861.0273,599.99338)", :y2 "819.32037", :gradientUnits "userSpaceOnUse", :x2 "2913.3606"}]
   [:linearGradient {:inkscape:collect "always", :y1 "796.42603", :id "linearGradient6514", :xlinkHref "#paint104_linear", :x1 "821.23029", :gradientTransform "matrix(1,1.17054e-4,1.17054e-4,-1,-0.0154959,1199.7689)", :y2 "771.42047", :gradientUnits "userSpaceOnUse", :x2 "846.23572"}]]
  [:sodipodi:namedview {:inkscape:current-layer "g6157", :inkscape:pageshadow "2", :pagecolor "#ffffff", :gridtolerance "10", :inkscape:document-rotation "0", :inkscape:zoom "2.7142612", :borderopacity "1", :inkscape:window-maximized "1", :inkscape:window-y "-8", :objecttolerance "10", :guidetolerance "10", :bordercolor "#666666", :inkscape:cy "484.90347", :id "namedview6160", :showgrid "false", :inkscape:cx "755.94915", :inkscape:window-width "1858", :inkscape:window-height "1057", :inkscape:window-x "1254", :inkscape:pageopacity "0"}]
  [:g {:id "g3090"}
   [:line {:stroke "#FF4D6B", :fill "none", :stroke-linejoin "round", :y1 "952", :stroke-linecap "round", :stroke-width "3.4927", :id "line3088", :stroke-miterlimit "10", :x1 "355", :y2 "315.4", :x2 "1430.3"}]]
  [:g {:id "g6157"}
   [:g {:id "g3156"}
    [:linearGradient {:y2 "616", :x2 "2010", :y1 "616", :x1 "-26", :gradientUnits "userSpaceOnUse", :id "SVGID_1_"}
     [:stop {:id "stop3092", :style "stop-color:#202333", :offset "0"}]
     [:stop {:id "stop3094", :style "stop-color:#5C1B99", :offset "1"}]]
    [:linearGradient {:y2 "1057.6716", :x2 "2085.1755", :y1 "174.3284", :x1 "-101.1755", :gradientUnits "userSpaceOnUse", :id "SVGID_2_"}
     [:stop {:id "stop3097", :style "stop-color:#202333", :offset "0"}]
     [:stop {:id "stop3099", :style "stop-color:#5C6399", :offset "1"}]]
    [:rect {:y "-10", :stroke "url(#SVGID_2_)", :fill "url(#SVGID_1_)", :width "2036", :id "rect3102", :display "none", :stroke-miterlimit "10", :x "-26", :height "1252"}]
    [:linearGradient {:gradientTransform "matrix(1 0 0 -1 0 1200)", :y2 "918.762", :x2 "1744.3668", :y1 "293.0284", :x1 "195.6219", :gradientUnits "userSpaceOnUse", :id "SVGID_3_"}
     [:stop {:id "stop3104", :style "stop-color:#202333", :offset "0"}]
     [:stop {:id "stop3106", :style "stop-color:#5C6399", :offset "1"}]]
    [:g {:id "g3122", :display "none"}
     [:image {:transform "matrix(0.9846 0 0 0.9846 841.9875 782.9567)", :overflow "visible", :width "69", :opacity "0.2", :id "image3111", :xlinkHref "data:image/png;base64,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 SUVORK5CYII=", :display "inline", :enable-background "new    ", :height "65"}]
     [:g {:id "g3120", :display "inline"}
      [:linearGradient {:gradientTransform "matrix(1 0 0 -1 0 1200)", :y2 "390.742", :x2 "884.255", :y1 "380.1925", :x1 "867.5721", :gradientUnits "userSpaceOnUse", :id "SVGID_4_"}
       [:stop {:id "stop3113", :style "stop-color:#FFFFFF", :offset "0"}]
       [:stop {:id "stop3115", :style "stop-color:#FFFFFF;stop-opacity:0", :offset "0.8387"}]]
      [:polygon {:id "polygon3118", :points "885.7,812.1 882.3,806.6 865.6,817.3 868.9,822.9     ", :fill "url(#SVGID_4_)"}]]]
    [:g {:id "g3135", :display "none"}
     [:image {:transform "matrix(0.9846 0 0 0.9846 1355.9874 147.9566)", :overflow "visible", :width "69", :opacity "0.2", :id "image3124", :xlinkHref "data:image/png;base64,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", :display "inline", :enable-background "new    ", :height "65"}]
     [:g {:id "g3133", :display "inline"}
      [:linearGradient {:gradientTransform "matrix(-1 0 0 1 3977.885 248.3313)", :y2 "-63.3828", :x2 "2596.884", :y1 "-73.9323", :x1 "2580.2009", :gradientUnits "userSpaceOnUse", :id "SVGID_5_"}
       [:stop {:id "stop3126", :style "stop-color:#FFFFFF", :offset "0"}]
       [:stop {:id "stop3128", :style "stop-color:#FFFFFF;stop-opacity:0", :offset "0.8387"}]]
      [:polygon {:id "polygon3131", :points "1379.6,182.1 1382.9,187.6 1399.7,176.9 1396.3,171.4     ", :fill "url(#SVGID_5_)"}]]]
    [:g {:id "g3148", :display "none"}
     [:image {:transform "matrix(0.9846 0 0 0.9846 211.9874 896.9567)", :overflow "visible", :width "69", :opacity "0.2", :id "image3137", :xlinkHref "data:image/png;base64,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 3jXbAAAAAElFTkSuQmCC", :display "inline", :enable-background "new    ", :height "65"}]
     [:g {:id "g3146", :display "inline"}
      [:linearGradient {:gradientTransform "matrix(0.4223 0.9064 0.9064 -0.4223 -680.2463 -758.597)", :y2 "132.0509", :x2 "1928.7924", :y1 "121.5306", :x1 "1912.1555", :gradientUnits "userSpaceOnUse", :id "SVGID_6_"}
       [:stop {:id "stop3139", :style "stop-color:#FFFFFF", :offset "0"}]
       [:stop {:id "stop3141", :style "stop-color:#FFFFFF;stop-opacity:0", :offset "0.8387"}]]
      [:polygon {:id "polygon3144", :points "252.1,936.5 255.6,931.1 238.9,920.4 235.4,925.8     ", :fill "url(#SVGID_6_)"}]]]
    [:linearGradient {:y2 "805.9159", :x2 "1526.2567", :y1 "357.141", :x1 "415.4998", :gradientUnits "userSpaceOnUse", :id "linepath_1_"}
     [:stop {:id "stop3150", :style "stop-color:#202333", :offset "0"}]
     [:stop {:id "stop3152", :style "stop-color:#5C6399", :offset "1"}]]
    [:polygon {:points "197.9,898.1 1501.2,115.4      1738.2,279.2 474.7,1061.5   ", :stroke-miterlimit "10", :stroke "url(#linepath_1_)", :fill "none", :id "linepath"}]]
   [:polygon {:id "polygon3158", :points "1345,596.3 1426,646 1510,597.3 1428,548   ", :fill "#96DFE3"}]
   [:g {:opacity "0.65", :id "purplebg"}
    [:polygon {:id "polygon3160", :points "1585,596.3 1666,646 1750,597.3 1668,548   ", :fill "#96DFE3"}]
    [:polygon {:id "polygon3162", :points "1464,527.3 1545,577 1629,528.3 1547,479   ", :fill "#96DFE3"}]
    [:polygon {:id "polygon3164", :points "1047,224.3 1128,274 1212,225.3 1130,176   ", :fill "#96DFE3"}]
    [:polygon {:id "polygon3166", :points "1720,524.3 1801,574 1885,525.3 1803,476   ", :fill "#96DFE3"}]
    [:polygon {:id "polygon3168", :points "1831,596.3 1912,646 1996,597.3 1914,548   ", :fill "#96DFE3"}]
    [:path {:stroke-width "3.81874", :stroke "#96dfe3", :id "path3170", :d "m 1749.8505,456.66069 -80.2253,46.51106 -77.2977,-47.42808 79.272,-46.1292 z", :fill "none"}]
    [:path {:stroke-width "3.93629", :stroke "#96dfe3", :id "path3172", :d "m 1087.9258,153.99083 -80.1081,46.4431 -77.1847,-47.35877 79.1562,-46.06178 z", :fill "none"}]
    [:polygon {:id "polygon3174", :points "881,1022.3 962,1072 1046,1023.3 964,974   ", :fill "#96DFE3"}]
    [:path {:fill "none", :d "m 925.45853,951.3116 -80.10813,46.44314 -77.18469,-47.35882 79.15613,-46.06179 z", :stroke-width "3.93629", :stroke "#96dfe3", :id "path3176"}]
    [:path {:stroke-width "3.81874", :stroke "#96dfe3", :id "path3178", :d "m 919.4021,1096.584 -80.22536,46.5111 -77.29763,-47.4281 79.27197,-46.1292 z", :fill "none"}]
    [:path {:fill "none", :stroke-width "4.28688", :stroke "#96dfe3", :id "path3180", :d "m 1533.3317,1005.3204 -79.7585,46.2404 -76.8479,-47.152 78.8107,-45.86071 z"}]
    [:polygon {:id "polygon3182", :points "1720,386.3 1801,436 1885,387.3 1803,338   ", :fill "#96DFE3"}]
    [:polygon {:id "polygon3186", :points "140,530.3 221,580 305,531.3 223,482   ", :fill "#96DFE3"}]
    [:polygon {:transform "translate(243.9006,4.0991698)", :id "polygon3188", :points "186,598.3 104,549 21,597.3 102,647 ", :fill "#96dfe3"}]
    [:path {:stroke-width "4.28688", :stroke "#96dfe3", :id "path3190", :d "m 425.36766,455.55452 -79.75853,46.24041 -76.84784,-47.1521 78.81069,-45.86077 z", :fill "none"}]
    [:path {:stroke-width "3.86337", :fill "none", :stroke "#96dfe3", :id "path3192", :d "m 301.43592,672.54981 -80.18088,46.48711 -77.25477,-47.40102 79.22801,-46.10548 z"}]
    [:polygon {:id "polygon3194", :points "134,382.3 215,432 299,383.3 217,334   ", :fill "#96DFE3"}]
    [:polygon {:id "polygon3196", :points "390,530.3 471,580 555,531.3 473,482   ", :fill "#96DFE3"}]
    [:polygon {:id "polygon3198", :points "390,386.3 471,436 555,387.3 473,338   ", :fill "#96DFE3"}]]
   [:g {:id "d-appswrapper"}
    [:g {:id "d-app"}
     [:g {:id "g3223"}
      [:linearGradient {:gradientTransform "matrix(1 0 0 -1 0 1900)", :y2 "1455.0885", :x2 "531.7549", :y1 "1492.3506", :x1 "596.2948", :gradientUnits "userSpaceOnUse", :id "SVGID_7_"}
       [:stop {:id "stop3201", :style "stop-color:#808080", :offset "0"}]
       [:stop {:id "stop3203", :style "stop-color:#6F6F6F", :offset "0.2627"}]
       [:stop {:id "stop3205", :style "stop-color:#575757", :offset "0.7192"}]
       [:stop {:id "stop3207", :style "stop-color:#4E4E4E", :offset "1"}]]
      [:path {:id "path3210", :d "M612.3,427.9c-0.1-0.8-3.3,0.2-3.3,0.2v1.3l0.1-0.1l-48.9-28c0,0-4.5-3.1-10.6,0.6l-48.8,28         c0,0-0.7,0.1-0.7,0.3V429c0,0-2.7-1-2.8-0.2c-0.4,2.3-0.1,1.9,0,3.5c0,1.1,0.8,2.3,3.1,3.5l47.5,27.5c0,0,7.1,3.9,14.6,0         L610,435c0,0,2.3-1.4,2.5-3.4C612.8,430,612.7,430.1,612.3,427.9z", :fill "url(#SVGID_7_)"}]
      [:linearGradient {:gradientTransform "matrix(1 0 0 -1 0 1900)", :y2 "1439.6381", :x2 "577.0236", :y1 "1498.0173", :x1 "536.1459", :gradientUnits "userSpaceOnUse", :id "SVGID_8_"}
       [:stop {:id "stop3212", :style "stop-color:#9A9A9A", :offset "0"}]
       [:stop {:id "stop3214", :style "stop-color:#9F9F9F", :offset "0.3122"}]
       [:stop {:id "stop3216", :style "stop-color:#B0B0B0", :offset "0.7197"}]
       [:stop {:id "stop3218", :style "stop-color:#BFBFBF", :offset "1"}]]
      [:path {:id "path3221", :d "M500.4,432.8l47.4,27.5c0,0,7.1,3.9,14.6,0L610,432c0,0,6.3-3.6-0.8-7.4l-49-28         c0,0-4.6-3.1-10.7,0.6l-48.5,28C501,425.2,493.2,429,500.4,432.8z", :fill "url(#SVGID_8_)"}]]
     [:g {:id "g3247"}
      [:linearGradient {:gradientTransform "matrix(1 0 0 -1 0 1900)", :y2 "1464.6003", :x2 "524.3275", :y1 "1506.1545", :x1 "596.3016", :gradientUnits "userSpaceOnUse", :id "SVGID_9_"}
       [:stop {:id "stop3225", :style "stop-color:#A61D30", :offset "0"}]
       [:stop {:id "stop3227", :style "stop-color:#AA2033", :offset "0.2302"}]
       [:stop {:id "stop3229", :style "stop-color:#B4293A", :offset "0.4367"}]
       [:stop {:id "stop3231", :style "stop-color:#C73848", :offset "0.634"}]
       [:stop {:id "stop3233", :style "stop-color:#E04D5A", :offset "0.8245"}]
       [:stop {:id "stop3235", :style "stop-color:#FF6670", :offset "1"}]]
      [:path {:id "path3238", :d "M612.3,414.1c-0.1-0.8-3.3,0.2-3.3,0.2v1.3l0.1-0.1l-48.9-28c0,0-4.5-3.1-10.6,0.6l-48.8,28         c0,0-0.7,0.1-0.7,0.3v-1.2c0,0-2.7-1-2.8-0.2c-0.4,2.3-0.1,1.9,0,3.5c0,1.1,0.8,2.3,3.1,3.5l47.5,27.5c0,0,7.1,3.9,14.6,0         l47.6-28.3c0,0,2.3-1.4,2.5-3.4C612.8,416.2,612.7,416.3,612.3,414.1z", :fill "url(#SVGID_9_)"}]
      [:linearGradient {:gradientTransform "matrix(1 0 0 -1 0 1900)", :y2 "1453.4487", :x2 "577.0161", :y1 "1511.8278", :x1 "536.1385", :gradientUnits "userSpaceOnUse", :id "SVGID_10_"}
       [:stop {:id "stop3240", :style "stop-color:#E6455C", :offset "0"}]
       [:stop {:id "stop3242", :style "stop-color:#FF3D49", :offset "1"}]]
      [:path {:id "path3245", :d "M500.4,419l47.4,27.5c0,0,7.1,3.9,14.6,0l47.6-28.3c0,0,6.3-3.6-0.8-7.4l-49-28         c0,0-4.6-3.1-10.7,0.6l-48.5,28C501,411.4,493.2,415.2,500.4,419z", :fill "url(#SVGID_10_)"}]]
     [:g {:id "g3279"}
      [:linearGradient {:gradientTransform "matrix(1 0 0 -1 0 1900)", :y2 "1494.0841", :x2 "531.7474", :y1 "1531.3463", :x1 "596.2872", :gradientUnits "userSpaceOnUse", :id "SVGID_11_"}
       [:stop {:id "stop3249", :style "stop-color:#808080", :offset "0"}]
       [:stop {:id "stop3251", :style "stop-color:#6F6F6F", :offset "0.2627"}]
       [:stop {:id "stop3253", :style "stop-color:#575757", :offset "0.7192"}]
       [:stop {:id "stop3255", :style "stop-color:#4E4E4E", :offset "1"}]]
      [:path {:id "path3258", :d "M612.3,388.9c-0.1-0.8-3.3,0.2-3.3,0.2v1.3l0.1-0.1l-48.9-28c0,0-4.5-3.1-10.6,0.6l-48.8,28         c0,0-0.7,0.1-0.7,0.3V390c0,0-2.7-1-2.8-0.2c-0.4,2.3-0.1,1.9,0,3.5c0,1.1,0.8,2.3,3.1,3.5l47.5,27.5c0,0,7.1,3.9,14.6,0         l47.6-28.3c0,0,2.3-1.4,2.5-3.4C612.8,391.1,612.7,391.1,612.3,388.9z", :fill "url(#SVGID_11_)"}]
      [:linearGradient {:gradientTransform "matrix(1 0 0 -1 0 1900)", :y2 "1478.6252", :x2 "577.0297", :y1 "1537.0045", :x1 "536.1522", :gradientUnits "userSpaceOnUse", :id "SVGID_12_"}
       [:stop {:id "stop3260", :style "stop-color:#9A9A9A", :offset "0"}]
       [:stop {:id "stop3262", :style "stop-color:#9F9F9F", :offset "0.3122"}]
       [:stop {:id "stop3264", :style "stop-color:#B0B0B0", :offset "0.7197"}]
       [:stop {:id "stop3266", :style "stop-color:#BFBFBF", :offset "1"}]]
      [:path {:id "path3269", :d "M500.4,393.8l47.4,27.5c0,0,7.1,3.9,14.6,0L610,393c0,0,6.3-3.6-0.8-7.4l-49-28         c0,0-4.6-3.1-10.7,0.6l-48.5,28C501,386.3,493.2,390,500.4,393.8z", :fill "url(#SVGID_12_)"}]
      [:g {:id "g3277"}
       [:path {:id "path3271", :d "M551,388.2c-0.3-0.8-0.5-1.6-0.8-2.3c-0.1-0.2-0.4-0.4-0.6-0.6c-0.4-0.4-1.1-0.7-1.2-1.2           c-0.8-1.9-1.5-3.8-2.1-5.7c-0.4-1.3,1.1-2.7,3.4-3.2c2.2-0.4,4.4,0.2,4.9,1.5c0.7,1.9,1.4,3.7,2,5.6c0.1,0.4,0.1,0.8-0.1,1.2           c-0.4,0.5-0.3,1-0.1,1.5c0.2,0.4,0.3,0.8,0.5,1.2c0.1,0.2,0.1,0.4,0.2,0.6c2.5-1.1,4.1-3.3,3.6-4.9c-0.7-2-1.4-4.1-2.1-6.1           c-0.1-0.3-0.2-0.5-0.4-0.7c-1.4-2-5.4-3-9.1-2.3c-4,0.8-6.9,3-6.8,5.4c0,0.7,0.3,1.5,0.6,2.2c0.6,1.6,1,3.3,1.9,4.9           C545.5,387.2,547.8,388,551,388.2z", :fill "#FFFFFF"}]
       [:path {:id "path3273", :d "M565.2,394.4c-0.4-1-1.3-1.8-2.7-2.3c-1.1-0.5-2.4-0.7-3.9-0.8c0.3,0.9,0.6,1.7,0.9,2.6           c0,0.1,0.2,0.2,0.3,0.2c0.9,0.3,1.3,0.9,1.5,1.5c0.6,1.7,1.3,3.4,1.8,5.1c0.1,0.4,0.2,0.9,0,1.4c-0.4,1.2-2.2,2.1-4.2,2.2           s-3.6-0.5-4-1.6c-0.6-1.7-1.3-3.4-1.9-5.1c-0.2-0.5-0.3-1.1,0-1.6c0.3-0.7,0.5-1.2,0.2-1.8c-0.1-0.2,0-0.5-0.1-0.7           c-0.1-0.3-0.2-0.6-0.3-0.9c-2.9,1.5-4.3,3.1-3.8,5c0.5,2,1.2,3.9,1.9,5.9c0.8,2.1,3.4,3.4,7,3.4c5.3,0,10.1-3.2,9.3-6.2           C566.8,398.5,565.9,396.4,565.2,394.4z", :fill "#FFFFFF"}]
       [:path {:id "path3275", :d "M555.3,383.1c-0.3-0.8-1.6-1.1-2.8-0.8c-1.2,0.2-2,1-1.7,1.7c0.7,1.9,3.6,10.3,4.4,12.2           c0.1,0.3,0.4,0.6,0.7,0.8c0.7,0.3,2,0.1,2.7-0.2c0.7-0.3,1.3-0.9,1.1-1.5C558.7,392.6,555.7,384.3,555.3,383.1z", :fill "#FFFFFF"}]]]]
    [:g {:id "g3331"}
     [:linearGradient {:gradientTransform "matrix(1 0 0 -1 0 1900)", :y2 "1574.4468", :x2 "554.679", :y1 "1464.3314", :x1 "554.679", :gradientUnits "userSpaceOnUse", :id "SVGID_13_"}
      [:stop {:id "stop3282", :style "stop-color:#FFFFFF;stop-opacity:0", :offset "0"}]
      [:stop {:id "stop3284", :style "stop-color:#FFFFFF", :offset "0.291"}]
      [:stop {:id "stop3286", :style "stop-color:#FFFFFF;stop-opacity:0", :offset "0.9975"}]]
     [:path {:id "path3289", :d "M612.2,401.4l-0.4-91.4H497.1l0.5,91.2       c0,3.4,0.3,5,3.6,6.7l46.4,27.5c0,0,7.1,4,14.6,0.1l47.6-28.6C609.8,406.9,612.7,405.4,612.2,401.4z", :enable-background "new    ", :fill "url(#SVGID_13_)", :opacity "0.25"}]
     [:g {:id "g3329"}
      [:circle {:id "circle3291", :r "1.5", :cy "364.8", :cx "553.5", :fill "#FF8088"}]
      [:circle {:id "circle3293", :r "0.5", :cy "307.8", :cx "518.5", :fill "#FF8088"}]
      [:circle {:id "circle3295", :r "0.7", :cy "379.4", :cx "600.2", :fill "#FFFFFF"}]
      [:circle {:id "circle3297", :r "0.7", :cy "310.5", :cx "581.8", :fill "#E64852"}]
      [:circle {:id "circle3299", :r "0.7", :cy "353.8", :cx "564.5", :fill "#FFFFFF"}]
      [:circle {:id "circle3301", :r "0.7", :cy "394.5", :cx "602.9", :fill "#FFFFFF"}]
      [:circle {:id "circle3303", :r "0.7", :cy "336.1", :cx "596.7", :fill "#FFFFFF"}]
      [:circle {:id "circle3305", :r "0.7", :cy "339.6", :cx "576.7", :fill "#FF8088"}]
      [:circle {:id "circle3307", :r "0.7", :cy "388.6", :cx "573.3", :fill "#FFFFFF"}]
      [:circle {:id "circle3309", :r "0.7", :cy "371", :cx "509.4", :fill "#FFFFFF"}]
      [:circle {:id "circle3311", :r "0.7", :cy "363.8", :cx "532.5", :fill "#FFFFFF"}]
      [:circle {:id "circle3313", :r "1.4", :cy "357.9", :cx "604.2", :fill "#E64852"}]
      [:circle {:id "circle3315", :r "0.7", :cy "341", :cx "521.8", :fill "#FFFFFF"}]
      [:circle {:id "circle3317", :r "0.7", :cy "322", :cx "506.9", :fill "#E64852"}]
      [:circle {:id "circle3319", :r "0.7", :cy "361.5", :cx "513", :fill "#E64852"}]
      [:circle {:id "circle3321", :r "1", :cy "313.4", :cx "554.8", :fill "#E64852"}]
      [:circle {:id "circle3323", :r "1.4", :cy "341.7", :cx "539.3", :fill "#E64852"}]
      [:circle {:id "circle3325", :r "1.4", :cy "391.9", :cx "508.1", :fill "#FFFFFF"}]
      [:circle {:id "circle3327", :r "1.4", :cy "371", :cx "590.4", :fill "#FFFFFF"}]]]
    [:g {:id "g3351"}
     [:polygon {:id "polygon3333", :points "584.8,438.5 586.1,436.4 581.3,433.3 579.3,434.8    ", :fill "#D6D6D6"}]
     [:rect {:id "rect3335", :height "5.7", :width "2.4", :fill "#D6D6D6", :transform "matrix(0.5382 -0.8428 0.8428 0.5382 -98.7603 700.7441)", :y "437.6", :x "588.9"}]
     [:rect {:id "rect3337", :height "5.7", :width "2.4", :fill "#D6D6D6", :transform "matrix(0.5382 -0.8428 0.8428 0.5382 -99.3019 708.8547)", :y "442.2", :x "596"}]
     [:rect {:id "rect3339", :height "5.7", :width "2.4", :fill "#D6D6D6", :transform "matrix(0.5382 -0.8428 0.8428 0.5382 -99.7879 716.9974)", :y "446.7", :x "603.2"}]
     [:rect {:id "rect3341", :height "5.7", :width "2.4", :fill "#D6D6D6", :transform "matrix(0.5382 -0.8428 0.8428 0.5382 -100.3234 725.0131)", :y "451.2", :x "610.2"}]
     [:rect {:id "rect3343", :height "5.7", :width "2.4", :fill "#D6D6D6", :transform "matrix(0.5382 -0.8428 0.8428 0.5382 -100.9509 733.1625)", :y "455.9", :x "617.4"}]
     [:rect {:id "rect3345", :height "5.7", :width "2.4", :fill "#D6D6D6", :transform "matrix(0.5382 -0.8428 0.8428 0.5382 -101.3505 741.2676)", :y "460.3", :x "624.6"}]
     [:rect {:id "rect3347", :height "5.7", :width "2.4", :fill "#D6D6D6", :transform "matrix(0.5382 -0.8428 0.8428 0.5382 -101.9773 749.4169)", :y "464.9", :x "631.7"}]
     [:rect {:id "rect3349", :height "5.7", :width "2.4", :fill "#D6D6D6", :transform "matrix(0.5382 -0.8428 0.8428 0.5382 -102.5184 757.5275)", :y "469.5", :x "638.8"}]]]
   [:g {:id "d-apps2wrapper"}
    [:g {:id "g3382"}
     [:rect {:id "rect3354", :height "5.7", :width "2.4", :fill "#D6D6D6", :transform "matrix(0.5382 -0.8428 0.8428 0.5382 -137.7791 1334.7788)", :y "790.3", :x "1148"}]
     [:rect {:id "rect3356", :height "5.7", :width "2.4", :fill "#D6D6D6", :transform "matrix(0.5382 -0.8428 0.8428 0.5382 -138.405 1342.9287)", :y "794.9", :x "1155.1"}]
     [:rect {:id "rect3358", :height "5.7", :width "2.4", :fill "#D6D6D6", :transform "matrix(0.5382 -0.8428 0.8428 0.5382 -138.9467 1351.0399)", :y "799.5", :x "1162.2"}]
     [:rect {:id "rect3360", :height "5.7", :width "2.4", :fill "#D6D6D6", :transform "matrix(0.5382 -0.8428 0.8428 0.5382 -139.5742 1359.1882)", :y "804.1", :x "1169.3"}]
     [:rect {:id "rect3362", :height "5.7", :width "2.4", :fill "#D6D6D6", :transform "matrix(0.5382 -0.8428 0.8428 0.5382 -136.3217 1310.3108)", :y "776.7", :x "1126.4"}]
     [:rect {:id "rect3364", :height "5.7", :width "2.4", :fill "#D6D6D6", :transform "matrix(0.5382 -0.8428 0.8428 0.5382 -136.9473 1318.4607)", :y "781.4", :x "1133.5"}]
     [:rect {:id "rect3366", :height "5.7", :width "2.4", :fill "#D6D6D6", :transform "matrix(0.5382 -0.8428 0.8428 0.5382 -137.4887 1326.5713)", :y "785.9", :x "1140.6"}]
     [:rect {:id "rect3368", :height "5.7", :width "2.4", :fill "#D6D6D6", :transform "matrix(0.5382 -0.8428 0.8428 0.5382 -139.9677 1367.1974)", :y "808.5", :x "1176.4"}]
     [:rect {:id "rect3370", :height "5.7", :width "2.4", :fill "#D6D6D6", :transform "matrix(0.5382 -0.8428 0.8428 0.5382 -140.5943 1375.3479)", :y "813.1", :x "1183.6"}]
     [:rect {:id "rect3372", :height "5.7", :width "2.4", :fill "#D6D6D6", :transform "matrix(0.5382 -0.8428 0.8428 0.5382 -141.1363 1383.4574)", :y "817.7", :x "1190.7"}]
     [:rect {:id "rect3374", :height "5.7", :width "2.4", :fill "#D6D6D6", :transform "matrix(0.5382 -0.8428 0.8428 0.5382 -141.6216 1391.6019)", :y "822.2", :x "1197.9"}]
     [:rect {:id "rect3376", :height "5.7", :width "2.4", :fill "#D6D6D6", :transform "matrix(0.5382 -0.8428 0.8428 0.5382 -142.1568 1399.6168)", :y "826.7", :x "1204.9"}]
     [:rect {:id "rect3378", :height "5.7", :width "2.4", :fill "#D6D6D6", :transform "matrix(0.5382 -0.8428 0.8428 0.5382 -142.5549 1408.2074)", :y "831.3", :x "1212.6"}]
     [:rect {:id "rect3380", :height "5.7", :width "2.4", :fill "#D6D6D6", :transform "matrix(0.5382 -0.8428 0.8428 0.5382 -143.0962 1416.3175)", :y "835.9", :x "1219.7"}]]
    [:g {:id "d-apps2"}
     [:g {:id "g3406"}
      [:linearGradient {:gradientTransform "matrix(1 0 0 -1 0 1900)", :y2 "994.2559", :x2 "1227.5238", :y1 "1031.5428", :x1 "1292.1067", :gradientUnits "userSpaceOnUse", :id "d_SVGID_14_"}
       [:stop {:id "stop3384", :style "stop-color:#808080", :offset "0"}]
       [:stop {:id "stop3386", :style "stop-color:#6F6F6F", :offset "0.2627"}]
       [:stop {:id "stop3388", :style "stop-color:#575757", :offset "0.7192"}]
       [:stop {:id "stop3390", :style "stop-color:#4E4E4E", :offset "1"}]]
      [:path {:id "path3393", :d "M1308.2,888.8c-0.1-0.8-3.2,0.2-3.2,0.2v1.3c0,0,0-0.1-0.1-0.1l-49-28c0,0-4.5-3.1-10.7,0.6             l-48.7,28c0,0-0.6,0.1-0.6,0.3v-1.2c0,0-2.8-1-2.9-0.2c-0.4,2.3-0.2,1.9-0.1,3.5c0,1.1,0.8,2.3,3.1,3.5l47.5,27.5             c0,0,7.1,3.9,14.6,0l47.6-28.3c0,0,2.4-1.4,2.5-3.4C1308.6,890.9,1308.6,891,1308.2,888.8z", :fill "url(#d_SVGID_14_)"}]
      [:linearGradient {:gradientTransform "matrix(1 0 0 -1 0 1900)", :y2 "978.7307", :x2 "1272.7325", :y1 "1037.1101", :x1 "1231.855", :gradientUnits "userSpaceOnUse", :id "d_SVGID_15_"}
       [:stop {:id "stop3395", :style "stop-color:#9A9A9A", :offset "0"}]
       [:stop {:id "stop3397", :style "stop-color:#9F9F9F", :offset "0.3122"}]
       [:stop {:id "stop3399", :style "stop-color:#B0B0B0", :offset "0.7197"}]
       [:stop {:id "stop3401", :style "stop-color:#BFBFBF", :offset "1"}]]
      [:path {:id "path3404", :d "M1196.1,893.7l47.4,27.5c0,0,7.1,3.9,14.6,0l47.6-28.3c0,0,6.3-3.6-0.8-7.4l-49-28             c0,0-4.6-3.1-10.7,0.6l-48.5,28C1196.8,886.1,1188.9,889.9,1196.1,893.7z", :fill "url(#d_SVGID_15_)"}]]
     [:g {:id "g3430"}
      [:linearGradient {:gradientTransform "matrix(1 0 0 -1 0 1900)", :y2 "1003.7648", :x2 "1220.0916", :y1 "1045.3467", :x1 "1292.1136", :gradientUnits "userSpaceOnUse", :id "d_SVGID_16_"}
       [:stop {:id "stop3408", :style "stop-color:#A61D30", :offset "0"}]
       [:stop {:id "stop3410", :style "stop-color:#AA2033", :offset "0.2302"}]
       [:stop {:id "stop3412", :style "stop-color:#B4293A", :offset "0.4367"}]
       [:stop {:id "stop3414", :style "stop-color:#C73848", :offset "0.634"}]
       [:stop {:id "stop3416", :style "stop-color:#E04D5A", :offset "0.8245"}]
       [:stop {:id "stop3418", :style "stop-color:#FF6670", :offset "1"}]]
      [:path {:id "path3421", :d "M1308.2,875c-0.1-0.8-3.2,0.2-3.2,0.2v1.3c0,0,0-0.1-0.1-0.1l-49-28c0,0-4.5-3.1-10.7,0.6             l-48.7,28c0,0-0.6,0.1-0.6,0.3v-1.2c0,0-2.8-1-2.9-0.2c-0.4,2.3-0.2,1.9-0.1,3.5c0,1.1,0.8,2.3,3.1,3.5l47.5,27.5             c0,0,7.1,3.9,14.6,0l47.6-28.3c0,0,2.4-1.4,2.5-3.4C1308.6,877.1,1308.6,877.2,1308.2,875z", :fill "url(#d_SVGID_16_)"}]
      [:linearGradient {:gradientTransform "matrix(1 0 0 -1 0 1900)", :y2 "992.5413", :x2 "1272.7251", :y1 "1050.9205", :x1 "1231.8475", :gradientUnits "userSpaceOnUse", :id "d_SVGID_17_"}
       [:stop {:id "stop3423", :style "stop-color:#E6455C", :offset "0"}]
       [:stop {:id "stop3425", :style "stop-color:#FF3D49", :offset "1"}]]
      [:path {:id "path3428", :d "M1196.1,879.9l47.4,27.5c0,0,7.1,3.9,14.6,0l47.6-28.3c0,0,6.3-3.6-0.8-7.4l-49-28             c0,0-4.6-3.1-10.7,0.6l-48.5,28C1196.8,872.3,1188.9,876.1,1196.1,879.9z", :fill "url(#d_SVGID_17_)"}]]
     [:g {:id "g3462"}
      [:linearGradient {:gradientTransform "matrix(1 0 0 -1 0 1900)", :y2 "1033.2516", :x2 "1227.5164", :y1 "1070.5387", :x1 "1292.0992", :gradientUnits "userSpaceOnUse", :id "d_SVGID_18_"}
       [:stop {:id "stop3432", :style "stop-color:#808080", :offset "0"}]
       [:stop {:id "stop3434", :style "stop-color:#6F6F6F", :offset "0.2627"}]
       [:stop {:id "stop3436", :style "stop-color:#575757", :offset "0.7192"}]
       [:stop {:id "stop3438", :style "stop-color:#4E4E4E", :offset "1"}]]
      [:path {:id "path3441", :d "M1308.2,849.8c-0.1-0.8-3.2,0.2-3.2,0.2v1.3c0,0,0-0.1-0.1-0.1l-49-28c0,0-4.5-3.1-10.7,0.6             l-48.7,28c0,0-0.6,0.1-0.6,0.3v-1.2c0,0-2.8-1-2.9-0.2c-0.4,2.3-0.2,1.9-0.1,3.5c0,1.1,0.8,2.3,3.1,3.5l47.5,27.5             c0,0,7.1,3.9,14.6,0l47.6-28.3c0,0,2.4-1.4,2.5-3.4C1308.6,852,1308.6,852,1308.2,849.8z", :fill "url(#d_SVGID_18_)"}]
      [:linearGradient {:gradientTransform "matrix(1 0 0 -1 0 1900)", :y2 "1017.718", :x2 "1272.7388", :y1 "1076.097", :x1 "1231.8612", :gradientUnits "userSpaceOnUse", :id "d_SVGID_19_"}
       [:stop {:id "stop3443", :style "stop-color:#9A9A9A", :offset "0"}]
       [:stop {:id "stop3445", :style "stop-color:#9F9F9F", :offset "0.3122"}]
       [:stop {:id "stop3447", :style "stop-color:#B0B0B0", :offset "0.7197"}]
       [:stop {:id "stop3449", :style "stop-color:#BFBFBF", :offset "1"}]]
      [:path {:id "path3452", :d "M1196.1,854.7l47.4,27.5c0,0,7.1,3.9,14.6,0l47.6-28.3c0,0,6.3-3.6-0.8-7.4l-49-28             c0,0-4.6-3.1-10.7,0.6l-48.5,28C1196.8,847.2,1188.9,850.9,1196.1,854.7z", :fill "url(#d_SVGID_19_)"}]
      [:g {:id "g3460"}
       [:path {:id "path3454", :d "M1246.8,849.1c-0.3-0.8-0.5-1.6-0.8-2.3c-0.1-0.2-0.4-0.4-0.6-0.6c-0.4-0.4-1.1-0.7-1.2-1.2               c-0.8-1.9-1.5-3.8-2.1-5.7c-0.4-1.3,1.1-2.7,3.4-3.2c2.2-0.4,4.4,0.2,4.9,1.5c0.7,1.9,1.4,3.7,2,5.6c0.1,0.4,0.1,0.8-0.1,1.2               c-0.4,0.5-0.3,1-0.1,1.5c0.2,0.4,0.3,0.8,0.5,1.2c0.1,0.2,0.1,0.4,0.2,0.6c2.5-1.1,4.1-3.3,3.6-4.9c-0.7-2-1.4-4.1-2.1-6.1               c-0.1-0.3-0.2-0.5-0.4-0.7c-1.4-2-5.4-3-9.1-2.3c-4,0.8-6.9,3-6.8,5.4c0,0.7,0.3,1.5,0.6,2.2c0.6,1.6,1.1,3.3,1.9,4.9               C1241.2,848.1,1243.5,848.9,1246.8,849.1z", :fill "#FFFFFF"}]
       [:path {:id "path3456", :d "M1260.9,855.3c-0.4-1-1.3-1.8-2.7-2.3c-1.1-0.5-2.4-0.7-3.9-0.8c0.3,0.9,0.6,1.7,0.9,2.6               c0,0.1,0.2,0.2,0.3,0.2c0.9,0.3,1.3,0.9,1.5,1.5c0.6,1.7,1.3,3.4,1.8,5.1c0.1,0.4,0.2,0.9,0,1.4c-0.4,1.2-2.2,2.1-4.2,2.2               c-2,0.1-3.6-0.5-4-1.7c-0.6-1.7-1.3-3.4-1.9-5.1c-0.2-0.5-0.3-1.1,0-1.6c0.3-0.7,0.5-1.2,0.2-1.8c-0.1-0.2,0-0.5-0.1-0.7               c-0.1-0.3-0.2-0.6-0.3-0.9c-2.9,1.5-4.3,3.1-3.8,5c0.5,2,1.2,3.9,1.9,5.9c0.8,2.1,3.4,3.4,7,3.4c5.3,0,10.1-3.2,9.3-6.2               C1262.5,859.3,1261.7,857.3,1260.9,855.3z", :fill "#FFFFFF"}]
       [:path {:id "path3458", :d "M1251,844c-0.3-0.8-1.6-1.1-2.8-0.8c-1.2,0.2-2,1-1.7,1.7c0.7,1.9,3.6,10.3,4.4,12.2               c0.1,0.3,0.4,0.6,0.7,0.8c0.7,0.3,2,0.1,2.7-0.2s1.3-0.9,1.1-1.5C1254.5,853.5,1251.4,845.2,1251,844z", :fill "#FFFFFF"}]]]]
    [:g {:id "g3514"}
     [:linearGradient {:gradientTransform "matrix(1 0 0 -1 0 1900)", :y2 "1112.5714", :x2 "1250.4299", :y1 "1003.3376", :x1 "1250.4299", :gradientUnits "userSpaceOnUse", :id "d_SVGID_20_"}
      [:stop {:id "stop3465", :style "stop-color:#FFFFFF;stop-opacity:0", :offset "0"}]
      [:stop {:id "stop3467", :style "stop-color:#FFFFFF", :offset "0.291"}]
      [:stop {:id "stop3469", :style "stop-color:#FFFFFF;stop-opacity:0", :offset "0.9975"}]]
     [:path {:id "path3472", :d "M1307.9,862.9l-0.4-90.9h-114.6l0.5,90.7           c0,3.4,0.3,4.7,3.6,6.5l46.4,27.3c0,0,7.1,4,14.6,0l47.6-28.4C1305.6,868.1,1308.4,866.8,1307.9,862.9z", :enable-background "new    ", :fill "url(#d_SVGID_20_)", :opacity "0.25"}]
     [:g {:id "g3512"}
      [:circle {:id "circle3474", :r "1.5", :cy "825.7", :cx "1249.2", :fill "#FF8088"}]
      [:circle {:id "circle3476", :r "0.5", :cy "768.7", :cx "1214.2", :fill "#FF8088"}]
      [:circle {:id "circle3478", :r "0.7", :cy "840.3", :cx "1295.9", :fill "#FFFFFF"}]
      [:circle {:id "circle3480", :r "0.7", :cy "771.4", :cx "1277.5", :fill "#E64852"}]
      [:circle {:id "circle3482", :r "0.7", :cy "814.7", :cx "1260.2", :fill "#FFFFFF"}]
      [:circle {:id "circle3484", :r "0.7", :cy "855.4", :cx "1298.6", :fill "#FFFFFF"}]
      [:circle {:id "circle3486", :r "0.7", :cy "797", :cx "1292.4", :fill "#FFFFFF"}]
      [:circle {:id "circle3488", :r "0.7", :cy "800.5", :cx "1272.4", :fill "#FF8088"}]
      [:circle {:id "circle3490", :r "0.7", :cy "849.5", :cx "1269.1", :fill "#FFFFFF"}]
      [:circle {:id "circle3492", :r "0.7", :cy "831.9", :cx "1205.1", :fill "#FFFFFF"}]
      [:circle {:id "circle3494", :r "0.7", :cy "824.7", :cx "1228.2", :fill "#FFFFFF"}]
      [:circle {:id "circle3496", :r "1.4", :cy "818.8", :cx "1300", :fill "#E64852"}]
      [:circle {:id "circle3498", :r "0.7", :cy "801.9", :cx "1217.5", :fill "#FFFFFF"}]
      [:circle {:id "circle3500", :r "0.7", :cy "782.9", :cx "1202.6", :fill "#E64852"}]
      [:circle {:id "circle3502", :r "0.7", :cy "822.4", :cx "1208.8", :fill "#E64852"}]
      [:circle {:id "circle3504", :r "1", :cy "774.3", :cx "1250.5", :fill "#E64852"}]
      [:circle {:id "circle3506", :r "1.4", :cy "802.6", :cx "1235.1", :fill "#E64852"}]
      [:circle {:id "circle3508", :r "1.4", :cy "852.8", :cx "1203.9", :fill "#FFFFFF"}]
      [:circle {:id "circle3510", :r "1.4", :cy "831.9", :cx "1286.2", :fill "#FFFFFF"}]]]]
   [:g {:id "topgreyblocks"}
    [:g {:id "g3603"}
     [:linearGradient {:gradientTransform "matrix(1 1.170540e-04 1.170540e-04 -1 -1.549590e-02 1199.7689)", :y2 "903.5613", :x2 "990.4099", :y1 "880.5922", :x1 "947.494", :gradientUnits "userSpaceOnUse", :id "SVGID_14_"}
      [:stop {:id "stop3517", :style "stop-color:#262626", :offset "0"}]
      [:stop {:id "stop3519", :style "stop-color:#2F2F2F", :offset "0.2774"}]
      [:stop {:id "stop3521", :style "stop-color:#474747", :offset "0.7283"}]
      [:stop {:id "stop3523", :style "stop-color:#595959", :offset "1"}]]
     [:polygon {:id "polygon3526", :points "948.4,267.8 948.4,320.8 991.4,346.8 991.5,296.7    ", :fill "url(#SVGID_14_)"}]
     [:linearGradient {:gradientTransform "matrix(1 1.170540e-04 1.170540e-04 -1 -1.549590e-02 1199.7689)", :y2 "873.9838", :x2 "1033.5619", :y1 "909.6794", :x1 "997.8663", :gradientUnits "userSpaceOnUse", :id "SVGID_15_"}
      [:stop {:id "stop3528", :style "stop-color:#BFBFBF", :offset "0"}]
      [:stop {:id "stop3530", :style "stop-color:#969696", :offset "0.2132"}]
      [:stop {:id "stop3532", :style "stop-color:#717171", :offset "0.4462"}]
      [:stop {:id "stop3534", :style "stop-color:#565656", :offset "0.6625"}]
      [:stop {:id "stop3536", :style "stop-color:#464646", :offset "0.8538"}]
      [:stop {:id "stop3538", :style "stop-color:#404040", :offset "1"}]]
     [:polygon {:id "polygon3541", :points "991.5,296.7 991.4,346.8 1038.7,320.8 1038.7,267.8    ", :fill "url(#SVGID_15_)"}]
     [:linearGradient {:gradientTransform "matrix(1 1.170540e-04 1.170540e-04 -1 -1.549590e-02 1199.7689)", :y2 "955.3561", :x2 "1008.4671", :y1 "911.2566", :x1 "980.2971", :gradientUnits "userSpaceOnUse", :id "SVGID_16_"}
      [:stop {:id "stop3543", :style "stop-color:#BFBFBF", :offset "0"}]
      [:stop {:id "stop3545", :style "stop-color:#A2A2A2", :offset "0.219"}]
      [:stop {:id "stop3547", :style "stop-color:#7B7B7B", :offset "0.5607"}]
      [:stop {:id "stop3549", :style "stop-color:#636363", :offset "0.833"}]
      [:stop {:id "stop3551", :style "stop-color:#5A5A5A", :offset "1"}]]
     [:polygon {:id "polygon3554", :points "948.8,267.8 991.1,296.7 1038.6,267.9 994.7,240.1    ", :fill "url(#SVGID_16_)"}]
     [:linearGradient {:gradientTransform "matrix(1 1.170540e-04 1.170540e-04 -1 -1.549590e-02 1199.7689)", :y2 "912.3583", :x2 "1020.1381", :y1 "921.8813", :x1 "1010.6151", :gradientUnits "userSpaceOnUse", :id "SVGID_17_"}
      [:stop {:id "stop3564", :style "stop-color:#FFFFFF", :offset "0"}]
      [:stop {:id "stop3566", :style "stop-color:#D3D3D3", :offset "0.2961"}]
      [:stop {:id "stop3568", :style "stop-color:#ABABAB", :offset "0.604"}]
      [:stop {:id "stop3570", :style "stop-color:#939393", :offset "0.8495"}]
      [:stop {:id "stop3572", :style "stop-color:#8A8A8A", :offset "1"}]]
     [:polygon {:id "polygon3575", :points "992,296.7 992,297.7 1038.9,268.8 1039,267.9    ", :fill "url(#SVGID_17_)"}]
     [:linearGradient {:gradientTransform "matrix(-1 -1.170540e-04 1.170540e-04 -1 3721.9844 1200.2046)", :y2 "913.3389", :x2 "2755.3716", :y1 "920.8981", :x1 "2747.8123", :gradientUnits "userSpaceOnUse", :id "SVGID_18_"}
      [:stop {:id "stop3577", :style "stop-color:#FFFFFF", :offset "0"}]
      [:stop {:id "stop3579", :style "stop-color:#D3D3D3", :offset "0.2961"}]
      [:stop {:id "stop3581", :style "stop-color:#ABABAB", :offset "0.604"}]
      [:stop {:id "stop3583", :style "stop-color:#939393", :offset "0.8495"}]
      [:stop {:id "stop3585", :style "stop-color:#8A8A8A", :offset "1"}]]
     [:polygon {:id "polygon3588", :points "992,296.7 992,297.7 949,268.8 949,267.8    ", :fill "url(#SVGID_18_)"}]
     [:linearGradient {:gradientTransform "matrix(1 1.170540e-04 1.170540e-04 -1 -1.549590e-02 1199.7689)", :y2 "865.439", :x2 "1004.2247", :y1 "890.4445", :x1 "979.2193", :gradientUnits "userSpaceOnUse", :id "SVGID_19_"}
      [:stop {:id "stop3590", :style "stop-color:#FFFFFF", :offset "0"}]
      [:stop {:id "stop3592", :style "stop-color:#D3D3D3", :offset "0.2961"}]
      [:stop {:id "stop3594", :style "stop-color:#ABABAB", :offset "0.604"}]
      [:stop {:id "stop3596", :style "stop-color:#939393", :offset "0.8495"}]
      [:stop {:id "stop3598", :style "stop-color:#8A8A8A", :offset "1"}]]
     [:polygon {:id "polygon3601", :points "992.3,297.2 991.5,297.3 991.4,346.8 992.3,346.5    ", :fill "url(#SVGID_19_)"}]]
    [:g {:id "g3708"}
     [:g {:id "g3691"}
      [:linearGradient {:gradientTransform "matrix(1 1.170540e-04 1.170540e-04 -1 -1.549590e-02 1199.7689)", :y2 "809.5428", :x2 "832.421", :y1 "786.5737", :x1 "789.5049", :gradientUnits "userSpaceOnUse", :id "SVGID_20_"}
       [:stop {:id "stop3605", :style "stop-color:#262626", :offset "0"}]
       [:stop {:id "stop3607", :style "stop-color:#2F2F2F", :offset "0.2774"}]
       [:stop {:id "stop3609", :style "stop-color:#474747", :offset "0.7283"}]
       [:stop {:id "stop3611", :style "stop-color:#595959", :offset "1"}]]
      [:polygon {:style "fill-opacity:1.0;fill:url(#linearGradient6504)", :id "polygon3614", :points "790.4,361.8 790.4,414.8 833.4,440.8 833.5,390.7     ", :fill "url(#SVGID_20_)"}]
      [:linearGradient {:gradientTransform "matrix(1 1.170540e-04 1.170540e-04 -1 -1.549590e-02 1199.7689)", :y2 "779.9653", :x2 "875.5729", :y1 "815.6609", :x1 "839.8773", :gradientUnits "userSpaceOnUse", :id "SVGID_21_"}
       [:stop {:id "stop3616", :style "stop-color:#BFBFBF", :offset "0"}]
       [:stop {:id "stop3618", :style "stop-color:#969696", :offset "0.2132"}]
       [:stop {:id "stop3620", :style "stop-color:#717171", :offset "0.4462"}]
       [:stop {:id "stop3622", :style "stop-color:#565656", :offset "0.6625"}]
       [:stop {:id "stop3624", :style "stop-color:#464646", :offset "0.8538"}]
       [:stop {:id "stop3626", :style "stop-color:#404040", :offset "1"}]]
      [:polygon {:style "fill-opacity:1.0;fill:url(#linearGradient6506)", :id "polygon3629", :points "833.5,390.7 833.4,440.8 880.7,414.8 880.7,361.8     ", :fill "url(#SVGID_21_)"}]
      [:linearGradient {:gradientTransform "matrix(1 1.170540e-04 1.170540e-04 -1 -1.549590e-02 1199.7689)", :y2 "861.3376", :x2 "850.4781", :y1 "817.2381", :x1 "822.3081", :gradientUnits "userSpaceOnUse", :id "SVGID_22_"}
       [:stop {:id "stop3631", :style "stop-color:#BFBFBF", :offset "0"}]
       [:stop {:id "stop3633", :style "stop-color:#A2A2A2", :offset "0.219"}]
       [:stop {:id "stop3635", :style "stop-color:#7B7B7B", :offset "0.5607"}]
       [:stop {:id "stop3637", :style "stop-color:#636363", :offset "0.833"}]
       [:stop {:id "stop3639", :style "stop-color:#5A5A5A", :offset "1"}]]
      [:polygon {:style "fill-opacity:1.0;fill:url(#linearGradient6508)", :id "polygon3642", :points "790.8,361.8 833.1,390.7 880.6,361.9 836.7,334.1     ", :fill "url(#SVGID_22_)"}]
      [:linearGradient {:gradientTransform "matrix(1 1.170540e-04 1.170540e-04 -1 -1.549590e-02 1199.7689)", :y2 "818.3397", :x2 "862.1494", :y1 "827.8629", :x1 "852.626", :gradientUnits "userSpaceOnUse", :id "SVGID_23_"}
       [:stop {:id "stop3652", :style "stop-color:#FFFFFF", :offset "0"}]
       [:stop {:id "stop3654", :style "stop-color:#D3D3D3", :offset "0.2961"}]
       [:stop {:id "stop3656", :style "stop-color:#ABABAB", :offset "0.604"}]
       [:stop {:id "stop3658", :style "stop-color:#939393", :offset "0.8495"}]
       [:stop {:id "stop3660", :style "stop-color:#8A8A8A", :offset "1"}]]
      [:polygon {:style "fill-opacity:1.0;fill:url(#linearGradient6510)", :id "polygon3663", :points "834,390.7 834,391.7 880.9,362.8 881,361.9     ", :fill "url(#SVGID_23_)"}]
      [:linearGradient {:gradientTransform "matrix(-1 -1.170540e-04 1.170540e-04 -1 3721.9844 1200.2046)", :y2 "819.3204", :x2 "2913.3606", :y1 "826.8796", :x1 "2905.8013", :gradientUnits "userSpaceOnUse", :id "SVGID_24_"}
       [:stop {:id "stop3665", :style "stop-color:#FFFFFF", :offset "0"}]
       [:stop {:id "stop3667", :style "stop-color:#D3D3D3", :offset "0.2961"}]
       [:stop {:id "stop3669", :style "stop-color:#ABABAB", :offset "0.604"}]
       [:stop {:id "stop3671", :style "stop-color:#939393", :offset "0.8495"}]
       [:stop {:id "stop3673", :style "stop-color:#8A8A8A", :offset "1"}]]
      [:polygon {:style "fill-opacity:1.0;fill:url(#linearGradient6512)", :id "polygon3676", :points "834,390.7 834,391.7 791,362.8 791,361.8     ", :fill "url(#SVGID_24_)"}]
      [:linearGradient {:gradientTransform "matrix(1 1.170540e-04 1.170540e-04 -1 -1.549590e-02 1199.7689)", :y2 "771.4205", :x2 "846.2357", :y1 "796.426", :x1 "821.2303", :gradientUnits "userSpaceOnUse", :id "SVGID_25_"}
       [:stop {:id "stop3678", :style "stop-color:#FFFFFF", :offset "0"}]
       [:stop {:id "stop3680", :style "stop-color:#D3D3D3", :offset "0.2961"}]
       [:stop {:id "stop3682", :style "stop-color:#ABABAB", :offset "0.604"}]
       [:stop {:id "stop3684", :style "stop-color:#939393", :offset "0.8495"}]
       [:stop {:id "stop3686", :style "stop-color:#8A8A8A", :offset "1"}]]
      [:polygon {:style "fill-opacity:1.0;fill:url(#linearGradient6514)", :id "polygon3689", :points "834.3,391.2 833.5,391.3 833.4,440.8 834.3,440.5     ", :fill "url(#SVGID_25_)"}]]
     [:line {:stroke "#0A3A3C", :fill "none", :stroke-linejoin "round", :y1 "362.1", :stroke-linecap "round", :stroke-width "3.2211", :opacity "0.7", :id "line3693", :stroke-miterlimit "10", :x1 "881", :y2 "307", :x2 "972.4"}]
     [:g {:id "g3706"}
      [:image {:id "image3695", :transform "matrix(0.9804 0 0 0.9804 870.2711 328.2417)", :xlinkHref "data:image/png;base64,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 AAAAAElFTkSuQmCC", :height "51", :width "54", :enable-background "new    ", :opacity "0.2", :overflow "visible"}]
      [:g {:id "g3704"}
       [:linearGradient {:gradientTransform "matrix(-1 0 0 1 3563.1868 1126.7981)", :y2 "-769.5624", :x2 "2673.176", :y1 "-777.6976", :x1 "2660.3113", :gradientUnits "userSpaceOnUse", :id "SVGID_26_"}
        [:stop {:id "stop3697", :style "stop-color:#FFFFFF", :offset "0"}]
        [:stop {:id "stop3699", :style "stop-color:#FFFFFF;stop-opacity:0", :offset "0.8387"}]]
       [:polygon {:style "fill-opacity:1.0;fill:url(#linearGradient6502)", :id "polygon3702", :points "888.9,355 891.5,359.3 904.4,351 901.9,346.8      ", :fill "url(#SVGID_26_)"}]]]]
    [:g {:id "g3813"}
     [:g {:id "g3796"}
      [:linearGradient {:gradientTransform "matrix(1 1.170540e-04 1.170540e-04 -1 -1.549590e-02 1199.7689)", :y2 "712.5239", :x2 "671.4322", :y1 "689.5548", :x1 "628.5163", :gradientUnits "userSpaceOnUse", :id "SVGID_27_"}
       [:stop {:id "stop3710", :style "stop-color:#262626", :offset "0"}]
       [:stop {:id "stop3712", :style "stop-color:#2F2F2F", :offset "0.2774"}]
       [:stop {:id "stop3714", :style "stop-color:#474747", :offset "0.7283"}]
       [:stop {:id "stop3716", :style "stop-color:#595959", :offset "1"}]]
      [:polygon {:id "polygon3719", :points "629.4,458.8 629.4,511.8 672.4,537.8 672.5,487.7     ", :fill "url(#SVGID_27_)"}]
      [:linearGradient {:gradientTransform "matrix(1 1.170540e-04 1.170540e-04 -1 -1.549590e-02 1199.7689)", :y2 "682.9465", :x2 "714.5844", :y1 "718.6421", :x1 "678.8886", :gradientUnits "userSpaceOnUse", :id "SVGID_28_"}
       [:stop {:id "stop3721", :style "stop-color:#BFBFBF", :offset "0"}]
       [:stop {:id "stop3723", :style "stop-color:#969696", :offset "0.2132"}]
       [:stop {:id "stop3725", :style "stop-color:#717171", :offset "0.4462"}]
       [:stop {:id "stop3727", :style "stop-color:#565656", :offset "0.6625"}]
       [:stop {:id "stop3729", :style "stop-color:#464646", :offset "0.8538"}]
       [:stop {:id "stop3731", :style "stop-color:#404040", :offset "1"}]]
      [:polygon {:id "polygon3734", :points "672.5,487.7 672.4,537.8 719.7,511.8 719.7,458.8     ", :fill "url(#SVGID_28_)"}]
      [:linearGradient {:gradientTransform "matrix(1 1.170540e-04 1.170540e-04 -1 -1.549590e-02 1199.7689)", :y2 "764.3188", :x2 "689.4895", :y1 "720.2193", :x1 "661.3195", :gradientUnits "userSpaceOnUse", :id "SVGID_29_"}
       [:stop {:id "stop3736", :style "stop-color:#BFBFBF", :offset "0"}]
       [:stop {:id "stop3738", :style "stop-color:#A2A2A2", :offset "0.219"}]
       [:stop {:id "stop3740", :style "stop-color:#7B7B7B", :offset "0.5607"}]
       [:stop {:id "stop3742", :style "stop-color:#636363", :offset "0.833"}]
       [:stop {:id "stop3744", :style "stop-color:#5A5A5A", :offset "1"}]]
      [:polygon {:id "polygon3747", :points "629.8,458.8 672.1,487.7 719.6,458.9 675.7,431.1     ", :fill "url(#SVGID_29_)"}]
      [:g {:id "g3755", :opacity "0.12"}
       [:polygon {:id "polygon3749", :points "640.4,466.5 640.4,505.7 672.4,524.9 672.5,487.8      ", :fill "#FFFFFF"}]
       [:polygon {:id "polygon3751", :points "706.2,466.5 706.2,505.7 672.4,524.9 672.5,487.8      ", :fill "#FFFFFF"}]
       [:polygon {:id "polygon3753", :points "640.3,466.5 672.2,487.8 707.1,466.5 674.4,445.9      ", :fill "#FFFFFF"}]]
      [:linearGradient {:gradientTransform "matrix(1 1.170540e-04 1.170540e-04 -1 -1.549590e-02 1199.7689)", :y2 "721.3209", :x2 "701.1605", :y1 "730.844", :x1 "691.6375", :gradientUnits "userSpaceOnUse", :id "SVGID_30_"}
       [:stop {:id "stop3757", :style "stop-color:#FFFFFF", :offset "0"}]
       [:stop {:id "stop3759", :style "stop-color:#D3D3D3", :offset "0.2961"}]
       [:stop {:id "stop3761", :style "stop-color:#ABABAB", :offset "0.604"}]
       [:stop {:id "stop3763", :style "stop-color:#939393", :offset "0.8495"}]
       [:stop {:id "stop3765", :style "stop-color:#8A8A8A", :offset "1"}]]
      [:polygon {:id "polygon3768", :points "673,487.7 673,488.7 719.9,459.8 720,458.9     ", :fill "url(#SVGID_30_)"}]
      [:linearGradient {:gradientTransform "matrix(-1 -1.170540e-04 1.170540e-04 -1 3721.9844 1200.2046)", :y2 "722.3018", :x2 "3074.3489", :y1 "729.8606", :x1 "3066.79", :gradientUnits "userSpaceOnUse", :id "SVGID_31_"}
       [:stop {:id "stop3770", :style "stop-color:#FFFFFF", :offset "0"}]
       [:stop {:id "stop3772", :style "stop-color:#D3D3D3", :offset "0.2961"}]
       [:stop {:id "stop3774", :style "stop-color:#ABABAB", :offset "0.604"}]
       [:stop {:id "stop3776", :style "stop-color:#939393", :offset "0.8495"}]
       [:stop {:id "stop3778", :style "stop-color:#8A8A8A", :offset "1"}]]
      [:polygon {:id "polygon3781", :points "673,487.7 673,488.7 630,459.8 630,458.8     ", :fill "url(#SVGID_31_)"}]
      [:linearGradient {:gradientTransform "matrix(1 1.170540e-04 1.170540e-04 -1 -1.549590e-02 1199.7689)", :y2 "674.4018", :x2 "685.247", :y1 "699.407", :x1 "660.2417", :gradientUnits "userSpaceOnUse", :id "SVGID_32_"}
       [:stop {:id "stop3783", :style "stop-color:#FFFFFF", :offset "0"}]
       [:stop {:id "stop3785", :style "stop-color:#D3D3D3", :offset "0.2961"}]
       [:stop {:id "stop3787", :style "stop-color:#ABABAB", :offset "0.604"}]
       [:stop {:id "stop3789", :style "stop-color:#939393", :offset "0.8495"}]
       [:stop {:id "stop3791", :style "stop-color:#8A8A8A", :offset "1"}]]
      [:polygon {:id "polygon3794", :points "673.3,488.2 672.5,488.3 672.4,537.8 673.3,537.5     ", :fill "url(#SVGID_32_)"}]]
     [:line {:stroke "#0A3A3C", :fill "none", :stroke-linejoin "round", :y1 "459.1", :stroke-linecap "round", :stroke-width "3.2211", :opacity "0.7", :id "line3798", :stroke-miterlimit "10", :x1 "720", :y2 "400.3", :x2 "814.4"}]
     [:g {:id "g3811"}
      [:image {:id "image3800", :transform "matrix(0.9804 0 0 0.9804 738.2711 406.2417)", :xlinkHref "data:image/png;base64,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 AAAAAElFTkSuQmCC", :height "51", :width "54", :enable-background "new    ", :opacity "0.2", :overflow "visible"}]
      [:g {:id "g3809"}
       [:linearGradient {:gradientTransform "matrix(-1 0 0 1 3563.1868 1126.7981)", :y2 "-691.5624", :x2 "2805.176", :y1 "-699.6976", :x1 "2792.3113", :gradientUnits "userSpaceOnUse", :id "SVGID_33_"}
        [:stop {:id "stop3802", :style "stop-color:#FFFFFF", :offset "0"}]
        [:stop {:id "stop3804", :style "stop-color:#FFFFFF;stop-opacity:0", :offset "0.8387"}]]
       [:polygon {:style "fill-opacity:1.0;fill:url(#linearGradient6500)", :id "polygon3807", :points "756.9,433 759.5,437.3 772.4,429 769.9,424.8      ", :fill "url(#SVGID_33_)"}]]]]
    [:g {:id "g3918"}
     [:g {:id "g3901"}
      [:linearGradient {:gradientTransform "matrix(1 1.170540e-04 1.170540e-04 -1 -1.549590e-02 1199.7689)", :y2 "616.1468", :x2 "514.4439", :y1 "593.1777", :x1 "471.528", :gradientUnits "userSpaceOnUse", :id "SVGID_34_"}
       [:stop {:id "stop3815", :style "stop-color:#262626", :offset "0"}]
       [:stop {:id "stop3817", :style "stop-color:#2F2F2F", :offset "0.2774"}]
       [:stop {:id "stop3819", :style "stop-color:#474747", :offset "0.7283"}]
       [:stop {:id "stop3821", :style "stop-color:#595959", :offset "1"}]]
      [:polygon {:style "fill-opacity:1;fill:url(#linearGradient6482);opacity:1", :id "polygon3824", :points "472.4,555.2 472.4,608.2 515.4,634.2 515.5,584.1     ", :fill "url(#SVGID_34_)"}]
      [:linearGradient {:gradientTransform "matrix(1 1.170540e-04 1.170540e-04 -1 -1.549590e-02 1199.7689)", :y2 "586.5693", :x2 "557.5959", :y1 "622.2655", :x1 "521.8997", :gradientUnits "userSpaceOnUse", :id "SVGID_35_"}
       [:stop {:id "stop3826", :style "stop-color:#BFBFBF", :offset "0"}]
       [:stop {:id "stop3828", :style "stop-color:#969696", :offset "0.2132"}]
       [:stop {:id "stop3830", :style "stop-color:#717171", :offset "0.4462"}]
       [:stop {:id "stop3832", :style "stop-color:#565656", :offset "0.6625"}]
       [:stop {:id "stop3834", :style "stop-color:#464646", :offset "0.8538"}]
       [:stop {:id "stop3836", :style "stop-color:#404040", :offset "1"}]]
      [:polygon {:style "fill-opacity:1.0;fill:url(#linearGradient6484)", :id "polygon3839", :points "515.5,584.1 515.4,634.2 562.7,608.2 562.7,555.2     ", :fill "url(#SVGID_35_)"}]
      [:linearGradient {:gradientTransform "matrix(1 1.170540e-04 1.170540e-04 -1 -1.549590e-02 1199.7689)", :y2 "667.9416", :x2 "532.5008", :y1 "623.842", :x1 "504.3308", :gradientUnits "userSpaceOnUse", :id "SVGID_36_"}
       [:stop {:id "stop3841", :style "stop-color:#BFBFBF", :offset "0"}]
       [:stop {:id "stop3843", :style "stop-color:#A2A2A2", :offset "0.219"}]
       [:stop {:id "stop3845", :style "stop-color:#7B7B7B", :offset "0.5607"}]
       [:stop {:id "stop3847", :style "stop-color:#636363", :offset "0.833"}]
       [:stop {:id "stop3849", :style "stop-color:#5A5A5A", :offset "1"}]]
      [:polygon {:style "fill-opacity:1.0;fill:url(#linearGradient6486)", :id "polygon3852", :points "472.8,555.2 515.1,584.1 562.6,555.3 518.7,527.4     ", :fill "url(#SVGID_36_)"}]
      [:linearGradient {:gradientTransform "matrix(1 1.170540e-04 1.170540e-04 -1 -1.549590e-02 1199.7689)", :y2 "624.9434", :x2 "544.172", :y1 "634.4672", :x1 "534.6481", :gradientUnits "userSpaceOnUse", :id "SVGID_37_"}
       [:stop {:id "stop3862", :style "stop-color:#FFFFFF", :offset "0"}]
       [:stop {:id "stop3864", :style "stop-color:#D3D3D3", :offset "0.2961"}]
       [:stop {:id "stop3866", :style "stop-color:#ABABAB", :offset "0.604"}]
       [:stop {:id "stop3868", :style "stop-color:#939393", :offset "0.8495"}]
       [:stop {:id "stop3870", :style "stop-color:#8A8A8A", :offset "1"}]]
      [:polygon {:style "fill-opacity:1.0;fill:url(#linearGradient6488)", :id "polygon3873", :points "516,584.1 516,585 562.9,556.2 563,555.3     ", :fill "url(#SVGID_37_)"}]
      [:linearGradient {:gradientTransform "matrix(-1 -1.170540e-04 1.170540e-04 -1 3721.9844 1200.2046)", :y2 "625.9242", :x2 "3231.3376", :y1 "633.4838", :x1 "3223.7781", :gradientUnits "userSpaceOnUse", :id "SVGID_38_"}
       [:stop {:id "stop3875", :style "stop-color:#FFFFFF", :offset "0"}]
       [:stop {:id "stop3877", :style "stop-color:#D3D3D3", :offset "0.2961"}]
       [:stop {:id "stop3879", :style "stop-color:#ABABAB", :offset "0.604"}]
       [:stop {:id "stop3881", :style "stop-color:#939393", :offset "0.8495"}]
       [:stop {:id "stop3883", :style "stop-color:#8A8A8A", :offset "1"}]]
      [:polygon {:style "fill-opacity:1.0;fill:url(#linearGradient6494)", :fill "url(#SVGID_38_)", :id "polygon3886", :points "516,584.1 516,585 473,556.2 473,555.2     "}]
      [:linearGradient {:gradientTransform "matrix(1 1.170540e-04 1.170540e-04 -1 -1.549590e-02 1199.7689)", :y2 "578.0247", :x2 "528.2585", :y1 "603.0305", :x1 "503.2527", :gradientUnits "userSpaceOnUse", :id "SVGID_39_"}
       [:stop {:id "stop3888", :style "stop-color:#FFFFFF", :offset "0"}]
       [:stop {:id "stop3890", :style "stop-color:#D3D3D3", :offset "0.2961"}]
       [:stop {:id "stop3892", :style "stop-color:#ABABAB", :offset "0.604"}]
       [:stop {:id "stop3894", :style "stop-color:#939393", :offset "0.8495"}]
       [:stop {:id "stop3896", :style "stop-color:#8A8A8A", :offset "1"}]]
      [:polygon {:style "fill-opacity:1.0;fill:url(#linearGradient6496)", :id "polygon3899", :points "516.3,584.6 515.5,584.7 515.4,634.2 516.3,633.8     ", :fill "url(#SVGID_39_)"}]]
     [:line {:stroke "#0A3A3C", :fill "none", :stroke-linejoin "round", :y1 "555.5", :stroke-linecap "round", :stroke-width "3.2211", :opacity "0.7", :id "line3903", :stroke-miterlimit "10", :x1 "563", :y2 "501.9", :x2 "648.3"}]
     [:g {:id "g3916"}
      [:image {:id "image3905", :transform "matrix(0.98 0 0 0.98 590.2817 497.2417)", :xlinkHref "data:image/png;base64,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 RK5CYII=", :height "50", :width "54", :enable-background "new    ", :opacity "0.2", :overflow "visible"}]
      [:g {:id "g3914"}
       [:linearGradient {:gradientTransform "matrix(-1 0 0 1 3563.1868 1126.7981)", :y2 "-601.2035", :x2 "2953.176", :y1 "-609.3386", :x1 "2940.311", :gradientUnits "userSpaceOnUse", :id "SVGID_40_"}
        [:stop {:id "stop3907", :style "stop-color:#FFFFFF", :offset "0"}]
        [:stop {:id "stop3909", :style "stop-color:#FFFFFF;stop-opacity:0", :offset "0.8387"}]]
       [:polygon {:style "fill-opacity:1.0;fill:url(#linearGradient6498)", :id "polygon3912", :points "608.9,523.4 611.5,527.6 624.4,519.4 621.9,515.1      ", :fill "url(#SVGID_40_)"}]]]]]
   [:g {:id "redglow"}
    [:linearGradient {:gradientUnits "userSpaceOnUse", :gradientTransform "matrix(0.3592 -0.3065 1.2019 0.6834 1339.3929 1550.1232)", :y2 "-787.5014", :y1 "-920.6589", :x2 "885.9467", :x1 "885.7858", :id "SVGID_41_"}
     [:stop {:id "stop3921", :style "stop-color:#FFFFFF;stop-opacity:0", :offset "0"}]
     [:stop {:id "stop3923", :style "stop-color:#FFFFFF", :offset "1"}]]
    [:polygon {:id "polygon3926", :opacity "0.25", :enable-background "new    ", :points "733.6,720 683.4,767.8 491.1,643.4    555.6,608.9   ", :fill "url(#SVGID_41_)", :class "particlespoly"}]
    [:linearGradient {:gradientUnits "userSpaceOnUse", :gradientTransform "matrix(0.3592 -0.3065 1.2019 0.6834 1339.3929 1550.1232)", :y2 "-790.8901", :y1 "-985.6109", :x2 "993.0236", :x1 "1042.4587", :id "SVGID_42_"}
     [:stop {:id "stop3928", :style "stop-color:#FFFFFF;stop-opacity:0", :offset "0"}]
     [:stop {:id "stop3930", :style "stop-color:#FFD7DA;stop-opacity:0.2113", :offset "0.2113"}]
     [:stop {:id "stop3932", :style "stop-color:#FFB1B8;stop-opacity:0.4448", :offset "0.4448"}]
     [:stop {:id "stop3934", :style "stop-color:#FF969F;stop-opacity:0.6617", :offset "0.6617"}]
     [:stop {:id "stop3936", :style "stop-color:#FF8690;stop-opacity:0.8535", :offset "0.8535"}]
     [:stop {:id "stop3938", :style "stop-color:#FF808B", :offset "1"}]]
    [:polygon {:id "polygon3941", :opacity "0.75", :enable-background "new    ", :points "777.3,682.4 718.3,724 493.5,577.2    556,537.9   ", :fill "url(#SVGID_42_)", :class "particlespoly"}]
    [:g {:id "redglowparticles"}
     [:circle {:id "circle3943", :fill "#FFFFFF", :r "1.6", :cy "631.8", :cx "548.8"}]
     [:circle {:id "circle3945", :fill "#FFFFFF", :r "1.6", :cy "613.6", :cx "537.9"}]
     [:circle {:id "circle3947", :fill "#FFFFFF", :r "1.6", :cy "676", :cx "606.4"}]
     [:circle {:id "circle3949", :fill "#FFFFFF", :r "1.6", :cy "657.4", :cx "725.1"}]
     [:circle {:id "circle3951", :fill "#FFFFFF", :r "1.6", :cy "596.8", :cx "542.7"}]
     [:circle {:id "circle3953", :fill "#FFFFFF", :r "1.6", :cy "724.8", :cx "623.7"}]
     [:circle {:id "circle3955", :fill "#FFFFFF", :r "1.6", :cy "708", :cx "696.2"}]
     [:circle {:id "circle3957", :fill "#FFFFFF", :r "1.6", :cy "610.4", :cx "611.1"}]
     [:circle {:id "circle3959", :fill "#FFFFFF", :r "1.6", :cy "553.5", :cx "564.1"}]
     [:circle {:id "circle3961", :fill "#FFFFFF", :r "1.6", :cy "589.4", :cx "554.2"}]
     [:circle {:id "circle3963", :fill "#FFFFFF", :r "1.6", :cy "625", :cx "670"}]
     [:ellipse {:id "ellipse3965", :transform "matrix(0.3162 -0.9487 0.9487 0.3162 -248.554 915.582)", :ry "3.2", :rx "3.2", :fill "#FFFFFF", :cy "630.2", :cx "510.9"}]]
    [:linearGradient {:gradientUnits "userSpaceOnUse", :gradientTransform "matrix(0.3592 -0.3065 1.2019 0.6834 1339.3929 1550.1232)", :y2 "-817.3937", :y1 "-968.8058", :x2 "874.2567", :x1 "891.1575", :id "SVGID_43_"}
     [:stop {:id "stop3968", :style "stop-color:#FFFFFF;stop-opacity:0", :offset "7.030000e-02"}]
     [:stop {:id "stop3970", :style "stop-color:#FFFFFF", :offset "1"}]]
    [:polygon {:id "polygon3973", :opacity "0.35", :enable-background "new    ", :points "672,693.7 672,760.4 492.3,643.8    492.7,577.2   ", :fill "url(#SVGID_43_)", :class "particlespoly"}]
    [:linearGradient {:gradientUnits "userSpaceOnUse", :gradientTransform "matrix(0.3592 -0.3065 1.2019 0.6834 1339.3929 1550.1232)", :y2 "-831.72", :y1 "-943.0591", :x2 "876.6129", :x1 "889.0407", :id "SVGID_44_"}
     [:stop {:id "stop3975", :style "stop-color:#FFFFFF;stop-opacity:0", :offset "0"}]
     [:stop {:id "stop3977", :style "stop-color:#FFFFFF", :offset "1"}]]
    [:polygon {:id "polygon3980", :opacity "0.35", :enable-background "new    ", :points "672,717 672,736.3 492.3,619.6 492.7,600.5        ", :fill "url(#SVGID_44_)", :class "particlespoly"}]
    [:linearGradient {:gradientUnits "userSpaceOnUse", :gradientTransform "matrix(0.3592 -0.3065 1.2019 0.6834 1339.3929 1550.1232)", :y2 "-821.5145", :y1 "-979.2617", :x2 "1062.9662", :x1 "1096.1616", :id "SVGID_45_"}
     [:stop {:id "stop3982", :style "stop-color:#FFFFFF;stop-opacity:0", :offset "0"}]
     [:stop {:id "stop3984", :style "stop-color:#FFFFFF", :offset "1"}]]
    [:polygon {:id "polygon3987", :opacity "0.2", :enable-background "new    ", :points "733.3,655.8 732.3,668.5 555,550.9 555,537.7        ", :fill "url(#SVGID_45_)", :class "particlespoly"}]
    [:g {:id "g3993", :opacity "0.25", :class "particlespoly"}
     [:polygon {:id "polygon3989", :points "602.1,626.4 605.2,611 632.9,608.1 636.4,604.4 601.7,607.7 597.7,629.2    ", :fill "#FFFFFF"}]
     [:polygon {:id "polygon3991", :points "594,618.4 597.2,603 625.4,599.5 628.3,596.3 593.7,599.7 589.7,621.2    ", :fill "#FFFFFF"}]]]
   [:g {:id "blocksticks"}
    [:g {:id "g4014"}
     [:rect {:id "rect3996", :height "1.2", :width "2.8", :fill "#BFBFBF", :transform "matrix(0.8588 -0.5124 0.5124 0.8588 40.4099 777.3287)", :y "314.8", :x "1428.8"}]
     [:rect {:id "rect3998", :height "1.2", :width "2.8", :fill "#BFBFBF", :transform "matrix(0.8588 -0.5124 0.5124 0.8588 42.0468 778.856)", :y "312.6", :x "1432.4"}]
     [:rect {:id "rect4000", :height "1.2", :width "2.8", :fill "#BFBFBF", :transform "matrix(0.8588 -0.5124 0.5124 0.8588 43.6837 780.3834)", :y "310.4", :x "1435.9"}]
     [:rect {:id "rect4002", :height "1.2", :width "2.8", :fill "#BFBFBF", :transform "matrix(0.8588 -0.5124 0.5124 0.8588 45.2837 781.9971)", :y "308.3", :x "1439.7"}]
     [:rect {:id "rect4004", :height "1.2", :width "2.8", :fill "#BFBFBF", :transform "matrix(0.8588 -0.5124 0.5124 0.8588 46.9205 783.5242)", :y "306.1", :x "1443.3"}]
     [:rect {:id "rect4006", :height "1.2", :width "2.8", :fill "#BFBFBF", :transform "matrix(0.8588 -0.5124 0.5124 0.8588 48.5192 785.0148)", :y "303.9", :x "1446.8"}]
     [:rect {:id "rect4008", :height "1.2", :width "2.8", :fill "#BFBFBF", :transform "matrix(0.8588 -0.5124 0.5124 0.8588 50.1327 786.6038)", :y "301.8", :x "1450.5"}]
     [:rect {:id "rect4010", :height "1.2", :width "2.8", :fill "#BFBFBF", :transform "matrix(0.8588 -0.5124 0.5124 0.8588 51.7561 788.1558)", :y "299.6", :x "1454.1"}]
     [:rect {:id "rect4012", :height "1.2", :width "2.8", :fill "#BFBFBF", :transform "matrix(0.8588 -0.5124 0.5124 0.8588 53.3696 789.7447)", :y "297.5", :x "1457.8"}]]
    [:g {:id "g4018"}
     [:line {:stroke "#FF4D6B", :fill "none", :stroke-linejoin "round", :y1 "511.7", :stroke-linecap "round", :stroke-width "3.4927", :id "line4016", :stroke-miterlimit "10", :x1 "1096.5", :y2 "464.3", :x2 "1176.2"}]]
    [:g {:id "g4022"}
     [:line {:stroke "#FF4D6B", :fill "none", :stroke-linejoin "round", :y1 "605.7", :stroke-linecap "round", :stroke-width "3.4927", :id "line4020", :stroke-miterlimit "10", :x1 "938.5", :y2 "558.3", :x2 "1018.2"}]]
    [:g {:id "g4026"}
     [:line {:stroke "#FF4D6B", :fill "none", :stroke-linejoin "round", :y1 "699.4", :stroke-linecap "round", :stroke-width "3.4927", :id "line4024", :stroke-miterlimit "10", :x1 "781.4", :y2 "652.1", :x2 "861"}]]
    [:g {:id "g4030"}
     [:line {:stroke "#FF4D6B", :fill "none", :stroke-linejoin "round", :y1 "791.7", :stroke-linecap "round", :stroke-width "3.4927", :id "line4028", :stroke-miterlimit "10", :x1 "624.2", :y2 "744.3", :x2 "703.9"}]]
    [:g {:id "g4034"}
     [:line {:stroke "#FF4D6B", :fill "none", :stroke-linejoin "round", :y1 "885.5", :stroke-linecap "round", :stroke-width "3.4927", :id "line4032", :stroke-miterlimit "10", :x1 "468", :y2 "838.2", :x2 "547.7"}]]
    [:g {:id "g4038"}
     [:line {:stroke "#FF4D6B", :fill "none", :stroke-linejoin "round", :y1 "417.7", :stroke-linecap "round", :stroke-width "3.4927", :id "line4036", :stroke-miterlimit "10", :x1 "1257.5", :y2 "370.3", :x2 "1337.2"}]]]
   [:g {:id "redblocksparticles"}
    [:g {:id "g4095"}
     [:linearGradient {:gradientUnits "userSpaceOnUse", :gradientTransform "matrix(-0.3592 -0.3065 -1.2019 0.6834 2623.3687 1550.1232)", :y2 "168.2118", :y1 "114.5993", :x2 "3659.948", :x1 "3650.8601", :id "SVGID_91_"}
      [:stop {:id "stop4041", :style "stop-color:#FFB3B7;stop-opacity:0", :offset "0"}]
      [:stop {:id "stop4043", :style "stop-color:#FFB3B7", :offset "1"}]]
     [:polygon {:id "polygon4046", :enable-background "new    ", :points "1114,501.7 1114,579 1202,523 1142.3,486            ", :fill "url(#SVGID_91_)"}]
     [:linearGradient {:gradientUnits "userSpaceOnUse", :gradientTransform "matrix(-0.3592 -0.3065 -1.2019 0.6834 2623.3687 1550.1232)", :y2 "152.319", :y1 "74.9866", :x2 "3799.0762", :x1 "3814.6211", :id "SVGID_92_"}
      [:stop {:id "stop4048", :style "stop-color:#FFB3B7;stop-opacity:0", :offset "0"}]
      [:stop {:id "stop4050", :style "stop-color:#FFB3B7", :offset "1"}]]
     [:polygon {:id "polygon4053", :enable-background "new    ", :points "1050.3,461.1 1113,502 1204,450.6      1141.3,409    ", :fill "url(#SVGID_92_)"}]
     [:g {:id "g4093"}
      [:circle {:id "circle4055", :fill "#FF8088", :r "1.5", :cy "508.7", :cx "1115.2"}]
      [:circle {:id "circle4057", :fill "#FF8088", :r "0.5", :cy "451.7", :cx "1080.2"}]
      [:circle {:id "circle4059", :fill "#FFFFFF", :r "0.7", :cy "523.3", :cx "1161.9"}]
      [:circle {:id "circle4061", :fill "#E64852", :r "0.7", :cy "454.4", :cx "1143.5"}]
      [:circle {:id "circle4063", :fill "#FFFFFF", :r "0.7", :cy "497.7", :cx "1126.2"}]
      [:circle {:id "circle4065", :fill "#FFFFFF", :r "0.7", :cy "538.4", :cx "1164.6"}]
      [:circle {:id "circle4067", :fill "#FFFFFF", :r "0.7", :cy "480", :cx "1158.4"}]
      [:circle {:id "circle4069", :fill "#FF8088", :r "0.7", :cy "483.5", :cx "1138.4"}]
      [:circle {:id "circle4071", :fill "#FFFFFF", :r "0.7", :cy "532.5", :cx "1135.1"}]
      [:circle {:id "circle4073", :fill "#FFFFFF", :r "0.7", :cy "514.9", :cx "1071.1"}]
      [:circle {:id "circle4075", :fill "#FFFFFF", :r "0.7", :cy "507.7", :cx "1094.2"}]
      [:circle {:id "circle4077", :fill "#E64852", :r "1.4", :cy "501.8", :cx "1166"}]
      [:circle {:id "circle4079", :fill "#FFFFFF", :r "0.7", :cy "484.9", :cx "1083.5"}]
      [:circle {:id "circle4081", :fill "#E64852", :r "0.7", :cy "465.9", :cx "1068.6"}]
      [:circle {:id "circle4083", :fill "#E64852", :r "0.7", :cy "505.4", :cx "1074.8"}]
      [:circle {:id "circle4085", :fill "#E64852", :r "1", :cy "457.3", :cx "1116.5"}]
      [:circle {:id "circle4087", :fill "#E64852", :r "1.4", :cy "485.6", :cx "1101.1"}]
      [:circle {:id "circle4089", :fill "#FFFFFF", :r "1.4", :cy "535.8", :cx "1069.9"}]
      [:circle {:id "circle4091", :fill "#FFFFFF", :r "1.4", :cy "514.9", :cx "1152.2"}]]]
    [:g {:id "g4151"}
     [:linearGradient {:gradientUnits "userSpaceOnUse", :gradientTransform "matrix(-0.3592 -0.3065 -1.2019 0.6834 2623.3687 1550.1232)", :y2 "435.9983", :y1 "382.3858", :x2 "3643.6531", :x1 "3634.5652", :id "SVGID_93_"}
      [:stop {:id "stop4097", :style "stop-color:#FFB3B7;stop-opacity:0", :offset "0"}]
      [:stop {:id "stop4099", :style "stop-color:#FFB3B7", :offset "1"}]]
     [:polygon {:id "polygon4102", :opacity "0.35", :enable-background "new    ", :points "798,689.7 798,767 886,711 826.3,674    ", :fill "url(#SVGID_93_)"}]
     [:linearGradient {:gradientUnits "userSpaceOnUse", :gradientTransform "matrix(-0.3592 -0.3065 -1.2019 0.6834 2623.3687 1550.1232)", :y2 "420.1066", :y1 "342.7743", :x2 "3782.7813", :x1 "3798.3262", :id "SVGID_94_"}
      [:stop {:id "stop4104", :style "stop-color:#FFB3B7;stop-opacity:0", :offset "0"}]
      [:stop {:id "stop4106", :style "stop-color:#FFB3B7", :offset "1"}]]
     [:polygon {:id "polygon4109", :opacity "0.35", :enable-background "new    ", :points "734.3,649.1 797,690 888,638.6 825.3,597            ", :fill "url(#SVGID_94_)"}]
     [:g {:id "g4149"}
      [:circle {:id "circle4111", :fill "#FF8088", :r "1.5", :cy "696.7", :cx "799.2"}]
      [:circle {:id "circle4113", :fill "#FF8088", :r "0.5", :cy "639.7", :cx "764.2"}]
      [:circle {:id "circle4115", :fill "#FFFFFF", :r "0.7", :cy "711.3", :cx "845.9"}]
      [:circle {:id "circle4117", :fill "#E64852", :r "0.7", :cy "642.4", :cx "827.5"}]
      [:circle {:id "circle4119", :fill "#FFFFFF", :r "0.7", :cy "685.7", :cx "810.2"}]
      [:circle {:id "circle4121", :fill "#FFFFFF", :r "0.7", :cy "726.4", :cx "848.6"}]
      [:circle {:id "circle4123", :fill "#FFFFFF", :r "0.7", :cy "668", :cx "842.4"}]
      [:circle {:id "circle4125", :fill "#FF8088", :r "0.7", :cy "671.5", :cx "822.4"}]
      [:circle {:id "circle4127", :fill "#FFFFFF", :r "0.7", :cy "720.5", :cx "819.1"}]
      [:circle {:id "circle4129", :fill "#FFFFFF", :r "0.7", :cy "702.9", :cx "755.1"}]
      [:circle {:id "circle4131", :fill "#FFFFFF", :r "0.7", :cy "695.7", :cx "778.2"}]
      [:circle {:id "circle4133", :fill "#E64852", :r "1.4", :cy "689.8", :cx "850"}]
      [:circle {:id "circle4135", :fill "#FFFFFF", :r "0.7", :cy "672.9", :cx "767.5"}]
      [:circle {:id "circle4137", :fill "#E64852", :r "0.7", :cy "653.9", :cx "752.6"}]
      [:circle {:id "circle4139", :fill "#E64852", :r "0.7", :cy "693.4", :cx "758.8"}]
      [:circle {:id "circle4141", :fill "#E64852", :r "1", :cy "645.3", :cx "800.5"}]
      [:circle {:id "circle4143", :fill "#E64852", :r "1.4", :cy "673.6", :cx "785.1"}]
      [:circle {:id "circle4145", :fill "#FFFFFF", :r "1.4", :cy "723.8", :cx "753.9"}]
      [:circle {:id "circle4147", :fill "#FFFFFF", :r "1.4", :cy "702.9", :cx "836.2"}]]]
    [:g {:id "g4207"}
     [:linearGradient {:gradientUnits "userSpaceOnUse", :gradientTransform "matrix(-0.3592 -0.3065 -1.2019 0.6834 2623.3687 1550.1232)", :y2 "569.8058", :y1 "516.1934", :x2 "3638.5767", :x1 "3629.489", :id "SVGID_95_"}
      [:stop {:id "stop4153", :style "stop-color:#FFB3B7;stop-opacity:0", :offset "0"}]
      [:stop {:id "stop4155", :style "stop-color:#FFB3B7", :offset "1"}]]
     [:polygon {:id "polygon4158", :opacity "0.35", :enable-background "new    ", :points "639,782.7 639,860 727,804 667.3,767    ", :fill "url(#SVGID_95_)"}]
     [:linearGradient {:gradientUnits "userSpaceOnUse", :gradientTransform "matrix(-0.3592 -0.3065 -1.2019 0.6834 2623.3687 1550.1232)", :y2 "553.9148", :y1 "476.5823", :x2 "3777.7048", :x1 "3793.2498", :id "SVGID_96_"}
      [:stop {:id "stop4160", :style "stop-color:#FFB3B7;stop-opacity:0", :offset "0"}]
      [:stop {:id "stop4162", :style "stop-color:#FFB3B7", :offset "1"}]]
     [:polygon {:id "polygon4165", :opacity "0.35", :enable-background "new    ", :points "575.3,742.1 638,783 729,731.6 666.3,690            ", :fill "url(#SVGID_96_)"}]
     [:g {:id "g4205"}
      [:circle {:id "circle4167", :fill "#FF8088", :r "1.5", :cy "789.7", :cx "640.2"}]
      [:circle {:id "circle4169", :fill "#FF8088", :r "0.5", :cy "732.7", :cx "605.2"}]
      [:circle {:id "circle4171", :fill "#FFFFFF", :r "0.7", :cy "804.3", :cx "686.9"}]
      [:circle {:id "circle4173", :fill "#E64852", :r "0.7", :cy "735.4", :cx "668.5"}]
      [:circle {:id "circle4175", :fill "#FFFFFF", :r "0.7", :cy "778.7", :cx "651.2"}]
      [:circle {:id "circle4177", :fill "#FFFFFF", :r "0.7", :cy "819.4", :cx "689.6"}]
      [:circle {:id "circle4179", :fill "#FFFFFF", :r "0.7", :cy "761", :cx "683.4"}]
      [:circle {:id "circle4181", :fill "#FF8088", :r "0.7", :cy "764.5", :cx "663.4"}]
      [:circle {:id "circle4183", :fill "#FFFFFF", :r "0.7", :cy "813.5", :cx "660.1"}]
      [:circle {:id "circle4185", :fill "#FFFFFF", :r "0.7", :cy "795.9", :cx "596.1"}]
      [:circle {:id "circle4187", :fill "#FFFFFF", :r "0.7", :cy "788.7", :cx "619.2"}]
      [:circle {:id "circle4189", :fill "#E64852", :r "1.4", :cy "782.8", :cx "691"}]
      [:circle {:id "circle4191", :fill "#FFFFFF", :r "0.7", :cy "765.9", :cx "608.5"}]
      [:circle {:id "circle4193", :fill "#E64852", :r "0.7", :cy "746.9", :cx "593.6"}]
      [:circle {:id "circle4195", :fill "#E64852", :r "0.7", :cy "786.4", :cx "599.8"}]
      [:circle {:id "circle4197", :fill "#E64852", :r "1", :cy "738.3", :cx "641.5"}]
      [:circle {:id "circle4199", :fill "#E64852", :r "1.4", :cy "766.6", :cx "626.1"}]
      [:circle {:id "circle4201", :fill "#FFFFFF", :r "1.4", :cy "816.8", :cx "594.9"}]
      [:circle {:id "circle4203", :fill "#FFFFFF", :r "1.4", :cy "795.9", :cx "677.2"}]]]
    [:g {:id "g4263"}
     [:linearGradient {:gradientUnits "userSpaceOnUse", :gradientTransform "matrix(-0.3592 -0.3065 -1.2019 0.6834 2623.3687 1550.1232)", :y2 "701.6161", :y1 "648.0037", :x2 "3629.0474", :x1 "3619.9592", :id "SVGID_97_"}
      [:stop {:id "stop4209", :style "stop-color:#FFB3B7;stop-opacity:0", :offset "0"}]
      [:stop {:id "stop4211", :style "stop-color:#FFB3B7", :offset "1"}]]
     [:polygon {:id "polygon4214", :opacity "0.35", :enable-background "new    ", :points "484,875.7 484,953 572,897 512.3,860    ", :fill "url(#SVGID_97_)"}]
     [:linearGradient {:gradientUnits "userSpaceOnUse", :gradientTransform "matrix(-0.3592 -0.3065 -1.2019 0.6834 2623.3687 1550.1232)", :y2 "685.7256", :y1 "608.3932", :x2 "3768.1753", :x1 "3783.7202", :id "SVGID_98_"}
      [:stop {:id "stop4216", :style "stop-color:#FFB3B7;stop-opacity:0", :offset "0"}]
      [:stop {:id "stop4218", :style "stop-color:#FFB3B7", :offset "1"}]]
     [:polygon {:id "polygon4221", :opacity "0.35", :enable-background "new    ", :points "420.3,835.1 483,876 574,824.6 511.3,783            ", :fill "url(#SVGID_98_)"}]
     [:g {:id "g4261"}
      [:circle {:id "circle4223", :fill "#FF8088", :r "1.5", :cy "882.7", :cx "485.2"}]
      [:circle {:id "circle4225", :fill "#FF8088", :r "0.5", :cy "825.7", :cx "450.2"}]
      [:circle {:id "circle4227", :fill "#FFFFFF", :r "0.7", :cy "897.3", :cx "531.9"}]
      [:circle {:id "circle4229", :fill "#E64852", :r "0.7", :cy "828.4", :cx "513.5"}]
      [:circle {:id "circle4231", :fill "#FFFFFF", :r "0.7", :cy "871.7", :cx "496.2"}]
      [:circle {:id "circle4233", :fill "#FFFFFF", :r "0.7", :cy "912.4", :cx "534.6"}]
      [:circle {:id "circle4235", :fill "#FFFFFF", :r "0.7", :cy "854", :cx "528.4"}]
      [:circle {:id "circle4237", :fill "#FF8088", :r "0.7", :cy "857.5", :cx "508.4"}]
      [:circle {:id "circle4239", :fill "#FFFFFF", :r "0.7", :cy "906.5", :cx "505.1"}]
      [:circle {:id "circle4241", :fill "#FFFFFF", :r "0.7", :cy "888.9", :cx "441.1"}]
      [:circle {:id "circle4243", :fill "#FFFFFF", :r "0.7", :cy "881.7", :cx "464.2"}]
      [:circle {:id "circle4245", :fill "#E64852", :r "1.4", :cy "875.8", :cx "536"}]
      [:circle {:id "circle4247", :fill "#FFFFFF", :r "0.7", :cy "858.9", :cx "453.5"}]
      [:circle {:id "circle4249", :fill "#E64852", :r "0.7", :cy "839.9", :cx "438.6"}]
      [:circle {:id "circle4251", :fill "#E64852", :r "0.7", :cy "879.4", :cx "444.8"}]
      [:circle {:id "circle4253", :fill "#E64852", :r "1", :cy "831.3", :cx "486.5"}]
      [:circle {:id "circle4255", :fill "#E64852", :r "1.4", :cy "859.6", :cx "471.1"}]
      [:circle {:id "circle4257", :fill "#FFFFFF", :r "1.4", :cy "909.8", :cx "439.9"}]
      [:circle {:id "circle4259", :fill "#FFFFFF", :r "1.4", :cy "888.9", :cx "522.2"}]]]]
   [:g {:id "g4303"}
    [:g {:id "g4299", :opacity "0.25"}
     [:linearGradient {:gradientUnits "userSpaceOnUse", :gradientTransform "matrix(1 0 0 1 0 700)", :y2 "-438.5989", :y1 "-405.4163", :x2 "1522.7059", :x1 "1460.7068", :id "SVGID_46_"}
      [:stop {:id "stop4266", :style "stop-color:#494949", :offset "0"}]
      [:stop {:id "stop4268", :style "stop-color:#525252", :offset "0.4259"}]
      [:stop {:id "stop4270", :style "stop-color:#656565", :offset "1"}]]
     [:polygon {:id "polygon4273", :points "1462,219.7 1462,297 1524,334.9 1524,261.8     ", :fill "url(#SVGID_46_)"}]
     [:linearGradient {:gradientUnits "userSpaceOnUse", :gradientTransform "matrix(1 0 0 1 0 700)", :y2 "-396.1", :y1 "-447.2", :x2 "1584.1", :x1 "1533", :id "SVGID_47_"}
      [:stop {:id "stop4275", :style "stop-color:#B8B8B8", :offset "0"}]
      [:stop {:id "stop4277", :style "stop-color:#B0B0B0", :offset "5.310000e-02"}]
      [:stop {:id "stop4279", :style "stop-color:#8B8B8B", :offset "0.3337"}]
      [:stop {:id "stop4281", :style "stop-color:#707070", :offset "0.5939"}]
      [:stop {:id "stop4283", :style "stop-color:#5F5F5F", :offset "0.8241"}]
      [:stop {:id "stop4285", :style "stop-color:#5A5A5A", :offset "1"}]]
     [:polygon {:id "polygon4288", :points "1524,261.8 1524,334.9 1591,297 1591,219.7     ", :fill "url(#SVGID_47_)"}]
     [:linearGradient {:gradientUnits "userSpaceOnUse", :gradientTransform "matrix(1 0 0 1 0 700)", :y2 "-514.2369", :y1 "-450.4547", :x2 "1547.9783", :x1 "1507.2352", :id "SVGID_48_"}
      [:stop {:id "stop4290", :style "stop-color:#787878", :offset "0"}]
      [:stop {:id "stop4292", :style "stop-color:#636363", :offset "0.5984"}]
      [:stop {:id "stop4294", :style "stop-color:#5A5A5A", :offset "1"}]]
     [:polygon {:id "polygon4297", :points "1461.7,219.7 1523.6,261.8 1590.9,219.7 1528.1,179.2     ", :fill "url(#SVGID_48_)"}]]
    [:path {:id "path4301", :d "M1513,186.3l-0.8-1.3l2.3-1.4l0.8,1.3L1513,186.3z M1519.3,182.5l-0.8-1.3l-2.3,1.4l0.8,1.3L1519.3,182.5   z M1523.4,180l-0.8-1.3l-2.3,1.4l0.8,1.3L1523.4,180z M1503.1,192.3l-0.8-1.3l-2.3,1.4l0.8,1.3L1503.1,192.3z M1507.2,189.8   l-0.8-1.3l-2.3,1.4l0.8,1.3L1507.2,189.8z M1511.2,187.4l-0.8-1.3l-2.3,1.4l0.8,1.3L1511.2,187.4z M1490.9,199.7l-0.8-1.3   l-2.3,1.4l0.8,1.3L1490.9,199.7z M1495,197.2l-0.8-1.3l-2.3,1.4l0.8,1.3L1495,197.2z M1499,194.8l-0.8-1.3l-2.3,1.4l0.8,1.3   L1499,194.8z M1478.8,207.1l-0.8-1.3l-2.3,1.4l0.8,1.3L1478.8,207.1z M1482.8,204.6l-0.8-1.3l-2.3,1.4l0.8,1.3L1482.8,204.6z     M1486.9,202.1l-0.8-1.3l-2.3,1.4l0.8,1.3L1486.9,202.1z M1466.6,214.4l-0.8-1.3l-2.3,1.4l0.8,1.3L1466.6,214.4z M1470.7,212   l-0.8-1.3l-2.3,1.4l0.8,1.3L1470.7,212z M1474.7,209.5l-0.8-1.3l-2.3,1.4l0.8,1.3L1474.7,209.5z M1461,233h-2v3h2V233z M1461,229   h-2v2h2V229z M1461,224h-2v2h2V224z M1461,248h-2v2h2V248z M1461,243h-2v3h2V243z M1461,238h-2v2h2V238z M1461,262h-2v2h2V262z     M1461,257h-2v3h2V257z M1461,253h-2v2h2V253z M1461,276h-2v3h2V276z M1461,271h-2v3h2V271z M1461,266h-2v3h2V266z M1461,290h-2   v3h2V290z M1461,286h-2v2h2V286z M1461,281h-2v3h2V281z M1471.8,305.6l-0.8,1.3l2.1,1.3l0.8-1.3L1471.8,305.6z M1468,303.3   l-0.8,1.3l2.1,1.3l0.8-1.3L1468,303.3z M1464.3,300.9l-0.8,1.3l2.1,1.3l0.8-1.3L1464.3,300.9z M1483.2,312.6l-0.8,1.3l2.1,1.3   l0.8-1.3L1483.2,312.6z M1479.4,310.3l-0.8,1.3l2.1,1.3l0.8-1.3L1479.4,310.3z M1475.6,308l-0.8,1.3l2.1,1.3l0.8-1.3L1475.6,308z     M1494.5,319.7l-0.8,1.3l2.1,1.3l0.8-1.3L1494.5,319.7z M1490.8,317.3l-0.8,1.3l2.1,1.3l0.8-1.3L1490.8,317.3z M1487,315   l-0.8,1.3l2.1,1.3l0.8-1.3L1487,315z M1505.9,326.7l-0.8,1.3l2.1,1.3l0.8-1.3L1505.9,326.7z M1502.1,324.4l-0.8,1.3l2.1,1.3   l0.8-1.3L1502.1,324.4z M1498.4,322l-0.8,1.3l2.1,1.3l0.8-1.3L1498.4,322z M1517.3,333.7l-0.8,1.3l2.1,1.3l0.8-1.3L1517.3,333.7z     M1513.5,331.4l-0.8,1.3l2.1,1.3l0.8-1.3L1513.5,331.4z M1509.7,329.1l-0.8,1.3l2.1,1.3l0.8-1.3L1509.7,329.1z M1536.8,330.5   l0.8,1.4l2.3-1.3l-0.8-1.4L1536.8,330.5z M1532.7,332.8l0.8,1.4l2.3-1.3l-0.8-1.4L1532.7,332.8z M1528.6,335.2l0.8,1.4l2.3-1.3   l-0.8-1.4L1528.6,335.2z M1549.1,323.4l0.8,1.4l2.3-1.3l-0.8-1.4L1549.1,323.4z M1545,325.7l0.8,1.4l2.3-1.3l-0.8-1.4L1545,325.7   z M1540.9,328.1l0.8,1.4l2.3-1.3l-0.8-1.4L1540.9,328.1z M1561.5,316.3l0.8,1.4l2.3-1.3l-0.8-1.4L1561.5,316.3z M1557.4,318.7   l0.8,1.4l2.3-1.3l-0.8-1.4L1557.4,318.7z M1553.3,321l0.8,1.4l2.3-1.3l-0.8-1.4L1553.3,321z M1573.8,309.2l0.8,1.4l2.3-1.3   l-0.8-1.4L1573.8,309.2z M1569.7,311.6l0.8,1.4l2.3-1.3l-0.8-1.4L1569.7,311.6z M1565.6,313.9l0.8,1.4l2.3-1.3l-0.8-1.4   L1565.6,313.9z M1586.2,302.2l0.8,1.4l2.3-1.3l-0.8-1.4L1586.2,302.2z M1582.1,304.5l0.8,1.4l2.3-1.3l-0.8-1.4L1582.1,304.5z     M1578,306.9l0.8,1.4l2.3-1.3l-0.8-1.4L1578,306.9z M1593,283.5h1.6v-2.6h-1.6V283.5z M1593,288.3h1.6v-2.6h-1.6V288.3z     M1593,293h1.6v-2.6h-1.6V293z M1593,269.4h1.6v-2.6h-1.6V269.4z M1593,274.1h1.6v-2.6h-1.6V274.1z M1593,278.8h1.6v-2.6h-1.6   V278.8z M1593,255.2h1.6v-2.6h-1.6V255.2z M1593,259.9h1.6v-2.6h-1.6V259.9z M1593,264.6h1.6V262h-1.6V264.6z M1592.9,241.1h1.6   v-2.6h-1.6V241.1z M1592.9,245.8h1.6v-2.6h-1.6V245.8z M1593,250.5h1.6v-2.6h-1.6V250.5z M1592.9,226.9h1.6v-2.6h-1.6V226.9z     M1592.9,231.6h1.6V229h-1.6V231.6z M1592.9,236.3h1.6v-2.6h-1.6V236.3z M1581.1,211.6l0.9-1.3l-2.1-1.4l-0.9,1.3L1581.1,211.6z     M1584.9,214.1l0.9-1.3l-2.1-1.4l-0.9,1.3L1584.9,214.1z M1588.7,216.6l0.9-1.3l-2.1-1.4l-0.9,1.3L1588.7,216.6z M1569.6,204.1   l0.9-1.3l-2.1-1.4l-0.9,1.3L1569.6,204.1z M1573.4,206.6l0.9-1.3l-2.1-1.4l-0.9,1.3L1573.4,206.6z M1577.2,209.1l0.9-1.3   l-2.1-1.4l-0.9,1.3L1577.2,209.1z M1558.1,196.6l0.9-1.3l-2.1-1.4l-0.9,1.3L1558.1,196.6z M1561.9,199.1l0.9-1.3l-2.1-1.4   l-0.9,1.3L1561.9,199.1z M1565.7,201.6l0.9-1.3l-2.1-1.4l-0.9,1.3L1565.7,201.6z M1546.5,189.1l0.9-1.3l-2.1-1.4l-0.9,1.3   L1546.5,189.1z M1550.4,191.6l0.9-1.3l-2.1-1.4l-0.9,1.3L1550.4,191.6z M1554.2,194l0.9-1.3l-2.1-1.4l-0.9,1.3L1554.2,194z     M1535,181.5l0.9-1.3l-2.1-1.4l-0.9,1.3L1535,181.5z M1538.8,184l0.9-1.3l-2.1-1.4l-0.9,1.3L1538.8,184z M1542.7,186.5l0.9-1.3   l-2.1-1.4l-0.9,1.3L1542.7,186.5z M1461.1,216.4l0.8,1.3l1.3-0.8l-0.8-1.3L1461.1,216.4z M1459,217.8c0,0,0,0.1,0,0.2   c0,0.1,0,0.3,0,0.5c0,0.4,0,1.5,0,1.5h2c0,0,0-0.9,0-1.1c0-0.1,0-0.1,0-0.2l0,0l0,0l0,0h-0.3h-0.2h-0.1l0.4-0.3l-0.9-1.3   l-1.1,0.8C1458.9,217.7,1459,217.8,1459,217.8z M1458.9,221.9h1.6v-1.5h-1.6V221.9z M1458.7,296.3h1.6v-1.5h-1.6V296.3z     M1458.9,298l0.1,0.5c0.1,0.1,0.3,0.5,0.4,0.6c0.3,0.2,0.6,0.5,0.6,0.5l0.8-1.3c0,0-0.1-0.1-0.2-0.1s-0.1-0.1-0.2-0.1V298v-0.4   v-0.5l0,0c0,0,0,0-0.1,0h0.1l0,0h-1.4v1C1459,298,1458.8,298,1458.9,298z M1462.3,301l0.8-1.3l-1.2-0.8l-0.8,1.3L1462.3,301z     M1521.4,337.7l0.8-1.3l-1.3-0.8l-0.8,1.3L1521.4,337.7z M1523.9,339.1c0,0,0.1-0.1,0.2-0.1c0.1-0.1,0.3-0.2,0.5-0.3   c0.3-0.2,0.7-0.4,0.7-0.4l-0.8-1.4c0,0-0.1,0.1-0.3,0.2c-0.1,0-0.1,0.1-0.2,0.1l0,0l0,0l0,0l0,0l0,0l0,0l-0.5-0.3l-0.8,1.3   L1523.9,339.1C1523.8,339.2,1523.8,339.2,1523.9,339.1z M1527.6,337l-0.8-1.4l-1.3,0.8l0.8,1.4L1527.6,337z M1591.8,300.3   l-0.8-1.4l-1.3,0.8l0.8,1.4L1591.8,300.3z M1594,298.9c0,0,0-0.1,0-0.2s0-0.3,0-0.5c0-0.4-0.2-0.8-0.2-0.8h-1.8c0,0,0,0.1,0,0.3   c0,0.1,0,0.1,0,0.2l0,0l0,0l0,0h0.3h0.2h0.1l-0.5,0.3l0.9,1.4l1.1-0.8C1594.1,299,1594,298.9,1594,298.9z M1594.1,294.7h-1.6v1.5   h1.6V294.7z M1594.1,221.2h-1.6v1.4h1.6V221.2z M1594,219l-0.1-0.2c-0.1-0.1-0.3-0.2-0.4-0.3c-0.3-0.2-0.6-0.4-0.6-0.4l-0.9,1.3   c0,0,0.1,0.1,0.2,0.1s0.1,0.1,0.2,0.1l0,0v0.2v0.2l0,0c0,0,0,0,0.1,0h-0.5v0.1l1.8,0.1L1594,219C1594.1,219,1594.1,219,1594,219z     M1590.8,216.6l-0.9,1.3l1.2,0.8l0.9-1.3L1590.8,216.6z M1530.8,177.3l-0.9,1.3l1.4,0.9l0.9-1.3L1530.8,177.3z M1528.2,175.8   c0,0-0.1,0.1-0.2,0.1c-0.1,0.1-0.3,0.2-0.5,0.3c-0.3,0.2-0.7,0.4-0.7,0.4l0.8,1.3c0,0,0.1-0.1,0.3-0.2c0.1,0,0.1-0.1,0.2-0.1l0,0   l0,0l0,0l0,0l0,0l0,0l0.5,0.4l0.9-1.3L1528.2,175.8C1528.3,175.7,1528.3,175.7,1528.2,175.8z M1524.4,178.1l0.8,1.3l1.4-0.8   l-0.8-1.3L1524.4,178.1z", :fill "#B3B3B3"}]]
   [:g {:id "firstBlock"}
    [:linearGradient {:gradientUnits "userSpaceOnUse", :gradientTransform "matrix(1 0 0 1 0 700)", :y2 "-344.4973", :y1 "-311.3163", :x2 "1361.6029", :x1 "1299.6068", :id "SVGID_49_"}
     [:stop {:id "stop4305", :style "stop-color:#A91B37", :offset "0"}]
     [:stop {:id "stop4307", :style "stop-color:#B21F37", :offset "0.2857"}]
     [:stop {:id "stop4309", :style "stop-color:#CA2B38", :offset "0.75"}]
     [:stop {:id "stop4311", :style "stop-color:#DA3239", :offset "1"}]]
    [:polygon {:id "polygon4314", :points "1300.9,313.8 1300.9,391.1 1362.9,429 1362.9,355.9    ", :fill "url(#SVGID_49_)"}]
    [:linearGradient {:gradientUnits "userSpaceOnUse", :gradientTransform "matrix(1 0 0 1 0 700)", :y2 "-301.5", :y1 "-353.6", :x2 "1424.6", :x1 "1372.5", :id "SVGID_50_"}
     [:stop {:id "stop4316", :style "stop-color:#FF999F", :offset "0"}]
     [:stop {:id "stop4318", :style "stop-color:#F27B85", :offset "0.1701"}]
     [:stop {:id "stop4320", :style "stop-color:#E35566", :offset "0.4158"}]
     [:stop {:id "stop4322", :style "stop-color:#D73A4F", :offset "0.6441"}]
     [:stop {:id "stop4324", :style "stop-color:#D02A41", :offset "0.8458"}]
     [:stop {:id "stop4326", :style "stop-color:#CE243C", :offset "1"}]]
    [:polygon {:id "polygon4329", :points "1363,355.9 1363,429 1432,391.1 1432,313.8    ", :fill "url(#SVGID_50_)"}]
    [:linearGradient {:gradientUnits "userSpaceOnUse", :gradientTransform "matrix(1 0 0 1 0 700)", :y2 "-420.1857", :y1 "-355.8673", :x2 "1388.1415", :x1 "1347.0559", :id "SVGID_51_"}
     [:stop {:id "stop4331", :style "stop-color:#E64852", :offset "0"}]
     [:stop {:id "stop4333", :style "stop-color:#E44550", :offset "5.850000e-02"}]
     [:stop {:id "stop4335", :style "stop-color:#D42D41", :offset "0.6415"}]
     [:stop {:id "stop4337", :style "stop-color:#CE243C", :offset "1"}]]
    [:polygon {:id "polygon4340", :points "1300.9,313.8 1362.7,355.9 1431.9,313.9 1367.9,273.3    ", :fill "url(#SVGID_51_)"}]
    [:g {:id "g4348", :opacity "0.12"}
     [:polygon {:id "polygon4342", :points "1317,325 1317,382.1 1363,410.2 1363,356.1     ", :fill "#FFFFFF"}]
     [:polygon {:id "polygon4344", :points "1413,325 1413,382.1 1363,410.2 1363,356.1     ", :fill "#FFFFFF"}]
     [:polygon {:id "polygon4346", :points "1316.3,325 1362.9,356.1 1413.7,325 1366.1,295     ", :fill "#FFFFFF"}]]
    [:linearGradient {:gradientUnits "userSpaceOnUse", :gradientTransform "matrix(1 0 0 1 0 700)", :y2 "-357.25", :y1 "-371.4", :x2 "1404.4501", :x1 "1390.3", :id "SVGID_52_"}
     [:stop {:id "stop4350", :style "stop-color:#FFFFFF", :offset "0"}]
     [:stop {:id "stop4352", :style "stop-color:#FDC8BA", :offset "0.2713"}]
     [:stop {:id "stop4354", :style "stop-color:#FB9C83", :offset "0.5184"}]
     [:stop {:id "stop4356", :style "stop-color:#F97C5B", :offset "0.7299"}]
     [:stop {:id "stop4358", :style "stop-color:#F86843", :offset "0.8974"}]
     [:stop {:id "stop4360", :style "stop-color:#F8613A", :offset "1"}]]
    [:polygon {:id "polygon4363", :points "1363,355.9 1363,357.4 1431.9,315.3 1431.8,314    ", :fill "url(#SVGID_52_)"}]
    [:linearGradient {:gradientUnits "userSpaceOnUse", :gradientTransform "matrix(-1 0 0 1 5222 700)", :y2 "-359.0731", :y1 "-369.7385", :x2 "3895.3269", :x1 "3884.6614", :id "SVGID_53_"}
     [:stop {:id "stop4365", :style "stop-color:#FFFFFF", :offset "0"}]
     [:stop {:id "stop4367", :style "stop-color:#FDC8BA", :offset "0.2713"}]
     [:stop {:id "stop4369", :style "stop-color:#FB9C83", :offset "0.5184"}]
     [:stop {:id "stop4371", :style "stop-color:#F97C5B", :offset "0.7299"}]
     [:stop {:id "stop4373", :style "stop-color:#F86843", :offset "0.8974"}]
     [:stop {:id "stop4375", :style "stop-color:#F8613A", :offset "1"}]]
    [:polygon {:id "polygon4378", :points "1363,355.9 1363,357.4 1301,315.3 1301,313.8    ", :fill "url(#SVGID_53_)"}]
    [:linearGradient {:gradientUnits "userSpaceOnUse", :gradientTransform "matrix(1 0 0 1 0 700)", :y2 "-289.0999", :y1 "-325.4501", :x2 "1381.6", :x1 "1345.25", :id "SVGID_54_"}
     [:stop {:id "stop4380", :style "stop-color:#FFFFFF", :offset "0"}]
     [:stop {:id "stop4382", :style "stop-color:#FDC8BA", :offset "0.2713"}]
     [:stop {:id "stop4384", :style "stop-color:#FB9C83", :offset "0.5184"}]
     [:stop {:id "stop4386", :style "stop-color:#F97C5B", :offset "0.7299"}]
     [:stop {:id "stop4388", :style "stop-color:#F86843", :offset "0.8974"}]
     [:stop {:id "stop4390", :style "stop-color:#F8613A", :offset "1"}]]
    [:polygon {:id "polygon4393", :points "1364,356.6 1363,356.8 1363,429 1364,428.5    ", :fill "url(#SVGID_54_)"}]]
   [:g {:id "blockdis"}
    [:linearGradient {:gradientUnits "userSpaceOnUse", :gradientTransform "translate(0,700)", :y2 "217.2003", :y1 "250.7917", :x2 "414.9812", :x1 "352.21811", :id "SVGID_85_", :spreadMethod "pad"}
     [:stop {:id "stop4396", :style "stop-color:#A91B37", :offset "0"}]
     [:stop {:id "stop4398", :style "stop-color:#B21F37", :offset "0.2857"}]
     [:stop {:id "stop4400", :style "stop-color:#CA2B38", :offset "0.75"}]
     [:stop {:id "stop4402", :style "stop-color:#DA3239", :offset "1"}]]
    [:polygon {:style "fill-opacity:1.0;fill:url(#linearGradient3365)", :id "polygon4405", :points "353.4,875.7 353.4,953 416.4,990.9 416.4,917.8    ", :fill "url(#SVGID_85_)"}]
    [:linearGradient {:gradientUnits "userSpaceOnUse", :gradientTransform "matrix(1 0 0 1 0 700)", :y2 "260.15", :y1 "208.55", :x2 "476.85", :x1 "425.25", :id "SVGID_86_"}
     [:stop {:id "stop4407", :style "stop-color:#FF999F", :offset "0"}]
     [:stop {:id "stop4409", :style "stop-color:#F27B85", :offset "0.1701"}]
     [:stop {:id "stop4411", :style "stop-color:#E35566", :offset "0.4158"}]
     [:stop {:id "stop4413", :style "stop-color:#D73A4F", :offset "0.6441"}]
     [:stop {:id "stop4415", :style "stop-color:#D02A41", :offset "0.8458"}]
     [:stop {:id "stop4417", :style "stop-color:#CE243C", :offset "1"}]]
    [:polygon {:id "polygon4420", :points "416,917.8 416,990.9 484,953 484,875.7    ", :fill "url(#SVGID_86_)"}]
    [:linearGradient {:gradientUnits "userSpaceOnUse", :gradientTransform "matrix(1 0 0 1 0 700)", :y2 "141.6056", :y1 "206.1853", :x2 "440.5609", :x1 "399.3084", :id "SVGID_87_"}
     [:stop {:id "stop4422", :style "stop-color:#E64852", :offset "0"}]
     [:stop {:id "stop4424", :style "stop-color:#E44550", :offset "5.850000e-02"}]
     [:stop {:id "stop4426", :style "stop-color:#D42D41", :offset "0.6415"}]
     [:stop {:id "stop4428", :style "stop-color:#CE243C", :offset "1"}]]
    [:polygon {:id "polygon4431", :points "353.1,875.8 416,918.6 484.4,875.7 420.3,835.1    ", :fill "url(#SVGID_87_)"}]
    [:linearGradient {:gradientUnits "userSpaceOnUse", :gradientTransform "matrix(1 0 0 1 0 700)", :y2 "204.4595", :y1 "190.4596", :x2 "457.3094", :x1 "443.3097", :id "SVGID_88_"}
     [:stop {:id "stop4441", :style "stop-color:#FFFFFF", :offset "0"}]
     [:stop {:id "stop4443", :style "stop-color:#FDC8BA", :offset "0.2713"}]
     [:stop {:id "stop4445", :style "stop-color:#FB9C83", :offset "0.5184"}]
     [:stop {:id "stop4447", :style "stop-color:#F97C5B", :offset "0.7299"}]
     [:stop {:id "stop4449", :style "stop-color:#F86843", :offset "0.8974"}]
     [:stop {:id "stop4451", :style "stop-color:#F8613A", :offset "1"}]]
    [:polygon {:id "polygon4454", :points "416,917.8 416,919.2 484.7,877.1 484.7,875.8    ", :fill "url(#SVGID_88_)"}]
    [:linearGradient {:gradientUnits "userSpaceOnUse", :gradientTransform "matrix(-1 0 0 1 5222 700)", :y2 "203.0256", :y1 "191.8594", :x2 "4843.0757", :x1 "4831.9097", :id "SVGID_89_"}
     [:stop {:id "stop4456", :style "stop-color:#FFFFFF", :offset "0"}]
     [:stop {:id "stop4458", :style "stop-color:#FDC8BA", :offset "0.2713"}]
     [:stop {:id "stop4460", :style "stop-color:#FB9C83", :offset "0.5184"}]
     [:stop {:id "stop4462", :style "stop-color:#F97C5B", :offset "0.7299"}]
     [:stop {:id "stop4464", :style "stop-color:#F86843", :offset "0.8974"}]
     [:stop {:id "stop4466", :style "stop-color:#F8613A", :offset "1"}]]
    [:polygon {:id "polygon4469", :points "416,917.8 416,919.2 353,877.1 353,875.7    ", :fill "url(#SVGID_89_)"}]
    [:linearGradient {:gradientUnits "userSpaceOnUse", :gradientTransform "matrix(1 0 0 1 0 700)", :y2 "272.4615", :y1 "235.8999", :x2 "435.2615", :x1 "398.7", :id "SVGID_90_"}
     [:stop {:id "stop4471", :style "stop-color:#FFFFFF", :offset "0"}]
     [:stop {:id "stop4473", :style "stop-color:#FDC8BA", :offset "0.2713"}]
     [:stop {:id "stop4475", :style "stop-color:#FB9C83", :offset "0.5184"}]
     [:stop {:id "stop4477", :style "stop-color:#F97C5B", :offset "0.7299"}]
     [:stop {:id "stop4479", :style "stop-color:#F86843", :offset "0.8974"}]
     [:stop {:id "stop4481", :style "stop-color:#F8613A", :offset "1"}]]
    [:polygon {:id "polygon4484", :points "418,917.5 416,918.6 416,990.9 418,989.8    ", :fill "url(#SVGID_90_)"}]]
   [:g {:id "redblocks"}
    [:g {:id "g4583"}
     [:linearGradient {:gradientUnits "userSpaceOnUse", :gradientTransform "matrix(1 0 0 1 0 700)", :y2 "-344.4973", :y1 "-311.3163", :x2 "1361.6029", :x1 "1299.6068", :id "linearGradient4495"}
      [:stop {:id "stop4487", :style "stop-color:#A91B37", :offset "0"}]
      [:stop {:id "stop4489", :style "stop-color:#B21F37", :offset "0.2857"}]
      [:stop {:id "stop4491", :style "stop-color:#CA2B38", :offset "0.75"}]
      [:stop {:id "stop4493", :style "stop-color:#DA3239", :offset "1"}]]
     [:polygon {:style "fill-opacity:1.0;fill:url(#linearGradient6468)", :id "polygon4497", :points "1300.9,313.8 1300.9,391.1 1362.9,429 1362.9,355.9    ", :fill "url(#SVGID_49_)"}]
     [:linearGradient {:gradientUnits "userSpaceOnUse", :gradientTransform "matrix(1 0 0 1 0 700)", :y2 "-301.5", :y1 "-353.6", :x2 "1424.6", :x1 "1372.5", :id "linearGradient4511"}
      [:stop {:id "stop4499", :style "stop-color:#FF999F", :offset "0"}]
      [:stop {:id "stop4501", :style "stop-color:#F27B85", :offset "0.1701"}]
      [:stop {:id "stop4503", :style "stop-color:#E35566", :offset "0.4158"}]
      [:stop {:id "stop4505", :style "stop-color:#D73A4F", :offset "0.6441"}]
      [:stop {:id "stop4507", :style "stop-color:#D02A41", :offset "0.8458"}]
      [:stop {:id "stop4509", :style "stop-color:#CE243C", :offset "1"}]]
     [:polygon {:style "fill-opacity:1.0;fill:url(#linearGradient6470)", :id "polygon4513", :points "1363,355.9 1363,429 1432,391.1 1432,313.8    ", :fill "url(#SVGID_50_)"}]
     [:linearGradient {:gradientUnits "userSpaceOnUse", :gradientTransform "matrix(1 0 0 1 0 700)", :y2 "-420.1857", :y1 "-355.8673", :x2 "1388.1415", :x1 "1347.0559", :id "linearGradient4523"}
      [:stop {:id "stop4515", :style "stop-color:#E64852", :offset "0"}]
      [:stop {:id "stop4517", :style "stop-color:#E44550", :offset "5.850000e-02"}]
      [:stop {:id "stop4519", :style "stop-color:#D42D41", :offset "0.6415"}]
      [:stop {:id "stop4521", :style "stop-color:#CE243C", :offset "1"}]]
     [:polygon {:style "fill-opacity:1.0;fill:url(#linearGradient6472)", :id "polygon4525", :points "1300.9,313.8 1362.7,355.9 1431.9,313.9 1367.9,273.3    ", :fill "url(#SVGID_51_)"}]
     [:linearGradient {:gradientUnits "userSpaceOnUse", :gradientTransform "matrix(1 0 0 1 0 700)", :y2 "-357.25", :y1 "-371.4", :x2 "1404.4501", :x1 "1390.3", :id "linearGradient4547"}
      [:stop {:id "stop4535", :style "stop-color:#FFFFFF", :offset "0"}]
      [:stop {:id "stop4537", :style "stop-color:#FDC8BA", :offset "0.2713"}]
      [:stop {:id "stop4539", :style "stop-color:#FB9C83", :offset "0.5184"}]
      [:stop {:id "stop4541", :style "stop-color:#F97C5B", :offset "0.7299"}]
      [:stop {:id "stop4543", :style "stop-color:#F86843", :offset "0.8974"}]
      [:stop {:id "stop4545", :style "stop-color:#F8613A", :offset "1"}]]
     [:polygon {:style "fill-opacity:1.0;fill:url(#linearGradient6474)", :id "polygon4549", :points "1363,355.9 1363,357.4 1431.9,315.3 1431.8,314    ", :fill "url(#SVGID_52_)"}]
     [:linearGradient {:gradientUnits "userSpaceOnUse", :gradientTransform "matrix(-1 0 0 1 5222 700)", :y2 "-359.0731", :y1 "-369.7385", :x2 "3895.3269", :x1 "3884.6614", :id "linearGradient4563"}
      [:stop {:id "stop4551", :style "stop-color:#FFFFFF", :offset "0"}]
      [:stop {:id "stop4553", :style "stop-color:#FDC8BA", :offset "0.2713"}]
      [:stop {:id "stop4555", :style "stop-color:#FB9C83", :offset "0.5184"}]
      [:stop {:id "stop4557", :style "stop-color:#F97C5B", :offset "0.7299"}]
      [:stop {:id "stop4559", :style "stop-color:#F86843", :offset "0.8974"}]
      [:stop {:id "stop4561", :style "stop-color:#F8613A", :offset "1"}]]
     [:polygon {:style "fill-opacity:1.0;fill:url(#linearGradient6476)", :id "polygon4565", :points "1363,355.9 1363,357.4 1301,315.3 1301,313.8    ", :fill "url(#SVGID_53_)"}]
     [:linearGradient {:gradientUnits "userSpaceOnUse", :gradientTransform "matrix(1 0 0 1 0 700)", :y2 "-289.0999", :y1 "-325.4501", :x2 "1381.6", :x1 "1345.25", :id "linearGradient4579"}
      [:stop {:id "stop4567", :style "stop-color:#FFFFFF", :offset "0"}]
      [:stop {:id "stop4569", :style "stop-color:#FDC8BA", :offset "0.2713"}]
      [:stop {:id "stop4571", :style "stop-color:#FB9C83", :offset "0.5184"}]
      [:stop {:id "stop4573", :style "stop-color:#F97C5B", :offset "0.7299"}]
      [:stop {:id "stop4575", :style "stop-color:#F86843", :offset "0.8974"}]
      [:stop {:id "stop4577", :style "stop-color:#F8613A", :offset "1"}]]
     [:polygon {:style "fill-opacity:1.0;fill:url(#linearGradient6478)", :id "polygon4581", :points "1364,356.6 1363,356.8 1363,429 1364,428.5    ", :fill "url(#SVGID_54_)"}]]
    [:g {:id "g4675"}
     [:linearGradient {:gradientUnits "userSpaceOnUse", :gradientTransform "matrix(1 0 0 1 0 700)", :y2 "-250.4973", :y1 "-217.3163", :x2 "1203.6029", :x1 "1141.6068", :id "SVGID_55_"}
      [:stop {:id "stop4585", :style "stop-color:#A91B37", :offset "0"}]
      [:stop {:id "stop4587", :style "stop-color:#B21F37", :offset "0.2857"}]
      [:stop {:id "stop4589", :style "stop-color:#CA2B38", :offset "0.75"}]
      [:stop {:id "stop4591", :style "stop-color:#DA3239", :offset "1"}]]
     [:polygon {:style "fill-opacity:1.0;fill:url(#linearGradient6456)", :id "polygon4594", :points "1142.9,407.8 1142.9,485.1 1204.9,523 1204.9,449.9    ", :fill "url(#SVGID_55_)"}]
     [:linearGradient {:gradientUnits "userSpaceOnUse", :gradientTransform "matrix(1 0 0 1 0 700)", :y2 "-207.5", :y1 "-259.6", :x2 "1266.6", :x1 "1214.5", :id "SVGID_56_"}
      [:stop {:id "stop4596", :style "stop-color:#FF999F", :offset "0"}]
      [:stop {:id "stop4598", :style "stop-color:#F27B85", :offset "0.1701"}]
      [:stop {:id "stop4600", :style "stop-color:#E35566", :offset "0.4158"}]
      [:stop {:id "stop4602", :style "stop-color:#D73A4F", :offset "0.6441"}]
      [:stop {:id "stop4604", :style "stop-color:#D02A41", :offset "0.8458"}]
      [:stop {:id "stop4606", :style "stop-color:#CE243C", :offset "1"}]]
     [:polygon {:style "fill-opacity:1.0;fill:url(#linearGradient6458)", :id "polygon4609", :points "1205,449.9 1205,523 1274,485.1 1274,407.8    ", :fill "url(#SVGID_56_)"}]
     [:linearGradient {:gradientUnits "userSpaceOnUse", :gradientTransform "matrix(1 0 0 1 0 700)", :y2 "-326.1857", :y1 "-261.8673", :x2 "1230.1415", :x1 "1189.0559", :id "SVGID_57_"}
      [:stop {:id "stop4611", :style "stop-color:#E64852", :offset "0"}]
      [:stop {:id "stop4613", :style "stop-color:#E44550", :offset "5.850000e-02"}]
      [:stop {:id "stop4615", :style "stop-color:#D42D41", :offset "0.6415"}]
      [:stop {:id "stop4617", :style "stop-color:#CE243C", :offset "1"}]]
     [:polygon {:style "fill-opacity:1.0;fill:url(#linearGradient6460)", :id "polygon4620", :points "1142.9,407.8 1204.7,449.9 1273.9,407.9 1209.9,367.3    ", :fill "url(#SVGID_57_)"}]
     [:linearGradient {:gradientUnits "userSpaceOnUse", :gradientTransform "matrix(1 0 0 1 0 700)", :y2 "-263.25", :y1 "-277.4", :x2 "1246.4501", :x1 "1232.3", :id "SVGID_58_"}
      [:stop {:id "stop4630", :style "stop-color:#FFFFFF", :offset "0"}]
      [:stop {:id "stop4632", :style "stop-color:#FDC8BA", :offset "0.2713"}]
      [:stop {:id "stop4634", :style "stop-color:#FB9C83", :offset "0.5184"}]
      [:stop {:id "stop4636", :style "stop-color:#F97C5B", :offset "0.7299"}]
      [:stop {:id "stop4638", :style "stop-color:#F86843", :offset "0.8974"}]
      [:stop {:id "stop4640", :style "stop-color:#F8613A", :offset "1"}]]
     [:polygon {:style "fill-opacity:1.0;fill:url(#linearGradient6462)", :id "polygon4643", :points "1205,449.9 1205,451.4 1273.9,409.3 1273.8,408    ", :fill "url(#SVGID_58_)"}]
     [:linearGradient {:gradientUnits "userSpaceOnUse", :gradientTransform "matrix(-1 0 0 1 5222 700)", :y2 "-265.0729", :y1 "-275.7386", :x2 "4053.3269", :x1 "4042.6614", :id "SVGID_59_"}
      [:stop {:id "stop4645", :style "stop-color:#FFFFFF", :offset "0"}]
      [:stop {:id "stop4647", :style "stop-color:#FDC8BA", :offset "0.2713"}]
      [:stop {:id "stop4649", :style "stop-color:#FB9C83", :offset "0.5184"}]
      [:stop {:id "stop4651", :style "stop-color:#F97C5B", :offset "0.7299"}]
      [:stop {:id "stop4653", :style "stop-color:#F86843", :offset "0.8974"}]
      [:stop {:id "stop4655", :style "stop-color:#F8613A", :offset "1"}]]
     [:polygon {:style "fill-opacity:1.0;fill:url(#linearGradient6464)", :id "polygon4658", :points "1205,449.9 1205,451.4 1143,409.3 1143,407.8    ", :fill "url(#SVGID_59_)"}]
     [:linearGradient {:gradientUnits "userSpaceOnUse", :gradientTransform "matrix(1 0 0 1 0 700)", :y2 "-195.0999", :y1 "-231.4501", :x2 "1223.6", :x1 "1187.25", :id "SVGID_60_"}
      [:stop {:id "stop4660", :style "stop-color:#FFFFFF", :offset "0"}]
      [:stop {:id "stop4662", :style "stop-color:#FDC8BA", :offset "0.2713"}]
      [:stop {:id "stop4664", :style "stop-color:#FB9C83", :offset "0.5184"}]
      [:stop {:id "stop4666", :style "stop-color:#F97C5B", :offset "0.7299"}]
      [:stop {:id "stop4668", :style "stop-color:#F86843", :offset "0.8974"}]
      [:stop {:id "stop4670", :style "stop-color:#F8613A", :offset "1"}]]
     [:polygon {:style "fill-opacity:1.0;fill:url(#linearGradient6466)", :id "polygon4673", :points "1206,450.6 1205,450.8 1205,523 1206,522.5    ", :fill "url(#SVGID_60_)"}]]
    [:g {:id "g4767"}
     [:linearGradient {:spreadMethod "pad", :gradientUnits "userSpaceOnUse", :gradientTransform "translate(0,700)", :y2 "-156.4973", :y1 "-123.3163", :x2 "1042.6029", :x1 "980.60681", :id "SVGID_61_"}
      [:stop {:id "stop4677", :style "stop-color:#A91B37", :offset "0"}]
      [:stop {:id "stop4679", :style "stop-color:#B21F37", :offset "0.2857"}]
      [:stop {:id "stop4681", :style "stop-color:#CA2B38", :offset "0.75"}]
      [:stop {:id "stop4683", :style "stop-color:#DA3239", :offset "1"}]]
     [:polygon {:style "fill-opacity:1.0;fill:url(#linearGradient6444)", :id "polygon4686", :points "981.9,501.8 981.9,579.1 1043.9,617 1043.9,543.9    ", :fill "url(#SVGID_61_)"}]
     [:linearGradient {:gradientUnits "userSpaceOnUse", :gradientTransform "matrix(1 0 0 1 0 700)", :y2 "-113.5", :y1 "-165.6", :x2 "1105.6", :x1 "1053.5", :id "SVGID_62_"}
      [:stop {:id "stop4688", :style "stop-color:#FF999F", :offset "0"}]
      [:stop {:id "stop4690", :style "stop-color:#F27B85", :offset "0.1701"}]
      [:stop {:id "stop4692", :style "stop-color:#E35566", :offset "0.4158"}]
      [:stop {:id "stop4694", :style "stop-color:#D73A4F", :offset "0.6441"}]
      [:stop {:id "stop4696", :style "stop-color:#D02A41", :offset "0.8458"}]
      [:stop {:id "stop4698", :style "stop-color:#CE243C", :offset "1"}]]
     [:polygon {:style "fill-opacity:1.0;fill:url(#linearGradient6446)", :id "polygon4701", :points "1044,543.9 1044,617 1113,579.1 1113,501.8    ", :fill "url(#SVGID_62_)"}]
     [:linearGradient {:gradientUnits "userSpaceOnUse", :gradientTransform "matrix(1 0 0 1 0 700)", :y2 "-232.1857", :y1 "-167.8673", :x2 "1069.1415", :x1 "1028.0559", :id "SVGID_63_"}
      [:stop {:id "stop4703", :style "stop-color:#E64852", :offset "0"}]
      [:stop {:id "stop4705", :style "stop-color:#E44550", :offset "5.850000e-02"}]
      [:stop {:id "stop4707", :style "stop-color:#D42D41", :offset "0.6415"}]
      [:stop {:id "stop4709", :style "stop-color:#CE243C", :offset "1"}]]
     [:polygon {:style "fill-opacity:1.0;fill:url(#linearGradient6448)", :id "polygon4712", :points "981.9,501.8 1043.7,543.9 1112.9,501.9 1048.9,461.3    ", :fill "url(#SVGID_63_)"}]
     [:linearGradient {:gradientUnits "userSpaceOnUse", :gradientTransform "matrix(1 0 0 1 0 700)", :y2 "-169.25", :y1 "-183.4", :x2 "1085.45", :x1 "1071.3", :id "SVGID_64_"}
      [:stop {:id "stop4722", :style "stop-color:#FFFFFF", :offset "0"}]
      [:stop {:id "stop4724", :style "stop-color:#FDC8BA", :offset "0.2713"}]
      [:stop {:id "stop4726", :style "stop-color:#FB9C83", :offset "0.5184"}]
      [:stop {:id "stop4728", :style "stop-color:#F97C5B", :offset "0.7299"}]
      [:stop {:id "stop4730", :style "stop-color:#F86843", :offset "0.8974"}]
      [:stop {:id "stop4732", :style "stop-color:#F8613A", :offset "1"}]]
     [:polygon {:style "fill-opacity:1.0;fill:url(#linearGradient6450)", :id "polygon4735", :points "1044,543.9 1044,545.4 1112.9,503.3 1112.8,502    ", :fill "url(#SVGID_64_)"}]
     [:linearGradient {:gradientUnits "userSpaceOnUse", :gradientTransform "matrix(-1 0 0 1 5222 700)", :y2 "-171.0729", :y1 "-181.7386", :x2 "4214.3271", :x1 "4203.6616", :id "SVGID_65_"}
      [:stop {:id "stop4737", :style "stop-color:#FFFFFF", :offset "0"}]
      [:stop {:id "stop4739", :style "stop-color:#FDC8BA", :offset "0.2713"}]
      [:stop {:id "stop4741", :style "stop-color:#FB9C83", :offset "0.5184"}]
      [:stop {:id "stop4743", :style "stop-color:#F97C5B", :offset "0.7299"}]
      [:stop {:id "stop4745", :style "stop-color:#F86843", :offset "0.8974"}]
      [:stop {:id "stop4747", :style "stop-color:#F8613A", :offset "1"}]]
     [:polygon {:style "fill-opacity:1.0;fill:url(#linearGradient6452)", :id "polygon4750", :points "1044,543.9 1044,545.4 982,503.3 982,501.8    ", :fill "url(#SVGID_65_)"}]
     [:linearGradient {:gradientUnits "userSpaceOnUse", :gradientTransform "matrix(1 0 0 1 0 700)", :y2 "-101.0999", :y1 "-137.4501", :x2 "1062.6", :x1 "1026.25", :id "SVGID_66_"}
      [:stop {:id "stop4752", :style "stop-color:#FFFFFF", :offset "0"}]
      [:stop {:id "stop4754", :style "stop-color:#FDC8BA", :offset "0.2713"}]
      [:stop {:id "stop4756", :style "stop-color:#FB9C83", :offset "0.5184"}]
      [:stop {:id "stop4758", :style "stop-color:#F97C5B", :offset "0.7299"}]
      [:stop {:id "stop4760", :style "stop-color:#F86843", :offset "0.8974"}]
      [:stop {:id "stop4762", :style "stop-color:#F8613A", :offset "1"}]]
     [:polygon {:style "fill-opacity:1.0;fill:url(#linearGradient6454)", :id "polygon4765", :points "1045,544.6 1044,544.8 1044,617 1045,616.5    ", :fill "url(#SVGID_66_)"}]]
    [:g {:id "g4859"}
     [:linearGradient {:gradientUnits "userSpaceOnUse", :gradientTransform "matrix(1 0 0 1 0 700)", :y2 "-62.4973", :y1 "-29.3163", :x2 "884.603", :x1 "822.6068", :id "SVGID_67_"}
      [:stop {:id "stop4769", :style "stop-color:#A91B37", :offset "0"}]
      [:stop {:id "stop4771", :style "stop-color:#B21F37", :offset "0.2857"}]
      [:stop {:id "stop4773", :style "stop-color:#CA2B38", :offset "0.75"}]
      [:stop {:id "stop4775", :style "stop-color:#DA3239", :offset "1"}]]
     [:polygon {:id "polygon4778", :points "823.9,595.8 823.9,673.1 885.9,711 885.9,637.9    ", :fill "url(#SVGID_67_)", :style "fill-opacity:1.0;fill:url(#linearGradient3397)"}]
     [:linearGradient {:gradientUnits "userSpaceOnUse", :gradientTransform "matrix(1 0 0 1 0 700)", :y2 "-19.5", :y1 "-71.6", :x2 "947.6", :x1 "895.5", :id "SVGID_68_"}
      [:stop {:id "stop4780", :style "stop-color:#FF999F", :offset "0"}]
      [:stop {:id "stop4782", :style "stop-color:#F27B85", :offset "0.1701"}]
      [:stop {:id "stop4784", :style "stop-color:#E35566", :offset "0.4158"}]
      [:stop {:id "stop4786", :style "stop-color:#D73A4F", :offset "0.6441"}]
      [:stop {:id "stop4788", :style "stop-color:#D02A41", :offset "0.8458"}]
      [:stop {:id "stop4790", :style "stop-color:#CE243C", :offset "1"}]]
     [:polygon {:id "polygon4793", :points "886,637.9 886,711 955,673.1 955,595.8    ", :fill "url(#SVGID_68_)", :style "fill-opacity:1.0;fill:url(#linearGradient3399)"}]
     [:linearGradient {:gradientUnits "userSpaceOnUse", :gradientTransform "matrix(1 0 0 1 0 700)", :y2 "-138.1857", :y1 "-73.8674", :x2 "911.1414", :x1 "870.056", :id "SVGID_69_"}
      [:stop {:id "stop4795", :style "stop-color:#E64852", :offset "0"}]
      [:stop {:id "stop4797", :style "stop-color:#E44550", :offset "5.850000e-02"}]
      [:stop {:id "stop4799", :style "stop-color:#D42D41", :offset "0.6415"}]
      [:stop {:id "stop4801", :style "stop-color:#CE243C", :offset "1"}]]
     [:polygon {:id "polygon4804", :points "823.9,595.8 885.7,637.9 954.9,595.9 890.9,555.3    ", :fill "url(#SVGID_69_)", :style "fill-opacity:1.0;fill:url(#linearGradient3401)"}]
     [:linearGradient {:gradientUnits "userSpaceOnUse", :gradientTransform "matrix(1 0 0 1 0 700)", :y2 "-75.2501", :y1 "-89.3999", :x2 "927.4498", :x1 "913.3002", :id "SVGID_70_"}
      [:stop {:id "stop4814", :style "stop-color:#FFFFFF", :offset "0"}]
      [:stop {:id "stop4816", :style "stop-color:#FDC8BA", :offset "0.2713"}]
      [:stop {:id "stop4818", :style "stop-color:#FB9C83", :offset "0.5184"}]
      [:stop {:id "stop4820", :style "stop-color:#F97C5B", :offset "0.7299"}]
      [:stop {:id "stop4822", :style "stop-color:#F86843", :offset "0.8974"}]
      [:stop {:id "stop4824", :style "stop-color:#F8613A", :offset "1"}]]
     [:polygon {:id "polygon4827", :points "886,637.9 886,639.4 954.9,597.3 954.8,596    ", :fill "url(#SVGID_70_)", :style "fill-opacity:1.0;fill:url(#linearGradient3403)"}]
     [:linearGradient {:gradientUnits "userSpaceOnUse", :gradientTransform "matrix(-1,0,0,1,5222,700)", :y2 "-77.072899", :y1 "-87.738602", :x2 "4372.3271", :x1 "4361.6616", :id "SVGID_71_", :spreadMethod "pad"}
      [:stop {:id "stop4829", :style "stop-color:#FFFFFF", :offset "0"}]
      [:stop {:id "stop4831", :style "stop-color:#FDC8BA", :offset "0.2713"}]
      [:stop {:id "stop4833", :style "stop-color:#FB9C83", :offset "0.5184"}]
      [:stop {:id "stop4835", :style "stop-color:#F97C5B", :offset "0.7299"}]
      [:stop {:id "stop4837", :style "stop-color:#F86843", :offset "0.8974"}]
      [:stop {:id "stop4839", :style "stop-color:#F8613A", :offset "1"}]]
     [:polygon {:id "polygon4842", :points "886,637.9 886,639.4 824,597.3 824,595.8    ", :fill "url(#SVGID_71_)", :style "fill-opacity:1.0;fill:url(#linearGradient3405)"}]
     [:linearGradient {:gradientUnits "userSpaceOnUse", :gradientTransform "translate(0,700)", :y2 "-7.0998998", :y1 "-43.4501", :x2 "904.59998", :x1 "868.25", :id "SVGID_72_", :spreadMethod "pad"}
      [:stop {:id "stop4844", :style "stop-color:#FFFFFF", :offset "0"}]
      [:stop {:id "stop4846", :style "stop-color:#FDC8BA", :offset "0.2713"}]
      [:stop {:id "stop4848", :style "stop-color:#FB9C83", :offset "0.5184"}]
      [:stop {:id "stop4850", :style "stop-color:#F97C5B", :offset "0.7299"}]
      [:stop {:id "stop4852", :style "stop-color:#F86843", :offset "0.8974"}]
      [:stop {:id "stop4854", :style "stop-color:#F8613A", :offset "1"}]]
     [:polygon {:id "polygon4857", :points "887,638.6 886,638.8 886,711 887,710.5    ", :fill "url(#SVGID_72_)", :style "fill-opacity:1.0;fill:url(#linearGradient3407)"}]]
    [:g {:id "g4951"}
     [:linearGradient {:gradientUnits "userSpaceOnUse", :gradientTransform "translate(0,700)", :y2 "31.302601", :y1 "64.483704", :x2 "727.50293", :x1 "665.50677", :id "SVGID_73_", :spreadMethod "pad"}
      [:stop {:id "stop4861", :style "stop-color:#A91B37", :offset "0"}]
      [:stop {:id "stop4863", :style "stop-color:#B21F37", :offset "0.2857"}]
      [:stop {:id "stop4865", :style "stop-color:#CA2B38", :offset "0.75"}]
      [:stop {:id "stop4867", :style "stop-color:#DA3239", :offset "1"}]]
     [:polygon {:id "polygon4870", :points "666.8,689.6 666.8,766.9 728.8,804.8 728.8,731.7    ", :fill "url(#SVGID_73_)", :style "fill-opacity:1.0;fill:url(#linearGradient3385)"}]
     [:linearGradient {:gradientUnits "userSpaceOnUse", :gradientTransform "matrix(1 0 0 1 0 700)", :y2 "74.3", :y1 "22.2", :x2 "790.6", :x1 "738.5", :id "SVGID_74_"}
      [:stop {:id "stop4872", :style "stop-color:#FF999F", :offset "0"}]
      [:stop {:id "stop4874", :style "stop-color:#F27B85", :offset "0.1701"}]
      [:stop {:id "stop4876", :style "stop-color:#E35566", :offset "0.4158"}]
      [:stop {:id "stop4878", :style "stop-color:#D73A4F", :offset "0.6441"}]
      [:stop {:id "stop4880", :style "stop-color:#D02A41", :offset "0.8458"}]
      [:stop {:id "stop4882", :style "stop-color:#CE243C", :offset "1"}]]
     [:polygon {:id "polygon4885", :points "729,731.7 729,804.8 798,766.9 798,689.6    ", :fill "url(#SVGID_74_)", :style "fill-opacity:1.0;fill:url(#linearGradient3387)"}]
     [:linearGradient {:gradientUnits "userSpaceOnUse", :gradientTransform "matrix(1 0 0 1 0 700)", :y2 "-44.4645", :y1 "19.8539", :x2 "753.9279", :x1 "712.8423", :id "SVGID_75_"}
      [:stop {:id "stop4887", :style "stop-color:#E64852", :offset "0"}]
      [:stop {:id "stop4889", :style "stop-color:#E44550", :offset "5.850000e-02"}]
      [:stop {:id "stop4891", :style "stop-color:#D42D41", :offset "0.6415"}]
      [:stop {:id "stop4893", :style "stop-color:#CE243C", :offset "1"}]]
     [:polygon {:id "polygon4896", :points "666.7,689.5 728.6,731.7 797.7,689.6 733.7,649    ", :fill "url(#SVGID_75_)", :style "fill-opacity:1.0;fill:url(#linearGradient3389)"}]
     [:linearGradient {:gradientUnits "userSpaceOnUse", :gradientTransform "translate(0,700)", :y2 "18.434799", :y1 "4.3348999", :x2 "770.43481", :x1 "756.33502", :id "SVGID_76_", :spreadMethod "pad"}
      [:stop {:id "stop4906", :style "stop-color:#FFFFFF", :offset "0"}]
      [:stop {:id "stop4908", :style "stop-color:#FDC8BA", :offset "0.2713"}]
      [:stop {:id "stop4910", :style "stop-color:#FB9C83", :offset "0.5184"}]
      [:stop {:id "stop4912", :style "stop-color:#F97C5B", :offset "0.7299"}]
      [:stop {:id "stop4914", :style "stop-color:#F86843", :offset "0.8974"}]
      [:stop {:id "stop4916", :style "stop-color:#F8613A", :offset "1"}]]
     [:polygon {:id "polygon4919", :points "729,731.7 729,733.1 797.9,691 797.8,689.7    ", :fill "url(#SVGID_76_)", :style "fill-opacity:1.0;fill:url(#linearGradient3393)"}]
     [:linearGradient {:gradientUnits "userSpaceOnUse", :gradientTransform "matrix(-1 0 0 1 5222 700)", :y2 "16.6755", :y1 "6.0099", :x2 "4529.3257", :x1 "4518.6602", :id "SVGID_77_"}
      [:stop {:id "stop4921", :style "stop-color:#FFFFFF", :offset "0"}]
      [:stop {:id "stop4923", :style "stop-color:#FDC8BA", :offset "0.2713"}]
      [:stop {:id "stop4925", :style "stop-color:#FB9C83", :offset "0.5184"}]
      [:stop {:id "stop4927", :style "stop-color:#F97C5B", :offset "0.7299"}]
      [:stop {:id "stop4929", :style "stop-color:#F86843", :offset "0.8974"}]
      [:stop {:id "stop4931", :style "stop-color:#F8613A", :offset "1"}]]
     [:polygon {:id "polygon4934", :points "729,731.7 729,733.1 667,691 667,689.6    ", :fill "url(#SVGID_77_)", :style "fill-opacity:1.0;fill:url(#linearGradient3395)"}]
     [:linearGradient {:gradientUnits "userSpaceOnUse", :gradientTransform "translate(0,700)", :y2 "86.650101", :y1 "50.2999", :x2 "747.54999", :x1 "711.20001", :id "SVGID_78_", :xlinkHref "#paint63_linear"}
      [:stop {:id "stop4936", :style "stop-color:#FFFFFF", :offset "0"}]
      [:stop {:id "stop4938", :style "stop-color:#FDC8BA", :offset "0.2713"}]
      [:stop {:id "stop4940", :style "stop-color:#FB9C83", :offset "0.5184"}]
      [:stop {:id "stop4942", :style "stop-color:#F97C5B", :offset "0.7299"}]
      [:stop {:id "stop4944", :style "stop-color:#F86843", :offset "0.8974"}]
      [:stop {:id "stop4946", :style "stop-color:#F8613A", :offset "1"}]]
     [:polygon {:id "polygon4949", :points "730,732.4 729,732.5 729,804.8 730,804.2    ", :fill "url(#SVGID_78_)", :style "fill-opacity:1.0;fill:url(#linearGradient3391)"}]]
    [:g {:id "g5043"}
     [:linearGradient {:gradientUnits "userSpaceOnUse", :gradientTransform "translate(0,700)", :y2 "123.5026", :y1 "156.6837", :x2 "570.30292", :x1 "508.30679", :id "SVGID_79_", :xlinkHref "#paint61_linear"}
      [:stop {:id "stop4953", :style "stop-color:#A91B37", :offset "0"}]
      [:stop {:id "stop4955", :style "stop-color:#B21F37", :offset "0.2857"}]
      [:stop {:id "stop4957", :style "stop-color:#CA2B38", :offset "0.75"}]
      [:stop {:id "stop4959", :style "stop-color:#DA3239", :offset "1"}]]
     [:polygon {:id "polygon4962", :points "509.6,781.8 509.6,859.1 571.6,897 571.6,823.9    ", :fill "url(#SVGID_79_)", :style "fill-opacity:1.0;fill:url(#linearGradient3361)"}]
     [:linearGradient {:gradientUnits "userSpaceOnUse", :gradientTransform "translate(0,700)", :y2 "166.25", :y1 "114.65", :x2 "632.84998", :x1 "581.25", :id "SVGID_80_", :spreadMethod "pad"}
      [:stop {:id "stop4964", :style "stop-color:#FF999F", :offset "0"}]
      [:stop {:id "stop4966", :style "stop-color:#F27B85", :offset "0.1701"}]
      [:stop {:id "stop4968", :style "stop-color:#E35566", :offset "0.4158"}]
      [:stop {:id "stop4970", :style "stop-color:#D73A4F", :offset "0.6441"}]
      [:stop {:id "stop4972", :style "stop-color:#D02A41", :offset "0.8458"}]
      [:stop {:id "stop4974", :style "stop-color:#CE243C", :offset "1"}]]
     [:polygon {:id "polygon4977", :points "572,823.9 572,897 640,859.1 640,781.8    ", :fill "url(#SVGID_80_)", :style "fill-opacity:1.0;fill:url(#linearGradient3363)"}]
     [:linearGradient {:gradientUnits "userSpaceOnUse", :gradientTransform "translate(0,700)", :y2 "47.813999", :y1 "112.1323", :x2 "596.84161", :x1 "555.75623", :id "SVGID_81_", :spreadMethod "pad"}
      [:stop {:id "stop4979", :style "stop-color:#E64852", :offset "0"}]
      [:stop {:id "stop4981", :style "stop-color:#E44550", :offset "5.850000e-02"}]
      [:stop {:id "stop4983", :style "stop-color:#D42D41", :offset "0.6415"}]
      [:stop {:id "stop4985", :style "stop-color:#CE243C", :offset "1"}]]
     [:polygon {:id "polygon4988", :points "509.6,781.8 571.4,823.9 640.6,781.9 576.5,741.3    ", :fill "url(#SVGID_81_)", :style "fill-opacity:1.0;opacity:1;fill:url(#linearGradient3359)"}]
     [:linearGradient {:gradientUnits "userSpaceOnUse", :gradientTransform "translate(0,700)", :y2 "110.6", :y1 "96.550003", :x2 "613.40002", :x1 "599.34998", :id "SVGID_82_", :spreadMethod "pad"}
      [:stop {:id "stop4998", :style "stop-color:#FFFFFF", :offset "0"}]
      [:stop {:id "stop5000", :style "stop-color:#FDC8BA", :offset "0.2713"}]
      [:stop {:id "stop5002", :style "stop-color:#FB9C83", :offset "0.5184"}]
      [:stop {:id "stop5004", :style "stop-color:#F97C5B", :offset "0.7299"}]
      [:stop {:id "stop5006", :style "stop-color:#F86843", :offset "0.8974"}]
      [:stop {:id "stop5008", :style "stop-color:#F8613A", :offset "1"}]]
     [:polygon {:id "polygon5011", :points "572,823.9 572,825.3 640.8,783.2 640.8,781.9    ", :fill "url(#SVGID_82_)", :style "fill-opacity:1.0;fill:url(#linearGradient3369)"}]
     [:linearGradient {:gradientUnits "userSpaceOnUse", :gradientTransform "matrix(-1,0,0,1,5222,700)", :y2 "108.8909", :y1 "98.225197", :x2 "4686.3408", :x1 "4675.6753", :id "SVGID_83_", :spreadMethod "pad"}
      [:stop {:id "stop5013", :style "stop-color:#FFFFFF", :offset "0"}]
      [:stop {:id "stop5015", :style "stop-color:#FDC8BA", :offset "0.2713"}]
      [:stop {:id "stop5017", :style "stop-color:#FB9C83", :offset "0.5184"}]
      [:stop {:id "stop5019", :style "stop-color:#F97C5B", :offset "0.7299"}]
      [:stop {:id "stop5021", :style "stop-color:#F86843", :offset "0.8974"}]
      [:stop {:id "stop5023", :style "stop-color:#F8613A", :offset "1"}]]
     [:polygon {:id "polygon5026", :points "572,823.9 572,825.3 510,783.2 510,781.8    ", :fill "url(#SVGID_83_)", :style "fill-opacity:1.0;fill:url(#linearGradient3371)"}]
     [:linearGradient {:gradientUnits "userSpaceOnUse", :gradientTransform "translate(0,700)", :y2 "179.1501", :y1 "142.2999", :x2 "591.34998", :x1 "554.5", :id "SVGID_84_", :xlinkHref "#paint64_linear"}
      [:stop {:id "stop5028", :style "stop-color:#FFFFFF", :offset "0"}]
      [:stop {:id "stop5030", :style "stop-color:#FDC8BA", :offset "0.2713"}]
      [:stop {:id "stop5032", :style "stop-color:#FB9C83", :offset "0.5184"}]
      [:stop {:id "stop5034", :style "stop-color:#F97C5B", :offset "0.7299"}]
      [:stop {:id "stop5036", :style "stop-color:#F86843", :offset "0.8974"}]
      [:stop {:id "stop5038", :style "stop-color:#F8613A", :offset "1"}]]
     [:polygon {:id "polygon5041", :points "574,824.6 572,824.8 572,897 574,896.5    ", :fill "url(#SVGID_84_)", :style "fill-opacity:1.0;fill:url(#linearGradient3367)"}]]
    [:g {:id "g5141"}
     [:linearGradient {:gradientUnits "userSpaceOnUse", :gradientTransform "matrix(1 0 0 1 0 700)", :y2 "217.2003", :y1 "250.7917", :x2 "414.9812", :x1 "352.2181", :id "linearGradient5053"}
      [:stop {:id "stop5045", :style "stop-color:#A91B37", :offset "0"}]
      [:stop {:id "stop5047", :style "stop-color:#B21F37", :offset "0.2857"}]
      [:stop {:id "stop5049", :style "stop-color:#CA2B38", :offset "0.75"}]
      [:stop {:id "stop5051", :style "stop-color:#DA3239", :offset "1"}]]
     [:polygon {:id "polygon5055", :fill "url(#paint61_linear)", :d "M169.27 366.562V399.065L195.34 415.002V384.264L169.27 366.562Z", :style "fill-opacity:1;fill:url(#linearGradient4104)"}]
     [:linearGradient {:gradientUnits "userSpaceOnUse", :gradientTransform "matrix(1 0 0 1 0 700)", :y2 "260.15", :y1 "208.55", :x2 "476.85", :x1 "425.25", :id "linearGradient5069"}
      [:stop {:id "stop5057", :style "stop-color:#FF999F", :offset "0"}]
      [:stop {:id "stop5059", :style "stop-color:#F27B85", :offset "0.1701"}]
      [:stop {:id "stop5061", :style "stop-color:#E35566", :offset "0.4158"}]
      [:stop {:id "stop5063", :style "stop-color:#D73A4F", :offset "0.6441"}]
      [:stop {:id "stop5065", :style "stop-color:#D02A41", :offset "0.8458"}]
      [:stop {:id "stop5067", :style "stop-color:#CE243C", :offset "1"}]]
     [:polygon {:id "polygon5071", :points "416,917.8 416,990.9 484,953 484,875.7    ", :fill "url(#SVGID_86_)", :style "fill-opacity:1;fill:url(#linearGradient4106)"}]
     [:linearGradient {:gradientUnits "userSpaceOnUse", :gradientTransform "matrix(1 0 0 1 0 700)", :y2 "141.6056", :y1 "206.1853", :x2 "440.5609", :x1 "399.3084", :id "linearGradient5081"}
      [:stop {:id "stop5073", :style "stop-color:#E64852", :offset "0"}]
      [:stop {:id "stop5075", :style "stop-color:#E44550", :offset "5.850000e-02"}]
      [:stop {:id "stop5077", :style "stop-color:#D42D41", :offset "0.6415"}]
      [:stop {:id "stop5079", :style "stop-color:#CE243C", :offset "1"}]]
     [:polygon {:id "polygon5083", :points "353.1,875.8 416,918.6 484.4,875.7 420.3,835.1    ", :fill "url(#SVGID_87_)", :style "fill-opacity:1;fill:url(#linearGradient4108)"}]
     [:linearGradient {:gradientUnits "userSpaceOnUse", :gradientTransform "matrix(1 0 0 1 0 700)", :y2 "204.4595", :y1 "190.4596", :x2 "457.3094", :x1 "443.3097", :id "linearGradient5105"}
      [:stop {:id "stop5093", :style "stop-color:#FFFFFF", :offset "0"}]
      [:stop {:id "stop5095", :style "stop-color:#FDC8BA", :offset "0.2713"}]
      [:stop {:id "stop5097", :style "stop-color:#FB9C83", :offset "0.5184"}]
      [:stop {:id "stop5099", :style "stop-color:#F97C5B", :offset "0.7299"}]
      [:stop {:id "stop5101", :style "stop-color:#F86843", :offset "0.8974"}]
      [:stop {:id "stop5103", :style "stop-color:#F8613A", :offset "1"}]]
     [:polygon {:id "polygon5107", :points "416,917.8 416,919.2 484.7,877.1 484.7,875.8    ", :fill "url(#SVGID_88_)", :style "fill-opacity:1;fill:url(#linearGradient4110)"}]
     [:linearGradient {:gradientUnits "userSpaceOnUse", :gradientTransform "matrix(-1 0 0 1 5222 700)", :y2 "203.0256", :y1 "191.8594", :x2 "4843.0757", :x1 "4831.9097", :id "linearGradient5121"}
      [:stop {:id "stop5109", :style "stop-color:#FFFFFF", :offset "0"}]
      [:stop {:id "stop5111", :style "stop-color:#FDC8BA", :offset "0.2713"}]
      [:stop {:id "stop5113", :style "stop-color:#FB9C83", :offset "0.5184"}]
      [:stop {:id "stop5115", :style "stop-color:#F97C5B", :offset "0.7299"}]
      [:stop {:id "stop5117", :style "stop-color:#F86843", :offset "0.8974"}]
      [:stop {:id "stop5119", :style "stop-color:#F8613A", :offset "1"}]]
     [:polygon {:id "polygon5123", :points "416,917.8 416,919.2 353,877.1 353,875.7    ", :fill "url(#SVGID_89_)", :style "fill-opacity:1;fill:url(#linearGradient4112)"}]
     [:linearGradient {:gradientUnits "userSpaceOnUse", :gradientTransform "matrix(1 0 0 1 0 700)", :y2 "272.4615", :y1 "235.8999", :x2 "435.2615", :x1 "398.7", :id "linearGradient5137"}
      [:stop {:id "stop5125", :style "stop-color:#FFFFFF", :offset "0"}]
      [:stop {:id "stop5127", :style "stop-color:#FDC8BA", :offset "0.2713"}]
      [:stop {:id "stop5129", :style "stop-color:#FB9C83", :offset "0.5184"}]
      [:stop {:id "stop5131", :style "stop-color:#F97C5B", :offset "0.7299"}]
      [:stop {:id "stop5133", :style "stop-color:#F86843", :offset "0.8974"}]
      [:stop {:id "stop5135", :style "stop-color:#F8613A", :offset "1"}]]
     [:polygon {:id "polygon5139", :points "418,917.5 416,918.6 416,990.9 418,989.8    ", :fill "url(#SVGID_90_)", :style "fill-opacity:1;fill:url(#linearGradient4114)"}]]]
   [:g {:opacity "0.7", :id "bottomgreyblocks"}
    [:g {:id "g5230"}
     [:linearGradient {:gradientTransform "matrix(1 1.170540e-04 1.170540e-04 -1 -1.549590e-02 1199.7689)", :y2 "624.5983", :x2 "1424.369", :y1 "601.6292", :x1 "1381.4531", :gradientUnits "userSpaceOnUse", :id "SVGID_99_"}
      [:stop {:id "stop5144", :style "stop-color:#262626", :offset "0"}]
      [:stop {:id "stop5146", :style "stop-color:#2F2F2F", :offset "0.2774"}]
      [:stop {:id "stop5148", :style "stop-color:#474747", :offset "0.7283"}]
      [:stop {:id "stop5150", :style "stop-color:#595959", :offset "1"}]]
     [:polygon {:id "polygon5153", :points "1382.3,546.9 1382.3,599.8 1425.4,625.8 1425.4,575.7    ", :fill "url(#SVGID_99_)"}]
     [:linearGradient {:gradientTransform "matrix(1 1.170540e-04 1.170540e-04 -1 -1.549590e-02 1199.7689)", :y2 "595.0216", :x2 "1467.5216", :y1 "630.7177", :x1 "1431.8254", :gradientUnits "userSpaceOnUse", :id "SVGID_100_"}
      [:stop {:id "stop5155", :style "stop-color:#BFBFBF", :offset "0"}]
      [:stop {:id "stop5157", :style "stop-color:#969696", :offset "0.2132"}]
      [:stop {:id "stop5159", :style "stop-color:#717171", :offset "0.4462"}]
      [:stop {:id "stop5161", :style "stop-color:#565656", :offset "0.6625"}]
      [:stop {:id "stop5163", :style "stop-color:#464646", :offset "0.8538"}]
      [:stop {:id "stop5165", :style "stop-color:#404040", :offset "1"}]]
     [:polygon {:id "polygon5168", :points "1425.4,575.7 1425.4,625.8 1472.6,599.9 1472.6,546.9    ", :fill "url(#SVGID_100_)"}]
     [:linearGradient {:gradientTransform "matrix(1 1.170540e-04 1.170540e-04 -1 -1.549590e-02 1199.7689)", :y2 "676.3935", :x2 "1442.4258", :y1 "632.294", :x1 "1414.2559", :gradientUnits "userSpaceOnUse", :id "SVGID_101_"}
      [:stop {:id "stop5170", :style "stop-color:#BFBFBF", :offset "0"}]
      [:stop {:id "stop5172", :style "stop-color:#A2A2A2", :offset "0.219"}]
      [:stop {:id "stop5174", :style "stop-color:#7B7B7B", :offset "0.5607"}]
      [:stop {:id "stop5176", :style "stop-color:#636363", :offset "0.833"}]
      [:stop {:id "stop5178", :style "stop-color:#5A5A5A", :offset "1"}]]
     [:polygon {:id "polygon5181", :points "1382.7,546.8 1425.1,575.7 1472.5,546.9 1428.6,519.1    ", :fill "url(#SVGID_101_)"}]
     [:g {:id "g5189", :opacity "0.12"}
      [:polygon {:id "polygon5183", :points "1393.3,554.5 1393.3,593.7 1425.4,612.9 1425.4,575.9     ", :fill "#FFFFFF"}]
      [:polygon {:id "polygon5185", :points "1459.1,554.5 1459.1,593.7 1425.4,612.9 1425.4,575.9     ", :fill "#FFFFFF"}]
      [:polygon {:id "polygon5187", :points "1393.2,554.5 1425.2,575.9 1460,554.5 1427.3,534     ", :fill "#FFFFFF"}]]
     [:linearGradient {:gradientTransform "matrix(1 1.170540e-04 1.170540e-04 -1 -1.549590e-02 1199.7689)", :y2 "633.4088", :x2 "1454.1476", :y1 "642.9139", :x1 "1444.6425", :gradientUnits "userSpaceOnUse", :id "SVGID_102_"}
      [:stop {:id "stop5191", :style "stop-color:#FFFFFF", :offset "0"}]
      [:stop {:id "stop5193", :style "stop-color:#D3D3D3", :offset "0.2961"}]
      [:stop {:id "stop5195", :style "stop-color:#ABABAB", :offset "0.604"}]
      [:stop {:id "stop5197", :style "stop-color:#939393", :offset "0.8495"}]
      [:stop {:id "stop5199", :style "stop-color:#8A8A8A", :offset "1"}]]
     [:polygon {:id "polygon5202", :points "1426,575.7 1426,576.7 1472.9,547.8 1473,547    ", :fill "url(#SVGID_102_)"}]
     [:linearGradient {:gradientTransform "matrix(-1 -1.170540e-04 1.170540e-04 -1 3721.9844 1200.2046)", :y2 "634.3757", :x2 "2321.3389", :y1 "641.9354", :x1 "2313.7791", :gradientUnits "userSpaceOnUse", :id "SVGID_103_"}
      [:stop {:id "stop5204", :style "stop-color:#FFFFFF", :offset "0"}]
      [:stop {:id "stop5206", :style "stop-color:#D3D3D3", :offset "0.2961"}]
      [:stop {:id "stop5208", :style "stop-color:#ABABAB", :offset "0.604"}]
      [:stop {:id "stop5210", :style "stop-color:#939393", :offset "0.8495"}]
      [:stop {:id "stop5212", :style "stop-color:#8A8A8A", :offset "1"}]]
     [:polygon {:id "polygon5215", :points "1426,575.7 1426,576.7 1383,547.8 1383,546.9    ", :fill "url(#SVGID_103_)"}]
     [:linearGradient {:gradientTransform "matrix(1 1.170540e-04 1.170540e-04 -1 -1.549590e-02 1199.7689)", :y2 "586.4769", :x2 "1438.1833", :y1 "611.4822", :x1 "1413.178", :gradientUnits "userSpaceOnUse", :id "SVGID_104_"}
      [:stop {:id "stop5217", :style "stop-color:#FFFFFF", :offset "0"}]
      [:stop {:id "stop5219", :style "stop-color:#D3D3D3", :offset "0.2961"}]
      [:stop {:id "stop5221", :style "stop-color:#ABABAB", :offset "0.604"}]
      [:stop {:id "stop5223", :style "stop-color:#939393", :offset "0.8495"}]
      [:stop {:id "stop5225", :style "stop-color:#8A8A8A", :offset "1"}]]
     [:polygon {:id "polygon5228", :points "1426.2,576.2 1425.4,576.3 1425.4,625.8 1426.2,625.5    ", :fill "url(#SVGID_104_)"}]]
    [:g {:id "g5335"}
     [:g {:id "g5318"}
      [:linearGradient {:gradientTransform "matrix(1 1.170540e-04 1.170540e-04 -1 -1.549590e-02 1199.7689)", :y2 "530.5798", :x2 "1266.38", :y1 "507.6107", :x1 "1223.4641", :gradientUnits "userSpaceOnUse", :id "SVGID_105_"}
       [:stop {:id "stop5232", :style "stop-color:#262626", :offset "0"}]
       [:stop {:id "stop5234", :style "stop-color:#2F2F2F", :offset "0.2774"}]
       [:stop {:id "stop5236", :style "stop-color:#474747", :offset "0.7283"}]
       [:stop {:id "stop5238", :style "stop-color:#595959", :offset "1"}]]
      [:polygon {:id "polygon5241", :points "1224.3,640.9 1224.3,693.8 1267.4,719.8 1267.4,669.7     ", :fill "url(#SVGID_105_)"}]
      [:linearGradient {:gradientTransform "matrix(1 1.170540e-04 1.170540e-04 -1 -1.549590e-02 1199.7689)", :y2 "501.0031", :x2 "1309.5326", :y1 "536.6992", :x1 "1273.8364", :gradientUnits "userSpaceOnUse", :id "SVGID_106_"}
       [:stop {:id "stop5243", :style "stop-color:#BFBFBF", :offset "0"}]
       [:stop {:id "stop5245", :style "stop-color:#969696", :offset "0.2132"}]
       [:stop {:id "stop5247", :style "stop-color:#717171", :offset "0.4462"}]
       [:stop {:id "stop5249", :style "stop-color:#565656", :offset "0.6625"}]
       [:stop {:id "stop5251", :style "stop-color:#464646", :offset "0.8538"}]
       [:stop {:id "stop5253", :style "stop-color:#404040", :offset "1"}]]
      [:polygon {:id "polygon5256", :points "1267.4,669.7 1267.4,719.8 1314.6,693.9 1314.6,640.9     ", :fill "url(#SVGID_106_)"}]
      [:linearGradient {:gradientTransform "matrix(1 1.170540e-04 1.170540e-04 -1 -1.549590e-02 1199.7689)", :y2 "582.375", :x2 "1284.4368", :y1 "538.2755", :x1 "1256.2668", :gradientUnits "userSpaceOnUse", :id "SVGID_107_"}
       [:stop {:id "stop5258", :style "stop-color:#BFBFBF", :offset "0"}]
       [:stop {:id "stop5260", :style "stop-color:#A2A2A2", :offset "0.219"}]
       [:stop {:id "stop5262", :style "stop-color:#7B7B7B", :offset "0.5607"}]
       [:stop {:id "stop5264", :style "stop-color:#636363", :offset "0.833"}]
       [:stop {:id "stop5266", :style "stop-color:#5A5A5A", :offset "1"}]]
      [:polygon {:id "polygon5269", :points "1224.7,640.8 1267.1,669.7 1314.5,640.9 1270.6,613.1     ", :fill "url(#SVGID_107_)"}]
      [:g {:id "g5277", :opacity "0.12"}
       [:polygon {:id "polygon5271", :points "1235.3,648.5 1235.3,687.7 1267.4,706.9 1267.4,669.9      ", :fill "#FFFFFF"}]
       [:polygon {:id "polygon5273", :points "1301.1,648.5 1301.1,687.7 1267.4,706.9 1267.4,669.9      ", :fill "#FFFFFF"}]
       [:polygon {:id "polygon5275", :points "1235.2,648.5 1267.2,669.9 1302,648.5 1269.3,628      ", :fill "#FFFFFF"}]]
      [:linearGradient {:gradientTransform "matrix(1 1.170540e-04 1.170540e-04 -1 -1.549590e-02 1199.7689)", :y2 "539.3903", :x2 "1296.1586", :y1 "548.8954", :x1 "1286.6536", :gradientUnits "userSpaceOnUse", :id "SVGID_108_"}
       [:stop {:id "stop5279", :style "stop-color:#FFFFFF", :offset "0"}]
       [:stop {:id "stop5281", :style "stop-color:#D3D3D3", :offset "0.2961"}]
       [:stop {:id "stop5283", :style "stop-color:#ABABAB", :offset "0.604"}]
       [:stop {:id "stop5285", :style "stop-color:#939393", :offset "0.8495"}]
       [:stop {:id "stop5287", :style "stop-color:#8A8A8A", :offset "1"}]]
      [:polygon {:id "polygon5290", :points "1268,669.7 1268,670.7 1314.9,641.8 1315,641     ", :fill "url(#SVGID_108_)"}]
      [:linearGradient {:gradientTransform "matrix(-1 -1.170540e-04 1.170540e-04 -1 3721.9844 1200.2046)", :y2 "540.3572", :x2 "2479.3279", :y1 "547.9169", :x1 "2471.7681", :gradientUnits "userSpaceOnUse", :id "SVGID_109_"}
       [:stop {:id "stop5292", :style "stop-color:#FFFFFF", :offset "0"}]
       [:stop {:id "stop5294", :style "stop-color:#D3D3D3", :offset "0.2961"}]
       [:stop {:id "stop5296", :style "stop-color:#ABABAB", :offset "0.604"}]
       [:stop {:id "stop5298", :style "stop-color:#939393", :offset "0.8495"}]
       [:stop {:id "stop5300", :style "stop-color:#8A8A8A", :offset "1"}]]
      [:polygon {:id "polygon5303", :points "1268,669.7 1268,670.7 1225,641.8 1225,640.9     ", :fill "url(#SVGID_109_)"}]
      [:linearGradient {:gradientTransform "matrix(1 1.170540e-04 1.170540e-04 -1 -1.549590e-02 1199.7689)", :y2 "492.4585", :x2 "1280.1943", :y1 "517.4637", :x1 "1255.189", :gradientUnits "userSpaceOnUse", :id "SVGID_110_"}
       [:stop {:id "stop5305", :style "stop-color:#FFFFFF", :offset "0"}]
       [:stop {:id "stop5307", :style "stop-color:#D3D3D3", :offset "0.2961"}]
       [:stop {:id "stop5309", :style "stop-color:#ABABAB", :offset "0.604"}]
       [:stop {:id "stop5311", :style "stop-color:#939393", :offset "0.8495"}]
       [:stop {:id "stop5313", :style "stop-color:#8A8A8A", :offset "1"}]]
      [:polygon {:id "polygon5316", :points "1268.2,670.2 1267.4,670.3 1267.4,719.8 1268.2,719.5     ", :fill "url(#SVGID_110_)"}]]
     [:line {:stroke "#B3B3B3", :fill "none", :stroke-linejoin "round", :y1 "641.1", :stroke-linecap "round", :stroke-width "3.2211", :id "line5320", :stroke-miterlimit "10", :x1 "1314.9", :y2 "586", :x2 "1406.3"}]
     [:g {:id "g5333"}
      [:image {:id "image5322", :transform "matrix(0.9804 0 0 0.9804 1304.2711 607.2417)", :xlinkHref "data:image/png;base64,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", :height "51", :width "54", :enable-background "new    ", :opacity "0.2", :overflow "visible"}]
      [:g {:id "g5331"}
       [:linearGradient {:gradientTransform "matrix(-1 0 0 1 3563.1868 1126.7981)", :y2 "-490.5486", :x2 "2239.2498", :y1 "-498.6838", :x1 "2226.3848", :gradientUnits "userSpaceOnUse", :id "SVGID_111_"}
        [:stop {:id "stop5324", :style "stop-color:#FFFFFF", :offset "0"}]
        [:stop {:id "stop5326", :style "stop-color:#FFFFFF;stop-opacity:0", :offset "0.8387"}]]
       [:polygon {:id "polygon5329", :points "1322.8,634 1325.4,638.3 1338.4,630 1335.8,625.8      ", :fill "url(#SVGID_111_)"}]]]]
    [:g {:id "g5440"}
     [:g {:id "g5423"}
      [:linearGradient {:gradientTransform "matrix(1 1.170540e-04 1.170540e-04 -1 -1.549590e-02 1199.7689)", :y2 "433.561", :x2 "1105.3914", :y1 "410.5919", :x1 "1062.4755", :gradientUnits "userSpaceOnUse", :id "SVGID_112_"}
       [:stop {:id "stop5337", :style "stop-color:#262626", :offset "0"}]
       [:stop {:id "stop5339", :style "stop-color:#2F2F2F", :offset "0.2774"}]
       [:stop {:id "stop5341", :style "stop-color:#474747", :offset "0.7283"}]
       [:stop {:id "stop5343", :style "stop-color:#595959", :offset "1"}]]
      [:polygon {:id "polygon5346", :points "1063.3,737.9 1063.3,790.8 1106.4,816.8 1106.4,766.7     ", :fill "url(#SVGID_112_)"}]
      [:linearGradient {:gradientTransform "matrix(1 1.170540e-04 1.170540e-04 -1 -1.549590e-02 1199.7689)", :y2 "403.9843", :x2 "1148.5438", :y1 "439.6804", :x1 "1112.8478", :gradientUnits "userSpaceOnUse", :id "SVGID_113_"}
       [:stop {:id "stop5348", :style "stop-color:#BFBFBF", :offset "0"}]
       [:stop {:id "stop5350", :style "stop-color:#969696", :offset "0.2132"}]
       [:stop {:id "stop5352", :style "stop-color:#717171", :offset "0.4462"}]
       [:stop {:id "stop5354", :style "stop-color:#565656", :offset "0.6625"}]
       [:stop {:id "stop5356", :style "stop-color:#464646", :offset "0.8538"}]
       [:stop {:id "stop5358", :style "stop-color:#404040", :offset "1"}]]
      [:polygon {:id "polygon5361", :points "1106.4,766.7 1106.4,816.8 1153.6,790.9 1153.6,737.9     ", :fill "url(#SVGID_113_)"}]
      [:linearGradient {:gradientTransform "matrix(1 1.170540e-04 1.170540e-04 -1 -1.549590e-02 1199.7689)", :y2 "485.3561", :x2 "1123.4481", :y1 "441.2566", :x1 "1095.2782", :gradientUnits "userSpaceOnUse", :id "SVGID_114_"}
       [:stop {:id "stop5363", :style "stop-color:#BFBFBF", :offset "0"}]
       [:stop {:id "stop5365", :style "stop-color:#A2A2A2", :offset "0.219"}]
       [:stop {:id "stop5367", :style "stop-color:#7B7B7B", :offset "0.5607"}]
       [:stop {:id "stop5369", :style "stop-color:#636363", :offset "0.833"}]
       [:stop {:id "stop5371", :style "stop-color:#5A5A5A", :offset "1"}]]
      [:polygon {:id "polygon5374", :points "1063.7,737.8 1106.1,766.7 1153.5,737.9 1109.6,710.1     ", :fill "url(#SVGID_114_)"}]
      [:g {:id "g5382", :opacity "0.12"}
       [:polygon {:id "polygon5376", :points "1074.3,745.5 1074.3,784.7 1106.4,803.9 1106.4,766.9      ", :fill "#FFFFFF"}]
       [:polygon {:id "polygon5378", :points "1140.1,745.5 1140.1,784.7 1106.4,803.9 1106.4,766.9      ", :fill "#FFFFFF"}]
       [:polygon {:id "polygon5380", :points "1074.2,745.5 1106.2,766.9 1141,745.5 1108.3,725      ", :fill "#FFFFFF"}]]
      [:linearGradient {:gradientTransform "matrix(1 1.170540e-04 1.170540e-04 -1 -1.549590e-02 1199.7689)", :y2 "442.3715", :x2 "1135.1699", :y1 "451.8765", :x1 "1125.6649", :gradientUnits "userSpaceOnUse", :id "SVGID_115_"}
       [:stop {:id "stop5384", :style "stop-color:#FFFFFF", :offset "0"}]
       [:stop {:id "stop5386", :style "stop-color:#D3D3D3", :offset "0.2961"}]
       [:stop {:id "stop5388", :style "stop-color:#ABABAB", :offset "0.604"}]
       [:stop {:id "stop5390", :style "stop-color:#939393", :offset "0.8495"}]
       [:stop {:id "stop5392", :style "stop-color:#8A8A8A", :offset "1"}]]
      [:polygon {:id "polygon5395", :points "1107,766.7 1107,767.7 1153.9,738.8 1154,738     ", :fill "url(#SVGID_115_)"}]
      [:linearGradient {:gradientTransform "matrix(-1 -1.170540e-04 1.170540e-04 -1 3721.9844 1200.2046)", :y2 "443.3383", :x2 "2640.3164", :y1 "450.8981", :x1 "2632.7566", :gradientUnits "userSpaceOnUse", :id "SVGID_116_"}
       [:stop {:id "stop5397", :style "stop-color:#FFFFFF", :offset "0"}]
       [:stop {:id "stop5399", :style "stop-color:#D3D3D3", :offset "0.2961"}]
       [:stop {:id "stop5401", :style "stop-color:#ABABAB", :offset "0.604"}]
       [:stop {:id "stop5403", :style "stop-color:#939393", :offset "0.8495"}]
       [:stop {:id "stop5405", :style "stop-color:#8A8A8A", :offset "1"}]]
      [:polygon {:id "polygon5408", :points "1107,766.7 1107,767.7 1064,738.8 1064,737.9     ", :fill "url(#SVGID_116_)"}]
      [:linearGradient {:gradientTransform "matrix(1 1.170540e-04 1.170540e-04 -1 -1.549590e-02 1199.7689)", :y2 "395.4397", :x2 "1119.2057", :y1 "420.4448", :x1 "1094.2003", :gradientUnits "userSpaceOnUse", :id "SVGID_117_"}
       [:stop {:id "stop5410", :style "stop-color:#FFFFFF", :offset "0"}]
       [:stop {:id "stop5412", :style "stop-color:#D3D3D3", :offset "0.2961"}]
       [:stop {:id "stop5414", :style "stop-color:#ABABAB", :offset "0.604"}]
       [:stop {:id "stop5416", :style "stop-color:#939393", :offset "0.8495"}]
       [:stop {:id "stop5418", :style "stop-color:#8A8A8A", :offset "1"}]]
      [:polygon {:id "polygon5421", :points "1107.2,767.2 1106.4,767.3 1106.4,816.8 1107.2,816.5     ", :fill "url(#SVGID_117_)"}]]
     [:line {:stroke "#B3B3B3", :fill "none", :stroke-linejoin "round", :y1 "738.1", :stroke-linecap "round", :stroke-width "3.2211", :id "line5425", :stroke-miterlimit "10", :x1 "1153.9", :y2 "679.3", :x2 "1248.3"}]
     [:g {:id "g5438"}
      [:image {:id "image5427", :transform "matrix(0.9804 0 0 0.9804 1172.2711 685.2417)", :xlinkHref "data:image/png;base64,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", :height "51", :width "54", :enable-background "new    ", :opacity "0.2", :overflow "visible"}]
      [:g {:id "g5436"}
       [:linearGradient {:gradientTransform "matrix(-1 0 0 1 3563.1868 1126.7981)", :y2 "-412.5486", :x2 "2371.2498", :y1 "-420.6838", :x1 "2358.3848", :gradientUnits "userSpaceOnUse", :id "SVGID_118_"}
        [:stop {:id "stop5429", :style "stop-color:#FFFFFF", :offset "0"}]
        [:stop {:id "stop5431", :style "stop-color:#FFFFFF;stop-opacity:0", :offset "0.8387"}]]
       [:polygon {:id "polygon5434", :points "1190.8,712 1193.4,716.3 1206.4,708 1203.8,703.8      ", :fill "url(#SVGID_118_)"}]]]]
    [:g {:id "g5545"}
     [:g {:id "g5528"}
      [:linearGradient {:gradientTransform "matrix(1 1.170540e-04 1.170540e-04 -1 -1.549590e-02 1199.7689)", :y2 "337.1843", :x2 "948.4024", :y1 "314.215", :x1 "905.4864", :gradientUnits "userSpaceOnUse", :id "SVGID_119_"}
       [:stop {:id "stop5442", :style "stop-color:#262626", :offset "0"}]
       [:stop {:id "stop5444", :style "stop-color:#2F2F2F", :offset "0.2774"}]
       [:stop {:id "stop5446", :style "stop-color:#474747", :offset "0.7283"}]
       [:stop {:id "stop5448", :style "stop-color:#595959", :offset "1"}]]
      [:polygon {:id "polygon5451", :points "906.3,834.2 906.3,887.2 949.4,913.2 949.4,863.1     ", :fill "url(#SVGID_119_)"}]
      [:linearGradient {:gradientTransform "matrix(1 1.170540e-04 1.170540e-04 -1 -1.549590e-02 1199.7689)", :y2 "307.6066", :x2 "991.5549", :y1 "343.3028", :x1 "955.8588", :gradientUnits "userSpaceOnUse", :id "SVGID_120_"}
       [:stop {:id "stop5453", :style "stop-color:#BFBFBF", :offset "0"}]
       [:stop {:id "stop5455", :style "stop-color:#969696", :offset "0.2132"}]
       [:stop {:id "stop5457", :style "stop-color:#717171", :offset "0.4462"}]
       [:stop {:id "stop5459", :style "stop-color:#565656", :offset "0.6625"}]
       [:stop {:id "stop5461", :style "stop-color:#464646", :offset "0.8538"}]
       [:stop {:id "stop5463", :style "stop-color:#404040", :offset "1"}]]
      [:polygon {:id "polygon5466", :points "949.4,863.1 949.4,913.2 996.6,887.2 996.6,834.2     ", :fill "url(#SVGID_120_)"}]
      [:linearGradient {:gradientTransform "matrix(1 1.170540e-04 1.170540e-04 -1 -1.549590e-02 1199.7689)", :y2 "388.9789", :x2 "966.4595", :y1 "344.8793", :x1 "938.2895", :gradientUnits "userSpaceOnUse", :id "SVGID_121_"}
       [:stop {:id "stop5468", :style "stop-color:#BFBFBF", :offset "0"}]
       [:stop {:id "stop5470", :style "stop-color:#A2A2A2", :offset "0.219"}]
       [:stop {:id "stop5472", :style "stop-color:#7B7B7B", :offset "0.5607"}]
       [:stop {:id "stop5474", :style "stop-color:#636363", :offset "0.833"}]
       [:stop {:id "stop5476", :style "stop-color:#5A5A5A", :offset "1"}]]
      [:polygon {:id "polygon5479", :points "906.7,834.2 949.1,863.1 996.5,834.3 952.6,806.4     ", :fill "url(#SVGID_121_)"}]
      [:g {:id "g5487", :opacity "0.12"}
       [:polygon {:id "polygon5481", :points "917.3,841.9 917.3,881.1 949.4,900.3 949.4,863.2      ", :fill "#FFFFFF"}]
       [:polygon {:id "polygon5483", :points "983.1,841.9 983.1,881.1 949.4,900.3 949.4,863.2      ", :fill "#FFFFFF"}]
       [:polygon {:id "polygon5485", :points "917.2,841.9 949.2,863.2 984,841.9 951.3,821.3      ", :fill "#FFFFFF"}]]
      [:linearGradient {:gradientTransform "matrix(1 1.170540e-04 1.170540e-04 -1 -1.549590e-02 1199.7689)", :y2 "345.994", :x2 "978.1812", :y1 "355.4992", :x1 "968.6761", :gradientUnits "userSpaceOnUse", :id "SVGID_122_"}
       [:stop {:id "stop5489", :style "stop-color:#FFFFFF", :offset "0"}]
       [:stop {:id "stop5491", :style "stop-color:#D3D3D3", :offset "0.2961"}]
       [:stop {:id "stop5493", :style "stop-color:#ABABAB", :offset "0.604"}]
       [:stop {:id "stop5495", :style "stop-color:#939393", :offset "0.8495"}]
       [:stop {:id "stop5497", :style "stop-color:#8A8A8A", :offset "1"}]]
      [:polygon {:id "polygon5500", :points "950,863.1 950,864.1 996.9,835.2 997,834.3     ", :fill "url(#SVGID_122_)"}]
      [:linearGradient {:gradientTransform "matrix(-1 -1.170540e-04 1.170540e-04 -1 3721.9844 1200.2046)", :y2 "346.9612", :x2 "2797.3054", :y1 "354.521", :x1 "2789.7456", :gradientUnits "userSpaceOnUse", :id "SVGID_123_"}
       [:stop {:id "stop5502", :style "stop-color:#FFFFFF", :offset "0"}]
       [:stop {:id "stop5504", :style "stop-color:#D3D3D3", :offset "0.2961"}]
       [:stop {:id "stop5506", :style "stop-color:#ABABAB", :offset "0.604"}]
       [:stop {:id "stop5508", :style "stop-color:#939393", :offset "0.8495"}]
       [:stop {:id "stop5510", :style "stop-color:#8A8A8A", :offset "1"}]]
      [:polygon {:id "polygon5513", :points "950,863.1 950,864.1 907,835.2 907,834.2     ", :fill "url(#SVGID_123_)"}]
      [:linearGradient {:gradientTransform "matrix(1 1.170540e-04 1.170540e-04 -1 -1.549590e-02 1199.7689)", :y2 "299.0622", :x2 "962.2169", :y1 "324.0675", :x1 "937.2116", :gradientUnits "userSpaceOnUse", :id "SVGID_124_"}
       [:stop {:id "stop5515", :style "stop-color:#FFFFFF", :offset "0"}]
       [:stop {:id "stop5517", :style "stop-color:#D3D3D3", :offset "0.2961"}]
       [:stop {:id "stop5519", :style "stop-color:#ABABAB", :offset "0.604"}]
       [:stop {:id "stop5521", :style "stop-color:#939393", :offset "0.8495"}]
       [:stop {:id "stop5523", :style "stop-color:#8A8A8A", :offset "1"}]]
      [:polygon {:id "polygon5526", :points "950.2,863.6 949.4,863.7 949.4,913.2 950.2,912.8     ", :fill "url(#SVGID_124_)"}]]
     [:line {:stroke "#B3B3B3", :fill "none", :stroke-linejoin "round", :y1 "834.5", :stroke-linecap "round", :stroke-width "3.2211", :id "line5530", :stroke-miterlimit "10", :x1 "996.9", :y2 "780.9", :x2 "1082.2"}]
     [:g {:id "g5543"}
      [:image {:id "image5532", :transform "matrix(0.98 0 0 0.98 1024.2817 776.2417)", :xlinkHref "data:image/png;base64,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 CzAAqYTVOPWO2yYAAAAASUVORK5CYII=", :height "50", :width "54", :enable-background "new    ", :opacity "0.2", :overflow "visible"}]
      [:g {:id "g5541"}
       [:linearGradient {:gradientTransform "matrix(-1 0 0 1 3563.1868 1126.7981)", :y2 "-322.19", :x2 "2519.25", :y1 "-330.3252", :x1 "2506.385", :gradientUnits "userSpaceOnUse", :id "SVGID_125_"}
        [:stop {:id "stop5534", :style "stop-color:#FFFFFF", :offset "0"}]
        [:stop {:id "stop5536", :style "stop-color:#FFFFFF;stop-opacity:0", :offset "0.8387"}]]
       [:polygon {:id "polygon5539", :points "1042.8,802.4 1045.4,806.6 1058.4,798.4 1055.8,794.2      ", :fill "url(#SVGID_125_)"}]]]]]
   [:g {:id "g5694"}
    [:circle {:id "circle5548", :opacity "4gf.2", :style "fill:#fff", :r "1"}
     [:animatemotion {:repeatCount "indefinite", :dur "10s", :begin "-200ms"}
      [:mpath {:xlinkHref "#bottomline"}]]]
    [:circle {:id "circle5550", :opacity "4gf.2", :style "fill:#fff", :r "1"}
     [:animatemotion {:repeatCount "indefinite", :dur "10s", :begin "-400ms"}
      [:mpath {:xlinkHref "#bottomline"}]]]
    [:circle {:id "circle5552", :opacity "4gf.2", :style "fill:#fff", :r "1"}
     [:animatemotion {:repeatCount "indefinite", :dur "10s", :begin "-600ms"}
      [:mpath {:xlinkHref "#bottomline"}]]]
    [:circle {:id "circle5554", :opacity "4gf.2", :style "fill:#fff", :r "1"}
     [:animatemotion {:repeatCount "indefinite", :dur "10s", :begin "-800ms"}
      [:mpath {:xlinkHref "#bottomline"}]]]
    [:circle {:id "circle5556", :opacity "04gf2", :style "fill:#fff", :r "1"}
     [:animatemotion {:repeatCount "indefinite", :dur "10s", :begin "-1000ms"}
      [:mpath {:xlinkHref "#bottomline"}]]]
    [:circle {:id "circle5558", :opacity "04gf2", :style "fill:#fff", :r "1"}
     [:animatemotion {:repeatCount "indefinite", :dur "10s", :begin "-1200ms"}
      [:mpath {:xlinkHref "#bottomline"}]]]
    [:circle {:id "circle5560", :opacity "04gf2", :style "fill:#fff", :r "1"}
     [:animatemotion {:repeatCount "indefinite", :dur "10s", :begin "-1400ms"}
      [:mpath {:xlinkHref "#bottomline"}]]]
    [:circle {:id "circle5562", :opacity "04gf2", :style "fill:#fff", :r "1"}
     [:animatemotion {:repeatCount "indefinite", :dur "10s", :begin "-1600ms"}
      [:mpath {:xlinkHref "#bottomline"}]]]
    [:circle {:id "circle5564", :opacity "04gf2", :style "fill:#fff", :r "1"}
     [:animatemotion {:repeatCount "indefinite", :dur "10s", :begin "-1800ms"}
      [:mpath {:xlinkHref "#bottomline"}]]]
    [:circle {:id "circle5566", :opacity "04gf2", :style "fill:#fff", :r "1"}
     [:animatemotion {:repeatCount "indefinite", :dur "10s", :begin "-2000ms"}
      [:mpath {:xlinkHref "#bottomline"}]]]
    [:circle {:id "circle5568", :opacity "04gf2", :style "fill:#fff", :r "1"}
     [:animatemotion {:repeatCount "indefinite", :dur "10s", :begin "-2200ms"}
      [:mpath {:xlinkHref "#bottomline"}]]]
    [:circle {:id "circle5570", :opacity "04gf2", :style "fill:#fff", :r "1"}
     [:animatemotion {:repeatCount "indefinite", :dur "10s", :begin "-2400ms"}
      [:mpath {:xlinkHref "#bottomline"}]]]
    [:circle {:id "circle5572", :opacity "04gf2", :style "fill:#fff", :r "1"}
     [:animatemotion {:repeatCount "indefinite", :dur "10s", :begin "-2600ms"}
      [:mpath {:xlinkHref "#bottomline"}]]]
    [:circle {:id "circle5574", :opacity "04gf2", :style "fill:#fff", :r "1"}
     [:animatemotion {:repeatCount "indefinite", :dur "10s", :begin "-2800ms"}
      [:mpath {:xlinkHref "#bottomline"}]]]
    [:circle {:id "circle5576", :opacity "04gf2", :style "fill:#fff", :r "1"}
     [:animatemotion {:repeatCount "indefinite", :dur "10s", :begin "-3000ms"}
      [:mpath {:xlinkHref "#bottomline"}]]]
    [:circle {:id "circle5578", :opacity "04gf2", :style "fill:#fff", :r "1"}
     [:animatemotion {:repeatCount "indefinite", :dur "10s", :begin "-3200ms"}
      [:mpath {:xlinkHref "#bottomline"}]]]
    [:circle {:id "circle5580", :opacity "04gf2", :style "fill:#fff", :r "1"}
     [:animatemotion {:repeatCount "indefinite", :dur "10s", :begin "-3400ms"}
      [:mpath {:xlinkHref "#bottomline"}]]]
    [:circle {:id "circle5582", :opacity "04gf2", :style "fill:#fff", :r "1"}
     [:animatemotion {:repeatCount "indefinite", :dur "10s", :begin "-3600ms"}
      [:mpath {:xlinkHref "#bottomline"}]]]
    [:circle {:id "circle5584", :opacity "04gf2", :style "fill:#fff", :r "1"}
     [:animatemotion {:repeatCount "indefinite", :dur "10s", :begin "-3800ms"}
      [:mpath {:xlinkHref "#bottomline"}]]]
    [:circle {:id "circle5586", :opacity "04gf2", :style "fill:#fff", :r "1"}
     [:animatemotion {:repeatCount "indefinite", :dur "10s", :begin "-4000ms"}
      [:mpath {:xlinkHref "#bottomline"}]]]
    [:circle {:id "circle5588", :opacity "04gf2", :style "fill:#fff", :r "1"}
     [:animatemotion {:repeatCount "indefinite", :dur "10s", :begin "-4200ms"}
      [:mpath {:xlinkHref "#bottomline"}]]]
    [:circle {:id "circle5590", :opacity "04gf2", :style "fill:#fff", :r "1"}
     [:animatemotion {:repeatCount "indefinite", :dur "10s", :begin "-4400ms"}
      [:mpath {:xlinkHref "#bottomline"}]]]
    [:circle {:id "circle5592", :opacity "04gf2", :style "fill:#fff", :r "1"}
     [:animatemotion {:repeatCount "indefinite", :dur "10s", :begin "-4600ms"}
      [:mpath {:xlinkHref "#bottomline"}]]]
    [:circle {:id "circle5594", :opacity "04gf2", :style "fill:#fff", :r "1"}
     [:animatemotion {:repeatCount "indefinite", :dur "10s", :begin "-4800ms"}
      [:mpath {:xlinkHref "#bottomline"}]]]
    [:circle {:id "circle5596", :opacity "04gf2", :style "fill:#fff", :r "1"}
     [:animatemotion {:repeatCount "indefinite", :dur "10s", :begin "-5000ms"}
      [:mpath {:xlinkHref "#bottomline"}]]]
    [:circle {:id "circle5598", :opacity "04gf2", :style "fill:#fff", :r "1"}
     [:animatemotion {:repeatCount "indefinite", :dur "10s", :begin "-5200ms"}
      [:mpath {:xlinkHref "#bottomline"}]]]
    [:circle {:id "circle5600", :opacity "04gf2", :style "fill:#fff", :r "1"}
     [:animatemotion {:repeatCount "indefinite", :dur "10s", :begin "-5400ms"}
      [:mpath {:xlinkHref "#bottomline"}]]]
    [:circle {:id "circle5602", :opacity "04gf2", :style "fill:#fff", :r "1"}
     [:animatemotion {:repeatCount "indefinite", :dur "10s", :begin "-5600ms"}
      [:mpath {:xlinkHref "#bottomline"}]]]
    [:circle {:id "circle5604", :opacity "04gf2", :style "fill:#fff", :r "1"}
     [:animatemotion {:repeatCount "indefinite", :dur "10s", :begin "-5800ms"}
      [:mpath {:xlinkHref "#bottomline"}]]]
    [:circle {:id "circle5606", :opacity "04gf2", :style "fill:#fff", :r "1"}
     [:animatemotion {:repeatCount "indefinite", :dur "10s", :begin "-6000ms"}
      [:mpath {:xlinkHref "#bottomline"}]]]
    [:circle {:id "circle5608", :opacity "04gf2", :style "fill:#fff", :r "1"}
     [:animatemotion {:repeatCount "indefinite", :dur "10s", :begin "-6200ms"}
      [:mpath {:xlinkHref "#bottomline"}]]]
    [:circle {:id "circle5610", :opacity "04gf2", :style "fill:#fff", :r "1"}
     [:animatemotion {:repeatCount "indefinite", :dur "10s", :begin "-6400ms"}
      [:mpath {:xlinkHref "#bottomline"}]]]
    [:circle {:id "circle5612", :opacity "04gf2", :style "fill:#fff", :r "1"}
     [:animatemotion {:repeatCount "indefinite", :dur "10s", :begin "-6600ms"}
      [:mpath {:xlinkHref "#bottomline"}]]]
    [:circle {:id "circle5614", :opacity "04gf2", :style "fill:#fff", :r "1"}
     [:animatemotion {:repeatCount "indefinite", :dur "10s", :begin "-6800ms"}
      [:mpath {:xlinkHref "#bottomline"}]]]
    [:circle {:id "circle5616", :opacity "04gf2", :style "fill:#fff", :r "1"}
     [:animatemotion {:repeatCount "indefinite", :dur "10s", :begin "-7000ms"}
      [:mpath {:xlinkHref "#bottomline"}]]]
    [:circle {:id "circle5618", :opacity "04gf2", :style "fill:#fff", :r "1"}
     [:animatemotion {:repeatCount "indefinite", :dur "10s", :begin "-7200ms"}
      [:mpath {:xlinkHref "#bottomline"}]]]
    [:circle {:id "circle5620", :opacity "04gf2", :style "fill:#fff", :r "1"}
     [:animatemotion {:repeatCount "indefinite", :dur "10s", :begin "-7400ms"}
      [:mpath {:xlinkHref "#bottomline"}]]]
    [:circle {:id "circle5622", :opacity "04gf2", :style "fill:#fff", :r "1"}
     [:animatemotion {:repeatCount "indefinite", :dur "10s", :begin "-7600ms"}
      [:mpath {:xlinkHref "#bottomline"}]]]
    [:circle {:id "circle5624", :opacity "04gf2", :style "fill:#fff", :r "1"}
     [:animatemotion {:repeatCount "indefinite", :dur "10s", :begin "-7800ms"}
      [:mpath {:xlinkHref "#bottomline"}]]]
    [:circle {:id "circle5626", :opacity "04gf2", :style "fill:#fff", :r "1"}
     [:animatemotion {:repeatCount "indefinite", :dur "10s", :begin "-8000ms"}
      [:mpath {:xlinkHref "#bottomline"}]]]
    [:circle {:id "circle5628", :opacity "04gf2", :style "fill:#fff", :r "1"}
     [:animatemotion {:repeatCount "indefinite", :dur "10s", :begin "-8200ms"}
      [:mpath {:xlinkHref "#bottomline"}]]]
    [:circle {:id "circle5630", :opacity "04gf2", :style "fill:#fff", :r "1"}
     [:animatemotion {:repeatCount "indefinite", :dur "10s", :begin "-8400ms"}
      [:mpath {:xlinkHref "#bottomline"}]]]
    [:circle {:id "circle5632", :opacity "04gf2", :style "fill:#fff", :r "1"}
     [:animatemotion {:repeatCount "indefinite", :dur "10s", :begin "-8600ms"}
      [:mpath {:xlinkHref "#bottomline"}]]]
    [:circle {:id "circle5634", :opacity "04gf2", :style "fill:#fff", :r "1"}
     [:animatemotion {:repeatCount "indefinite", :dur "10s", :begin "-8800ms"}
      [:mpath {:xlinkHref "#bottomline"}]]]
    [:circle {:id "circle5636", :opacity "04gf2", :style "fill:#fff", :r "1"}
     [:animatemotion {:repeatCount "indefinite", :dur "10s", :begin "-9000ms"}
      [:mpath {:xlinkHref "#bottomline"}]]]
    [:circle {:id "circle5638", :opacity "04gf2", :style "fill:#fff", :r "1"}
     [:animatemotion {:repeatCount "indefinite", :dur "10s", :begin "-9200ms"}
      [:mpath {:xlinkHref "#bottomline"}]]]
    [:circle {:id "circle5640", :opacity "04gf2", :style "fill:#fff", :r "1"}
     [:animatemotion {:repeatCount "indefinite", :dur "10s", :begin "-9400ms"}
      [:mpath {:xlinkHref "#bottomline"}]]]
    [:circle {:id "circle5642", :opacity "04gf2", :style "fill:#fff", :r "1"}
     [:animatemotion {:repeatCount "indefinite", :dur "10s", :begin "-9600ms"}
      [:mpath {:xlinkHref "#bottomline"}]]]
    [:circle {:id "circle5644", :opacity "04gf2", :style "fill:#fff", :r "1"}
     [:animatemotion {:repeatCount "indefinite", :dur "10s", :begin "-9800ms"}
      [:mpath {:xlinkHref "#bottomline"}]]]
    [:circle {:id "circle5646", :opacity "0.4gf", :style "fill:#fff", :r "1"}
     [:animatemotion {:repeatCount "indefinite", :dur "10s", :begin "-10000ms"}
      [:mpath {:xlinkHref "#bottomline"}]]]
    [:circle {:id "circle5648", :opacity "0.4gf", :style "fill:#fff", :r "1"}
     [:animatemotion {:repeatCount "indefinite", :dur "10s", :begin "-10200ms"}
      [:mpath {:xlinkHref "#bottomline"}]]]
    [:circle {:id "circle5650", :opacity "0.4gf", :style "fill:#fff", :r "1"}
     [:animatemotion {:repeatCount "indefinite", :dur "10s", :begin "-10400ms"}
      [:mpath {:xlinkHref "#bottomline"}]]]
    [:circle {:id "circle5652", :opacity "0.4gf", :style "fill:#fff", :r "1"}
     [:animatemotion {:repeatCount "indefinite", :dur "10s", :begin "-10600ms"}
      [:mpath {:xlinkHref "#bottomline"}]]]
    [:circle {:id "circle5654", :opacity "0.4gf", :style "fill:#fff", :r "1"}
     [:animatemotion {:repeatCount "indefinite", :dur "10s", :begin "-10800ms"}
      [:mpath {:xlinkHref "#bottomline"}]]]
    [:circle {:id "circle5656", :opacity "0.4gf", :style "fill:#fff", :r "1"}
     [:animatemotion {:repeatCount "indefinite", :dur "10s", :begin "-11000ms"}
      [:mpath {:xlinkHref "#bottomline"}]]]
    [:circle {:id "circle5658", :opacity "0.4gf", :style "fill:#fff", :r "1"}
     [:animatemotion {:repeatCount "indefinite", :dur "10s", :begin "-11200ms"}
      [:mpath {:xlinkHref "#bottomline"}]]]
    [:circle {:id "circle5660", :opacity "0.4gf", :style "fill:#fff", :r "1"}
     [:animatemotion {:repeatCount "indefinite", :dur "10s", :begin "-11400ms"}
      [:mpath {:xlinkHref "#bottomline"}]]]
    [:circle {:id "circle5662", :opacity "0.4gf", :style "fill:#fff", :r "1"}
     [:animatemotion {:repeatCount "indefinite", :dur "10s", :begin "-11600ms"}
      [:mpath {:xlinkHref "#bottomline"}]]]
    [:circle {:id "circle5664", :opacity "0.4gf", :style "fill:#fff", :r "1"}
     [:animatemotion {:repeatCount "indefinite", :dur "10s", :begin "-11800ms"}
      [:mpath {:xlinkHref "#bottomline"}]]]
    [:circle {:id "circle5666", :opacity "0.4gf", :style "fill:#fff", :r "1"}
     [:animatemotion {:repeatCount "indefinite", :dur "10s", :begin "-12000ms"}
      [:mpath {:xlinkHref "#bottomline"}]]]
    [:circle {:id "circle5668", :opacity "0.4gf", :style "fill:#fff", :r "1"}
     [:animatemotion {:repeatCount "indefinite", :dur "10s", :begin "-12200ms"}
      [:mpath {:xlinkHref "#bottomline"}]]]
    [:circle {:id "circle5670", :opacity "0.4gf", :style "fill:#fff", :r "1"}
     [:animatemotion {:repeatCount "indefinite", :dur "10s", :begin "-12400ms"}
      [:mpath {:xlinkHref "#bottomline"}]]]
    [:circle {:id "circle5672", :opacity "0.4gf", :style "fill:#fff", :r "1"}
     [:animatemotion {:repeatCount "indefinite", :dur "10s", :begin "-12600ms"}
      [:mpath {:xlinkHref "#bottomline"}]]]
    [:circle {:id "circle5674", :opacity "0.4gf", :style "fill:#fff", :r "1"}
     [:animatemotion {:repeatCount "indefinite", :dur "10s", :begin "-12800ms"}
      [:mpath {:xlinkHref "#bottomline"}]]]
    [:circle {:id "circle5676", :opacity "0.4gf", :style "fill:#fff", :r "1"}
     [:animatemotion {:repeatCount "indefinite", :dur "10s", :begin "-13000ms"}
      [:mpath {:xlinkHref "#bottomline"}]]]
    [:circle {:id "circle5678", :opacity "0.4gf", :style "fill:#fff", :r "1"}
     [:animatemotion {:repeatCount "indefinite", :dur "10s", :begin "-13200ms"}
      [:mpath {:xlinkHref "#bottomline"}]]]
    [:circle {:id "circle5680", :opacity "0.4gf", :style "fill:#fff", :r "1"}
     [:animatemotion {:repeatCount "indefinite", :dur "10s", :begin "-13400ms"}
      [:mpath {:xlinkHref "#bottomline"}]]]
    [:circle {:id "circle5682", :opacity "0.4gf", :style "fill:#fff", :r "1"}
     [:animatemotion {:repeatCount "indefinite", :dur "10s", :begin "-13600ms"}
      [:mpath {:xlinkHref "#bottomline"}]]]
    [:circle {:id "circle5684", :opacity "0.4gf", :style "fill:#fff", :r "1"}
     [:animatemotion {:repeatCount "indefinite", :dur "10s", :begin "-13800ms"}
      [:mpath {:xlinkHref "#bottomline"}]]]
    [:circle {:id "circle5686", :opacity "0.4gf", :style "fill:#fff", :r "1"}
     [:animatemotion {:repeatCount "indefinite", :dur "10s", :begin "-14000ms"}
      [:mpath {:xlinkHref "#bottomline"}]]]
    [:circle {:id "circle5688", :opacity "0.4gf", :style "fill:#fff", :r "1"}
     [:animatemotion {:repeatCount "indefinite", :dur "10s", :begin "-14200ms"}
      [:mpath {:xlinkHref "#bottomline"}]]]
    [:circle {:id "circle5690", :opacity "0.4gf", :style "fill:#fff", :r "1"}
     [:animatemotion {:repeatCount "indefinite", :dur "10s", :begin "-14400ms"}
      [:mpath {:xlinkHref "#bottomline"}]]]
    [:circle {:id "circle5692", :opacity "0.4gf", :style "fill:#fff", :r "1"}
     [:animatemotion {:repeatCount "indefinite", :dur "10s", :begin "-14600ms"}
      [:mpath {:xlinkHref "#bottomline"}]]]]
   [:g {:opacity "0.7", :id "bottomblocks"}
    [:g {:id "g5748"}
     [:g {:id "g5733", :opacity "0.25"}
      [:linearGradient {:gradientTransform "matrix(1 0 0 -1 0 1200)", :y2 "464.5827", :x2 "1679.3896", :y1 "450.1895", :x1 "1652.4972", :gradientUnits "userSpaceOnUse", :id "SVGID_126_"}
       [:stop {:id "stop5696", :style "stop-color:#494949", :offset "0"}]
       [:stop {:id "stop5698", :style "stop-color:#525252", :offset "0.2255"}]
       [:stop {:id "stop5700", :style "stop-color:#6A6A6A", :offset "0.593"}]
       [:stop {:id "stop5702", :style "stop-color:#8C8C8C", :offset "1"}]]
      [:polygon {:id "polygon5705", :points "1653,717.7 1653,750.8 1680,767 1680,735.7     ", :fill "url(#SVGID_126_)"}]
      [:linearGradient {:gradientTransform "matrix(1 0 0 -1 0 1200)", :y2 "446.217", :x2 "1705.967", :y1 "468.25", :x1 "1683.9341", :gradientUnits "userSpaceOnUse", :id "SVGID_127_"}
       [:stop {:id "stop5707", :style "stop-color:#BFBFBF", :offset "0"}]
       [:stop {:id "stop5709", :style "stop-color:#A2A2A2", :offset "0.219"}]
       [:stop {:id "stop5711", :style "stop-color:#7B7B7B", :offset "0.5607"}]
       [:stop {:id "stop5713", :style "stop-color:#636363", :offset "0.833"}]
       [:stop {:id "stop5715", :style "stop-color:#5A5A5A", :offset "1"}]]
      [:polygon {:id "polygon5718", :points "1680,735.7 1680,767 1709,750.8 1709,717.7     ", :fill "url(#SVGID_127_)"}]
      [:linearGradient {:gradientTransform "matrix(1 0 0 -1 0 1200)", :y2 "496.8659", :x2 "1690.5178", :y1 "469.5625", :x1 "1673.0768", :gradientUnits "userSpaceOnUse", :id "SVGID_128_"}
       [:stop {:id "stop5720", :style "stop-color:#A6A6A6", :offset "0"}]
       [:stop {:id "stop5722", :style "stop-color:#A2A2A2", :offset "3.360000e-02"}]
       [:stop {:id "stop5724", :style "stop-color:#7B7B7B", :offset "0.4566"}]
       [:stop {:id "stop5726", :style "stop-color:#636363", :offset "0.7934"}]
       [:stop {:id "stop5728", :style "stop-color:#5A5A5A", :offset "1"}]]
      [:polygon {:id "polygon5731", :points "1653.6,717.7 1680.1,735.7 1708.9,717.7 1682,700.3     ", :fill "url(#SVGID_128_)"}]]
     [:linearGradient {:gradientTransform "matrix(1 0 0 -1 0 1200)", :y2 "483.866", :x2 "1652.8374", :y1 "447.7885", :x1 "1709.9064", :gradientUnits "userSpaceOnUse", :id "SVGID_129_"}
      [:stop {:id "stop5735", :style "stop-color:#3A3C4D", :offset "0"}]
      [:stop {:id "stop5737", :style "stop-color:#3D3F4E", :offset "0.42"}]
      [:stop {:id "stop5739", :style "stop-color:#464752", :offset "0.7058"}]
      [:stop {:id "stop5741", :style "stop-color:#555557", :offset "0.9509"}]
      [:stop {:id "stop5743", :style "stop-color:#595959", :offset "1"}]]
     [:path {:id "path5746", :d "M1675.6,703.4l-0.3-0.6l1-0.6l0.3,0.6L1675.6,703.4z M1678.3,701.7l-0.3-0.6l-1,0.6l0.3,0.6       L1678.3,701.7z M1680,700.7l-0.3-0.6l-1,0.6l0.3,0.6L1680,700.7z M1671.3,705.9l-0.3-0.6l-1,0.6l0.3,0.6L1671.3,705.9z         M1673.1,704.9l-0.3-0.6l-1,0.6l0.3,0.6L1673.1,704.9z M1674.8,703.8l-0.3-0.6l-1,0.6l0.3,0.6L1674.8,703.8z M1666.1,709.1       l-0.3-0.6l-1,0.6l0.3,0.6L1666.1,709.1z M1667.9,708l-0.3-0.6l-1,0.6l0.3,0.6L1667.9,708z M1669.6,707l-0.3-0.6l-1,0.6l0.3,0.6       L1669.6,707z M1660.9,712.3l-0.3-0.6l-1,0.6l0.3,0.6L1660.9,712.3z M1662.6,711.2l-0.3-0.6l-1,0.6l0.3,0.6L1662.6,711.2z         M1664.4,710.2l-0.3-0.6l-1,0.6l0.3,0.6L1664.4,710.2z M1655.7,715.4l-0.3-0.6l-1,0.6l0.3,0.6L1655.7,715.4z M1657.4,714.4       l-0.3-0.6l-1,0.6l0.3,0.6L1657.4,714.4z M1659.2,713.3l-0.3-0.6l-1,0.6l0.3,0.6L1659.2,713.3z M1653.3,723.4h-0.9v1.3h0.9V723.4z         M1653.3,721.7h-0.9v0.9h0.9V721.7z M1653.3,719.5h-0.9v0.9h0.9V719.5z M1653.3,729.8h-0.9v0.9h0.9V729.8z M1653.3,727.6h-0.9       v1.3h0.9V727.6z M1653.3,725.5h-0.9v0.9h0.9V725.5z M1653.3,735.8h-0.9v0.9h0.9V735.8z M1653.3,733.6h-0.9v1.3h0.9V733.6z         M1653.3,731.9h-0.9v0.9h0.9V731.9z M1653.3,741.8h-0.9v1.3h0.9V741.8z M1653.3,739.6h-0.9v1.3h0.9V739.6z M1653.3,737.5h-0.9       v1.3h0.9V737.5z M1653.3,747.8h-0.9v1.3h0.9V747.8z M1653.3,746.1h-0.9v0.9h0.9V746.1z M1653.3,743.9h-0.9v1.3h0.9V743.9z         M1657.9,754.5l-0.4,0.6l0.9,0.6l0.4-0.6L1657.9,754.5z M1656.3,753.4l-0.4,0.6l0.9,0.6l0.4-0.6L1656.3,753.4z M1654.7,752.4       l-0.4,0.6l0.9,0.6l0.4-0.6L1654.7,752.4z M1662.8,757.5l-0.4,0.6l0.9,0.6l0.4-0.6L1662.8,757.5z M1661.2,756.5l-0.4,0.6l0.9,0.6       l0.4-0.6L1661.2,756.5z M1659.6,755.5l-0.4,0.6l0.9,0.6l0.4-0.6L1659.6,755.5z M1667.7,760.5l-0.4,0.6l0.9,0.6l0.4-0.6       L1667.7,760.5z M1666,759.5l-0.4,0.6l0.9,0.6l0.4-0.6L1666,759.5z M1664.4,758.5l-0.4,0.6l0.9,0.6l0.4-0.6L1664.4,758.5z         M1672.5,763.5l-0.4,0.6l0.9,0.6l0.4-0.6L1672.5,763.5z M1670.9,762.5l-0.4,0.6l0.9,0.6l0.4-0.6L1670.9,762.5z M1669.3,761.5       l-0.4,0.6l0.9,0.6l0.4-0.6L1669.3,761.5z M1677.4,766.5l-0.4,0.6l0.9,0.6l0.4-0.6L1677.4,766.5z M1675.8,765.5l-0.4,0.6l0.9,0.6       l0.4-0.6L1675.8,765.5z M1674.2,764.5l-0.4,0.6l0.9,0.6l0.4-0.6L1674.2,764.5z M1685.7,765.1l0.3,0.6l1-0.6l-0.3-0.6       L1685.7,765.1z M1684,766.1l0.3,0.6l1-0.6l-0.3-0.6L1684,766.1z M1682.2,767.1l0.3,0.6l1-0.6l-0.3-0.6L1682.2,767.1z M1691,762.1       l0.3,0.6l1-0.6l-0.3-0.6L1691,762.1z M1689.3,763.1l0.3,0.6l1-0.6l-0.3-0.6L1689.3,763.1z M1687.5,764.1l0.3,0.6l1-0.6l-0.3-0.6       L1687.5,764.1z M1696.3,759l0.3,0.6l1-0.6l-0.3-0.6L1696.3,759z M1694.6,760l0.3,0.6l1-0.6l-0.3-0.6L1694.6,760z M1692.8,761       l0.3,0.6l1-0.6l-0.3-0.6L1692.8,761z M1701.6,756l0.3,0.6l1-0.6l-0.3-0.6L1701.6,756z M1699.8,757l0.3,0.6l1-0.6l-0.3-0.6       L1699.8,757z M1698.1,758l0.3,0.6l1-0.6l-0.3-0.6L1698.1,758z M1706.9,753l0.3,0.6l1-0.6l-0.3-0.6L1706.9,753z M1705.1,754       l0.3,0.6l1-0.6l-0.3-0.6L1705.1,754z M1703.4,755l0.3,0.6l1-0.6l-0.3-0.6L1703.4,755z M1709.8,745l0.7,0l0-1.1l-0.7,0L1709.8,745       z M1709.8,747l0.7,0l0-1.1l-0.7,0L1709.8,747z M1709.8,749l0.7,0l0-1.1l-0.7,0L1709.8,749z M1709.8,738.9l0.7,0l0-1.1l-0.7,0       L1709.8,738.9z M1709.8,741l0.7,0l0-1.1l-0.7,0L1709.8,741z M1709.8,743l0.7,0l0-1.1l-0.7,0L1709.8,743z M1709.8,732.9l0.7,0       l0-1.1l-0.7,0L1709.8,732.9z M1709.8,734.9l0.7,0l0-1.1l-0.7,0L1709.8,734.9z M1709.8,736.9l0.7,0l0-1.1l-0.7,0L1709.8,736.9z         M1709.8,726.8l0.7,0l0-1.1l-0.7,0L1709.8,726.8z M1709.8,728.8l0.7,0l0-1.1l-0.7,0L1709.8,728.8z M1709.8,730.8l0.7,0l0-1.1       l-0.7,0L1709.8,730.8z M1709.8,720.8l0.7,0l0-1.1l-0.7,0L1709.8,720.8z M1709.8,722.8l0.7,0l0-1.1l-0.7,0L1709.8,722.8z         M1709.8,724.8l0.7,0l0-1.1l-0.7,0L1709.8,724.8z M1704.7,714.2l0.4-0.6l-0.9-0.6l-0.4,0.6L1704.7,714.2z M1706.4,715.3l0.4-0.6       l-0.9-0.6l-0.4,0.6L1706.4,715.3z M1708,716.3l0.4-0.6l-0.9-0.6l-0.4,0.6L1708,716.3z M1699.8,711l0.4-0.6l-0.9-0.6l-0.4,0.6       L1699.8,711z M1701.4,712.1l0.4-0.6l-0.9-0.6l-0.4,0.6L1701.4,712.1z M1703.1,713.1l0.4-0.6l-0.9-0.6l-0.4,0.6L1703.1,713.1z         M1694.8,707.8l0.4-0.6l-0.9-0.6l-0.4,0.6L1694.8,707.8z M1696.5,708.8l0.4-0.6l-0.9-0.6l-0.4,0.6L1696.5,708.8z M1698.1,709.9       l0.4-0.6l-0.9-0.6l-0.4,0.6L1698.1,709.9z M1689.9,704.6l0.4-0.6l-0.9-0.6l-0.4,0.6L1689.9,704.6z M1691.6,705.6l0.4-0.6       l-0.9-0.6l-0.4,0.6L1691.6,705.6z M1693.2,706.7l0.4-0.6l-0.9-0.6l-0.4,0.6L1693.2,706.7z M1685,701.3l0.4-0.6l-0.9-0.6l-0.4,0.6       L1685,701.3z M1686.6,702.4l0.4-0.6l-0.9-0.6l-0.4,0.6L1686.6,702.4z M1688.3,703.5l0.4-0.6l-0.9-0.6l-0.4,0.6L1688.3,703.5z         M1653.3,716.3l0.3,0.6l0.5-0.3l-0.3-0.6L1653.3,716.3z M1652.4,716.9C1652.4,716.9,1652.4,716.9,1652.4,716.9c0,0.1,0,0.2,0,0.3       c0,0.2,0,0.6,0,0.6h0.9c0,0,0-0.4,0-0.5c0,0,0-0.1,0-0.1v0v0v0l-0.1,0c0,0-0.1,0-0.1,0c0,0,0,0,0,0l0.2-0.1l-0.4-0.6       L1652.4,716.9C1652.4,716.8,1652.4,716.8,1652.4,716.9z M1652.4,718.6h0.7V718h-0.7V718.6z M1652.3,750.5h0.7v-0.6h-0.7V750.5z         M1652.4,751.2c0,0,0,0.2,0.1,0.2c0,0,0.1,0.2,0.2,0.2c0.1,0.1,0.3,0.2,0.3,0.2l0.4-0.6c0,0-0.1,0-0.1-0.1c0,0-0.1,0-0.1-0.1l0,0       l0-0.2l0-0.2h0c0,0,0,0,0,0c0,0,0,0,0,0l0,0h-0.6L1652.4,751.2C1652.4,751.2,1652.4,751.2,1652.4,751.2z M1653.8,752.5l0.4-0.6       l-0.5-0.3l-0.4,0.6L1653.8,752.5z M1679.2,768.2l0.4-0.6l-0.6-0.3l-0.4,0.6L1679.2,768.2z M1680.2,768.8       C1680.2,768.8,1680.3,768.8,1680.2,768.8c0.1-0.1,0.2-0.1,0.3-0.1c0.1-0.1,0.3-0.2,0.3-0.2l-0.3-0.6c0,0-0.1,0-0.1,0.1       c0,0-0.1,0-0.1,0l0,0l0,0l0,0l0,0c0,0,0,0,0,0c0,0,0,0,0,0l-0.2-0.1l-0.4,0.6L1680.2,768.8       C1680.2,768.8,1680.2,768.8,1680.2,768.8z M1681.8,767.9l-0.3-0.6l-0.6,0.3l0.3,0.6L1681.8,767.9z M1709.3,752.2l-0.3-0.6       l-0.6,0.3l0.3,0.6L1709.3,752.2z M1710.2,751.6C1710.2,751.5,1710.2,751.5,1710.2,751.6c0-0.1,0-0.2,0-0.3c0-0.2-0.1-0.3-0.1-0.3       l-0.8,0c0,0,0,0.1,0,0.1c0,0,0,0.1,0,0.1v0v0v0l0.1,0c0,0,0.1,0,0.1,0c0,0,0,0,0,0l-0.2,0.1l0.4,0.6L1710.2,751.6       C1710.3,751.6,1710.2,751.6,1710.2,751.6z M1710.3,749.8l-0.7,0l0,0.6l0.7,0L1710.3,749.8z M1710.3,718.3l-0.7,0l0,0.6l0.7,0       L1710.3,718.3z M1710.2,717.4C1710.2,717.4,1710.2,717.3,1710.2,717.4c-0.1-0.1-0.2-0.2-0.2-0.2c-0.1-0.1-0.3-0.2-0.3-0.2       l-0.4,0.5c0,0,0.1,0,0.1,0.1c0,0,0.1,0,0.1,0l0,0l0,0.1l0,0.1h0c0,0,0,0,0,0c0,0-0.2,0-0.2,0v0.1l0.8,0.1L1710.2,717.4       C1710.3,717.4,1710.3,717.4,1710.2,717.4z M1708.8,716.3l-0.4,0.6l0.5,0.3l0.4-0.6L1708.8,716.3z M1683.2,699.5l-0.4,0.6l0.6,0.4       l0.4-0.6L1683.2,699.5z M1682.1,698.9C1682.1,698.9,1682,698.9,1682.1,698.9c-0.1,0.1-0.2,0.1-0.3,0.2c-0.2,0.1-0.3,0.2-0.3,0.2       l0.3,0.6c0,0,0.1,0,0.1-0.1c0,0,0.1,0,0.1,0l0,0l0,0l0,0l0,0c0,0,0,0,0,0c0,0,0,0,0,0l0.2,0.2l0.4-0.6L1682.1,698.9       C1682.1,698.8,1682.1,698.8,1682.1,698.9z M1680.4,699.9l0.3,0.6l0.6-0.4l-0.3-0.6L1680.4,699.9z", :fill "url(#SVGID_129_)"}]]
    [:g {:id "g5817"}
     [:g {:id "g5787", :opacity "0.25"}
      [:linearGradient {:gradientTransform "matrix(1 0 0 -1 0 1200)", :y2 "368.5924", :x2 "1522.384", :y1 "354.1784", :x1 "1495.5022", :gradientUnits "userSpaceOnUse", :id "SVGID_130_"}
       [:stop {:id "stop5750", :style "stop-color:#494949", :offset "0"}]
       [:stop {:id "stop5752", :style "stop-color:#525252", :offset "0.2255"}]
       [:stop {:id "stop5754", :style "stop-color:#6A6A6A", :offset "0.593"}]
       [:stop {:id "stop5756", :style "stop-color:#8C8C8C", :offset "1"}]]
      [:polygon {:id "polygon5759", :points "1496,813.7 1496,846.8 1523,863 1523,831.7     ", :fill "url(#SVGID_130_)"}]
      [:linearGradient {:gradientTransform "matrix(1 0 0 -1 0 1200)", :y2 "350.217", :x2 "1548.967", :y1 "372.25", :x1 "1526.934", :gradientUnits "userSpaceOnUse", :id "SVGID_131_"}
       [:stop {:id "stop5761", :style "stop-color:#BFBFBF", :offset "0"}]
       [:stop {:id "stop5763", :style "stop-color:#A2A2A2", :offset "0.219"}]
       [:stop {:id "stop5765", :style "stop-color:#7B7B7B", :offset "0.5607"}]
       [:stop {:id "stop5767", :style "stop-color:#636363", :offset "0.833"}]
       [:stop {:id "stop5769", :style "stop-color:#5A5A5A", :offset "1"}]]
      [:polygon {:id "polygon5772", :points "1523,831.7 1523,863 1552,846.8 1552,813.7     ", :fill "url(#SVGID_131_)"}]
      [:linearGradient {:gradientTransform "matrix(1 0 0 -1 0 1200)", :y2 "400.8659", :x2 "1533.5178", :y1 "373.5625", :x1 "1516.0768", :gradientUnits "userSpaceOnUse", :id "SVGID_132_"}
       [:stop {:id "stop5774", :style "stop-color:#A6A6A6", :offset "0"}]
       [:stop {:id "stop5776", :style "stop-color:#A2A2A2", :offset "3.360000e-02"}]
       [:stop {:id "stop5778", :style "stop-color:#7B7B7B", :offset "0.4566"}]
       [:stop {:id "stop5780", :style "stop-color:#636363", :offset "0.7934"}]
       [:stop {:id "stop5782", :style "stop-color:#5A5A5A", :offset "1"}]]
      [:polygon {:id "polygon5785", :points "1496.6,813.7 1523.1,831.7 1551.9,813.7 1525,796.3     ", :fill "url(#SVGID_132_)"}]]
     [:linearGradient {:gradientTransform "matrix(1 0 0 -1 0 1200)", :y2 "387.866", :x2 "1495.8374", :y1 "351.7885", :x1 "1552.9064", :gradientUnits "userSpaceOnUse", :id "SVGID_133_"}
      [:stop {:id "stop5789", :style "stop-color:#3A3C4D", :offset "0"}]
      [:stop {:id "stop5791", :style "stop-color:#3D3F4E", :offset "0.42"}]
      [:stop {:id "stop5793", :style "stop-color:#464752", :offset "0.7058"}]
      [:stop {:id "stop5795", :style "stop-color:#555557", :offset "0.9509"}]
      [:stop {:id "stop5797", :style "stop-color:#595959", :offset "1"}]]
     [:path {:id "path5800", :d "M1518.6,799.4l-0.3-0.6l1-0.6l0.3,0.6L1518.6,799.4z M1521.3,797.7l-0.3-0.6l-1,0.6l0.3,0.6       L1521.3,797.7z M1523,796.7l-0.3-0.6l-1,0.6l0.3,0.6L1523,796.7z M1514.3,801.9l-0.3-0.6l-1,0.6l0.3,0.6L1514.3,801.9z         M1516.1,800.9l-0.3-0.6l-1,0.6l0.3,0.6L1516.1,800.9z M1517.8,799.8l-0.3-0.6l-1,0.6l0.3,0.6L1517.8,799.8z M1509.1,805.1       l-0.3-0.6l-1,0.6l0.3,0.6L1509.1,805.1z M1510.9,804l-0.3-0.6l-1,0.6l0.3,0.6L1510.9,804z M1512.6,803l-0.3-0.6l-1,0.6l0.3,0.6       L1512.6,803z M1503.9,808.3l-0.3-0.6l-1,0.6l0.3,0.6L1503.9,808.3z M1505.6,807.2l-0.3-0.6l-1,0.6l0.3,0.6L1505.6,807.2z         M1507.4,806.2l-0.3-0.6l-1,0.6l0.3,0.6L1507.4,806.2z M1498.7,811.4l-0.3-0.6l-1,0.6l0.3,0.6L1498.7,811.4z M1500.4,810.4       l-0.3-0.6l-1,0.6l0.3,0.6L1500.4,810.4z M1502.2,809.3l-0.3-0.6l-1,0.6l0.3,0.6L1502.2,809.3z M1496.3,819.4h-0.9v1.3h0.9V819.4z         M1496.3,817.7h-0.9v0.9h0.9V817.7z M1496.3,815.5h-0.9v0.9h0.9V815.5z M1496.3,825.8h-0.9v0.9h0.9V825.8z M1496.3,823.6h-0.9       v1.3h0.9V823.6z M1496.3,821.5h-0.9v0.9h0.9V821.5z M1496.3,831.8h-0.9v0.9h0.9V831.8z M1496.3,829.6h-0.9v1.3h0.9V829.6z         M1496.3,827.9h-0.9v0.9h0.9V827.9z M1496.3,837.8h-0.9v1.3h0.9V837.8z M1496.3,835.6h-0.9v1.3h0.9V835.6z M1496.3,833.5h-0.9       v1.3h0.9V833.5z M1496.3,843.8h-0.9v1.3h0.9V843.8z M1496.3,842.1h-0.9v0.9h0.9V842.1z M1496.3,839.9h-0.9v1.3h0.9V839.9z         M1500.9,850.5l-0.4,0.6l0.9,0.6l0.4-0.6L1500.9,850.5z M1499.3,849.4l-0.4,0.6l0.9,0.6l0.4-0.6L1499.3,849.4z M1497.7,848.4       l-0.4,0.6l0.9,0.6l0.4-0.6L1497.7,848.4z M1505.8,853.5l-0.4,0.6l0.9,0.6l0.4-0.6L1505.8,853.5z M1504.2,852.5l-0.4,0.6l0.9,0.6       l0.4-0.6L1504.2,852.5z M1502.6,851.5l-0.4,0.6l0.9,0.6l0.4-0.6L1502.6,851.5z M1510.7,856.5l-0.4,0.6l0.9,0.6l0.4-0.6       L1510.7,856.5z M1509,855.5l-0.4,0.6l0.9,0.6l0.4-0.6L1509,855.5z M1507.4,854.5l-0.4,0.6l0.9,0.6l0.4-0.6L1507.4,854.5z         M1515.5,859.5l-0.4,0.6l0.9,0.6l0.4-0.6L1515.5,859.5z M1513.9,858.5l-0.4,0.6l0.9,0.6l0.4-0.6L1513.9,858.5z M1512.3,857.5       l-0.4,0.6l0.9,0.6l0.4-0.6L1512.3,857.5z M1520.4,862.5l-0.4,0.6l0.9,0.6l0.4-0.6L1520.4,862.5z M1518.8,861.5l-0.4,0.6l0.9,0.6       l0.4-0.6L1518.8,861.5z M1517.2,860.5l-0.4,0.6l0.9,0.6l0.4-0.6L1517.2,860.5z M1528.7,861.1l0.3,0.6l1-0.6l-0.3-0.6       L1528.7,861.1z M1527,862.1l0.3,0.6l1-0.6l-0.3-0.6L1527,862.1z M1525.2,863.1l0.3,0.6l1-0.6l-0.3-0.6L1525.2,863.1z M1534,858.1       l0.3,0.6l1-0.6l-0.3-0.6L1534,858.1z M1532.3,859.1l0.3,0.6l1-0.6l-0.3-0.6L1532.3,859.1z M1530.5,860.1l0.3,0.6l1-0.6l-0.3-0.6       L1530.5,860.1z M1539.3,855l0.3,0.6l1-0.6l-0.3-0.6L1539.3,855z M1537.6,856l0.3,0.6l1-0.6l-0.3-0.6L1537.6,856z M1535.8,857       l0.3,0.6l1-0.6l-0.3-0.6L1535.8,857z M1544.6,852l0.3,0.6l1-0.6l-0.3-0.6L1544.6,852z M1542.8,853l0.3,0.6l1-0.6l-0.3-0.6       L1542.8,853z M1541.1,854l0.3,0.6l1-0.6l-0.3-0.6L1541.1,854z M1549.9,849l0.3,0.6l1-0.6l-0.3-0.6L1549.9,849z M1548.1,850       l0.3,0.6l1-0.6l-0.3-0.6L1548.1,850z M1546.4,851l0.3,0.6l1-0.6l-0.3-0.6L1546.4,851z M1552.8,841l0.7,0l0-1.1l-0.7,0L1552.8,841       z M1552.8,843l0.7,0l0-1.1l-0.7,0L1552.8,843z M1552.8,845l0.7,0l0-1.1l-0.7,0L1552.8,845z M1552.8,834.9l0.7,0l0-1.1l-0.7,0       L1552.8,834.9z M1552.8,837l0.7,0l0-1.1l-0.7,0L1552.8,837z M1552.8,839l0.7,0l0-1.1l-0.7,0L1552.8,839z M1552.8,828.9l0.7,0       l0-1.1l-0.7,0L1552.8,828.9z M1552.8,830.9l0.7,0l0-1.1l-0.7,0L1552.8,830.9z M1552.8,832.9l0.7,0l0-1.1l-0.7,0L1552.8,832.9z         M1552.8,822.8l0.7,0l0-1.1l-0.7,0L1552.8,822.8z M1552.8,824.8l0.7,0l0-1.1l-0.7,0L1552.8,824.8z M1552.8,826.8l0.7,0l0-1.1       l-0.7,0L1552.8,826.8z M1552.8,816.8l0.7,0l0-1.1l-0.7,0L1552.8,816.8z M1552.8,818.8l0.7,0l0-1.1l-0.7,0L1552.8,818.8z         M1552.8,820.8l0.7,0l0-1.1l-0.7,0L1552.8,820.8z M1547.7,810.2l0.4-0.6l-0.9-0.6l-0.4,0.6L1547.7,810.2z M1549.4,811.3l0.4-0.6       l-0.9-0.6l-0.4,0.6L1549.4,811.3z M1551,812.3l0.4-0.6l-0.9-0.6l-0.4,0.6L1551,812.3z M1542.8,807l0.4-0.6l-0.9-0.6l-0.4,0.6       L1542.8,807z M1544.4,808.1l0.4-0.6l-0.9-0.6l-0.4,0.6L1544.4,808.1z M1546.1,809.1l0.4-0.6l-0.9-0.6l-0.4,0.6L1546.1,809.1z         M1537.8,803.8l0.4-0.6l-0.9-0.6l-0.4,0.6L1537.8,803.8z M1539.5,804.8l0.4-0.6l-0.9-0.6l-0.4,0.6L1539.5,804.8z M1541.1,805.9       l0.4-0.6l-0.9-0.6l-0.4,0.6L1541.1,805.9z M1532.9,800.6l0.4-0.6l-0.9-0.6l-0.4,0.6L1532.9,800.6z M1534.6,801.6l0.4-0.6       l-0.9-0.6l-0.4,0.6L1534.6,801.6z M1536.2,802.7l0.4-0.6l-0.9-0.6l-0.4,0.6L1536.2,802.7z M1528,797.3l0.4-0.6l-0.9-0.6l-0.4,0.6       L1528,797.3z M1529.6,798.4l0.4-0.6l-0.9-0.6l-0.4,0.6L1529.6,798.4z M1531.3,799.5l0.4-0.6l-0.9-0.6l-0.4,0.6L1531.3,799.5z         M1496.3,812.3l0.3,0.6l0.5-0.3l-0.3-0.6L1496.3,812.3z M1495.4,812.9C1495.4,812.9,1495.4,812.9,1495.4,812.9c0,0.1,0,0.2,0,0.3       c0,0.2,0,0.6,0,0.6h0.9c0,0,0-0.4,0-0.5c0,0,0-0.1,0-0.1v0v0v0l-0.1,0c0,0-0.1,0-0.1,0c0,0,0,0,0,0l0.2-0.1l-0.4-0.6       L1495.4,812.9C1495.4,812.8,1495.4,812.8,1495.4,812.9z M1495.4,814.6h0.7V814h-0.7V814.6z M1495.3,846.5h0.7v-0.6h-0.7V846.5z         M1495.4,847.2c0,0,0,0.2,0.1,0.2c0,0,0.1,0.2,0.2,0.2c0.1,0.1,0.3,0.2,0.3,0.2l0.4-0.6c0,0-0.1,0-0.1-0.1c0,0-0.1,0-0.1-0.1l0,0       l0-0.2l0-0.2h0c0,0,0,0,0,0c0,0,0,0,0,0l0,0h-0.6L1495.4,847.2C1495.4,847.2,1495.4,847.2,1495.4,847.2z M1496.8,848.5l0.4-0.6       l-0.5-0.3l-0.4,0.6L1496.8,848.5z M1522.2,864.2l0.4-0.6l-0.6-0.3l-0.4,0.6L1522.2,864.2z M1523.2,864.8       C1523.2,864.8,1523.3,864.8,1523.2,864.8c0.1-0.1,0.2-0.1,0.3-0.1c0.1-0.1,0.3-0.2,0.3-0.2l-0.3-0.6c0,0-0.1,0-0.1,0.1       c0,0-0.1,0-0.1,0l0,0l0,0l0,0l0,0c0,0,0,0,0,0c0,0,0,0,0,0l-0.2-0.1l-0.4,0.6L1523.2,864.8       C1523.2,864.8,1523.2,864.8,1523.2,864.8z M1524.8,863.9l-0.3-0.6l-0.6,0.3l0.3,0.6L1524.8,863.9z M1552.3,848.2l-0.3-0.6       l-0.6,0.3l0.3,0.6L1552.3,848.2z M1553.2,847.6C1553.2,847.5,1553.2,847.5,1553.2,847.6c0-0.1,0-0.2,0-0.3c0-0.2-0.1-0.3-0.1-0.3       l-0.8,0c0,0,0,0.1,0,0.1c0,0,0,0.1,0,0.1v0v0v0l0.1,0c0,0,0.1,0,0.1,0c0,0,0,0,0,0l-0.2,0.1l0.4,0.6L1553.2,847.6       C1553.3,847.6,1553.2,847.6,1553.2,847.6z M1553.3,845.8l-0.7,0l0,0.6l0.7,0L1553.3,845.8z M1553.3,814.3l-0.7,0l0,0.6l0.7,0       L1553.3,814.3z M1553.2,813.4C1553.2,813.4,1553.2,813.3,1553.2,813.4c-0.1-0.1-0.2-0.2-0.2-0.2c-0.1-0.1-0.3-0.2-0.3-0.2       l-0.4,0.5c0,0,0.1,0,0.1,0.1c0,0,0.1,0,0.1,0l0,0l0,0.1l0,0.1h0c0,0,0,0,0,0c0,0-0.2,0-0.2,0v0.1l0.8,0.1L1553.2,813.4       C1553.3,813.4,1553.3,813.4,1553.2,813.4z M1551.8,812.3l-0.4,0.6l0.5,0.3l0.4-0.6L1551.8,812.3z M1526.2,795.5l-0.4,0.6l0.6,0.4       l0.4-0.6L1526.2,795.5z M1525.1,794.9C1525.1,794.9,1525,794.9,1525.1,794.9c-0.1,0.1-0.2,0.1-0.3,0.2c-0.2,0.1-0.3,0.2-0.3,0.2       l0.3,0.6c0,0,0.1,0,0.1-0.1c0,0,0.1,0,0.1,0l0,0l0,0l0,0l0,0c0,0,0,0,0,0c0,0,0,0,0,0l0.2,0.2l0.4-0.6L1525.1,794.9       C1525.1,794.8,1525.1,794.8,1525.1,794.9z M1523.4,795.9l0.3,0.6l0.6-0.4l-0.3-0.6L1523.4,795.9z", :fill "url(#SVGID_133_)"}]
     [:linearGradient {:gradientTransform "matrix(1 0 0 -1 0 1200)", :y2 "420.8045", :x2 "1662.411", :y1 "420.8045", :x1 "1553.097", :gradientUnits "userSpaceOnUse", :id "SVGID_134_"}
      [:stop {:id "stop5802", :style "stop-color:#BFBFBF", :offset "0"}]
      [:stop {:id "stop5804", :style "stop-color:#AAAAAE", :offset "0.1122"}]
      [:stop {:id "stop5806", :style "stop-color:#767884", :offset "0.4064"}]
      [:stop {:id "stop5808", :style "stop-color:#515366", :offset "0.6631"}]
      [:stop {:id "stop5810", :style "stop-color:#3A3D54", :offset "0.8695"}]
      [:stop {:id "stop5812", :style "stop-color:#32354D", :offset "1"}]]
     [:path {:id "path5815", :d "M1591.9,790.2l-0.8-1.2l2.8-1.8l0.8,1.2L1591.9,790.2z M1590.5,791l-0.8-1.2l-2.8,1.8l0.8,1.2       L1590.5,791z M1586.3,793.7l-0.8-1.2l-2.8,1.8l0.8,1.2L1586.3,793.7z M1582.1,796.4l-0.8-1.2l-2.8,1.8l0.8,1.2L1582.1,796.4z         M1607.4,780.4l-0.8-1.2l-2.8,1.8l0.8,1.2L1607.4,780.4z M1603.2,783l-0.8-1.2l-2.8,1.8l0.8,1.2L1603.2,783z M1599,785.7       l-0.8-1.2l-2.8,1.8l0.8,1.2L1599,785.7z M1577.9,799.1l-0.8-1.2l-2.8,1.8l0.8,1.2L1577.9,799.1z M1573.8,801.8l-0.8-1.2l-2.8,1.8       l0.8,1.2L1573.8,801.8z M1569.6,804.4l-0.8-1.2l-2.8,1.8l0.8,1.2L1569.6,804.4z M1636.7,761.4l-0.8-1.2l-2.8,1.8l0.8,1.2       L1636.7,761.4z M1632.5,764l-0.8-1.2l-2.8,1.8l0.8,1.2L1632.5,764z M1628.3,766.7l-0.8-1.2l-2.8,1.8l0.8,1.2L1628.3,766.7z         M1624.1,769.4l-0.8-1.2l-2.8,1.8l0.8,1.2L1624.1,769.4z M1649.4,753.4l-0.8-1.2l-2.8,1.8l0.8,1.2L1649.4,753.4z M1645.2,756       l-0.8-1.2l-2.8,1.8l0.8,1.2L1645.2,756z M1641,758.7l-0.8-1.2l-2.8,1.8l0.8,1.2L1641,758.7z M1662.4,745.4l-0.8-1.2l-2.8,1.8       l0.8,1.2L1662.4,745.4z M1658.2,748l-0.8-1.2l-2.8,1.8l0.8,1.2L1658.2,748z M1654,750.7l-0.8-1.2l-2.8,1.8l0.8,1.2L1654,750.7z         M1619.9,772.1l-0.8-1.2l-2.8,1.8l0.8,1.2L1619.9,772.1z M1615.8,774.8l-0.8-1.2l-2.8,1.8l0.8,1.2L1615.8,774.8z M1611.6,777.4       l-0.8-1.2l-2.8,1.8l0.8,1.2L1611.6,777.4z M1565.4,807.1l-0.8-1.2l-2.8,1.8l0.8,1.2L1565.4,807.1z M1561.2,809.8l-0.8-1.2       l-2.8,1.8l0.8,1.2L1561.2,809.8z M1556.7,812.5l-0.8-1.2l-2.8,1.8l0.8,1.2L1556.7,812.5z", :fill "url(#SVGID_134_)"}]]
    [:g {:id "g5886"}
     [:g {:id "g5856", :opacity "0.15"}
      [:linearGradient {:gradientTransform "matrix(1 0 0 -1 0 1200)", :y2 "271.5827", :x2 "1363.3896", :y1 "257.1895", :x1 "1336.4972", :gradientUnits "userSpaceOnUse", :id "SVGID_135_"}
       [:stop {:id "stop5819", :style "stop-color:#494949", :offset "0"}]
       [:stop {:id "stop5821", :style "stop-color:#525252", :offset "0.2255"}]
       [:stop {:id "stop5823", :style "stop-color:#6A6A6A", :offset "0.593"}]
       [:stop {:id "stop5825", :style "stop-color:#8C8C8C", :offset "1"}]]
      [:polygon {:id "polygon5828", :points "1337,910.7 1337,943.8 1364,960 1364,928.7     ", :fill "url(#SVGID_135_)"}]
      [:linearGradient {:gradientTransform "matrix(1 0 0 -1 0 1200)", :y2 "253.217", :x2 "1389.967", :y1 "275.25", :x1 "1367.9341", :gradientUnits "userSpaceOnUse", :id "SVGID_136_"}
       [:stop {:id "stop5830", :style "stop-color:#BFBFBF", :offset "0"}]
       [:stop {:id "stop5832", :style "stop-color:#A2A2A2", :offset "0.219"}]
       [:stop {:id "stop5834", :style "stop-color:#7B7B7B", :offset "0.5607"}]
       [:stop {:id "stop5836", :style "stop-color:#636363", :offset "0.833"}]
       [:stop {:id "stop5838", :style "stop-color:#5A5A5A", :offset "1"}]]
      [:polygon {:id "polygon5841", :points "1364,928.7 1364,960 1393,943.8 1393,910.7     ", :fill "url(#SVGID_136_)"}]
      [:linearGradient {:gradientTransform "matrix(1 0 0 -1 0 1200)", :y2 "303.8659", :x2 "1374.5178", :y1 "276.5625", :x1 "1357.0768", :gradientUnits "userSpaceOnUse", :id "SVGID_137_"}
       [:stop {:id "stop5843", :style "stop-color:#A6A6A6", :offset "0"}]
       [:stop {:id "stop5845", :style "stop-color:#A2A2A2", :offset "3.360000e-02"}]
       [:stop {:id "stop5847", :style "stop-color:#7B7B7B", :offset "0.4566"}]
       [:stop {:id "stop5849", :style "stop-color:#636363", :offset "0.7934"}]
       [:stop {:id "stop5851", :style "stop-color:#5A5A5A", :offset "1"}]]
      [:polygon {:id "polygon5854", :points "1337.6,910.7 1364.1,928.7 1392.9,910.7 1366,893.3     ", :fill "url(#SVGID_137_)"}]]
     [:linearGradient {:gradientTransform "matrix(1 0 0 -1 0 1200)", :y2 "290.866", :x2 "1336.8374", :y1 "254.7885", :x1 "1393.9064", :gradientUnits "userSpaceOnUse", :id "SVGID_138_"}
      [:stop {:id "stop5858", :style "stop-color:#3A3C4D", :offset "0"}]
      [:stop {:id "stop5860", :style "stop-color:#3D3F4E", :offset "0.42"}]
      [:stop {:id "stop5862", :style "stop-color:#464752", :offset "0.7058"}]
      [:stop {:id "stop5864", :style "stop-color:#555557", :offset "0.9509"}]
      [:stop {:id "stop5866", :style "stop-color:#595959", :offset "1"}]]
     [:path {:id "path5869", :d "M1359.6,896.4l-0.3-0.6l1-0.6l0.3,0.6L1359.6,896.4z M1362.3,894.7l-0.3-0.6l-1,0.6l0.3,0.6       L1362.3,894.7z M1364,893.7l-0.3-0.6l-1,0.6l0.3,0.6L1364,893.7z M1355.3,898.9l-0.3-0.6l-1,0.6l0.3,0.6L1355.3,898.9z         M1357.1,897.9l-0.3-0.6l-1,0.6l0.3,0.6L1357.1,897.9z M1358.8,896.8l-0.3-0.6l-1,0.6l0.3,0.6L1358.8,896.8z M1350.1,902.1       l-0.3-0.6l-1,0.6l0.3,0.6L1350.1,902.1z M1351.9,901l-0.3-0.6l-1,0.6l0.3,0.6L1351.9,901z M1353.6,900l-0.3-0.6l-1,0.6l0.3,0.6       L1353.6,900z M1344.9,905.3l-0.3-0.6l-1,0.6l0.3,0.6L1344.9,905.3z M1346.6,904.2l-0.3-0.6l-1,0.6l0.3,0.6L1346.6,904.2z         M1348.4,903.2l-0.3-0.6l-1,0.6l0.3,0.6L1348.4,903.2z M1339.7,908.4l-0.3-0.6l-1,0.6l0.3,0.6L1339.7,908.4z M1341.4,907.4       l-0.3-0.6l-1,0.6l0.3,0.6L1341.4,907.4z M1343.2,906.3l-0.3-0.6l-1,0.6l0.3,0.6L1343.2,906.3z M1337.3,916.4h-0.9v1.3h0.9V916.4z         M1337.3,914.7h-0.9v0.9h0.9V914.7z M1337.3,912.5h-0.9v0.9h0.9V912.5z M1337.3,922.8h-0.9v0.9h0.9V922.8z M1337.3,920.6h-0.9       v1.3h0.9V920.6z M1337.3,918.5h-0.9v0.9h0.9V918.5z M1337.3,928.8h-0.9v0.9h0.9V928.8z M1337.3,926.6h-0.9v1.3h0.9V926.6z         M1337.3,924.9h-0.9v0.9h0.9V924.9z M1337.3,934.8h-0.9v1.3h0.9V934.8z M1337.3,932.6h-0.9v1.3h0.9V932.6z M1337.3,930.5h-0.9       v1.3h0.9V930.5z M1337.3,940.8h-0.9v1.3h0.9V940.8z M1337.3,939.1h-0.9v0.9h0.9V939.1z M1337.3,936.9h-0.9v1.3h0.9V936.9z         M1341.9,947.5l-0.4,0.6l0.9,0.6l0.4-0.6L1341.9,947.5z M1340.3,946.4l-0.4,0.6l0.9,0.6l0.4-0.6L1340.3,946.4z M1338.7,945.4       l-0.4,0.6l0.9,0.6l0.4-0.6L1338.7,945.4z M1346.8,950.5l-0.4,0.6l0.9,0.6l0.4-0.6L1346.8,950.5z M1345.2,949.5l-0.4,0.6l0.9,0.6       l0.4-0.6L1345.2,949.5z M1343.6,948.5l-0.4,0.6l0.9,0.6l0.4-0.6L1343.6,948.5z M1351.7,953.5l-0.4,0.6l0.9,0.6l0.4-0.6       L1351.7,953.5z M1350,952.5l-0.4,0.6l0.9,0.6l0.4-0.6L1350,952.5z M1348.4,951.5l-0.4,0.6l0.9,0.6l0.4-0.6L1348.4,951.5z         M1356.5,956.5l-0.4,0.6l0.9,0.6l0.4-0.6L1356.5,956.5z M1354.9,955.5l-0.4,0.6l0.9,0.6l0.4-0.6L1354.9,955.5z M1353.3,954.5       l-0.4,0.6l0.9,0.6l0.4-0.6L1353.3,954.5z M1361.4,959.5l-0.4,0.6l0.9,0.6l0.4-0.6L1361.4,959.5z M1359.8,958.5l-0.4,0.6l0.9,0.6       l0.4-0.6L1359.8,958.5z M1358.2,957.5l-0.4,0.6l0.9,0.6l0.4-0.6L1358.2,957.5z M1369.7,958.1l0.3,0.6l1-0.6l-0.3-0.6       L1369.7,958.1z M1368,959.1l0.3,0.6l1-0.6l-0.3-0.6L1368,959.1z M1366.2,960.1l0.3,0.6l1-0.6l-0.3-0.6L1366.2,960.1z M1375,955.1       l0.3,0.6l1-0.6l-0.3-0.6L1375,955.1z M1373.3,956.1l0.3,0.6l1-0.6l-0.3-0.6L1373.3,956.1z M1371.5,957.1l0.3,0.6l1-0.6l-0.3-0.6       L1371.5,957.1z M1380.3,952l0.3,0.6l1-0.6l-0.3-0.6L1380.3,952z M1378.6,953l0.3,0.6l1-0.6l-0.3-0.6L1378.6,953z M1376.8,954       l0.3,0.6l1-0.6l-0.3-0.6L1376.8,954z M1385.6,949l0.3,0.6l1-0.6l-0.3-0.6L1385.6,949z M1383.8,950l0.3,0.6l1-0.6l-0.3-0.6       L1383.8,950z M1382.1,951l0.3,0.6l1-0.6l-0.3-0.6L1382.1,951z M1390.9,946l0.3,0.6l1-0.6l-0.3-0.6L1390.9,946z M1389.1,947       l0.3,0.6l1-0.6l-0.3-0.6L1389.1,947z M1387.4,948l0.3,0.6l1-0.6l-0.3-0.6L1387.4,948z M1393.8,938l0.7,0l0-1.1l-0.7,0L1393.8,938       z M1393.8,940l0.7,0l0-1.1l-0.7,0L1393.8,940z M1393.8,942l0.7,0l0-1.1l-0.7,0L1393.8,942z M1393.8,931.9l0.7,0l0-1.1l-0.7,0       L1393.8,931.9z M1393.8,934l0.7,0l0-1.1l-0.7,0L1393.8,934z M1393.8,936l0.7,0l0-1.1l-0.7,0L1393.8,936z M1393.8,925.9l0.7,0       l0-1.1l-0.7,0L1393.8,925.9z M1393.8,927.9l0.7,0l0-1.1l-0.7,0L1393.8,927.9z M1393.8,929.9l0.7,0l0-1.1l-0.7,0L1393.8,929.9z         M1393.8,919.8l0.7,0l0-1.1l-0.7,0L1393.8,919.8z M1393.8,921.8l0.7,0l0-1.1l-0.7,0L1393.8,921.8z M1393.8,923.8l0.7,0l0-1.1       l-0.7,0L1393.8,923.8z M1393.8,913.8l0.7,0l0-1.1l-0.7,0L1393.8,913.8z M1393.8,915.8l0.7,0l0-1.1l-0.7,0L1393.8,915.8z         M1393.8,917.8l0.7,0l0-1.1l-0.7,0L1393.8,917.8z M1388.7,907.2l0.4-0.6l-0.9-0.6l-0.4,0.6L1388.7,907.2z M1390.4,908.3l0.4-0.6       l-0.9-0.6l-0.4,0.6L1390.4,908.3z M1392,909.3l0.4-0.6l-0.9-0.6l-0.4,0.6L1392,909.3z M1383.8,904l0.4-0.6l-0.9-0.6l-0.4,0.6       L1383.8,904z M1385.4,905.1l0.4-0.6l-0.9-0.6l-0.4,0.6L1385.4,905.1z M1387.1,906.1l0.4-0.6l-0.9-0.6l-0.4,0.6L1387.1,906.1z         M1378.8,900.8l0.4-0.6l-0.9-0.6l-0.4,0.6L1378.8,900.8z M1380.5,901.8l0.4-0.6l-0.9-0.6l-0.4,0.6L1380.5,901.8z M1382.1,902.9       l0.4-0.6l-0.9-0.6l-0.4,0.6L1382.1,902.9z M1373.9,897.6l0.4-0.6l-0.9-0.6l-0.4,0.6L1373.9,897.6z M1375.6,898.6l0.4-0.6       l-0.9-0.6l-0.4,0.6L1375.6,898.6z M1377.2,899.7l0.4-0.6l-0.9-0.6l-0.4,0.6L1377.2,899.7z M1369,894.3l0.4-0.6l-0.9-0.6l-0.4,0.6       L1369,894.3z M1370.6,895.4l0.4-0.6l-0.9-0.6l-0.4,0.6L1370.6,895.4z M1372.3,896.5l0.4-0.6l-0.9-0.6l-0.4,0.6L1372.3,896.5z         M1337.3,909.3l0.3,0.6l0.5-0.3l-0.3-0.6L1337.3,909.3z M1336.4,909.9C1336.4,909.9,1336.4,909.9,1336.4,909.9c0,0.1,0,0.2,0,0.3       c0,0.2,0,0.6,0,0.6h0.9c0,0,0-0.4,0-0.5c0,0,0-0.1,0-0.1v0v0v0l-0.1,0c0,0-0.1,0-0.1,0c0,0,0,0,0,0l0.2-0.1l-0.4-0.6       L1336.4,909.9C1336.4,909.8,1336.4,909.8,1336.4,909.9z M1336.4,911.6h0.7V911h-0.7V911.6z M1336.3,943.5h0.7v-0.6h-0.7V943.5z         M1336.4,944.2c0,0,0,0.2,0.1,0.2c0,0,0.1,0.2,0.2,0.2c0.1,0.1,0.3,0.2,0.3,0.2l0.4-0.6c0,0-0.1,0-0.1-0.1c0,0-0.1,0-0.1-0.1l0,0       l0-0.2l0-0.2h0c0,0,0,0,0,0c0,0,0,0,0,0l0,0h-0.6L1336.4,944.2C1336.4,944.2,1336.4,944.2,1336.4,944.2z M1337.8,945.5l0.4-0.6       l-0.5-0.3l-0.4,0.6L1337.8,945.5z M1363.2,961.2l0.4-0.6l-0.6-0.3l-0.4,0.6L1363.2,961.2z M1364.2,961.8       C1364.2,961.8,1364.3,961.8,1364.2,961.8c0.1-0.1,0.2-0.1,0.3-0.1c0.1-0.1,0.3-0.2,0.3-0.2l-0.3-0.6c0,0-0.1,0-0.1,0.1       c0,0-0.1,0-0.1,0l0,0l0,0l0,0l0,0c0,0,0,0,0,0c0,0,0,0,0,0l-0.2-0.1l-0.4,0.6L1364.2,961.8       C1364.2,961.8,1364.2,961.8,1364.2,961.8z M1365.8,960.9l-0.3-0.6l-0.6,0.3l0.3,0.6L1365.8,960.9z M1393.3,945.2l-0.3-0.6       l-0.6,0.3l0.3,0.6L1393.3,945.2z M1394.2,944.6C1394.2,944.5,1394.2,944.5,1394.2,944.6c0-0.1,0-0.2,0-0.3c0-0.2-0.1-0.3-0.1-0.3       l-0.8,0c0,0,0,0.1,0,0.1c0,0,0,0.1,0,0.1v0v0v0l0.1,0c0,0,0.1,0,0.1,0c0,0,0,0,0,0l-0.2,0.1l0.4,0.6L1394.2,944.6       C1394.3,944.6,1394.2,944.6,1394.2,944.6z M1394.3,942.8l-0.7,0l0,0.6l0.7,0L1394.3,942.8z M1394.3,911.3l-0.7,0l0,0.6l0.7,0       L1394.3,911.3z M1394.2,910.4C1394.2,910.4,1394.2,910.3,1394.2,910.4c-0.1-0.1-0.2-0.2-0.2-0.2c-0.1-0.1-0.3-0.2-0.3-0.2       l-0.4,0.5c0,0,0.1,0,0.1,0.1c0,0,0.1,0,0.1,0l0,0l0,0.1l0,0.1h0c0,0,0,0,0,0c0,0-0.2,0-0.2,0v0.1l0.8,0.1L1394.2,910.4       C1394.3,910.4,1394.3,910.4,1394.2,910.4z M1392.8,909.3l-0.4,0.6l0.5,0.3l0.4-0.6L1392.8,909.3z M1367.2,892.5l-0.4,0.6l0.6,0.4       l0.4-0.6L1367.2,892.5z M1366.1,891.9C1366.1,891.9,1366,891.9,1366.1,891.9c-0.1,0.1-0.2,0.1-0.3,0.2c-0.2,0.1-0.3,0.2-0.3,0.2       l0.3,0.6c0,0,0.1,0,0.1-0.1c0,0,0.1,0,0.1,0l0,0l0,0l0,0l0,0c0,0,0,0,0,0c0,0,0,0,0,0l0.2,0.2l0.4-0.6L1366.1,891.9       C1366.1,891.8,1366.1,891.8,1366.1,891.9z M1364.4,892.9l0.3,0.6l0.6-0.4l-0.3-0.6L1364.4,892.9z", :fill "url(#SVGID_138_)"}]
     [:linearGradient {:gradientTransform "matrix(1 0 0 -1 0 1200)", :y2 "323.8045", :x2 "1503.411", :y1 "323.8045", :x1 "1394.097", :gradientUnits "userSpaceOnUse", :id "SVGID_139_"}
      [:stop {:id "stop5871", :style "stop-color:#BFBFBF", :offset "0"}]
      [:stop {:id "stop5873", :style "stop-color:#AAAAAE", :offset "0.1122"}]
      [:stop {:id "stop5875", :style "stop-color:#767884", :offset "0.4064"}]
      [:stop {:id "stop5877", :style "stop-color:#515366", :offset "0.6631"}]
      [:stop {:id "stop5879", :style "stop-color:#3A3D54", :offset "0.8695"}]
      [:stop {:id "stop5881", :style "stop-color:#32354D", :offset "1"}]]
     [:path {:id "path5884", :d "M1432.9,887.2l-0.8-1.2l2.8-1.8l0.8,1.2L1432.9,887.2z M1431.5,888l-0.8-1.2l-2.8,1.8l0.8,1.2       L1431.5,888z M1427.3,890.7l-0.8-1.2l-2.8,1.8l0.8,1.2L1427.3,890.7z M1423.1,893.4l-0.8-1.2l-2.8,1.8l0.8,1.2L1423.1,893.4z         M1448.4,877.4l-0.8-1.2l-2.8,1.8l0.8,1.2L1448.4,877.4z M1444.2,880l-0.8-1.2l-2.8,1.8l0.8,1.2L1444.2,880z M1440,882.7       l-0.8-1.2l-2.8,1.8l0.8,1.2L1440,882.7z M1418.9,896.1l-0.8-1.2l-2.8,1.8l0.8,1.2L1418.9,896.1z M1414.8,898.8l-0.8-1.2l-2.8,1.8       l0.8,1.2L1414.8,898.8z M1410.6,901.4l-0.8-1.2l-2.8,1.8l0.8,1.2L1410.6,901.4z M1477.7,858.4l-0.8-1.2l-2.8,1.8l0.8,1.2       L1477.7,858.4z M1473.5,861l-0.8-1.2l-2.8,1.8l0.8,1.2L1473.5,861z M1469.3,863.7l-0.8-1.2l-2.8,1.8l0.8,1.2L1469.3,863.7z         M1465.1,866.4l-0.8-1.2l-2.8,1.8l0.8,1.2L1465.1,866.4z M1490.4,850.4l-0.8-1.2l-2.8,1.8l0.8,1.2L1490.4,850.4z M1486.2,853       l-0.8-1.2l-2.8,1.8l0.8,1.2L1486.2,853z M1482,855.7l-0.8-1.2l-2.8,1.8l0.8,1.2L1482,855.7z M1503.4,842.4l-0.8-1.2l-2.8,1.8       l0.8,1.2L1503.4,842.4z M1499.2,845l-0.8-1.2l-2.8,1.8l0.8,1.2L1499.2,845z M1495,847.7l-0.8-1.2l-2.8,1.8l0.8,1.2L1495,847.7z         M1460.9,869.1l-0.8-1.2l-2.8,1.8l0.8,1.2L1460.9,869.1z M1456.8,871.8l-0.8-1.2l-2.8,1.8l0.8,1.2L1456.8,871.8z M1452.6,874.4       l-0.8-1.2l-2.8,1.8l0.8,1.2L1452.6,874.4z M1406.4,904.1l-0.8-1.2l-2.8,1.8l0.8,1.2L1406.4,904.1z M1402.2,906.8l-0.8-1.2       l-2.8,1.8l0.8,1.2L1402.2,906.8z M1397.7,909.5l-0.8-1.2l-2.8,1.8l0.8,1.2L1397.7,909.5z", :fill "url(#SVGID_139_)"}]]
    [:g {:id "g5955"}
     [:g {:id "g5925", :opacity "0.25"}
      [:linearGradient {:gradientTransform "matrix(1 0 0 -1 0 1200)", :y2 "173.7825", :x2 "1204.4315", :y1 "159.506", :x1 "1177.757", :gradientUnits "userSpaceOnUse", :id "SVGID_140_"}
       [:stop {:id "stop5888", :style "stop-color:#494949", :offset "0"}]
       [:stop {:id "stop5890", :style "stop-color:#525252", :offset "0.2255"}]
       [:stop {:id "stop5892", :style "stop-color:#6A6A6A", :offset "0.593"}]
       [:stop {:id "stop5894", :style "stop-color:#8C8C8C", :offset "1"}]]
      [:polygon {:id "polygon5897", :points "1178.5,1008.3 1178.4,1041.7 1205,1057.7 1205,1026.4     ", :fill "url(#SVGID_140_)"}]
      [:linearGradient {:gradientTransform "matrix(1 0 0 -1 0 1200)", :y2 "155.488", :x2 "1230.967", :y1 "177.5215", :x1 "1208.9335", :gradientUnits "userSpaceOnUse", :id "SVGID_141_"}
       [:stop {:id "stop5899", :style "stop-color:#BFBFBF", :offset "0"}]
       [:stop {:id "stop5901", :style "stop-color:#A2A2A2", :offset "0.219"}]
       [:stop {:id "stop5903", :style "stop-color:#7B7B7B", :offset "0.5607"}]
       [:stop {:id "stop5905", :style "stop-color:#636363", :offset "0.833"}]
       [:stop {:id "stop5907", :style "stop-color:#5A5A5A", :offset "1"}]]
      [:polygon {:id "polygon5910", :points "1205,1026.4 1205,1057.7 1234,1041.5 1234,1008.4     ", :fill "url(#SVGID_141_)"}]
      [:linearGradient {:gradientTransform "matrix(1 0 0 -1 0 1200)", :y2 "206.1371", :x2 "1215.4098", :y1 "178.8337", :x1 "1197.9689", :gradientUnits "userSpaceOnUse", :id "SVGID_142_"}
       [:stop {:id "stop5912", :style "stop-color:#A6A6A6", :offset "0"}]
       [:stop {:id "stop5914", :style "stop-color:#A2A2A2", :offset "3.360000e-02"}]
       [:stop {:id "stop5916", :style "stop-color:#7B7B7B", :offset "0.4566"}]
       [:stop {:id "stop5918", :style "stop-color:#636363", :offset "0.7934"}]
       [:stop {:id "stop5920", :style "stop-color:#5A5A5A", :offset "1"}]]
      [:polygon {:id "polygon5923", :points "1178.5,1008.4 1205,1026.4 1233.8,1008.4 1206.9,991     ", :fill "url(#SVGID_142_)"}]]
     [:linearGradient {:gradientTransform "matrix(1 0 0 -1 0 1200)", :y2 "192.9343", :x2 "1178.0508", :y1 "157.2996", :x1 "1234.4193", :gradientUnits "userSpaceOnUse", :id "SVGID_143_"}
      [:stop {:id "stop5927", :style "stop-color:#595959", :offset "0"}]
      [:stop {:id "stop5929", :style "stop-color:#555557", :offset "4.910000e-02"}]
      [:stop {:id "stop5931", :style "stop-color:#464752", :offset "0.2942"}]
      [:stop {:id "stop5933", :style "stop-color:#3D3F4E", :offset "0.58"}]
      [:stop {:id "stop5935", :style "stop-color:#3A3C4D", :offset "1"}]]
     [:path {:id "path5938", :d "M1200.5,994.1l-0.3-0.6l1-0.6l0.3,0.6L1200.5,994.1z M1203.2,992.5l-0.3-0.6l-1,0.6l0.3,0.6       L1203.2,992.5z M1204.9,991.4l-0.3-0.6l-1,0.6l0.3,0.6L1204.9,991.4z M1196.2,996.7l-0.3-0.6l-1,0.6l0.3,0.6L1196.2,996.7z         M1198,995.6l-0.3-0.6l-1,0.6l0.3,0.6L1198,995.6z M1199.7,994.6l-0.3-0.6l-1,0.6l0.3,0.6L1199.7,994.6z M1191,999.8l-0.3-0.6       l-1,0.6l0.3,0.6L1191,999.8z M1192.7,998.8l-0.3-0.6l-1,0.6l0.3,0.6L1192.7,998.8z M1194.5,997.7l-0.3-0.6l-1,0.6l0.3,0.6       L1194.5,997.7z M1185.8,1003l-0.3-0.6l-1,0.6l0.3,0.6L1185.8,1003z M1187.5,1001.9l-0.3-0.6l-1,0.6l0.3,0.6L1187.5,1001.9z         M1189.3,1000.9l-0.3-0.6l-1,0.6l0.3,0.6L1189.3,1000.9z M1180.6,1006.1l-0.3-0.6l-1,0.6l0.3,0.6L1180.6,1006.1z M1182.3,1005.1       l-0.3-0.6l-1,0.6l0.3,0.6L1182.3,1005.1z M1184.1,1004l-0.3-0.6l-1,0.6l0.3,0.6L1184.1,1004z M1178.2,1014.1h-0.9v1.3h0.9V1014.1       z M1178.2,1012.4h-0.9v0.9h0.9V1012.4z M1178.2,1010.2h-0.9v0.9h0.9V1010.2z M1178.2,1020.5h-0.9v0.9h0.9V1020.5z M1178.2,1018.4       h-0.9v1.3h0.9V1018.4z M1178.2,1016.2h-0.9v0.9h0.9V1016.2z M1178.2,1026.5h-0.9v0.9h0.9V1026.5z M1178.2,1024.4h-0.9v1.3h0.9       V1024.4z M1178.2,1022.7h-0.9v0.9h0.9V1022.7z M1178.2,1032.5h-0.9v1.3h0.9V1032.5z M1178.2,1030.4h-0.9v1.3h0.9V1030.4z         M1178.2,1028.2h-0.9v1.3h0.9V1028.2z M1178.2,1038.5h-0.9v1.3h0.9V1038.5z M1178.2,1036.8h-0.9v0.9h0.9V1036.8z M1178.2,1034.6       h-0.9v1.3h0.9V1034.6z M1182.8,1045.2l-0.4,0.6l0.9,0.6l0.4-0.6L1182.8,1045.2z M1181.2,1044.2l-0.4,0.6l0.9,0.6l0.4-0.6       L1181.2,1044.2z M1179.6,1043.2l-0.4,0.6l0.9,0.6l0.4-0.6L1179.6,1043.2z M1187.7,1048.2l-0.4,0.6l0.9,0.6l0.4-0.6L1187.7,1048.2       z M1186.1,1047.2l-0.4,0.6l0.9,0.6l0.4-0.6L1186.1,1047.2z M1184.5,1046.2l-0.4,0.6l0.9,0.6l0.4-0.6L1184.5,1046.2z         M1192.6,1051.2l-0.4,0.6l0.9,0.6l0.4-0.6L1192.6,1051.2z M1190.9,1050.2l-0.4,0.6l0.9,0.6l0.4-0.6L1190.9,1050.2z         M1189.3,1049.2l-0.4,0.6l0.9,0.6l0.4-0.6L1189.3,1049.2z M1197.4,1054.2l-0.4,0.6l0.9,0.6l0.4-0.6L1197.4,1054.2z         M1195.8,1053.2l-0.4,0.6l0.9,0.6l0.4-0.6L1195.8,1053.2z M1194.2,1052.2l-0.4,0.6l0.9,0.6l0.4-0.6L1194.2,1052.2z         M1202.3,1057.2l-0.4,0.6l0.9,0.6l0.4-0.6L1202.3,1057.2z M1200.7,1056.2l-0.4,0.6l0.9,0.6l0.4-0.6L1200.7,1056.2z M1199,1055.2       l-0.4,0.6l0.9,0.6l0.4-0.6L1199,1055.2z M1210.6,1055.8l0.3,0.6l1-0.6l-0.3-0.6L1210.6,1055.8z M1208.9,1056.8l0.3,0.6l1-0.6       l-0.3-0.6L1208.9,1056.8z M1207.1,1057.8l0.3,0.6l1-0.6l-0.3-0.6L1207.1,1057.8z M1215.9,1052.8l0.3,0.6l1-0.6l-0.3-0.6       L1215.9,1052.8z M1214.2,1053.8l0.3,0.6l1-0.6l-0.3-0.6L1214.2,1053.8z M1212.4,1054.8l0.3,0.6l1-0.6l-0.3-0.6L1212.4,1054.8z         M1221.2,1049.8l0.3,0.6l1-0.6l-0.3-0.6L1221.2,1049.8z M1219.4,1050.8l0.3,0.6l1-0.6l-0.3-0.6L1219.4,1050.8z M1217.7,1051.8       l0.3,0.6l1-0.6l-0.3-0.6L1217.7,1051.8z M1226.5,1046.7l0.3,0.6l1-0.6l-0.3-0.6L1226.5,1046.7z M1224.7,1047.7l0.3,0.6l1-0.6       l-0.3-0.6L1224.7,1047.7z M1223,1048.7l0.3,0.6l1-0.6l-0.3-0.6L1223,1048.7z M1231.8,1043.7l0.3,0.6l1-0.6l-0.3-0.6       L1231.8,1043.7z M1230,1044.7l0.3,0.6l1-0.6l-0.3-0.6L1230,1044.7z M1228.3,1045.7l0.3,0.6l1-0.6l-0.3-0.6L1228.3,1045.7z         M1234.7,1035.7l0.7,0l0-1.1l-0.7,0L1234.7,1035.7z M1234.7,1037.7l0.7,0l0-1.1l-0.7,0L1234.7,1037.7z M1234.7,1039.8l0.7,0       l0-1.1l-0.7,0L1234.7,1039.8z M1234.7,1029.7l0.7,0l0-1.1l-0.7,0L1234.7,1029.7z M1234.7,1031.7l0.7,0l0-1.1l-0.7,0       L1234.7,1031.7z M1234.7,1033.7l0.7,0l0-1.1l-0.7,0L1234.7,1033.7z M1234.7,1023.6l0.7,0l0-1.1l-0.7,0L1234.7,1023.6z         M1234.7,1025.6l0.7,0l0-1.1l-0.7,0L1234.7,1025.6z M1234.7,1027.6l0.7,0l0-1.1l-0.7,0L1234.7,1027.6z M1234.7,1017.5l0.7,0       l0-1.1l-0.7,0L1234.7,1017.5z M1234.7,1019.6l0.7,0l0-1.1l-0.7,0L1234.7,1019.6z M1234.7,1021.6l0.7,0l0-1.1l-0.7,0       L1234.7,1021.6z M1234.7,1011.5l0.7,0l0-1.1l-0.7,0L1234.7,1011.5z M1234.7,1013.5l0.7,0l0-1.1l-0.7,0L1234.7,1013.5z         M1234.7,1015.5l0.7,0l0-1.1l-0.7,0L1234.7,1015.5z M1229.6,1004.9l0.4-0.6l-0.9-0.6l-0.4,0.6L1229.6,1004.9z M1231.2,1006       l0.4-0.6l-0.9-0.6l-0.4,0.6L1231.2,1006z M1232.9,1007.1l0.4-0.6l-0.9-0.6l-0.4,0.6L1232.9,1007.1z M1224.7,1001.7l0.4-0.6       l-0.9-0.6l-0.4,0.6L1224.7,1001.7z M1226.3,1002.8l0.4-0.6l-0.9-0.6l-0.4,0.6L1226.3,1002.8z M1227.9,1003.9l0.4-0.6l-0.9-0.6       l-0.4,0.6L1227.9,1003.9z M1219.7,998.5l0.4-0.6l-0.9-0.6l-0.4,0.6L1219.7,998.5z M1221.4,999.6l0.4-0.6l-0.9-0.6l-0.4,0.6       L1221.4,999.6z M1223,1000.6l0.4-0.6l-0.9-0.6l-0.4,0.6L1223,1000.6z M1214.8,995.3l0.4-0.6l-0.9-0.6l-0.4,0.6L1214.8,995.3z         M1216.4,996.4l0.4-0.6l-0.9-0.6l-0.4,0.6L1216.4,996.4z M1218.1,997.4l0.4-0.6l-0.9-0.6l-0.4,0.6L1218.1,997.4z M1209.9,992.1       l0.4-0.6l-0.9-0.6l-0.4,0.6L1209.9,992.1z M1211.5,993.1l0.4-0.6l-0.9-0.6l-0.4,0.6L1211.5,993.1z M1213.2,994.2l0.4-0.6       l-0.9-0.6l-0.4,0.6L1213.2,994.2z M1178.2,1007l0.3,0.6l0.5-0.3l-0.3-0.6L1178.2,1007z M1177.3,1007.6       C1177.3,1007.6,1177.3,1007.6,1177.3,1007.6c0,0.1,0,0.2,0,0.3c0,0.2,0,0.6,0,0.6h0.9c0,0,0-0.4,0-0.5c0,0,0-0.1,0-0.1v0v0v0       l-0.1,0c0,0-0.1,0-0.1,0c0,0,0,0,0,0l0.2-0.1l-0.4-0.6L1177.3,1007.6C1177.3,1007.6,1177.3,1007.6,1177.3,1007.6z M1177.3,1009.3       h0.7v-0.6h-0.7V1009.3z M1177.2,1041.2h0.7v-0.6h-0.7V1041.2z M1177.3,1041.9c0,0,0,0.2,0.1,0.2c0,0,0.1,0.2,0.2,0.2       c0.1,0.1,0.3,0.2,0.3,0.2l0.4-0.6c0,0-0.1,0-0.1-0.1c0,0-0.1,0-0.1-0.1l0,0l0-0.2l0-0.2h0c0,0,0,0,0,0c0,0,0,0,0,0l0,0h-0.6       L1177.3,1041.9C1177.3,1041.9,1177.2,1041.9,1177.3,1041.9z M1178.7,1043.2l0.4-0.6l-0.5-0.3l-0.4,0.6L1178.7,1043.2z         M1204.1,1058.9l0.4-0.6l-0.6-0.3l-0.4,0.6L1204.1,1058.9z M1205.1,1059.5C1205.1,1059.5,1205.1,1059.5,1205.1,1059.5       c0.1-0.1,0.2-0.1,0.3-0.2c0.1-0.1,0.3-0.2,0.3-0.2l-0.3-0.6c0,0-0.1,0-0.1,0.1c0,0-0.1,0-0.1,0l0,0l0,0l0,0l0,0c0,0,0,0,0,0       c0,0,0,0,0,0l-0.2-0.1l-0.4,0.6L1205.1,1059.5C1205.1,1059.6,1205.1,1059.5,1205.1,1059.5z M1206.7,1058.6l-0.3-0.6l-0.6,0.3       l0.3,0.6L1206.7,1058.6z M1234.2,1042.9l-0.3-0.6l-0.6,0.3l0.3,0.6L1234.2,1042.9z M1235.1,1042.3       C1235.1,1042.3,1235.1,1042.3,1235.1,1042.3c0-0.1,0-0.2,0-0.3c0-0.2-0.1-0.3-0.1-0.3l-0.8,0c0,0,0,0.1,0,0.1c0,0,0,0.1,0,0.1v0       v0v0l0.1,0c0,0,0.1,0,0.1,0c0,0,0,0,0,0l-0.2,0.1l0.4,0.6L1235.1,1042.3C1235.2,1042.3,1235.1,1042.3,1235.1,1042.3z         M1235.2,1040.5l-0.7,0l0,0.6l0.7,0L1235.2,1040.5z M1235.2,1009.1l-0.7,0l0,0.6l0.7,0L1235.2,1009.1z M1235.1,1008.1       C1235.1,1008.1,1235.1,1008,1235.1,1008.1c-0.1-0.1-0.2-0.2-0.2-0.2c-0.1-0.1-0.3-0.2-0.3-0.2l-0.4,0.5c0,0,0.1,0,0.1,0.1       c0,0,0.1,0,0.1,0l0,0l0,0.1l0,0.1h0c0,0,0,0,0,0c0,0-0.2,0-0.2,0v0.1l0.8,0.1L1235.1,1008.1       C1235.2,1008.1,1235.2,1008.1,1235.1,1008.1z M1233.7,1007.1l-0.4,0.6l0.5,0.3l0.4-0.6L1233.7,1007.1z M1208.1,990.3l-0.4,0.6       l0.6,0.4l0.4-0.6L1208.1,990.3z M1207,989.6C1207,989.6,1206.9,989.6,1207,989.6c-0.1,0.1-0.2,0.1-0.3,0.2       c-0.2,0.1-0.3,0.2-0.3,0.2l0.3,0.6c0,0,0.1,0,0.1-0.1c0,0,0.1,0,0.1,0l0,0l0,0l0,0l0,0c0,0,0,0,0,0c0,0,0,0,0,0l0.2,0.2l0.4-0.6       L1207,989.6C1207,989.6,1207,989.6,1207,989.6z M1205.3,990.6l0.3,0.6l0.6-0.4l-0.3-0.6L1205.3,990.6z", :fill "url(#SVGID_143_)"}]
     [:linearGradient {:gradientTransform "matrix(1 0 0 -1 0 1200)", :y2 "260.4814", :x2 "1343.2386", :y1 "190.7464", :x1 "1234.6152", :gradientUnits "userSpaceOnUse", :id "SVGID_144_"}
      [:stop {:id "stop5940", :style "stop-color:#BFBFBF", :offset "0"}]
      [:stop {:id "stop5942", :style "stop-color:#AAAAAE", :offset "0.1122"}]
      [:stop {:id "stop5944", :style "stop-color:#767884", :offset "0.4064"}]
      [:stop {:id "stop5946", :style "stop-color:#515366", :offset "0.6631"}]
      [:stop {:id "stop5948", :style "stop-color:#3A3D54", :offset "0.8695"}]
      [:stop {:id "stop5950", :style "stop-color:#32354D", :offset "1"}]]
     [:path {:id "path5953", :d "M1273.8,984.9l-0.8-1.2l2.8-1.8l0.8,1.2L1273.8,984.9z M1272.4,985.8l-0.8-1.2l-2.8,1.8l0.8,1.2       L1272.4,985.8z M1268.2,988.5l-0.8-1.2l-2.8,1.8l0.8,1.2L1268.2,988.5z M1264,991.1l-0.8-1.2l-2.8,1.8l0.8,1.2L1264,991.1z         M1289.3,975.1l-0.8-1.2l-2.8,1.8l0.8,1.2L1289.3,975.1z M1285.1,977.8l-0.8-1.2l-2.8,1.8l0.8,1.2L1285.1,977.8z M1280.9,980.4       l-0.8-1.2l-2.8,1.8l0.8,1.2L1280.9,980.4z M1259.8,993.8l-0.8-1.2l-2.8,1.8l0.8,1.2L1259.8,993.8z M1255.6,996.5l-0.8-1.2       l-2.8,1.8l0.8,1.2L1255.6,996.5z M1251.5,999.2l-0.8-1.2l-2.8,1.8l0.8,1.2L1251.5,999.2z M1318.6,956.1l-0.8-1.2l-2.8,1.8       l0.8,1.2L1318.6,956.1z M1314.4,958.8l-0.8-1.2l-2.8,1.8l0.8,1.2L1314.4,958.8z M1310.2,961.5l-0.8-1.2l-2.8,1.8l0.8,1.2       L1310.2,961.5z M1306,964.1l-0.8-1.2l-2.8,1.8l0.8,1.2L1306,964.1z M1331.3,948.1l-0.8-1.2l-2.8,1.8l0.8,1.2L1331.3,948.1z         M1327.1,950.8l-0.8-1.2l-2.8,1.8l0.8,1.2L1327.1,950.8z M1322.9,953.4l-0.8-1.2l-2.8,1.8l0.8,1.2L1322.9,953.4z M1344.3,940.1       l-0.8-1.2l-2.8,1.8l0.8,1.2L1344.3,940.1z M1340.1,942.8l-0.8-1.2l-2.8,1.8l0.8,1.2L1340.1,942.8z M1335.9,945.4l-0.8-1.2       l-2.8,1.8l0.8,1.2L1335.9,945.4z M1301.8,966.8l-0.8-1.2l-2.8,1.8l0.8,1.2L1301.8,966.8z M1297.6,969.5l-0.8-1.2l-2.8,1.8       l0.8,1.2L1297.6,969.5z M1293.5,972.2l-0.8-1.2l-2.8,1.8l0.8,1.2L1293.5,972.2z M1247.3,1001.8l-0.8-1.2l-2.8,1.8l0.8,1.2       L1247.3,1001.8z M1243.1,1004.5l-0.8-1.2l-2.8,1.8l0.8,1.2L1243.1,1004.5z M1238.6,1007.2l-0.8-1.2l-2.8,1.8l0.8,1.2       L1238.6,1007.2z", :fill "url(#SVGID_144_)"}]]
    [:linearGradient {:gradientTransform "matrix(1 0 0 -1 0 1200)", :y2 "325.7959", :x2 "969.9731", :y1 "193.9759", :x1 "1179.2999", :gradientUnits "userSpaceOnUse", :id "SVGID_145_"}
     [:stop {:id "stop5957", :style "stop-color:#32354D", :offset "0"}]
     [:stop {:id "stop5959", :style "stop-color:#3A3D54", :offset "0.1305"}]
     [:stop {:id "stop5961", :style "stop-color:#515366", :offset "0.3369"}]
     [:stop {:id "stop5963", :style "stop-color:#767884", :offset "0.5936"}]
     [:stop {:id "stop5965", :style "stop-color:#AAAAAE", :offset "0.8878"}]
     [:stop {:id "stop5967", :style "stop-color:#BFBFBF", :offset "1"}]]
    [:path {:id "path5970", :d "M1112.1,964.9l0.8-1.2l2.8,1.8l-0.8,1.2L1112.1,964.9z M1110.7,964l0.8-1.2l-2.8-1.8l-0.8,1.2     L1110.7,964z M1106.6,961.4l0.8-1.2l-2.8-1.8l-0.8,1.2L1106.6,961.4z M1102.4,958.7l0.8-1.2l-2.8-1.8l-0.8,1.2L1102.4,958.7z       M1127.5,974.7l0.8-1.2l-2.8-1.8l-0.8,1.2L1127.5,974.7z M1123.3,972.1l0.8-1.2l-2.8-1.8l-0.8,1.2L1123.3,972.1z M1119.1,969.4     l0.8-1.2l-2.8-1.8l-0.8,1.2L1119.1,969.4z M1098.2,956.1l0.8-1.2l-2.8-1.8l-0.8,1.2L1098.2,956.1z M1094,953.4l0.8-1.2l-2.8-1.8     l-0.8,1.2L1094,953.4z M1089.8,950.8l0.8-1.2l-2.8-1.8l-0.8,1.2L1089.8,950.8z M1156.9,993.1l0.8-1.2l-2.8-1.8l-0.8,1.2     L1156.9,993.1z M1152.8,990.5l0.8-1.2l-2.8-1.8l-0.8,1.2L1152.8,990.5z M1148.6,987.8l0.8-1.2l-2.8-1.8l-0.8,1.2L1148.6,987.8z       M1144.4,985.2l0.8-1.2l-2.8-1.8l-0.8,1.2L1144.4,985.2z M1169.5,1001.2l0.8-1.2l-2.8-1.8l-0.8,1.2L1169.5,1001.2z M1165.3,998.5     l0.8-1.2l-2.8-1.8l-0.8,1.2L1165.3,998.5z M1161.1,995.9l0.8-1.2l-2.8-1.8l-0.8,1.2L1161.1,995.9z M1178,1006.8l0.8-1.2l-2.8-1.8     l-0.8,1.2L1178,1006.8z M1173.8,1004.2l0.8-1.2l-2.8-1.8l-0.8,1.2L1173.8,1004.2z M1140.2,982.5l0.8-1.2l-2.8-1.8l-0.8,1.2     L1140.2,982.5z M1136,979.9l0.8-1.2l-2.8-1.8l-0.8,1.2L1136,979.9z M1131.9,977.2l0.8-1.2l-2.8-1.8l-0.8,1.2L1131.9,977.2z       M1085.7,948.1l0.8-1.2l-2.8-1.8l-0.8,1.2L1085.7,948.1z M1081.5,945.5l0.8-1.2l-2.8-1.8l-0.8,1.2L1081.5,945.5z M1077.2,942.6     l0.8-1.2l-2.8-1.8l-0.8,1.2L1077.2,942.6z M1009.9,899.8l0.8-1.2l-2.8-1.8l-0.8,1.2L1009.9,899.8z M1005.7,897.1l0.8-1.2l-2.8-1.8     l-0.8,1.2L1005.7,897.1z M1001.6,894.5l0.8-1.2l-2.8-1.8l-0.8,1.2L1001.6,894.5z M997.4,891.8l0.8-1.2l-2.8-1.8l-0.8,1.2     L997.4,891.8z M1022.5,907.8l0.8-1.2l-2.8-1.8l-0.8,1.2L1022.5,907.8z M1018.3,905.2l0.8-1.2l-2.8-1.8l-0.8,1.2L1018.3,905.2z       M1014.1,902.5l0.8-1.2l-2.8-1.8l-0.8,1.2L1014.1,902.5z M993.2,889.2l0.8-1.2l-2.8-1.8l-0.8,1.2L993.2,889.2z M989,886.5l0.8-1.2     l-2.8-1.8l-0.8,1.2L989,886.5z M984.8,883.9l0.8-1.2l-2.8-1.8l-0.8,1.2L984.8,883.9z M1051.9,926.2l0.8-1.2l-2.8-1.8l-0.8,1.2     L1051.9,926.2z M1047.8,923.6l0.8-1.2l-2.8-1.8l-0.8,1.2L1047.8,923.6z M1043.6,920.9l0.8-1.2l-2.8-1.8l-0.8,1.2L1043.6,920.9z       M1039.4,918.3l0.8-1.2l-2.8-1.8l-0.8,1.2L1039.4,918.3z M1064.5,934.2l0.8-1.2l-2.8-1.8l-0.8,1.2L1064.5,934.2z M1060.3,931.6     l0.8-1.2l-2.8-1.8l-0.8,1.2L1060.3,931.6z M1056.1,929l0.8-1.2l-2.8-1.8l-0.8,1.2L1056.1,929z M1073,939.9l0.8-1.2l-2.8-1.8     l-0.8,1.2L1073,939.9z M1068.8,937.3l0.8-1.2l-2.8-1.8l-0.8,1.2L1068.8,937.3z M1035.2,915.6l0.8-1.2l-2.8-1.8l-0.8,1.2     L1035.2,915.6z M1031,913l0.8-1.2l-2.8-1.8l-0.8,1.2L1031,913z M1026.9,910.3l0.8-1.2l-2.8-1.8l-0.8,1.2L1026.9,910.3z       M980.7,881.2l0.8-1.2l-2.8-1.8l-0.8,1.2L980.7,881.2z M976.5,878.6l0.8-1.2l-2.8-1.8l-0.8,1.2L976.5,878.6z M972.2,875.7l0.8-1.2     l-2.8-1.8l-0.8,1.2L972.2,875.7z", :fill "url(#SVGID_145_)"}]
    [:linearGradient {:gradientTransform "matrix(1 0 0 -1 0 1200)", :y2 "613.148", :x2 "1444.4141", :y1 "481.3279", :x1 "1653.7408", :gradientUnits "userSpaceOnUse", :id "SVGID_146_"}
     [:stop {:id "stop5972", :style "stop-color:#32354D", :offset "0"}]
     [:stop {:id "stop5974", :style "stop-color:#3A3D54", :offset "0.1305"}]
     [:stop {:id "stop5976", :style "stop-color:#515366", :offset "0.3369"}]
     [:stop {:id "stop5978", :style "stop-color:#767884", :offset "0.5936"}]
     [:stop {:id "stop5980", :style "stop-color:#AAAAAE", :offset "0.8878"}]
     [:stop {:id "stop5982", :style "stop-color:#BFBFBF", :offset "1"}]]
    [:path {:id "path5985", :d "M1587.1,677.9l0.8-1.2l2.8,1.8l-0.8,1.2L1587.1,677.9z M1585.7,677l0.8-1.2l-2.8-1.8l-0.8,1.2     L1585.7,677z M1581.6,674.4l0.8-1.2l-2.8-1.8l-0.8,1.2L1581.6,674.4z M1577.4,671.7l0.8-1.2l-2.8-1.8l-0.8,1.2L1577.4,671.7z       M1602.5,687.7l0.8-1.2l-2.8-1.8l-0.8,1.2L1602.5,687.7z M1598.3,685.1l0.8-1.2l-2.8-1.8l-0.8,1.2L1598.3,685.1z M1594.1,682.4     l0.8-1.2l-2.8-1.8l-0.8,1.2L1594.1,682.4z M1573.2,669.1l0.8-1.2l-2.8-1.8l-0.8,1.2L1573.2,669.1z M1569,666.4l0.8-1.2l-2.8-1.8     l-0.8,1.2L1569,666.4z M1564.8,663.8l0.8-1.2l-2.8-1.8l-0.8,1.2L1564.8,663.8z M1631.9,706.1l0.8-1.2l-2.8-1.8l-0.8,1.2     L1631.9,706.1z M1627.8,703.5l0.8-1.2l-2.8-1.8l-0.8,1.2L1627.8,703.5z M1623.6,700.8l0.8-1.2l-2.8-1.8l-0.8,1.2L1623.6,700.8z       M1619.4,698.2l0.8-1.2l-2.8-1.8l-0.8,1.2L1619.4,698.2z M1644.5,714.2l0.8-1.2l-2.8-1.8l-0.8,1.2L1644.5,714.2z M1640.3,711.5     l0.8-1.2l-2.8-1.8l-0.8,1.2L1640.3,711.5z M1636.1,708.9l0.8-1.2l-2.8-1.8l-0.8,1.2L1636.1,708.9z M1653,719.8l0.8-1.2l-2.8-1.8     l-0.8,1.2L1653,719.8z M1648.8,717.2l0.8-1.2l-2.8-1.8l-0.8,1.2L1648.8,717.2z M1615.2,695.5l0.8-1.2l-2.8-1.8l-0.8,1.2     L1615.2,695.5z M1611,692.9l0.8-1.2l-2.8-1.8l-0.8,1.2L1611,692.9z M1606.9,690.2l0.8-1.2l-2.8-1.8l-0.8,1.2L1606.9,690.2z       M1560.7,661.1l0.8-1.2l-2.8-1.8l-0.8,1.2L1560.7,661.1z M1556.5,658.5l0.8-1.2l-2.8-1.8l-0.8,1.2L1556.5,658.5z M1552.2,655.6     l0.8-1.2l-2.8-1.8l-0.8,1.2L1552.2,655.6z M1484.9,612.8l0.8-1.2l-2.8-1.8l-0.8,1.2L1484.9,612.8z M1480.7,610.1l0.8-1.2l-2.8-1.8     l-0.8,1.2L1480.7,610.1z M1476.6,607.5l0.8-1.2l-2.8-1.8l-0.8,1.2L1476.6,607.5z M1472.4,604.8l0.8-1.2l-2.8-1.8l-0.8,1.2     L1472.4,604.8z M1497.5,620.8l0.8-1.2l-2.8-1.8l-0.8,1.2L1497.5,620.8z M1493.3,618.2l0.8-1.2l-2.8-1.8l-0.8,1.2L1493.3,618.2z       M1489.1,615.5l0.8-1.2l-2.8-1.8l-0.8,1.2L1489.1,615.5z M1468.2,602.2l0.8-1.2l-2.8-1.8l-0.8,1.2L1468.2,602.2z M1464,599.5     l0.8-1.2l-2.8-1.8l-0.8,1.2L1464,599.5z M1459.8,596.9l0.8-1.2l-2.8-1.8l-0.8,1.2L1459.8,596.9z M1526.9,639.2l0.8-1.2l-2.8-1.8     l-0.8,1.2L1526.9,639.2z M1522.8,636.6l0.8-1.2l-2.8-1.8l-0.8,1.2L1522.8,636.6z M1518.6,633.9l0.8-1.2l-2.8-1.8l-0.8,1.2     L1518.6,633.9z M1514.4,631.3l0.8-1.2l-2.8-1.8l-0.8,1.2L1514.4,631.3z M1539.5,647.2l0.8-1.2l-2.8-1.8l-0.8,1.2L1539.5,647.2z       M1535.3,644.6l0.8-1.2l-2.8-1.8l-0.8,1.2L1535.3,644.6z M1531.1,642l0.8-1.2l-2.8-1.8l-0.8,1.2L1531.1,642z M1548,652.9l0.8-1.2     l-2.8-1.8l-0.8,1.2L1548,652.9z M1543.8,650.3l0.8-1.2l-2.8-1.8l-0.8,1.2L1543.8,650.3z M1510.2,628.6l0.8-1.2l-2.8-1.8l-0.8,1.2     L1510.2,628.6z M1506,626l0.8-1.2l-2.8-1.8l-0.8,1.2L1506,626z M1501.9,623.3l0.8-1.2l-2.8-1.8l-0.8,1.2L1501.9,623.3z       M1455.7,594.2l0.8-1.2l-2.8-1.8l-0.8,1.2L1455.7,594.2z M1451.5,591.6l0.8-1.2l-2.8-1.8l-0.8,1.2L1451.5,591.6z M1447.2,588.7           l0.8-1.2l-2.8-1.8l-0.8,1.2L1447.2,588.7z", :fill "url(#SVGID_146_)"}]
    [:path {:style "fill:none;stroke-miterlimit:10;stroke:transparent", :d "m969.4 873.9 241.4 151.8 291.8-184.6 177.5-105.4-241.9-153.4", :id "bottomline"}]]
   [:g {:id "g6073"}
    [:linearGradient {:gradientTransform "matrix(0.3592 -0.3065 -1.2019 -0.6834 1880.408 1551.1382)", :y2 "817.645", :x2 "606.0892", :y1 "953.613", :x1 "605.9249", :gradientUnits "userSpaceOnUse", :id "SVGID_147_"}
     [:stop {:id "stop5989", :style "stop-color:#FFFFFF", :offset "0"}]
     [:stop {:id "stop5991", :style "stop-color:#FFFFFF;stop-opacity:0", :offset "1"}]]
    [:polygon {:id "polygon5994", :points "1139.7,789.3 1074.3,826 886.1,711.5      955,672.8   ", :enable-background "new    ", :fill "url(#SVGID_147_)", :opacity "0.25", :class "particlespoly"}]
    [:linearGradient {:gradientTransform "matrix(0.3592 -0.3065 -1.2019 -0.6834 1880.408 1551.1382)", :y2 "878.7339", :x2 "725.6356", :y1 "1027.7656", :x1 "763.4714", :gradientUnits "userSpaceOnUse", :id "SVGID_148_"}
     [:stop {:id "stop5996", :style "stop-color:#FF808B", :offset "0"}]
     [:stop {:id "stop5998", :style "stop-color:#FFB2B9;stop-opacity:0.5873", :offset "0.3874"}]
     [:stop {:id "stop6000", :style "stop-color:#FFFFFF;stop-opacity:0", :offset "0.9388"}]]
    [:polygon {:id "polygon6003", :points "1123.5,708.5 1057.5,749 887.2,638.9      954.8,596.8   ", :enable-background "new    ", :fill "url(#SVGID_148_)", :opacity "0.75", :class "particlespoly"}]
    [:g {:id "bottomparticles"}
     [:circle {:id "circle6005", :r "1.6", :cy "693.5", :cx "942.6", :fill "#FFFFFF"}]
     [:circle {:id "circle6007", :r "1.6", :cy "675.3", :cx "931.6", :fill "#FFFFFF"}]
     [:circle {:id "circle6009", :r "1.6", :cy "737.7", :cx "1000.1", :fill "#FFFFFF"}]
     [:circle {:id "circle6011", :r "1.6", :cy "719.1", :cx "1118.8", :fill "#FFFFFF"}]
     [:circle {:id "circle6013", :r "1.6", :cy "658.5", :cx "936.4", :fill "#FFFFFF"}]
     [:circle {:id "circle6015", :r "1.6", :cy "786.5", :cx "1017.4", :fill "#FFFFFF"}]
     [:circle {:id "circle6017", :r "1.6", :cy "769.7", :cx "1090", :fill "#FFFFFF"}]
     [:circle {:id "circle6019", :r "1.6", :cy "672.1", :cx "1004.9", :fill "#FFFFFF"}]
     [:circle {:id "circle6021", :r "1.6", :cy "615.2", :cx "957.9", :fill "#FFFFFF"}]
     [:circle {:id "circle6023", :r "1.6", :cy "651.1", :cx "948", :fill "#FFFFFF"}]
     [:circle {:id "circle6025", :r "1.6", :cy "686.7", :cx "1063.7", :fill "#FFFFFF"}]
     [:circle {:id "circle6027", :r "3.2", :cy "691.9", :cx "904.7", :fill "#FFFFFF"}]]
    [:linearGradient {:gradientTransform "matrix(0.3592 -0.3065 -1.2019 -0.6834 1880.408 1551.1382)", :y2 "855.3317", :x2 "591.3518", :y1 "1006.7597", :x1 "608.2545", :gradientUnits "userSpaceOnUse", :id "SVGID_149_"}
     [:stop {:id "stop6030", :style "stop-color:#FFFFFF", :offset "0"}]
     [:stop {:id "stop6032", :style "stop-color:#C5C6D1;stop-opacity:0.8007", :offset "0.1993"}]
     [:stop {:id "stop6034", :style "stop-color:#9497AB;stop-opacity:0.6081", :offset "0.3919"}]
     [:stop {:id "stop6036", :style "stop-color:#6E728D;stop-opacity:0.4269", :offset "0.5731"}]
     [:stop {:id "stop6038", :style "stop-color:#535878;stop-opacity:0.2601", :offset "0.7399"}]
     [:stop {:id "stop6040", :style "stop-color:#43486B;stop-opacity:0.1126", :offset "0.8874"}]
     [:stop {:id "stop6042", :style "stop-color:#3D4266;stop-opacity:0", :offset "1"}]]
    [:polygon {:id "polygon6045", :points "1066,755.4 1066,822.1 886.1,711.5      886.7,638.9   ", :enable-background "new    ", :fill "url(#SVGID_149_)", :opacity "0.6", :class "particlespoly"}]
    [:linearGradient {:gradientTransform "matrix(0.3592 -0.3065 -1.2019 -0.6834 1880.408 1551.1382)", :y2 "869.6109", :x2 "594.1304", :y1 "980.9644", :x1 "606.5599", :gradientUnits "userSpaceOnUse", :id "SVGID_150_"}
     [:stop {:id "stop6047", :style "stop-color:#FFFFFF", :offset "0"}]
     [:stop {:id "stop6049", :style "stop-color:#FFFFFF;stop-opacity:0", :offset "1"}]]
    [:polygon {:id "polygon6052", :points "1066,778.8 1066,798 886.1,681.3      886.7,662.2   ", :enable-background "new    ", :fill "url(#SVGID_150_)", :opacity "0.35", :class "particlespoly"}]
    [:linearGradient {:gradientTransform "matrix(0.3592 -0.3065 -1.2019 -0.6834 1880.408 1551.1382)", :y2 "858.2021", :x2 "792.8986", :y1 "1015.9351", :x1 "826.0909", :gradientUnits "userSpaceOnUse", :id "SVGID_151_"}
     [:stop {:id "stop6054", :style "stop-color:#FFFFFF", :offset "0"}]
     [:stop {:id "stop6056", :style "stop-color:#FFFFFF;stop-opacity:0", :offset "1"}]]
    [:polygon {:id "polygon6059", :points "1133.1,714.6 1132.2,727.2 955,609.6      955,596.4   ", :enable-background "new    ", :fill "url(#SVGID_151_)", :opacity "0.2", :class "particlespoly"}]
    [:g {:id "g6065", :opacity "0.75"}
     [:polygon {:id "polygon6061", :points "973.8,636.1 970.7,656 944.7,654.9 939.5,658.1 974.2,659.3 978.1,633.2    ", :fill "#FFFFFF"}]
     [:polygon {:id "polygon6063", :points "981.8,644.1 978.7,664 952.7,662.9 947.6,666.1 982.2,667.3 986.2,641.3    ", :fill "#FFFFFF"}]]
    [:g {:id "g6071", :opacity "0.75"}
     [:polygon {:id "polygon6067", :points "1012.5,770.8 1010.4,750.7 1035.9,745.2 1040,740.8 1006.2,748.4 1009,774.6    ", :fill "#FFFFFF"}]
     [:polygon {:id "polygon6069", :points "1002.6,765 1000.6,745 1026,739.4 1030.2,735 996.4,742.6 999.1,768.8    ", :fill "#FFFFFF"}]]]
   [:g {:id "g6155"}
    [:linearGradient {:gradientTransform "matrix(0.3592 -0.3065 -1.2019 -0.6834 1880.408 1551.1382)", :y2 "769.4603", :x2 "1330.1639", :y1 "905.4283", :x1 "1329.9996", :gradientUnits "userSpaceOnUse", :id "SVGID_152_"}
     [:stop {:id "stop6075", :style "stop-color:#FFFFFF", :offset "0"}]
     [:stop {:id "stop6077", :style "stop-color:#FFFFFF;stop-opacity:0", :offset "1"}]]
    [:polygon {:id "polygon6080", :points "1457.7,600.3 1392.3,637 1204.1,522.5      1273,483.8   ", :enable-background "new    ", :fill "url(#SVGID_152_)", :opacity "0.25", :class "particlespoly"}]
    [:linearGradient {:gradientTransform "matrix(0.3592 -0.3065 -1.2019 -0.6834 1880.408 1551.1382)", :y2 "830.5333", :x2 "1449.7062", :y1 "979.5649", :x1 "1487.542", :gradientUnits "userSpaceOnUse", :id "SVGID_153_"}
     [:stop {:id "stop6082", :style "stop-color:#FF808B", :offset "0"}]
     [:stop {:id "stop6084", :style "stop-color:#FFB2B9;stop-opacity:0.5873", :offset "0.3874"}]
     [:stop {:id "stop6086", :style "stop-color:#FFFFFF;stop-opacity:0", :offset "0.9388"}]]
    [:polygon {:id "polygon6089", :points "1441.5,519.5 1375.5,560 1205.2,449.9      1272.8,407.8   ", :enable-background "new    ", :fill "url(#SVGID_153_)", :opacity "0.75", :class "particlespoly"}]
    [:g {:id "bottomparticles2"}
     [:circle {:id "circle6091", :r "1.6", :cy "504.5", :cx "1260.6", :fill "#FFFFFF"}]
     [:circle {:id "circle6093", :r "1.6", :cy "486.3", :cx "1249.6", :fill "#FFFFFF"}]
     [:circle {:id "circle6095", :r "1.6", :cy "548.7", :cx "1318.1", :fill "#FFFFFF"}]
     [:circle {:id "circle6097", :r "1.6", :cy "530.1", :cx "1436.8", :fill "#FFFFFF"}]
     [:circle {:id "circle6099", :r "1.6", :cy "469.5", :cx "1254.4", :fill "#FFFFFF"}]
     [:circle {:id "circle6101", :r "1.6", :cy "597.5", :cx "1335.4", :fill "#FFFFFF"}]
     [:circle {:id "circle6103", :r "1.6", :cy "580.7", :cx "1408", :fill "#FFFFFF"}]
     [:circle {:id "circle6105", :r "1.6", :cy "483.1", :cx "1322.9", :fill "#FFFFFF"}]
     [:circle {:id "circle6107", :r "1.6", :cy "426.2", :cx "1275.9", :fill "#FFFFFF"}]
     [:circle {:id "circle6109", :r "1.6", :cy "462.1", :cx "1266", :fill "#FFFFFF"}]
     [:circle {:id "circle6111", :r "1.6", :cy "497.7", :cx "1381.7", :fill "#FFFFFF"}]
     [:circle {:id "circle6113", :r "3.2", :cy "502.9", :cx "1222.7", :fill "#FFFFFF"}]]
    [:linearGradient {:gradientTransform "matrix(0.3592 -0.3065 -1.2019 -0.6834 1880.408 1551.1382)", :y2 "807.1397", :x2 "1315.4257", :y1 "958.5676", :x1 "1332.3284", :gradientUnits "userSpaceOnUse", :id "SVGID_154_"}
     [:stop {:id "stop6116", :style "stop-color:#FFFFFF", :offset "0"}]
     [:stop {:id "stop6118", :style "stop-color:#E2E2E5;stop-opacity:0.9173", :offset "8.269999e-02"}]
     [:stop {:id "stop6120", :style "stop-color:#A8A9AF;stop-opacity:0.7344", :offset "0.2656"}]
     [:stop {:id "stop6122", :style "stop-color:#777983;stop-opacity:0.5577", :offset "0.4423"}]
     [:stop {:id "stop6124", :style "stop-color:#515460;stop-opacity:0.3916", :offset "0.6084"}]
     [:stop {:id "stop6126", :style "stop-color:#363947;stop-opacity:0.2386", :offset "0.7614"}]
     [:stop {:id "stop6128", :style "stop-color:#262938;stop-opacity:0.1033", :offset "0.8967"}]
     [:stop {:id "stop6130", :style "stop-color:#202333;stop-opacity:0", :offset "1"}]]
    [:polygon {:id "polygon6133", :points "1384,566.4 1384,633.1 1204.1,522.5      1204.7,449.9   ", :enable-background "new    ", :fill "url(#SVGID_154_)", :opacity "0.6", :class "particlespoly"}]
    [:linearGradient {:gradientTransform "matrix(0.3592 -0.3065 -1.2019 -0.6834 1880.408 1551.1382)", :y2 "821.4188", :x2 "1318.2042", :y1 "932.7722", :x1 "1330.6338", :gradientUnits "userSpaceOnUse", :id "SVGID_155_"}
     [:stop {:id "stop6135", :style "stop-color:#FFFFFF", :offset "0"}]
     [:stop {:id "stop6137", :style "stop-color:#FFFFFF;stop-opacity:0", :offset "1"}]]
    [:polygon {:id "polygon6140", :points "1384,589.8 1384,609 1204.1,492.3      1204.7,473.2   ", :enable-background "new    ", :fill "url(#SVGID_155_)", :opacity "0.35", :class "particlespoly"}]
    [:linearGradient {:gradientTransform "matrix(0.3592 -0.3065 -1.2019 -0.6834 1880.408 1551.1382)", :y2 "810.004", :x2 "1516.9703", :y1 "967.7369", :x1 "1550.1628", :gradientUnits "userSpaceOnUse", :id "SVGID_156_"}
     [:stop {:id "stop6142", :style "stop-color:#FFFFFF", :offset "0"}]
     [:stop {:id "stop6144", :style "stop-color:#FFFFFF;stop-opacity:0", :offset "1"}]]
    [:polygon {:id "polygon6147", :points "1451.1,525.6 1450.2,538.2 1273,420.6      1273,407.4   ", :enable-background "new    ", :fill "url(#SVGID_156_)", :opacity "0.2", :class "particlespoly"}]
    [:g {:id "g6153", :opacity "0.75"}
     [:polygon {:id "polygon6149", :points "1311.9,461.6 1308.8,481.5 1282.7,480.4 1277.6,483.6 1312.2,484.8 1316.2,458.8    ", :fill "#FFFFFF"}]
     [:polygon {:id "polygon6151", :points "1319.9,469.6 1316.8,489.5 1290.8,488.5 1285.7,491.6 1320.3,492.9 1324.3,466.8    ", :fill "#FFFFFF"}]]]]
  [:defs {:id "defs3258"}
   [:pattern {:id "pattern0", :patternContentUnits "objectBoundingBox", :width "1", :height "1"}
    [:use {:xlinkHref "#image0", :transform "translate(-0.120411) scale(0.002657 0.00362319)", :id "use1631"}]]
   [:pattern {:id "pattern1", :patternContentUnits "objectBoundingBox", :width "1", :height "1"}
    [:use {:xlinkHref "#image0", :transform "translate(-0.120411) scale(0.002657 0.00362319)", :id "use1634"}]]
   [:linearGradient {:id "paint0_linear", :x1 "554.223", :y1 "369.111", :x2 "527.067", :y2 "384.79", :gradientUnits "userSpaceOnUse"}
    [:stop {:stop-color "#1F898D", :id "stop1637"}]
    [:stop {:offset "0.2627", :stop-color "#1A7E85", :id "stop1639"}]
    [:stop {:offset "0.7192", :stop-color "#127174", :id "stop1641"}]
    [:stop {:offset "1", :stop-color "#116567", :id "stop1643"}]]
   [:linearGradient {:id "paint1_linear", :x1 "528.904", :y1 "366.77", :x2 "546.092", :y2 "391.318", :gradientUnits "userSpaceOnUse"}
    [:stop {:stop-color "#003846", :id "stop1646"}]
    [:stop {:offset "0.0001", :stop-color "#003843", :id "stop1648"}]
    [:stop {:offset "0.3122", :stop-color "#005769", :id "stop1650"}]
    [:stop {:offset "0.7197", :stop-color "#006072", :id "stop1652"}]
    [:stop {:offset "1", :stop-color "#00819A", :id "stop1654"}]]
   [:linearGradient {:id "paint2_linear", :x1 "554.226", :y1 "363.309", :x2 "523.941", :y2 "380.794", :gradientUnits "userSpaceOnUse"}
    [:stop {:stop-color "#1FB2A9", :id "stop1657"}]
    [:stop {:offset "0.2302", :stop-color "#24C4CE", :id "stop1659"}]
    [:stop {:offset "0.4367", :stop-color "#24CECE", :id "stop1661"}]
    [:stop {:offset "0.634", :stop-color "#7BEBF2", :id "stop1663"}]
    [:stop {:offset "0.8245", :stop-color "#99F9FF", :id "stop1665"}]
    [:stop {:offset "1", :stop-color "#BAFDFD", :id "stop1667"}]]
   [:linearGradient {:id "paint3_linear", :x1 "528.901", :y1 "360.966", :x2 "546.089", :y2 "385.513", :gradientUnits "userSpaceOnUse"}
    [:stop {:stop-color "#8FFFFF", :id "stop1670"}]
    [:stop {:offset "1", :stop-color "#45E4EE", :id "stop1672"}]]
   [:linearGradient {:id "paint4_linear", :x1 "554.22", :y1 "352.713", :x2 "527.063", :y2 "368.392", :gradientUnits "userSpaceOnUse"}
    [:stop {:stop-color "#30979B", :id "stop1675"}]
    [:stop {:offset "0.2627", :stop-color "#329B9F", :id "stop1677"}]
    [:stop {:offset "0.7192", :stop-color "#116467", :id "stop1679"}]
    [:stop {:offset "1", :stop-color "#0C4C4F", :id "stop1681"}]]
   [:linearGradient {:id "paint5_linear", :x1 "528.906", :y1 "350.376", :x2 "546.095", :y2 "374.924", :gradientUnits "userSpaceOnUse"}
    [:stop {:stop-color "#002B36", :id "stop1684"}]
    [:stop {:offset "0.230763", :stop-color "#005061", :id "stop1686"}]
    [:stop {:offset "0.64744", :stop-color "#005869", :id "stop1688"}]
    [:stop {:offset "1", :stop-color "#006275", :id "stop1690"}]]
   [:linearGradient {:id "paint6_linear", :x1 "536.691", :y1 "380.982", :x2 "536.691", :y2 "335.05", :gradientUnits "userSpaceOnUse"}
    [:stop {:stop-color "white", :stop-opacity "0", :id "stop1693"}]
    [:stop {:offset "0.291", :stop-color "white", :id "stop1695"}]
    [:stop {:offset "0.9975", :stop-color "white", :stop-opacity "0", :id "stop1697"}]]
   [:linearGradient {:id "paint7_linear", :x1 "262.009", :y1 "175.787", :x2 "234.853", :y2 "191.465", :gradientUnits "userSpaceOnUse"}
    [:stop {:stop-color "#1F898D", :id "stop1700"}]
    [:stop {:offset "0.2627", :stop-color "#1A7E85", :id "stop1702"}]
    [:stop {:offset "0.7192", :stop-color "#127174", :id "stop1704"}]
    [:stop {:offset "1", :stop-color "#116567", :id "stop1706"}]]
   [:linearGradient {:id "paint8_linear", :x1 "236.69", :y1 "173.446", :x2 "253.879", :y2 "197.994", :gradientUnits "userSpaceOnUse"}
    [:stop {:stop-color "#003846", :id "stop1709"}]
    [:stop {:offset "0.0001", :stop-color "#003843", :id "stop1711"}]
    [:stop {:offset "0.3122", :stop-color "#005769", :id "stop1713"}]
    [:stop {:offset "0.7197", :stop-color "#006072", :id "stop1715"}]
    [:stop {:offset "1", :stop-color "#00819A", :id "stop1717"}]]
   [:linearGradient {:id "paint9_linear", :x1 "262.012", :y1 "169.985", :x2 "231.728", :y2 "187.469", :gradientUnits "userSpaceOnUse"}
    [:stop {:stop-color "#1FB2A9", :id "stop1720"}]
    [:stop {:offset "0.2302", :stop-color "#24C4CE", :id "stop1722"}]
    [:stop {:offset "0.4367", :stop-color "#24CECE", :id "stop1724"}]
    [:stop {:offset "0.634", :stop-color "#7BEBF2", :id "stop1726"}]
    [:stop {:offset "0.8245", :stop-color "#99F9FF", :id "stop1728"}]
    [:stop {:offset "1", :stop-color "#BAFDFD", :id "stop1730"}]]
   [:linearGradient {:id "paint10_linear", :x1 "236.687", :y1 "167.641", :x2 "253.876", :y2 "192.189", :gradientUnits "userSpaceOnUse"}
    [:stop {:stop-color "#8FFFFF", :id "stop1733"}]
    [:stop {:offset "1", :stop-color "#45E4EE", :id "stop1735"}]]
   [:linearGradient {:id "paint11_linear", :x1 "262.006", :y1 "159.389", :x2 "234.85", :y2 "175.068", :gradientUnits "userSpaceOnUse"}
    [:stop {:stop-color "#30979B", :id "stop1738"}]
    [:stop {:offset "0.2627", :stop-color "#329B9F", :id "stop1740"}]
    [:stop {:offset "0.7192", :stop-color "#116467", :id "stop1742"}]
    [:stop {:offset "1", :stop-color "#0C4C4F", :id "stop1744"}]]
   [:linearGradient {:id "paint12_linear", :x1 "236.693", :y1 "157.052", :x2 "253.881", :y2 "181.599", :gradientUnits "userSpaceOnUse"}
    [:stop {:stop-color "#002B36", :id "stop1747"}]
    [:stop {:offset "0.230763", :stop-color "#005061", :id "stop1749"}]
    [:stop {:offset "0.64744", :stop-color "#005869", :id "stop1751"}]
    [:stop {:offset "1", :stop-color "#006275", :id "stop1753"}]]
   [:linearGradient {:id "paint13_linear", :x1 "244.477", :y1 "187.657", :x2 "244.477", :y2 "141.726", :gradientUnits "userSpaceOnUse"}
    [:stop {:stop-color "white", :stop-opacity "0", :id "stop1756"}]
    [:stop {:offset "0.291", :stop-color "white", :id "stop1758"}]
    [:stop {:offset "0.9975", :stop-color "white", :stop-opacity "0", :id "stop1760"}]]
   [:linearGradient {:id "paint14_linear", :x1 "380.71", :y1 "291.535", :x2 "351.025", :y2 "302.462", :gradientUnits "userSpaceOnUse"}
    [:stop {:stop-color "#5BF0F9", :stop-opacity "0.3", :id "stop1763"}]
    [:stop {:offset "1", :stop-color "#1F898D", :id "stop1765"}]]
   [:linearGradient {:id "paint15_linear", :x1 "512.719", :y1 "212.7", :x2 "483.034", :y2 "223.627", :gradientUnits "userSpaceOnUse"}
    [:stop {:stop-color "#5BF0F9", :stop-opacity "0.3", :id "stop1768"}]
    [:stop {:offset "1", :stop-color "#1F898D", :id "stop1770"}]]
   [:linearGradient {:id "paint16_linear", :x1 "375.986", :y1 "259.049", :x2 "366.97", :y2 "291.077", :gradientUnits "userSpaceOnUse"}
    [:stop {:stop-color "#5BF0F9", :stop-opacity "0.3", :id "stop1773"}]
    [:stop {:offset "1", :stop-color "#1F898D", :id "stop1775"}]]
   [:linearGradient {:id "paint17_linear", :x1 "507.995", :y1 "180.214", :x2 "498.979", :y2 "212.242", :gradientUnits "userSpaceOnUse"}
    [:stop {:stop-color "#5BF0F9", :stop-opacity "0.3", :id "stop1778"}]
    [:stop {:offset "1", :stop-color "#1F898D", :id "stop1780"}]]
   [:linearGradient {:id "paint18_linear", :x1 "313.88", :y1 "330.648", :x2 "284.195", :y2 "341.575", :gradientUnits "userSpaceOnUse"}
    [:stop {:stop-color "#5BF0F9", :stop-opacity "0.3", :id "stop1783"}]
    [:stop {:offset "1", :stop-color "#1F898D", :id "stop1785"}]]
   [:linearGradient {:id "paint19_linear", :x1 "309.156", :y1 "298.161", :x2 "300.14", :y2 "330.19", :gradientUnits "userSpaceOnUse"}
    [:stop {:stop-color "#5BF0F9", :stop-opacity "0.3", :id "stop1788"}]
    [:stop {:offset "1", :stop-color "#1F898D", :id "stop1790"}]]
   [:linearGradient {:id "paint20_linear", :x1 "248.693", :y1 "369.747", :x2 "219.007", :y2 "380.674", :gradientUnits "userSpaceOnUse"}
    [:stop {:stop-color "#5BF0F9", :stop-opacity "0.3", :id "stop1793"}]
    [:stop {:offset "1", :stop-color "#1F898D", :id "stop1795"}]]
   [:linearGradient {:id "paint21_linear", :x1 "243.968", :y1 "337.261", :x2 "234.952", :y2 "369.29", :gradientUnits "userSpaceOnUse"}
    [:stop {:stop-color "#5BF0F9", :stop-opacity "0.3", :id "stop1798"}]
    [:stop {:offset "1", :stop-color "#1F898D", :id "stop1800"}]]
   [:linearGradient {:id "paint22_linear", :x1 "634.063", :y1 "122.141", :x2 "660.133", :y2 "108.189", :gradientUnits "userSpaceOnUse"}
    [:stop {:stop-color "#494949", :id "stop1803"}]
    [:stop {:offset "0.4259", :stop-color "#525252", :id "stop1805"}]
    [:stop {:offset "1", :stop-color "#656565", :id "stop1807"}]]
   [:linearGradient {:id "paint23_linear", :x1 "664.466", :y1 "104.572", :x2 "685.953", :y2 "126.059", :gradientUnits "userSpaceOnUse"}
    [:stop {:stop-color "#B8B8B8", :id "stop1810"}]
    [:stop {:offset "0.0531", :stop-color "#B0B0B0", :id "stop1812"}]
    [:stop {:offset "0.3337", :stop-color "#8B8B8B", :id "stop1814"}]
    [:stop {:offset "0.5939", :stop-color "#707070", :id "stop1816"}]
    [:stop {:offset "0.8241", :stop-color "#5F5F5F", :id "stop1818"}]
    [:stop {:offset "1", :stop-color "#5A5A5A", :id "stop1820"}]]
   [:linearGradient {:id "paint24_linear", :x1 "653.651", :y1 "103.205", :x2 "670.783", :y2 "76.3852", :gradientUnits "userSpaceOnUse"}
    [:stop {:stop-color "#787878", :id "stop1823"}]
    [:stop {:offset "0.5984", :stop-color "#636363", :id "stop1825"}]
    [:stop {:offset "1", :stop-color "#5A5A5A", :id "stop1827"}]]
   [:linearGradient {:id "paint25_linear", :x1 "566.066", :y1 "161.962", :x2 "592.135", :y2 "148.01", :gradientUnits "userSpaceOnUse"}
    [:stop {:stop-color "#7D9D9F", :id "stop1830"}]
    [:stop {:offset "0.2857", :stop-color "#1FB2A9", :id "stop1832"}]
    [:stop {:offset "0.75", :stop-color "#2BCACA", :id "stop1834"}]
    [:stop {:offset "1", :stop-color "#32DADA", :id "stop1836"}]]
   [:linearGradient {:id "paint26_linear", :x1 "596.731", :y1 "144.182", :x2 "618.639", :y2 "166.089", :gradientUnits "userSpaceOnUse"}
    [:stop {:stop-color "#99F9FF", :id "stop1839"}]
    [:stop {:offset "0.1701", :stop-color "#7BEBF2", :id "stop1841"}]
    [:stop {:offset "0.4158", :stop-color "#55DAE3", :id "stop1843"}]
    [:stop {:offset "0.6441", :stop-color "#3ACED7", :id "stop1845"}]
    [:stop {:offset "0.8458", :stop-color "#2AC6D0", :id "stop1847"}]
    [:stop {:offset "1", :stop-color "#24C4CE", :id "stop1849"}]]
   [:linearGradient {:id "paint27_linear", :x1 "586.018", :y1 "143.23", :x2 "603.294", :y2 "116.185", :gradientUnits "userSpaceOnUse"}
    [:stop {:stop-color "#48DDE6", :id "stop1852"}]
    [:stop {:offset "0.0585", :stop-color "#45E4E4", :id "stop1854"}]
    [:stop {:offset "0.6415", :stop-color "#2DD4D4", :id "stop1856"}]
    [:stop {:offset "1", :stop-color "#24CECE", :id "stop1858"}]]
   [:linearGradient {:id "paint28_linear", :x1 "604.216", :y1 "136.703", :x2 "610.166", :y2 "142.653", :gradientUnits "userSpaceOnUse"}
    [:stop {:stop-color "white", :id "stop1861"}]
    [:stop {:offset "0.2713", :stop-color "#BAF9FD", :id "stop1863"}]
    [:stop {:offset "0.5184", :stop-color "#83FBFB", :id "stop1865"}]
    [:stop {:offset "0.7299", :stop-color "#5BF0F9", :id "stop1867"}]
    [:stop {:offset "0.8974", :stop-color "#43F8F8", :id "stop1869"}]
    [:stop {:offset "1", :stop-color "#3AEDF8", :id "stop1871"}]]
   [:linearGradient {:id "paint29_linear", :x1 "581.941", :y1 "137.396", :x2 "577.456", :y2 "141.881", :gradientUnits "userSpaceOnUse"}
    [:stop {:stop-color "white", :id "stop1874"}]
    [:stop {:offset "0.2713", :stop-color "#BAFDFD", :id "stop1876"}]
    [:stop {:offset "0.5184", :stop-color "#83FBFB", :id "stop1878"}]
    [:stop {:offset "0.7299", :stop-color "#5BF0F9", :id "stop1880"}]
    [:stop {:offset "0.8974", :stop-color "#43EDF8", :id "stop1882"}]
    [:stop {:offset "1", :stop-color "#3AEDF8", :id "stop1884"}]]
   [:linearGradient {:id "paint30_linear", :x1 "585.273", :y1 "156.025", :x2 "600.557", :y2 "171.31", :gradientUnits "userSpaceOnUse"}
    [:stop {:stop-color "white", :id "stop1887"}]
    [:stop {:offset "0.2713", :stop-color "#BAF9FD", :id "stop1889"}]
    [:stop {:offset "0.5184", :stop-color "#83FBFB", :id "stop1891"}]
    [:stop {:offset "0.7299", :stop-color "#5BF0F9", :id "stop1893"}]
    [:stop {:offset "0.8974", :stop-color "#43EDF8", :id "stop1895"}]
    [:stop {:offset "1", :stop-color "#3AEDF8", :id "stop1897"}]]
   [:linearGradient {:id "paint31_linear", :x1 "167.836", :y1 "398.049", :x2 "193.904", :y2 "384.097", :gradientUnits "userSpaceOnUse"}
    [:stop {:stop-color "#7D9D9F", :id "stop1900"}]
    [:stop {:offset "0.2857", :stop-color "#1FB2A9", :id "stop1902"}]
    [:stop {:offset "0.75", :stop-color "#2BCACA", :id "stop1904"}]
    [:stop {:offset "1", :stop-color "#32DADA", :id "stop1906"}]]
   [:linearGradient {:id "paint32_linear", :x1 "198.501", :y1 "380.27", :x2 "220.408", :y2 "402.177", :gradientUnits "userSpaceOnUse"}
    [:stop {:stop-color "#99F9FF", :id "stop1909"}]
    [:stop {:offset "0.1701", :stop-color "#7BEBF2", :id "stop1911"}]
    [:stop {:offset "0.4158", :stop-color "#55DAE3", :id "stop1913"}]
    [:stop {:offset "0.6441", :stop-color "#3ACED7", :id "stop1915"}]
    [:stop {:offset "0.8458", :stop-color "#2AC6D0", :id "stop1917"}]
    [:stop {:offset "1", :stop-color "#24C4CE", :id "stop1919"}]]
   [:linearGradient {:id "paint33_linear", :x1 "187.788", :y1 "379.318", :x2 "205.064", :y2 "352.273", :gradientUnits "userSpaceOnUse"}
    [:stop {:stop-color "#48DDE6", :id "stop1922"}]
    [:stop {:offset "0.0585", :stop-color "#45E4E4", :id "stop1924"}]
    [:stop {:offset "0.6415", :stop-color "#2DD4D4", :id "stop1926"}]
    [:stop {:offset "1", :stop-color "#24CECE", :id "stop1928"}]]
   [:linearGradient {:id "paint34_linear", :x1 "205.985", :y1 "372.791", :x2 "211.935", :y2 "378.74", :gradientUnits "userSpaceOnUse"}
    [:stop {:stop-color "white", :id "stop1931"}]
    [:stop {:offset "0.2713", :stop-color "#BAF9FD", :id "stop1933"}]
    [:stop {:offset "0.5184", :stop-color "#83FBFB", :id "stop1935"}]
    [:stop {:offset "0.7299", :stop-color "#5BF0F9", :id "stop1937"}]
    [:stop {:offset "0.8974", :stop-color "#43F8F8", :id "stop1939"}]
    [:stop {:offset "1", :stop-color "#3AEDF8", :id "stop1941"}]]
   [:linearGradient {:id "paint35_linear", :x1 "183.711", :y1 "373.484", :x2 "179.226", :y2 "377.968", :gradientUnits "userSpaceOnUse"}
    [:stop {:stop-color "white", :id "stop1944"}]
    [:stop {:offset "0.2713", :stop-color "#BAFDFD", :id "stop1946"}]
    [:stop {:offset "0.5184", :stop-color "#83FBFB", :id "stop1948"}]
    [:stop {:offset "0.7299", :stop-color "#5BF0F9", :id "stop1950"}]
    [:stop {:offset "0.8974", :stop-color "#43EDF8", :id "stop1952"}]
    [:stop {:offset "1", :stop-color "#3AEDF8", :id "stop1954"}]]
   [:linearGradient {:id "paint36_linear", :x1 "187.042", :y1 "392.113", :x2 "202.327", :y2 "407.398", :gradientUnits "userSpaceOnUse"}
    [:stop {:stop-color "white", :id "stop1957"}]
    [:stop {:offset "0.2713", :stop-color "#BAF9FD", :id "stop1959"}]
    [:stop {:offset "0.5184", :stop-color "#83FBFB", :id "stop1961"}]
    [:stop {:offset "0.7299", :stop-color "#5BF0F9", :id "stop1963"}]
    [:stop {:offset "0.8974", :stop-color "#43EDF8", :id "stop1965"}]
    [:stop {:offset "1", :stop-color "#3AEDF8", :id "stop1967"}]]
   [:linearGradient {:id "paint37_linear", :x1 "432.432", :y1 "240.361", :x2 "458.5", :y2 "226.409", :gradientUnits "userSpaceOnUse"}
    [:stop {:stop-color "#7D9D9F", :id "stop1970"}]
    [:stop {:offset "0.2857", :stop-color "#1FB2A9", :id "stop1972"}]
    [:stop {:offset "0.75", :stop-color "#2BCACA", :id "stop1974"}]
    [:stop {:offset "1", :stop-color "#32DADA", :id "stop1976"}]]
   [:linearGradient {:id "paint38_linear", :x1 "463.096", :y1 "222.581", :x2 "485.004", :y2 "244.488", :gradientUnits "userSpaceOnUse"}
    [:stop {:stop-color "#99F9FF", :id "stop1979"}]
    [:stop {:offset "0.1701", :stop-color "#7BEBF2", :id "stop1981"}]
    [:stop {:offset "0.4158", :stop-color "#55DAE3", :id "stop1983"}]
    [:stop {:offset "0.6441", :stop-color "#3ACED7", :id "stop1985"}]
    [:stop {:offset "0.8458", :stop-color "#2AC6D0", :id "stop1987"}]
    [:stop {:offset "1", :stop-color "#24C4CE", :id "stop1989"}]]
   [:linearGradient {:id "paint39_linear", :x1 "452.384", :y1 "221.629", :x2 "469.66", :y2 "194.584", :gradientUnits "userSpaceOnUse"}
    [:stop {:stop-color "#48DDE6", :id "stop1992"}]
    [:stop {:offset "0.0585", :stop-color "#45E4E4", :id "stop1994"}]
    [:stop {:offset "0.6415", :stop-color "#2DD4D4", :id "stop1996"}]
    [:stop {:offset "1", :stop-color "#24CECE", :id "stop1998"}]]
   [:linearGradient {:id "paint40_linear", :x1 "470.581", :y1 "215.102", :x2 "476.531", :y2 "221.052", :gradientUnits "userSpaceOnUse"}
    [:stop {:stop-color "white", :id "stop2001"}]
    [:stop {:offset "0.2713", :stop-color "#BAF9FD", :id "stop2003"}]
    [:stop {:offset "0.5184", :stop-color "#83FBFB", :id "stop2005"}]
    [:stop {:offset "0.7299", :stop-color "#5BF0F9", :id "stop2007"}]
    [:stop {:offset "0.8974", :stop-color "#43F8F8", :id "stop2009"}]
    [:stop {:offset "1", :stop-color "#3AEDF8", :id "stop2011"}]]
   [:linearGradient {:id "paint41_linear", :x1 "448.307", :y1 "215.795", :x2 "443.822", :y2 "220.28", :gradientUnits "userSpaceOnUse"}
    [:stop {:stop-color "white", :id "stop2014"}]
    [:stop {:offset "0.2713", :stop-color "#BAFDFD", :id "stop2016"}]
    [:stop {:offset "0.5184", :stop-color "#83FBFB", :id "stop2018"}]
    [:stop {:offset "0.7299", :stop-color "#5BF0F9", :id "stop2020"}]
    [:stop {:offset "0.8974", :stop-color "#43EDF8", :id "stop2022"}]
    [:stop {:offset "1", :stop-color "#3AEDF8", :id "stop2024"}]]
   [:linearGradient {:id "paint42_linear", :x1 "451.638", :y1 "234.424", :x2 "466.923", :y2 "249.709", :gradientUnits "userSpaceOnUse"}
    [:stop {:stop-color "white", :id "stop2027"}]
    [:stop {:offset "0.2713", :stop-color "#BAF9FD", :id "stop2029"}]
    [:stop {:offset "0.5184", :stop-color "#83FBFB", :id "stop2031"}]
    [:stop {:offset "0.7299", :stop-color "#5BF0F9", :id "stop2033"}]
    [:stop {:offset "0.8974", :stop-color "#43EDF8", :id "stop2035"}]
    [:stop {:offset "1", :stop-color "#3AEDF8", :id "stop2037"}]]
   [:linearGradient {:id "paint43_linear", :x1 "365.614", :y1 "279.56", :x2 "391.683", :y2 "265.608", :gradientUnits "userSpaceOnUse"}
    [:stop {:stop-color "#7D9D9F", :id "stop2040"}]
    [:stop {:offset "0.2857", :stop-color "#1FB2A9", :id "stop2042"}]
    [:stop {:offset "0.75", :stop-color "#2BCACA", :id "stop2044"}]
    [:stop {:offset "1", :stop-color "#32DADA", :id "stop2046"}]]
   [:linearGradient {:id "paint44_linear", :x1 "396.279", :y1 "261.78", :x2 "418.187", :y2 "283.688", :gradientUnits "userSpaceOnUse"}
    [:stop {:stop-color "#99F9FF", :id "stop2049"}]
    [:stop {:offset "0.1701", :stop-color "#7BEBF2", :id "stop2051"}]
    [:stop {:offset "0.4158", :stop-color "#55DAE3", :id "stop2053"}]
    [:stop {:offset "0.6441", :stop-color "#3ACED7", :id "stop2055"}]
    [:stop {:offset "0.8458", :stop-color "#2AC6D0", :id "stop2057"}]
    [:stop {:offset "1", :stop-color "#24C4CE", :id "stop2059"}]]
   [:linearGradient {:id "paint45_linear", :x1 "385.567", :y1 "260.828", :x2 "402.843", :y2 "233.783", :gradientUnits "userSpaceOnUse"}
    [:stop {:stop-color "#48DDE6", :id "stop2062"}]
    [:stop {:offset "0.0585", :stop-color "#45E4E4", :id "stop2064"}]
    [:stop {:offset "0.6415", :stop-color "#2DD4D4", :id "stop2066"}]
    [:stop {:offset "1", :stop-color "#24CECE", :id "stop2068"}]]
   [:linearGradient {:id "paint46_linear", :x1 "403.764", :y1 "254.301", :x2 "409.714", :y2 "260.251", :gradientUnits "userSpaceOnUse"}
    [:stop {:stop-color "white", :id "stop2071"}]
    [:stop {:offset "0.2713", :stop-color "#BAF9FD", :id "stop2073"}]
    [:stop {:offset "0.5184", :stop-color "#83FBFB", :id "stop2075"}]
    [:stop {:offset "0.7299", :stop-color "#5BF0F9", :id "stop2077"}]
    [:stop {:offset "0.8974", :stop-color "#43F8F8", :id "stop2079"}]
    [:stop {:offset "1", :stop-color "#3AEDF8", :id "stop2081"}]]
   [:linearGradient {:id "paint47_linear", :x1 "381.489", :y1 "254.994", :x2 "377.005", :y2 "259.479", :gradientUnits "userSpaceOnUse"}
    [:stop {:stop-color "white", :id "stop2084"}]
    [:stop {:offset "0.2713", :stop-color "#BAFDFD", :id "stop2086"}]
    [:stop {:offset "0.5184", :stop-color "#83FBFB", :id "stop2088"}]
    [:stop {:offset "0.7299", :stop-color "#5BF0F9", :id "stop2090"}]
    [:stop {:offset "0.8974", :stop-color "#43EDF8", :id "stop2092"}]
    [:stop {:offset "1", :stop-color "#3AEDF8", :id "stop2094"}]]
   [:linearGradient {:id "paint48_linear", :x1 "384.821", :y1 "273.624", :x2 "400.106", :y2 "288.909", :gradientUnits "userSpaceOnUse"}
    [:stop {:stop-color "white", :id "stop2097"}]
    [:stop {:offset "0.2713", :stop-color "#BAF9FD", :id "stop2099"}]
    [:stop {:offset "0.5184", :stop-color "#83FBFB", :id "stop2101"}]
    [:stop {:offset "0.7299", :stop-color "#5BF0F9", :id "stop2103"}]
    [:stop {:offset "0.8974", :stop-color "#43EDF8", :id "stop2105"}]
    [:stop {:offset "1", :stop-color "#3AEDF8", :id "stop2107"}]]
   [:linearGradient {:id "paint49_linear", :x1 "300.579", :y1 "319.65", :x2 "326.648", :y2 "305.698", :gradientUnits "userSpaceOnUse"}
    [:stop {:stop-color "#7D9D9F", :id "stop2110"}]
    [:stop {:offset "0.2857", :stop-color "#1FB2A9", :id "stop2112"}]
    [:stop {:offset "0.75", :stop-color "#2BCACA", :id "stop2114"}]
    [:stop {:offset "1", :stop-color "#32DADA", :id "stop2116"}]]
   [:linearGradient {:id "paint50_linear", :x1 "331.244", :y1 "301.871", :x2 "353.151", :y2 "323.778", :gradientUnits "userSpaceOnUse"}
    [:stop {:stop-color "#99F9FF", :id "stop2119"}]
    [:stop {:offset "0.1701", :stop-color "#7BEBF2", :id "stop2121"}]
    [:stop {:offset "0.4158", :stop-color "#55DAE3", :id "stop2123"}]
    [:stop {:offset "0.6441", :stop-color "#3ACED7", :id "stop2125"}]
    [:stop {:offset "0.8458", :stop-color "#2AC6D0", :id "stop2127"}]
    [:stop {:offset "1", :stop-color "#24C4CE", :id "stop2129"}]]
   [:linearGradient {:id "paint51_linear", :x1 "320.531", :y1 "300.919", :x2 "337.807", :y2 "273.874", :gradientUnits "userSpaceOnUse"}
    [:stop {:stop-color "#48DDE6", :id "stop2132"}]
    [:stop {:offset "0.0585", :stop-color "#45E4E4", :id "stop2134"}]
    [:stop {:offset "0.6415", :stop-color "#2DD4D4", :id "stop2136"}]
    [:stop {:offset "1", :stop-color "#24CECE", :id "stop2138"}]]
   [:linearGradient {:id "paint52_linear", :x1 "338.729", :y1 "294.392", :x2 "344.678", :y2 "300.342", :gradientUnits "userSpaceOnUse"}
    [:stop {:stop-color "white", :id "stop2141"}]
    [:stop {:offset "0.2713", :stop-color "#BAF9FD", :id "stop2143"}]
    [:stop {:offset "0.5184", :stop-color "#83FBFB", :id "stop2145"}]
    [:stop {:offset "0.7299", :stop-color "#5BF0F9", :id "stop2147"}]
    [:stop {:offset "0.8974", :stop-color "#43F8F8", :id "stop2149"}]
    [:stop {:offset "1", :stop-color "#3AEDF8", :id "stop2151"}]]
   [:linearGradient {:id "paint53_linear", :x1 "316.454", :y1 "295.085", :x2 "311.969", :y2 "299.569", :gradientUnits "userSpaceOnUse"}
    [:stop {:stop-color "white", :id "stop2154"}]
    [:stop {:offset "0.2713", :stop-color "#BAFDFD", :id "stop2156"}]
    [:stop {:offset "0.5184", :stop-color "#83FBFB", :id "stop2158"}]
    [:stop {:offset "0.7299", :stop-color "#5BF0F9", :id "stop2160"}]
    [:stop {:offset "0.8974", :stop-color "#43EDF8", :id "stop2162"}]
    [:stop {:offset "1", :stop-color "#3AEDF8", :id "stop2164"}]]
   [:linearGradient {:id "paint54_linear", :x1 "319.786", :y1 "313.714", :x2 "335.07", :y2 "328.999", :gradientUnits "userSpaceOnUse"}
    [:stop {:stop-color "white", :id "stop2167"}]
    [:stop {:offset "0.2713", :stop-color "#BAF9FD", :id "stop2169"}]
    [:stop {:offset "0.5184", :stop-color "#83FBFB", :id "stop2171"}]
    [:stop {:offset "0.7299", :stop-color "#5BF0F9", :id "stop2173"}]
    [:stop {:offset "0.8974", :stop-color "#43EDF8", :id "stop2175"}]
    [:stop {:offset "1", :stop-color "#3AEDF8", :id "stop2177"}]]
   [:linearGradient {:id "paint55_linear", :x1 "232.871", :y1 "357.959", :x2 "258.939", :y2 "344.007", :gradientUnits "userSpaceOnUse"}
    [:stop {:stop-color "#7D9D9F", :id "stop2180"}]
    [:stop {:offset "0.2857", :stop-color "#1FB2A9", :id "stop2182"}]
    [:stop {:offset "0.75", :stop-color "#2BCACA", :id "stop2184"}]
    [:stop {:offset "1", :stop-color "#32DADA", :id "stop2186"}]]
   [:linearGradient {:id "paint56_linear", :x1 "263.536", :y1 "340.179", :x2 "285.443", :y2 "362.087", :gradientUnits "userSpaceOnUse"}
    [:stop {:stop-color "#99F9FF", :id "stop2189"}]
    [:stop {:offset "0.1701", :stop-color "#7BEBF2", :id "stop2191"}]
    [:stop {:offset "0.4158", :stop-color "#55DAE3", :id "stop2193"}]
    [:stop {:offset "0.6441", :stop-color "#3ACED7", :id "stop2195"}]
    [:stop {:offset "0.8458", :stop-color "#2AC6D0", :id "stop2197"}]
    [:stop {:offset "1", :stop-color "#24C4CE", :id "stop2199"}]]
   [:linearGradient {:id "paint57_linear", :x1 "252.823", :y1 "339.227", :x2 "270.099", :y2 "312.182", :gradientUnits "userSpaceOnUse"}
    [:stop {:stop-color "#48DDE6", :id "stop2202"}]
    [:stop {:offset "0.0585", :stop-color "#45E4E4", :id "stop2204"}]
    [:stop {:offset "0.6415", :stop-color "#2DD4D4", :id "stop2206"}]
    [:stop {:offset "1", :stop-color "#24CECE", :id "stop2208"}]]
   [:linearGradient {:id "paint58_linear", :x1 "271.02", :y1 "332.7", :x2 "276.97", :y2 "338.65", :gradientUnits "userSpaceOnUse"}
    [:stop {:stop-color "white", :id "stop2211"}]
    [:stop {:offset "0.2713", :stop-color "#BAF9FD", :id "stop2213"}]
    [:stop {:offset "0.5184", :stop-color "#83FBFB", :id "stop2215"}]
    [:stop {:offset "0.7299", :stop-color "#5BF0F9", :id "stop2217"}]
    [:stop {:offset "0.8974", :stop-color "#43F8F8", :id "stop2219"}]
    [:stop {:offset "1", :stop-color "#3AEDF8", :id "stop2221"}]]
   [:linearGradient {:id "paint59_linear", :x1 "248.746", :y1 "333.393", :x2 "244.261", :y2 "337.878", :gradientUnits "userSpaceOnUse"}
    [:stop {:stop-color "white", :id "stop2224"}]
    [:stop {:offset "0.2713", :stop-color "#BAFDFD", :id "stop2226"}]
    [:stop {:offset "0.5184", :stop-color "#83FBFB", :id "stop2228"}]
    [:stop {:offset "0.7299", :stop-color "#5BF0F9", :id "stop2230"}]
    [:stop {:offset "0.8974", :stop-color "#43EDF8", :id "stop2232"}]
    [:stop {:offset "1", :stop-color "#3AEDF8", :id "stop2234"}]]
   [:linearGradient {:id "paint60_linear", :x1 "252.077", :y1 "352.023", :x2 "267.362", :y2 "367.308", :gradientUnits "userSpaceOnUse"}
    [:stop {:stop-color "white", :id "stop2237"}]
    [:stop {:offset "0.2713", :stop-color "#BAF9FD", :id "stop2239"}]
    [:stop {:offset "0.5184", :stop-color "#83FBFB", :id "stop2241"}]
    [:stop {:offset "0.7299", :stop-color "#5BF0F9", :id "stop2243"}]
    [:stop {:offset "0.8974", :stop-color "#43EDF8", :id "stop2245"}]
    [:stop {:offset "1", :stop-color "#3AEDF8", :id "stop2247"}]]
   [:linearGradient {:spreadMethod "pad", :id "paint61_linear", :x1 "168.726", :y1 "398.04901", :x2 "194.795", :y2 "384.09698", :gradientUnits "userSpaceOnUse"}
    [:stop {:stop-color "#7D9D9F", :id "stop2250"}]
    [:stop {:offset "0.2857", :stop-color "#1FB2A9", :id "stop2252"}]
    [:stop {:offset "0.75", :stop-color "#2BCACA", :id "stop2254"}]
    [:stop {:offset "1", :stop-color "#32DADA", :id "stop2256"}]]
   [:linearGradient {:id "paint62_linear", :x1 "199.391", :y1 "380.27", :x2 "221.298", :y2 "402.177", :gradientUnits "userSpaceOnUse"}
    [:stop {:stop-color "#99F9FF", :id "stop2259"}]
    [:stop {:offset "0.1701", :stop-color "#7BEBF2", :id "stop2261"}]
    [:stop {:offset "0.4158", :stop-color "#55DAE3", :id "stop2263"}]
    [:stop {:offset "0.6441", :stop-color "#3ACED7", :id "stop2265"}]
    [:stop {:offset "0.8458", :stop-color "#2AC6D0", :id "stop2267"}]
    [:stop {:offset "1", :stop-color "#24C4CE", :id "stop2269"}]]
   [:linearGradient {:id "paint63_linear", :x1 "188.679", :y1 "379.318", :x2 "205.954", :y2 "352.273", :gradientUnits "userSpaceOnUse"}
    [:stop {:stop-color "#48DDE6", :id "stop2272"}]
    [:stop {:offset "0.0585", :stop-color "#45E4E4", :id "stop2274"}]
    [:stop {:offset "0.6415", :stop-color "#2DD4D4", :id "stop2276"}]
    [:stop {:offset "1", :stop-color "#24CECE", :id "stop2278"}]]
   [:linearGradient {:id "paint64_linear", :x1 "206.876", :y1 "372.791", :x2 "212.826", :y2 "378.74", :gradientUnits "userSpaceOnUse"}
    [:stop {:stop-color "white", :id "stop2281"}]
    [:stop {:offset "0.2713", :stop-color "#BAF9FD", :id "stop2283"}]
    [:stop {:offset "0.5184", :stop-color "#83FBFB", :id "stop2285"}]
    [:stop {:offset "0.7299", :stop-color "#5BF0F9", :id "stop2287"}]
    [:stop {:offset "0.8974", :stop-color "#43F8F8", :id "stop2289"}]
    [:stop {:offset "1", :stop-color "#3AEDF8", :id "stop2291"}]]
   [:linearGradient {:id "paint65_linear", :x1 "184.601", :y1 "373.484", :x2 "180.116", :y2 "377.968", :gradientUnits "userSpaceOnUse"}
    [:stop {:stop-color "white", :id "stop2294"}]
    [:stop {:offset "0.2713", :stop-color "#BAFDFD", :id "stop2296"}]
    [:stop {:offset "0.5184", :stop-color "#83FBFB", :id "stop2298"}]
    [:stop {:offset "0.7299", :stop-color "#5BF0F9", :id "stop2300"}]
    [:stop {:offset "0.8974", :stop-color "#43EDF8", :id "stop2302"}]
    [:stop {:offset "1", :stop-color "#3AEDF8", :id "stop2304"}]]
   [:linearGradient {:id "paint66_linear", :x1 "187.933", :y1 "392.113", :x2 "203.217", :y2 "407.398", :gradientUnits "userSpaceOnUse"}
    [:stop {:stop-color "white", :id "stop2307"}]
    [:stop {:offset "0.2713", :stop-color "#BAF9FD", :id "stop2309"}]
    [:stop {:offset "0.5184", :stop-color "#83FBFB", :id "stop2311"}]
    [:stop {:offset "0.7299", :stop-color "#5BF0F9", :id "stop2313"}]
    [:stop {:offset "0.8974", :stop-color "#43EDF8", :id "stop2315"}]
    [:stop {:offset "1", :stop-color "#3AEDF8", :id "stop2317"}]]
   [:linearGradient {:id "paint67_linear", :x1 "499.249", :y1 "201.161", :x2 "525.317", :y2 "187.209", :gradientUnits "userSpaceOnUse"}
    [:stop {:stop-color "#7D9D9F", :id "stop2320"}]
    [:stop {:offset "0.2857", :stop-color "#1FB2A9", :id "stop2322"}]
    [:stop {:offset "0.75", :stop-color "#2BCACA", :id "stop2324"}]
    [:stop {:offset "1", :stop-color "#32DADA", :id "stop2326"}]]
   [:linearGradient {:id "paint68_linear", :x1 "529.914", :y1 "183.382", :x2 "551.821", :y2 "205.289", :gradientUnits "userSpaceOnUse"}
    [:stop {:stop-color "#99F9FF", :id "stop2329"}]
    [:stop {:offset "0.1701", :stop-color "#7BEBF2", :id "stop2331"}]
    [:stop {:offset "0.4158", :stop-color "#55DAE3", :id "stop2333"}]
    [:stop {:offset "0.6441", :stop-color "#3ACED7", :id "stop2335"}]
    [:stop {:offset "0.8458", :stop-color "#2AC6D0", :id "stop2337"}]
    [:stop {:offset "1", :stop-color "#24C4CE", :id "stop2339"}]]
   [:linearGradient {:id "paint69_linear", :x1 "519.201", :y1 "182.43", :x2 "536.477", :y2 "155.385", :gradientUnits "userSpaceOnUse"}
    [:stop {:stop-color "#48DDE6", :id "stop2342"}]
    [:stop {:offset "0.0585", :stop-color "#45E4E4", :id "stop2344"}]
    [:stop {:offset "0.6415", :stop-color "#2DD4D4", :id "stop2346"}]
    [:stop {:offset "1", :stop-color "#24CECE", :id "stop2348"}]]
   [:linearGradient {:id "paint70_linear", :x1 "537.398", :y1 "175.903", :x2 "543.348", :y2 "181.852", :gradientUnits "userSpaceOnUse"}
    [:stop {:stop-color "white", :id "stop2351"}]
    [:stop {:offset "0.2713", :stop-color "#BAF9FD", :id "stop2353"}]
    [:stop {:offset "0.5184", :stop-color "#83FBFB", :id "stop2355"}]
    [:stop {:offset "0.7299", :stop-color "#5BF0F9", :id "stop2357"}]
    [:stop {:offset "0.8974", :stop-color "#43F8F8", :id "stop2359"}]
    [:stop {:offset "1", :stop-color "#3AEDF8", :id "stop2361"}]]
   [:linearGradient {:id "paint71_linear", :x1 "515.124", :y1 "176.595", :x2 "510.639", :y2 "181.08", :gradientUnits "userSpaceOnUse"}
    [:stop {:stop-color "white", :id "stop2364"}]
    [:stop {:offset "0.2713", :stop-color "#BAFDFD", :id "stop2366"}]
    [:stop {:offset "0.5184", :stop-color "#83FBFB", :id "stop2368"}]
    [:stop {:offset "0.7299", :stop-color "#5BF0F9", :id "stop2370"}]
    [:stop {:offset "0.8974", :stop-color "#43EDF8", :id "stop2372"}]
    [:stop {:offset "1", :stop-color "#3AEDF8", :id "stop2374"}]]
   [:linearGradient {:id "paint72_linear", :x1 "518.455", :y1 "195.225", :x2 "533.74", :y2 "210.51", :gradientUnits "userSpaceOnUse"}
    [:stop {:stop-color "white", :id "stop2377"}]
    [:stop {:offset "0.2713", :stop-color "#BAF9FD", :id "stop2379"}]
    [:stop {:offset "0.5184", :stop-color "#83FBFB", :id "stop2381"}]
    [:stop {:offset "0.7299", :stop-color "#5BF0F9", :id "stop2383"}]
    [:stop {:offset "0.8974", :stop-color "#43EDF8", :id "stop2385"}]
    [:stop {:offset "1", :stop-color "#3AEDF8", :id "stop2387"}]]
   [:linearGradient {:id "paint73_linear", :x1 "566.066", :y1 "161.962", :x2 "592.135", :y2 "148.01", :gradientUnits "userSpaceOnUse"}
    [:stop {:stop-color "#7D9D9F", :id "stop2390"}]
    [:stop {:offset "0.2857", :stop-color "#1FB2A9", :id "stop2392"}]
    [:stop {:offset "0.75", :stop-color "#2BCACA", :id "stop2394"}]
    [:stop {:offset "1", :stop-color "#32DADA", :id "stop2396"}]]
   [:linearGradient {:id "paint74_linear", :x1 "596.731", :y1 "144.182", :x2 "618.638", :y2 "166.089", :gradientUnits "userSpaceOnUse"}
    [:stop {:stop-color "#99F9FF", :id "stop2399"}]
    [:stop {:offset "0.1701", :stop-color "#7BEBF2", :id "stop2401"}]
    [:stop {:offset "0.4158", :stop-color "#55DAE3", :id "stop2403"}]
    [:stop {:offset "0.6441", :stop-color "#3ACED7", :id "stop2405"}]
    [:stop {:offset "0.8458", :stop-color "#2AC6D0", :id "stop2407"}]
    [:stop {:offset "1", :stop-color "#24C4CE", :id "stop2409"}]]
   [:linearGradient {:id "paint75_linear", :x1 "586.019", :y1 "143.23", :x2 "603.295", :y2 "116.185", :gradientUnits "userSpaceOnUse"}
    [:stop {:stop-color "#48DDE6", :id "stop2412"}]
    [:stop {:offset "0.0585", :stop-color "#45E4E4", :id "stop2414"}]
    [:stop {:offset "0.6415", :stop-color "#2DD4D4", :id "stop2416"}]
    [:stop {:offset "1", :stop-color "#24CECE", :id "stop2418"}]]
   [:linearGradient {:id "paint76_linear", :x1 "604.216", :y1 "136.703", :x2 "610.165", :y2 "142.653", :gradientUnits "userSpaceOnUse"}
    [:stop {:stop-color "white", :id "stop2421"}]
    [:stop {:offset "0.2713", :stop-color "#BAF9FD", :id "stop2423"}]
    [:stop {:offset "0.5184", :stop-color "#83FBFB", :id "stop2425"}]
    [:stop {:offset "0.7299", :stop-color "#5BF0F9", :id "stop2427"}]
    [:stop {:offset "0.8974", :stop-color "#43F8F8", :id "stop2429"}]
    [:stop {:offset "1", :stop-color "#3AEDF8", :id "stop2431"}]]
   [:linearGradient {:id "paint77_linear", :x1 "581.941", :y1 "137.396", :x2 "577.456", :y2 "141.881", :gradientUnits "userSpaceOnUse"}
    [:stop {:stop-color "white", :id "stop2434"}]
    [:stop {:offset "0.2713", :stop-color "#BAFDFD", :id "stop2436"}]
    [:stop {:offset "0.5184", :stop-color "#83FBFB", :id "stop2438"}]
    [:stop {:offset "0.7299", :stop-color "#5BF0F9", :id "stop2440"}]
    [:stop {:offset "0.8974", :stop-color "#43EDF8", :id "stop2442"}]
    [:stop {:offset "1", :stop-color "#3AEDF8", :id "stop2444"}]]
   [:linearGradient {:id "paint78_linear", :x1 "585.273", :y1 "156.025", :x2 "600.557", :y2 "171.31", :gradientUnits "userSpaceOnUse"}
    [:stop {:stop-color "white", :id "stop2447"}]
    [:stop {:offset "0.2713", :stop-color "#BAF9FD", :id "stop2449"}]
    [:stop {:offset "0.5184", :stop-color "#83FBFB", :id "stop2451"}]
    [:stop {:offset "0.7299", :stop-color "#5BF0F9", :id "stop2453"}]
    [:stop {:offset "0.8974", :stop-color "#43EDF8", :id "stop2455"}]
    [:stop {:offset "1", :stop-color "#3AEDF8", :id "stop2457"}]]
   [:linearGradient {:id "paint79_linear", :x1 "409.468", :y1 "138.427", :x2 "427.515", :y2 "128.771", :gradientUnits "userSpaceOnUse"}
    [:stop {:stop-color "#0A393B", :id "stop2460"}]
    [:stop {:offset "0.459935", :stop-color "#0C4C4F", :id "stop2462"}]
    [:stop {:offset "1", :stop-color "#105F62", :id "stop2464"}]]
   [:linearGradient {:id "paint80_linear", :x1 "430.637", :y1 "126.199", :x2 "445.645", :y2 "141.21", :gradientUnits "userSpaceOnUse"}
    [:stop {:stop-color "#147B7F", :id "stop2467"}]
    [:stop {:offset "0.308889", :stop-color "#116567", :id "stop2469"}]
    [:stop {:offset "0.704733", :stop-color "#0C5054", :id "stop2471"}]
    [:stop {:offset "1", :stop-color "#093839", :id "stop2473"}]]
   [:linearGradient {:id "paint81_linear", :x1 "423.241", :y1 "125.531", :x2 "435.088", :y2 "106.989", :gradientUnits "userSpaceOnUse"}
    [:stop {:stop-color "#116467", :id "stop2476"}]
    [:stop {:offset "0.51202", :stop-color "#0C4B4E", :id "stop2478"}]
    [:stop {:offset "1", :stop-color "#093335", :id "stop2480"}]]
   [:linearGradient {:id "paint82_linear", :x1 "435.902", :y1 "120.945", :x2 "439.949", :y2 "125.078", :gradientUnits "userSpaceOnUse"}
    [:stop {:stop-color "#CFF5F8", :id "stop2483"}]
    [:stop {:offset "0.2713", :stop-color "#96DFE3", :id "stop2485"}]
    [:stop {:offset "0.5184", :stop-color "#68C8C8", :id "stop2487"}]
    [:stop {:offset "0.7299", :stop-color "#41B3BA", :id "stop2489"}]
    [:stop {:offset "0.8974", :stop-color "#29A3A3", :id "stop2491"}]
    [:stop {:offset "1", :stop-color "#1A7E85", :id "stop2493"}]]
   [:linearGradient {:id "paint83_linear", :x1 "420.428", :y1 "121.417", :x2 "417.377", :y2 "124.532", :gradientUnits "userSpaceOnUse"}
    [:stop {:stop-color "#B2DDDF", :id "stop2496"}]
    [:stop {:offset "0.2713", :stop-color "#69CCD1", :id "stop2498"}]
    [:stop {:offset "0.663065", :stop-color "#329B9F", :id "stop2500"}]
    [:stop {:offset "0.725617", :stop-color "#1F898D", :id "stop2502"}]
    [:stop {:offset "1", :stop-color "#23C0C7", :id "stop2504"}]
    [:stop {:offset "1", :stop-color "#0F575A", :id "stop2506"}]]
   [:linearGradient {:id "paint84_linear", :x1 "422.742", :y1 "134.091", :x2 "433.138", :y2 "144.708", :gradientUnits "userSpaceOnUse"}
    [:stop {:stop-color "#D1EDEF", :id "stop2509"}]
    [:stop {:offset "0.2713", :stop-color "#80D9DE", :id "stop2511"}]
    [:stop {:offset "0.522436", :stop-color "#3CB5B9", :id "stop2513"}]
    [:stop {:offset "0.762026", :stop-color "#30979B", :id "stop2515"}]
    [:stop {:offset "1", :stop-color "#127174", :id "stop2517"}]]
   [:linearGradient {:id "paint85_linear", :x1 "343.542", :y1 "177.627", :x2 "361.588", :y2 "167.971", :gradientUnits "userSpaceOnUse"}
    [:stop {:stop-color "#0A393B", :id "stop2520"}]
    [:stop {:offset "0.459935", :stop-color "#0C4C4F", :id "stop2522"}]
    [:stop {:offset "1", :stop-color "#105F62", :id "stop2524"}]]
   [:linearGradient {:id "paint86_linear", :x1 "364.711", :y1 "165.398", :x2 "379.719", :y2 "180.41", :gradientUnits "userSpaceOnUse"}
    [:stop {:stop-color "#147B7F", :id "stop2527"}]
    [:stop {:offset "0.308889", :stop-color "#116567", :id "stop2529"}]
    [:stop {:offset "0.704733", :stop-color "#0C5054", :id "stop2531"}]
    [:stop {:offset "1", :stop-color "#093839", :id "stop2533"}]]
   [:linearGradient {:id "paint87_linear", :x1 "357.315", :y1 "164.73", :x2 "369.162", :y2 "146.188", :gradientUnits "userSpaceOnUse"}
    [:stop {:stop-color "#116467", :id "stop2536"}]
    [:stop {:offset "0.51202", :stop-color "#0C4B4E", :id "stop2538"}]
    [:stop {:offset "1", :stop-color "#093335", :id "stop2540"}]]
   [:linearGradient {:id "paint88_linear", :x1 "369.976", :y1 "160.144", :x2 "374.023", :y2 "164.277", :gradientUnits "userSpaceOnUse"}
    [:stop {:stop-color "#CFF5F8", :id "stop2543"}]
    [:stop {:offset "0.2713", :stop-color "#96DFE3", :id "stop2545"}]
    [:stop {:offset "0.5184", :stop-color "#68C8C8", :id "stop2547"}]
    [:stop {:offset "0.7299", :stop-color "#41B3BA", :id "stop2549"}]
    [:stop {:offset "0.8974", :stop-color "#29A3A3", :id "stop2551"}]
    [:stop {:offset "1", :stop-color "#1A7E85", :id "stop2553"}]]
   [:linearGradient {:id "paint89_linear", :x1 "354.502", :y1 "160.616", :x2 "351.451", :y2 "163.731", :gradientUnits "userSpaceOnUse"}
    [:stop {:stop-color "#B2DDDF", :id "stop2556"}]
    [:stop {:offset "0.2713", :stop-color "#69CCD1", :id "stop2558"}]
    [:stop {:offset "0.663065", :stop-color "#329B9F", :id "stop2560"}]
    [:stop {:offset "0.725617", :stop-color "#1F898D", :id "stop2562"}]
    [:stop {:offset "1", :stop-color "#23C0C7", :id "stop2564"}]
    [:stop {:offset "1", :stop-color "#0F575A", :id "stop2566"}]]
   [:linearGradient {:id "paint90_linear", :x1 "356.816", :y1 "173.29", :x2 "367.212", :y2 "183.907", :gradientUnits "userSpaceOnUse"}
    [:stop {:stop-color "#D1EDEF", :id "stop2569"}]
    [:stop {:offset "0.2713", :stop-color "#80D9DE", :id "stop2571"}]
    [:stop {:offset "0.522436", :stop-color "#3CB5B9", :id "stop2573"}]
    [:stop {:offset "0.762026", :stop-color "#30979B", :id "stop2575"}]
    [:stop {:offset "1", :stop-color "#127174", :id "stop2577"}]]
   [:linearGradient {:id "paint91_linear", :x1 "390.586", :y1 "150.989", :x2 "385.176", :y2 "154.409", :gradientUnits "userSpaceOnUse"}
    [:stop {:offset "0.277639", :stop-color "#0F575A", :id "stop2580"}]
    [:stop {:offset "1", :stop-color "white", :stop-opacity "0", :id "stop2582"}]]
   [:linearGradient {:id "paint92_linear", :x1 "274.943", :y1 "218.954", :x2 "292.989", :y2 "209.298", :gradientUnits "userSpaceOnUse"}
    [:stop {:stop-color "#0A393B", :id "stop2585"}]
    [:stop {:offset "0.459935", :stop-color "#0C4C4F", :id "stop2587"}]
    [:stop {:offset "1", :stop-color "#105F62", :id "stop2589"}]]
   [:linearGradient {:id "paint93_linear", :x1 "296.112", :y1 "206.726", :x2 "311.12", :y2 "221.737", :gradientUnits "userSpaceOnUse"}
    [:stop {:stop-color "#147B7F", :id "stop2592"}]
    [:stop {:offset "0.308889", :stop-color "#116567", :id "stop2594"}]
    [:stop {:offset "0.704733", :stop-color "#0C5054", :id "stop2596"}]
    [:stop {:offset "1", :stop-color "#093839", :id "stop2598"}]]
   [:linearGradient {:id "paint94_linear", :x1 "288.715", :y1 "206.058", :x2 "300.563", :y2 "187.516", :gradientUnits "userSpaceOnUse"}
    [:stop {:stop-color "#116467", :id "stop2601"}]
    [:stop {:offset "0.51202", :stop-color "#0C4B4E", :id "stop2603"}]
    [:stop {:offset "1", :stop-color "#093335", :id "stop2605"}]]
   [:linearGradient {:id "paint95_linear", :x1 "301.377", :y1 "201.472", :x2 "305.424", :y2 "205.605", :gradientUnits "userSpaceOnUse"}
    [:stop {:stop-color "#CFF5F8", :id "stop2608"}]
    [:stop {:offset "0.2713", :stop-color "#96DFE3", :id "stop2610"}]
    [:stop {:offset "0.5184", :stop-color "#68C8C8", :id "stop2612"}]
    [:stop {:offset "0.7299", :stop-color "#41B3BA", :id "stop2614"}]
    [:stop {:offset "0.8974", :stop-color "#29A3A3", :id "stop2616"}]
    [:stop {:offset "1", :stop-color "#1A7E85", :id "stop2618"}]]
   [:linearGradient {:id "paint96_linear", :x1 "285.903", :y1 "201.943", :x2 "282.852", :y2 "205.059", :gradientUnits "userSpaceOnUse"}
    [:stop {:stop-color "#B2DDDF", :id "stop2621"}]
    [:stop {:offset "0.2713", :stop-color "#69CCD1", :id "stop2623"}]
    [:stop {:offset "0.663065", :stop-color "#329B9F", :id "stop2625"}]
    [:stop {:offset "0.725617", :stop-color "#1F898D", :id "stop2627"}]
    [:stop {:offset "1", :stop-color "#23C0C7", :id "stop2629"}]
    [:stop {:offset "1", :stop-color "#0F575A", :id "stop2631"}]]
   [:linearGradient {:id "paint97_linear", :x1 "288.217", :y1 "214.618", :x2 "298.613", :y2 "225.235", :gradientUnits "userSpaceOnUse"}
    [:stop {:stop-color "#D1EDEF", :id "stop2634"}]
    [:stop {:offset "0.2713", :stop-color "#80D9DE", :id "stop2636"}]
    [:stop {:offset "0.522436", :stop-color "#3CB5B9", :id "stop2638"}]
    [:stop {:offset "0.762026", :stop-color "#30979B", :id "stop2640"}]
    [:stop {:offset "1", :stop-color "#127174", :id "stop2642"}]]
   [:linearGradient {:id "paint98_linear", :x1 "321.987", :y1 "192.316", :x2 "316.578", :y2 "195.737", :gradientUnits "userSpaceOnUse"}
    [:stop {:offset "0.277639", :stop-color "#0F575A", :id "stop2645"}]
    [:stop {:offset "1", :stop-color "white", :stop-opacity "0", :id "stop2647"}]]
   [:linearGradient {:id "paint99_linear", :x1 "209.016", :y1 "259.045", :x2 "227.063", :y2 "249.389", :gradientUnits "userSpaceOnUse"}
    [:stop {:stop-color "#0A393B", :id "stop2650"}]
    [:stop {:offset "0.459935", :stop-color "#0C4C4F", :id "stop2652"}]
    [:stop {:offset "1", :stop-color "#105F62", :id "stop2654"}]]
   [:linearGradient {:id "paint100_linear", :x1 "230.186", :y1 "246.816", :x2 "245.193", :y2 "261.828", :gradientUnits "userSpaceOnUse"}
    [:stop {:stop-color "#147B7F", :id "stop2657"}]
    [:stop {:offset "0.308889", :stop-color "#116567", :id "stop2659"}]
    [:stop {:offset "0.704733", :stop-color "#0C5054", :id "stop2661"}]
    [:stop {:offset "1", :stop-color "#093839", :id "stop2663"}]]
   [:linearGradient {:id "paint101_linear", :x1 "222.789", :y1 "246.148", :x2 "234.636", :y2 "227.606", :gradientUnits "userSpaceOnUse"}
    [:stop {:stop-color "#116467", :id "stop2666"}]
    [:stop {:offset "0.51202", :stop-color "#0C4B4E", :id "stop2668"}]
    [:stop {:offset "1", :stop-color "#093335", :id "stop2670"}]]
   [:linearGradient {:id "paint102_linear", :x1 "235.451", :y1 "241.563", :x2 "239.498", :y2 "245.695", :gradientUnits "userSpaceOnUse"}
    [:stop {:stop-color "#CFF5F8", :id "stop2673"}]
    [:stop {:offset "0.2713", :stop-color "#96DFE3", :id "stop2675"}]
    [:stop {:offset "0.5184", :stop-color "#68C8C8", :id "stop2677"}]
    [:stop {:offset "0.7299", :stop-color "#41B3BA", :id "stop2679"}]
    [:stop {:offset "0.8974", :stop-color "#29A3A3", :id "stop2681"}]
    [:stop {:offset "1", :stop-color "#1A7E85", :id "stop2683"}]]
   [:linearGradient {:id "paint103_linear", :x1 "219.976", :y1 "242.034", :x2 "216.926", :y2 "245.149", :gradientUnits "userSpaceOnUse"}
    [:stop {:stop-color "#B2DDDF", :id "stop2686"}]
    [:stop {:offset "0.2713", :stop-color "#69CCD1", :id "stop2688"}]
    [:stop {:offset "0.663065", :stop-color "#329B9F", :id "stop2690"}]
    [:stop {:offset "0.725617", :stop-color "#1F898D", :id "stop2692"}]
    [:stop {:offset "1", :stop-color "#23C0C7", :id "stop2694"}]
    [:stop {:offset "1", :stop-color "#0F575A", :id "stop2696"}]]
   [:linearGradient {:id "paint104_linear", :x1 "222.29", :y1 "254.708", :x2 "232.687", :y2 "265.325", :gradientUnits "userSpaceOnUse"}
    [:stop {:stop-color "#D1EDEF", :id "stop2699"}]
    [:stop {:offset "0.2713", :stop-color "#80D9DE", :id "stop2701"}]
    [:stop {:offset "0.522436", :stop-color "#3CB5B9", :id "stop2703"}]
    [:stop {:offset "0.762026", :stop-color "#30979B", :id "stop2705"}]
    [:stop {:offset "1", :stop-color "#127174", :id "stop2707"}]]
   [:linearGradient {:id "paint105_linear", :x1 "256.061", :y1 "232.407", :x2 "250.651", :y2 "235.827", :gradientUnits "userSpaceOnUse"}
    [:stop {:offset "0.277639", :stop-color "#0F575A", :id "stop2710"}]
    [:stop {:offset "1", :stop-color "white", :stop-opacity "0", :id "stop2712"}]]
   [:linearGradient {:id "paint106_linear", :x1 "592.101", :y1 "256.025", :x2 "610.148", :y2 "246.369", :gradientUnits "userSpaceOnUse"}
    [:stop {:stop-color "#0A393B", :id "stop2715"}]
    [:stop {:offset "0.459935", :stop-color "#0C4C4F", :id "stop2717"}]
    [:stop {:offset "1", :stop-color "#105F62", :id "stop2719"}]]
   [:linearGradient {:id "paint107_linear", :x1 "613.271", :y1 "243.797", :x2 "628.279", :y2 "258.808", :gradientUnits "userSpaceOnUse"}
    [:stop {:stop-color "#147B7F", :id "stop2722"}]
    [:stop {:offset "0.308889", :stop-color "#116567", :id "stop2724"}]
    [:stop {:offset "0.704733", :stop-color "#0C5054", :id "stop2726"}]
    [:stop {:offset "1", :stop-color "#093839", :id "stop2728"}]]
   [:linearGradient {:id "paint108_linear", :x1 "605.875", :y1 "243.129", :x2 "617.722", :y2 "224.587", :gradientUnits "userSpaceOnUse"}
    [:stop {:stop-color "#116467", :id "stop2731"}]
    [:stop {:offset "0.51202", :stop-color "#0C4B4E", :id "stop2733"}]
    [:stop {:offset "1", :stop-color "#093335", :id "stop2735"}]]
   [:linearGradient {:id "paint109_linear", :x1 "618.536", :y1 "238.543", :x2 "622.583", :y2 "242.676", :gradientUnits "userSpaceOnUse"}
    [:stop {:stop-color "#CFF5F8", :id "stop2738"}]
    [:stop {:offset "0.2713", :stop-color "#96DFE3", :id "stop2740"}]
    [:stop {:offset "0.5184", :stop-color "#68C8C8", :id "stop2742"}]
    [:stop {:offset "0.7299", :stop-color "#41B3BA", :id "stop2744"}]
    [:stop {:offset "0.8974", :stop-color "#29A3A3", :id "stop2746"}]
    [:stop {:offset "1", :stop-color "#1A7E85", :id "stop2748"}]]
   [:linearGradient {:id "paint110_linear", :x1 "603.061", :y1 "239.015", :x2 "600.011", :y2 "242.13", :gradientUnits "userSpaceOnUse"}
    [:stop {:stop-color "#B2DDDF", :id "stop2751"}]
    [:stop {:offset "0.2713", :stop-color "#69CCD1", :id "stop2753"}]
    [:stop {:offset "0.663065", :stop-color "#329B9F", :id "stop2755"}]
    [:stop {:offset "0.725617", :stop-color "#1F898D", :id "stop2757"}]
    [:stop {:offset "1", :stop-color "#23C0C7", :id "stop2759"}]
    [:stop {:offset "1", :stop-color "#0F575A", :id "stop2761"}]]
   [:linearGradient {:id "paint111_linear", :x1 "605.375", :y1 "251.689", :x2 "615.772", :y2 "262.306", :gradientUnits "userSpaceOnUse"}
    [:stop {:stop-color "#D1EDEF", :id "stop2764"}]
    [:stop {:offset "0.2713", :stop-color "#80D9DE", :id "stop2766"}]
    [:stop {:offset "0.522436", :stop-color "#3CB5B9", :id "stop2768"}]
    [:stop {:offset "0.762026", :stop-color "#30979B", :id "stop2770"}]
    [:stop {:offset "1", :stop-color "#127174", :id "stop2772"}]]
   [:linearGradient {:id "paint112_linear", :x1 "526.175", :y1 "295.225", :x2 "544.222", :y2 "285.569", :gradientUnits "userSpaceOnUse"}
    [:stop {:stop-color "#0A393B", :id "stop2775"}]
    [:stop {:offset "0.459935", :stop-color "#0C4C4F", :id "stop2777"}]
    [:stop {:offset "1", :stop-color "#105F62", :id "stop2779"}]]
   [:linearGradient {:id "paint113_linear", :x1 "547.344", :y1 "282.997", :x2 "562.352", :y2 "298.008", :gradientUnits "userSpaceOnUse"}
    [:stop {:stop-color "#147B7F", :id "stop2782"}]
    [:stop {:offset "0.308889", :stop-color "#116567", :id "stop2784"}]
    [:stop {:offset "0.704733", :stop-color "#0C5054", :id "stop2786"}]
    [:stop {:offset "1", :stop-color "#093839", :id "stop2788"}]]
   [:linearGradient {:id "paint114_linear", :x1 "539.948", :y1 "282.328", :x2 "551.796", :y2 "263.787", :gradientUnits "userSpaceOnUse"}
    [:stop {:stop-color "#116467", :id "stop2791"}]
    [:stop {:offset "0.51202", :stop-color "#0C4B4E", :id "stop2793"}]
    [:stop {:offset "1", :stop-color "#093335", :id "stop2795"}]]
   [:linearGradient {:id "paint115_linear", :x1 "552.61", :y1 "277.743", :x2 "556.657", :y2 "281.876", :gradientUnits "userSpaceOnUse"}
    [:stop {:stop-color "#CFF5F8", :id "stop2798"}]
    [:stop {:offset "0.2713", :stop-color "#96DFE3", :id "stop2800"}]
    [:stop {:offset "0.5184", :stop-color "#68C8C8", :id "stop2802"}]
    [:stop {:offset "0.7299", :stop-color "#41B3BA", :id "stop2804"}]
    [:stop {:offset "0.8974", :stop-color "#29A3A3", :id "stop2806"}]
    [:stop {:offset "1", :stop-color "#1A7E85", :id "stop2808"}]]
   [:linearGradient {:id "paint116_linear", :x1 "537.135", :y1 "278.214", :x2 "534.085", :y2 "281.329", :gradientUnits "userSpaceOnUse"}
    [:stop {:stop-color "#B2DDDF", :id "stop2811"}]
    [:stop {:offset "0.2713", :stop-color "#69CCD1", :id "stop2813"}]
    [:stop {:offset "0.663065", :stop-color "#329B9F", :id "stop2815"}]
    [:stop {:offset "0.725617", :stop-color "#1F898D", :id "stop2817"}]
    [:stop {:offset "1", :stop-color "#23C0C7", :id "stop2819"}]
    [:stop {:offset "1", :stop-color "#0F575A", :id "stop2821"}]]
   [:linearGradient {:id "paint117_linear", :x1 "539.449", :y1 "290.888", :x2 "549.845", :y2 "301.505", :gradientUnits "userSpaceOnUse"}
    [:stop {:stop-color "#D1EDEF", :id "stop2824"}]
    [:stop {:offset "0.2713", :stop-color "#80D9DE", :id "stop2826"}]
    [:stop {:offset "0.522436", :stop-color "#3CB5B9", :id "stop2828"}]
    [:stop {:offset "0.762026", :stop-color "#30979B", :id "stop2830"}]
    [:stop {:offset "1", :stop-color "#127174", :id "stop2832"}]]
   [:linearGradient {:id "paint118_linear", :x1 "573.219", :y1 "268.587", :x2 "567.81", :y2 "272.008", :gradientUnits "userSpaceOnUse"}
    [:stop {:offset "0.277639", :stop-color "#0F575A", :id "stop2835"}]
    [:stop {:offset "1", :stop-color "white", :stop-opacity "0", :id "stop2837"}]]
   [:linearGradient {:id "paint119_linear", :x1 "457.576", :y1 "336.552", :x2 "475.623", :y2 "326.896", :gradientUnits "userSpaceOnUse"}
    [:stop {:stop-color "#0A393B", :id "stop2840"}]
    [:stop {:offset "0.459935", :stop-color "#0C4C4F", :id "stop2842"}]
    [:stop {:offset "1", :stop-color "#105F62", :id "stop2844"}]]
   [:linearGradient {:id "paint120_linear", :x1 "478.745", :y1 "324.324", :x2 "493.753", :y2 "339.335", :gradientUnits "userSpaceOnUse"}
    [:stop {:stop-color "#147B7F", :id "stop2847"}]
    [:stop {:offset "0.308889", :stop-color "#116567", :id "stop2849"}]
    [:stop {:offset "0.704733", :stop-color "#0C5054", :id "stop2851"}]
    [:stop {:offset "1", :stop-color "#093839", :id "stop2853"}]]
   [:linearGradient {:id "paint121_linear", :x1 "471.349", :y1 "323.656", :x2 "483.196", :y2 "305.114", :gradientUnits "userSpaceOnUse"}
    [:stop {:stop-color "#116467", :id "stop2856"}]
    [:stop {:offset "0.51202", :stop-color "#0C4B4E", :id "stop2858"}]
    [:stop {:offset "1", :stop-color "#093335", :id "stop2860"}]]
   [:linearGradient {:id "paint122_linear", :x1 "484.011", :y1 "319.07", :x2 "488.058", :y2 "323.203", :gradientUnits "userSpaceOnUse"}
    [:stop {:stop-color "#CFF5F8", :id "stop2863"}]
    [:stop {:offset "0.2713", :stop-color "#96DFE3", :id "stop2865"}]
    [:stop {:offset "0.5184", :stop-color "#68C8C8", :id "stop2867"}]
    [:stop {:offset "0.7299", :stop-color "#41B3BA", :id "stop2869"}]
    [:stop {:offset "0.8974", :stop-color "#29A3A3", :id "stop2871"}]
    [:stop {:offset "1", :stop-color "#1A7E85", :id "stop2873"}]]
   [:linearGradient {:id "paint123_linear", :x1 "468.536", :y1 "319.542", :x2 "465.485", :y2 "322.657", :gradientUnits "userSpaceOnUse"}
    [:stop {:stop-color "#B2DDDF", :id "stop2876"}]
    [:stop {:offset "0.2713", :stop-color "#69CCD1", :id "stop2878"}]
    [:stop {:offset "0.663065", :stop-color "#329B9F", :id "stop2880"}]
    [:stop {:offset "0.725617", :stop-color "#1F898D", :id "stop2882"}]
    [:stop {:offset "1", :stop-color "#23C0C7", :id "stop2884"}]
    [:stop {:offset "1", :stop-color "#0F575A", :id "stop2886"}]]
   [:linearGradient {:id "paint124_linear", :x1 "470.85", :y1 "332.216", :x2 "481.246", :y2 "342.833", :gradientUnits "userSpaceOnUse"}
    [:stop {:stop-color "#D1EDEF", :id "stop2889"}]
    [:stop {:offset "0.2713", :stop-color "#80D9DE", :id "stop2891"}]
    [:stop {:offset "0.522436", :stop-color "#3CB5B9", :id "stop2893"}]
    [:stop {:offset "0.762026", :stop-color "#30979B", :id "stop2895"}]
    [:stop {:offset "1", :stop-color "#127174", :id "stop2897"}]]
   [:linearGradient {:id "paint125_linear", :x1 "504.62", :y1 "309.914", :x2 "499.211", :y2 "313.335", :gradientUnits "userSpaceOnUse"}
    [:stop {:offset "0.277639", :stop-color "#0F575A", :id "stop2900"}]
    [:stop {:offset "1", :stop-color "white", :stop-opacity "0", :id "stop2902"}]]
   [:linearGradient {:id "paint126_linear", :x1 "391.65", :y1 "376.643", :x2 "409.696", :y2 "366.987", :gradientUnits "userSpaceOnUse"}
    [:stop {:stop-color "#0A393B", :id "stop2905"}]
    [:stop {:offset "0.459935", :stop-color "#0C4C4F", :id "stop2907"}]
    [:stop {:offset "1", :stop-color "#105F62", :id "stop2909"}]]
   [:linearGradient {:id "paint127_linear", :x1 "412.819", :y1 "364.415", :x2 "427.826", :y2 "379.426", :gradientUnits "userSpaceOnUse"}
    [:stop {:stop-color "#147B7F", :id "stop2912"}]
    [:stop {:offset "0.308889", :stop-color "#116567", :id "stop2914"}]
    [:stop {:offset "0.704733", :stop-color "#0C5054", :id "stop2916"}]
    [:stop {:offset "1", :stop-color "#093839", :id "stop2918"}]]
   [:linearGradient {:id "paint128_linear", :x1 "405.422", :y1 "363.746", :x2 "417.27", :y2 "345.204", :gradientUnits "userSpaceOnUse"}
    [:stop {:stop-color "#116467", :id "stop2921"}]
    [:stop {:offset "0.51202", :stop-color "#0C4B4E", :id "stop2923"}]
    [:stop {:offset "1", :stop-color "#093335", :id "stop2925"}]]
   [:linearGradient {:id "paint129_linear", :x1 "418.084", :y1 "359.161", :x2 "422.131", :y2 "363.294", :gradientUnits "userSpaceOnUse"}
    [:stop {:stop-color "#CFF5F8", :id "stop2928"}]
    [:stop {:offset "0.2713", :stop-color "#96DFE3", :id "stop2930"}]
    [:stop {:offset "0.5184", :stop-color "#68C8C8", :id "stop2932"}]
    [:stop {:offset "0.7299", :stop-color "#41B3BA", :id "stop2934"}]
    [:stop {:offset "0.8974", :stop-color "#29A3A3", :id "stop2936"}]
    [:stop {:offset "1", :stop-color "#1A7E85", :id "stop2938"}]]
   [:linearGradient {:id "paint130_linear", :x1 "402.609", :y1 "359.632", :x2 "399.559", :y2 "362.747", :gradientUnits "userSpaceOnUse"}
    [:stop {:stop-color "#B2DDDF", :id "stop2941"}]
    [:stop {:offset "0.2713", :stop-color "#69CCD1", :id "stop2943"}]
    [:stop {:offset "0.663065", :stop-color "#329B9F", :id "stop2945"}]
    [:stop {:offset "0.725617", :stop-color "#1F898D", :id "stop2947"}]
    [:stop {:offset "1", :stop-color "#23C0C7", :id "stop2949"}]
    [:stop {:offset "1", :stop-color "#0F575A", :id "stop2951"}]]
   [:linearGradient {:id "paint131_linear", :x1 "404.923", :y1 "372.306", :x2 "415.319", :y2 "382.923", :gradientUnits "userSpaceOnUse"}
    [:stop {:stop-color "#D1EDEF", :id "stop2954"}]
    [:stop {:offset "0.2713", :stop-color "#80D9DE", :id "stop2956"}]
    [:stop {:offset "0.522436", :stop-color "#3CB5B9", :id "stop2958"}]
    [:stop {:offset "0.762026", :stop-color "#30979B", :id "stop2960"}]
    [:stop {:offset "1", :stop-color "#127174", :id "stop2962"}]]
   [:linearGradient {:id "paint132_linear", :x1 "438.694", :y1 "350.005", :x2 "433.284", :y2 "353.426", :gradientUnits "userSpaceOnUse"}
    [:stop {:offset "0.277639", :stop-color "#0F575A", :id "stop2965"}]
    [:stop {:offset "1", :stop-color "white", :stop-opacity "0", :id "stop2967"}]]
   [:linearGradient {:id "paint133_linear", :x1 "705.765", :y1 "319.473", :x2 "717.073", :y2 "313.421", :gradientUnits "userSpaceOnUse"}
    [:stop {:stop-color "#494949", :id "stop2970"}]
    [:stop {:offset "0.2255", :stop-color "#525252", :id "stop2972"}]
    [:stop {:offset "0.593", :stop-color "#6A6A6A", :id "stop2974"}]
    [:stop {:offset "1", :stop-color "#8C8C8C", :id "stop2976"}]]
   [:linearGradient {:id "paint134_linear", :x1 "718.974", :y1 "311.879", :x2 "728.239", :y2 "321.144", :gradientUnits "userSpaceOnUse"}
    [:stop {:stop-color "#BFBFBF", :id "stop2979"}]
    [:stop {:offset "0.219", :stop-color "#A2A2A2", :id "stop2981"}]
    [:stop {:offset "0.5607", :stop-color "#7B7B7B", :id "stop2983"}]
    [:stop {:offset "0.833", :stop-color "#636363", :id "stop2985"}]
    [:stop {:offset "1", :stop-color "#5A5A5A", :id "stop2987"}]]
   [:linearGradient {:id "paint135_linear", :x1 "714.34", :y1 "311.328", :x2 "721.673", :y2 "299.847", :gradientUnits "userSpaceOnUse"}
    [:stop {:stop-color "#A6A6A6", :id "stop2990"}]
    [:stop {:offset "0.0336", :stop-color "#A2A2A2", :id "stop2992"}]
    [:stop {:offset "0.4566", :stop-color "#7B7B7B", :id "stop2994"}]
    [:stop {:offset "0.7934", :stop-color "#636363", :id "stop2996"}]
    [:stop {:offset "1", :stop-color "#5A5A5A", :id "stop2998"}]]
   [:linearGradient {:id "paint136_linear", :x1 "729.891", :y1 "320.489", :x2 "705.894", :y2 "305.319", :gradientUnits "userSpaceOnUse"}
    [:stop {:stop-color "#3A3C4D", :id "stop3001"}]
    [:stop {:offset "0.42", :stop-color "#3D3F4E", :id "stop3003"}]
    [:stop {:offset "0.7058", :stop-color "#464752", :id "stop3005"}]
    [:stop {:offset "0.9509", :stop-color "#555557", :id "stop3007"}]
    [:stop {:offset "1", :stop-color "#595959", :id "stop3009"}]]
   [:linearGradient {:id "paint137_linear", :x1 "639.758", :y1 "359.848", :x2 "651.062", :y2 "353.787", :gradientUnits "userSpaceOnUse"}
    [:stop {:stop-color "#494949", :id "stop3012"}]
    [:stop {:offset "0.2255", :stop-color "#525252", :id "stop3014"}]
    [:stop {:offset "0.593", :stop-color "#6A6A6A", :id "stop3016"}]
    [:stop {:offset "1", :stop-color "#8C8C8C", :id "stop3018"}]]
   [:linearGradient {:id "paint138_linear", :x1 "652.965", :y1 "352.249", :x2 "662.23", :y2 "361.514", :gradientUnits "userSpaceOnUse"}
    [:stop {:stop-color "#BFBFBF", :id "stop3021"}]
    [:stop {:offset "0.219", :stop-color "#A2A2A2", :id "stop3023"}]
    [:stop {:offset "0.5607", :stop-color "#7B7B7B", :id "stop3025"}]
    [:stop {:offset "0.833", :stop-color "#636363", :id "stop3027"}]
    [:stop {:offset "1", :stop-color "#5A5A5A", :id "stop3029"}]]
   [:linearGradient {:id "paint139_linear", :x1 "648.331", :y1 "351.699", :x2 "655.665", :y2 "340.219", :gradientUnits "userSpaceOnUse"}
    [:stop {:stop-color "#A6A6A6", :id "stop3032"}]
    [:stop {:offset "0.0336", :stop-color "#A2A2A2", :id "stop3034"}]
    [:stop {:offset "0.4566", :stop-color "#7B7B7B", :id "stop3036"}]
    [:stop {:offset "0.7934", :stop-color "#636363", :id "stop3038"}]
    [:stop {:offset "1", :stop-color "#5A5A5A", :id "stop3040"}]]
   [:linearGradient {:id "paint140_linear", :x1 "663.882", :y1 "360.859", :x2 "639.886", :y2 "345.689", :gradientUnits "userSpaceOnUse"}
    [:stop {:stop-color "#3A3C4D", :id "stop3043"}]
    [:stop {:offset "0.42", :stop-color "#3D3F4E", :id "stop3045"}]
    [:stop {:offset "0.7058", :stop-color "#464752", :id "stop3047"}]
    [:stop {:offset "0.9509", :stop-color "#555557", :id "stop3049"}]
    [:stop {:offset "1", :stop-color "#595959", :id "stop3051"}]]
   [:linearGradient {:id "paint141_linear", :x1 "663.937", :y1 "331.837", :x2 "709.902", :y2 "331.837", :gradientUnits "userSpaceOnUse"}
    [:stop {:stop-color "#BFBFBF", :id "stop3054"}]
    [:stop {:offset "0.1122", :stop-color "#AAAAAE", :id "stop3056"}]
    [:stop {:offset "0.4064", :stop-color "#767884", :id "stop3058"}]
    [:stop {:offset "0.6631", :stop-color "#515366", :id "stop3060"}]
    [:stop {:offset "0.8695", :stop-color "#3A3D54", :id "stop3062"}]
    [:stop {:offset "1", :stop-color "#32354D", :id "stop3064"}]]
   [:linearGradient {:id "paint142_linear", :x1 "572.927", :y1 "400.637", :x2 "584.234", :y2 "394.584", :gradientUnits "userSpaceOnUse"}
    [:stop {:stop-color "#494949", :id "stop3067"}]
    [:stop {:offset "0.2255", :stop-color "#525252", :id "stop3069"}]
    [:stop {:offset "0.593", :stop-color "#6A6A6A", :id "stop3071"}]
    [:stop {:offset "1", :stop-color "#8C8C8C", :id "stop3073"}]]
   [:linearGradient {:id "paint143_linear", :x1 "586.136", :y1 "393.042", :x2 "595.4", :y2 "402.307", :gradientUnits "userSpaceOnUse"}
    [:stop {:stop-color "#BFBFBF", :id "stop3076"}]
    [:stop {:offset "0.219", :stop-color "#A2A2A2", :id "stop3078"}]
    [:stop {:offset "0.5607", :stop-color "#7B7B7B", :id "stop3080"}]
    [:stop {:offset "0.833", :stop-color "#636363", :id "stop3082"}]
    [:stop {:offset "1", :stop-color "#5A5A5A", :id "stop3084"}]]
   [:linearGradient {:id "paint144_linear", :x1 "581.501", :y1 "392.493", :x2 "588.835", :y2 "381.012", :gradientUnits "userSpaceOnUse"}
    [:stop {:stop-color "#A6A6A6", :id "stop3087"}]
    [:stop {:offset "0.0336", :stop-color "#A2A2A2", :id "stop3089"}]
    [:stop {:offset "0.4566", :stop-color "#7B7B7B", :id "stop3091"}]
    [:stop {:offset "0.7934", :stop-color "#636363", :id "stop3093"}]
    [:stop {:offset "1", :stop-color "#5A5A5A", :id "stop3095"}]]
   [:linearGradient {:id "paint145_linear", :x1 "597.052", :y1 "401.653", :x2 "573.056", :y2 "386.483", :gradientUnits "userSpaceOnUse"}
    [:stop {:stop-color "#3A3C4D", :id "stop3098"}]
    [:stop {:offset "0.42", :stop-color "#3D3F4E", :id "stop3100"}]
    [:stop {:offset "0.7058", :stop-color "#464752", :id "stop3102"}]
    [:stop {:offset "0.9509", :stop-color "#555557", :id "stop3105"}]
    [:stop {:offset "1", :stop-color "#595959", :id "stop3107"}]]
   [:linearGradient {:id "paint146_linear", :x1 "597.114", :y1 "372.631", :x2 "643.079", :y2 "372.631", :gradientUnits "userSpaceOnUse"}
    [:stop {:stop-color "#BFBFBF", :id "stop3110"}]
    [:stop {:offset "0.1122", :stop-color "#AAAAAE", :id "stop3112"}]
    [:stop {:offset "0.4064", :stop-color "#767884", :id "stop3114"}]
    [:stop {:offset "0.6631", :stop-color "#515366", :id "stop3116"}]
    [:stop {:offset "0.8695", :stop-color "#3A3D54", :id "stop3118"}]
    [:stop {:offset "1", :stop-color "#32354D", :id "stop3120"}]]
   [:linearGradient {:id "paint147_linear", :x1 "506.14", :y1 "441.709", :x2 "517.356", :y2 "435.706", :gradientUnits "userSpaceOnUse"}
    [:stop {:stop-color "#494949", :id "stop3123"}]
    [:stop {:offset "0.2255", :stop-color "#525252", :id "stop3125"}]
    [:stop {:offset "0.593", :stop-color "#6A6A6A", :id "stop3127"}]
    [:stop {:offset "1", :stop-color "#8C8C8C", :id "stop3129"}]]
   [:linearGradient {:id "paint148_linear", :x1 "519.253", :y1 "434.131", :x2 "528.518", :y2 "443.395", :gradientUnits "userSpaceOnUse"}
    [:stop {:stop-color "#BFBFBF", :id "stop3132"}]
    [:stop {:offset "0.219", :stop-color "#A2A2A2", :id "stop3134"}]
    [:stop {:offset "0.5607", :stop-color "#7B7B7B", :id "stop3136"}]
    [:stop {:offset "0.833", :stop-color "#636363", :id "stop3138"}]
    [:stop {:offset "1", :stop-color "#5A5A5A", :id "stop3140"}]]
   [:linearGradient {:id "paint149_linear", :x1 "514.597", :y1 "433.581", :x2 "521.931", :y2 "422.1", :gradientUnits "userSpaceOnUse"}
    [:stop {:stop-color "#A6A6A6", :id "stop3143"}]
    [:stop {:offset "0.0336", :stop-color "#A2A2A2", :id "stop3145"}]
    [:stop {:offset "0.4566", :stop-color "#7B7B7B", :id "stop3147"}]
    [:stop {:offset "0.7934", :stop-color "#636363", :id "stop3149"}]
    [:stop {:offset "1", :stop-color "#5A5A5A", :id "stop3151"}]]
   [:linearGradient {:id "paint150_linear", :x1 "529.957", :y1 "442.634", :x2 "506.254", :y2 "427.65", :gradientUnits "userSpaceOnUse"}
    [:stop {:stop-color "#595959", :id "stop3154"}]
    [:stop {:offset "0.0491", :stop-color "#555557", :id "stop3156"}]
    [:stop {:offset "0.2942", :stop-color "#464752", :id "stop3158"}]
    [:stop {:offset "0.58", :stop-color "#3D3F4E", :id "stop3160"}]
    [:stop {:offset "1", :stop-color "#3A3C4D", :id "stop3162"}]]
   [:linearGradient {:id "paint151_linear", :x1 "530.013", :y1 "428.574", :x2 "575.688", :y2 "399.252", :gradientUnits "userSpaceOnUse"}
    [:stop {:stop-color "#BFBFBF", :id "stop3165"}]
    [:stop {:offset "0.1122", :stop-color "#AAAAAE", :id "stop3167"}]
    [:stop {:offset "0.4064", :stop-color "#767884", :id "stop3169"}]
    [:stop {:offset "0.6631", :stop-color "#515366", :id "stop3171"}]
    [:stop {:offset "0.8695", :stop-color "#3A3D54", :id "stop3173"}]
    [:stop {:offset "1", :stop-color "#32354D", :id "stop3175"}]]
   [:linearGradient {:id "paint152_linear", :x1 "506.795", :y1 "427.219", :x2 "418.776", :y2 "371.791", :gradientUnits "userSpaceOnUse"}
    [:stop {:stop-color "#32354D", :id "stop3178"}]
    [:stop {:offset "0.1305", :stop-color "#3A3D54", :id "stop3180"}]
    [:stop {:offset "0.3369", :stop-color "#515366", :id "stop3182"}]
    [:stop {:offset "0.5936", :stop-color "#767884", :id "stop3184"}]
    [:stop {:offset "0.8878", :stop-color "#AAAAAE", :id "stop3186"}]
    [:stop {:offset "1", :stop-color "#BFBFBF", :id "stop3188"}]]
   [:linearGradient {:id "paint153_linear", :x1 "706.28", :y1 "306.385", :x2 "618.261", :y2 "250.956", :gradientUnits "userSpaceOnUse"}
    [:stop {:stop-color "#32354D", :id "stop3191"}]
    [:stop {:offset "0.1305", :stop-color "#3A3D54", :id "stop3193"}]
    [:stop {:offset "0.3369", :stop-color "#515366", :id "stop3195"}]
    [:stop {:offset "0.5936", :stop-color "#767884", :id "stop3197"}]
    [:stop {:offset "0.8878", :stop-color "#AAAAAE", :id "stop3199"}]
    [:stop {:offset "1", :stop-color "#BFBFBF", :id "stop3202"}]]
   [:linearGradient {:id "paint154_linear", :x1 "540.148", :y1 "177.295", :x2 "552.012", :y2 "236.557", :gradientUnits "userSpaceOnUse"}
    [:stop {:stop-color "#127174", :id "stop3206"}]
    [:stop {:offset "0.3874", :stop-color "#30979B", :id "stop3208"}]
    [:stop {:offset "0.9388", :stop-color "#00F7FF", :stop-opacity "0.1", :id "stop3210"}]]
   [:linearGradient {:id "paint155_linear", :x1 "527.675", :y1 "203.013", :x2 "557.768", :y2 "267.911", :gradientUnits "userSpaceOnUse"}
    [:stop {:stop-color "#349195", :id "stop3213"}]
    [:stop {:offset "0.402642", :stop-color "#ABFCFF", :id "stop3215"}]
    [:stop {:offset "0.91828", :stop-color "#CFFDFF", :stop-opacity "0.2386", :id "stop3217"}]]
   [:linearGradient {:id "paint156_linear", :x1 "540.098", :y1 "210.964", :x2 "562.701", :y2 "259.401", :gradientUnits "userSpaceOnUse"}
    [:stop {:stop-color "#C1FFFF", :id "stop3220"}]
    [:stop {:offset "1", :stop-color "white", :stop-opacity "0", :id "stop3222"}]]
   [:linearGradient {:id "paint157_linear", :x1 "555.563", :y1 "172.625", :x2 "572.806", :y2 "237.501", :gradientUnits "userSpaceOnUse"}
    [:stop {:stop-color "white", :id "stop3226"}]
    [:stop {:offset "1", :stop-color "white", :stop-opacity "0", :id "stop3228"}]]
   [:linearGradient {:id "paint158_linear", :x1 "406.513", :y1 "255.393", :x2 "418.377", :y2 "314.654", :gradientUnits "userSpaceOnUse"}
    [:stop {:stop-color "#127174", :id "stop3232"}]
    [:stop {:offset "0.3874", :stop-color "#30979B", :id "stop3234"}]
    [:stop {:offset "0.9388", :stop-color "#00F7FF", :stop-opacity "0.1", :id "stop3236"}]]
   [:linearGradient {:id "paint159_linear", :x1 "394.041", :y1 "281.11", :x2 "424.133", :y2 "346.008", :gradientUnits "userSpaceOnUse"}
    [:stop {:stop-color "#349195", :id "stop3239"}]
    [:stop {:offset "0.402642", :stop-color "#ABFCFF", :id "stop3241"}]
    [:stop {:offset "0.91828", :stop-color "#CFFDFF", :stop-opacity "0.2386", :id "stop3243"}]]
   [:linearGradient {:id "paint160_linear", :x1 "406.464", :y1 "289.061", :x2 "429.066", :y2 "337.499", :gradientUnits "userSpaceOnUse"}
    [:stop {:stop-color "#C1FFFF", :id "stop3246"}]
    [:stop {:offset "1", :stop-color "white", :stop-opacity "0", :id "stop3248"}]]
   [:linearGradient {:id "paint161_linear", :x1 "421.928", :y1 "250.723", :x2 "439.171", :y2 "315.598", :gradientUnits "userSpaceOnUse"}
    [:stop {:stop-color "white", :id "stop3252"}]
    [:stop {:offset "1", :stop-color "white", :stop-opacity "0", :id "stop3254"}]]]])
