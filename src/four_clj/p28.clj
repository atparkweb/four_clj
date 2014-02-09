(ns four-clj.p28)

; Write a function which flattens a sequence.

; RESTRICTIONS: Can't use `flatten`

(defn flatten-seq [s]
  (let [l (first s) r (next s)]
    (concat
     (if (sequential? l)
       (flatten-seq l)
       [l])
     (when (sequential? r)
       (flatten-seq r)))))
