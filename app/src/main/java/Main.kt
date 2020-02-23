fun main(args: Array<String>) {

//    val troll = Troll("Nogueira")
//    println(troll)
//    troll.takeDamage(30)
//    println(troll)
//
//    val vlad = Vampyre("Vladimir")
//    println(vlad)
//    vlad.takeDamage(8)
//    println(vlad)
//
//    val dracula = VampyreKing("Dracula")
//    println(dracula)
//
//    while(dracula.lives > 0) {
//        if (dracula.dodges()) {
//            continue
//        }
//
//        if (dracula.runAway()) {
//            println("Dracula Ran Away!")
//            break
//        } else {
//            dracula.takeDamage(8)
//        }
//    }

    var raph = Player("Raph")
    raph.getLoot(Loot("Ultima Blade", LootType.ARMOR, 999.00))
    raph.getLoot(Loot("Knight Helm", LootType.ARMOR, 80.00))
    raph.getLoot(Loot("Ring of Speed", LootType.RING, 50.00))
    raph.getLoot(Loot("Ring of Speed", LootType.RING, 50.00))
    raph.getLoot(Loot("Ring of Speed", LootType.RING, 50.00))
    raph.getLoot(Loot("Health Potion", LootType.POTION, 3.00))
    raph.getLoot(Loot("Health Potion", LootType.POTION, 3.00))
    raph.getLoot(Loot("Stone Shield", LootType.ARMOR, 60.00))
    raph.getLoot(Loot("Chest Mail", LootType.ARMOR, 50.00))
    raph.showInventory()

    raph.dropLoot("Ring of Speed")
    raph.dropLoot("Health Potion")
    raph.showInventory()



//var tim = Player("Tim", 4,8)
//    var louise = Player("Louise", 2,5,1000)
//    tim.show()
//    louise.show()
//
//    tim.weapon = Weapon("Sword",10)
//    tim.show()
//    louise.weapon = tim.weapon
//    tim.weapon = Weapon("Spear", 14)
//    tim.show()
//    louise.show()
//
//    var redPotion = Loot("Red Potion", LootType.POTION, 7.50)
//    var chestArmor = Loot("+3 Leather Armor",LootType.ARMOR, 80.00)
//    var bluePotion = Loot("Blue Potion", LootType.POTION, 5.00)
//    tim.getLoot(redPotion)
//    tim.getLoot(chestArmor)
//    tim.getLoot(bluePotion)
//    println(tim)
//    println(tim.showInventory())
//
////    var nums: IntArray = intArrayOf(1,2,3,4,5,6,7,8,9,10)
////
////    var sum: Int = 0
////    for(num in nums){
////        sum += num
////    }
////    println(sum)
////
////    var myRange = 1..100
////    for(r in myRange){
////        if(r % 3 == 0 && r % 5 == 0)
////        println(r)
////        else continue
////    }
}
