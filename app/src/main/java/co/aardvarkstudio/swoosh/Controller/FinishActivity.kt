package co.aardvarkstudio.swoosh.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import co.aardvarkstudio.swoosh.R
import co.aardvarkstudio.swoosh.Utilities.EXTRA_LEAGUE
import co.aardvarkstudio.swoosh.Utilities.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val league = intent.getStringExtra(EXTRA_LEAGUE)
        val skill = intent.getStringExtra(EXTRA_SKILL)

        searchLeaguesTxt.text = "Looking for $league $skill league near you..."
    }
}
