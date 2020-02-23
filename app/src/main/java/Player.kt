class Player(var name: String, var level: Int = 1, var lives: Int = 3, var score: Int = 0) {

    var weapon: Weapon = Weapon("Fist", 1)
    private val inventory = ArrayList<Loot>()

    fun show() {
        println("")
    }

    override fun toString(): String {
        return """
                name: $name
                level: $level
                lives: $lives
                score: $score
                $weapon
                """
    }

    fun getLoot(item: Loot) {
        inventory.add(item)
    }

    fun dropLoot(item: Loot): Boolean {
        return if (inventory.contains(item)) {
            inventory.remove(item)
            true
        } else {
            false
        }
    }

    fun dropLoot(name: String): Boolean {
        for (loots in inventory)
            if (loots.name == name) {
                inventory.remove(loots)
                println("\n $name dropped \n")
                return true
            }
        println("$name not found")
        return false
    }

    fun showInventory() {
        var total = 0.0
        println("========================================")

        println("$name's Inventory")

        for (item in inventory) {

            println(item)
            total += item.value
        }
        println("========================================")
        println("Inventory total value is $total")
        println("========================================")
    }
}