fun main() {
    println("Welcome to the Plant Growing Simulator")
    println("Here you can grow your own plant and see how long you can keep it alive.")
    var flowerLife: Int = 10
    var flowerWater: Int = 0
    var flowerSun: Int = 0
    var flowerDays: Int = 1
    var water: String = ""
    var sunlight: Int = 0

    while (flowerLife > 0 || flowerDays == 10) {
        println("Day $flowerDays")
        if (flowerSun in 4..7 && flowerWater in 2..4) {
            println("The plant looks good.")
        }
        if (flowerWater < 2) {
            println("The soil looks dry.")
        }
        else if (flowerWater > 4) {
            println("The flower looks over watered.")
        }
        if (flowerSun < 4) {
            println("The flower looks wilted.")
        }
        else if (flowerSun > 7) {
            println("The flower looks burned.")
        }
        println("Will you water the plant today? Y/N")
        water = readLine()!!
        if (water == "Y") {
            println("You watered the plant.")
            flowerWater += 2
        }
        else {
            println("You didn't water the plant")
            flowerWater -= 1
        }
        println("How much sunlight will you give the plant today? (1-5")
        sunlight = readLine()!!.toInt()
        if (sunlight > 5) {
            sunlight = 5
        }
        flowerSun += sunlight

        if (flowerWater < 2) {
            flowerLife -= 1
        }
        else if (flowerWater > 4) {
            flowerLife -= 1
        }
        if (flowerSun < 4) {
            flowerLife -= 1
        }
        else if (flowerSun > 7) {
            flowerLife -= 1
        }
        flowerDays++
        flowerSun -= 2
    }


    println("Your plant survived $flowerDays days.")

}