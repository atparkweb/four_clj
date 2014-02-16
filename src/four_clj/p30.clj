(ns four-clj.p30)

; Write a function which removes consecutive duplicates from a sequence.

(defn compress-seq [coll]
  (when-let [[x & y] (seq coll)]
    (if (= x (first y))
      (compress-seq y)
      (cons x (compress-seq y)))))
