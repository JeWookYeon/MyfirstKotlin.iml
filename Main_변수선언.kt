// 변수 선언: -변수 이름: 변수타입

//변수를 선언할 때 수식어 val 또는 var를 붙여야 함.
//변수는 선언과 동시에 초기값을 할당해야 함.
// value: 불변. 값을 바꿀 수 없음. immutable. read-only
fun main() {
    val i : Int = 20
    println(i + 9)
// variable: 가변. 값을 바꿀 수 있음. mutable. writable.
// assignment statement. 할당문
// LHS(값, 변수) = RHS(수식, expression)
    var r : Int = 20
    r += 1 //r = r + 1
    println(r)

    var n : Int = 20
    n = n/17
    println(n)
    // java: 기본타입(변수) + 참조타입(클래스)
    // 기본 타입(primitive types) - 클래스
    val p: Int = 1 //정수가 됨 // an instance of class Int. objct(객체). 지역변수 local
    val p2: Int =2
    val q: Long = 21L // 대문자 L을 붙여야함
    val w: Double = 3.14 // 실수의 기본 타입 double
    val s: Float = 31.4f // 타입이 같지않으므로 f를 붙여야함
    val t: Char = 'c' // character 타입
    val u: String = "abc"
    val v : Boolean = false
    //첫글자가 대문자인 것은 클래스만
    println(p+1)//println(p.inc())//dot. 을 이용해 씀

    //타입 추론 가능 Int, Loong 등등 지워도 됨 대신 조건으로 즉시 값 할당해야
}

const val PI = 3.14 // constance 상수 값. 함수 안에서 선언하면 에러남 const 지워야함
// 전역 상수. top-level constant. 어디서든 사용가능
fun foo() {
    println(PI)
}