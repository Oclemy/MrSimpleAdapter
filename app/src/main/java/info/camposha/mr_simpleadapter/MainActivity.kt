package info.camposha.mr_simpleadapter

import android.os.Bundle
import android.widget.SimpleAdapter
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val map1: MutableMap<String, String?> = HashMap()
        map1["Name"] = "Ryan"
        map1["Age"] = "20"
        val map2: MutableMap<String, String?> = HashMap()
        map2["Name"] = "Reagan"
        map2["Age"] = "18"
        val map3: MutableMap<String, String?> = HashMap()
        map3["Name"] = "Ronnie"
        map3["Age"] = "16"
        val list: MutableList<Map<String, String?>> = ArrayList()
        list.add(map1)
        list.add(map2)
        list.add(map3)
        val adapter = SimpleAdapter(
            this,
            list,
            R.layout.list_item,
            arrayOf("Name", "Age"),
            intArrayOf(R.id.list_item_name, R.id.list_item_age)
        )
        listview1.setAdapter(adapter)
    }
}