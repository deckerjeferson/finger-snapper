(ns finger-snapper.city-generator.logic
  (:require [schema.core :as s]))

(s/defn get-name-from-list :- s/Str
  [names :- s/->EqSchema desired-index :- s/Int]
  (-> names
      (nth desired-index)))

