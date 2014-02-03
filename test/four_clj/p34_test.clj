(ns four-clj.p34-test
  (:require [clojure.test :refer :all]
            [four-clj.p34 :refer :all]))


(deftest implement-range-1
  (testing "implement-range-1"
    (is (= (implement-range 1 4) '(1 2 3)))))

(deftest implement-range-2
  (testing "implement-range-2"
    (is (= (implement-range -2 2) '(-2 -1 0 1)))))

(deftest implement-range-3
  (testing "implement-range-3"
    (is (= (implement-range 5 8) '(5 6 7)))))
