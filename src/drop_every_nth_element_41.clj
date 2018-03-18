(ns drop_every_nth_element_41)

(defn drop-every-nth
  [coll n]
  (mapcat (partial take (dec n)) (partition-all n coll)))

(defn drop-every-nth
  [coll n]
  (apply concat (partition-all (dec n) n coll)))

(drop-every-nth [:a :b :c :d :e :f :g] 3)
