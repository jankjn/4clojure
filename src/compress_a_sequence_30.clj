(ns compress_a_sequence_30)

(defn compress
  [coll]
  (->> (partition 2 1 coll)
       (filter #(apply not= %))
       (#(concat (first %) (map second (rest %))))))

(defn compress
  [coll]
  (map first (partition-by identity coll)))

(= (compress [1 1 2 3 3 2 2 3]) '(1 2 3 2 3))
