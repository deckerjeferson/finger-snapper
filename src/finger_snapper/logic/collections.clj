(ns finger-snapper.logic.collections
  (:require [schema.core :as s]))

(s/defn select-random-item
  [collection :- []]
  (if (not-empty collection)
    (let [roll (rand-int (count collection))]
      (nth collection roll))
    nil))
