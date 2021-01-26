println("Hello, World!")
// Hello, World!

"Hello, World"
// var res1: String = Hello, World

1 + 2
// val res9: Int = 3

res2
// val res3: Int = 3

1 + 2
// val res4: Int = 3

2 * 2
// val res5: Int = 4

4 / 2
// val res6: Int = 2

4 % 3
// val res7: Int = 1

1.0 + 2.0
// val res8: Double = 3.0

2.2 * 2
// val res9: Double = 4.4

4.5 / 2
// val res10: Double = 2.25

4 % 3
// val res11: Int = 1

4.0 % 2.0
// val res12: Double = 0.0

4.0 % 3.0
// val res13: Double = 1.0

(4.5).asInstanceOf[Int]
// val res14: Int = 4

(4.0).asInstanceOf[Int]
// val res15: Int = 4

1 / 10 * 1 / 10.0
// val res16: Double = 0.0

1.0 / 10 * 1 / 10
// val res17: Double = 0.01

val x = 3 * 2
// val x: Int = 6

var x = 3 * 3
// var x: Int = 9

x = "Hello, World!"
//  ^
// error: type mismatch;
//  found   : String("Hello, World!")
//  required: Int

x = 3 * 4
// mutated y

// ('val'|'var') <変数名> : <型名> = <式>
val x : Int = 3 * 3

// Q. 定価¥1,980,000の商品を値引きして販売したところ、原価1.6％にあたる¥26,400の損失となった。
// 割引額は定価の何パーセントであったか
val cost = 26400 / 0.016
val rate = 100 - (-26400 + cost) * 100 / 1980000 

val u = new User("dwango", 13)
// val u: User = User@10bd54d1

User.printUser(u)
// dwango 13

def foo(): String = {
    "foo" + "foo"
}
// foo: ()String

// if '('<条件式>')' <then式> (else <else式>)?
// <条件式>: Boolean
// <then式>: <条件式>がtrueのとき評価
// <else式>: <条件式>がfalseのとき評価
var age = 17

if(age < 18) {
    "18歳未満です"
} else {
    "18歳以上です"
}
// res0: String = 18歳未満です

age = 18 

if(age < 18) {
    "18歳未満です"
} else {
    "18歳以上です"
}
// res1: String = 18歳以上です

// var age: Int = 5という年齢を定義する変数とvar isSchoolStarted: Boolean = falseという
// 就学を開始しているかどうかという変数を利用して、 1歳から6歳までの就学以前の子どもの場合に“幼児です”と出力し、
// それ以外の場合は“幼児ではありません”と出力するコードを書いてみましょう。
var age: Int = 5
var isSchoolStarted: Boolean = false
if (age < 7) {
    println("幼児です")
} else {
    println("幼児ではありません")
}
if (isSchoolStarted) {
    println("幼児ではありません")
} else {
    println("幼児です")
}

// while '(' <条件式> ')' <本体式>
// <条件式>: Boolean
// <条件式>がtrueの間，<本体式>を評価し続ける
// do while構文も存在
var i = 1

while(i <= 10) {
    println("i = " + i)
    i = i + 1
}
// i = 1
// i = 2
// i = 3
// i = 4
// i = 5
// i = 6
// i = 7
// i = 8
// i = 9
// i = 10

// do whileを利用して、0から数え上げて9まで出力して10になったらループを終了するメソッドloopFrom0To9を書いてみましょう。

def loopFrom0To9(): Unit = {
    var i = 0
    do {
        println("i = " + i)
        i = i + 1
    } while(i < 10)
}
// loopFrom0To9: ()Unit

loopFrom0To9()
// i = 0
// i = 1
// i = 2
// i = 3
// i = 4
// i = 5
// i = 6
// i = 7
// i = 8
// i = 9

def index0f(array: Array[String], target: String): Int = {
    var index = -1
    var found = false
    var i = 0
    while(i < array.length && !found) {
        if(array(i) == target) {
            index = i
            found = true
        }
        i += 1
    }
    index
}
// index0f: (array: Array[String], target: String)Int

def index0f(array: Array[String], target: String): Int = {
    var i = 0
    while(i < array.length) {
        if(array(i) == target) return i
        i += 1
    }
    -1
}
// index0f: (array: Array[String], target: String)Int

// for '(' (<ジェネレータ>;)+ ')' '<本体>'
// # <ジェネレータ> = x <- <式>
for(x <- 1 to 5; y <- 1 until 5) {
    println("x = " + x + " y = " + y)
}
// x = 1 y = 1
// x = 1 y = 2
// x = 1 y = 3
// x = 1 y = 4
// x = 2 y = 1
// x = 2 y = 2
// x = 2 y = 3
// x = 2 y = 4
// x = 3 y = 1
// x = 3 y = 2
// x = 3 y = 3
// x = 3 y = 4
// x = 4 y = 1
// x = 4 y = 2
// x = 4 y = 3
// x = 4 y = 4
// x = 5 y = 1
// x = 5 y = 2
// x = 5 y = 3
// x = 5 y = 4

for(x <- 1 to 5; y <- 1 until 5 if x != y) {
    println("x = " + x + " y = " + y)
}
// x = 1 y = 2
// x = 1 y = 3
// x = 1 y = 4
// x = 2 y = 1
// x = 2 y = 3
// x = 2 y = 4
// x = 3 y = 1
// x = 3 y = 2
// x = 3 y = 4
// x = 4 y = 1
// x = 4 y = 2
// x = 4 y = 3
// x = 5 y = 1
// x = 5 y = 2
// x = 5 y = 3
// x = 5 y = 4

for(e <- List("A", "B", "C", "D", "E")) println(e)
// A
// B
// C
// D
// E

// yield: コレクションの要素を加工して返す
for(e <- List("A", "B", "C", "D", "E")) yield {
    "Pre" + e
}
// res15: List[String] = List(PreA, PreB, PreC, PreD, PreE)

// 1から1000までの3つの整数a, b, cについて、三辺からなる三角形が直角三角形になるような a, b, cの組み合わせを全て出力してください。
// 直角三角形の条件にはピタゴラスの定理を利用してください。 ピタゴラスの定理とは三平方の定理とも呼ばれ、
// a ^ 2 == b ^ 2 + c ^ 2を満たす、a, b, c の長さの三辺を持つ三角形は、直角三角形になるというものです。

for(a <- 1 to 1000; b <- a to 1000; c <- b to 1000 if (a * a == b * b + c * c || b * b == c * c + a * a || c * c == a * a + b * b)) {
    // println("a = " + a + " b = " + b + " c = " + c)
    println((a, b, c)) // better
}
// assumed answer
// for(a <- 1 to 1000; b <- 1 to 1000; c <- 1 to 1000 if a * a == b * b + c * c) {
//   println((a, b, c))
// }

// <対象式> match {
//   (case <パターン> (if <ガード>)? '=>'
//     (<式> (;|<改行>))*
//   )+   
// }

val taro = "Taro"

taro match {
    case "Taro" => "Male"
    case "Jiro" => "Male"
    case "Hanako" => "Female"
}
// res21: String = Male

val one = 1

one match {
  case 1 => "one"
  case 2 => "two"
  case _ => "other"
}
// res22: String = one

"abc" match {
    case "abc" => println("first")
    case "def" => println("second")
}
// first

"abc" match {
    case "abc" | "def" => 
        println("frist")
        println("second")
}
// first
// second

val lst = List("A", "B", "C")

lst match {
    case List("A", b, c) =>
        println("b = " + b)
        println("c = " + c)
    case _ =>
        println("nothing")
}
// b = B
// c = C

lst match {
    case List("A", b, c) if b != "B" => 
        println("b = " + b)
        println("c = " + c)
    case _ => 
        println("nothing")
}
// nothing

val lst = List(List("A"), List("B", "C"))

lst match {
    case List(a@List("A"), x) => 
        println(a)
        println(x)
    case _ => println("nothing")
}
// List(A)
// List(B, C)

val lst = List("A", "B", "C")

lst match {
    case List("A", b, c) => 
        println("b = " + b)
        println("c = " + c)
    case _ =>
        println("nothing")
}
// b = B
// c = C

lst match {
    case "A" :: b :: c :: _ => 
        println("b = " + b)
        println("c = " + c)
    case _ => 
        println("nothing")
}
// b = B
// c = C

import java.util.Locale

val obj: AnyRef = "String Literal"

obj match {
    case v:java.lang.Integer =>
        println("Integer!")
    case v:String =>
        println(v.toUpperCase(Locale.ENGLISH))
}

// new scala.util.Random(new java.security.SecureRandom()).alphanumeric.take(5).toList
// 以上のコードを利用して、 最初と最後の文字が同じ英数字であるランダムな5文字の文字列を1000回出力してください。 
// new scala.util.Random(new java.security.SecureRandom()).alphanumeric.take(5).toList という値は、
// 呼びだす度にランダムな5個の文字（Char型）のリストを与えます。なお、以上のコードで生成されたリストの一部分を利用するだけでよく、
// 最初と最後の文字が同じ英数字であるリストになるまで試行を続ける必要はありません。これは、List(a, b, d, e, f)が得られた場合に、
// List(a, b, d, e, a)のようにしても良いということです。

for(i <- 0 until 1000){
    val lst = new scala.util.Random(new java.security.SecureRandom()).alphanumeric.take(5).toList
    lst match {
        case a :: b :: c :: d :: _ => println(List(a, b, c, d, a))
        case _ => println("Err")
    }
}