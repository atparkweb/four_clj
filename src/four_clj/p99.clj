(ns four-clj.p99)

; Write a function which multiplies two numbers and returns the result as a sequence of its digits.

(defn product-digits [x y]
  (map (comp read-string str) (str (* x y))))
