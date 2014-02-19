(ns four-clj.p33)

; Write a function which replicates each element of a sequence a variable number of times.

(defn replicate-seq [coll n]
  (mapcat #(take n (iterate identity %)) coll))
