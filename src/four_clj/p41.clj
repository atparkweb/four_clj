(ns four-clj.p41)

; Write a function which drops every Nth item from a sequence.

(defn drop-nth [coll n]
  (mapcat pop (map vec (partition n n [nil] coll))))
