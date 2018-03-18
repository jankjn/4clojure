(ns implement_range_34)

(defn my-range
  [start end]
  (if (= start end)
    ()
    (lazy-seq (cons start (my-range (inc start) end)))))

(defn my-range
  [start end]
  (take (- end start) (iterate inc start)))

(my-range 2 7)
