(ns four-clj.p66)

; Given two integers, write a function which returns the greatest common divisor.

(defn greatest-common-divisor [x y]
  (if (= x 0)
    y
    (recur (mod y x) x)))
