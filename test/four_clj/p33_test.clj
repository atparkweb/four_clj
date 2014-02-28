(ns four-clj.p33-test
  (:require [clojure.test :refer :all]
           [four-clj.p33 :refer :all]))


(deftest test-1
  (testing "replicate-seq-1"
    (is (= (replicate-seq [1 2 3] 2) '(1 1 2 2 3 3)))))

(deftest test-2
  (testing "replicate-seq-2"
    (is (= (replicate-seq [:a :b] 4) '(:a :a :a :a :b :b :b :b)))))

(deftest test-3
  (testing "replicate-seq-3"
    (is (= (replicate-seq [4 5 6] 1) '(4 5 6)))))

(deftest test-4
  (testing "replicate-seq-4"
    (is (= (replicate-seq [[1 2] [3 4]] 2) '([1 2] [1 2] [3 4] [3 4])))))

(deftest test-5
  (testing "replicate-seq-5"
    (is (= (replicate-seq [44 33] 2) [44 44 33 33]))))
