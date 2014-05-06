(ns four-clj.p99-test
  (:require [clojure.test :refer :all]
            [four-clj.p99 :refer :all]))


(deftest product-digits-1
  (testing "product-digits-1"
    (is (= (product-digits 1 1) [1]))))

(deftest product-digits-2
  (testing "product-digits-2"
    (is (= (product-digits 99 9) [8 9 1]))))

(deftest product-digits-3
  (testing "product-digits-3"
    (is (= (product-digits 999 99) [9 8 9 0 1]))))
