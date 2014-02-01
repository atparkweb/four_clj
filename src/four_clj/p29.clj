(ns four-clj.p29)

; Write a function which takes a string and returns a new string containing only the capital letters.

(defn get-the-caps [coll]
  (reduce str (filter #(Character/isUpperCase %) coll)))
