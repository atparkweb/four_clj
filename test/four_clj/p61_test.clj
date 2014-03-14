(ns four-clj.p61-test
  (:require [clojure.test :refer :all]
            [four-clj.p61 :refer :all]))


(deftest map-cons-1
  (testing "map-cons-1"
    (is (= (map-cons [:a :b :c] [1 2 3]) {:a 1, :b 2, :c 3}))))

(deftest map-cons-2
  (testing "map-cons-2"
    (is (= (map-cons [1 2 3 4] ["one" "two" "three"]) {1 "one", 2 "two", 3 "three"}))))

(deftest map-cons-3
  (testing "map-cons-3"
    (is (= (map-cons [:foo :bar] ["foo" "bar" "baz"]) {:foo "foo", :bar "bar"}))))
