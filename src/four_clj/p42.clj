(ns four-clj.p42)

; Write a function which calculates factorials.

; TODO: Implement factorial function

(defn factorial [n]
  (reduce * (range 1 (inc n))))
