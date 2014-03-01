(ns four-clj.p83)

; Write a function which takes a variable number of booleans.
; Your function should return true if some of the parameters are
; true, but not all of the parameters are true. Otherwise your
; function should return false.

(defn half-truth [& args]
  (boolean (and (some true? args) (some false? args))))
