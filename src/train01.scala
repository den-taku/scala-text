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

// trait <トレイト名> {
//     (<フィールド定義> | <メソッド定義>)*
// }

// class ClassC extends ClassA with TraitA with TraitB

trait TraitA
// defined trait TraitA

class ClassA extends TraitA
// defined class ClassA

object ObjectA {
    val a = new ClassA
}
// defined object ObjectA

trait TraitA {
    val name: String
    def printName(): Unit = println(name)
}

class ClassA(val name: String) extends TraitA

object ObjectA {
    val a = new ClassA("dwango")

    val a2 = new TraitA { val name = "kadokawa" }
}
// defined object ObjectA

trait TraitA {
    def greet(): Unit
}

trait TraitB extends TraitA {
    def greet(): Unit = println("Good morning!")
}

trait TraitC extends TraitA {
    def greet(): Unit = println("Good evening!")
}

// class ClassA extends TraitB with TraitC
// error: class ClassA inherits conflicting members

class ClassA extends TraitB with TraitC {
    override def greet(): Unit = println("How are you?")
}

class ClassB extends TraitB with TraitC {
    override def greet(): Unit = super[TraitB].greet()
}

(new ClassA).greet()
// How are you?

(new ClassB).greet()
// Good morning!

class ClassC extends TraitB with TraitC {
    override def greet(): Unit = {
        super[TraitB].greet()
        super[TraitC].greet()
    }
}

(new ClassC).greet()
// Good morning!
// Good evening!

trait TraitA {
    def greet(): Unit
}

trait TraitB extends TraitA {
    override def greet(): Unit = println("Good morning!")
}

trait TraitC extends TraitA {
    override def greet(): Unit = println("Good evening!")
}

class ClassA extends TraitB with TraitC
// defined class ClassA

(new ClassA).greet()
// Good evening!

class ClassA extends TraitC with TraitB
// defined class ClassA

(new ClassA).greet()
// Good morning!

trait TraitA {
    def greet(): Unit = println("Hello!")
}

trait TraitB extends TraitA {
    override def greet(): Unit = {
        super.greet()
        println("My name is Terebi-chan.")
    }
}

trait TraitC extends TraitA {
    override def greet(): Unit = {
        super.greet()
        println("I like niconico.")
    }
}

class ClassA extends TraitB with TraitC

class ClassB extends TraitC with TraitB

(new ClassA).greet()
// Hello!
// My name is Terebi-chan.
// I like niconico.

(new ClassB).greet()
// Hello!
// I like niconico.
// My name is Terebi-chan.

trait A {
    val foo: String
}

trait B extends A {
    val bar = foo + "World"
}

class C extends B {
    val foo = "Hello"

    def printBar(): Unit = println(bar)
}

(new C).printBar()
// nulWorld

trait A {
    val foo = "Hello, "
}

trait B extends A {
    val bar = foo + "World"
}

class C extends B {
    override val foo = "Hello"

    def printBar(): Unit = println(bar)
}

(new C).printBar()
// nulWorld

trait A {
    val foo: String
}

trait B extends A {
    lazy val bar = foo + ", World"
}

class C extends B {
    val foo = "Hello"

    def printBar(): Unit = println(bar)
}

(new C).printBar()
// Hello, World

trait A {
    val foo: String
}

trait B extends A {
    val bar = foo + ", World"
}

class C extends {
    val foo = "Hello"
} with B {
    def printBar(): Unit = println(bar)
}

(new C).printBar()

// class <クラス名>[<型パラメータ1>, <型パラメータ2>, ...](<クラス引数>) {
//     (<フィールド定義>|<メソッド定義>)*
// }

class Cell[A](var value: A) {
    def put(newValue: A): Unit = {
        value = newValue
    }

    def get(): A = value
}

val cell = new Cell[Int](1)
// cell: Cell[Int] = Cell@526a293c

cell.put(2)

cell.get()
// res1: Int = 2

class Pair[A, B](val a: A, val b: B) {
    override def toString(): String = "(" + a + ", " + b + ")"
}
// defined class Pair

def divide(m: Int, n: Int): Pair[Int, Int] = new Pair[Int, Int](m / n, m % n)

divide(7, 3)
// res4: Pair[Int,Int] = (2, 1)

// new Tuple2(3, 4)
(3, 4)
// res6: (Int, Int) = (3,4)

// when A extends B
// val: G[B] = G[A] ... ok!
// class G[+A]

class Pair[+A, +B](val a: A, val b: B) {
    override def toString(): String = "(" + a + ", " + b + ")"
}

val pair: Pair[AnyRef, AnyRef] = new Pair[String, String]("foo", "bar")

class Sup
class Sub extends Sup

class Mono[+A](val a: A)

val sup = new Sup
val sub = new Sub

var mono = new Mono(sup)
mono = new Mono(sub)

// 次のimmutableなStack型の定義（途中）があります。???の箇所を埋めて、Stackの定義を完成させなさい。
// なお、E >: Aは、EはAの継承元である、という制約を表しています。
//
// trait Stack[+A] {
//   def push[E >: A](e: E): Stack[E]
//   def top: A
//   def pop: Stack[A]
//   def isEmpty: Boolean
// }
//
// class NonEmptyStack[+A](private val first: A, private val rest: Stack[A]) extends Stack[A] {
//   def push[E >: A](e: E): Stack[E] = ???
//   def top: A = ???
//   def pop: Stack[A] = ???
//   def isEmpty: Boolean = ???
// }
//
// case object EmptyStack extends Stack[Nothing] {
//   def push[E >: Nothing](e: E): Stack[E] = new NonEmptyStack[E](e, this)
//   def top: Nothing = throw new IllegalArgumentException("empty stack")
//   def pop: Nothing = throw new IllegalArgumentException("empty stack")
//   def isEmpty: Boolean = true
// }
//
// object Stack {
//   def apply(): Stack[Nothing] = EmptyStack
// }
//
// また、Nothingは全ての型のサブクラスであるような型を表現します。
// Stack[A]は共変なので、Stack[Nothing]はどんな型のStack変数にでも格納することができます。
// 例えばStack[Nothing]型であるEmptyStackは、Stack[Int]型の変数とStack[String]型の変数の両方に代入することができます。
//
// val intStack: Stack[Int] = Stack()
// // intStack: Stack[Int] = EmptyStack
// val stringStack: Stack[String] = Stack()
// // stringStack: Stack[String] = EmptyStack

trait Stack[+A] {
  def push[E >: A](e: E): Stack[E]
  def top: A
  def pop: Stack[A]
  def isEmpty: Boolean
}

class NonEmptyStack[+A](private val first: A, private val rest: Stack[A]) extends Stack[A] {
  def push[E >: A](e: E): Stack[E] = new NonEmptyStack(e, this)
  def top: A = first
  def pop: Stack[A] = rest
  def isEmpty: Boolean = false
}

case object EmptyStack extends Stack[Nothing] {
  def push[E >: Nothing](e: E): Stack[E] = new NonEmptyStack[E](e, this)
  def top: Nothing = throw new IllegalArgumentException("empty stack")
  def pop: Nothing = throw new IllegalArgumentException("empty stack")
  def isEmpty: Boolean = true
}

object Stack {
  def apply(): Stack[Nothing] = EmptyStack
}

val intStack: Stack[Int] = Stack()
// intStack: Stack[Int] = EmptyStack
val stringStack: Stack[String] = Stack()
// stringStack: Stack[String] = EmptyStack

// when A extends B
// val: G[A] = G[B] ... ok!
// class G[-A]

val x1: AnyRef => AnyRef = (x: String) => (x: String)
// 11: error: type mismatch;

val x1: String => AnyRef = (x: AnyRef) => x

abstract class Show {
    def show: String
}

class ShowablePair[A <: Show, B <: Show](val a: A, val b: B) extends Show {
    override def show: String = "(" + a.show + ", " + b.show + ")"
}

abstract class Stack[+A] {
    def push[E >: A](element: E): Stack[E]
    def top: A
    def pop: Stack[A]
    def isEmpty: Boolean
}

val add = new Function2[Int, Int, Int] {
    def apply(x: Int, y: Int): Int = x + y
}

add.apply(100, 200)
// res0: Int = 300

add(100,200)
// res1: Int = 300

val add = (x: Int, y: Int) => x + y
// add: (Int, Int) => Int = $Lambda$4569/0x0000000801a590a8@7aa351d8

(x: Int, y: Int) => x + y
// res9: (Int, Int) => Int = $Lambda$4587/0x0000000801a5b4f8@7e07bd69

val add = (x: Int, y: Int) => x + y
// add: (Int, Int) => Int = $Lambda$4605/0x0000000801a5e370@153aeff7

val addCurried = (x: Int) => ((y:Int) => x + y)
// addCurried: Int => (Int => Int) = $Lambda$4606/0x0000000801a5f180@43f08d8c

add(100, 200)
// res12: Int = 300

addCurried(100)(200)
// res13: Int = 300

def add(x: Int, y: Int): Int = x + y

add _
// res14: (Int, Int) => Int = $Lambda$4612/0x0000000801a71ac8@253430c3

def addMultiParameterList(x: Int)(y: Int): Int = x + y

addMultiParameterList _
// res15: Int => (Int => Int) = $Lambda$4613/0x0000000801a73108@5e34396d

def double(n: Int, f: Int => Int): Int = {
    f(f(n))
}
// double: (n: Int, f: Int => Int)Int

double(1, m => m * 2)
// res18: Int = 4

double(3, m => m * 4)
// res19: Int = 48

def around(init: () => Unit, body: () => Any, fin: () => Unit): Any = {
    init()
    try {
        body()
    } finally {
        fin()
    }
}
// around: (init: () => Unit, body: () => Any, fin: () => Unit)Any

around(
    () => println("ファイルを開く"),
    () => println("ファイルに対する処理"),
    () => println("ファイルを閉じる")
)
// ファイルを開く
// ファイルに対する処理
// ファイルを閉じる
// res21: Any = ()

around(
    () => println("ファイルを開く"),
    () => throw new Exception("例外発生！"),
    () => println("ファイルを閉じる")
)
// ファイルを開く
// ファイルを閉じる
// java.lang.Exception: 例外発生！
//   at .$anonfun$res23$2(<console>:15)
//   at .around(<console>:14)
//   ... 35 elided

import scala.io.Source
def withFile[A](filename: String)(f: Source => A): A = {
    val s = Source.fromFile(filename)
    try {
        f(s)
    } finally {
        s.close()
    }
}
// withFile: [A](filename: String)(f: scala.io.Source => A)A

// withFileメソッドを使って、次のようなシグネチャを持つテキストファイルの中身を一行ずつ表示する関数printFileを実装してみましょう。
// def printFile(filename: String): Unit = ???

def printFile(filename: String): Unit = {
    withFile(filename){
        file => file.getLines.foreach(println)
    }
}
// printFile: (filename: String)Unit

val arr = Array(1, 2, 3, 4, 5)
// arr: Array[Int] = Array(1, 2, 3, 4, 5)

val arr = Array[Int](1, 2, 3, 4, 5)
// arr: Array[Int] = Array(1, 2, 3, 4, 5)

arr(0)
// res0: Int = 1

arr
// res2: Array[Int] = Array(1, 2, 3, 4, 5)

arr(0)=7

arr(0)
// res4: Int = 7

arr.length
// res5: Int = 5

// 配列のi番目の要素とj番目の要素を入れ替えるswapArrayメソッドを定義してみましょう。
// swapArrayメソッドの宣言は
//
// def swapArray[T] (arr: Array[T])(i: Int, j: Int): Unit = ???
//
// となります。iとjが配列の範囲外である場合は特に考慮しなくて良いです。

def swapArray[T] (arr: Array[T])(i: Int, j: Int): Unit = {
    val tmp = arr(i)
    arr(i) = arr(j)
    arr(j) = tmp
}

arr
// res6: Array[Int] = Array(7, 2, 3, 4, 5)

swapArray(arr)(1, 4)

arr
// res8: Array[Int] = Array(7, 5, 3, 4, 2)

1 to 5
// res9: scala.collection.immutable.Range.Inclusive = Range 1 to 5

(1 to 5).toList
// res10: List[Int] = List(1, 2, 3, 4, 5)

1 until 5
// res11: scala.collection.immutable.Range = Range 1 until 5

(1 until 5).toList
// res13: List[Int] = List(1, 2, 3, 4)

val lst = List(1, 2, 3, 4, 5)
// lst: List[Int] = List(1, 2, 3, 4, 5)

Nil
// res15: scala.collection.immutable.Nil.type = List()

val a1 = 1 :: Nil
// a1: List[Int] = List(1)

val a2 = 2 :: a1
// a2: List[Int] = List(2, 1)

List(1, 2) ++ List(3, 4)
// res16: List[Int] = List(1, 2, 3, 4)

List(1, 2).++(List(5, 6)).++(List(3, 4))
// res18: List[Int] = List(1, 2, 5, 6, 3, 4)

List(1, 2, 3, 4, 5).mkString
// res19: String = 12345

List(1, 2, 3, 4, 5).mkString(",")
// res21: String = 1,2,3,4,5

List(1, 2, 3, 4, 5).mkString("[", ",", "]")
// res22: String = [1,2,3,4,5]

// mkStringを使って、最初の数startと最後の数endを受け取って、
// 
// start,(start+1),(start+2)...,end
// 
// となるような文字列を返すメソッドjoinByCommaを定義してみましょう（ヒント：Range にもmkStringメソッドはあります）。

def joinByComma(start: Int, end: Int): String = {
    (start to end).mkString(",")
}

joinByComma(1, 20)
// res25: String = 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20

// def foldLeft[B](z: B)(f: (B, A) => B): B
List(1, 2, 3).foldLeft(0)((x, y) => x + y)
// res26: Int = 6

def sum(lst: List[Int]): Int = {
    lst.foldLeft(0)((x, y) => x + y)
}
// sum: (lst: List[Int])Int

sum(List(2, 3, 4, 5, 9))
// res27: Int = 23

List(List(1), List(2, 3), List(4)).foldLeft(Nil: List[Int])(_ ++ _)
// res28: List[Int] = List(1, 2, 3, 4)

// foldLeftを用いて、Listの要素を反転させる次のシグニチャを持ったメソッドreverseを実装してみましょう：
// 
// def reverse[T](list: List[T]): List[T] = ???

def reverse[T](list: List[T]): List[T] = {
    list.foldLeft(Nil: List[T])((a, b) => b :: a)
}
// reverse: [T](list: List[T])List[T]

List(1, 2, 3, 4, 5).reverse
// res29: List[Int] = List(5, 4, 3, 2, 1)

// def foldRight[B](z: B)(op: (A, B) => B): B
List(1, 2, 3).foldRight(0)((y, x) => y + x)
// res30: Int = 6

List(1, 2, 3, 4, 5).map(x => x * 2)
// res31: List[Int] = List(2, 4, 6, 8, 10)

List(1, 2, 3, 4, 5).filter(x => x % 2 == 1) 
// res32: List[Int] = List(1, 3, 5)

List(1, 2, 3, 4).find(x => x % 2 == 1)
// res33: Option[Int] = Some(1)

List(1, 2, 3, 4, 5, 6).takeWhile(x => x != 5)
// res34: List[Int] = List(1, 2, 3, 4)

List(1, 2, 3, 4, 5).count(x => x % 2 == 0)
// res37: Int = 2

List(List(1, 2, 3), List(4, 5)).flatMap{e => e.map{g => g + 1}}
// res38: List[Int] = List(2, 3, 4, 5, 6)

List(1, 2, 3).flatMap{e => List(4, 5).map(g => e * g)}
// res39: List[Int] = List(4, 5, 8, 10, 12, 15)

// fast
5 :: List(1, 2, 3, 4)
// res41: List[Int] = List(5, 1, 2, 3, 4)

// slow
List(1, 2, 3, 4) :+ 5
// res40: List[Int] = List(1, 2, 3, 4, 5)

Vector(1, 2, 3, 4, 5)
// res42: scala.collection.immutable.Vector[Int] = Vector(1, 2, 3, 4, 5)

6 +: Vector(1, 2, 3, 4, 5, 6) 
// res43: scala.collection.immutable.Vector[Int] = Vector(6, 1, 2, 3, 4, 5, 6)

Vector(1, 2, 3, 4, 5) :+ 6
// res44: scala.collection.immutable.Vector[Int] = Vector(1, 2, 3, 4, 5, 6)

Vector(1, 2, 3, 4, 5).updated(2, 5)
// res45: scala.collection.immutable.Vector[Int] = Vector(1, 2, 5, 4, 5)

val m = Map("A" -> 1, "B" -> 2, "C" -> 3)
// m: scala.collection.immutable.Map[String,Int] = Map(A -> 1, B -> 2, C -> 3)

m.updated("B", 4)
// res46: scala.collection.immutable.Map[String,Int] = Map(A -> 1, B -> 4, C -> 3)

m
// res47: scala.collection.immutable.Map[String,Int] = Map(A -> 1, B -> 2, C -> 3)

import scala.collection.mutable
// import scala.collection.mutable

val m = mutable.Map("A" -> 1, "B" -> 2, "C" -> 3)
// m: scala.collection.mutable.Map[String,Int] = Map(A -> 1, C -> 3, B -> 2)

m("B") = 5

m
// res49: scala.collection.mutable.Map[String,Int] = Map(A -> 1, C -> 3, B -> 5)

Set(1, 1, 2, 3, 4)
// res50: scala.collection.immutable.Set[Int] = Set(1, 2, 3, 4)

val s = Set(1, 2, 3, 4, 5)
// s: scala.collection.immutable.Set[Int] = Set(5, 1, 2, 3, 4)

s - 5
// res51: scala.collection.immutable.Set[Int] = Set(1, 2, 3, 4)

s
// res52: scala.collection.immutable.Set[Int] = Set(5, 1, 2, 3, 4)

import scala.collection.mutable
// import scala.collection.mutable

val s = mutable.Set(1, 2, 3, 4, 5)
// s: scala.collection.mutable.Set[Int] = Set(1, 5, 2, 3, 4)

s -= 5
// res54: s.type = Set(1, 2, 3, 4)

s
// res55: scala.collection.mutable.Set[Int] = Set(1, 2, 3, 4)

sealed abstract class DayOfWeek
case object Sunday extends DayOfWeek
case object Monday extends DayOfWeek
case object Tuesday extends DayOfWeek
case object Wednesday extends DayOfWeek
case object Thursday extends DayOfWeek
case object Friday extends DayOfWeek
case object Saturday extends DayOfWeek
// defined class DayOfWeek
// defined object Sunday
// defined object Monday
// defined object Tuesday
// defined object Wednesday
// defined object Thursday
// defined object Firday
// defined object Saturday

val x: DayOfWeek = Sunday
// x: DayOfWeek = Sunday

x match {
    case Sunday => 1
    case Monday => 2
    case Tuesday => 3
    case Wednesday => 4
    case Thursday => 5
    case Friday => 6 
}

sealed abstract class Exp
case class Add(lhs: Exp, rhs: Exp) extends Exp
case class Sub(lhs: Exp, rhs: Exp) extends Exp
case class Mul(lhs: Exp, rhs: Exp) extends Exp
case class Div(lhs: Exp, rhs: Exp) extends Exp
case class Lit(value: Int) extends Exp

val example = Add(Lit(1), Div(Mul(Lit(2), Lit(3)), Lit(2)))
// example: Add = Add(Lit(1),Div(Mul(Lit(2),Lit(3)),Lit(2)))

def eval(exp: Exp): Int = exp match {
    case Add(l, r) => eval(l) + eval(r)
    case Sub(l, r) => eval(l) - eval(r)
    case Mul(l, r) => eval(l) * eval(r)
    case Div(l, r) => eval(l) / eval(r)
    case Lit(v) => v
}
// eval: (exp: Exp)Int

eval(example)
// res1: Int = 4

case class Point(x: Int, y: Int)
// defined class Point

val Point(x, y) = Point(10, 20)
// x: Int = 10
// y: Int = 20

val p = Point(1, 2)
// p: Point = Point(1,2)

println(p.x, p.y)
// (1,2)

Point(1, 2) == Point(1, 2)
// res3: Boolean = true

Point(1, 2) == Point(3,4)
// res4: Boolean = false

class Point(val x: Int, val y: Int) {
    override def equals(that: Any): Boolean = that match {
        case thatPoint: Point => 
            thatPoint.canEqual(this) && this.x == thatPoint.x && this.y == thatPoint.y
        case _ =>
            false
    }

    override def hashCode(): Int = x.hashCode ^ y.hashCode

    def canEqual(that: Any): Boolean = that.isInstanceOf[Point]

    override def toString(): String = "Point(" + x + ", " + y + ")"
}
// defined class Point

object Point {
    def apply(x: Int, y: Int): Point = new Point(x, y)
}
// defined object Point

// DayOfWeek型を使って、ある日の次の曜日を返すメソッドnextDayOfWeek
// 
// def nextDayOfWeek(d: DayOfWeek): DayOfWeek = ???
// 
// をパターンマッチを用いて定義してみましょう。
def nextDayOfWeek(d: DayOfWeek): DayOfWeek = d match {
    case Sunday => Monday
    case Monday => Tuesday
    case Tuesday => Wednesday
    case Wednesday => Thursday
    case Thursday => Friday
    case Friday => Saturday
    case Saturday => Sunday
}
// nextDayOfWeek: (d: DayOfWeek)DayOfWeek

List(1, 2, 3, 4, 5).collect { case i if i % 2 == 1 => i * 2 }
// res5: List[Int] = List(2, 6, 10)

val even: Int => Boolean = {
    case i if i % 2 == 0 => true
    case _ => false
}
// even: Int => Boolean = $Lambda$4964/0x0000000801adeea0@3091dd92

val even: Int => Boolean = (x => x match {
    case i if i % 2 == 0 => true
    case _ => false
})
// even: Int => Boolean = $Lambda$4967/0x0000000801adfad0@17516840

val o: Option[String] = Option("hoge")
// o: Option[String] = Some(hoge)

o.get
// res0: String = hoge

o.isEmpty
// res1: Boolean = false

o.isDefined
// res2: Boolean = true

val o: Option[String] = Option(null)
// o: Option[String] = None

o.isEmpty
// res4: Boolean = true

o.isDefined
// res6: Boolean = false

o.getOrElse("")
// res7: String = ""

o.getOrElse(throw new RuntimeException("nullは受け入れられません"))
// java.lang.RuntimeException: nullは受け入れられません
//   at .$anonfun$res8$1(<console>:13)
//   at scala.Option.getOrElse(Option.scala:189)
//   ... 31 elided

val s: Option[String] = Some("hoge")
// s: Option[String] = Some(hoge)

val result = s match {
    case Some(str) => str
    case None => "not matched"
}
// result: String = hoge

Some(3).map(_ * 3)
// res9: Option[Int] = Some(9)

val n: Option[Int] = None
// n: Option[Int] = None

n.map(_ * 3)
// res10: Option[Int] = None

n.fold(throw new RuntimeException)(_ * 3)
// java.lang.RuntimeException
//   at .$anonfun$res11$1(<console>:13)
//   at scala.Option.fold(Option.scala:251)
//   ... 31 elided

Some(3).fold(throw new RuntimeException)(_ * 3)
// res12: Int = 9

val v1: Option[Int] = Some(3)
// v1: Option[Int] = Some(3)

val v2: Option[Int] = Some(5)
// v2: Option[Int] = Some(5)

v1.map(i1 => v2.map(i2 => i1 * i2))
// res13: Option[Option[Int]] = Some(Some(15))

v1.map(i1 => v2.map(i2 => i1 * i2)).flatten
// res14: Option[Int] = Some(15)

// mapとflattenを利用して、 Some(2)とSome(3)とSome(5)とSome(7)とSome(11)の値をかけて、Some(2310)を求めてみましょう。
val v1 = Some(2)
val v2 = Some(3)
val v3 = Some(5)
val v4 = Some(7)
val v5 = Some(11)

v1.map(i1 => v2.map(i2 => v3.map(i3 => v4.map(i4 => v5.map(i5 => i1 * i2 * i3 * i4 * i5))))).flatten.flatten.flatten.flatten
// res16: Option[Int] = Some(2310)

val v1 = Some(3)
val v2 = Some(5)

v1.flatMap(i1 => v2.map(i2 => i1 * i2))
// res18: Option[Int] = Some(6)

val v1: Option[Int] = Some(3)
// v1: Option[Int] = Some(value = 3)

val v2: Option[Int] = Some(5)
// v2: Option[Int] = Some(value = 5)

val v3: Option[Int] = Some(7)
// v3: Option[Int] = Some(value = 7)

v1.flatMap(i1 => v2.flatMap(i2 => v3.map(i3 => i1 * i2 * i3)))
// res14: Option[Int] = Some(value = 105)

val v3: Option[Int] = None
// v3: Option[Int] = None

v1.flatMap(i1 => v2.flatMap(i2 => v3.map(i3 => i1 * i2 * i3)))
// res20: Option[Int] = None

// flatMapとmapを利用して、 Some(2)とSome(3)とSome(5)とSome(7)とSome(11)の値をかけて、Some(2310)を求めてみましょう。
val v1 = Some(2)
val v2 = Some(3)
val v3 = Some(5)
val v4 = Some(7)
val v5 = Some(11)

v1.flatMap(i1 => v2.flatMap(i2 => v3.flatMap(i3 => v4.flatMap(i4 => v5.map(i5 => i1 * i2 * i3 * i4 * i5)))))
// v1: Some[Int] = Some(2)
// v2: Some[Int] = Some(3)
// v3: Some[Int] = Some(5)
// v4: Some[Int] = Some(7)
// v5: Some[Int] = Some(11)
// res21: Option[Int] = Some(2310)

val v1: Option[Int] = Some(3)
val v2: Option[Int] = Some(5)
val v3: Option[Int] = Some(7)

for { 
    i1 <- v1 
    i2 <- v2
    i3 <- v3
} yield i1 * i2 * i3
// res22: Option[Int] = Some(105)

// forを利用して、 Some(2)とSome(3)とSome(5)とSome(7)とSome(11)の値をかけて、Some(2310)を求めてみましょう。
val v1 = Some(2)
val v2 = Some(3)
val v3 = Some(5)
val v4 = Some(7)
val v5 = Some(11)
for {
    i1 <- v1
    i2 <- v2
    i3 <- v3
    i4 <- v4
    i5 <- v5
} yield i1 * i2 * i3 * i4 * i5
// res23: Option[Int] = Some(2310)

sealed trait LoginError

case object InvalidPassword extends LoginError
case object UserNotFound extends LoginError
case object PassWordLocked extends LoginError

case class User(id: Long, name: String, password: String)

object LoginService {
    def login(name: String, password: String): Either[LoginError, User] = Left(InvalidPassword)
}

LoginService.login(name = "dwango", password = "password") match {
    case Right(user) => println(s"id: ${user.id}")
    case Left(InvalidPassword) => println(s"Invalid Password!")
}

val v: Either[String, Int] = Right(123)

v.map(_ * 2)
// res25: scala.util.Either[String,Int] = Right(246)

val v2: Either[String, Int] = Left("a")

v2.map(_ * 2)
// res26: scala.util.Either[String,Int] = Left(a)

def f(x: Any): Unit = println("f")
// f: (x: Any)Unit

def g(): Unit = println("g")
// g: ()Unit

f(g())
// g
// f

def g(): Unit = println("g")
def f(g: => Unit): Unit = {
    println("prologue f")
    g
    println("epilogue f")
}
f(g())

import scala.util.Try

val v:Try[Int] = Try(throw new RuntimeException("to be caught"))
// v: scala.util.Try[Int] = Failure(java.lang.RuntimeException: to be caught)

val v1 = Try(3)
val v2 = Try(5)
val v3 = Try(7)
for {
    i1 <- v1
    i2 <- v2
    i3 <- v3
} yield i1 * i2 * i3
// res34: scala.util.Try[Int] = Success(105)

import scala.util.control.NonFatal

try {
    //
} catch {
    case NonFatal(e) => ()
}

object MainBefore {
    case class Address(id: Int, name: String, postalCode: Option[String])
    case class User(id: Int, name: String, addressId: Option[Int])

    val userDatabase: Map[Int, User] = Map (
        1 -> User(1, "太郎", Some(1)),
        2 -> User(2, "二郎", Some(2)),
        3 -> User(3, "ぷー太郎", None),
    )

    val addressDatabase: Map[Int, Address] = Map (
        1 -> Address(1, "渋谷", Some("150-0002")),
        2 -> Address(2, "国際宇宙ステーション", None)
    )

    sealed abstract class PostalCodeResult
    case class Success(postalCode: String) extends PostalCodeResult
    abstract class Failure extends PostalCodeResult
    case object UserNotFound extends Failure
    case object UserNotHasAddress extends Failure
    case object AddressNotFound extends Failure
    case object AddressNotHasPostalCode extends Failure

    def getPostalCodeResult(userId: Int): PostalCodeResult = {
        (for {
            user <- findUser(userId)
            address <- findAddress(user)
            postalCode <- findPostalCode(address)
        } yield Success(postalCode)).merge
    }

    def findUser(userId: Int): Either[Failure, User] = {
        userDatabase.get(userId).toRight(UserNotFound)
    }

    def findAddress(user: User): Either[Failure, Address] = {
        for {
            addressId <- user.addressId.toRight(UserNotHasAddress)
            address <- addressDatabase.get(addressId).toRight(AddressNotFound)
        } yield address
    }

    def findPostalCode(address: Address): Either[Failure, String] = {
        address.postalCode.toRight(AddressNotHasPostalCode)
    }

    def main(args: Array[String]): Unit = {
        println(getPostalCodeResult(1))
        println(getPostalCodeResult(2))
        println(getPostalCodeResult(3))
        println(getPostalCodeResult(4))
    }
}