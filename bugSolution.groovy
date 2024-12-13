```groovy
def myMethod(List<String> list) {
  list.eachWithIndex { item, index ->
    if (item == null) {
      println "Null item encountered at index: $index"
      // Option 1: Throw an exception for better error handling
      throw new IllegalArgumentException("Null value found in list.")
      // Option 2: Continue processing but handle nulls appropriately
      //println "Null value processed."
    } else {
      println item
    }
  }
}

//Alternative approach using find and a different way of exception handling
def myMethod2(List<String> list){
    if(list.find{it == null}){ 
        throw new IllegalArgumentException("List contains null values")
    }else{
        list.each{println it}
    }
}
myMethod(["one", null, "three"])
myMethod2(["one","two","three"])
```