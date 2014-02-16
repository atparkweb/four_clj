(ns four-clj.p30)

; Write a function which removes consecutive duplicates from a sequence.

(defn compress-seq [coll]
  (reduce #(if (= (last %1) %2) %1 (conj %1 %2)) [] coll))
