(ns finger-snapper.controller.steadings-generator
  (:require [finger-snapper.entities.steadings :as entities.steadings]
            [finger-snapper.entities.caracteristics :as entities.caracteristics]
            [finger-snapper.logic.city-generator :as logic.city-generator]
            [finger-snapper.logic.caracteristic :as logic.caracteristics]
            [finger-snapper.schemas.city-information :as schemas.city-information]
            [schema.core :as s]))

(def max-rand (count entities.steadings/names))

(s/defn add-name-to-village :- schemas.city-information/Steading
  [village]
  (-> village
      (assoc :name (logic.city-generator/generate-name (rand-int (count entities.steadings/names))))))

(s/defn add-caracteristic :- schemas.city-information/Steading
  [village :- schemas.city-information/Steading]
  (let [roll (rand-int (count entities.caracteristics/village-caracteristics))]
   (-> (nth entities.caracteristics/village-caracteristics roll)
       (logic.caracteristics/apply-to village))))

(s/defn generate-town
        []
        (-> entities.steadings/base-village
            add-name-to-village
            add-caracteristic))