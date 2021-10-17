package composite.recursive

class Client {
    fun execute() {
        val parentCompany = Company("親会社")
        val subOldCompany = Company("第二階層兄子会社")
        val subYoungCompany = Company("第二階層弟子会社")
        val subGrandChildCompany = Company("第三階層孫会社")

        parentCompany.add(subOldCompany)
        parentCompany.add(subYoungCompany)

        subOldCompany.add(subGrandChildCompany)

        parentCompany.add(Department(name = "経営管理部", earnings = 10000000, cost = 200, numOfWorkers = 5, workingTime = 3600))

        subOldCompany.add(Department(name = "開発部", earnings = 30000000, cost = 1000, numOfWorkers = 20, workingTime = 4800))
        subOldCompany.add(Department(name = "インフラ部", earnings = 35000000, cost = 2000, numOfWorkers = 10, workingTime = 5000))

        subYoungCompany.add(Department(name = "営業部", earnings = 40000000, cost = 2000, numOfWorkers = 30, workingTime = 4800))
        subYoungCompany.add(Department(name = "人事総務部", earnings = 10000000, cost = 100, numOfWorkers = 10, workingTime = 3500))

        subGrandChildCompany.add(Department(name = "品質管理部", earnings = 100000, cost = 100, numOfWorkers = 10, workingTime = 3500))

//        println(parentCompany.getGrossProfit()) // ルートノードで集計
//        println(parentCompany.getProductivity())
        println(subGrandChildCompany.getProductivity()) // 末端ノードで集計
        println(subGrandChildCompany.getDescendants())
        println(subGrandChildCompany.getAllParents())
    }
}
