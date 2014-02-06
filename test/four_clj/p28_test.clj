(ns four-clj.p28-test
  (:require [clojure.test :refer :all]
            [four-clj.p28 :refer :all]))


(deftest flatten-seq-1
  (testing "flatten-seq-1"
    (is (= (flatten-seq '((1 2) 3 [4 [5 6]])) '(1 2 3 4 5 6)))))

(deftest flatten-seq-2
  (testing "flatten-seq-2"
    (is (= (flatten-seq ["a" ["b"] "c"]) '("a" "b" "c")))))

(deftest flatten-seq-3
  (testing "flatten-seq-3"
    (is (= (flatten-seq '((((:a))))) '(:a)))))
