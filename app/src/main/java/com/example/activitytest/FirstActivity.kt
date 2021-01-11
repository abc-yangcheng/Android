package com.example.activitytest

import android.app.Activity
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.first_layout.*


class FirstActivity :BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        Log.d("FirstActivity",this.toString())
        Log.d("FirstActivity","Task id is $taskId")
        setContentView(R.layout.first_layout)

//        val button1 : Button = findViewById(R.id.button1)
//        button1.setOnClickListener {
//            Toast.makeText(this,"Button 1",Toast.LENGTH_LONG).show()
//        }
        button1.setOnClickListener {
//            Toast.makeText(this,"hhh",Toast.LENGTH_LONG).show()
//            finish()

//            val intent = Intent(this,SecondActivity::class.java)
//            val intent = Intent("com.example.activitytest.ACTION_START")
//            intent.addCategory("com.example.activitytest.MY_CATEGORY")
//            val intent = Intent(Intent.ACTION_VIEW)
//            intent.data = Uri.parse("https://www.baidu.com")

//            val intent = Intent(Intent.ACTION_DIAL)
//            intent.data = Uri.parse("tel:10086")
//
//            val data = "Hello SecondActivity"
//            val intent = Intent(this,SecondActivity::class.java)
//            intent.putExtra("ex",data)

//            startActivityForResult(intent,1)
//            startActivity(intent)

//            val intent = Intent(this,SecondActivity::class.java)
//            startActivity(intent)
            SecondActivity.actionStart(this,"d1","d2")
            Something()


        }

    }

    override fun onRestart() {
        super.onRestart()
        Log.d("FirstActivity","onRestart")
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        when(requestCode){
            1 -> if (resultCode == Activity.RESULT_OK){
                val re = data?.getStringExtra("return")
                Log.d("result","return is $re")
            }
        }
    }



    override fun onCreateOptionsMenu(menu: Menu?): Boolean{
        menuInflater.inflate(R.menu.main,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.add_item -> Toast.makeText(this,"add_item",Toast.LENGTH_LONG).show()
            R.id.remove_item -> Toast.makeText(this,"remove_item",Toast.LENGTH_LONG).show()

        }
        return true
    }
}