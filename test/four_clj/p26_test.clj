(ns four-clj.p26-test
  (:require [clojure.test :refer :all]
            [four-clj.p26 :refer :all]))


(deftest n-fibonacci-1
  (testing "n-fibonacci-1"
    (is (= (n-fibonacci 3) '(1 1 2)))))

(deftest n-fibonacci-2
  (testing "n-fibonacci-2"
    (is (= (n-fibonacci 6) '(1 1 2 3 5 8)))))

(deftest n-fibonacci-3
  (testing "n-fibonacci-3"
    (is (= (n-fibonacci 8) '(1 1 2 3 5 8 13 21)))))
