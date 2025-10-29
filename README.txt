Vehicle Insurance Manager - Multi-file Java Project
Structure:
 src/
  core/        -> domain classes
  exceptions/  -> custom exceptions
  utils/       -> file/db/logger utilities
  threads/     -> threaded tasks
  network/     -> simple server/client demo
  ui/          -> Swing UI stubs
  Main.java    -> entry point

How to compile & run (from project root):
  cd src
  javac Main.java core/*.java utils/*.java threads/*.java network/*.java ui/*.java exceptions/*.java
  java Main

Notes:
 - JDBC is provided as a stub (no real DB connection). To enable JDBC, add your driver and update DatabaseHandler.
 - The server/client demo uses localhost:5000; firewall or occupied port may affect it.