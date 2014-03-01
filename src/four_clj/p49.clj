(ns four-clj.p49)

; Write a function which will split a sequence into two parts.

; SPECIAL RESTRICTIONS: split-at

(defn split-seq [n coll]
  (list (take n coll) (drop n coll)))
