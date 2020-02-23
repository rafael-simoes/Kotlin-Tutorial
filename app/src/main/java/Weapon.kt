class Weapon(var name: String, val damageInflicted: Int) {
    override fun toString(): String {
        return "$name does $damageInflicted damage"
    }
}