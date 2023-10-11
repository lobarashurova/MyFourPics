package uz.mlsoft.myfourpics.presentation.main

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.airbnb.lottie.LottieAnimationView
import uz.mlsoft.myfourpics.R
import uz.mlsoft.myfourpics.presentation.game.GameActivity
import uz.mlsoft.myfourpics.presentation.info.InfoActivity

class MainActivity : AppCompatActivity(), MainContract.View {
    private lateinit var image1: ImageView
    private lateinit var image2: ImageView
    private lateinit var image3: ImageView
    private lateinit var image4: ImageView
    private lateinit var playButton: ImageView

    private lateinit var playInfo: LottieAnimationView
    private lateinit var tvLevel: TextView

    private var presenter: MainContract.Presenter = MainPresenter(this)
    private var currentPosition = presenter.getCurrentPosition()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        window.navigationBarColor = resources.getColor(R.color.statusBaeColor)

        loadViews()
        presenter.loadQuestion()

        findViewById<LottieAnimationView>(R.id.play_btn).setOnClickListener {
            startActivity(Intent(this@MainActivity, GameActivity::class.java))
        }

        playInfo.setOnClickListener {
            startActivity(Intent(this@MainActivity, InfoActivity::class.java))
        }
    }

    private fun loadViews() {
        image1 = findViewById(R.id.iv_pic_1)
        image2 = findViewById(R.id.iv_pic_2)
        image3 = findViewById(R.id.iv_pic_3)
        image4 = findViewById(R.id.iv_pic_4)
        tvLevel = findViewById(R.id.tv_level)
        playButton = findViewById(R.id.play_btn)
        playInfo = findViewById(R.id.info_lottie)
    }

    @SuppressLint("SetTextI18n")
    override fun describeQuestion() {
        image1.setImageResource(presenter.getCurrentAnswer(currentPosition).image1)
        image2.setImageResource(presenter.getCurrentAnswer(currentPosition).image2)
        image3.setImageResource(presenter.getCurrentAnswer(currentPosition).image3)
        image4.setImageResource(presenter.getCurrentAnswer(currentPosition).image4)

        tvLevel.text = (currentPosition + 1).toString()
    }

    @SuppressLint("SetTextI18n")
    override fun onStart() {
        currentPosition = presenter.getCurrentPosition()

        tvLevel.text = (currentPosition + 1).toString()
        image1.setImageResource(presenter.getCurrentAnswer(currentPosition).image1)
        image2.setImageResource(presenter.getCurrentAnswer(currentPosition).image2)
        image3.setImageResource(presenter.getCurrentAnswer(currentPosition).image3)
        image4.setImageResource(presenter.getCurrentAnswer(currentPosition).image4)
        super.onStart()
    }
}