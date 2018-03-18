(ns nth_21)

(= ((fn [xs n]
      (if (= n 0)
        (first xs)
        (recur (rest xs) (dec n))))
    '(4 5 6 7)
    2)
   6)
