package harsh.my.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener { rollDice() }
        rollDice() // this will show a random dice image in the beginning so that its not empty before the roll i.e
        // it rolls the dice when we open the app
    }

    private fun rollDice() {
        //create a dice object 6 sided
        val dice = Dice(6)
        val diceRoll = dice.roll()

        val dice2 = Dice(6)
        val dice2Roll = dice2.roll()

        //find the imageview in layout
        val diceImage: ImageView = findViewById(R.id.imageView)
        val dice2Image: ImageView = findViewById(R.id.imageView2)

//determine which drawable resource to use based on roll that is which image
        val DrawableNum = when (diceRoll) {

            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        //update the diceimage that will be shown based on the roll
        diceImage.setImageResource(DrawableNum)
        //update the content discriptionS
        diceImage.contentDescription = diceRoll.toString()

        val DrawableNum2 = when (dice2Roll) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        //update the diceimage that will be shown based on the roll
        dice2Image.setImageResource(DrawableNum2)
        //update the content discriptionS
        dice2Image.contentDescription = diceRoll.toString()

    }

}

class Dice(val numSides: Int) {
    fun roll(): Int {
        return (1..numSides).random()
    }
}
