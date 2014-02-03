(ns four-clj.p40-test
  (:require [clojure.test :refer :all]
            [four-clj.p40 :refer :all]))


(deftest interpose-a-seq-1
  (testing "interpose-a-seq-1"
    (is (= (interpose-a-seq 0 [1 2 3]) [1 0 2 0 3]))))

(deftest interpose-a-seq-2
  (testing "interpose-a-seq-2"
    (is (= (apply str (interpose-a-seq ", " ["one" "two" "three"])) "one, two, three"))))

(deftest interpose-a-seq-3
  (testing "interpose-a-seq-3"
    (is (= (interpose-a-seq :z [:a :b :c :d]) [:a :z :b :z :c :z :d]))))
