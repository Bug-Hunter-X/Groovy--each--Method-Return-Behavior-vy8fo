```groovy
def myMethod(List<String> list) {
  list.each { item ->
    if (item == null) {
      println "Null item encountered"
      return // Exits the each loop prematurely
    }
    println item
  }
}

myMethod(["one", null, "three"])
```