(ns four-clj.p166-test
  (:require [clojure.test :refer :all]
            [four-clj.p166 :refer :all]))


(deftest comparison-ops-1
  (testing "comparison-ops-1"
    (is (= :gt (comparison-ops < 5 1)))))

(deftest comparison-ops-2
  (testing "comparison-ops-2"
    (is (= :eq (comparison-ops (fn [x y] (< (count x) (count y))) "pear" "plum")))))

(deftest comparison-ops-3
  (testing "comparison-ops-3"
    (is (= :lt (comparison-ops (fn [x y] (< (mod x 5) (mod y 5))) 21 3)))))

(deftest comparison-ops-4
  (testing "comparison-ops-4"
    (is (= :gt (comparison-ops > 0 2)))))
