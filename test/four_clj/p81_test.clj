(ns four-clj.p81-test
  (:require [clojure.test :refer :all]
            [four-clj.p81 :refer :all]))


(deftest set-intersection-1
  (testing "set-intersection-1"
    (is (= (set-intersection #{0 1 2 3} #{2 3 4 5}) #{2 3}))))

(deftest set-intersection-2
  (testing "set-intersection-2"
    (is (= (set-intersection #{0 1 2} #{3 4 5}) #{}))))

(deftest set-intersection-3
  (testing "set-intersection-3"
    (is (= (set-intersection #{:a :b :c :d} #{:c :e :a :f :d}) #{:a :c :d}))))
