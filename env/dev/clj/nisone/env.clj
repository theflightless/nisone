(ns nisone.env
  (:require [selmer.parser :as parser]
            [clojure.tools.logging :as log]
            [nisone.dev-middleware :refer [wrap-dev]]))

(def defaults
  {:init
   (fn []
     (parser/cache-off!)
     (log/info "\n-=[nisone started successfully using the development profile]=-"))
   :stop
   (fn []
     (log/info "\n-=[nisone has shut down successfully]=-"))
   :middleware wrap-dev})
