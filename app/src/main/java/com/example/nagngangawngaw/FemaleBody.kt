package com.example.nagngangawngaw
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.nagngangawngaw.databinding.ActivityFemaleBinding
import kotlinx.android.synthetic.main.toolbar.view.left_icon
import kotlinx.android.synthetic.main.toolbar.view.right_icon


class FemaleBody : AppCompatActivity() {

    private lateinit var binding: ActivityFemaleBinding
    private lateinit var parentRecyclerView: RecyclerView
    private lateinit var parentList : ArrayList<Parentitem>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_female)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_female)

        parentRecyclerView = findViewById(R.id.parentRecycleView)
        parentRecyclerView.setHasFixedSize(true)
        parentRecyclerView.layoutManager = LinearLayoutManager(this)
        parentList = ArrayList()
        prepareData()
        val adapter = ParentRecycleViewAdapter(parentList)
        parentRecyclerView.adapter = adapter

        initUI()
    }

    private fun prepareData(){

        val childItem1 = ArrayList<Childitem>()
        childItem1.add(Childitem("Jogging", R.drawable.jogs, getString(R.string.jogging), R.drawable.jog))
        childItem1.add(Childitem("Jump Rope", R.drawable.jumps, getString(R.string.jumprope), R.drawable.jumps))
        parentList.add(Parentitem("Cardio", R.drawable.logo ,childItem1))

        val childItem2 = ArrayList<Childitem>()
        childItem2.add(Childitem("Prisoner Jump Squats", R.drawable.buttp, getString(R.string.butt_p), R.drawable.buttp))
        childItem2.add(Childitem("Sumo Squat Calf Raises", R.drawable.buttsumo, getString(R.string.butt_sumo), R.drawable.buttsumos))
        childItem2.add(Childitem("Curtsy Squats", R.drawable.buttcs, getString(R.string.butt_cs), R.drawable.buttcss))
        parentList.add(Parentitem("Butt", R.drawable.butt ,childItem2))

        val childItem3 = ArrayList<Childitem>()
        childItem3.add(Childitem("Bodyweight Superman", R.drawable.backbsm, getString(R.string.back_bsm), R.drawable.backbsms))
        childItem3.add(Childitem("T-Bar Bent Over Row", R.drawable.backtbor, getString(R.string.back_tbor), R.drawable.backtbors))
        childItem3.add(Childitem("Stability Ball Hyperextension", R.drawable.backsbh, getString(R.string.back_sbh), R.drawable.backsbhs))
        parentList.add(Parentitem("Back", R.drawable.backs ,childItem3))

        val childItem4 = ArrayList<Childitem>()
        childItem4.add(Childitem("Stability Ball Dumbbell Bicep Curl", R.drawable.bicepsbd, getString(R.string.bicep_sbd), R.drawable.bicepsbds))
        childItem4.add(Childitem("Curls", R.drawable.bicepc, getString(R.string.bicep_c), R.drawable.bicepcs))
        parentList.add(Parentitem("Biceps", R.drawable.fbicep ,childItem4))

        val childItem5 = ArrayList<Childitem>()
        childItem5.add(Childitem("Push Ups", R.drawable.chestpu,getString(R.string.push_ups), R.drawable.chestpus))
        childItem5.add(Childitem("Decline Pushup", R.drawable.chestdp, getString(R.string.decline_pu), R.drawable.chestdps))
        childItem5.add(Childitem("Sides Planks", R.drawable.planks, getString(R.string.abs_p), R.drawable.planks))
        childItem5.add(Childitem("Planks", R.drawable.plank, getString(R.string.abs_ps), R.drawable.plank))
        childItem5.add(Childitem("Incline Pushup", R.drawable.chestipu, getString(R.string.incline_pu), R.drawable.chestipus))
        parentList.add(Parentitem("Abs", R.drawable.chests ,childItem5))

        val childItem6 = ArrayList<Childitem>()
        childItem6.add(Childitem("Bench Jump", R.drawable.legbj, getString(R.string.leg_bj), R.drawable.legbjs))
        childItem6.add(Childitem("Single Leg Squat", R.drawable.legsls, getString(R.string.leg_sls), R.drawable.legslss))
        childItem6.add(Childitem("Iron Chair", R.drawable.legic, getString(R.string.leg_ic), R.drawable.legic))
        parentList.add(Parentitem("Legs", R.drawable.leg ,childItem6))

        val childItem7 = ArrayList<Childitem>()
        childItem7.add(Childitem("Diet", R.drawable.dietl, getString(R.string.lean_diet), R.drawable.dietb))
        parentList.add(Parentitem("Diet", R.drawable.dietbs ,childItem7))

    }

    private fun initUI() {
        binding.toolBox.left_icon.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        binding.toolBox.right_icon.setOnClickListener {
            val intent = Intent(this, Shoppe::class.java)
            startActivity(intent)
        }
    }
}