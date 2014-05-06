(ns four-clj.p62)

; Given a side-effect free function f and an initial value x
; write a function which returns an infinite lazy sequence of
; x, (f x), (f (f x)), (f (f (f x))), etc.

; Special Restrictions: iterate

;(defn my-iterate [f n]
;  )

(defn defer-expensive [cheap expensive]
  (if-let [good-enough (force cheap)]
    good-enough
    (force expensive)))

(defer-expensive
  (delay :cheap)
  (delay (do (Thread/sleep 5000) :expensive)))

(defer-expensive
  (delay false)
  (delay (do (Thread/sleep 5000) :expensive)))
