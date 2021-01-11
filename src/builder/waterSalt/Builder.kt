package builder.waterSalt

interface Builder {
    fun addSolute(soluteAmount: Double)
    fun addSolvent(solveAmount: Double)
    fun abandonSolution(solutionAmount: Double)
    fun getResult() : Any
}
