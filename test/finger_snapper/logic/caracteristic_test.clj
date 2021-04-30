(ns finger-snapper.logic.caracteristic-test
  (:require [clojure.test :refer :all]
            [finger-snapper.logic.caracteristic :refer [apply-to]]
            [schema.core :as s]
            [finger-snapper.fixtures.steading :as fixtures.steading]
            [finger-snapper.entities.caracteristics :as entities.caracteristics]
            [finger-snapper.entities.problem :as entities.problem]
            [matcher-combinators.test]
            [matcher-combinators.matchers :as m]
            ))

(s/with-fn-validation
  (deftest apply-to-test
    (testing "Should increment the modifiers, concat tags and add caracteristic to existing steading"
      (is (match? fixtures.steading/village-with-has-abundant-resource-caracteristic
                  (apply-to entities.caracteristics/has-abundant-resource
                  fixtures.steading/village))))

    (testing "Should not increment modifiers when the caracteristics does not contain it"
      (let [village-with-caracteristic (apply-to entities.problem/village-is-remote-or-unwelcoming
                                                 fixtures.steading/village)]
       (is (true? (and (= (:prosperity fixtures.steading/village)
                          (:prosperity village-with-caracteristic))
                       (= (:defenses fixtures.steading/village)
                          (:defenses village-with-caracteristic))
                       (= (:population fixtures.steading/village)
                          (:population village-with-caracteristic)))))))

    (testing "Should not add tags when there's no tags"
      (is (let [village-with-caracteristic (apply-to entities.problem/village-fought-battle-and-lost
                                                     fixtures.steading/village)]
            (is (match? (:tags fixtures.steading/village)
                        (:tags village-with-caracteristic))))))))


