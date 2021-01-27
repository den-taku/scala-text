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

// class <クラス名> '(' (<引数名1> : <引数型1>, <引数名2> : <引数型2>...)? ')' {
//     (<フィールド定義> | <メソッド定義> )*
// }
class Point(_x: Int, _y: Int) {
    val x = _x
    val y = _y
}
// defined class Point

class Point(val x: Int, val y: Int)
// defined class Point

class Point(val x: Int, val y: Int) {
    def +(p: Point): Point = {
        new Point(x + p.x, y + p.y)
    }
    override def toString(): String = "(" + x + ", " + y + ")"
}
// defined class Point

// (private([this | <パッケージ名>])? | protected([<パッケージ名>])?)? def <メソッド名> '('
//     (<引数名> : <引数型> (, <引数名> : <引数型>)*)?
// ')': <返り値型> = <本体>

// (private([this | <パッケージ名>])? | protected([<パッケージ名>])?)? def <メソッド名> '('
//     (<引数名> : <引数型> (, <引数名> : <引数型>)*)?
// ')': <返り値型> = {
//     (<式> (; | <改行>)?)*
// }

val p1 = new Point(1, 1)
// p1: Point = (1, 1)

val p2 = new Point(2, 2)
// p2: Point = (2, 2)

p1 + p2
// res0: Point = (3, 3)

// (private([this | <パッケージ名>])? | protected([<パッケージ名>])?)? def <メソッド名> '('
//     (<引数名> : <引数型> (, <引数名> : <引数型>)*)?
// ')'( '('
//     (<引数名> : <引数型> (, <引数名> : <引数型>)*)?
// ')' )* : <返り値型> = <本体式>

class Adder {
    def add(x: Int)(y: Int): Int = x + y
}
// defined class Adder

val adder = new Adder()
// adder: Adder = Adder@54fc7e28

adder.add(2)(3)
// res1: Int = 5

val fun = adder.add(2) _
// fun: Int => Int = $Lambda$4526/0x0000000801a3c1f8@693ae2f8

fun(3)
// res2: Int = 5

class Adder {
    def add(x: Int, y: Int): Int = x + y
}
// defined class Adder

val adder = new Adder()
// adder: Adder = Adder@2ab976ad

adder.add(2, 3)
// res3: Int = 5

val fun: Int => Int = adder.add(2, _)
// fun: Int => Int = $Lambda$4529/0x0000000801a3f0f8@2a8cfc20

fun(3)
// res4: Int = 5

// (private([this | <パッケージ名>])? | protected([<パッケージ名>])?)? (val | var) <フィールド名>: <フィールド型> = <初期化式>

// (private([this | <パッケージ名>])? | protected([<パッケージ名>])?)? def <メソッド名> '('
//     (<引数名> : <引数型> (, <引数名> : <引数型>)*)?
// ')' : <返り値型>

// (private([this | <パッケージ名>])? | protected([<パッケージ名>])?)? (val | var) <フィールド名> : <フィールド型>

abstract class XY {
    def x: Int
    def y: Int
}
// defined class XY

// class <クラス名> <クラス引数> (extends <スーパークラス>)? (with <トレイト名>)* {
//     (<フィールド定義> | <メソッド定義>)*
// }

class APrinter() {
    def print(): Unit = {
        println("A")
    }
}
// defined class APointer

class BPrinter() extends APrinter {
    override def print(): Unit = {
        println("B")
    }
}
// defined class BPointer

new APointer().print
// A

new BPointer().print
// B

// 全てが Int 型の x 、 y 、 z という名前を持った、3次元座標を表す Point3D クラスを定義してください。 
// Point3D クラスは次のようにして使うことができなければいけません。
// val p = new Point3D(10, 20, 30)
// println(p.x) // 10
// println(p.y) // 20
// println(p.z) // 30
class Point3D(val x: Int, val y: Int, val z: Int)

val p = new Point3D(10, 20, 30)
println(p.x) // 10
println(p.y) // 20
println(p.z) // 30

// 次の抽象クラス Shape を継承して、 Rectangle クラス（長方形クラス）とCircle クラス（円クラス）を定義してください。
// また、area メソッドをオーバーライドして、ただしく面積が計算できるように定義してください。なお、長方形の面積は幅をw、高さをhとすると、
// w * hで求めることができます。円の面積は、半径をrとすると、r * r * math.Pi で求めることができます。
// abstract class Shape {
//   def area: Double
// }
// /*
//  * RectangleとCircleの定義
//  */
// var shape: Shape = new Rectangle(10.0, 20.0)
// println(shape.area)
// shape = new Circle(2.0)
// println(shape.area)

abstract class Shape {
  def area: Double
}

class Rectangle(val w: Double, val h: Double) extends Shape {
    def area: Double = w * h
}

class Circle(val r: Double) extends Shape {
    def area: Double = r * r * math.Pi
}

var shape: Shape = new Rectangle(10.0, 20.0)
println(shape.area)
shape = new Circle(2.0)
println(shape.area)

// object <オブジェクト名> extends <クラス名> (with <トレイト名>)* {
//     (<フィールド定義> | <メソッド定義>)*
// }

class Point(val x: Int, val y: Int)
// defined class Point

object Point {
    def apply(x: Int, y: Int): Point = new Point(x, y)
}
// defined object Point
// warning: previously defined class Point is not a companion to object Point.
// Companions must be defined together; you may wish to use :paste mode for this.

Point(3, 5)
// res1: Point = Point(3,5)

case class Point(x: Int, y: Int)
// defined class Point

Point(3, 5)
// res2: Point = Point(3,5)

Point(1, 2).equals(Point(1, 2))
// res3: Boolean = true

class Person(name: String, age: Int, private val weight: Int)

object Hoge {
    def printWeight(): Unit = {
        val taro = new Person("Taro", 20, 70)
        println(taro.weight)
    }
}
// error: value weight in class Person cannot be accessed in Person
//        println(taro.weight)
//                     ^

class Person(name: String, age: Int, private val weight: Int)

object Person {
    def printWeight(): Unit = {
        val taro = new Person("Taro", 20, 70)
        println(taro.weight)
    }
}
// defined class Person
// defined object Person

// クラスを定義して、そのクラスのコンパニオンオブジェクトを定義してみましょう。
// コンパニオンオブジェクトが同名のクラスに対する特権的なアクセス権を持っていることを、
// クラスのフィールドをprivateにして、そのフィールドへアクセスできることを通じて確認してみましょう。
// また、クラスのフィールドをprivate[this]にして、そのフィールドへアクセスできないことを確認してみましょう。

class Point(private val x: Int, private val y: Int)

object Point {
    def printPoint(): Unit = {
        val point = new Point(1, 2)
        println("(" + point.x + ", " + point.y + ")")
    }
}
// defined class Point
// defined object Point

Point.printPoint()
// (1, 2)

class Point(private val x: Int, private val y: Int)

object Hoge {
    def printPoint(): Unit = {
        val point = new Point(1, 2)
        println("(" + point.x + ", " + point.y + ")")
    }
}
// <pastie>:21: error: value x in class Point cannot be accessed in Point
//         println("(" + point.x + ", " + point.y + ")")
//                             ^
// <pastie>:21: error: value y in class Point cannot be accessed in Point
//         println("(" + point.x + ", " + point.y + ")")