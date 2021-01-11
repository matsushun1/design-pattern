package builder.waterSalt

class BuilderExec {
    fun execute() {
        val saltWaterBuilder = SaltWaterBuilder()
        val director = Director(saltWaterBuilder)
        director.construct()
        val swResult = saltWaterBuilder.getResult() as SaltWater
    }


}
