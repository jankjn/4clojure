(ns duplicate_a_sequence_32)

(mapcat (partial repeat 2) [1 2 3])

(#(interleave % %) [1 2 3])
