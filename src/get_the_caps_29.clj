(ns get_the_caps_29)


(let [caps (set (map char (range 65 91)))]
  (apply str (filter caps "AbBcC")))

(->> "AbcaBC"
     (map int)
     (filter #(and (<= % 90) (>= % 65)))
     (map char)
     (apply str))

(apply str (re-seq #"[A-Z]+" "AbCd"))
