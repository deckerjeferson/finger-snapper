(ns finger-snapper.entities.caracteristics
  (:require [finger-snapper.entities.tags :as entities.tags]))

(def is-naturally-defended
  {:description "The village is somewhere naturally defended"
   :tags [entities.tags/safe]
   :modifiers {:prosperity -1
               :defenses 0
               :population 0}})

(def has-abundant-resource
  {:description "The village has abundant resources that sustain it"
   :tags [entities.tags/resource
          entities.tags/enmity]
   :modifiers {:prosperity 1
               :defenses 0
               :population 0}})

(def under-protection
  {:description "The village is under the protection of another steading"
   :tags [entities.tags/oath]
   :modifiers {:prosperity 0
               :defenses 1
               :population 0}})

(def on-major-road
  {:description "The village is on a major road"
   :tags [entities.tags/trade]
   :modifiers {:prosperity 1
               :defenses 0
               :population 0}})

(def around-wizard-tower
  {:description "The village is built around a wizard’s tower"
   :tags [entities.tags/personage
          entities.tags/blight]
   :modifiers {:prosperity 0
               :defenses 0
               :population 0}})

(def around-religious-significance
  {:description "The village was built on the site of religious significance"
   :tags [entities.tags/divine
          entities.tags/history]
   :modifiers {:prosperity 0
               :defenses 0
               :population 0}})

(def village-caracteristics
  [is-naturally-defended
   has-abundant-resource
   under-protection
   on-major-road
   around-wizard-tower
   around-religious-significance
   village-caracteristics])