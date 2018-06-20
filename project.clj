(defproject me.grison/duct-immutant "0.1.0"
  :description "Integrant methods for running an Immutant web server"
  :url "https://github.com/agrison/duct-immutant"
  :license {:name "Eclipse Public License"
            :url  "http://www.eclipse.org/legal/epl-v10.html"}
  :lein-release {:scm :git :deploy-via :clojars}
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [integrant "0.6.3"]
                 [duct/core "0.6.2"]
                 [duct/logger "0.2.1"]
                 [ikitommi/immutant-web "3.0.0-alpha1"]]
  :profiles
  {:dev {:dependencies [[clj-http "2.1.0"]]}})
