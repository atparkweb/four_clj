(ns four-clj.p25)

; Write a function which returns only the odd numbers from a sequence.

(defn find-odds [s]
  (filter odd? s))
