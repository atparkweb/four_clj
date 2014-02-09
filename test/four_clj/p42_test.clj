(ns four-clj.p42-test
  (require [clojure.test :refer :all]
           [four-clj.p42 :refer :all]))


(deftest factorial-1
  (testing "factorial-1"
    (is (= (factorial 1) 1))))

(deftest factorial-2
  (testing "factorial-2"
    (is (= (factorial 3) 6))))

(deftest factorial-3
  (testing "factorial-3"
    (is (= (factorial 5) 120))))

(deftest factorial-4
  (testing "factorial-4"
    (is (= (factorial 8) 40320))))
