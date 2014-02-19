(ns four-clj.p31)

; Write a function which packs consecutive duplicates into sub-lists.

(defn pack-seq [coll]
  (partition-by identity coll))
