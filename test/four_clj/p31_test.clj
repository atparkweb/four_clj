(ns four-clj.p31-test
  (require [clojure.test :refer :all]
           [four-clj.p31 :refer :all]))


(deftest pack-seq-1
  (testing "pack-seq-1"
    (is (= (pack-seq [1 1 2 1 1 1 3 3]) '((1 1) (2) (1 1 1) (3 3))))))

(deftest pack-seq-2
  (testing "pack-seq-2"
    (is (= (pack-seq [:a :a :b :b :c]) '((:a :a) (:b :b) (:c))))))

(deftest pack-seq-3
  (testing "pack-seq-3"
    (is (= (pack-seq [[1 2] [1 2] [3 4]]) '(([1 2] [1 2]) ([3 4]))))))
