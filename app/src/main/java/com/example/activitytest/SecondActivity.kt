package com.example.activitytest

import android.app.Activity
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : BaseActivity() {

    companion object{
        @JvmStatic
        fun actionStart(context : Context , data1 : String , data2 : String){
            val intent = Intent(context,SecondActivity::class.java).apply {
                putExtra("param1",data1)
                putExtra("param2",data2)

            }
            context.startActivity(intent)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        Log.d("SecondActivity",this.toString())
        Log.d("SecondActivity","Task id is $taskId")
        setContentView(R.layout.activity_second)

//        val ex = intent.getStringExtra("ex")
//        Log.d("Second","extra data is $ex")

        button2.setOnClickListener {
//            val intent = Intent()
//            intent.putExtra("return","Hello FirstActivity")
//            setResult(Activity.RESULT_OK,intent)
//            finish()
//            val intent = Intent(this,FirstActivity::class.java)
            val intent = Intent(this,ThirdActivity::class.java)
            startActivity(intent)
        }



    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("SecondActivity","onDestroy")
    }

    override fun onBackPressed() {
        val intent = Intent()
        intent.putExtra("return","hhhhhh")
        setResult(Activity.RESULT_OK,intent)
        finish()
    }
}