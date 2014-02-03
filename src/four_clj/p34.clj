(ns four-clj.p34)


; Write a function which creates a list of all integers in a given range.

; RESTRICTION: Can't use `range`

(defn implement-range [start end]
  (take (- end start) (iterate inc start)))
