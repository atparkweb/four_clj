(ns four-clj.p81)

; Write a function which returns the intersection of two sets.
; The intersection is the sub-set of items that each set has in common.

; SPECIAL RESTRICTION: intersection

(defn set-intersection [s1 s2]
  (set (filter #(contains? s1 %) s2)))
