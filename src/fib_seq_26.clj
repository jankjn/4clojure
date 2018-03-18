(ns fib_seq_26)

(def fib-seq (lazy-cat [1 1] (map + (rest fib-seq) fib-seq)))

(take 10 fib-seq)

(take 5 ((fn fib [a b]
           (lazy-seq (cons a (fib b (+ a b))))) 1 1))

(loop [a 1
       b 1
       v []
       cnt 10]
  (if (= cnt 0)
      (seq v)
      (recur b (+ a b) (conj v a) (dec cnt))))

(take 10 (map first (iterate (fn [[a b]] [b (+ a b)]) [1 1])))
