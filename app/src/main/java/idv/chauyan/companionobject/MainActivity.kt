package idv.chauyan.companionobject

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import idv.chauyan.companionobject.Config.Companion.valueA

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("Here comes a constant value $valueA")
    }
}
