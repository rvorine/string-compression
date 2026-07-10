fun compress(input: String): String {
    if (input.isEmpty()) return ""

    val compressed = StringBuilder()
    var count = 1

    for (i in 1..input.length) {
        if (i < input.length && input[i] == input[i - 1]) {
            count++
        } else {
            compressed.append(input[i - 1]).append(count)
            count = 1
        }
    }

    return if (compressed.length < input.length) compressed.toString() else input
}

fun main(args: Array<String>) {
    val sample = if (args.isNotEmpty()) args[0] else "aabcccccaaa"
    println(compress(sample))
}
