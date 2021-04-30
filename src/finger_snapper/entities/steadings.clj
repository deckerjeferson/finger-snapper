(ns finger-snapper.entities.steadings
  (:require [schema.core :as s]
            [finger-snapper.entities.tags :as entities.tags]
            [finger-snapper.entities.caracteristics :as entities.caracteristics]))

(def names ["Graybark" "Nook’s Crossing" "Tanner’s Ford" "Goldenfield" "Barrowbridge" "Rum River" "Brindenburg" "Shambles" "Covaner"
            "Enfield" "Crystal Falls" "Castle Daunting" "Nulty’s Harbor" "Castonshire" "Cornwood" "Irongate" "Mayhill" "Pigton" "Crosses"
            "Battlemoore" "Torsea" "Curland" "Snowcalm" "Seawall" "Varlosh" "Terminum" "Avonia" "Bucksburg" "Settledown" "Goblinjaw"
            "Hammerford" "Pit" "The Gray Fast" "Ennet Bend" "Harrison’s Hold" "Fortress Andwynne" "Blackstone"])

(def possible-town-caracteristics
  [entities.caracteristics/is-naturally-defended
   entities.caracteristics/has-abundant-resource
   entities.caracteristics/under-protection
   entities.caracteristics/on-major-road
   entities.caracteristics/around-wizard-tower
   entities.caracteristics/around-religious-significance])

(def base-village
  {:name nil
   :prosperity 1
   :population 2
   :defenses 1
   :tags [entities.tags/resource
          entities.tags/oath]})
