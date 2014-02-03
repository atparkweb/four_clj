(ns four-clj.p40)

; Write a function which separates the items of a sequence by an arbitrary value.

; RESTRICTIONS: Can't use `interpose`

(defn interpose-a-seq [value coll]
  (rest (interleave (repeat value) coll)))
