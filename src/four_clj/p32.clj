(ns four-clj.p32)

; Write a function which duplicates each element of a sequence.

(defn duplicate-sequence [s]
  (interleave s s))
