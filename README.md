Dead Simple Clojure Sample
==========================

The newest swank-clojure jar greately simplifies running a Clojure REPL in emacs, provided that you have 
a Clojure project set up.

This is the simplest clojure project I could think of to try out the newest swank-clojure features.

Requires:

-	Leiningen

- A recent clojure-mode.el, with proper .emacs require statements.


__These notes are very incomplete.  I will fill in with links and detailed directions as I go.__

You have to run `lein deps` in the project directory to install all needed dependancies.

Once in Emacs `M-x clojure-jack-in` will get you a clojure REPL with classpath set to include all your project libs.

You do _not_ need slime installed in your emacs for this to work.

