(ns four-clj.p62-test
  (:require [clojure.test :refer :all]
            [four-clj.p62 :refer :all]))


(deftest my-iterate-1
  (testing "my-iterate-1"
    (is (= (take 5 (my-iterate #(* 2 %) 1)) [1 2 4 8 16]))))

(deftest my-iterate-2
  (testing "my-iterate-2"
    (is (= (take 100 (my-iterate inc 0)) (take 100 (range))))))

(deftest my-iterate-3
  (testing "my-iterate-3"
    (is (= (take 9 (my-iterate #(inc (mod % 3)) 1)) (take 9 (cycle [1 2 3]))))))
