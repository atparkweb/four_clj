(ns four-clj.p29-test
  (:require [clojure.test :refer :all]
            [four-clj.p29 :refer :all]))


(deftest get-the-caps-1
  (testing "get-the-caps-1"
    (is (= (get-the-caps "HeLlO, WoRlD!") "HLOWRD"))))

(deftest get-the-caps-2
  (testing "get-the-caps-2"
    (is (empty? (get-the-caps "nothing")))))

(deftest get-the-caps-3
  (testing "get-the-caps-3"
    (is (= (get-the-caps"$#A(*&987Zf") "AZ"))))
