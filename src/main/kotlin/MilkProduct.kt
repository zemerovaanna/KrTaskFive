abstract class MilkProduct:Food {
    abstract var name:String
    abstract var percent:Double
    override var weight:Double
        get() = 500.0
        set(value){}
    override var price:Double
        get() = 150.50
        set(value){}
    override var manufacturer:String
        get() = "Любятово Ирбитское"
        set(value){}
    abstract fun composition()
}