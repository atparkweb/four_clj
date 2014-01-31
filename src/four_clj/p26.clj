(ns four-clj.p26)

; Write a function which returns the first X fibonacci numbers.

(defn n-fibonacci [n]
  (take n ((fn ! [x y] (cons x (lazy-seq (! y (+ x y))))) 1 1)))
