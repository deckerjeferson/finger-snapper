(ns finger-snapper.logic.collections-test
  (:require [clojure.test :refer :all])
  (:require [finger-snapper.logic.collections :refer [select-random-item]]
            [schema.core :as s]))

(def some-collection
  ["aaaa"
   "bbbb"
   "cccc"
   "dddd"])

(def empty-collection [])

(s/with-fn-validation
  (deftest select-random-item-test
    (testing "Should return a random item from a collection with items"
      (is (not-empty (select-random-item some-collection))))

    (testing "Should return a nil from the collection without items"
      (is (nil? (select-random-item empty-collection))))))
