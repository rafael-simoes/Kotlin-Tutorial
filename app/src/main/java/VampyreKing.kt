import java.util.*


class VampyreKing(name: String) : Vampyre(name) {
    init {  //atribui um valor a uma variavel quando a mesma é iniciada
        hitPoints = 140
    }

    override fun takeDamage(damage: Int) {
        super.takeDamage(damage/2)
    }

    fun runAway() : Boolean
    {
        return lives<2
    }

    fun dodges() : Boolean
    {

        val rand = Random()
        var chance = rand.nextInt(6)

        if(chance > 3 )
        {
            println("Dracula dodged!")
            return true
        }
        return false
    }
}