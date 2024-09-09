// 숫자 타입: 실수(Double, Float) 정수(Long, Int, Short, Byte)
// 정수에만 사용할 수 있는 부호 없는 숫자 타입(Ulong, UInt, UShort, UByte)
//Byte < Short < Int < Long < Float < Double
//바이트에서 더블까지 확장되는 것 임 나중에 퀴즈, 바이트를 갑자기 더블로 바꾸는게 가능할까?


fun main() {
    val d = 123.4e+04 //실수의 기본타입 double 소숫점이 들어간 것. 04는 10의 4승)
    val f = 123.4F //값을 나타낼 수 있는 정보 때문
    println(Double.MAX_VALUE) //double 값의 최대치
    println(Double.MIN_VALUE)
    println(Float.MAX_VALUE)
    println(Float.MIN_VALUE)

    val i: Byte = 123 //정수
    val b = 0b011111 //0b 는 이진수를 나타낸다는 것
    val x = 0x01abcf
    println(b.toString(10)) //진수를 지정하는 것
    println(b.toString(16))

    val g = b.toString()
    println(b.toString(10))
    println(g) // println은 문자열을 출력하는 것
}