import com.btu.*
import kotlin.*

fun main() {
//    val nums = arrayOf(1, 2, 3, 4, 5 , 6, 13)
//    println(avg(nums))
//
//    println(palindrome("aca"))
//    println(palindrome("nika"))


    val point1 = Point(1.1, 2.0);
    val point2 = Point(1.1, 2.1);

    println(point1.equals(point2));

    println(point1.toString())

    point1.symmetricMove()

    println(point1)
    println(point1.distance(point2))
}