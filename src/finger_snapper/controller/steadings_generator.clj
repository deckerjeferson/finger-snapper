(ns finger-snapper.controller.steadings-generator
  (:require [finger-snapper.entities.steadings :as entities.steadings]
            [finger-snapper.entities.caracteristics :as entities.caracteristics]
            [finger-snapper.entities.problem :as entities.problems]
            [finger-snapper.logic.city-generator :as logic.city-generator]
            [finger-snapper.logic.caracteristic :as logic.caracteristics]
            [finger-snapper.schemas.city-information :as schemas.city-information]
            [finger-snapper.logic.collections :as logic.collections]
            [schema.core :as s]))

(def max-rand (count entities.steadings/names))

(s/defn add-name-to-village :- schemas.city-information/Steading
  [village]
  (-> village
      (assoc :name (logic.city-generator/generate-name (logic.collections/select-random-item entities.steadings/names)))))

(s/defn add-caracteristic :- schemas.city-information/Steading
  [village :- schemas.city-information/Steading
   caracteristics :- [schemas.city-information/Caracteristic]]
  (-> (logic.collections/select-random-item caracteristics)
      (logic.caracteristics/apply-to village)))

()

(s/defn generate-town
  []
  (-> entities.steadings/base-village
      add-name-to-village
      (add-caracteristic entities.caracteristics/village-caracteristics)
      (add-caracteristic entities.problems/village-problems)))
