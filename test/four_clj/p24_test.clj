(ns four-clj.p24-test
  (:require [clojure.test :refer :all]
            [four-clj.p24 :refer :all]))

(deftest test1
  (testing "Sum it all up:1"
    (is (= (sum-it-up [1 2 3]) 6))))
(deftest test2
  (testing "Sum it all up:2"
    (is (= (sum-it-up (list 0 -2 5 5)) 8))))
(deftest test3
  (testing "Sum it all up:3"
    (is (= (sum-it-up #{4 2 1}) 7))))
(deftest test4
  (testing "Sum it all up:4"
    (is (= (sum-it-up '(0 0 -1)) -1))))
(deftest test5
  (testing "Sum it all up:5"
    (is (= (sum-it-up '(1 10 3)) 14))))
