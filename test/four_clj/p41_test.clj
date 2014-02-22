(ns four-clj.p41-test
  (require [clojure.test :refer :all]
           [four-clj.p41 :refer :all]))


(deftest drop-nth-1
  (testing "drop-nth-1"
    (is (= (drop-nth [1 2 3 4 5 6 7 8] 3) [1 2 4 5 7 8]))))

(deftest drop-nth-2
  (testing "drop-nth-2"
    (is (= (drop-nth [:a :b :c :d :e :f] 2) [:a :c :e]))))

(deftest drop-nth-3
  (testing "drop-nth-3"
    (is (= (drop-nth [1 2 3 4 5 6] 4) [1 2 3 5 6]))))
