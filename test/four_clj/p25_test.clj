(ns four-clj.p25-test
  (:require [clojure.test :refer :all]
            [four-clj.p25 :refer :all]))


(deftest test1
  (testing "Find the odd numbers:1"
    (is (= (find-odds #{1 2 3 4 5}) '(1 3 5)))))

(deftest test2
  (testing "Find the odd numbers:1"
    (is (= (find-odds [4 2 1 6]) '(1)))))

(deftest test3
  (testing "Find the odd numbers:1"
    (is (= (find-odds [2 2 4 6]) '()))))

(deftest test4
  (testing "Find the odd numbers:1"
    (is (= (find-odds [1 1 1 3]) '(1 1 1 3)))))
