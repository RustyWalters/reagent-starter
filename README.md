# ClojureScript starter project 

Uses shadow-cljs for clojurescript compilation.
Setup with index.html file and core script to attach a basic reagent component.

enter command in terminal to compile and watch clojurescript code:
npx shadow-cljs watch :app

enter command in another terminal to start cljs-repl:
npx shadow-cljs cljs-repl :app

##setup nvim/conjure to interact with cljs-repl:
nvim : <enter the command below>
ConjureConnect localhost:<nREPL port started by shadow-cljs>

nvim : <enter the command below>
ConjureShadowSelect app
