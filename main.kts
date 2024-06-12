fun main(args: Iterable<String>) {
    var size = 0;
    for (i in args) {
        size += 1;
    }
    if (size !== 2) {
        println("go fuck yourself");
        return;
    }

    for (arg in args) {
        for (charr in arg) {
            val ternaryCheck = if (charr === 'a') charr else charr.toString().repeat(3)
            println("values: ${ternaryCheck}")
        }
    }

    // println("Hello, World! sarg: ${args[2]}");
}

val test = arrayOf("asd", "asdd2")
val test2 = arrayOf<String>()

main(test.asIterable())
