(ns four-clj.p30)

; Write a function which removes consecutive duplicates from a sequence.

(defn compress-seq [coll]
  (map first (partition-by identity coll)))
