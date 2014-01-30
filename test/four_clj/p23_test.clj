(ns four-clj.p23-test
  (:require [clojure.test :refer :all]
            [four-clj.p23 :refer :all]))

(deftest test1
  (testing "Reverse-a-sequence:1"
    (is (= (reverse-a-sequence [1 2 3 4 5]) [5 4 3 2 1]))))
(deftest test2
  (testing "Reverse-a-sequence:2"
    (is (= (reverse-a-sequence (sorted-set 5 7 2 7)) '(7 5 2)))))
(deftest test3
  (testing "Reverse-a-sequence:3"
    (is (= (reverse-a-sequence [[1 2][3 4][5 6]]) [[5 6][3 4][1 2]]))))
