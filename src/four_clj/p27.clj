(ns four-clj.p27)

; Write a function which returns true if the given sequence is a palindrome.
; Hint: "racecar" does not equal '(\r \a \c \e \c \a \r)

(defn palindrome-detector [s]
  (= (reverse s) (seq s)))

(palindrome-detector "racecar")
