(ns simple-test
  (:use clojure.test)
	(:use simple))

(deftest simple-test
  (is (= (hello) "hello world!")
	(is (= (hello "test") "hello test!"))))
