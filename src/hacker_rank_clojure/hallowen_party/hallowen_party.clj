(ns hacker-rank-clojure.hallowen-party.hallowen-party)

(defn halloweenParty
  [k]
  (def half (/ k 2))
  (def halfInt (int (/ k 2)))
  (if (integer? half)
    (* halfInt halfInt)
    (* halfInt (+ 1 halfInt))
    )
  )

