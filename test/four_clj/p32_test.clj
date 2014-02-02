(ns four-clj.p32-test
  (:require [clojure.test :refer :all]
            [four-clj.p32 :refer :all]))


(deftest duplicate-sequence-1
  (testing "duplicate-sequence-1"
    (is (= (duplicate-sequence [1 2 3]) '(1 1 2 2 3 3)))))

(deftest duplicate-sequence-2
  (testing "duplicate-sequence-2"
    (is (= (duplicate-sequence [:a :a :b :b]) '(:a :a :a :a :b :b :b :b)))))

(deftest duplicate-sequence-3
  (testing "duplicate-sequence-3"
    (is (= (duplicate-sequence [[1 2] [3 4]]) '([1 2] [1 2] [3 4] [3 4])))))
