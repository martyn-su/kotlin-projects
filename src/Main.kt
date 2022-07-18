
import kotlin.random.Random;


fun main(args: Array<String>) {
    val list = bubbleSort(IntArray(10) { Random.nextInt(0, 100) })
    for (k in list) println("$k")
}

fun bubbleSort(list: IntArray): IntArray {
    var swapped = true
    while (swapped) {
        swapped = false
        for (i in 0 until list.size - 1) {
            if (list[i] > list[i + 1]) {
                val temp = list[i]
                list[i] = list[i + 1]
                list[i + 1] = temp

                swapped = true
            }
        }
    }
    return list;
}
