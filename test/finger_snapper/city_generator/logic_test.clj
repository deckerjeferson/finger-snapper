(ns finger-snapper.city-generator.logic-test
  (:require [finger-snapper.city-generator.logic :refer [get-name-from-list]]
            [clojure.test :as t :refer [deftest testing is]]
            [clojure.test.check.generators :as gen]
            [clojure.test.check.properties :as p]
            [clojure.test.check.clojure-test :refer [defspec]]))

(defn generate-random-index-based-on-collection
  [coll]
  (rand-int (count coll)))

(defspec get-name-from-list-test
         (testing "Should get a city name from a collection of city names when the collection is not empty"
           (p/for-all [names (gen/not-empty (gen/vector (gen/not-empty gen/string-alphanumeric)))]
                    (let [index (generate-random-index-based-on-collection names)
                          city-name (get-name-from-list names index)]
                      (is (some #(= % city-name) names))))))