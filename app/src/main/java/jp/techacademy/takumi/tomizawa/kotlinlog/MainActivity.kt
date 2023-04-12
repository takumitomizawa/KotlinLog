package jp.techacademy.takumi.tomizawa.kotlinlog

import android.media.MediaCodec.OnFirstTunnelFrameReadyListener
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*
        val dog = Dog("ポチ", 3) // 名前をポチ、年齢は3歳で、Dogのインスタンスを作る

        dog.move()
        */

        val human = Human("富澤", 22,"麻雀") // 名前を富澤、年齢は22歳で、Humanのインスタンスを作る
        human.say()
        human.think()
        val human2 = Human("山田太郎",10, "サッカー")
        human2.say()
        human2.think()
    }
}