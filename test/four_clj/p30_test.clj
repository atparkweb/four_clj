(ns four-clj.p30-test
  (:require [clojure.test :refer :all]
            [four-clj.p30 :refer :all]))


(deftest compress-seq-1
  (testing "compress-seq-1"
    (is (= (apply str (compress-seq "Leeeeeerrroyyy")) "Leroy"))))

(deftest compress-seq-2
  (testing "compress-seq-2"
    (is (= (compress-seq [1 1 2 3 3 2 2 3]) '(1 2 3 2 3)))))

(deftest compress-seq-3
  (testing "compress-seq-3"
    (is (= (compress-seq [[1 2] [1 2] [3 4] [1 2]]) '([1 2] [3 4] [1 2])))))
