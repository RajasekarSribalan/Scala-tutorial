# Basic Progamming

## print

To print or display in same line use below ***print()*** function.

**Example**
```
 def main(args: Array[String]) {
    print("Hello Scala")
    print("Hello World")
  }
```
**Output**
```
Hello ScalaHello World
```

## println

***println()*** function prints the inputs in new line.

**Example**
```
 def main(args: Array[String]) {
    println("Hello Scala")
    println("Hello World")
  }
```
**Output**
```
Hello Scala
Hello World
```

## printf

***printf()*** function is useful in formatting strings and it prints consecutive printf calls in same line


**Example**
```
 def main(args: Array[String]) {
    printf("My age is %d", 24);
  }
```
**Output**
```
My age is 24
```


**Example**
```
 def main(args: Array[String]) {
    printf("My age is %d", 24);
    printf("My age is %d %d", 24, 23);
  }
```
**Output**
```
My age is 24My age is 24 23
```
