(defproject tmcf/clatrix "0.5.1-SNAPSHOT"
  :description "Because using matrices in Clojure needs to not suck."
  :url "http://tel.github.com/clatrix"
  :license {:name "MIT License"
            :url "http://www.opensource.org/licenses/MIT"}
  :resource-paths ["native"]
  :plugins [[lein-expectations "0.0.8"]]

  :dependencies [[org.clojure/clojure "1.8.0"]
                 [slingshot "0.12.2"]
                 [org.jblas/jblas "1.2.3"]
                 [net.mikera/core.matrix "0.57.0"]]
  
  :profiles {:dev {:dependencies [[criterium/criterium "0.4.4"]
                                  [net.mikera/core.matrix "0.57.0" :classifier "tests"]
                                  [expectations "2.1.9"]]}})
