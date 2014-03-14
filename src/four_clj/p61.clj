(ns four-clj.p61)

; Write a function which takes a vector of keys and a vector of values and constructs a map from them.
; Special Restrictions: zipmap

(defn map-cons [k-coll v-coll]
  (apply hash-map (interleave k-coll v-coll)))
