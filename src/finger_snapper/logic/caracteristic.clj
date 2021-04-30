(ns finger-snapper.logic.caracteristic
  (:require [finger-snapper.schemas.city-information :as schemas.city-information]
            [schema.core :as s]))

(s/defn apply-to :- schemas.city-information/Steading
          [caracteristic :- schemas.city-information/Caracteristic
         steading :- schemas.city-information/Steading]
        (-> steading
            (update :defenses + (get-in caracteristic [:modifiers :defenses] 0))
            (update :prosperity + (get-in caracteristic [:modifiers :prosperity] 0))
            (update :population + (get-in caracteristic [:modifiers :population] 0))
            (assoc :caracteristic (get caracteristic :description))
            (update :tags concat (get caracteristic :tags))))

