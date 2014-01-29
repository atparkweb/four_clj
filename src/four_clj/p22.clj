(ns four-clj.p22)

; Write a function which returns the total number of elements in a sequence.
; Special restrictions: can't use `count`

(defn count-a-sequence [s]
  (reduce + (map (constantly 1) s)))
