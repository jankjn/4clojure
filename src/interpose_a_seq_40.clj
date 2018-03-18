(ns interpose_a_seq_40)

(defn my-interpose
  [sep coll]
  (rest (apply concat (for [e coll] [sep e]))))

(my-interpose 0 [1 2 3])
