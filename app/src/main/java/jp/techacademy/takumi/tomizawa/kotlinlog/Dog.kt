package jp.techacademy.takumi.tomizawa.kotlinlog

import android.app.backup.BackupAgent
import android.util.Log

/*
open class Dog {
    // プロパティ
    var name: String
    var age: Int

    // 引数付きコンストラクタ
    constructor(name: String, age: Int){
        this.name = name
        this.age = age
    }

    // メソッド
    open fun say(){
        Log.d("kotlintest", this.name + "(" + this.age + "歳)" + "「ワンワン」")
    }
}
*/

/*
open class Dog: Animal{
    // 引数付きコンストラクタ
    constructor(name: String, age: Int): super(name, age){
    }

    // Animalクラスのメソッドをオーバーライド
    override fun say() {
        Log.d("kotlintest", this.name + "(" + this.age + "歳)" + "「ワンワン」")
    }
}
*/
open class Dog: Animal, Movable{
    // 引数付きコンストラクタ
    constructor(name: String, age: Int): super(name, age){
    }

    // Animalクラスのメソッドをオーバーライド
    override fun say() {
        Log.d("kotlintest", this.name + "(" + this.age + "歳)" + "「ワンワン」")
    }

    // Movableインターフェイスのメソッドをオーバーライド
    override fun move() {
        Log.d("kotlintest", this.name + "(" + this.age + "歳)" + "は全力で走った。")
    }
}
