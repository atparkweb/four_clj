(ns four-clj.p62)

; Given a side-effect free function f and an initial value x
; write a function which returns an infinite lazy sequence of
; x, (f x), (f (f x)), (f (f (f x))), etc.

; Special Restrictions: iterate

(defn my-iterate [f n]
  (throw (.Exception "Not Implemented")))
