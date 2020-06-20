(ns start
   (:import
   (javafx.scene Scene)
   (javafx.application Application)
   (javafx.application Platform)
   (javafx.scene.control Button)
   (javafx.stage Stage))
  (:gen-class
   :extends javafx.application.Application
   :name jam.start
   :main true))



(defn -start [this ^Stage stage]
  (println "START")
  (.setScene stage (Scene. (Button. "My Button") 200 100))
  (.show stage)
  (println "started"))

(defn -stop
  [this]
  (println "Exiting"))

(defn -main
  [& args]
  (println "Starting")
  (System/setProperty "prism.order" "sw")
  (System/setProperty "prism.text" "t2k")
  (System/setProperty "prism.nativepisces" "false")
  (System/setProperty "prism.allowhidpi" "false")
  (System/setProperty "prism.vsync" "false")
  (Application/launch jam.start args)
  (println "Done"))
