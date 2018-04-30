package co.aardvarkstudio.swoosh.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import co.aardvarkstudio.swoosh.Model.Player
import co.aardvarkstudio.swoosh.R
import co.aardvarkstudio.swoosh.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val player = intent.getParcelableExtra<Player>(EXTRA_PLAYER)

        searchLeaguesTxt.text = "Looking for ${player.league} ${player.skill} league near you..."

    }
}
