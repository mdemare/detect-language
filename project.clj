(defproject detect-language "0.0.1"
  :description "detect language of texts over HTTP"
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [ring/ring-core "1.2.1"]
                 [cljlangdetect "0.1.0"]
                 [compojure "1.1.5"]]
  :plugins [[lein-ring "0.8.10"]]
  :ring {:handler detect-language.core/app
         :port 53282})
