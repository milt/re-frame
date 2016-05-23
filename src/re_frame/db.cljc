(ns re-frame.db
  #?(:cljs (:require [reagent.core :as reagent])))


;; -- Application State  --------------------------------------------------------------------------
;;
;; Should not be accessed directly by application code
;; Read access goes through subscriptions.
;; Updates via event handlers.
(def app-db (#?(:cljs reagent/atom
                :clj atom) {}))
