(ns flatten_a_sequence_28)

(defn i [e] (do (prn e) e))

(defn my-flatten [a] (reduce (fn [flattened e]
                               (if (sequential? e)
                                 (vec (concat flattened (my-flatten e)))
                                 (conj flattened e)))
                             []
                             a))

(defn my-flatten [a] (remove sequential?
                             (rest (tree-seq sequential? seq a))))

(my-flatten '((1 2) 3 [4 [5 6]]))
