(ns four-clj.p22-test
  (:require [clojure.test :refer :all]
            [four-clj.p22 :refer :all]))

(deftest test1
  (testing "count-a-sequence:1"
    (is (= (count-a-sequence '(1 2 3 3 1)) 5))))
(deftest test2
  (testing "count-a-sequence:2"
    (is (= (count-a-sequence "Hello World") 11))))
(deftest test3
  (testing "count-a-sequence:3"
    (is (= (count-a-sequence [[1 2] [3 4] [5 6]]) 3))))
(deftest test4
  (testing "count-a-sequence:4"
    (is (= (count-a-sequence '(13)) 1))))
(deftest test5
  (testing "count-a-sequence:5"
    (is (= (count-a-sequence '(:a :b :c)) 3))))
