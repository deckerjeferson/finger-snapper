(ns finger-snapper.entities.prosperity)

(def dirt
  {:name "Dirt"
   :level 0
   :description "Nothing for sale, nobody has more than they need (and they’re lucky if they have that). Unskilled labor is cheap."})

(def poor
  {:name "Poor"
   :level 1
   :description "Only the bare necessities for sale. Weapons are scarce unless the steading is heavily defended or militant. Unskilled labor is readily available."})

(def moderate
  {:name "Moderate"
   :level 2
   :description "Most mundane items are available. Some types of skilled laborers."})

(def wealthy
  {:name "Wealthy"
   :level 3
   :description "Any mundane item can be found for sale. Most kinds of skilled laborers are available, but demand is high for their time."})

(def rich
  {:name "Rich"
   :level 4
   :description "Mundane items and more, if you know where to find them. Specialist labor available, but at high prices."})