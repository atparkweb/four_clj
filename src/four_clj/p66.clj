(ns four-clj.p66)

; Given two integers, write a function which returns the greatest common divisor.

(defn greatest-common-divisor [x y]
  (let [_max (max x y) _min (min x y)]
    (apply max (filter #(= (+ (mod _max %) (mod _min %)) 0) (range 1 (inc _min))))))

; BETTER SOLUTION: #(if (zero? %) %2 (recur (mod %2 %) %))
