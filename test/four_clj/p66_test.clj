(ns four-clj.p66-test
  (:require [clojure.test :refer :all]
            [four-clj.p66 :refer :all]))


(deftest greatest-common-divisor-1
  (testing "greatest-common-divisor-1"
    (is (= (greatest-common-divisor 2 4) 2))))

(deftest greatest-common-divisor-1
  (testing "greatest-common-divisor-1"
    (is (= (greatest-common-divisor 10 5) 5))))

(deftest greatest-common-divisor-1
  (testing "greatest-common-divisor-1"
    (is (= (greatest-common-divisor 5 7) 1))))

(deftest greatest-common-divisor-1
  (testing "greatest-common-divisor-1"
    (is (= (greatest-common-divisor 1023 858) 33))))
