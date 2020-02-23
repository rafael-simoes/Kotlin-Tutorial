open class Enemy(val name:String, var hitPoints:Int, var lives: Int) {

    open fun takeDamage(damage:Int) {
        var remainingHitPoints = hitPoints - damage
        if (remainingHitPoints > 0) {
            hitPoints = remainingHitPoints
            println("$name took $damage points of damage, and has $hitPoints HP left")
        } else {
            lives -= 1
            if (lives > 0) {
                println("$name took $damage points of damage and lost a live, $lives left.")
            } else {
                println("$name took $damage points of damage and died.")
            }

        }
    }

    override fun toString(): String {
        return "Name: $name, HP: $hitPoints, Lives: $lives"
    }

}