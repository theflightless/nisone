(ns nisone.env
  (:require [clojure.tools.logging :as log]))

(def defaults
  {:init
   (fn []
     (log/info "\n-=[nisone started successfully]=-"))
   :stop
   (fn []
     (log/info "\n-=[nisone has shut down successfully]=-"))
   :middleware identity})
