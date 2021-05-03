(ns finger-snapper.logic.tags
  (:require [schema.core :as s]
            [finger-snapper.schemas.city-information :as schemas.city-information]
            [finger-snapper.logic.collections :as logic.collections]))

(s/defn item-definer! :- schemas.city-information/Tag
  [tag :- schemas.city-information/Tag]
  (let [chosen-item (some-> tag
                            :collection
                            logic.collections/select-random-item)]
    (some-> tag
            (assoc :chosen-item chosen-item)
            (dissoc :collection))))