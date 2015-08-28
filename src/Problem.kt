/**
 * Created by flowkater on 2015. 8. 28..
 */
import java.util.*

/*
    1. 함수 선언 해보기 (메인 함수 포함)
 */

fun main(args: Array<String>) {
    println("Hello World")
    println("max: ${max(1, 2)}" )
    arrayTest()
    repeatTest()
    rangeInTest()
}

/*
    2. max 함수 한줄로 구현하기
 */

fun max(a: Int, b: Int) = if (a > b ) a else b

/*
    3. 배열 선언해보기 (ArrayList 포함)
 */

fun arrayTest() {
    println("arrayTest")
    var array = arrayOf(1, 2, 3) // Array
    //    array.set(3, 5) // ArrayIndexOUtOfBoundsException
    println(array)

    val arrayList = arrayListOf<String>() // ArrayList
    arrayList.add("Tony")
    arrayList.add("Carter")
    println(arrayList)

    val arr = Array(5, { i -> (i * i) })
    println(arr)
}

/*
    4. while 문 / for 문 구현하기
 */

fun repeatTest(){
    println("repeatTest")
    val arr = Array(5, {i -> (i * i)})
    var i = 0
    print("[")
    while (i < arr.size())
        print(" ${arr[i++]} ")
    println("]")

    print("[")
    for (x in arr)
        print(" ${x} ")
    println("]")
}


/*
    5. range / in (for,if) 구현해보기
 */

fun rangeInTest(){
    println("rangeInTest")
    for (i in 1..5)
        print(i)
    println()

    val x = 0

    if (x !in 3..5)
        println(true)

    if (x in 3..5)
        println(true)
    else
        println(false)

}

/*
    6. pair 로 멀티 선언하기
 */

/*
    7. data class 를 설명하고 data class 를 선언하기
 */

/*
    8. data class 함수 4개 테스트 해보기
 */

/*
    9. 해시맵 선언해서 key, value 출력하기
 */

/*
    10. Delegate 설명하고 Delegate 활용 예제 구현하기
 */

/*
    11. Delegate lazy 함수 설명하고 예제 구현
 */

/*
    12. Delegate Observable 함수 설명하고 예제 구현
 */

/*
    13. Delegate notNull() 함수 설명하고 예제 구현
 */
/*
    14. class 속성을 Map 을 활용해서 구현하기
 */
/*
    15. filter 함수 이용해서 isOdd 함수를 인자로 넘겨서 결과값 출력
 */
/*
    16. isOdd 와 length 함수 두개를 조합해보기
 */

/*
    17. sum 구현하기
     Your task is to implement the sum() function so that it computes the sum of
     all elements in the given array a.
 */
fun sum(a: IntArray): Int {
    // Write your solution here
    return 0
}

/*
    18. indexOfMax 구현하기
     Your task is to implement the indexOfMax() function so that it returns
 *   the index of the largest element in the array, or null if the array is empty.
 */
fun indexOfMax(a: IntArray): Int? {
    return 0
}

/*
    19. runs 구현하기
     Any array may be viewed as a number of "runs" of equal numbers.
     * For example, the following array has two runs:
     *   1, 1, 1, 2, 2
     * Three 1's in a row form the first run, and two 2's form the second.
     * This array has two runs of length one:
     *   3, 4
     * And this one has five runs:
     *   1, 0, 1, 1, 1, 2, 0, 0, 0, 0, 0, 0, 0
     * Your task is to implement the runs() function so that it returns the number
     * of runs in the given array.
 */
fun runs(a: IntArray): Int {
    // Write your solution here
    return 0
}

/*
    20. isPalindrome 구현하기
    Your task is to implement a palindrome test.
     * A string is called a palindrome when it reads the same way left-to-right
     * and right-to-left.
     *
     * See http://en.wikipedia.org/wiki/Palindrome
 */
fun isPalindrome(s: String): Boolean {
    // Write your solution here
    return false
}

/*
    21. findPairless 구현하기
     * Think of a perfect world where everybody has a soulmate.
     * Now, the real world is imperfect: there is exactly one number in the array
     * that does not have a pair. A pair is an element with the same value.
     * For example in this array:
     *   1, 2, 1, 2
     * every number has a pair, but in this one:
     *   1, 1, 1
     * one of the ones is lonely.
     *
     * Your task is to implement the findPairless() function so that it finds the
     * lonely number and returns it.
     *
     * A hint: there's a solution that looks at each element only once and uses no
     * data structures like collections or trees.
 */
fun findPairless(a: IntArray): Int {
    // Write your solution here
    return 0
}