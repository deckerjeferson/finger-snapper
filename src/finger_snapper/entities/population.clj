(ns finger-snapper.entities.population)

(def exodus
  {:name "Exodus"
   :level 0
   :description "The steading has lost its population and is on the verge of collapse."})

(def shrinking
  {:name "Shrinking"
   :level 1
   :description "The population is less than it once was. Buildings stand empty."})

(def steady
  {:name "Steady"
   :level 2
   :description "The population is in line with the current size of the steading. Some slow growth."})

(def growing
  {:name "Growing"
   :level 3
   :description "More people than there are buildings."})

(def booming
  {:name "Booming"
   :level 4
   :description "Resources are stretched thin trying to keep up with the number of people."})