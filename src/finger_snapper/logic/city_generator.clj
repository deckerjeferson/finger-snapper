(ns finger-snapper.logic.city-generator
  (:require [schema.core :as s]
            [finger-snapper.entities.steadings :as entites.steadings]
            [finger-snapper.schemas.city-information :as schemas.city-information]
            [finger-snapper.logic.caracteristic :as logic.caracteristic]))


(s/defn generate-name
  [index :- s/Int]
  (nth entites.steadings/names index))

(s/defn apply-caracteristics-to-steading
  [steading :- schemas.city-information/Steading
   index :- s/Int]
  (-> (nth entites.steadings/possible-town-caracteristics index)
      (logic.caracteristic/apply-to steading)))
