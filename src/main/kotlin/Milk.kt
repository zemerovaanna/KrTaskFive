class Milk:MilkProduct() {
    override var name = "Молоко"
    override var percent = 3.2
    override var weight:Double
        get() = 500.0
        set(value){}
    override var price:Double
        get() = 150.50
        set(value){}
    override var manufacturer:String
        get() = "Молочная ферма"
        set(value){}

    override fun composition(){
        when(percent)
        {
            in 0.0..0.9 -> println("обезжиренное")
            in 1.0..1.9 -> println("с низким содержанием жира")
            in 2.0..3.4 -> println("парное")
            in 3.5..5.9 -> println(" с высокой долей глобулина, производится не любыми породами коров")
            else -> println("предельный уровень, наблюдается в пищевых сливках")
        }
    }

}