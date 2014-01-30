(ns four-clj.p27-test
  (:require [clojure.test :refer :all]
            [four-clj.p27 :refer :all]))

(deftest test-palindrome-detector-1
  (testing "palindrome-detector:1"
    (is (false? (palindrome-detector '(1 2 3 4 5))))))

(deftest test-palindrome-detector-2
  (testing "palindrome-detector:2"
    (is (true? (palindrome-detector "racecar")))))

(deftest test-palindrome-detector-3
  (testing "palindrome-detector:3"
    (is (true? (palindrome-detector [:foo :bar :foo])))))

(deftest test-palindrome-detector-4
  (testing "palindrome-detector:4"
    (is (true? (palindrome-detector '(1 1 3 3 1 1))))))

(deftest test-palindrome-detector-5
  (testing "palindrome-detector:5"
    (is (false? (palindrome-detector '(:a :b :c))))))
