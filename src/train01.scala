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
