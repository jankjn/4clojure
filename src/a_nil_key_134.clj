(ns a_nil_key_134)

(defn f
  [k m]
  (and (contains? m k)
       (nil? (m k))))

(true? (f :a {:a nil :b 2}))
