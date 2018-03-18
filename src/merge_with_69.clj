(ns merge_with_69)

(defn my-merge-with
  [f & ms]
  (when ((complement empty?) ms)
    (let [merge-entry (fn [acc [k v]]
                        (if (contains? acc k)
                          (assoc acc k (f (get acc k) v))
                          (assoc acc k v)))
          merge-map (fn [acc m]
                      (reduce merge-entry acc m))]
      (reduce merge-map {} ms))))

(= (my-merge-with concat {:a [3], :b [6]} {:a [4 5], :c [8 9]} {:b [7]})
   {:a [3 4 5], :b [6 7], :c [8 9]})
