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

## Scala print mode

In Scala cli,each line of code will be treated as a single program.

```
scala> val i = 10;
i: Int = 10

scala> val i = "hi";
i: String = hi
```

if you notice the above lines of code,it is overwritting the value of **i**.But in :paste mode,it wont allow us to overwwritte the value

Instead of giving each line in command line and executing ,we can execute a complete block of code.
***Use :paste***

and to run the block , **ctrl+d** to execute it.

```
scala> :paste
// Entering paste mode (ctrl-D to finish)

val i =10;
val i = "raj"

// Exiting paste mode, now interpreting.

<console>:24: error: i is already defined as value i
       val i = "raj"
           ^
```
