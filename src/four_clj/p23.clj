(ns four-clj.p23)

; Write a function which reverses a sequence.

; RESTRICTION:
;    `reverse`
;    `rseq`

(defn reverse-a-sequence [s]
  (reduce conj '() s))
