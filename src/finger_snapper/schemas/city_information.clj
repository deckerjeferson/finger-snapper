(ns finger-snapper.schemas.city-information
  (:require [schema.core :as s]))

(def Tag
  {:name s/Str
   :description s/Str
   :chosen-item s/Str
   :collection [s/Str]})

(def Caracteristic
  {:description s/Str
   :tags [Tag]
   :modifiers {:prosperity s/Int
               :population s/Int
               :defenses s/Int}})

(def Steading
  {:name s/Str
   :prosperity s/Int
   :defenses s/Int
   :population s/Int
   :caracteristic s/Str
   :tags [Tag]})
