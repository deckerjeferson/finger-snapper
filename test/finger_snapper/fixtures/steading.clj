(ns finger-snapper.fixtures.steading
  (:require [clojure.test :refer :all]
            [finger-snapper.entities.tags :as entities.tags]))

(def village
  {:name       "Test Village"
   :prosperity 1
   :population 2
   :defenses   1
   :tags       [entities.tags/resource
                entities.tags/oath]})

(def village-with-has-abundant-resource-caracteristic
  {:name       "Test Village"
   :prosperity 2
   :population 2
   :defenses   1
   :tags       [entities.tags/resource
                entities.tags/oath
                entities.tags/resource
                entities.tags/enmity]})

