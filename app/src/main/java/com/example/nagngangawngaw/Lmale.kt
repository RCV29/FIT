package com.example.nagngangawngaw
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.nagngangawngaw.databinding.ActivityLeanMaleBinding
import kotlinx.android.synthetic.main.toolbar.view.left_icon
import kotlinx.android.synthetic.main.toolbar.view.right_icon


class Lmale : AppCompatActivity() {

    private lateinit var binding: ActivityLeanMaleBinding
    private lateinit var parentRecyclerView: RecyclerView
    private lateinit var parentList : ArrayList<Parentitem>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lean_male)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_lean_male)

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
        childItem1.add(Childitem("Bench Presses", R.drawable.chestbp, getString(R.string.bench_press) , R.drawable.chestbps))
        childItem1.add(Childitem("Incline Presses", R.drawable.chestip, getString(R.string.incline_press) , R.drawable.chestips ))
        childItem1.add(Childitem("Incline Dumbbell Presses", R.drawable.chestdbp, getString(R.string.incline_db), R.drawable.chestdbps))
        childItem1.add(Childitem("Dumbbell Flys", R.drawable.chestdbf, getString(R.string.dumbbell_fly), R.drawable.chestdbfs))
        childItem1.add(Childitem("Dumbbell Pullovers", R.drawable.chestdbpo, getString(R.string.dumbbell_po), R.drawable.chestdbpos))
        childItem1.add(Childitem("Push Ups", R.drawable.chestpu,getString(R.string.push_ups), R.drawable.chestpus))
        childItem1.add(Childitem("Decline Pushup", R.drawable.chestdp, getString(R.string.decline_pu), R.drawable.chestdps))
        childItem1.add(Childitem("Incline Pushup", R.drawable.chestipu, getString(R.string.incline_pu), R.drawable.chestipus))
        childItem1.add(Childitem("Cable Crossover Flys", R.drawable.chestccf, getString(R.string.cable_cf), R.drawable.chestccfs))
        childItem1.add(Childitem("Pec Deck Flies", R.drawable.chestpdf, getString(R.string.pec_df), R.drawable.chestpdfs))
        parentList.add(Parentitem("Chest", R.drawable.chest ,childItem1))

        val childItem2 = ArrayList<Childitem>()
        childItem2.add(Childitem("Incline Bench Sit-Ups", R.drawable.absibsu, getString(R.string.abs_insu) , R.drawable.absibus))
        childItem2.add(Childitem("Crunches", R.drawable.absc, getString(R.string.abs_c) , R.drawable.abscs ))
        childItem2.add(Childitem("Leg Raises", R.drawable.abslr, getString(R.string.abs_lr), R.drawable.abslrs))
        childItem2.add(Childitem("Seated Jackknife", R.drawable.abssj, getString(R.string.abs_sj), R.drawable.abssjs))
        childItem2.add(Childitem("Side Bridge", R.drawable.abssb, getString(R.string.abs_sb), R.drawable.abssbs))
        parentList.add(Parentitem("Abs", R.drawable.abs ,childItem2))

        val childItem3 = ArrayList<Childitem>()
        childItem3.add(Childitem("DeadLifts", R.drawable.backd, getString(R.string.back_d), R.drawable.backds))
        childItem3.add(Childitem("Bent Over Row", R.drawable.backbor, getString(R.string.back_bor), R.drawable.backbors))
        childItem3.add(Childitem("Barbell Shrugs", R.drawable.backbs, getString(R.string.back_bs), R.drawable.backbss))
        childItem3.add(Childitem("Seated Rows", R.drawable.backsr, getString(R.string.back_sr), R.drawable.backsrs))
        childItem3.add(Childitem("One Arm Dumbbell Rows", R.drawable.backoadr, getString(R.string.back_oadr), R.drawable.backoadrs))
        childItem3.add(Childitem("Lat Pull-Downs", R.drawable.backlpd, getString(R.string.back_lpd), R.drawable.backlpds))
        childItem3.add(Childitem("T-Bar Bent Over Row", R.drawable.backtbor, getString(R.string.back_tbor), R.drawable.backtbors))
        parentList.add(Parentitem("Back", R.drawable.back ,childItem3))

        val childItem4 = ArrayList<Childitem>()
        childItem4.add(Childitem("Back Presses", R.drawable.shoulderbp, getString(R.string.shoulder_bp), R.drawable.shoulderbps))
        childItem4.add(Childitem("Seated Front Presses", R.drawable.shouldersfp, getString(R.string.shoulder_sfp), R.drawable.shouldersfps))
        childItem4.add(Childitem("Seated Dumbbell Presses", R.drawable.shouldersdp, getString(R.string.shoulder_sdp), R.drawable.shouldersdps))
        childItem4.add(Childitem("Dumbbell Rear Deltoid Raises", R.drawable.shoulderdrdr, getString(R.string.shoulder_drdr), R.drawable.shoulderdrdrs))
        childItem4.add(Childitem("Lateral Raises", R.drawable.shoulderlr, getString(R.string.shoulder_lr), R.drawable.shoulderlrs))
        childItem4.add(Childitem("Front Raises", R.drawable.shoulderfr, getString(R.string.shoulder_fr), R.drawable.shoulderfrs))
        childItem4.add(Childitem("Arnold Presses", R.drawable.shoulderap, getString(R.string.shoulder_ar), R.drawable.shoulderaps))
        childItem4.add(Childitem("Seated Dumbbell Front Raises", R.drawable.shouldersdfr, getString(R.string.shoulder_sdfr), R.drawable.shouldersdfrs))
        parentList.add(Parentitem("Shoulder", R.drawable.shoulder ,childItem4))

        val childItem5 = ArrayList<Childitem>()
        childItem5.add(Childitem("Push Downs", R.drawable.triceppd, getString(R.string.tricep_pd), R.drawable.triceppds))
        childItem5.add(Childitem("Triceps Extensions", R.drawable.tricepte, getString(R.string.tricep_e), R.drawable.triceptes))
        childItem5.add(Childitem("Triceps Dumbbell Extentions", R.drawable.tricepdte, getString(R.string.tricep_dte), R.drawable.tricepdtes))
        childItem5.add(Childitem("Triceps Pushdown", R.drawable.triceptp, getString(R.string.tricep_tpd), R.drawable.triceptps))
        childItem5.add(Childitem("Diamond Push Up", R.drawable.tricepdp, getString(R.string.tricep_dp), R.drawable.tricepdps))
        childItem5.add(Childitem("Diamond Push Up On Bench", R.drawable.tricepdpob, getString(R.string.tricep_dpob), R.drawable.tricepdpobs))
        childItem5.add(Childitem("Close Grip Bench Presses", R.drawable.tricepcgbp, getString(R.string.tricep_cgbp), R.drawable.tricepcgbps))
        parentList.add(Parentitem("Triceps", R.drawable.tribiceps ,childItem5))

        val childItem6 = ArrayList<Childitem>()
        childItem6.add(Childitem("Squats", R.drawable.legs, getString(R.string.leg_s), R.drawable.legss))
        childItem6.add(Childitem("Angled Leg Presses", R.drawable.legalp, getString(R.string.leg_alp), R.drawable.legalps))
        childItem6.add(Childitem("Dumbbell Lunges", R.drawable.legdl, getString(R.string.leg_dl), R.drawable.legdls))
        childItem6.add(Childitem("Leg Extensions", R.drawable.legle, getString(R.string.leg_le), R.drawable.legles))
        childItem6.add(Childitem("Dumbbell Squats", R.drawable.legds, getString(R.string.leg_ds), R.drawable.legdss))
        childItem6.add(Childitem("Power Squats", R.drawable.legps, getString(R.string.leg_ps), R.drawable.legpss))
        childItem6.add(Childitem("Barbell Lunges", R.drawable.legbl, getString(R.string.leg_bl), R.drawable.legbls))
        childItem6.add(Childitem("Seated Leg Curls", R.drawable.legslc, getString(R.string.leg_slc), R.drawable.legslcs))
        childItem6.add(Childitem("Hack Squats", R.drawable.leghs, getString(R.string.leg_hs), R.drawable.leghss))
        parentList.add(Parentitem("Thigh", R.drawable.thigh ,childItem6))

        val childItem7 = ArrayList<Childitem>()
        childItem7.add(Childitem("Top Raises", R.drawable.calfts, getString(R.string.calf_ts), R.drawable.calftss))
        childItem7.add(Childitem("Seated Calf Raises", R.drawable.calfscr, getString(R.string.calf_scr), R.drawable.calfscrs))
        childItem7.add(Childitem("Dumbbell Calf Jumps", R.drawable.calfdcj, getString(R.string.calf_dcj), R.drawable.calfdcj))
        childItem7.add(Childitem("Standing Barbell Calf Raises", R.drawable.calfsbcr, getString(R.string.calf_sbcr), R.drawable.calfsbcrs))
        childItem7.add(Childitem("Standing Dumbbell Calf Raises", R.drawable.nawawala, getString(R.string.calf_dbcr), R.drawable.calfsdcrs))
        parentList.add(Parentitem("Calf", R.drawable.calf ,childItem7))

        val childItem8 = ArrayList<Childitem>()
        childItem8.add(Childitem("Barbell Curls", R.drawable.bicepbc, getString(R.string.bicep_bc), R.drawable.bicepbcs))
        childItem8.add(Childitem("Preacher Curls", R.drawable.biceppc, getString(R.string.bicep_pc), R.drawable.biceppcs))
        childItem8.add(Childitem("Hammer Curls", R.drawable.bicephc, getString(R.string.bicep_hc), R.drawable.bicephcs))
        childItem8.add(Childitem("Concentration Curls", R.drawable.bicepcc, getString(R.string.bicep_cc), R.drawable.bicepccs))
        childItem8.add(Childitem("Underhand Grip Prone On An Incline Bench", R.drawable.bicepugpoaib, getString(R.string.bicep_u), R.drawable.bicepugpoaibs))
        parentList.add(Parentitem("Biceps", R.drawable.biceps ,childItem8))

        val childItem9 = ArrayList<Childitem>()
        childItem9.add(Childitem("Wrist Curls", R.drawable.forearmwc, getString(R.string.forearm_wc), R.drawable.forearmwcs))
        childItem9.add(Childitem("Dumbbell Wrist Twist", R.drawable.forearmdwt, getString(R.string.forearm_dwt), R.drawable.forearmdwts))
        childItem9.add(Childitem("Standing Wrist Curls", R.drawable.forearmswc, getString(R.string.forearm_swc), R.drawable.forearmswcs))
        parentList.add(Parentitem("Fore Arms", R.drawable.forearm ,childItem9))

        val childItem10 = ArrayList<Childitem>()
        childItem10.add(Childitem("Diet", R.drawable.dietl, getString(R.string.lean_diet), R.drawable.dietb))
        parentList.add(Parentitem("Diet", R.drawable.dietls ,childItem10))
    }

    private fun initUI() {
        binding.toolBox.left_icon.setOnClickListener {
            val intent = Intent(this, Malebody::class.java)
            startActivity(intent)
        }

        binding.toolBox.right_icon.setOnClickListener {
            val intent = Intent(this, Shoppe::class.java)
            startActivity(intent)
        }
    }
}