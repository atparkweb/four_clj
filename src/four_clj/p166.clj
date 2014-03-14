(ns four-clj.p166)

; For any orderable data type it's possible to derive all of the basic comparison operations (<, ≤, =, ≠, ≥, and >)
; from a single operation (any operator but = or ≠ will work). Write a function that takes three arguments, a less
; than operator for the data and two items to compare. The function should return a keyword describing the relationship
; between the two items. The keywords for the relationship between x and y are as follows:
;
;   x = y → :eq
;   x > y → :gt
;   x < y → :lt

(defn comparison-ops [less-that-op a b]
  (throw (.Exception "Not implemented")))
