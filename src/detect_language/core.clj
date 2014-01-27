(ns detect-language.core
  (:use compojure.core))

(com.cybozu.labs.langdetect.DetectorFactory/loadProfile "lib/profiles")

(defn detect-language [text]
  (let [detector (com.cybozu.labs.langdetect.DetectorFactory/create)]
    (.append detector text)
    (.detect detector)))

(defroutes app
  (POST "/" {body :body} (detect-language (slurp body))))
