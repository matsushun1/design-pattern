package builder.waterSalt

class SaltWaterBuilder : Builder {

    private var saltWater = SaltWater(0.0, 0.0)

    override fun addSolute(soluteAmount: Double) {
        saltWater.salt += soluteAmount
    }

    override fun addSolvent(solveAmount: Double) {
        saltWater.water += solveAmount
    }

    override fun abandonSolution(solutionAmount: Double) {
        val saltDelta = solutionAmount * (saltWater.salt / (saltWater.salt + saltWater.water))
        val waterDelta = solutionAmount * (saltWater.water / (saltWater.salt + saltWater.water))
        saltWater.salt -= saltDelta
        saltWater.water -= waterDelta
    }

    override fun getResult(): Any = this.saltWater
}

