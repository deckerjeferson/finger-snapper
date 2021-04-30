(ns finger-snapper.entities.defenses)

(def none
  {:name "None"
   :level 0
   :description "Clubs, torches, farming tools."})

(def militia
  {:name "Militia"
   :level 1
   :description "There are able-bodied men and women with worn weapons ready to be called, but no standing force."})

(def watch
  {:name "Watch"
   :level 2
   :description "There are a few watchers posted who look out for trouble and settle small problems, but their main role is to summon the militia."})

(def guard
  {:name "Guard"
   :level 3
   :description "There are armed defenders at all times with a total pool of less than 100 (or equivalent). There is always at least one armed patrol about the steading."})

(def garrison
  {:name "Garrison"
   :level 4
   :description "There are armed defenders at all times with a total pool of 100–300 (or equivalent). There are multiple armed patrols at all times."})

(def battalion
  {:name "Battalion"
   :level 5
   :description "As many as 1,000 armed defenders (or equivalent). The steading has manned maintained defenses as well."})

(def legion
  {:name "Legion"
   :level 6
   :description "The steading is defended by thousands of armed soldiers (or equivalent). The steading’s defenses are intimidating."})