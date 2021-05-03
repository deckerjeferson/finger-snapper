(ns finger-snapper.logic.tags-test
  (:require [clojure.test :refer :all]
            [finger-snapper.logic.tags :refer [item-definer!]]
            [finger-snapper.entities.tags :as entities.tags]
            [schema.core :as s]))

(s/with-fn-validation
  (deftest item-definer-test
    (testing "Should select a items and add it to :chosen-item"
      (let [result (item-definer! entities.tags/power)]
       (is (true? ((not-empty (result))
                  (empty? (:collection )))))))

    (testing "Should select a items and add it to :chosen-item"
      (is (not-empty (item-definer! entities.tags/power))))))
