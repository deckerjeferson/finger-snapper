(ns finger-snapper.entities.problem
  (:require [finger-snapper.entities.tags :as entities.tags]))

(def village-arid-incultivable-land
  {:description "The village is in arid or uncultivable land: Need (Food)"
   :tags [entities.tags/need]})

(def village-dedicated-to-deity
  {:description "The village is dedicated to a deity: Religious (that deity), Enmity (a settlement of another deity)"
   :tags [entities.tags/religion
          entities.tags/enmity]})

(def village-fought-battle-to-end
  {:description "The village has recently fought a battle: -Population, -Prosperity if they fought to the end, -Defenses if they lost."
   :modifiers {:prosperity -1
               :defenses 0
               :population -1}})

(def village-fought-battle-and-lost
  {:description "The village has recently fought a battle: -Population, -Prosperity if they fought to the end, -Defenses if they lost."
   :modifiers {:prosperity -1
               :defenses -1
               :population -1}})

(def village-has-monster-problem
  {:description "The village has a monster problem: Blight (that monster), Need (adventurers)"
   :tags [entities.tags/blight
          entities.tags/need]})

(def village-absorved-another-village
  {:description "The village has absorbed another village: +Population, Lawless"
   :modifiers {:prosperity 0
               :population 1
               :defenses 0}
   :tags [entities.tags/lawless]})

(def village-is-remote-or-unwelcoming
  {:description "The village is remote or unwelcoming: -Prosperity, Dwarven or Elven"
   :tags [entities.tags/dwarven]})

(def village-problems
  [village-absorved-another-village
   village-arid-incultivable-land
   village-dedicated-to-deity
   village-fought-battle-and-lost
   village-has-monster-problem
   village-is-remote-or-unwelcoming
   village-problems])