// | Keyword      | Use                                                                 |
// | ------------ | ------------------------------------------------------------------- |
// | `final`      | Used to declare constants, prevent method overriding or inheritance |
// | `finally`    | A block used with try-catch that always executes                    |
// | `finalize()` | Method called by garbage collector before object destruction        |



final int x = 10;

try {
  // code
} finally {
  System.out.println("Always executes");
}

@Override
protected void finalize() throws Throwable {
  System.out.println("Cleanup before GC");
}
