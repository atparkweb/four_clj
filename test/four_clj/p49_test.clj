(ns four-clj.p49-test
  (:require [clojure.test :refer :all]
           [four-clj.p49 :refer :all]))


(def-test split-seq-1
  (testing "split-seq-1"
    (is (= (split-seq 3 [1 2 3 4 5 6]) [[1 2 3] [4 5 6]]))))

(def-test split-seq-2
  (testing "split-seq-2"
    (is (= (split-seq 1 [:a :b :c :d]) [[:a] [:b :c :d]]))))

(def-test split-seq-3
  (testing "split-seq-3"
    (is (= (split-seq 2 [[1 2] [3 4] [5 6]]) [[[1 2] [3 4]] [[5 6]]]))))
