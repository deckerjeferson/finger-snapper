(ns finger-snapper.entities.tags)

(def safe
  {:name "Safe"
   :description "Outside trouble doesn’t come here until the players bring it. Idyllic and often hidden, if the steading would lose or degrade another beneficial tag get rid of safe instead."})

(def religion
  {:name "Religion"
   :description "The listed deity is revered here."})

(def resource
  {:name "Resource"
   :description "The steading has easy access to the listed resource (e.g., a spice, a type of ore, fish, grapes). That resource is significantly cheaper."})

(def need
  {:name "Need"
   :description "The steading has an acute or ongoing need for the listed resource. That resource sells for considerably more."})

(def oath
  {:name "Oath"
   :description "The steading has sworn oaths to the listed steadings. These oaths are generally of fealty or support, but may be more specific."})

(def trade
  {:name "Trade"
   :description "The steading regularly trades with the listed steadings."})

(def market
  {:name "Market"
   :description "Everyone comes here to trade. On any given day the available items may be far beyond their prosperity. +1 to supply."})

(def enmity
  {:name "Enmity"
   :description "The steading holds a grudge against the listed steadings."})

(def history
  {:name "History"
   :description "Something important once happened here, choose one and detail or make up your own: battle, miracle, myth, romance, tragedy."})

(def arcane
  {:name "Arcane"
   :description "Someone in town can cast arcane spells for a price. This tends to draw more arcane casters, +1 to recruit when you put out word you’re looking for an adept."})

(def divine
  {:name "Divine"
   :description "There is a major religious presence, maybe a cathedral or monastery. They can heal and maybe even raise the dead for a donation or resolution of a quest. Take +1 to recruit priests here."})

(def guild
  {:name "Guild"
   :description "The listed type of guild has a major presence (and usually a fair amount of influence). If the guild is closely associated with a type of hireling, +1 to recruit that type of hireling."})

(def personage
  {:name "Personage"
   :description "There’s a notable person who makes their home here. Give them a name and a short note on why they’re notable."})

(def dwarven
  {:name "Dwarven"
   :description "The steading is significantly or entirely dwarves. Dwarven goods are more common and less expensive than they typically are."})

(def elven
  {:name "Elven"
   :description "The steading is significantly or entirely elves. Elven goods are more common and less expensive than they typically are."})

(def lawless
  {:name "Lawless"
   :description "Crime is rampant; authority is weak."})

(def blight
  {:name "Blight"
   :description "The steading has a recurring problem, usually a type of monster."})

(def power
  {:name "Power"
   :description "The steading holds sway of some type. Typically political, divine, or arcane."})


